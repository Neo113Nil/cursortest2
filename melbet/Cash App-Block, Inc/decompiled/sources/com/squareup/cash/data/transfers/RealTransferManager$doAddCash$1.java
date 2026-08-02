package com.squareup.cash.data.transfers;

import com.squareup.wire.AndroidMessage;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class RealTransferManager$doAddCash$1 extends ContinuationImpl {
    public String L$1;
    public AndroidMessage L$3;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RealTransferManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealTransferManager$doAddCash$1(RealTransferManager realTransferManager, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = realTransferManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.doAddCash(null, null, null, this);
    }
}
