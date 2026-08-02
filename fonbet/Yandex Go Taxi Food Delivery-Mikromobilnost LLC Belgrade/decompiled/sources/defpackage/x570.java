package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class x570 extends mr {
    public final ejv a;
    public final hh31 b;

    public x570(ejv ejvVar, hh31 hh31Var) {
        this.a = ejvVar;
        this.b = hh31Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof x570) {
            x570 x570Var = (x570) obj;
            return this.a.equals(x570Var.a) && this.b == x570Var.b;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "OpenInAppCall(inAppCallScreenParams=" + this.a + ", onDefaultCall=" + this.b + Extension.C_BRAKE;
    }
}
