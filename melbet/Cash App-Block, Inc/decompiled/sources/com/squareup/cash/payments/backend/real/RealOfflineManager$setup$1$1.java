package com.squareup.cash.payments.backend.real;

import androidx.room.util.DBUtil;
import androidx.work.ExistingWorkPolicy;
import app.cash.badging.backend.FinishSetupTileBadgeCounter;
import app.cash.sqldelight.SimpleQuery;
import app.cash.sqldelight.coroutines.FlowQuery$mapToList$$inlined$map$1;
import app.cash.sqldelight.db.SqlDriver;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.size.SizeKt;
import com.squareup.cash.cdf.offline.OfflineTransactionReport;
import com.squareup.cash.cdf.offline.TransactionType;
import com.squareup.cash.db.StorageLinkQueries$$ExternalSyntheticLambda8;
import com.squareup.cash.db2.InstrumentQueries;
import com.squareup.cash.db2.OfflineConfigQueries$intervals$2;
import com.squareup.cash.db2.WebLoginConfigQueries$$ExternalSyntheticLambda0;
import com.squareup.cash.db2.payment.PendingPayment;
import com.squareup.cash.db2.payment.PendingPaymentQueries$$ExternalSyntheticLambda0;
import com.squareup.cash.db2.payment.PendingPaymentQueries$listAllPendingByCreatedDateDesc$2;
import com.squareup.cash.db2.payment.PendingPaymentQueries$nextRetry$2;
import com.squareup.cash.db2.payment.PendingPaymentQueries$paymentsToRetry$2;
import com.squareup.cash.db2.payment.PendingTransfer;
import com.squareup.cash.db2.payment.PendingTransferQueries$$ExternalSyntheticLambda2;
import com.squareup.cash.db2.payment.PendingTransferQueries$listAllPendingByCreatedDateDesc$2;
import com.squareup.cash.db2.payment.PendingTransferQueries$nextRetry$2;
import com.squareup.cash.db2.payment.PendingTransferQueries$transfersToRetry$2;
import com.squareup.cash.db2.payment.pendingPayment.NextRetry;
import com.squareup.cash.featureflags.RealFeatureFlagManager$values$$inlined$map$1;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.offers.db.OffersHomeQueries$ForIdQuery;
import com.squareup.cash.payments.backend.api.OfflineManager;
import com.squareup.cash.transfers.data.TransferType;
import com.squareup.cash.ui.MainActivity$$ExternalSyntheticLambda5;
import com.squareup.util.workmanager.AndroidWorkManager;
import com.squareup.wire.GrpcMethod;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__LimitKt$drop$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapConcat$$inlined$map$1;
import kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.internal.NopCollector;
import papa.SafeTrace;

/* loaded from: classes.dex */
public final class RealOfflineManager$setup$1$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public int label;
    public final /* synthetic */ RealOfflineManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RealOfflineManager$setup$1$1(RealOfflineManager realOfflineManager, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = realOfflineManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        RealOfflineManager realOfflineManager = this.this$0;
        switch (i) {
            case 0:
                return new RealOfflineManager$setup$1$1(realOfflineManager, continuation, 0);
            case 1:
                return new RealOfflineManager$setup$1$1(realOfflineManager, continuation, 1);
            case 2:
                return new RealOfflineManager$setup$1$1(realOfflineManager, continuation, 2);
            case 3:
                return new RealOfflineManager$setup$1$1(realOfflineManager, continuation, 3);
            case 4:
                return new RealOfflineManager$setup$1$1(realOfflineManager, continuation, 4);
            default:
                return new RealOfflineManager$setup$1$1(realOfflineManager, continuation, 5);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                return ((RealOfflineManager$setup$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 1:
                return ((RealOfflineManager$setup$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 2:
                return ((RealOfflineManager$setup$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 3:
                return ((RealOfflineManager$setup$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 4:
                return ((RealOfflineManager$setup$1$1) create((Unit) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            default:
                return ((RealOfflineManager$setup$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00e9, code lost:
    
        if (r0 == r2) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00a4, code lost:
    
        if (r3 == r2) goto L44;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        final int i2 = 3;
        final int i3 = 2;
        int i4 = 4;
        final RealOfflineManager realOfflineManager = this.this$0;
        final int i5 = 0;
        Continuation continuation = null;
        final int i6 = 1;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i7 = this.label;
                if (i7 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    InstrumentQueries instrumentQueries = realOfflineManager.paymentQueries;
                    instrumentQueries.getClass();
                    PendingPaymentQueries$nextRetry$2 pendingPaymentQueries$nextRetry$2 = PendingPaymentQueries$nextRetry$2.INSTANCE;
                    SqlDriver sqlDriver = instrumentQueries.driver;
                    WebLoginConfigQueries$$ExternalSyntheticLambda0 webLoginConfigQueries$$ExternalSyntheticLambda0 = new WebLoginConfigQueries$$ExternalSyntheticLambda0(i2);
                    sqlDriver.getClass();
                    Flow distinctUntilChanged = FlowKt.distinctUntilChanged(new FinishSetupTileBadgeCounter(4, DBUtil.toFlow(new SimpleQuery(1429962936, new String[]{"pendingPayment"}, sqlDriver, "PendingPayment.sq", "nextRetry", "SELECT min(retry_at)\nFROM pendingPayment\nWHERE succeeded = 0", webLoginConfigQueries$$ExternalSyntheticLambda0)), realOfflineManager.ioDispatcher));
                    FlowCollector flowCollector = new FlowCollector() { // from class: com.squareup.cash.payments.backend.real.RealOfflineManager$setup$1$1.1
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        public final Object emit(Object obj2, Continuation continuation2) {
                            int i8 = i5;
                            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                            RealOfflineManager realOfflineManager2 = realOfflineManager;
                            switch (i8) {
                                case 0:
                                    Long l = ((NextRetry) obj2).min;
                                    AndroidWorkManager androidWorkManager = realOfflineManager2.workManager;
                                    if (l == null) {
                                        androidWorkManager.cancelUniqueWork("pending_payment_unique_work");
                                    } else {
                                        long longValue = l.longValue() - realOfflineManager2.clock.millis();
                                        ExistingWorkPolicy existingWorkPolicy = ExistingWorkPolicy.KEEP;
                                        GrpcMethod OneTimeWorkRequestBuilder = SizeKt.OneTimeWorkRequestBuilder(OfflineWorker.class, (Pair[]) Arrays.copyOf(new Pair[]{new Pair("offline_worker_key_job_id", new Integer(1))}, 1));
                                        OneTimeWorkRequestBuilder.setInitialDelay(longValue, timeUnit);
                                        androidWorkManager.enqueueUniqueWork("pending_payment_unique_work", existingWorkPolicy, OneTimeWorkRequestBuilder.build());
                                    }
                                    break;
                                case 1:
                                    Long l2 = ((com.squareup.cash.db2.payment.pendingTransfer.NextRetry) obj2).min;
                                    AndroidWorkManager androidWorkManager2 = realOfflineManager2.workManager;
                                    if (l2 == null) {
                                        androidWorkManager2.cancelUniqueWork("pending_transfer_unique_work");
                                    } else {
                                        long longValue2 = l2.longValue() - realOfflineManager2.clock.millis();
                                        ExistingWorkPolicy existingWorkPolicy2 = ExistingWorkPolicy.KEEP;
                                        GrpcMethod OneTimeWorkRequestBuilder2 = SizeKt.OneTimeWorkRequestBuilder(OfflineWorker.class, (Pair[]) Arrays.copyOf(new Pair[]{new Pair("offline_worker_key_job_id", new Integer(2))}, 1));
                                        OneTimeWorkRequestBuilder2.setInitialDelay(longValue2, timeUnit);
                                        androidWorkManager2.enqueueUniqueWork("pending_transfer_unique_work", existingWorkPolicy2, OneTimeWorkRequestBuilder2.build());
                                    }
                                    break;
                                case 2:
                                    realOfflineManager2.retryIntervals = (List) obj2;
                                    break;
                                default:
                                    Pair pair = (Pair) obj2;
                                    List list = (List) pair.first;
                                    List list2 = (List) pair.second;
                                    Analytics analytics = realOfflineManager2.analytics;
                                    if (!list.isEmpty()) {
                                        analytics.track(new OfflineTransactionReport(TransactionType.FIAT_PAYMENT, Integer.valueOf(list.size()), CollectionsKt.joinToString$default(list, ",", null, null, 0, null, new MainActivity$$ExternalSyntheticLambda5(11), 30), Long.valueOf(((PendingPayment) CollectionsKt.last(list)).created_at), Long.valueOf(((PendingPayment) CollectionsKt.first(list)).created_at), CollectionsKt.joinToString$default(realOfflineManager2.retryIntervals, ",", null, null, 0, null, null, 62)), null);
                                    }
                                    List list3 = list2;
                                    ArrayList arrayList = new ArrayList();
                                    for (Object obj3 : list3) {
                                        if (((PendingTransfer) obj3).f1125type == TransferType.CASH_OUT) {
                                            arrayList.add(obj3);
                                        }
                                    }
                                    ArrayList arrayList2 = new ArrayList();
                                    for (Object obj4 : list3) {
                                        if (((PendingTransfer) obj4).f1125type == TransferType.ADD_CASH) {
                                            arrayList2.add(obj4);
                                        }
                                    }
                                    if (!arrayList2.isEmpty()) {
                                        analytics.track(new OfflineTransactionReport(TransactionType.CASH_IN, Integer.valueOf(arrayList2.size()), CollectionsKt.joinToString$default(arrayList2, ",", null, null, 0, null, new MainActivity$$ExternalSyntheticLambda5(12), 30), Long.valueOf(((PendingTransfer) CollectionsKt.last((List) arrayList2)).created_at), Long.valueOf(((PendingTransfer) CollectionsKt.first((List) arrayList2)).created_at), CollectionsKt.joinToString$default(realOfflineManager2.retryIntervals, ",", null, null, 0, null, null, 62)), null);
                                    }
                                    if (!arrayList.isEmpty()) {
                                        analytics.track(new OfflineTransactionReport(TransactionType.CASH_OUT, Integer.valueOf(arrayList.size()), CollectionsKt.joinToString$default(arrayList, ",", null, null, 0, null, new MainActivity$$ExternalSyntheticLambda5(13), 30), Long.valueOf(((PendingTransfer) CollectionsKt.last((List) arrayList)).created_at), Long.valueOf(((PendingTransfer) CollectionsKt.first((List) arrayList)).created_at), CollectionsKt.joinToString$default(realOfflineManager2.retryIntervals, ",", null, null, 0, null, null, 62)), null);
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    this.label = 1;
                    if (distinctUntilChanged.collect(flowCollector, this) == coroutineSingletons) {
                        break;
                    }
                } else if (i7 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 1:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i8 = this.label;
                if (i8 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    InstrumentQueries instrumentQueries2 = realOfflineManager.transferQueries;
                    instrumentQueries2.getClass();
                    PendingTransferQueries$nextRetry$2 pendingTransferQueries$nextRetry$2 = PendingTransferQueries$nextRetry$2.INSTANCE;
                    SqlDriver sqlDriver2 = instrumentQueries2.driver;
                    WebLoginConfigQueries$$ExternalSyntheticLambda0 webLoginConfigQueries$$ExternalSyntheticLambda02 = new WebLoginConfigQueries$$ExternalSyntheticLambda0(i4);
                    sqlDriver2.getClass();
                    Flow distinctUntilChanged2 = FlowKt.distinctUntilChanged(new FinishSetupTileBadgeCounter(4, DBUtil.toFlow(new SimpleQuery(742431973, new String[]{"pendingTransfer"}, sqlDriver2, "PendingTransfer.sq", "nextRetry", "SELECT min(retry_at)\nFROM pendingTransfer\nWHERE succeeded = 0", webLoginConfigQueries$$ExternalSyntheticLambda02)), realOfflineManager.ioDispatcher));
                    FlowCollector flowCollector2 = new FlowCollector() { // from class: com.squareup.cash.payments.backend.real.RealOfflineManager$setup$1$1.1
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        public final Object emit(Object obj2, Continuation continuation2) {
                            int i82 = i6;
                            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                            RealOfflineManager realOfflineManager2 = realOfflineManager;
                            switch (i82) {
                                case 0:
                                    Long l = ((NextRetry) obj2).min;
                                    AndroidWorkManager androidWorkManager = realOfflineManager2.workManager;
                                    if (l == null) {
                                        androidWorkManager.cancelUniqueWork("pending_payment_unique_work");
                                    } else {
                                        long longValue = l.longValue() - realOfflineManager2.clock.millis();
                                        ExistingWorkPolicy existingWorkPolicy = ExistingWorkPolicy.KEEP;
                                        GrpcMethod OneTimeWorkRequestBuilder = SizeKt.OneTimeWorkRequestBuilder(OfflineWorker.class, (Pair[]) Arrays.copyOf(new Pair[]{new Pair("offline_worker_key_job_id", new Integer(1))}, 1));
                                        OneTimeWorkRequestBuilder.setInitialDelay(longValue, timeUnit);
                                        androidWorkManager.enqueueUniqueWork("pending_payment_unique_work", existingWorkPolicy, OneTimeWorkRequestBuilder.build());
                                    }
                                    break;
                                case 1:
                                    Long l2 = ((com.squareup.cash.db2.payment.pendingTransfer.NextRetry) obj2).min;
                                    AndroidWorkManager androidWorkManager2 = realOfflineManager2.workManager;
                                    if (l2 == null) {
                                        androidWorkManager2.cancelUniqueWork("pending_transfer_unique_work");
                                    } else {
                                        long longValue2 = l2.longValue() - realOfflineManager2.clock.millis();
                                        ExistingWorkPolicy existingWorkPolicy2 = ExistingWorkPolicy.KEEP;
                                        GrpcMethod OneTimeWorkRequestBuilder2 = SizeKt.OneTimeWorkRequestBuilder(OfflineWorker.class, (Pair[]) Arrays.copyOf(new Pair[]{new Pair("offline_worker_key_job_id", new Integer(2))}, 1));
                                        OneTimeWorkRequestBuilder2.setInitialDelay(longValue2, timeUnit);
                                        androidWorkManager2.enqueueUniqueWork("pending_transfer_unique_work", existingWorkPolicy2, OneTimeWorkRequestBuilder2.build());
                                    }
                                    break;
                                case 2:
                                    realOfflineManager2.retryIntervals = (List) obj2;
                                    break;
                                default:
                                    Pair pair = (Pair) obj2;
                                    List list = (List) pair.first;
                                    List list2 = (List) pair.second;
                                    Analytics analytics = realOfflineManager2.analytics;
                                    if (!list.isEmpty()) {
                                        analytics.track(new OfflineTransactionReport(TransactionType.FIAT_PAYMENT, Integer.valueOf(list.size()), CollectionsKt.joinToString$default(list, ",", null, null, 0, null, new MainActivity$$ExternalSyntheticLambda5(11), 30), Long.valueOf(((PendingPayment) CollectionsKt.last(list)).created_at), Long.valueOf(((PendingPayment) CollectionsKt.first(list)).created_at), CollectionsKt.joinToString$default(realOfflineManager2.retryIntervals, ",", null, null, 0, null, null, 62)), null);
                                    }
                                    List list3 = list2;
                                    ArrayList arrayList = new ArrayList();
                                    for (Object obj3 : list3) {
                                        if (((PendingTransfer) obj3).f1125type == TransferType.CASH_OUT) {
                                            arrayList.add(obj3);
                                        }
                                    }
                                    ArrayList arrayList2 = new ArrayList();
                                    for (Object obj4 : list3) {
                                        if (((PendingTransfer) obj4).f1125type == TransferType.ADD_CASH) {
                                            arrayList2.add(obj4);
                                        }
                                    }
                                    if (!arrayList2.isEmpty()) {
                                        analytics.track(new OfflineTransactionReport(TransactionType.CASH_IN, Integer.valueOf(arrayList2.size()), CollectionsKt.joinToString$default(arrayList2, ",", null, null, 0, null, new MainActivity$$ExternalSyntheticLambda5(12), 30), Long.valueOf(((PendingTransfer) CollectionsKt.last((List) arrayList2)).created_at), Long.valueOf(((PendingTransfer) CollectionsKt.first((List) arrayList2)).created_at), CollectionsKt.joinToString$default(realOfflineManager2.retryIntervals, ",", null, null, 0, null, null, 62)), null);
                                    }
                                    if (!arrayList.isEmpty()) {
                                        analytics.track(new OfflineTransactionReport(TransactionType.CASH_OUT, Integer.valueOf(arrayList.size()), CollectionsKt.joinToString$default(arrayList, ",", null, null, 0, null, new MainActivity$$ExternalSyntheticLambda5(13), 30), Long.valueOf(((PendingTransfer) CollectionsKt.last((List) arrayList)).created_at), Long.valueOf(((PendingTransfer) CollectionsKt.first((List) arrayList)).created_at), CollectionsKt.joinToString$default(realOfflineManager2.retryIntervals, ",", null, null, 0, null, null, 62)), null);
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    this.label = 1;
                    if (distinctUntilChanged2.collect(flowCollector2, this) == coroutineSingletons2) {
                        break;
                    }
                } else if (i8 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 2:
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i9 = this.label;
                if (i9 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    InstrumentQueries instrumentQueries3 = realOfflineManager.offlineConfigQueries;
                    instrumentQueries3.getClass();
                    int i10 = OfflineConfigQueries$intervals$2.$r8$clinit;
                    SqlDriver sqlDriver3 = instrumentQueries3.driver;
                    StorageLinkQueries$$ExternalSyntheticLambda8 storageLinkQueries$$ExternalSyntheticLambda8 = new StorageLinkQueries$$ExternalSyntheticLambda8(instrumentQueries3);
                    sqlDriver3.getClass();
                    Flow distinctUntilChanged3 = FlowKt.distinctUntilChanged(new FinishSetupTileBadgeCounter(4, DBUtil.toFlow(new SimpleQuery(-348898989, new String[]{"offlineConfig"}, sqlDriver3, "OfflineConfig.sq", "intervals", "SELECT retry_intervals\nFROM offlineConfig", storageLinkQueries$$ExternalSyntheticLambda8)), realOfflineManager.ioDispatcher));
                    FlowCollector flowCollector3 = new FlowCollector() { // from class: com.squareup.cash.payments.backend.real.RealOfflineManager$setup$1$1.1
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        public final Object emit(Object obj2, Continuation continuation2) {
                            int i82 = i3;
                            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                            RealOfflineManager realOfflineManager2 = realOfflineManager;
                            switch (i82) {
                                case 0:
                                    Long l = ((NextRetry) obj2).min;
                                    AndroidWorkManager androidWorkManager = realOfflineManager2.workManager;
                                    if (l == null) {
                                        androidWorkManager.cancelUniqueWork("pending_payment_unique_work");
                                    } else {
                                        long longValue = l.longValue() - realOfflineManager2.clock.millis();
                                        ExistingWorkPolicy existingWorkPolicy = ExistingWorkPolicy.KEEP;
                                        GrpcMethod OneTimeWorkRequestBuilder = SizeKt.OneTimeWorkRequestBuilder(OfflineWorker.class, (Pair[]) Arrays.copyOf(new Pair[]{new Pair("offline_worker_key_job_id", new Integer(1))}, 1));
                                        OneTimeWorkRequestBuilder.setInitialDelay(longValue, timeUnit);
                                        androidWorkManager.enqueueUniqueWork("pending_payment_unique_work", existingWorkPolicy, OneTimeWorkRequestBuilder.build());
                                    }
                                    break;
                                case 1:
                                    Long l2 = ((com.squareup.cash.db2.payment.pendingTransfer.NextRetry) obj2).min;
                                    AndroidWorkManager androidWorkManager2 = realOfflineManager2.workManager;
                                    if (l2 == null) {
                                        androidWorkManager2.cancelUniqueWork("pending_transfer_unique_work");
                                    } else {
                                        long longValue2 = l2.longValue() - realOfflineManager2.clock.millis();
                                        ExistingWorkPolicy existingWorkPolicy2 = ExistingWorkPolicy.KEEP;
                                        GrpcMethod OneTimeWorkRequestBuilder2 = SizeKt.OneTimeWorkRequestBuilder(OfflineWorker.class, (Pair[]) Arrays.copyOf(new Pair[]{new Pair("offline_worker_key_job_id", new Integer(2))}, 1));
                                        OneTimeWorkRequestBuilder2.setInitialDelay(longValue2, timeUnit);
                                        androidWorkManager2.enqueueUniqueWork("pending_transfer_unique_work", existingWorkPolicy2, OneTimeWorkRequestBuilder2.build());
                                    }
                                    break;
                                case 2:
                                    realOfflineManager2.retryIntervals = (List) obj2;
                                    break;
                                default:
                                    Pair pair = (Pair) obj2;
                                    List list = (List) pair.first;
                                    List list2 = (List) pair.second;
                                    Analytics analytics = realOfflineManager2.analytics;
                                    if (!list.isEmpty()) {
                                        analytics.track(new OfflineTransactionReport(TransactionType.FIAT_PAYMENT, Integer.valueOf(list.size()), CollectionsKt.joinToString$default(list, ",", null, null, 0, null, new MainActivity$$ExternalSyntheticLambda5(11), 30), Long.valueOf(((PendingPayment) CollectionsKt.last(list)).created_at), Long.valueOf(((PendingPayment) CollectionsKt.first(list)).created_at), CollectionsKt.joinToString$default(realOfflineManager2.retryIntervals, ",", null, null, 0, null, null, 62)), null);
                                    }
                                    List list3 = list2;
                                    ArrayList arrayList = new ArrayList();
                                    for (Object obj3 : list3) {
                                        if (((PendingTransfer) obj3).f1125type == TransferType.CASH_OUT) {
                                            arrayList.add(obj3);
                                        }
                                    }
                                    ArrayList arrayList2 = new ArrayList();
                                    for (Object obj4 : list3) {
                                        if (((PendingTransfer) obj4).f1125type == TransferType.ADD_CASH) {
                                            arrayList2.add(obj4);
                                        }
                                    }
                                    if (!arrayList2.isEmpty()) {
                                        analytics.track(new OfflineTransactionReport(TransactionType.CASH_IN, Integer.valueOf(arrayList2.size()), CollectionsKt.joinToString$default(arrayList2, ",", null, null, 0, null, new MainActivity$$ExternalSyntheticLambda5(12), 30), Long.valueOf(((PendingTransfer) CollectionsKt.last((List) arrayList2)).created_at), Long.valueOf(((PendingTransfer) CollectionsKt.first((List) arrayList2)).created_at), CollectionsKt.joinToString$default(realOfflineManager2.retryIntervals, ",", null, null, 0, null, null, 62)), null);
                                    }
                                    if (!arrayList.isEmpty()) {
                                        analytics.track(new OfflineTransactionReport(TransactionType.CASH_OUT, Integer.valueOf(arrayList.size()), CollectionsKt.joinToString$default(arrayList, ",", null, null, 0, null, new MainActivity$$ExternalSyntheticLambda5(13), 30), Long.valueOf(((PendingTransfer) CollectionsKt.last((List) arrayList)).created_at), Long.valueOf(((PendingTransfer) CollectionsKt.first((List) arrayList)).created_at), CollectionsKt.joinToString$default(realOfflineManager2.retryIntervals, ",", null, null, 0, null, null, 62)), null);
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    this.label = 1;
                    Object collect = distinctUntilChanged3.collect(new RealFeatureFlagManager$values$$inlined$map$1.AnonymousClass2(flowCollector3, 26), this);
                    if (collect != coroutineSingletons3) {
                        collect = Unit.INSTANCE;
                    }
                    if (collect == coroutineSingletons3) {
                        break;
                    }
                } else if (i9 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 3:
                CoroutineContext coroutineContext = realOfflineManager.ioDispatcher;
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i11 = this.label;
                if (i11 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    InstrumentQueries instrumentQueries4 = realOfflineManager.paymentQueries;
                    instrumentQueries4.getClass();
                    PendingPaymentQueries$listAllPendingByCreatedDateDesc$2 pendingPaymentQueries$listAllPendingByCreatedDateDesc$2 = PendingPaymentQueries$listAllPendingByCreatedDateDesc$2.INSTANCE;
                    SqlDriver sqlDriver4 = instrumentQueries4.driver;
                    StorageLinkQueries$$ExternalSyntheticLambda8 storageLinkQueries$$ExternalSyntheticLambda82 = new StorageLinkQueries$$ExternalSyntheticLambda8(instrumentQueries4, 0);
                    sqlDriver4.getClass();
                    FlowQuery$mapToList$$inlined$map$1 mapToList = DBUtil.mapToList(DBUtil.toFlow(new SimpleQuery(-738376577, new String[]{"pendingPayment"}, sqlDriver4, "PendingPayment.sq", "listAllPendingByCreatedDateDesc", "SELECT pendingPayment.external_id, pendingPayment.created_at, pendingPayment.retry_at, pendingPayment.retry_count, pendingPayment.request, pendingPayment.amount, pendingPayment.orientation, pendingPayment.succeeded, pendingPayment.recipients, pendingPayment.invest_payment_data, pendingPayment.client_scenario, pendingPayment.personalization, pendingPayment.ready_for_removal\nFROM pendingPayment\nORDER BY created_at DESC", storageLinkQueries$$ExternalSyntheticLambda82)), coroutineContext);
                    InstrumentQueries instrumentQueries5 = realOfflineManager.transferQueries;
                    instrumentQueries5.getClass();
                    PendingTransferQueries$listAllPendingByCreatedDateDesc$2 pendingTransferQueries$listAllPendingByCreatedDateDesc$2 = PendingTransferQueries$listAllPendingByCreatedDateDesc$2.INSTANCE;
                    SqlDriver sqlDriver5 = instrumentQueries5.driver;
                    StorageLinkQueries$$ExternalSyntheticLambda8 storageLinkQueries$$ExternalSyntheticLambda83 = new StorageLinkQueries$$ExternalSyntheticLambda8(instrumentQueries5, (short) 0);
                    sqlDriver5.getClass();
                    FlowKt__LimitKt$drop$$inlined$unsafeFlow$1 take = FlowKt.take(new FlowKt__ZipKt$combine$$inlined$unsafeFlow$1(mapToList, DBUtil.mapToList(DBUtil.toFlow(new SimpleQuery(-524463892, new String[]{"pendingTransfer"}, sqlDriver5, "PendingTransfer.sq", "listAllPendingByCreatedDateDesc", "SELECT pendingTransfer.external_id, pendingTransfer.created_at, pendingTransfer.retry_at, pendingTransfer.retry_count, pendingTransfer.request, pendingTransfer.succeeded, pendingTransfer.type, pendingTransfer.ready_for_removal, pendingTransfer.first_error_request_created_at, pendingTransfer.first_error_response_created_at, pendingTransfer.first_error_response_reason\nFROM pendingTransfer\nORDER BY created_at DESC", storageLinkQueries$$ExternalSyntheticLambda83)), coroutineContext), RealOfflineManager$setup$1$4$3.INSTANCE, 0), 1);
                    FlowCollector flowCollector4 = new FlowCollector() { // from class: com.squareup.cash.payments.backend.real.RealOfflineManager$setup$1$1.1
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        public final Object emit(Object obj2, Continuation continuation2) {
                            int i82 = i2;
                            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                            RealOfflineManager realOfflineManager2 = realOfflineManager;
                            switch (i82) {
                                case 0:
                                    Long l = ((NextRetry) obj2).min;
                                    AndroidWorkManager androidWorkManager = realOfflineManager2.workManager;
                                    if (l == null) {
                                        androidWorkManager.cancelUniqueWork("pending_payment_unique_work");
                                    } else {
                                        long longValue = l.longValue() - realOfflineManager2.clock.millis();
                                        ExistingWorkPolicy existingWorkPolicy = ExistingWorkPolicy.KEEP;
                                        GrpcMethod OneTimeWorkRequestBuilder = SizeKt.OneTimeWorkRequestBuilder(OfflineWorker.class, (Pair[]) Arrays.copyOf(new Pair[]{new Pair("offline_worker_key_job_id", new Integer(1))}, 1));
                                        OneTimeWorkRequestBuilder.setInitialDelay(longValue, timeUnit);
                                        androidWorkManager.enqueueUniqueWork("pending_payment_unique_work", existingWorkPolicy, OneTimeWorkRequestBuilder.build());
                                    }
                                    break;
                                case 1:
                                    Long l2 = ((com.squareup.cash.db2.payment.pendingTransfer.NextRetry) obj2).min;
                                    AndroidWorkManager androidWorkManager2 = realOfflineManager2.workManager;
                                    if (l2 == null) {
                                        androidWorkManager2.cancelUniqueWork("pending_transfer_unique_work");
                                    } else {
                                        long longValue2 = l2.longValue() - realOfflineManager2.clock.millis();
                                        ExistingWorkPolicy existingWorkPolicy2 = ExistingWorkPolicy.KEEP;
                                        GrpcMethod OneTimeWorkRequestBuilder2 = SizeKt.OneTimeWorkRequestBuilder(OfflineWorker.class, (Pair[]) Arrays.copyOf(new Pair[]{new Pair("offline_worker_key_job_id", new Integer(2))}, 1));
                                        OneTimeWorkRequestBuilder2.setInitialDelay(longValue2, timeUnit);
                                        androidWorkManager2.enqueueUniqueWork("pending_transfer_unique_work", existingWorkPolicy2, OneTimeWorkRequestBuilder2.build());
                                    }
                                    break;
                                case 2:
                                    realOfflineManager2.retryIntervals = (List) obj2;
                                    break;
                                default:
                                    Pair pair = (Pair) obj2;
                                    List list = (List) pair.first;
                                    List list2 = (List) pair.second;
                                    Analytics analytics = realOfflineManager2.analytics;
                                    if (!list.isEmpty()) {
                                        analytics.track(new OfflineTransactionReport(TransactionType.FIAT_PAYMENT, Integer.valueOf(list.size()), CollectionsKt.joinToString$default(list, ",", null, null, 0, null, new MainActivity$$ExternalSyntheticLambda5(11), 30), Long.valueOf(((PendingPayment) CollectionsKt.last(list)).created_at), Long.valueOf(((PendingPayment) CollectionsKt.first(list)).created_at), CollectionsKt.joinToString$default(realOfflineManager2.retryIntervals, ",", null, null, 0, null, null, 62)), null);
                                    }
                                    List list3 = list2;
                                    ArrayList arrayList = new ArrayList();
                                    for (Object obj3 : list3) {
                                        if (((PendingTransfer) obj3).f1125type == TransferType.CASH_OUT) {
                                            arrayList.add(obj3);
                                        }
                                    }
                                    ArrayList arrayList2 = new ArrayList();
                                    for (Object obj4 : list3) {
                                        if (((PendingTransfer) obj4).f1125type == TransferType.ADD_CASH) {
                                            arrayList2.add(obj4);
                                        }
                                    }
                                    if (!arrayList2.isEmpty()) {
                                        analytics.track(new OfflineTransactionReport(TransactionType.CASH_IN, Integer.valueOf(arrayList2.size()), CollectionsKt.joinToString$default(arrayList2, ",", null, null, 0, null, new MainActivity$$ExternalSyntheticLambda5(12), 30), Long.valueOf(((PendingTransfer) CollectionsKt.last((List) arrayList2)).created_at), Long.valueOf(((PendingTransfer) CollectionsKt.first((List) arrayList2)).created_at), CollectionsKt.joinToString$default(realOfflineManager2.retryIntervals, ",", null, null, 0, null, null, 62)), null);
                                    }
                                    if (!arrayList.isEmpty()) {
                                        analytics.track(new OfflineTransactionReport(TransactionType.CASH_OUT, Integer.valueOf(arrayList.size()), CollectionsKt.joinToString$default(arrayList, ",", null, null, 0, null, new MainActivity$$ExternalSyntheticLambda5(13), 30), Long.valueOf(((PendingTransfer) CollectionsKt.last((List) arrayList)).created_at), Long.valueOf(((PendingTransfer) CollectionsKt.first((List) arrayList)).created_at), CollectionsKt.joinToString$default(realOfflineManager2.retryIntervals, ",", null, null, 0, null, null, 62)), null);
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    this.label = 1;
                    if (take.collect(flowCollector4, this) == coroutineSingletons4) {
                        break;
                    }
                } else if (i11 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 4:
                CoroutineContext coroutineContext2 = realOfflineManager.ioDispatcher;
                CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i12 = this.label;
                NopCollector nopCollector = NopCollector.INSTANCE;
                long j = Long.MAX_VALUE;
                if (i12 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    OfflineManager.RemovalReason removalReason = OfflineManager.RemovalReason.RetrySuccessful;
                    this.label = 1;
                    InstrumentQueries instrumentQueries6 = realOfflineManager.paymentQueries;
                    instrumentQueries6.getClass();
                    PendingPaymentQueries$paymentsToRetry$2 pendingPaymentQueries$paymentsToRetry$2 = PendingPaymentQueries$paymentsToRetry$2.INSTANCE;
                    Object collect2 = DBUtil.mapToList(FlowKt.take(DBUtil.toFlow(new OffersHomeQueries$ForIdQuery(instrumentQueries6, j, new PendingPaymentQueries$$ExternalSyntheticLambda0(instrumentQueries6, i5), 3)), 1), coroutineContext2).collect(new FlowKt__MergeKt$flatMapConcat$$inlined$map$1.AnonymousClass2(nopCollector, new RealOfflineManager$removeAllPendingPayments$2(realOfflineManager, null, 0), 1), this);
                    if (collect2 != coroutineSingletons5) {
                        collect2 = Unit.INSTANCE;
                    }
                    if (collect2 != coroutineSingletons5) {
                        collect2 = Unit.INSTANCE;
                    }
                    if (collect2 != coroutineSingletons5) {
                        collect2 = Unit.INSTANCE;
                        break;
                    }
                } else if (i12 == 1) {
                    SafeTrace.throwOnFailure(obj);
                } else if (i12 != 2) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                    break;
                }
                OfflineManager.RemovalReason removalReason2 = OfflineManager.RemovalReason.RetrySuccessful;
                this.label = 2;
                InstrumentQueries instrumentQueries7 = realOfflineManager.transferQueries;
                instrumentQueries7.getClass();
                PendingTransferQueries$transfersToRetry$2 pendingTransferQueries$transfersToRetry$2 = PendingTransferQueries$transfersToRetry$2.INSTANCE;
                Object collect3 = DBUtil.mapToList(FlowKt.take(DBUtil.toFlow(new OffersHomeQueries$ForIdQuery(instrumentQueries7, j, new PendingTransferQueries$$ExternalSyntheticLambda2(instrumentQueries7, i5), 4)), 1), coroutineContext2).collect(new FlowKt__MergeKt$flatMapConcat$$inlined$map$1.AnonymousClass2(nopCollector, new RealOfflineManager$removeAllPendingPayments$2(realOfflineManager, null, 1), 1), this);
                if (collect3 != coroutineSingletons5) {
                    collect3 = Unit.INSTANCE;
                }
                if (collect3 != coroutineSingletons5) {
                    collect3 = Unit.INSTANCE;
                }
                if (collect3 != coroutineSingletons5) {
                    collect3 = Unit.INSTANCE;
                    break;
                }
                break;
            default:
                CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i13 = this.label;
                if (i13 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow = realOfflineManager.signOut;
                    RealOfflineManager$setup$1$1 realOfflineManager$setup$1$1 = new RealOfflineManager$setup$1$1(realOfflineManager, continuation, i4);
                    this.label = 1;
                    if (FlowKt.collectLatest(flow, realOfflineManager$setup$1$1, this) == coroutineSingletons6) {
                        break;
                    }
                } else if (i13 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
