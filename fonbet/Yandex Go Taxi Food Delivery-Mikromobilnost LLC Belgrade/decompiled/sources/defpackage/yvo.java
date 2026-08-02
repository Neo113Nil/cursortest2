package defpackage;

import kotlin.coroutines.Continuation;
import ru.rt.ebs.cryptosdk.core.common.entities.models.Optional;
import ru.rt.ebs.cryptosdk.core.verification.adapter.controllers.IAdapterController;
import ru.rt.ebs.cryptosdk.core.verification.adapter.entities.models.EsiaAuthenticationUrl;
import ru.rt.ebs.cryptosdk.core.verification.esia.entities.exceptions.AccessDeniedEsiaVerificationEbsException;
import ru.rt.ebs.cryptosdk.core.verificationFlow.entities.exceptions.IllegalTypeGetterVerificationFlowEbsException;
import ru.rt.ebs.cryptosdk.core.verificationFlow.entities.exceptions.IllegalTypeSetterVerificationFlowEbsException;
import ru.rt.ebs.cryptosdk.core.verificationFlow.entities.models.IVerificationFlow;
import ru.rt.ebs.cryptosdk.core.verificationFlow.entities.models.IVerificationRouter;
import ru.rt.ebs.cryptosdk.core.verificationFlow.entities.states.a;

/* loaded from: classes4.dex */
public final class yvo extends a {
    public final IAdapterController f;

    public yvo(IAdapterController iAdapterController, IVerificationFlow iVerificationFlow, IVerificationRouter iVerificationRouter) {
        super(iVerificationFlow, iVerificationRouter);
        this.f = iAdapterController;
    }

    @Override // ru.rt.ebs.cryptosdk.core.verificationFlow.entities.states.a
    public final void g(Exception exc) {
        c(exc);
    }

    @Override // ru.rt.ebs.cryptosdk.core.verificationFlow.entities.states.a, defpackage.z3v
    public final Object getValue(Class cls, Continuation continuation) {
        if (!jl40.l(cls, EsiaAuthenticationUrl.class)) {
            throw new IllegalTypeGetterVerificationFlowEbsException(this, cls.getName());
        }
        try {
            return new Optional(this.f.getExtEsiaAuthenticationUrl());
        } catch (Exception e) {
            c(e);
            Optional.Companion.getClass();
            return new Optional(null);
        }
    }

    @Override // ru.rt.ebs.cryptosdk.core.verificationFlow.entities.states.a
    public final Object h(Object obj, Continuation continuation) {
        if (obj instanceof String) {
            this.f.setExtEsiaAuthenticationRedirectUrl((String) obj);
        } else if (!(obj instanceof AccessDeniedEsiaVerificationEbsException)) {
            throw new IllegalTypeSetterVerificationFlowEbsException(this, obj.getClass().getName());
        }
        return zy11.a;
    }

    @Override // ru.rt.ebs.cryptosdk.core.verificationFlow.entities.states.a
    public final void i(Object obj) {
        this.a.gotoEsiaAuthorization(false);
    }
}
