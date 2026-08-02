package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class yi01 extends aj01 {
    public final jfb0 a;
    public final xi01 b;

    public yi01(jfb0 jfb0Var, xi01 xi01Var) {
        this.a = jfb0Var;
        this.b = xi01Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yi01)) {
            return false;
        }
        yi01 yi01Var = (yi01) obj;
        return jl40.l(this.a, yi01Var.a) && this.b.equals(yi01Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Phone(phone=" + this.a + ", kind=" + this.b + Extension.C_BRAKE;
    }
}
