package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes10.dex */
public final class v580 {
    public final ex70 a;
    public final w580 b;

    public v580(ex70 ex70Var, w580 w580Var) {
        this.a = ex70Var;
        this.b = w580Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v580)) {
            return false;
        }
        v580 v580Var = (v580) obj;
        return this.a.equals(v580Var.a) && this.b.equals(v580Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "OrderSelectSettings(header=" + this.a + ", selectorOverrides=" + this.b + Extension.C_BRAKE;
    }
}
