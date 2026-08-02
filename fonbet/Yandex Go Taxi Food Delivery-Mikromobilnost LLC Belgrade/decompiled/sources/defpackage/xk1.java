package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class xk1 {
    public final hni0 a;
    public final wjq0 b;

    public xk1(hni0 hni0Var, wjq0 wjq0Var) {
        this.a = hni0Var;
        this.b = wjq0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xk1)) {
            return false;
        }
        xk1 xk1Var = (xk1) obj;
        return this.a.equals(xk1Var.a) && this.b.equals(xk1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "AgreementPrerequisites(referenceToButton=" + this.a + ", subject=" + this.b + Extension.C_BRAKE;
    }
}
