package ru.rt.ebs.cryptosdk.core.verificationFlow.entities.states;

import defpackage.m3b1;
import defpackage.tje;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.rt.ebs.cryptosdk.core.verification.adapter.controllers.IAdapterController;
import ru.rt.ebs.cryptosdk.core.verificationFlow.entities.models.IVerificationFlow;
import ru.rt.ebs.cryptosdk.core.verificationFlow.entities.models.IVerificationRouter;

/* loaded from: classes4.dex */
public final class d extends a {
    public final IAdapterController f;

    public d(IAdapterController iAdapterController, IVerificationFlow iVerificationFlow, IVerificationRouter iVerificationRouter) {
        super(iVerificationFlow, iVerificationRouter);
        this.f = iAdapterController;
    }

    @Override // ru.rt.ebs.cryptosdk.core.verificationFlow.entities.states.a
    public final void g(Exception exc) {
        c(exc);
    }

    @Override // ru.rt.ebs.cryptosdk.core.verificationFlow.entities.states.a
    public final Object h(Object obj, Continuation continuation) {
        Object finishEsiaAuthentication = this.f.finishEsiaAuthentication(continuation);
        return finishEsiaAuthentication == CoroutineSingletons.COROUTINE_SUSPENDED ? finishEsiaAuthentication : zy11.a;
    }

    @Override // ru.rt.ebs.cryptosdk.core.verificationFlow.entities.states.a
    public final void i(Object obj) {
        tje.N(m3b1.c(this), null, null, new FinishEsiaAuthVerificationFlowState$onStart$1(this, null), 3);
        b();
    }
}
