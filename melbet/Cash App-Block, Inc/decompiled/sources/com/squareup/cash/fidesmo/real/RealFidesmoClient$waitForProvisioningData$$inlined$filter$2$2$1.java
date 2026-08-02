package com.squareup.cash.fidesmo.real;

import com.squareup.cash.fidesmo.real.RealFidesmoClient$getActivationData$$inlined$filter$1;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class RealFidesmoClient$waitForProvisioningData$$inlined$filter$2$2$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RealFidesmoClient$getActivationData$$inlined$filter$1.AnonymousClass2 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealFidesmoClient$waitForProvisioningData$$inlined$filter$2$2$1(RealFidesmoClient$getActivationData$$inlined$filter$1.AnonymousClass2 anonymousClass2, Continuation continuation) {
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
