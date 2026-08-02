package defpackage;

import ru.rt.ebs.cryptosdk.core.verification.esia.entities.exceptions.AccessDeniedEsiaVerificationEbsException;
import ru.rt.ebs.cryptosdk.core.verificationFlow.entities.states.a;

/* loaded from: classes4.dex */
public final class uao extends a {
    @Override // ru.rt.ebs.cryptosdk.core.verificationFlow.entities.states.a
    public final void i(Object obj) {
        this.a.gotoAccessDeniedScreen((AccessDeniedEsiaVerificationEbsException) obj);
    }
}
