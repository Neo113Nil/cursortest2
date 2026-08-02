package com.squareup.cash.payments.backend.real;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import app.cash.sqldelight.db.QueryResult;
import com.squareup.cash.cdf.offline.OfflineTransactionRemoved;
import com.squareup.cash.cdf.offline.TransactionType;
import com.squareup.cash.db2.InstrumentQueries;
import com.squareup.cash.db2.SyncDetailsQueries$$ExternalSyntheticLambda2;
import com.squareup.cash.db2.payment.OfflineQueries$$ExternalSyntheticLambda1;
import com.squareup.cash.db2.payment.PendingPayment;
import com.squareup.cash.payments.backend.api.OfflineManager;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;
import timber.log.Timber;

/* loaded from: classes6.dex */
public final class RealOfflineManager$removePendingPayment$2 extends SuspendLambda implements Function2 {
    public final /* synthetic */ String $externalId;
    public final /* synthetic */ String $reasonDesc;
    public final /* synthetic */ OfflineManager.RemovalReason $removalReason;
    public final /* synthetic */ RealOfflineManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealOfflineManager$removePendingPayment$2(String str, OfflineManager.RemovalReason removalReason, RealOfflineManager realOfflineManager, String str2, Continuation continuation) {
        super(2, continuation);
        this.$externalId = str;
        this.$removalReason = removalReason;
        this.this$0 = realOfflineManager;
        this.$reasonDesc = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RealOfflineManager$removePendingPayment$2(this.$externalId, this.$removalReason, this.this$0, this.$reasonDesc, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((RealOfflineManager$removePendingPayment$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        SafeTrace.throwOnFailure(obj);
        Timber.Forest forest = Timber.Forest;
        String str = this.$externalId;
        forest.d(Recorder$$ExternalSyntheticOutline2.m("Removing pending payment: ", str), new Object[0]);
        RealOfflineManager realOfflineManager = this.this$0;
        InstrumentQueries instrumentQueries = realOfflineManager.paymentQueries;
        PendingPayment pendingPayment = (PendingPayment) instrumentQueries.pendingRequest(str).executeAsOneOrNull();
        if (pendingPayment != null) {
            OfflineManager.RemovalReason removalReason = OfflineManager.RemovalReason.RetrySuccessful;
            OfflineManager.RemovalReason removalReason2 = this.$removalReason;
            if (removalReason2 == removalReason && pendingPayment.request.cancel_payments_data != null) {
                removalReason2 = OfflineManager.RemovalReason.Cancelled;
            }
            int i = ((int) pendingPayment.retry_count) + 1;
            realOfflineManager.analytics.track(new OfflineTransactionRemoved(TransactionType.FIAT_PAYMENT, this.$externalId, new Integer(i), RealOfflineManager.toAnalytics(removalReason2), this.$reasonDesc), null);
        }
        instrumentQueries.getClass();
        QueryResult execute = instrumentQueries.driver.execute(1411672411, "UPDATE pendingPayment\nSET succeeded = 1,\n  ready_for_removal = 1\nWHERE external_id = ?", new SyncDetailsQueries$$ExternalSyntheticLambda2(str, 15));
        instrumentQueries.notifyQueries(1411672411, new OfflineQueries$$ExternalSyntheticLambda1(11));
        return execute;
    }
}
