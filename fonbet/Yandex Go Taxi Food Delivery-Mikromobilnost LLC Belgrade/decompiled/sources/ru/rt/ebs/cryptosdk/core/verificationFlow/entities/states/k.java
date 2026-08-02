package ru.rt.ebs.cryptosdk.core.verificationFlow.entities.states;

import defpackage.m3b1;
import defpackage.tje;
import defpackage.zy11;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class k extends a {
    @Override // ru.rt.ebs.cryptosdk.core.verificationFlow.entities.states.a
    public final Object h(Object obj, Continuation continuation) {
        return zy11.a;
    }

    @Override // ru.rt.ebs.cryptosdk.core.verificationFlow.entities.states.a
    public final void i(Object obj) {
        tje.N(m3b1.c(this), null, null, new SuccessfulVerificationFlowState$onStart$1(this, null), 3);
    }
}
