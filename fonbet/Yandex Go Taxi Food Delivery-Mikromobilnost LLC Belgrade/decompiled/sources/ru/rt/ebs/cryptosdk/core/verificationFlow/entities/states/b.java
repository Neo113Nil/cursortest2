package ru.rt.ebs.cryptosdk.core.verificationFlow.entities.states;

import defpackage.m3b1;
import defpackage.tje;
import defpackage.vob1;
import ru.rt.ebs.cryptosdk.core.verification.ebs.controllers.IEbsController;
import ru.rt.ebs.cryptosdk.core.verificationFlow.controllers.IVerificationSessionController;
import ru.rt.ebs.cryptosdk.core.verificationFlow.entities.models.EMPTY;
import ru.rt.ebs.cryptosdk.core.verificationFlow.entities.models.IVerificationFlow;
import ru.rt.ebs.cryptosdk.core.verificationFlow.entities.models.IVerificationRouter;

/* loaded from: classes4.dex */
public final class b extends a {
    public final IVerificationSessionController f;
    public final IEbsController g;

    public b(IEbsController iEbsController, IVerificationSessionController iVerificationSessionController, IVerificationFlow iVerificationFlow, IVerificationRouter iVerificationRouter) {
        super(iVerificationFlow, iVerificationRouter);
        this.f = iVerificationSessionController;
        this.g = iEbsController;
    }

    @Override // ru.rt.ebs.cryptosdk.core.verificationFlow.entities.states.a
    public final void i(Object obj) {
        Exception exc = obj instanceof Exception ? (Exception) obj : null;
        if (exc != null && vob1.b(exc)) {
            tje.N(m3b1.c(this), null, null, new CancelVerificationFlowState$tryToClearBioSamples$1(this, new CancelVerificationFlowState$onStart$1(0, this, b.class, "cancelVerification", "cancelVerification()V", 0), null), 3);
            return;
        }
        try {
            this.f.cancelVerification();
            d(EMPTY.INSTANCE);
        } catch (Exception e) {
            c(e);
        }
    }
}
