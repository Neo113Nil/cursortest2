package com.squareup.cash.payments.backend.real;

import com.squareup.cash.cdf.offline.OfflineTransactionRemoved;
import com.squareup.cash.cdf.offline.TransactionType;
import com.squareup.cash.db2.InstrumentQueries;
import com.squareup.cash.db2.payment.OfflineQueries$$ExternalSyntheticLambda1;
import com.squareup.cash.db2.payment.PendingPayment;
import com.squareup.cash.db2.payment.PendingTransfer;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.payments.backend.api.OfflineManager;
import com.squareup.cash.transfers.data.TransferType;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class RealOfflineManager$removeAllPendingPayments$2 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public /* synthetic */ Object L$0;
    public final /* synthetic */ RealOfflineManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealOfflineManager$removeAllPendingPayments$2(RealOfflineManager realOfflineManager, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        switch (i) {
            case 1:
                OfflineManager.RemovalReason removalReason = OfflineManager.RemovalReason.RetrySuccessful;
                this.this$0 = realOfflineManager;
                super(2, continuation);
                break;
            default:
                OfflineManager.RemovalReason removalReason2 = OfflineManager.RemovalReason.RetrySuccessful;
                this.this$0 = realOfflineManager;
                break;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        RealOfflineManager realOfflineManager = this.this$0;
        switch (i) {
            case 0:
                OfflineManager.RemovalReason removalReason = OfflineManager.RemovalReason.RetrySuccessful;
                RealOfflineManager$removeAllPendingPayments$2 realOfflineManager$removeAllPendingPayments$2 = new RealOfflineManager$removeAllPendingPayments$2(realOfflineManager, continuation, 0);
                realOfflineManager$removeAllPendingPayments$2.L$0 = obj;
                return realOfflineManager$removeAllPendingPayments$2;
            default:
                OfflineManager.RemovalReason removalReason2 = OfflineManager.RemovalReason.RetrySuccessful;
                RealOfflineManager$removeAllPendingPayments$2 realOfflineManager$removeAllPendingPayments$22 = new RealOfflineManager$removeAllPendingPayments$2(realOfflineManager, continuation, 1);
                realOfflineManager$removeAllPendingPayments$22.L$0 = obj;
                return realOfflineManager$removeAllPendingPayments$22;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        List list = (List) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((RealOfflineManager$removeAllPendingPayments$2) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        RealOfflineManager realOfflineManager = this.this$0;
        List<PendingPayment> list = (List) this.L$0;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                OfflineManager.RemovalReason removalReason = OfflineManager.RemovalReason.SignOut;
                for (PendingPayment pendingPayment : list) {
                    realOfflineManager.analytics.track(new OfflineTransactionRemoved(TransactionType.FIAT_PAYMENT, pendingPayment.external_id, new Integer((int) pendingPayment.retry_count), RealOfflineManager.toAnalytics(removalReason), null), null);
                }
                InstrumentQueries instrumentQueries = realOfflineManager.paymentQueries;
                instrumentQueries.driver.execute(-133557959, "DELETE FROM pendingPayment", null);
                instrumentQueries.notifyQueries(-133557959, new OfflineQueries$$ExternalSyntheticLambda1(9));
                break;
            default:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                OfflineManager.RemovalReason removalReason2 = OfflineManager.RemovalReason.SignOut;
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    PendingTransfer pendingTransfer = (PendingTransfer) it.next();
                    Analytics analytics = realOfflineManager.analytics;
                    TransferType transferType = pendingTransfer.f1125type;
                    analytics.track(new OfflineTransactionRemoved(transferType != null ? RealOfflineManager.toTransactionType(transferType) : null, pendingTransfer.external_id, new Integer((int) pendingTransfer.retry_count), RealOfflineManager.toAnalytics(removalReason2), null), null);
                }
                InstrumentQueries instrumentQueries2 = realOfflineManager.transferQueries;
                instrumentQueries2.driver.execute(-821088922, "DELETE FROM pendingTransfer", null);
                instrumentQueries2.notifyQueries(-821088922, new OfflineQueries$$ExternalSyntheticLambda1(14));
                break;
        }
        return Unit.INSTANCE;
    }
}
