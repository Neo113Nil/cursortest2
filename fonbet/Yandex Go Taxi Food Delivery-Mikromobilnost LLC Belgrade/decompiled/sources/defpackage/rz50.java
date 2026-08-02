package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class rz50 {
    public final Object a;
    public final ps50 b;

    public rz50(gri griVar, ps50 ps50Var, int i) {
        griVar = (i & 1) != 0 ? null : griVar;
        ps50Var = (i & 2) != 0 ? null : ps50Var;
        this.a = griVar;
        this.b = ps50Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rz50)) {
            return false;
        }
        rz50 rz50Var = (rz50) obj;
        return jl40.l(this.a, rz50Var.a) && jl40.l(this.b, rz50Var.b);
    }

    public final int hashCode() {
        Object obj = this.a;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        ps50 ps50Var = this.b;
        return hashCode + (ps50Var != null ? ps50Var.hashCode() : 0);
    }

    public final String toString() {
        return "NetworkResult(data=" + this.a + ", networkError=" + this.b + Extension.C_BRAKE;
    }

    public rz50() {
        this(null, null, 3);
    }
}
