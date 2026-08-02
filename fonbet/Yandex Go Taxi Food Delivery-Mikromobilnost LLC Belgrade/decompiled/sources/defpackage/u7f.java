package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class u7f extends udf0 {
    public final String c;
    public final a37 d;
    public final boolean e;
    public final hhg f;

    public u7f(String str, a37 a37Var, boolean z, hhg hhgVar) {
        this.c = str;
        this.d = a37Var;
        this.e = z;
        this.f = hhgVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u7f)) {
            return false;
        }
        u7f u7fVar = (u7f) obj;
        return jl40.l(this.c, u7fVar.c) && this.d.equals(u7fVar.d) && this.e == u7fVar.e && jl40.l(this.f, u7fVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + unr0.e((this.d.hashCode() + (this.c.hashCode() * 31)) * 31, 31, this.e);
    }

    public final String toString() {
        return "CreateProfileState(title=" + this.c + ", button=" + this.d + ", isEnabled=" + this.e + ", actionModel=" + this.f + Extension.C_BRAKE;
    }
}
