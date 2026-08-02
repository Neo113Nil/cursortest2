package ru.rt.ebs.cryptosdk.core.verificationFlow.entities.states;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@mvg(c = "ru.rt.ebs.cryptosdk.core.verificationFlow.entities.states.RetryingInitVerificationFlowState", f = "RetryingInitVerificationFlowState.kt", l = {35}, m = "onProcess")
/* loaded from: classes4.dex */
final class RetryingInitVerificationFlowState$onProcess$1 extends ContinuationImpl {
    public j a;
    public /* synthetic */ Object b;
    public final /* synthetic */ j c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RetryingInitVerificationFlowState$onProcess$1(j jVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.c = jVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.h(null, this);
    }
}
