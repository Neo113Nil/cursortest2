package com.squareup.cash.data.activity;

import android.net.NetworkInfo;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.core.os.BundleKt;
import androidx.core.text.TextUtilsCompat;
import app.cash.api.ApiResult;
import app.cash.badging.backend.FinishSetupTileBadgeCounter;
import app.cash.payment.asset.PaymentData;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.attribution.ProductionAttributionEventEmitter;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.giftcard.GiftCardSendInitiate;
import com.squareup.cash.cdf.giftcard.SourceLocation;
import com.squareup.cash.cdf.offline.OfflineTransactionRetry;
import com.squareup.cash.cdf.offline.TransactionType;
import com.squareup.cash.data.db.AppConfigManager;
import com.squareup.cash.data.db.RealAppConfigManager;
import com.squareup.cash.data.profile.RealReferralManager;
import com.squareup.cash.db2.OfflineConfig;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.moneyformatter.real.LocalizedMoneyFormatter;
import com.squareup.cash.mosaic.personalization.api.v2.PersonalizationInput;
import com.squareup.cash.mri.android.MRIUseCase;
import com.squareup.cash.mri.android.RealMRIFactory;
import com.squareup.cash.payments.backend.api.OfflineManager;
import com.squareup.cash.payments.backend.api.OfflineManagerKt;
import com.squareup.cash.payments.backend.api.PaymentAction;
import com.squareup.cash.payments.backend.api.PaymentManager;
import com.squareup.cash.payments.backend.real.RealOfflineManager;
import com.squareup.cash.payments.backend.real.RealOfflineManager$enqueuePayment$3;
import com.squareup.cash.payments.backend.real.RealOfflineManager$removePendingPayment$2;
import com.squareup.cash.payments.backend.real.RealPaymentManager;
import com.squareup.cash.payments.common.PaymentRecipient;
import com.squareup.cash.payments.screens.InstrumentSelectionData;
import com.squareup.cash.payments.screens.PaymentInitiatorData;
import com.squareup.cash.payments.screens.PaymentScheduleSelection;
import com.squareup.cash.payments.screens.PaymentScheduleSelectionKt;
import com.squareup.cash.payments.screens.ScenarioInitiator;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.util.StatusResults;
import com.squareup.cash.util.clock.AndroidClock;
import com.squareup.protos.cash.fiatly.api.v1.FiatlyService;
import com.squareup.protos.cash.fiatly.api.v1.InitiatePersonalizedPaymentRequest;
import com.squareup.protos.cash.fiatly.api.v1.InitiatePersonalizedPaymentResponse;
import com.squareup.protos.cash.pools.PoolsService;
import com.squareup.protos.cash.pools.SendPoolContributionRequest;
import com.squareup.protos.cash.pools.SendPoolContributionResponse;
import com.squareup.protos.cash.security.mri.api.v1.SignedSerializedMRIContext;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.api.ClientScenario;
import com.squareup.protos.franklin.api.InstrumentSelection;
import com.squareup.protos.franklin.app.AppCreationActivity;
import com.squareup.protos.franklin.app.AppService;
import com.squareup.protos.franklin.app.CancelPaymentRequest;
import com.squareup.protos.franklin.app.CancelPaymentResponse;
import com.squareup.protos.franklin.app.InitiatePaymentRequest;
import com.squareup.protos.franklin.app.InitiatePaymentResponse;
import com.squareup.protos.franklin.common.Orientation;
import com.squareup.protos.franklin.common.RequestContext;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.protos.franklin.common.RetryContext;
import com.squareup.protos.franklin.common.ScenarioInitiatorType;
import com.squareup.protos.franklin.common.SignalsContext;
import com.squareup.protos.franklin.common.StatusResult;
import com.squareup.protos.franklin.common.StatusResultButton;
import com.squareup.protos.franklin.investing.resources.InvestPaymentData;
import com.squareup.protos.giftly.GiftCardPaymentData;
import com.squareup.util.android.AndroidDeviceInfo;
import com.squareup.util.cash.ProtoDefaults;
import com.squareup.util.coroutines.StateFlowKt;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.FlowKt;
import okio.AsyncTimeout;
import okio.Path$$ExternalSyntheticBUOutline0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;
import timber.log.Timber;

/* loaded from: classes6.dex */
public final class RealPaymentNavigator implements PaymentNavigator {
    public final Analytics analytics;
    public final AppConfigManager appConfig;
    public final ProductionAttributionEventEmitter attributionEventEmitter;
    public final AndroidClock clock;
    public final Lazy deviceInfo;
    public final FiatlyService fiatlyService;
    public final AppService franklinAppService;
    public final LocalizedMoneyFormatter.Factory moneyFormatterFactory;
    public final RealMRIFactory mriFactory;
    public final OfflineManager offlineManager;
    public final PaymentManager paymentManager;
    public final PoolsService poolsService;
    public final RealReferralManager referralManager;
    public final AndroidStringManager stringManager;

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
            int[] iArr2 = new int[CurrencyCode.values().length];
            try {
                iArr2[CurrencyCode.BTC.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[CancelPaymentResponse.Status.values().length];
            try {
                iArr3[1] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                AsyncTimeout.Companion companion = CancelPaymentResponse.Status.Companion;
                iArr3[2] = 2;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public RealPaymentNavigator(AndroidClock androidClock, FiatlyService fiatlyService, AppService appService, PoolsService poolsService, OfflineManager offlineManager, RealReferralManager realReferralManager, AppConfigManager appConfigManager, PaymentManager paymentManager, AndroidStringManager androidStringManager, Lazy lazy, ProductionAttributionEventEmitter productionAttributionEventEmitter, LocalizedMoneyFormatter.Factory factory, Analytics analytics, RealMRIFactory realMRIFactory) {
        this.clock = androidClock;
        this.fiatlyService = fiatlyService;
        this.franklinAppService = appService;
        this.poolsService = poolsService;
        this.offlineManager = offlineManager;
        this.referralManager = realReferralManager;
        this.appConfig = appConfigManager;
        this.paymentManager = paymentManager;
        this.stringManager = androidStringManager;
        this.deviceInfo = lazy;
        this.attributionEventEmitter = productionAttributionEventEmitter;
        this.moneyFormatterFactory = factory;
        this.analytics = analytics;
        this.mriFactory = realMRIFactory;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object cancelPayment(ClientScenario clientScenario, String str, String str2, Money money, List list, ContinuationImpl continuationImpl) {
        RealPaymentNavigator$cancelPayment$1 realPaymentNavigator$cancelPayment$1;
        int i;
        Object obj;
        ClientScenario clientScenario2;
        Money money2;
        String str3;
        String str4;
        String str5;
        ApiResult apiResult;
        String str6 = str2;
        if (continuationImpl instanceof RealPaymentNavigator$cancelPayment$1) {
            realPaymentNavigator$cancelPayment$1 = (RealPaymentNavigator$cancelPayment$1) continuationImpl;
            int i2 = realPaymentNavigator$cancelPayment$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realPaymentNavigator$cancelPayment$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj2 = realPaymentNavigator$cancelPayment$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realPaymentNavigator$cancelPayment$1.label;
                AndroidStringManager androidStringManager = this.stringManager;
                PaymentManager paymentManager = this.paymentManager;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj2);
                    realPaymentNavigator$cancelPayment$1.L$0 = clientScenario;
                    realPaymentNavigator$cancelPayment$1.L$1 = str;
                    realPaymentNavigator$cancelPayment$1.L$2 = str6;
                    realPaymentNavigator$cancelPayment$1.L$3 = money;
                    realPaymentNavigator$cancelPayment$1.label = 1;
                    Object cancelPendingPayment = ((RealOfflineManager) this.offlineManager).cancelPendingPayment(str6, list, realPaymentNavigator$cancelPayment$1);
                    if (cancelPendingPayment != coroutineSingletons) {
                        obj = cancelPendingPayment;
                        clientScenario2 = clientScenario;
                        money2 = money;
                        str3 = str;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str4 = realPaymentNavigator$cancelPayment$1.L$2;
                    str5 = realPaymentNavigator$cancelPayment$1.L$1;
                    SafeTrace.throwOnFailure(obj2);
                    apiResult = (ApiResult) obj2;
                    if (!(apiResult instanceof ApiResult.Success)) {
                        CancelPaymentResponse.Status status = ((CancelPaymentResponse) ((ApiResult.Success) apiResult).response).status;
                        if (status == null) {
                            status = ProtoDefaults.CANCEL_PAYMENT_STATUS;
                        }
                        int ordinal = status.ordinal();
                        if (ordinal == 1) {
                            Timber.Forest.d(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Successfully canceled payment (", str4, ")"), new Object[0]);
                        } else {
                            if (ordinal != 2) {
                                OptionalProvider$$ExternalSyntheticLambda0.m((Object) status, "Unknown status: ");
                                return null;
                            }
                            Timber.Forest.d(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Concurrent modification when canceling payment (", str4, ")"), new Object[0]);
                            ((RealPaymentManager) paymentManager).error(str5, androidStringManager.get(R.string.history_cancel_error_message));
                        }
                    } else {
                        if (!(apiResult instanceof ApiResult.Failure)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        Timber.Forest.e(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Failed to cancel payment (", str4, ")"), new Object[0]);
                        ((RealPaymentManager) paymentManager).error(str5, TextUtilsCompat.errorMessaging(androidStringManager, (ApiResult.Failure) apiResult, new Integer(R.string.history_cancel_error_message)).message);
                    }
                    return Unit.INSTANCE;
                }
                Money money3 = realPaymentNavigator$cancelPayment$1.L$3;
                String str7 = realPaymentNavigator$cancelPayment$1.L$2;
                str3 = realPaymentNavigator$cancelPayment$1.L$1;
                clientScenario2 = realPaymentNavigator$cancelPayment$1.L$0;
                SafeTrace.throwOnFailure(obj2);
                obj = obj2;
                money2 = money3;
                str6 = str7;
                if (!((Boolean) obj).booleanValue()) {
                    ((RealPaymentManager) paymentManager).error(str3, androidStringManager.get(R.string.history_cancel_pending_message));
                    return Unit.INSTANCE;
                }
                CancelPaymentRequest cancelPaymentRequest = new CancelPaymentRequest(new RequestContext(null, CollectionsKt__CollectionsJVMKt.listOf(str6), null, null, null, null, null, null, 8175), str6, 4);
                CurrencyCode currencyCode = money2.currency_code;
                String str8 = (currencyCode == null ? -1 : WhenMappings.$EnumSwitchMapping$1[currencyCode.ordinal()]) == 1 ? "CRYPTO" : null;
                realPaymentNavigator$cancelPayment$1.L$0 = null;
                realPaymentNavigator$cancelPayment$1.L$1 = str3;
                realPaymentNavigator$cancelPayment$1.L$2 = str6;
                realPaymentNavigator$cancelPayment$1.L$3 = null;
                realPaymentNavigator$cancelPayment$1.label = 2;
                obj2 = this.franklinAppService.cancelPayment(clientScenario2, str3, str8, cancelPaymentRequest, realPaymentNavigator$cancelPayment$1);
                if (obj2 != coroutineSingletons) {
                    str4 = str6;
                    str5 = str3;
                    apiResult = (ApiResult) obj2;
                    if (!(apiResult instanceof ApiResult.Success)) {
                    }
                    return Unit.INSTANCE;
                }
                return coroutineSingletons;
            }
        }
        realPaymentNavigator$cancelPayment$1 = new RealPaymentNavigator$cancelPayment$1(this, continuationImpl);
        Object obj22 = realPaymentNavigator$cancelPayment$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realPaymentNavigator$cancelPayment$1.label;
        AndroidStringManager androidStringManager2 = this.stringManager;
        PaymentManager paymentManager2 = this.paymentManager;
        if (i != 0) {
        }
        if (!((Boolean) obj).booleanValue()) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object initiatePaymentFailure(ClientScenario clientScenario, ApiResult.Failure failure, InitiatePaymentRequest initiatePaymentRequest, Long l, boolean z, ContinuationImpl continuationImpl) {
        RealPaymentNavigator$initiatePaymentFailure$1 realPaymentNavigator$initiatePaymentFailure$1;
        int i;
        ApiResult.Failure failure2;
        InitiatePaymentRequest initiatePaymentRequest2;
        ClientScenario clientScenario2;
        int i2;
        boolean z2;
        String typeName;
        String str;
        int i3;
        InitiatePaymentRequest.PaymentData paymentData;
        InvestPaymentData investPaymentData;
        StatusResult statusResult;
        InitiatePaymentRequest initiatePaymentRequest3;
        ApiResult.Failure failure3;
        GiftCardPaymentData giftCardPaymentData;
        StatusResult statusResult2;
        StatusResult statusResult3;
        boolean z3;
        int i4;
        int i5;
        InitiatePaymentRequest initiatePaymentRequest4;
        ApiResult.Failure failure4;
        boolean z4;
        int i6;
        int i7;
        InitiatePaymentRequest initiatePaymentRequest5;
        ApiResult.Failure failure5;
        Long l2 = l;
        if (continuationImpl instanceof RealPaymentNavigator$initiatePaymentFailure$1) {
            realPaymentNavigator$initiatePaymentFailure$1 = (RealPaymentNavigator$initiatePaymentFailure$1) continuationImpl;
            int i8 = realPaymentNavigator$initiatePaymentFailure$1.label;
            if ((i8 & PKIFailureInfo.systemUnavail) != 0) {
                realPaymentNavigator$initiatePaymentFailure$1.label = i8 - PKIFailureInfo.systemUnavail;
                Object obj = realPaymentNavigator$initiatePaymentFailure$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realPaymentNavigator$initiatePaymentFailure$1.label;
                OfflineManager offlineManager = this.offlineManager;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    int i9 = l2 == null ? 1 : 0;
                    FinishSetupTileBadgeCounter offlineConfig = ((RealAppConfigManager) this.appConfig).offlineConfig();
                    realPaymentNavigator$initiatePaymentFailure$1.L$0 = clientScenario;
                    failure2 = failure;
                    realPaymentNavigator$initiatePaymentFailure$1.L$1 = failure2;
                    initiatePaymentRequest2 = initiatePaymentRequest;
                    realPaymentNavigator$initiatePaymentFailure$1.L$2 = initiatePaymentRequest2;
                    realPaymentNavigator$initiatePaymentFailure$1.L$3 = l2;
                    realPaymentNavigator$initiatePaymentFailure$1.Z$0 = z;
                    realPaymentNavigator$initiatePaymentFailure$1.I$0 = i9;
                    realPaymentNavigator$initiatePaymentFailure$1.label = 1;
                    Object first = FlowKt.first(offlineConfig, realPaymentNavigator$initiatePaymentFailure$1);
                    if (first != coroutineSingletons) {
                        clientScenario2 = clientScenario;
                        i2 = i9;
                        obj = first;
                        z2 = z;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i == 2) {
                        i6 = realPaymentNavigator$initiatePaymentFailure$1.I$1;
                        i7 = realPaymentNavigator$initiatePaymentFailure$1.I$0;
                        z4 = realPaymentNavigator$initiatePaymentFailure$1.Z$0;
                        initiatePaymentRequest5 = realPaymentNavigator$initiatePaymentFailure$1.L$2;
                        failure3 = realPaymentNavigator$initiatePaymentFailure$1.L$1;
                        SafeTrace.throwOnFailure(obj);
                        i3 = i6;
                        i2 = i7;
                        z2 = z4;
                        initiatePaymentRequest3 = initiatePaymentRequest5;
                        statusResult = null;
                        if (statusResult == null) {
                        }
                        String str2 = initiatePaymentRequest3.external_id;
                        str2.getClass();
                        return new InitiatePaymentResult(str2, false, new ResponseContext(null, statusResult, null, null, null, null, null, null, 4194301));
                    }
                    if (i != 3) {
                        if (i != 4) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        initiatePaymentRequest3 = realPaymentNavigator$initiatePaymentFailure$1.L$2;
                        failure5 = realPaymentNavigator$initiatePaymentFailure$1.L$1;
                        SafeTrace.throwOnFailure(obj);
                        failure3 = failure5;
                        StatusResult.Icon icon = StatusResult.Icon.FAILURE;
                        Integer num = new Integer(R.string.payment_failure_text);
                        AndroidStringManager androidStringManager = this.stringManager;
                        statusResult = new StatusResult(icon, TextUtilsCompat.errorMessaging(androidStringManager, failure3, num).message, new StatusResultButton(StatusResultButton.ButtonAction.PAY_SCREEN, androidStringManager.get(R.string.payment_failure_button_text), EnumC0170g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE));
                        String str22 = initiatePaymentRequest3.external_id;
                        str22.getClass();
                        return new InitiatePaymentResult(str22, false, new ResponseContext(null, statusResult, null, null, null, null, null, null, 4194301));
                    }
                    i4 = realPaymentNavigator$initiatePaymentFailure$1.I$1;
                    i5 = realPaymentNavigator$initiatePaymentFailure$1.I$0;
                    z3 = realPaymentNavigator$initiatePaymentFailure$1.Z$0;
                    statusResult3 = realPaymentNavigator$initiatePaymentFailure$1.L$5;
                    initiatePaymentRequest4 = realPaymentNavigator$initiatePaymentFailure$1.L$2;
                    failure4 = realPaymentNavigator$initiatePaymentFailure$1.L$1;
                    SafeTrace.throwOnFailure(obj);
                    statusResult = StatusResults.replaceTemplateArgs(statusResult3, initiatePaymentRequest4.amount, this.moneyFormatterFactory);
                    i3 = i4;
                    i2 = i5;
                    z2 = z3;
                    initiatePaymentRequest3 = initiatePaymentRequest4;
                    failure3 = failure4;
                    if (statusResult == null) {
                        if (i2 != 0 && !BundleKt.isRetryable(failure3)) {
                            String str3 = initiatePaymentRequest3.external_id;
                            str3.getClass();
                            OfflineManager.RemovalReason removalReason = OfflineManager.RemovalReason.NonRetriableError;
                            String reasonDesc = OfflineManagerKt.reasonDesc(failure3, i3 != 0);
                            realPaymentNavigator$initiatePaymentFailure$1.L$0 = null;
                            realPaymentNavigator$initiatePaymentFailure$1.L$1 = failure3;
                            realPaymentNavigator$initiatePaymentFailure$1.L$2 = initiatePaymentRequest3;
                            realPaymentNavigator$initiatePaymentFailure$1.L$3 = null;
                            realPaymentNavigator$initiatePaymentFailure$1.L$5 = null;
                            realPaymentNavigator$initiatePaymentFailure$1.Z$0 = z2;
                            realPaymentNavigator$initiatePaymentFailure$1.I$0 = i2;
                            realPaymentNavigator$initiatePaymentFailure$1.I$1 = i3;
                            realPaymentNavigator$initiatePaymentFailure$1.label = 4;
                            RealOfflineManager realOfflineManager = (RealOfflineManager) offlineManager;
                            Object withContext = JobKt.withContext(realOfflineManager.ioDispatcher, new RealOfflineManager$removePendingPayment$2(str3, removalReason, realOfflineManager, reasonDesc, null), realPaymentNavigator$initiatePaymentFailure$1);
                            if (withContext != coroutineSingletons) {
                                withContext = Unit.INSTANCE;
                            }
                            if (withContext != coroutineSingletons) {
                                failure5 = failure3;
                                failure3 = failure5;
                            }
                            return coroutineSingletons;
                        }
                        StatusResult.Icon icon2 = StatusResult.Icon.FAILURE;
                        Integer num2 = new Integer(R.string.payment_failure_text);
                        AndroidStringManager androidStringManager2 = this.stringManager;
                        statusResult = new StatusResult(icon2, TextUtilsCompat.errorMessaging(androidStringManager2, failure3, num2).message, new StatusResultButton(StatusResultButton.ButtonAction.PAY_SCREEN, androidStringManager2.get(R.string.payment_failure_button_text), EnumC0170g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE));
                    }
                    String str222 = initiatePaymentRequest3.external_id;
                    str222.getClass();
                    return new InitiatePaymentResult(str222, false, new ResponseContext(null, statusResult, null, null, null, null, null, null, 4194301));
                }
                int i10 = realPaymentNavigator$initiatePaymentFailure$1.I$0;
                z2 = realPaymentNavigator$initiatePaymentFailure$1.Z$0;
                Long l3 = realPaymentNavigator$initiatePaymentFailure$1.L$3;
                initiatePaymentRequest2 = realPaymentNavigator$initiatePaymentFailure$1.L$2;
                ApiResult.Failure failure6 = realPaymentNavigator$initiatePaymentFailure$1.L$1;
                ClientScenario clientScenario3 = realPaymentNavigator$initiatePaymentFailure$1.L$0;
                SafeTrace.throwOnFailure(obj);
                clientScenario2 = clientScenario3;
                i2 = i10;
                l2 = l3;
                failure2 = failure6;
                OfflineConfig offlineConfig2 = (OfflineConfig) obj;
                NetworkInfo activeNetworkInfo = ((AndroidDeviceInfo) this.deviceInfo.getValue()).connectivityManager.connectivityManager.getActiveNetworkInfo();
                typeName = activeNetworkInfo == null ? activeNetworkInfo.getTypeName() : null;
                if (typeName == null) {
                    Locale locale = Locale.US;
                    str = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(locale, typeName, locale);
                } else {
                    str = null;
                }
                i3 = str == null ? 1 : 0;
                paymentData = initiatePaymentRequest2.payment_data;
                if (paymentData != null) {
                    InitiatePaymentRequest.PaymentData.InvestPaymentData investPaymentData2 = paymentData instanceof InitiatePaymentRequest.PaymentData.InvestPaymentData ? (InitiatePaymentRequest.PaymentData.InvestPaymentData) paymentData : null;
                    if (investPaymentData2 != null) {
                        investPaymentData = investPaymentData2.getValue();
                        if (investPaymentData == null) {
                            InitiatePaymentRequest.PaymentData paymentData2 = initiatePaymentRequest2.payment_data;
                            if (paymentData2 != null) {
                                InitiatePaymentRequest.PaymentData.GiftCardPaymentData giftCardPaymentData2 = paymentData2 instanceof InitiatePaymentRequest.PaymentData.GiftCardPaymentData ? (InitiatePaymentRequest.PaymentData.GiftCardPaymentData) paymentData2 : null;
                                if (giftCardPaymentData2 != null) {
                                    giftCardPaymentData = giftCardPaymentData2.getValue();
                                    if (giftCardPaymentData == null && initiatePaymentRequest2.schedule == null && BundleKt.isRetryable(failure2) && z2 && (offlineConfig2.enabled || i2 != 0)) {
                                        if (i2 == 0) {
                                            realPaymentNavigator$initiatePaymentFailure$1.L$0 = null;
                                            realPaymentNavigator$initiatePaymentFailure$1.L$1 = failure2;
                                            realPaymentNavigator$initiatePaymentFailure$1.L$2 = initiatePaymentRequest2;
                                            realPaymentNavigator$initiatePaymentFailure$1.L$3 = null;
                                            realPaymentNavigator$initiatePaymentFailure$1.Z$0 = z2;
                                            realPaymentNavigator$initiatePaymentFailure$1.I$0 = i2;
                                            realPaymentNavigator$initiatePaymentFailure$1.I$1 = i3;
                                            realPaymentNavigator$initiatePaymentFailure$1.label = 2;
                                            RealOfflineManager realOfflineManager2 = (RealOfflineManager) offlineManager;
                                            ApiResult.Failure failure7 = failure2;
                                            InitiatePaymentRequest initiatePaymentRequest6 = initiatePaymentRequest2;
                                            failure3 = failure7;
                                            Object withContext2 = JobKt.withContext(realOfflineManager2.ioDispatcher, new RealOfflineManager$enqueuePayment$3(null, realOfflineManager2, initiatePaymentRequest6, failure7, clientScenario2, null), realPaymentNavigator$initiatePaymentFailure$1);
                                            if (withContext2 != coroutineSingletons) {
                                                withContext2 = Unit.INSTANCE;
                                            }
                                            if (withContext2 != coroutineSingletons) {
                                                withContext2 = Unit.INSTANCE;
                                            }
                                            if (withContext2 != coroutineSingletons) {
                                                z4 = z2;
                                                i6 = i3;
                                                i7 = i2;
                                                initiatePaymentRequest5 = initiatePaymentRequest6;
                                                i3 = i6;
                                                i2 = i7;
                                                z2 = z4;
                                                initiatePaymentRequest3 = initiatePaymentRequest5;
                                                statusResult = null;
                                                if (statusResult == null) {
                                                }
                                                String str2222 = initiatePaymentRequest3.external_id;
                                                str2222.getClass();
                                                return new InitiatePaymentResult(str2222, false, new ResponseContext(null, statusResult, null, null, null, null, null, null, 4194301));
                                            }
                                        } else {
                                            Orientation orientation = initiatePaymentRequest2.orientation;
                                            orientation.getClass();
                                            int i11 = WhenMappings.$EnumSwitchMapping$0[orientation.ordinal()];
                                            if (i11 == 1) {
                                                statusResult2 = i3 != 0 ? offlineConfig2.attempted_bill_status_result : offlineConfig2.offline_bill_status_result;
                                            } else {
                                                if (i11 != 2) {
                                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                                    return null;
                                                }
                                                statusResult2 = i3 != 0 ? offlineConfig2.attempted_payment_status_result : offlineConfig2.offline_payment_status_result;
                                            }
                                            statusResult3 = statusResult2;
                                            if (statusResult3 != null) {
                                                realPaymentNavigator$initiatePaymentFailure$1.L$0 = null;
                                                realPaymentNavigator$initiatePaymentFailure$1.L$1 = failure2;
                                                realPaymentNavigator$initiatePaymentFailure$1.L$2 = initiatePaymentRequest2;
                                                realPaymentNavigator$initiatePaymentFailure$1.L$3 = null;
                                                realPaymentNavigator$initiatePaymentFailure$1.L$5 = statusResult3;
                                                realPaymentNavigator$initiatePaymentFailure$1.Z$0 = z2;
                                                realPaymentNavigator$initiatePaymentFailure$1.I$0 = i2;
                                                realPaymentNavigator$initiatePaymentFailure$1.I$1 = i3;
                                                realPaymentNavigator$initiatePaymentFailure$1.label = 3;
                                                RealOfflineManager realOfflineManager3 = (RealOfflineManager) offlineManager;
                                                ApiResult.Failure failure8 = failure2;
                                                InitiatePaymentRequest initiatePaymentRequest7 = initiatePaymentRequest2;
                                                Object withContext3 = JobKt.withContext(realOfflineManager3.ioDispatcher, new RealOfflineManager$enqueuePayment$3(l2, realOfflineManager3, initiatePaymentRequest7, failure8, clientScenario2, null), realPaymentNavigator$initiatePaymentFailure$1);
                                                if (withContext3 != coroutineSingletons) {
                                                    withContext3 = Unit.INSTANCE;
                                                }
                                                if (withContext3 != coroutineSingletons) {
                                                    withContext3 = Unit.INSTANCE;
                                                }
                                                if (withContext3 != coroutineSingletons) {
                                                    z3 = z2;
                                                    i4 = i3;
                                                    i5 = i2;
                                                    initiatePaymentRequest4 = initiatePaymentRequest7;
                                                    failure4 = failure8;
                                                    statusResult = StatusResults.replaceTemplateArgs(statusResult3, initiatePaymentRequest4.amount, this.moneyFormatterFactory);
                                                    i3 = i4;
                                                    i2 = i5;
                                                    z2 = z3;
                                                    initiatePaymentRequest3 = initiatePaymentRequest4;
                                                    failure3 = failure4;
                                                    if (statusResult == null) {
                                                    }
                                                    String str22222 = initiatePaymentRequest3.external_id;
                                                    str22222.getClass();
                                                    return new InitiatePaymentResult(str22222, false, new ResponseContext(null, statusResult, null, null, null, null, null, null, 4194301));
                                                }
                                            }
                                        }
                                        return coroutineSingletons;
                                    }
                                }
                            }
                            giftCardPaymentData = null;
                            if (giftCardPaymentData == null) {
                                if (i2 == 0) {
                                }
                                return coroutineSingletons;
                            }
                        }
                        statusResult = null;
                        initiatePaymentRequest3 = initiatePaymentRequest2;
                        failure3 = failure2;
                        if (statusResult == null) {
                        }
                        String str222222 = initiatePaymentRequest3.external_id;
                        str222222.getClass();
                        return new InitiatePaymentResult(str222222, false, new ResponseContext(null, statusResult, null, null, null, null, null, null, 4194301));
                    }
                }
                investPaymentData = null;
                if (investPaymentData == null) {
                }
                statusResult = null;
                initiatePaymentRequest3 = initiatePaymentRequest2;
                failure3 = failure2;
                if (statusResult == null) {
                }
                String str2222222 = initiatePaymentRequest3.external_id;
                str2222222.getClass();
                return new InitiatePaymentResult(str2222222, false, new ResponseContext(null, statusResult, null, null, null, null, null, null, 4194301));
            }
        }
        realPaymentNavigator$initiatePaymentFailure$1 = new RealPaymentNavigator$initiatePaymentFailure$1(this, continuationImpl);
        Object obj2 = realPaymentNavigator$initiatePaymentFailure$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realPaymentNavigator$initiatePaymentFailure$1.label;
        OfflineManager offlineManager2 = this.offlineManager;
        if (i != 0) {
        }
        OfflineConfig offlineConfig22 = (OfflineConfig) obj2;
        NetworkInfo activeNetworkInfo2 = ((AndroidDeviceInfo) this.deviceInfo.getValue()).connectivityManager.connectivityManager.getActiveNetworkInfo();
        if (activeNetworkInfo2 == null) {
        }
        if (typeName == null) {
        }
        if (str == null) {
        }
        paymentData = initiatePaymentRequest2.payment_data;
        if (paymentData != null) {
        }
        investPaymentData = null;
        if (investPaymentData == null) {
        }
        statusResult = null;
        initiatePaymentRequest3 = initiatePaymentRequest2;
        failure3 = failure2;
        if (statusResult == null) {
        }
        String str22222222 = initiatePaymentRequest3.external_id;
        str22222222.getClass();
        return new InitiatePaymentResult(str22222222, false, new ResponseContext(null, statusResult, null, null, null, null, null, null, 4194301));
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object initiatePaymentSuccess(InitiatePaymentResponse.Status status, ResponseContext responseContext, String str, List list, ContinuationImpl continuationImpl) {
        RealPaymentNavigator$initiatePaymentSuccess$1 realPaymentNavigator$initiatePaymentSuccess$1;
        Object obj;
        int i;
        ResponseContext responseContext2;
        String str2;
        List list2;
        String str3;
        if (continuationImpl instanceof RealPaymentNavigator$initiatePaymentSuccess$1) {
            realPaymentNavigator$initiatePaymentSuccess$1 = (RealPaymentNavigator$initiatePaymentSuccess$1) continuationImpl;
            int i2 = realPaymentNavigator$initiatePaymentSuccess$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realPaymentNavigator$initiatePaymentSuccess$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj2 = realPaymentNavigator$initiatePaymentSuccess$1.result;
                obj = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realPaymentNavigator$initiatePaymentSuccess$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj2);
                    if (status != InitiatePaymentResponse.Status.SUCCESS) {
                        Path$$ExternalSyntheticBUOutline0.m$3(status, "Unknown status: ");
                        return null;
                    }
                    OfflineManager.RemovalReason removalReason = OfflineManager.RemovalReason.RetrySuccessful;
                    responseContext2 = responseContext;
                    realPaymentNavigator$initiatePaymentSuccess$1.L$1 = responseContext2;
                    realPaymentNavigator$initiatePaymentSuccess$1.L$2 = str;
                    realPaymentNavigator$initiatePaymentSuccess$1.L$3 = list;
                    realPaymentNavigator$initiatePaymentSuccess$1.label = 1;
                    RealOfflineManager realOfflineManager = (RealOfflineManager) this.offlineManager;
                    Object withContext = JobKt.withContext(realOfflineManager.ioDispatcher, new RealOfflineManager$removePendingPayment$2(str, removalReason, realOfflineManager, null, null), realPaymentNavigator$initiatePaymentSuccess$1);
                    if (withContext != obj) {
                        withContext = Unit.INSTANCE;
                    }
                    if (withContext != obj) {
                        str2 = str;
                        list2 = list;
                    }
                    return obj;
                }
                if (i != 1) {
                    if (i != 2) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    List list3 = realPaymentNavigator$initiatePaymentSuccess$1.L$3;
                    str3 = realPaymentNavigator$initiatePaymentSuccess$1.L$2;
                    responseContext2 = realPaymentNavigator$initiatePaymentSuccess$1.L$1;
                    SafeTrace.throwOnFailure(obj2);
                    responseContext2.getClass();
                    return new InitiatePaymentResult(str3, true, responseContext2);
                }
                List list4 = realPaymentNavigator$initiatePaymentSuccess$1.L$3;
                str2 = realPaymentNavigator$initiatePaymentSuccess$1.L$2;
                ResponseContext responseContext3 = realPaymentNavigator$initiatePaymentSuccess$1.L$1;
                SafeTrace.throwOnFailure(obj2);
                list2 = list4;
                responseContext2 = responseContext3;
                RealPaymentManager realPaymentManager = (RealPaymentManager) this.paymentManager;
                str2.getClass();
                list2.getClass();
                StateFlowKt.emitOrThrow(realPaymentManager.paymentActions, new PaymentAction.InitiatePaymentAction(str2, list2));
                realPaymentNavigator$initiatePaymentSuccess$1.L$1 = responseContext2;
                realPaymentNavigator$initiatePaymentSuccess$1.L$2 = str2;
                realPaymentNavigator$initiatePaymentSuccess$1.L$3 = null;
                realPaymentNavigator$initiatePaymentSuccess$1.label = 2;
                if (this.referralManager.refresh(true, realPaymentNavigator$initiatePaymentSuccess$1) != obj) {
                    str3 = str2;
                    responseContext2.getClass();
                    return new InitiatePaymentResult(str3, true, responseContext2);
                }
                return obj;
            }
        }
        realPaymentNavigator$initiatePaymentSuccess$1 = new RealPaymentNavigator$initiatePaymentSuccess$1(this, continuationImpl);
        Object obj22 = realPaymentNavigator$initiatePaymentSuccess$1.result;
        obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realPaymentNavigator$initiatePaymentSuccess$1.label;
        if (i != 0) {
        }
        RealPaymentManager realPaymentManager2 = (RealPaymentManager) this.paymentManager;
        str2.getClass();
        list2.getClass();
        StateFlowKt.emitOrThrow(realPaymentManager2.paymentActions, new PaymentAction.InitiatePaymentAction(str2, list2));
        realPaymentNavigator$initiatePaymentSuccess$1.L$1 = responseContext2;
        realPaymentNavigator$initiatePaymentSuccess$1.L$2 = str2;
        realPaymentNavigator$initiatePaymentSuccess$1.L$3 = null;
        realPaymentNavigator$initiatePaymentSuccess$1.label = 2;
        if (this.referralManager.refresh(true, realPaymentNavigator$initiatePaymentSuccess$1) != obj) {
        }
        return obj;
    }

    public final void reportPaymentInitiationPending(String str) {
        RealPaymentManager realPaymentManager = (RealPaymentManager) this.paymentManager;
        str.getClass();
        StateFlowKt.emitOrThrow(realPaymentManager.paymentActions, new PaymentAction.InitiatePaymentPendingAction(str));
        this.attributionEventEmitter.trackEvent("Attempted Money Movement", MapsKt__MapsKt.mutableMapOf(new Pair("type", "p2p")));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object retryPayment(ClientScenario clientScenario, InitiatePaymentRequest initiatePaymentRequest, boolean z, ContinuationImpl continuationImpl) {
        RealPaymentNavigator$retryPayment$1 realPaymentNavigator$retryPayment$1;
        int i;
        RetryContext retryContext;
        Long l;
        boolean z2;
        if (continuationImpl instanceof RealPaymentNavigator$retryPayment$1) {
            realPaymentNavigator$retryPayment$1 = (RealPaymentNavigator$retryPayment$1) continuationImpl;
            int i2 = realPaymentNavigator$retryPayment$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realPaymentNavigator$retryPayment$1.label = i2 - PKIFailureInfo.systemUnavail;
                RealPaymentNavigator$retryPayment$1 realPaymentNavigator$retryPayment$12 = realPaymentNavigator$retryPayment$1;
                Object obj = realPaymentNavigator$retryPayment$12.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realPaymentNavigator$retryPayment$12.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    TransactionType transactionType = TransactionType.FIAT_PAYMENT;
                    String str = initiatePaymentRequest.external_id;
                    str.getClass();
                    RequestContext requestContext = initiatePaymentRequest.request_context;
                    this.analytics.track(new OfflineTransactionRetry(transactionType, str, (requestContext == null || (retryContext = requestContext.retry_context) == null || (l = retryContext.retry_attempt) == null) ? null : new Integer((int) l.longValue())), null);
                    BlockersData.Flow.INSTANCE.getClass();
                    String generateToken = BlockersData.Flow.Companion.generateToken();
                    List list = initiatePaymentRequest.payment_getters;
                    realPaymentNavigator$retryPayment$12.label = 1;
                    obj = sendInitiatePayment(clientScenario, generateToken, initiatePaymentRequest, null, z, null, list, null, realPaymentNavigator$retryPayment$12);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                InitiatePaymentResult initiatePaymentResult = (InitiatePaymentResult) obj;
                z2 = initiatePaymentResult.success;
                String str2 = initiatePaymentResult.externalId;
                if (z2) {
                    Timber.Forest.d(Recorder$$ExternalSyntheticOutline2.m("Payment retry failed: ", str2), new Object[0]);
                } else {
                    Timber.Forest.d(Recorder$$ExternalSyntheticOutline2.m("Payment retry succeeded: ", str2), new Object[0]);
                }
                return Unit.INSTANCE;
            }
        }
        realPaymentNavigator$retryPayment$1 = new RealPaymentNavigator$retryPayment$1(this, continuationImpl);
        RealPaymentNavigator$retryPayment$1 realPaymentNavigator$retryPayment$122 = realPaymentNavigator$retryPayment$1;
        Object obj3 = realPaymentNavigator$retryPayment$122.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realPaymentNavigator$retryPayment$122.label;
        if (i != 0) {
        }
        InitiatePaymentResult initiatePaymentResult2 = (InitiatePaymentResult) obj3;
        z2 = initiatePaymentResult2.success;
        String str22 = initiatePaymentResult2.externalId;
        if (z2) {
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object sendInitiatePayment(ClientScenario clientScenario, String str, InitiatePaymentRequest initiatePaymentRequest, Long l, boolean z, GiftCardSendInitiate giftCardSendInitiate, List list, BlockersData.MoneybotContext moneybotContext, ContinuationImpl continuationImpl) {
        RealPaymentNavigator$sendInitiatePayment$3 realPaymentNavigator$sendInitiatePayment$3;
        Object obj;
        CoroutineSingletons coroutineSingletons;
        int i;
        String str2;
        Long l2;
        BlockersData.MoneybotContext moneybotContext2;
        ClientScenario clientScenario2;
        boolean z2;
        Event event;
        InitiatePaymentRequest initiatePaymentRequest2;
        List list2;
        GiftCardPaymentData giftCardPaymentData;
        InvestPaymentData investPaymentData;
        RealPaymentNavigator$sendInitiatePayment$3 realPaymentNavigator$sendInitiatePayment$32;
        List list3;
        InitiatePaymentRequest initiatePaymentRequest3;
        Long l3;
        ClientScenario clientScenario3;
        ApiResult apiResult;
        if (continuationImpl instanceof RealPaymentNavigator$sendInitiatePayment$3) {
            realPaymentNavigator$sendInitiatePayment$3 = (RealPaymentNavigator$sendInitiatePayment$3) continuationImpl;
            int i2 = realPaymentNavigator$sendInitiatePayment$3.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realPaymentNavigator$sendInitiatePayment$3.label = i2 - PKIFailureInfo.systemUnavail;
                obj = realPaymentNavigator$sendInitiatePayment$3.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realPaymentNavigator$sendInitiatePayment$3.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (clientScenario == ClientScenario.SEND_INVEST_PAYMENT) {
                        InitiatePaymentRequest.PaymentData paymentData = initiatePaymentRequest.payment_data;
                        if (paymentData != null) {
                            InitiatePaymentRequest.PaymentData.InvestPaymentData investPaymentData2 = paymentData instanceof InitiatePaymentRequest.PaymentData.InvestPaymentData ? (InitiatePaymentRequest.PaymentData.InvestPaymentData) paymentData : null;
                            if (investPaymentData2 != null) {
                                investPaymentData = investPaymentData2.getValue();
                                if (investPaymentData == null) {
                                    a$$ExternalSyntheticBUOutline0.m$3("invest_payment_data is null");
                                    return null;
                                }
                            }
                        }
                        investPaymentData = null;
                        if (investPaymentData == null) {
                        }
                    }
                    if (clientScenario == ClientScenario.SEND_GIFT_CARD_PAYMENT) {
                        InitiatePaymentRequest.PaymentData paymentData2 = initiatePaymentRequest.payment_data;
                        if (paymentData2 != null) {
                            InitiatePaymentRequest.PaymentData.GiftCardPaymentData giftCardPaymentData2 = paymentData2 instanceof InitiatePaymentRequest.PaymentData.GiftCardPaymentData ? (InitiatePaymentRequest.PaymentData.GiftCardPaymentData) paymentData2 : null;
                            if (giftCardPaymentData2 != null) {
                                giftCardPaymentData = giftCardPaymentData2.getValue();
                                if (giftCardPaymentData == null) {
                                    a$$ExternalSyntheticBUOutline0.m$3("gift_card_payment_data is null");
                                    return null;
                                }
                            }
                        }
                        giftCardPaymentData = null;
                        if (giftCardPaymentData == null) {
                        }
                    }
                    String str3 = initiatePaymentRequest.external_id;
                    str3.getClass();
                    reportPaymentInitiationPending(str3);
                    MRIUseCase mRIUseCase = MRIUseCase.RISK;
                    realPaymentNavigator$sendInitiatePayment$3.L$0 = clientScenario;
                    str2 = str;
                    realPaymentNavigator$sendInitiatePayment$3.L$1 = str2;
                    realPaymentNavigator$sendInitiatePayment$3.L$2 = initiatePaymentRequest;
                    l2 = l;
                    realPaymentNavigator$sendInitiatePayment$3.L$3 = l2;
                    realPaymentNavigator$sendInitiatePayment$3.L$4 = giftCardSendInitiate;
                    realPaymentNavigator$sendInitiatePayment$3.L$5 = list;
                    moneybotContext2 = moneybotContext;
                    realPaymentNavigator$sendInitiatePayment$3.L$6 = moneybotContext2;
                    realPaymentNavigator$sendInitiatePayment$3.Z$0 = z;
                    realPaymentNavigator$sendInitiatePayment$3.label = 1;
                    obj = RealMRIFactory.buildSignedSerializedMRIContext$default(this.mriFactory, mRIUseCase, null, realPaymentNavigator$sendInitiatePayment$3, 6);
                    if (obj != coroutineSingletons) {
                        clientScenario2 = clientScenario;
                        z2 = z;
                        event = giftCardSendInitiate;
                        initiatePaymentRequest2 = initiatePaymentRequest;
                        list2 = list;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3 && i != 4) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        List list4 = realPaymentNavigator$sendInitiatePayment$3.L$5;
                        SafeTrace.throwOnFailure(obj);
                        return obj;
                    }
                    z2 = realPaymentNavigator$sendInitiatePayment$3.Z$0;
                    initiatePaymentRequest3 = realPaymentNavigator$sendInitiatePayment$3.L$8;
                    List list5 = realPaymentNavigator$sendInitiatePayment$3.L$5;
                    event = realPaymentNavigator$sendInitiatePayment$3.L$4;
                    l3 = realPaymentNavigator$sendInitiatePayment$3.L$3;
                    clientScenario3 = realPaymentNavigator$sendInitiatePayment$3.L$0;
                    SafeTrace.throwOnFailure(obj);
                    realPaymentNavigator$sendInitiatePayment$32 = realPaymentNavigator$sendInitiatePayment$3;
                    list3 = list5;
                    apiResult = (ApiResult) obj;
                    if (!(apiResult instanceof ApiResult.Success)) {
                        if (event != null) {
                            this.analytics.track(event, null);
                        }
                        InitiatePaymentResponse initiatePaymentResponse = (InitiatePaymentResponse) ((ApiResult.Success) apiResult).response;
                        InitiatePaymentResponse.Status status = initiatePaymentResponse.status;
                        ResponseContext responseContext = initiatePaymentResponse.response_context;
                        String str4 = initiatePaymentRequest3.external_id;
                        str4.getClass();
                        realPaymentNavigator$sendInitiatePayment$32.L$0 = null;
                        realPaymentNavigator$sendInitiatePayment$32.L$1 = null;
                        realPaymentNavigator$sendInitiatePayment$32.L$2 = null;
                        realPaymentNavigator$sendInitiatePayment$32.L$3 = null;
                        realPaymentNavigator$sendInitiatePayment$32.L$4 = null;
                        realPaymentNavigator$sendInitiatePayment$32.L$5 = null;
                        realPaymentNavigator$sendInitiatePayment$32.L$6 = null;
                        realPaymentNavigator$sendInitiatePayment$32.L$8 = null;
                        realPaymentNavigator$sendInitiatePayment$32.Z$0 = z2;
                        realPaymentNavigator$sendInitiatePayment$32.label = 3;
                        Object initiatePaymentSuccess = initiatePaymentSuccess(status, responseContext, str4, list3, realPaymentNavigator$sendInitiatePayment$32);
                        if (initiatePaymentSuccess != coroutineSingletons) {
                            return initiatePaymentSuccess;
                        }
                    } else {
                        if (!(apiResult instanceof ApiResult.Failure)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        realPaymentNavigator$sendInitiatePayment$32.L$0 = null;
                        realPaymentNavigator$sendInitiatePayment$32.L$1 = null;
                        realPaymentNavigator$sendInitiatePayment$32.L$2 = null;
                        realPaymentNavigator$sendInitiatePayment$32.L$3 = null;
                        realPaymentNavigator$sendInitiatePayment$32.L$4 = null;
                        realPaymentNavigator$sendInitiatePayment$32.L$5 = null;
                        realPaymentNavigator$sendInitiatePayment$32.L$6 = null;
                        realPaymentNavigator$sendInitiatePayment$32.L$8 = null;
                        realPaymentNavigator$sendInitiatePayment$32.Z$0 = z2;
                        realPaymentNavigator$sendInitiatePayment$32.label = 4;
                        Object initiatePaymentFailure = initiatePaymentFailure(clientScenario3, (ApiResult.Failure) apiResult, initiatePaymentRequest3, l3, z2, realPaymentNavigator$sendInitiatePayment$32);
                        if (initiatePaymentFailure != coroutineSingletons) {
                            return initiatePaymentFailure;
                        }
                    }
                    return coroutineSingletons;
                }
                z2 = realPaymentNavigator$sendInitiatePayment$3.Z$0;
                BlockersData.MoneybotContext moneybotContext3 = realPaymentNavigator$sendInitiatePayment$3.L$6;
                List list6 = realPaymentNavigator$sendInitiatePayment$3.L$5;
                event = realPaymentNavigator$sendInitiatePayment$3.L$4;
                l2 = realPaymentNavigator$sendInitiatePayment$3.L$3;
                initiatePaymentRequest2 = realPaymentNavigator$sendInitiatePayment$3.L$2;
                String str5 = realPaymentNavigator$sendInitiatePayment$3.L$1;
                clientScenario2 = realPaymentNavigator$sendInitiatePayment$3.L$0;
                SafeTrace.throwOnFailure(obj);
                moneybotContext2 = moneybotContext3;
                list2 = list6;
                str2 = str5;
                SignedSerializedMRIContext signedSerializedMRIContext = (SignedSerializedMRIContext) obj;
                InitiatePaymentRequest.Builder newBuilder = initiatePaymentRequest2.newBuilder();
                RequestContext requestContext = initiatePaymentRequest2.request_context;
                InitiatePaymentRequest build = newBuilder.request_context(requestContext == null ? RequestContext.copy$default(requestContext, null, null, null, null, null, null, null, null, null, null, signedSerializedMRIContext, null, 6143) : new RequestContext(null, null, null, null, null, null, null, signedSerializedMRIContext, 6143)).build();
                String str6 = moneybotContext2 == null ? moneybotContext2.sessionId : null;
                String str7 = moneybotContext2 == null ? moneybotContext2.toolRequestId : null;
                realPaymentNavigator$sendInitiatePayment$3.L$0 = clientScenario2;
                realPaymentNavigator$sendInitiatePayment$3.L$1 = null;
                realPaymentNavigator$sendInitiatePayment$3.L$2 = null;
                realPaymentNavigator$sendInitiatePayment$3.L$3 = l2;
                realPaymentNavigator$sendInitiatePayment$3.L$4 = event;
                realPaymentNavigator$sendInitiatePayment$3.L$5 = list2;
                realPaymentNavigator$sendInitiatePayment$3.L$6 = null;
                realPaymentNavigator$sendInitiatePayment$3.L$8 = build;
                realPaymentNavigator$sendInitiatePayment$3.Z$0 = z2;
                realPaymentNavigator$sendInitiatePayment$3.label = 2;
                RealPaymentNavigator$sendInitiatePayment$3 realPaymentNavigator$sendInitiatePayment$33 = realPaymentNavigator$sendInitiatePayment$3;
                obj = this.fiatlyService.initiatePayment(clientScenario2, str2, str6, str7, build, realPaymentNavigator$sendInitiatePayment$33);
                realPaymentNavigator$sendInitiatePayment$32 = realPaymentNavigator$sendInitiatePayment$33;
                if (obj != coroutineSingletons) {
                    list3 = list2;
                    initiatePaymentRequest3 = build;
                    l3 = l2;
                    clientScenario3 = clientScenario2;
                    apiResult = (ApiResult) obj;
                    if (!(apiResult instanceof ApiResult.Success)) {
                    }
                }
                return coroutineSingletons;
            }
        }
        realPaymentNavigator$sendInitiatePayment$3 = new RealPaymentNavigator$sendInitiatePayment$3(this, continuationImpl);
        obj = realPaymentNavigator$sendInitiatePayment$3.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realPaymentNavigator$sendInitiatePayment$3.label;
        if (i != 0) {
        }
        SignedSerializedMRIContext signedSerializedMRIContext2 = (SignedSerializedMRIContext) obj;
        InitiatePaymentRequest.Builder newBuilder2 = initiatePaymentRequest2.newBuilder();
        RequestContext requestContext2 = initiatePaymentRequest2.request_context;
        InitiatePaymentRequest build2 = newBuilder2.request_context(requestContext2 == null ? RequestContext.copy$default(requestContext2, null, null, null, null, null, null, null, null, null, null, signedSerializedMRIContext2, null, 6143) : new RequestContext(null, null, null, null, null, null, null, signedSerializedMRIContext2, 6143)).build();
        if (moneybotContext2 == null) {
        }
        if (moneybotContext2 == null) {
        }
        realPaymentNavigator$sendInitiatePayment$3.L$0 = clientScenario2;
        realPaymentNavigator$sendInitiatePayment$3.L$1 = null;
        realPaymentNavigator$sendInitiatePayment$3.L$2 = null;
        realPaymentNavigator$sendInitiatePayment$3.L$3 = l2;
        realPaymentNavigator$sendInitiatePayment$3.L$4 = event;
        realPaymentNavigator$sendInitiatePayment$3.L$5 = list2;
        realPaymentNavigator$sendInitiatePayment$3.L$6 = null;
        realPaymentNavigator$sendInitiatePayment$3.L$8 = build2;
        realPaymentNavigator$sendInitiatePayment$3.Z$0 = z2;
        realPaymentNavigator$sendInitiatePayment$3.label = 2;
        RealPaymentNavigator$sendInitiatePayment$3 realPaymentNavigator$sendInitiatePayment$332 = realPaymentNavigator$sendInitiatePayment$3;
        obj = this.fiatlyService.initiatePayment(clientScenario2, str2, str6, str7, build2, realPaymentNavigator$sendInitiatePayment$332);
        realPaymentNavigator$sendInitiatePayment$32 = realPaymentNavigator$sendInitiatePayment$332;
        if (obj != coroutineSingletons) {
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object sendInitiatePersonalizedPayment(ClientScenario clientScenario, String str, InitiatePersonalizedPaymentRequest initiatePersonalizedPaymentRequest, BlockersData.MoneybotContext moneybotContext, ContinuationImpl continuationImpl) {
        RealPaymentNavigator$sendInitiatePersonalizedPayment$2 realPaymentNavigator$sendInitiatePersonalizedPayment$2;
        int i;
        InitiatePersonalizedPaymentRequest initiatePersonalizedPaymentRequest2;
        ApiResult apiResult;
        if (continuationImpl instanceof RealPaymentNavigator$sendInitiatePersonalizedPayment$2) {
            realPaymentNavigator$sendInitiatePersonalizedPayment$2 = (RealPaymentNavigator$sendInitiatePersonalizedPayment$2) continuationImpl;
            int i2 = realPaymentNavigator$sendInitiatePersonalizedPayment$2.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realPaymentNavigator$sendInitiatePersonalizedPayment$2.label = i2 - PKIFailureInfo.systemUnavail;
                RealPaymentNavigator$sendInitiatePersonalizedPayment$2 realPaymentNavigator$sendInitiatePersonalizedPayment$22 = realPaymentNavigator$sendInitiatePersonalizedPayment$2;
                Object obj = realPaymentNavigator$sendInitiatePersonalizedPayment$22.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realPaymentNavigator$sendInitiatePersonalizedPayment$22.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    InitiatePaymentRequest initiatePaymentRequest = initiatePersonalizedPaymentRequest.initiate_payment_request;
                    initiatePaymentRequest.getClass();
                    String str2 = initiatePaymentRequest.external_id;
                    str2.getClass();
                    reportPaymentInitiationPending(str2);
                    String str3 = moneybotContext != null ? moneybotContext.sessionId : null;
                    String str4 = moneybotContext != null ? moneybotContext.toolRequestId : null;
                    realPaymentNavigator$sendInitiatePersonalizedPayment$22.L$2 = initiatePersonalizedPaymentRequest;
                    realPaymentNavigator$sendInitiatePersonalizedPayment$22.label = 1;
                    obj = this.fiatlyService.initiatePersonalizedPayment(clientScenario, str, str3, str4, initiatePersonalizedPaymentRequest, realPaymentNavigator$sendInitiatePersonalizedPayment$22);
                    if (obj != obj2) {
                        initiatePersonalizedPaymentRequest2 = initiatePersonalizedPaymentRequest;
                    }
                }
                if (i != 1) {
                    if (i == 2) {
                        SafeTrace.throwOnFailure(obj);
                        return obj;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                initiatePersonalizedPaymentRequest2 = realPaymentNavigator$sendInitiatePersonalizedPayment$22.L$2;
                SafeTrace.throwOnFailure(obj);
                apiResult = (ApiResult) obj;
                if (apiResult instanceof ApiResult.Success) {
                    if (!(apiResult instanceof ApiResult.Failure)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    InitiatePaymentRequest initiatePaymentRequest2 = initiatePersonalizedPaymentRequest2.initiate_payment_request;
                    initiatePaymentRequest2.getClass();
                    String str5 = initiatePaymentRequest2.external_id;
                    str5.getClass();
                    StatusResult.Icon icon = StatusResult.Icon.FAILURE;
                    Integer num = new Integer(R.string.payment_failure_text);
                    AndroidStringManager androidStringManager = this.stringManager;
                    return new InitiatePaymentResult(str5, false, new ResponseContext(null, new StatusResult(icon, TextUtilsCompat.errorMessaging(androidStringManager, (ApiResult.Failure) apiResult, num).message, new StatusResultButton(StatusResultButton.ButtonAction.PAY_SCREEN, androidStringManager.get(R.string.payment_failure_button_text), EnumC0170g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE)), null, null, null, null, null, null, 4194301));
                }
                InitiatePaymentResponse initiatePaymentResponse = ((InitiatePersonalizedPaymentResponse) ((ApiResult.Success) apiResult).response).response;
                InitiatePaymentResponse.Status status = initiatePaymentResponse != null ? initiatePaymentResponse.status : null;
                ResponseContext responseContext = initiatePaymentResponse != null ? initiatePaymentResponse.response_context : null;
                InitiatePaymentRequest initiatePaymentRequest3 = initiatePersonalizedPaymentRequest2.initiate_payment_request;
                initiatePaymentRequest3.getClass();
                String str6 = initiatePaymentRequest3.external_id;
                str6.getClass();
                InitiatePaymentRequest initiatePaymentRequest4 = initiatePersonalizedPaymentRequest2.initiate_payment_request;
                initiatePaymentRequest4.getClass();
                List list = initiatePaymentRequest4.payment_getters;
                realPaymentNavigator$sendInitiatePersonalizedPayment$22.L$2 = null;
                realPaymentNavigator$sendInitiatePersonalizedPayment$22.label = 2;
                Object initiatePaymentSuccess = initiatePaymentSuccess(status, responseContext, str6, list, realPaymentNavigator$sendInitiatePersonalizedPayment$22);
                return initiatePaymentSuccess == obj2 ? obj2 : initiatePaymentSuccess;
            }
        }
        realPaymentNavigator$sendInitiatePersonalizedPayment$2 = new RealPaymentNavigator$sendInitiatePersonalizedPayment$2(this, continuationImpl);
        RealPaymentNavigator$sendInitiatePersonalizedPayment$2 realPaymentNavigator$sendInitiatePersonalizedPayment$222 = realPaymentNavigator$sendInitiatePersonalizedPayment$2;
        Object obj3 = realPaymentNavigator$sendInitiatePersonalizedPayment$222.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realPaymentNavigator$sendInitiatePersonalizedPayment$222.label;
        if (i != 0) {
        }
        apiResult = (ApiResult) obj3;
        if (apiResult instanceof ApiResult.Success) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object sendInitiatePoolPayment(ClientScenario clientScenario, String str, SendPoolContributionRequest sendPoolContributionRequest, ArrayList arrayList, ContinuationImpl continuationImpl) {
        RealPaymentNavigator$sendInitiatePoolPayment$3 realPaymentNavigator$sendInitiatePoolPayment$3;
        int i;
        List list;
        ApiResult apiResult;
        SendPoolContributionRequest sendPoolContributionRequest2 = sendPoolContributionRequest;
        if (continuationImpl instanceof RealPaymentNavigator$sendInitiatePoolPayment$3) {
            realPaymentNavigator$sendInitiatePoolPayment$3 = (RealPaymentNavigator$sendInitiatePoolPayment$3) continuationImpl;
            int i2 = realPaymentNavigator$sendInitiatePoolPayment$3.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realPaymentNavigator$sendInitiatePoolPayment$3.label = i2 - PKIFailureInfo.systemUnavail;
                RealPaymentNavigator$sendInitiatePoolPayment$3 realPaymentNavigator$sendInitiatePoolPayment$32 = realPaymentNavigator$sendInitiatePoolPayment$3;
                Object obj = realPaymentNavigator$sendInitiatePoolPayment$32.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realPaymentNavigator$sendInitiatePoolPayment$32.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    String str2 = sendPoolContributionRequest2.external_id;
                    str2.getClass();
                    reportPaymentInitiationPending(str2);
                    realPaymentNavigator$sendInitiatePoolPayment$32.L$2 = sendPoolContributionRequest2;
                    realPaymentNavigator$sendInitiatePoolPayment$32.L$3 = arrayList;
                    realPaymentNavigator$sendInitiatePoolPayment$32.label = 1;
                    Object sendPoolContribution = this.poolsService.sendPoolContribution(clientScenario, str, sendPoolContributionRequest2, realPaymentNavigator$sendInitiatePoolPayment$32);
                    if (sendPoolContribution != obj2) {
                        list = arrayList;
                        obj = sendPoolContribution;
                    }
                }
                if (i != 1) {
                    if (i == 2) {
                        SafeTrace.throwOnFailure(obj);
                        return obj;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                List list2 = realPaymentNavigator$sendInitiatePoolPayment$32.L$3;
                SendPoolContributionRequest sendPoolContributionRequest3 = realPaymentNavigator$sendInitiatePoolPayment$32.L$2;
                SafeTrace.throwOnFailure(obj);
                list = list2;
                sendPoolContributionRequest2 = sendPoolContributionRequest3;
                apiResult = (ApiResult) obj;
                if (apiResult instanceof ApiResult.Success) {
                    if (!(apiResult instanceof ApiResult.Failure)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    String str3 = sendPoolContributionRequest2.external_id;
                    str3.getClass();
                    StatusResult.Icon icon = StatusResult.Icon.FAILURE;
                    Integer num = new Integer(R.string.payment_failure_text);
                    AndroidStringManager androidStringManager = this.stringManager;
                    return new InitiatePaymentResult(str3, false, new ResponseContext(null, new StatusResult(icon, TextUtilsCompat.errorMessaging(androidStringManager, (ApiResult.Failure) apiResult, num).message, new StatusResultButton(StatusResultButton.ButtonAction.PAY_SCREEN, androidStringManager.get(R.string.payment_failure_button_text), EnumC0170g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE)), null, null, null, null, null, null, 4194301));
                }
                InitiatePaymentResponse.Status status = InitiatePaymentResponse.Status.SUCCESS;
                ResponseContext responseContext = ((SendPoolContributionResponse) ((ApiResult.Success) apiResult).response).response_context;
                String str4 = sendPoolContributionRequest2.external_id;
                str4.getClass();
                realPaymentNavigator$sendInitiatePoolPayment$32.L$2 = null;
                realPaymentNavigator$sendInitiatePoolPayment$32.L$3 = null;
                realPaymentNavigator$sendInitiatePoolPayment$32.label = 2;
                Object initiatePaymentSuccess = initiatePaymentSuccess(status, responseContext, str4, list, realPaymentNavigator$sendInitiatePoolPayment$32);
                return initiatePaymentSuccess == obj2 ? obj2 : initiatePaymentSuccess;
            }
        }
        realPaymentNavigator$sendInitiatePoolPayment$3 = new RealPaymentNavigator$sendInitiatePoolPayment$3(this, continuationImpl);
        RealPaymentNavigator$sendInitiatePoolPayment$3 realPaymentNavigator$sendInitiatePoolPayment$322 = realPaymentNavigator$sendInitiatePoolPayment$3;
        Object obj3 = realPaymentNavigator$sendInitiatePoolPayment$322.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realPaymentNavigator$sendInitiatePoolPayment$322.label;
        if (i != 0) {
        }
        apiResult = (ApiResult) obj3;
        if (apiResult instanceof ApiResult.Success) {
        }
    }

    public final Object sendInitiatePayment(ClientScenario clientScenario, String str, PaymentInitiatorData paymentInitiatorData, ContinuationImpl continuationImpl) {
        String str2;
        RequestContext requestContext;
        PaymentScheduleSelection paymentScheduleSelection;
        AppCreationActivity appCreationActivity;
        boolean z;
        String str3;
        PaymentData paymentData;
        String str4;
        String str5;
        BlockersData.MoneybotContext moneybotContext;
        PersonalizationInput personalizationInput;
        InitiatePaymentRequest.PaymentData paymentData2;
        GiftCardSendInitiate giftCardSendInitiate;
        SourceLocation sourceLocation;
        ArrayList arrayList = new ArrayList(paymentInitiatorData.getters.size());
        Iterator it = paymentInitiatorData.getters.iterator();
        while (it.hasNext()) {
            arrayList.add(((PaymentRecipient) it.next()).sendableUiCustomer);
        }
        UUID uuid = paymentInitiatorData.paymentToken;
        Money money = paymentInitiatorData.amount;
        Orientation orientation = paymentInitiatorData.orientation;
        InstrumentSelectionData instrumentSelectionData = paymentInitiatorData.selection;
        InstrumentSelection selectionProto = instrumentSelectionData != null ? instrumentSelectionData.toSelectionProto() : null;
        String str6 = paymentInitiatorData.note;
        SignalsContext signalsContext = paymentInitiatorData.signals;
        String str7 = paymentInitiatorData.referrer;
        String str8 = paymentInitiatorData.launchUrl;
        AppCreationActivity appCreationActivity2 = paymentInitiatorData.appCreationActivity;
        boolean z2 = paymentInitiatorData.allowRetry;
        PaymentData paymentData3 = paymentInitiatorData.paymentData;
        String str9 = paymentInitiatorData.exchangeRatesToken;
        BlockersData.MoneybotContext moneybotContext2 = paymentInitiatorData.moneybotContext;
        PersonalizationInput personalizationInput2 = paymentInitiatorData.personalizationInput;
        String str10 = paymentInitiatorData.creationMechanism;
        ScenarioInitiator scenarioInitiator = paymentInitiatorData.scenarioInitiator;
        String str11 = paymentInitiatorData.nearbySessionToken;
        PaymentScheduleSelection paymentScheduleSelection2 = paymentInitiatorData.scheduleSelection;
        if (signalsContext == null && scenarioInitiator == null) {
            paymentScheduleSelection = paymentScheduleSelection2;
            str2 = str8;
            str4 = str11;
            z = z2;
            paymentData = paymentData3;
            str3 = str9;
            moneybotContext = moneybotContext2;
            personalizationInput = personalizationInput2;
            appCreationActivity = appCreationActivity2;
            str5 = str10;
            requestContext = null;
        } else {
            str2 = str8;
            paymentScheduleSelection = paymentScheduleSelection2;
            appCreationActivity = appCreationActivity2;
            z = z2;
            str3 = str9;
            ScenarioInitiatorType scenarioInitiatorType = scenarioInitiator != null ? scenarioInitiator.f1185type : null;
            paymentData = paymentData3;
            str4 = str11;
            str5 = str10;
            moneybotContext = moneybotContext2;
            String str12 = scenarioInitiator != null ? scenarioInitiator.details : null;
            personalizationInput = personalizationInput2;
            requestContext = new RequestContext(null, null, null, signalsContext, null, scenarioInitiatorType, str12, null, 6527);
        }
        long millis = this.clock.millis();
        String uuid2 = uuid.toString();
        if (paymentData instanceof PaymentData.InvestPaymentDataWrapper) {
            paymentData2 = new InitiatePaymentRequest.PaymentData.InvestPaymentData(((PaymentData.InvestPaymentDataWrapper) paymentData).investPaymentData);
        } else if (paymentData instanceof PaymentData.GiftCardPaymentDataWrapper) {
            paymentData2 = new InitiatePaymentRequest.PaymentData.GiftCardPaymentData(((PaymentData.GiftCardPaymentDataWrapper) paymentData).giftCardPaymentData);
        } else {
            if (paymentData != null) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            paymentData2 = null;
        }
        PaymentData paymentData4 = paymentData;
        String str13 = str5;
        InitiatePaymentRequest initiatePaymentRequest = new InitiatePaymentRequest(requestContext, uuid2, arrayList, orientation, money, str6, selectionProto, str13, paymentScheduleSelection != null ? PaymentScheduleSelectionKt.toScheduleProto$default(paymentScheduleSelection) : null, str7, str2, appCreationActivity, paymentData2, str3, personalizationInput, str4, 5669440);
        if (paymentData4 instanceof PaymentData.GiftCardPaymentDataWrapper) {
            Long l = money.amount;
            PaymentData.GiftCardPaymentDataWrapper giftCardPaymentDataWrapper = (PaymentData.GiftCardPaymentDataWrapper) paymentData4;
            PaymentData.GiftCardPaymentDataWrapper.SourceContext sourceContext = giftCardPaymentDataWrapper.sourceContext;
            String str14 = giftCardPaymentDataWrapper.giftCardPaymentData.gift_card_type_token;
            String referrerFlowToken = sourceContext.getReferrerFlowToken();
            if (sourceContext.equals(PaymentData.GiftCardPaymentDataWrapper.SourceContext.DeepLink.INSTANCE)) {
                sourceLocation = SourceLocation.DEEP_LINK;
            } else if (sourceContext instanceof PaymentData.GiftCardPaymentDataWrapper.SourceContext.Discover) {
                sourceLocation = SourceLocation.DISCOVER;
            } else if (sourceContext.equals(PaymentData.GiftCardPaymentDataWrapper.SourceContext.PaymentPad.INSTANCE)) {
                sourceLocation = SourceLocation.PAYMENT_PAD;
            } else {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            giftCardSendInitiate = new GiftCardSendInitiate(str14, l, sourceLocation, str, referrerFlowToken);
        } else {
            giftCardSendInitiate = null;
        }
        return sendInitiatePayment(clientScenario, str, initiatePaymentRequest, new Long(millis), z, giftCardSendInitiate, arrayList, moneybotContext, continuationImpl);
    }
}
