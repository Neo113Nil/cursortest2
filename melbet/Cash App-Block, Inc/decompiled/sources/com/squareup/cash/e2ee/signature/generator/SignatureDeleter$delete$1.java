package com.squareup.cash.e2ee.signature.generator;

import com.squareup.cash.e2ee.signature.Signature;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes.dex */
public final class SignatureDeleter$delete$1 extends ContinuationImpl {
    public Signature L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ SignatureDeleter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SignatureDeleter$delete$1(SignatureDeleter signatureDeleter, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = signatureDeleter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.delete(this);
    }
}
