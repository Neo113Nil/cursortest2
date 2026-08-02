package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class sk40 {
    public final su30 a;
    public final fk40 b;

    public sk40(su30 su30Var, fk40 fk40Var) {
        this.a = su30Var;
        this.b = fk40Var;
    }

    public static sk40 a(sk40 sk40Var, fk40 fk40Var) {
        su30 su30Var = sk40Var.a;
        sk40Var.getClass();
        return new sk40(su30Var, fk40Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sk40)) {
            return false;
        }
        sk40 sk40Var = (sk40) obj;
        return this.a.equals(sk40Var.a) && this.b.equals(sk40Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "MtViewOnMapState(route=" + this.a + ", mode=" + this.b + Extension.C_BRAKE;
    }
}
