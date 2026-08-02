package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes2.dex */
public final class t33 {
    public final n33 a;
    public final v33 b;

    public t33(n33 n33Var, v33 v33Var) {
        this.a = n33Var;
        this.b = v33Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t33)) {
            return false;
        }
        t33 t33Var = (t33) obj;
        return this.a.equals(t33Var.a) && this.b.equals(t33Var.b);
    }

    public final int hashCode() {
        return this.b.a.hashCode() + (this.a.a.hashCode() * 31);
    }

    public final String toString() {
        return "ArScreenConfig(boxesModel=" + this.a + ", textConfig=" + this.b + Extension.C_BRAKE;
    }
}
