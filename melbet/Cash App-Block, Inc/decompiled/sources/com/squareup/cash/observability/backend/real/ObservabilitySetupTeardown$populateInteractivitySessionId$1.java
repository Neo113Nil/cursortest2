package com.squareup.cash.observability.backend.real;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes.dex */
public final class ObservabilitySetupTeardown$populateInteractivitySessionId$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ ObservabilitySetupTeardown this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ObservabilitySetupTeardown$populateInteractivitySessionId$1(ObservabilitySetupTeardown observabilitySetupTeardown, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = observabilitySetupTeardown;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        ObservabilitySetupTeardown.access$populateInteractivitySessionId(this.this$0, this);
        return CoroutineSingletons.COROUTINE_SUSPENDED;
    }
}
