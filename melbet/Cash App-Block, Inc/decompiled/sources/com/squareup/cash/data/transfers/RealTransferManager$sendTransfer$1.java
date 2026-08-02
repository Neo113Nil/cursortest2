package com.squareup.cash.data.transfers;

import com.squareup.cash.blockers.data.BlockersData;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class RealTransferManager$sendTransfer$1 extends ContinuationImpl {
    public long J$0;
    public long J$1;
    public BlockersData L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RealTransferManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealTransferManager$sendTransfer$1(RealTransferManager realTransferManager, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = realTransferManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.sendTransfer(null, this);
    }
}
