package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class stt0 {
    public final a9u0 a;
    public final a9u0 b;

    public stt0(a9u0 a9u0Var, a9u0 a9u0Var2) {
        this.a = a9u0Var;
        this.b = a9u0Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof stt0)) {
            return false;
        }
        stt0 stt0Var = (stt0) obj;
        return this.a.equals(stt0Var.a) && this.b.equals(stt0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "PaymentStatusScreen(pending=" + this.a + ", timeout=" + this.b + Extension.C_BRAKE;
    }
}
