package ru.rt.ebs.cryptosdk.core.verificationFlow.entities.states;

import defpackage.evu0;
import defpackage.jl40;
import defpackage.ny61;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.rt.ebs.cryptosdk.core.verification.adapter.entities.exceptions.AuthSetCookieIncorrectValueAdapterVerificationEbsException;
import ru.rt.ebs.cryptosdk.core.verification.ebs.controllers.IEbsController;
import ru.rt.ebs.cryptosdk.core.verificationFlow.controllers.IVerificationSessionController;
import ru.rt.ebs.cryptosdk.core.verificationFlow.entities.models.IVerificationFlow;
import ru.rt.ebs.cryptosdk.core.verificationFlow.entities.models.IVerificationRouter;
import ru.rt.ebs.cryptosdk.core.verificationFlow.entities.models.VerificationRequestScheme;

/* loaded from: classes4.dex */
public final class g extends a {
    public final IEbsController f;
    public final IVerificationSessionController g;

    public g(IEbsController iEbsController, IVerificationSessionController iVerificationSessionController, IVerificationFlow iVerificationFlow, IVerificationRouter iVerificationRouter) {
        super(iVerificationFlow, iVerificationRouter);
        this.f = iEbsController;
        this.g = iVerificationSessionController;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // ru.rt.ebs.cryptosdk.core.verificationFlow.entities.states.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(Object obj, Continuation continuation) {
        InitVerificationFlowState$onProcess$1 initVerificationFlowState$onProcess$1;
        int i;
        if (continuation instanceof InitVerificationFlowState$onProcess$1) {
            initVerificationFlowState$onProcess$1 = (InitVerificationFlowState$onProcess$1) continuation;
            int i2 = initVerificationFlowState$onProcess$1.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                initVerificationFlowState$onProcess$1.d = i2 - Integer.MIN_VALUE;
                Object obj2 = initVerificationFlowState$onProcess$1.b;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = initVerificationFlowState$onProcess$1.d;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    VerificationRequestScheme verificationRequestScheme = this.g.getVerificationRequestScheme();
                    VerificationRequestScheme.WithoutEsia withoutEsia = verificationRequestScheme instanceof VerificationRequestScheme.WithoutEsia ? (VerificationRequestScheme.WithoutEsia) verificationRequestScheme : null;
                    if (withoutEsia != null && (evu0.J(withoutEsia.getSetCookieAdapterValue()) || jl40.l(withoutEsia.getSetCookieAdapterValue(), withoutEsia.getSid().getValue()))) {
                        throw new AuthSetCookieIncorrectValueAdapterVerificationEbsException();
                    }
                    initVerificationFlowState$onProcess$1.a = this;
                    initVerificationFlowState$onProcess$1.d = 1;
                    if (this.f.initVerification(initVerificationFlowState$onProcess$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    this = initVerificationFlowState$onProcess$1.a;
                    kotlin.b.b(obj2);
                }
                IEbsController iEbsController = this.f;
                IVerificationSessionController iVerificationSessionController = this.g;
                iEbsController.initVerificationHost(iVerificationSessionController.getEbsLocation(), iVerificationSessionController.getVerificationRequestScheme().getEbsPort(), iVerificationSessionController.getVerificationRequestScheme().getIsAppendEbsPort());
                return zy11.a;
            }
        }
        initVerificationFlowState$onProcess$1 = new InitVerificationFlowState$onProcess$1(this, (ContinuationImpl) continuation);
        Object obj22 = initVerificationFlowState$onProcess$1.b;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = initVerificationFlowState$onProcess$1.d;
        if (i != 0) {
        }
        IEbsController iEbsController2 = this.f;
        IVerificationSessionController iVerificationSessionController2 = this.g;
        iEbsController2.initVerificationHost(iVerificationSessionController2.getEbsLocation(), iVerificationSessionController2.getVerificationRequestScheme().getEbsPort(), iVerificationSessionController2.getVerificationRequestScheme().getIsAppendEbsPort());
        return zy11.a;
    }

    @Override // ru.rt.ebs.cryptosdk.core.verificationFlow.entities.states.a
    public final void i(Object obj) {
        b();
    }
}
