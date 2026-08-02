package defpackage;

import ru.rt.ebs.cryptosdk.core.common.controllers.ICommonController;

/* loaded from: classes4.dex */
public class u6f0 implements ICommonController {
    public Exception a;

    @Override // ru.rt.ebs.cryptosdk.core.common.controllers.ICommonController
    public final void checkRoot(sls slsVar) {
        slsVar.invoke();
    }

    @Override // ru.rt.ebs.cryptosdk.core.common.controllers.ICommonController
    public final void checkVerifyIntegrity() {
        Exception exc = this.a;
        if (exc != null) {
            throw exc;
        }
    }

    @Override // ru.rt.ebs.cryptosdk.core.common.controllers.ICommonController
    public final void failVerifyIntegrity(Exception exc) {
        this.a = exc;
    }

    @Override // ru.rt.ebs.cryptosdk.core.common.controllers.ICommonController
    public final boolean isUseGost() {
        return true;
    }

    @Override // ru.rt.ebs.cryptosdk.core.common.controllers.ICommonController
    public final void verifyIntegrity(sls slsVar) {
        slsVar.invoke();
    }

    @Override // ru.rt.ebs.cryptosdk.core.common.controllers.ICommonController
    public final void verifySelfSignCertificates(sls slsVar) {
        slsVar.invoke();
    }
}
