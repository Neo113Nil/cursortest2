package com.squareup.cash.observability.backend.real;

import com.squareup.util.Quintuple;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes.dex */
public final class ObservabilitySetupTeardown$manageDatadogLifecycle$5$emit$1 extends ContinuationImpl {
    public String L$1;
    public String L$2;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ ObservabilitySetupTeardown$manageDatadogLifecycle$5 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ObservabilitySetupTeardown$manageDatadogLifecycle$5$emit$1(ObservabilitySetupTeardown$manageDatadogLifecycle$5 observabilitySetupTeardown$manageDatadogLifecycle$5, Continuation continuation) {
        super(continuation);
        this.this$0 = observabilitySetupTeardown$manageDatadogLifecycle$5;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.emit((Quintuple) null, (Continuation) this);
    }
}
