package ru.rt.ebs.cryptosdk.core.verificationFlow.entities.states;

import defpackage.m3b1;
import defpackage.tje;
import ru.rt.ebs.cryptosdk.core.verificationFlow.controllers.IVerificationSessionController;
import ru.rt.ebs.cryptosdk.core.verificationFlow.entities.exceptions.IllegalTypeSetterVerificationFlowEbsException;
import ru.rt.ebs.cryptosdk.core.verificationFlow.entities.models.EMPTY;
import ru.rt.ebs.cryptosdk.core.verificationFlow.entities.models.IVerificationFlow;
import ru.rt.ebs.cryptosdk.core.verificationFlow.entities.models.IVerificationRouter;

/* loaded from: classes4.dex */
public final class c extends a {
    public final IVerificationSessionController f;

    public c(IVerificationFlow iVerificationFlow, IVerificationSessionController iVerificationSessionController, IVerificationRouter iVerificationRouter) {
        super(iVerificationFlow, iVerificationRouter);
        this.f = iVerificationSessionController;
    }

    @Override // ru.rt.ebs.cryptosdk.core.verificationFlow.entities.states.a
    public final void i(Object obj) {
        tje.N(m3b1.c(this), null, null, new ErrorVerificationFlowState$onStart$1(this, null), 3);
        try {
            if (!(obj instanceof Exception)) {
                throw new IllegalTypeSetterVerificationFlowEbsException(this, obj.getClass().getName());
            }
            this.f.errorVerification((Exception) obj);
            d(EMPTY.INSTANCE);
        } catch (Exception e) {
            c(e);
        }
    }
}
