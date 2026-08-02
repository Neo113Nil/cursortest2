package com.squareup.cash.family.familyhub.backend.real;

import com.squareup.cash.family.familyhub.backend.api.DependentControlStatus;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class RealDependentControlStatusManager$setDependentControlStatus$1 extends ContinuationImpl {
    public DependentControlStatus.Loaded L$0;
    public boolean Z$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RealDependentControlStatusManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealDependentControlStatusManager$setDependentControlStatus$1(RealDependentControlStatusManager realDependentControlStatusManager, Continuation continuation) {
        super(continuation);
        this.this$0 = realDependentControlStatusManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.setDependentControlStatus(false, this);
    }
}
