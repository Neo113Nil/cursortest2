package ru.rt.ebs.cryptosdk.core.verificationFlow.entities.states;

import defpackage.m3b1;
import defpackage.tje;
import ru.rt.ebs.cryptosdk.core.metadata.controllers.IMetadataController;
import ru.rt.ebs.cryptosdk.core.verificationFlow.entities.models.IVerificationFlow;
import ru.rt.ebs.cryptosdk.core.verificationFlow.entities.models.IVerificationRouter;

/* loaded from: classes4.dex */
public final class f extends a {
    public final IMetadataController f;

    public f(IVerificationFlow iVerificationFlow, IVerificationRouter iVerificationRouter, IMetadataController iMetadataController) {
        super(iVerificationFlow, iVerificationRouter);
        this.f = iMetadataController;
    }

    @Override // ru.rt.ebs.cryptosdk.core.verificationFlow.entities.states.a
    public final void i(Object obj) {
        tje.N(m3b1.c(this), null, null, new FinishVerificationFlowState$onStart$1(this, null), 3);
        this.f.stopLocationTracker();
        this.a.closeVerification();
    }
}
