package com.squareup.cash.payments.backend.real;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.cdf.offline.OfflineTransactionRetry;
import com.squareup.cash.cdf.offline.TransactionType;
import com.squareup.cash.data.transfers.RealTransferManager;
import com.squareup.cash.data.transfers.TransferManager;
import com.squareup.cash.db2.payment.PendingTransfer;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.transfers.data.TransferType;
import com.squareup.cash.work.data.real.RealPayDataLoader$fetchData$1;
import com.squareup.protos.franklin.api.CashInstrumentType;
import com.squareup.protos.franklin.api.Instrument;
import com.squareup.protos.franklin.common.RequestContext;
import com.squareup.protos.franklin.common.RetryContext;
import com.squareup.protos.franklin.common.TransferFundsRequest;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.StartedLazily$command$$inlined$unsafeFlow$1;
import papa.SafeTrace;
import timber.log.Timber;

/* loaded from: classes6.dex */
public final class RealOfflineManager$retryTransfers$1$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ boolean $force;
    public int I$0;
    public int I$1;
    public /* synthetic */ Object L$0;
    public RealOfflineManager L$2;
    public Collection L$4;
    public Iterator L$5;
    public Collection L$9;
    public boolean Z$0;
    public int label;
    public final /* synthetic */ RealOfflineManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealOfflineManager$retryTransfers$1$1(RealOfflineManager realOfflineManager, boolean z, Continuation continuation) {
        super(2, continuation);
        this.this$0 = realOfflineManager;
        this.$force = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        RealOfflineManager$retryTransfers$1$1 realOfflineManager$retryTransfers$1$1 = new RealOfflineManager$retryTransfers$1$1(this.this$0, this.$force, continuation);
        realOfflineManager$retryTransfers$1$1.L$0 = obj;
        return realOfflineManager$retryTransfers$1$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((RealOfflineManager$retryTransfers$1$1) create((List) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0056  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x01c1 -> B:5:0x01c3). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Iterator it;
        RealOfflineManager realOfflineManager;
        boolean z;
        int i;
        Collection collection;
        int i2;
        TransferFundsRequest transferFundsRequest;
        Integer num;
        RetryContext retryContext;
        Long l;
        List list = (List) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = this.label;
        if (i3 == 0) {
            SafeTrace.throwOnFailure(obj);
            List list2 = list;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
            it = list2.iterator();
            realOfflineManager = this.this$0;
            z = this.$force;
            i = 0;
            collection = arrayList;
            i2 = 0;
            if (it.hasNext()) {
            }
        } else {
            if (i3 != 1) {
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = this.I$1;
            int i4 = this.I$0;
            z = this.Z$0;
            collection = this.L$9;
            it = this.L$5;
            Collection collection2 = this.L$4;
            realOfflineManager = this.L$2;
            SafeTrace.throwOnFailure(obj);
            int i5 = i4;
            Object obj2 = null;
            Object withContext = obj;
            collection.add((TransferManager.TransferFundsResult) withContext);
            collection = collection2;
            i2 = i5;
            if (it.hasNext()) {
                PendingTransfer pendingTransfer = (PendingTransfer) it.next();
                List list3 = RealOfflineManager.DEFAULT_RETRY_INTERVALS;
                realOfflineManager.getClass();
                TransferFundsRequest transferFundsRequest2 = pendingTransfer.request;
                long j = pendingTransfer.created_at;
                boolean z2 = z;
                long j2 = pendingTransfer.retry_count + 1;
                RetryContext.ErrorContext errorContext = pendingTransfer.first_error_response_reason != null ? new RetryContext.ErrorContext(pendingTransfer.first_error_request_created_at, pendingTransfer.first_error_response_created_at, pendingTransfer.first_error_response_reason, null, 8, null) : null;
                transferFundsRequest2.getClass();
                RequestContext requestContext = transferFundsRequest2.request_context;
                TransferFundsRequest copy$default = TransferFundsRequest.copy$default(transferFundsRequest2, RequestContext.copy$default(requestContext == null ? new RequestContext(null, null, null, null, null, null, null, null, 8191) : requestContext, new RetryContext(Long.valueOf(j), Long.valueOf(j2), errorContext, 44), null, null, null, null, null, null, null, null, null, null, null, 8190), null, null, null, null, null, null, 16382);
                Timber.Forest forest = Timber.Forest;
                forest.d("Retrying transfer: " + copy$default, new Object[0]);
                TransferManager transferManager = (TransferManager) realOfflineManager.transferManager.getValue();
                boolean z3 = z2 ^ true;
                TransferType transferType = pendingTransfer.f1125type;
                if (transferType == null) {
                    Instrument instrument = copy$default.target;
                    Instrument instrument2 = copy$default.source;
                    transferType = ((instrument == null || instrument.cash_instrument_type != CashInstrumentType.CASH_BALANCE) && (instrument2 != null && instrument2.cash_instrument_type == CashInstrumentType.CASH_BALANCE)) ? TransferType.CASH_OUT : TransferType.ADD_CASH;
                    forest.e(new IllegalStateException("Missing transfer type for external_id=" + copy$default.external_id + ". Inferred to be " + transferType));
                }
                this.L$0 = null;
                this.L$2 = realOfflineManager;
                Collection collection3 = collection;
                this.L$4 = collection3;
                this.L$5 = it;
                this.L$9 = collection3;
                this.Z$0 = z2;
                this.I$0 = i2;
                this.I$1 = i;
                this.label = 1;
                RealTransferManager realTransferManager = (RealTransferManager) transferManager;
                Analytics analytics = realTransferManager.analytics;
                TransactionType transactionType = transferType == TransferType.ADD_CASH ? TransactionType.CASH_IN : TransactionType.CASH_OUT;
                String str = copy$default.external_id;
                str.getClass();
                RequestContext requestContext2 = copy$default.request_context;
                if (requestContext2 == null || (retryContext = requestContext2.retry_context) == null || (l = retryContext.retry_attempt) == null) {
                    i5 = i2;
                    transferFundsRequest = copy$default;
                    num = null;
                } else {
                    i5 = i2;
                    transferFundsRequest = copy$default;
                    num = new Integer((int) l.longValue());
                }
                OfflineTransactionRetry offlineTransactionRetry = new OfflineTransactionRetry(transactionType, str, num);
                obj2 = null;
                analytics.track(offlineTransactionRetry, null);
                withContext = JobKt.withContext(realTransferManager.ioDispatcher, new RealPayDataLoader$fetchData$1(realTransferManager, transferFundsRequest, transferType, z3, (Continuation) null), this);
                if (withContext == coroutineSingletons) {
                    return coroutineSingletons;
                }
                z = z2;
                collection2 = collection;
                collection.add((TransferManager.TransferFundsResult) withContext);
                collection = collection2;
                i2 = i5;
                if (it.hasNext()) {
                    return new StartedLazily$command$$inlined$unsafeFlow$1((List) collection, 3);
                }
            }
        }
    }
}
