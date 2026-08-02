package com.squareup.cash.instruments.backend.real;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class RealInstrumentVerifier$verify$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RealInstrumentVerifier this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealInstrumentVerifier$verify$1(RealInstrumentVerifier realInstrumentVerifier, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = realInstrumentVerifier;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.verify(null, this);
    }
}
