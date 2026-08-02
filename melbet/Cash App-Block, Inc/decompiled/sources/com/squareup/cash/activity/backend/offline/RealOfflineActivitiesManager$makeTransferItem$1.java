package com.squareup.cash.activity.backend.offline;

import com.squareup.protos.franklin.common.TransferFundsRequest;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes5.dex */
public final class RealOfflineActivitiesManager$makeTransferItem$1 extends ContinuationImpl {
    public TransferFundsRequest L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RealOfflineActivitiesManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealOfflineActivitiesManager$makeTransferItem$1(RealOfflineActivitiesManager realOfflineActivitiesManager, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = realOfflineActivitiesManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return RealOfflineActivitiesManager.access$makeTransferItem(this.this$0, null, null, this);
    }
}
