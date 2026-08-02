package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class qk40 {
    public final fk40 a;
    public final su30 b;

    public qk40(su30 su30Var, fk40 fk40Var) {
        this.a = fk40Var;
        this.b = su30Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qk40)) {
            return false;
        }
        qk40 qk40Var = (qk40) obj;
        return this.a.equals(qk40Var.a) && this.b.equals(qk40Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Payload(mode=" + this.a + ", route=" + this.b + Extension.C_BRAKE;
    }
}
