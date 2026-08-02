package com.squareup.cash.instruments.backend.real;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes7.dex */
public final class RealInstrumentManager$unlink$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RealInstrumentManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealInstrumentManager$unlink$1(RealInstrumentManager realInstrumentManager, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = realInstrumentManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.unlink(null, null, this);
    }
}
