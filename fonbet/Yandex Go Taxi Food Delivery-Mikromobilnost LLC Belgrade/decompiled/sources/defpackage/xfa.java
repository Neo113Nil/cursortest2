package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class xfa {
    public final String a;
    public final iga b;

    public xfa(String str, iga igaVar) {
        this.a = str;
        this.b = igaVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xfa)) {
            return false;
        }
        xfa xfaVar = (xfa) obj;
        return jl40.l(this.a, xfaVar.a) && jl40.l(this.b, xfaVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ChargersPassesCancelConfirmationPayload(passId=" + this.a + ", details=" + this.b + Extension.C_BRAKE;
    }
}
