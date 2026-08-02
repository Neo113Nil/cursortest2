package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes7.dex */
public final class t071 {
    public final b471 a;
    public final b471 b;

    public t071(b471 b471Var, b471 b471Var2) {
        this.a = b471Var;
        this.b = b471Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t071)) {
            return false;
        }
        t071 t071Var = (t071) obj;
        return this.a.equals(t071Var.a) && this.b.equals(t071Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "MeasuredSize(width=" + this.a + ", height=" + this.b + Extension.C_BRAKE;
    }
}
