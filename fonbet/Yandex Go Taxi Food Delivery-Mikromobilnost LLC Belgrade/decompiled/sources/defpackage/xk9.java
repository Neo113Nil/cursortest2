package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class xk9 {
    public final yk9 a;
    public final yk9 b;

    public xk9(yk9 yk9Var, yk9 yk9Var2) {
        this.a = yk9Var;
        this.b = yk9Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xk9)) {
            return false;
        }
        xk9 xk9Var = (xk9) obj;
        return jl40.l(this.a, xk9Var.a) && jl40.l(this.b, xk9Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Header(start=" + this.a + ", end=" + this.b + Extension.C_BRAKE;
    }
}
