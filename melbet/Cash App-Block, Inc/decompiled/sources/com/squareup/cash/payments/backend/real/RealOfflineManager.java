package com.squareup.cash.payments.backend.real;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.core.os.BundleKt;
import androidx.room.RoomDatabase$performClear$1;
import androidx.room.util.DBUtil;
import app.cash.api.ApiResult;
import app.cash.sqldelight.coroutines.FlowQuery$mapToList$$inlined$map$1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.badging.db.BadgeQueries$VersionQuery;
import com.squareup.cash.boost.db.RewardQueries;
import com.squareup.cash.boost.db.RewardSlotQueries;
import com.squareup.cash.card.onboarding.CardModelView$getActiveHeat$lambda$1$$inlined$flatMapLatest$1;
import com.squareup.cash.card.onboarding.InteractiveCardView$flingTo$1;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.cash.CashRequestCancel;
import com.squareup.cash.cdf.cash.CashSendCancel;
import com.squareup.cash.cdf.offline.CommonNetworkError;
import com.squareup.cash.cdf.offline.OfflineTransactionCancel;
import com.squareup.cash.cdf.offline.OfflineTransactionRemoved;
import com.squareup.cash.cdf.offline.TransactionType;
import com.squareup.cash.checks.CaptureCheckFaceKt$$ExternalSyntheticLambda11;
import com.squareup.cash.db.SessionQueries;
import com.squareup.cash.db.db.CashAccountDatabaseImpl;
import com.squareup.cash.db2.InstrumentQueries;
import com.squareup.cash.db2.SyncDetailsQueries$$ExternalSyntheticLambda2;
import com.squareup.cash.db2.payment.OfflineQueries$$ExternalSyntheticLambda1;
import com.squareup.cash.db2.payment.PendingPayment;
import com.squareup.cash.db2.payment.PendingPaymentQueries$$ExternalSyntheticLambda0;
import com.squareup.cash.db2.payment.PendingPaymentQueries$paymentsToRetry$2;
import com.squareup.cash.db2.payment.PendingTransfer;
import com.squareup.cash.db2.payment.PendingTransferQueries$$ExternalSyntheticLambda2;
import com.squareup.cash.db2.payment.PendingTransferQueries$pendingTransfer$2;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.offers.db.OffersHomeQueries$ForIdQuery;
import com.squareup.cash.payments.backend.api.OfflineManager;
import com.squareup.cash.recipients.data.RealCustomerStore$getCustomersForIds$$inlined$map$1;
import com.squareup.cash.transfers.data.TransferType;
import com.squareup.cash.util.clock.AndroidClock;
import com.squareup.cash.util.network.impl.RealNetworkInfo;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.app.InitiatePaymentRequest;
import com.squareup.protos.franklin.common.Orientation;
import com.squareup.protos.franklin.common.RetryContext;
import com.squareup.util.coroutines.IoSetupTeardown;
import com.squareup.util.coroutines.StateFlowKt;
import com.squareup.util.coroutines.Teardown;
import com.squareup.util.workmanager.AndroidWorkManager;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.net.ConnectException;
import java.net.SocketTimeoutException;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;
import timber.log.Timber;

/* loaded from: classes.dex */
public final class RealOfflineManager implements OfflineManager, IoSetupTeardown {
    public static final List DEFAULT_RETRY_INTERVALS = CollectionsKt__CollectionsKt.listOf((Object[]) new Long[]{30000L, 60000L, 300000L, 900000L, 3600000L, 14400000L, 43200000L});
    public final Analytics analytics;
    public final AndroidClock clock;
    public final SessionQueries databaseQueries;
    public final CoroutineContext ioDispatcher;
    public final RealNetworkInfo networkInfo;
    public final InstrumentQueries offlineConfigQueries;
    public final RewardSlotQueries offlineQueries;
    public final Lazy paymentNavigator;
    public final InstrumentQueries paymentQueries;
    public List retryIntervals = DEFAULT_RETRY_INTERVALS;
    public final CoroutineScope scope;
    public final Flow signOut;
    public final Lazy transferManager;
    public final InstrumentQueries transferQueries;
    public final AndroidWorkManager workManager;

    /* loaded from: classes6.dex */
    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[Orientation.values().length];
            try {
                iArr[Orientation.BILL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Orientation.CASH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[OfflineManager.RemovalReason.values().length];
            try {
                iArr2[0] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                OfflineManager.RemovalReason removalReason = OfflineManager.RemovalReason.RetrySuccessful;
                iArr2[1] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                OfflineManager.RemovalReason removalReason2 = OfflineManager.RemovalReason.RetrySuccessful;
                iArr2[2] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                OfflineManager.RemovalReason removalReason3 = OfflineManager.RemovalReason.RetrySuccessful;
                iArr2[3] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                OfflineManager.RemovalReason removalReason4 = OfflineManager.RemovalReason.RetrySuccessful;
                iArr2[4] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[TransferType.values().length];
            try {
                iArr3[0] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                TransferType transferType = TransferType.ADD_CASH;
                iArr3[1] = 2;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public RealOfflineManager(AndroidClock androidClock, Lazy lazy, Lazy lazy2, AndroidWorkManager androidWorkManager, Analytics analytics, RealNetworkInfo realNetworkInfo, Flow flow, CashAccountDatabaseImpl cashAccountDatabaseImpl, CoroutineScope coroutineScope, CoroutineContext coroutineContext) {
        this.clock = androidClock;
        this.paymentNavigator = lazy;
        this.transferManager = lazy2;
        this.workManager = androidWorkManager;
        this.analytics = analytics;
        this.networkInfo = realNetworkInfo;
        this.signOut = flow;
        this.scope = coroutineScope;
        this.ioDispatcher = coroutineContext;
        this.offlineConfigQueries = cashAccountDatabaseImpl.offlineConfigQueries;
        this.paymentQueries = cashAccountDatabaseImpl.pendingPaymentQueries;
        this.transferQueries = cashAccountDatabaseImpl.pendingTransferQueries;
        this.offlineQueries = cashAccountDatabaseImpl.offlineQueries;
        this.databaseQueries = cashAccountDatabaseImpl.databaseQueries;
    }

    public static RetryContext.ErrorContext asErrorContext(ApiResult.Failure failure, long j) {
        if (failure instanceof ApiResult.Failure.HttpFailure) {
            ApiResult.Failure.HttpFailure httpFailure = (ApiResult.Failure.HttpFailure) failure;
            if (BundleKt.isRetryableCode(httpFailure)) {
                Long valueOf = Long.valueOf(j);
                Date date = httpFailure.responseHeaderDate;
                return new RetryContext.ErrorContext(valueOf, date != null ? Long.valueOf(date.getTime()) : null, String.valueOf(BundleKt.httpStatusCode(failure)), null, 8, null);
            }
        }
        return null;
    }

    public static String errorDescription(ApiResult.Failure failure) {
        if (failure == null || !(failure instanceof ApiResult.Failure.NetworkFailure)) {
            return null;
        }
        return ((ApiResult.Failure.NetworkFailure) failure).error.getMessage();
    }

    public static OfflineTransactionRemoved.Reason toAnalytics(OfflineManager.RemovalReason removalReason) {
        int i = removalReason == null ? -1 : WhenMappings.$EnumSwitchMapping$1[removalReason.ordinal()];
        if (i == 1) {
            return OfflineTransactionRemoved.Reason.RETRY_SUCCESSFUL;
        }
        if (i == 2) {
            return OfflineTransactionRemoved.Reason.CANCELLED;
        }
        if (i == 3) {
            return OfflineTransactionRemoved.Reason.SIGN_OUT;
        }
        if (i == 4) {
            return OfflineTransactionRemoved.Reason.NON_RETRIABLE_ERROR;
        }
        if (i != 5) {
            return null;
        }
        return OfflineTransactionRemoved.Reason.REMOTE_CLEAR_APP_DATA;
    }

    public static TransactionType toTransactionType(TransferType transferType) {
        int ordinal = transferType.ordinal();
        if (ordinal == 0) {
            return TransactionType.CASH_IN;
        }
        if (ordinal == 1) {
            return TransactionType.CASH_OUT;
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object cancelPendingPayment(String str, List list, ContinuationImpl continuationImpl) {
        RealOfflineManager$cancelPendingPayment$1 realOfflineManager$cancelPendingPayment$1;
        int i;
        Object obj;
        List list2;
        PendingPayment pendingPayment;
        Event cashRequestCancel;
        String str2 = str;
        if (continuationImpl instanceof RealOfflineManager$cancelPendingPayment$1) {
            realOfflineManager$cancelPendingPayment$1 = (RealOfflineManager$cancelPendingPayment$1) continuationImpl;
            int i2 = realOfflineManager$cancelPendingPayment$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realOfflineManager$cancelPendingPayment$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj2 = realOfflineManager$cancelPendingPayment$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realOfflineManager$cancelPendingPayment$1.label;
                InstrumentQueries instrumentQueries = this.paymentQueries;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj2);
                    Timber.Forest.d(Recorder$$ExternalSyntheticOutline2.m("Canceling pending payment: ", str2), new Object[0]);
                    FlowQuery$mapToList$$inlined$map$1 mapToOneOrNull = DBUtil.mapToOneOrNull(DBUtil.toFlow(instrumentQueries.pendingRequest(str2)), this.ioDispatcher);
                    realOfflineManager$cancelPendingPayment$1.L$0 = str2;
                    realOfflineManager$cancelPendingPayment$1.L$1 = list;
                    realOfflineManager$cancelPendingPayment$1.label = 1;
                    Object firstOrNull = FlowKt.firstOrNull(mapToOneOrNull, realOfflineManager$cancelPendingPayment$1);
                    if (firstOrNull == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    obj = firstOrNull;
                    list2 = list;
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    List list3 = realOfflineManager$cancelPendingPayment$1.L$1;
                    String str3 = realOfflineManager$cancelPendingPayment$1.L$0;
                    SafeTrace.throwOnFailure(obj2);
                    list2 = list3;
                    str2 = str3;
                    obj = obj2;
                }
                pendingPayment = (PendingPayment) obj;
                if (pendingPayment != null) {
                    Timber.Forest.d(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Pending payment ", str2, " not found"), new Object[0]);
                    return Boolean.FALSE;
                }
                TransactionType transactionType = TransactionType.FIAT_PAYMENT;
                OfflineTransactionCancel offlineTransactionCancel = new OfflineTransactionCancel(new Integer((int) pendingPayment.retry_count), str2);
                Analytics analytics = this.analytics;
                analytics.track(offlineTransactionCancel, null);
                InitiatePaymentRequest.CancelPaymentsData cancelPaymentsData = pendingPayment.request.cancel_payments_data;
                InitiatePaymentRequest.CancelPaymentsData cancelPaymentsData2 = cancelPaymentsData == null ? new InitiatePaymentRequest.CancelPaymentsData(null, null, null, 7, null) : cancelPaymentsData;
                InitiatePaymentRequest initiatePaymentRequest = pendingPayment.request;
                Boolean bool = cancelPaymentsData2.cancel_for_all;
                InitiatePaymentRequest copy$default = InitiatePaymentRequest.copy$default(initiatePaymentRequest, null, null, null, null, InitiatePaymentRequest.CancelPaymentsData.copy$default(cancelPaymentsData2, Boolean.valueOf((bool != null ? bool.booleanValue() : false) || list2.isEmpty()), CollectionsKt.plus((Iterable) list2, (Collection) cancelPaymentsData2.cancel_for_getters), null, 4, null), null, null, null, null, null, 8388095);
                Orientation orientation = pendingPayment.orientation;
                long j = pendingPayment.recipients;
                String str4 = pendingPayment.external_id;
                Money money = pendingPayment.amount;
                int i3 = WhenMappings.$EnumSwitchMapping$0[orientation.ordinal()];
                if (i3 == 1) {
                    Long l = money.amount;
                    cashRequestCancel = new CashRequestCancel(Boolean.TRUE, l != null ? Integer.valueOf((int) l.longValue()) : null, Integer.valueOf((int) j), str4);
                } else {
                    if (i3 != 2) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    Long l2 = money.amount;
                    cashRequestCancel = new CashSendCancel(Boolean.TRUE, l2 != null ? Integer.valueOf((int) l2.longValue()) : null, Integer.valueOf((int) j), str4);
                }
                analytics.track(cashRequestCancel, null);
                instrumentQueries.getClass();
                str2.getClass();
                instrumentQueries.driver.execute(10235209, "UPDATE pendingPayment\nSET retry_at = 0,\n    request = ?\nWHERE external_id = ?\nAND succeeded = 0", new CaptureCheckFaceKt$$ExternalSyntheticLambda11(28, instrumentQueries, copy$default, str2));
                instrumentQueries.notifyQueries(10235209, new OfflineQueries$$ExternalSyntheticLambda1(8));
                return Boolean.TRUE;
            }
        }
        realOfflineManager$cancelPendingPayment$1 = new RealOfflineManager$cancelPendingPayment$1(this, continuationImpl);
        Object obj22 = realOfflineManager$cancelPendingPayment$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realOfflineManager$cancelPendingPayment$1.label;
        InstrumentQueries instrumentQueries2 = this.paymentQueries;
        if (i != 0) {
        }
        pendingPayment = (PendingPayment) obj;
        if (pendingPayment != null) {
        }
    }

    public final CommonNetworkError commonNetworkError(ApiResult.Failure failure) {
        if (!this.networkInfo.isNetworkAvailable()) {
            return CommonNetworkError.NOT_CONNECTED_TO_INTERNET;
        }
        if (failure == null || !(failure instanceof ApiResult.Failure.NetworkFailure)) {
            return null;
        }
        Throwable th = ((ApiResult.Failure.NetworkFailure) failure).error;
        return th instanceof ConnectException ? CommonNetworkError.CONNECTION_LOST : th instanceof SocketTimeoutException ? CommonNetworkError.CONNECTION_TIMED_OUT : CommonNetworkError.OTHER;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object forceRetryAll(ContinuationImpl continuationImpl) {
        RealOfflineManager$forceRetryAll$1 realOfflineManager$forceRetryAll$1;
        int i;
        if (continuationImpl instanceof RealOfflineManager$forceRetryAll$1) {
            realOfflineManager$forceRetryAll$1 = (RealOfflineManager$forceRetryAll$1) continuationImpl;
            int i2 = realOfflineManager$forceRetryAll$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realOfflineManager$forceRetryAll$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realOfflineManager$forceRetryAll$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realOfflineManager$forceRetryAll$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    realOfflineManager$forceRetryAll$1.label = 1;
                    if (retryPayments(true, realOfflineManager$forceRetryAll$1) == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                JobKt.launch$default(this.scope, null, null, new InteractiveCardView$flingTo$1(this, Long.MAX_VALUE, true, (Continuation) null), 3);
                return Unit.INSTANCE;
            }
        }
        realOfflineManager$forceRetryAll$1 = new RealOfflineManager$forceRetryAll$1(this, continuationImpl);
        Object obj3 = realOfflineManager$forceRetryAll$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realOfflineManager$forceRetryAll$1.label;
        if (i != 0) {
        }
        JobKt.launch$default(this.scope, null, null, new InteractiveCardView$flingTo$1(this, Long.MAX_VALUE, true, (Continuation) null), 3);
        return Unit.INSTANCE;
    }

    public final long getDelay(long j) {
        return ((Number) this.retryIntervals.get(Math.min((int) j, r0.size() - 1))).longValue();
    }

    public final Object isDuplicatePayment(Money money, Orientation orientation, List list, ContinuationImpl continuationImpl) {
        InstrumentQueries instrumentQueries = this.paymentQueries;
        instrumentQueries.getClass();
        money.getClass();
        orientation.getClass();
        return FlowKt.first(new RealCustomerStore$getCustomersForIds$$inlined$map$1(DBUtil.mapToList(DBUtil.toFlow(new BadgeQueries$VersionQuery(instrumentQueries, money, orientation, new PendingPaymentQueries$$ExternalSyntheticLambda0(instrumentQueries, 1))), this.ioDispatcher), list, 1), continuationImpl);
    }

    public final void removePendingTransfer(String str, OfflineManager.RemovalReason removalReason, String str2) {
        String str3;
        str.getClass();
        Timber.Forest.d("Removing pending transfer: ".concat(str), new Object[0]);
        InstrumentQueries instrumentQueries = this.transferQueries;
        instrumentQueries.getClass();
        PendingTransferQueries$pendingTransfer$2 pendingTransferQueries$pendingTransfer$2 = PendingTransferQueries$pendingTransfer$2.INSTANCE;
        PendingTransfer pendingTransfer = (PendingTransfer) new RewardQueries.ForIdsQuery(instrumentQueries, str, new PendingTransferQueries$$ExternalSyntheticLambda2(instrumentQueries, 1)).executeAsOneOrNull();
        if (pendingTransfer != null) {
            int i = ((int) pendingTransfer.retry_count) + 1;
            TransferType transferType = pendingTransfer.f1125type;
            str3 = str;
            this.analytics.track(new OfflineTransactionRemoved(transferType != null ? toTransactionType(transferType) : null, str3, Integer.valueOf(i), toAnalytics(removalReason), str2), null);
        } else {
            str3 = str;
        }
        instrumentQueries.driver.execute(289000361, "UPDATE pendingTransfer\nSET succeeded = 1, ready_for_removal = 1\nWHERE external_id = ?", new SyncDetailsQueries$$ExternalSyntheticLambda2(str3, 16));
        instrumentQueries.notifyQueries(289000361, new OfflineQueries$$ExternalSyntheticLambda1(12));
    }

    public final Object retryPayments(boolean z, ContinuationImpl continuationImpl) {
        long millis = !z ? this.clock.millis() : Long.MAX_VALUE;
        InstrumentQueries instrumentQueries = this.paymentQueries;
        instrumentQueries.getClass();
        PendingPaymentQueries$paymentsToRetry$2 pendingPaymentQueries$paymentsToRetry$2 = PendingPaymentQueries$paymentsToRetry$2.INSTANCE;
        Object collectLatest = FlowKt.collectLatest(FlowKt.transformLatest(DBUtil.mapToList(FlowKt.take(DBUtil.toFlow(new OffersHomeQueries$ForIdQuery(instrumentQueries, millis, new PendingPaymentQueries$$ExternalSyntheticLambda0(instrumentQueries, 0), 3)), 1), this.ioDispatcher), new CardModelView$getActiveHeat$lambda$1$$inlined$flatMapLatest$1()), new RoomDatabase$performClear$1(this, z, (Continuation) null, 12), continuationImpl);
        return collectLatest == CoroutineSingletons.COROUTINE_SUSPENDED ? collectLatest : Unit.INSTANCE;
    }

    @Override // com.squareup.util.coroutines.UnitSetupTeardown
    public final Teardown setup(CoroutineScope coroutineScope) {
        coroutineScope.getClass();
        Continuation continuation = null;
        JobKt.launch$default(coroutineScope, null, null, new RealOfflineManager$setup$1$1(this, continuation, 0), 3);
        JobKt.launch$default(coroutineScope, null, null, new RealOfflineManager$setup$1$1(this, continuation, 1), 3);
        JobKt.launch$default(coroutineScope, null, null, new RealOfflineManager$setup$1$1(this, continuation, 2), 3);
        JobKt.launch$default(coroutineScope, null, null, new RealOfflineManager$setup$1$1(this, continuation, 3), 3);
        JobKt.launch$default(coroutineScope, null, null, new RealOfflineManager$setup$1$1(this, continuation, 5), 3);
        return StateFlowKt.noOpTeardown;
    }
}
