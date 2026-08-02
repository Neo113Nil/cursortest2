package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class vmb implements cnb {
    public final r1a0 a;
    public final akb b;

    public vmb(r1a0 r1a0Var, akb akbVar) {
        this.a = r1a0Var;
        this.b = akbVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vmb)) {
            return false;
        }
        vmb vmbVar = (vmb) obj;
        return jl40.l(this.a, vmbVar.a) && this.b.equals(vmbVar.b);
    }

    @Override // defpackage.cnb
    public final snb getAnalytics() {
        return this.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "PaymentWidgetReloadError(context=" + this.a + ", analytics=" + this.b + Extension.C_BRAKE;
    }
}
