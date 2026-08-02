package com.squareup.cash.e2ee.signature;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes.dex */
public final class RealSignatureManager$deleteSignature$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RealSignatureManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealSignatureManager$deleteSignature$1(RealSignatureManager realSignatureManager, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = realSignatureManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return RealSignatureManager.access$deleteSignature(this.this$0, this);
    }
}
