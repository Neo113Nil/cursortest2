package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.rt.ebs.cryptosdk.core.initialization.controllers.IInitializationController;
import ru.rt.ebs.cryptosdk.core.verificationFlow.entities.models.IVerificationFlow;
import ru.rt.ebs.cryptosdk.core.verificationFlow.entities.models.IVerificationRouter;
import ru.rt.ebs.cryptosdk.core.verificationFlow.entities.states.a;

/* loaded from: classes4.dex */
public final class r721 extends a {
    public final IInitializationController f;

    public r721(IVerificationFlow iVerificationFlow, IVerificationRouter iVerificationRouter, IInitializationController iInitializationController) {
        super(iVerificationFlow, iVerificationRouter);
        this.f = iInitializationController;
    }

    @Override // ru.rt.ebs.cryptosdk.core.verificationFlow.entities.states.a
    public final Object h(Object obj, Continuation continuation) {
        Object updateRegistration = this.f.updateRegistration(continuation);
        return updateRegistration == CoroutineSingletons.COROUTINE_SUSPENDED ? updateRegistration : zy11.a;
    }

    @Override // ru.rt.ebs.cryptosdk.core.verificationFlow.entities.states.a
    public final void i(Object obj) {
        this.a.gotoProcessing();
    }
}
