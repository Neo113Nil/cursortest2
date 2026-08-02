package com.squareup.cash.observability.backend.real;

import com.squareup.cash.observability.backend.real.ObservabilitySetupTeardown$special$$inlined$map$3;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes.dex */
public final class ObservabilitySetupTeardown$special$$inlined$map$4$2$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ ObservabilitySetupTeardown$special$$inlined$map$3.AnonymousClass2 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ObservabilitySetupTeardown$special$$inlined$map$4$2$1(ObservabilitySetupTeardown$special$$inlined$map$3.AnonymousClass2 anonymousClass2, Continuation continuation) {
        super(continuation);
        this.this$0 = anonymousClass2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.emit(null, this);
    }
}
