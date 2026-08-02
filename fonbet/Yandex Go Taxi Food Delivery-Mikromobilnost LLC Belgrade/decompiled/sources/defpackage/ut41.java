package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.rt.ebs.cryptosdk.core.verification.esia.controllers.IEsiaController;
import ru.rt.ebs.cryptosdk.core.verification.esia.system.IEsiaAuthWebClientListener;

/* loaded from: classes4.dex */
public final class ut41 extends jm91 {
    public final IEsiaAuthWebClientListener b;
    public final IEsiaController c;

    public ut41(IEsiaAuthWebClientListener iEsiaAuthWebClientListener, IEsiaController iEsiaController) {
        this.b = iEsiaAuthWebClientListener;
        this.c = iEsiaController;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ut41)) {
            return false;
        }
        ut41 ut41Var = (ut41) obj;
        return jl40.l(this.b, ut41Var.b) && jl40.l(this.c, ut41Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        return "Init(listener=" + this.b + ", esiaController=" + this.c + Extension.C_BRAKE;
    }
}
