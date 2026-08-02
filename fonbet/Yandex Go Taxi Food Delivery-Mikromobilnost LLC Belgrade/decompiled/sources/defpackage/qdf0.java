package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class qdf0 extends tdf0 {
    public final String a;
    public final k17 b;
    public final ghg c;
    public final boolean d;

    public qdf0(String str, k17 k17Var, ghg ghgVar, boolean z) {
        this.a = str;
        this.b = k17Var;
        this.c = ghgVar;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qdf0)) {
            return false;
        }
        qdf0 qdf0Var = (qdf0) obj;
        return jl40.l(this.a, qdf0Var.a) && jl40.l(this.b, qdf0Var.b) && jl40.l(this.c, qdf0Var.c) && this.d == qdf0Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "CreateProfileModel(title=" + this.a + ", button=" + this.b + ", actionModel=" + this.c + ", isEnabled=" + this.d + Extension.C_BRAKE;
    }
}
