package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class s3z0 extends w3z0 {
    public final u2z0 a;
    public final List b;
    public final boolean c;
    public final wp2 d;

    public s3z0(u2z0 u2z0Var, List list, boolean z, wp2 wp2Var) {
        this.a = u2z0Var;
        this.b = list;
        this.c = z;
        this.d = wp2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s3z0)) {
            return false;
        }
        s3z0 s3z0Var = (s3z0) obj;
        return this.a.equals(s3z0Var.a) && jl40.l(this.b, s3z0Var.b) && this.c == s3z0Var.c && jl40.l(this.d, s3z0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + unr0.e(unr0.c(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return "DeactivatePromo(title=" + this.a + ", extraActions=" + this.b + ", enabled=" + this.c + ", buttonColor=" + this.d + Extension.C_BRAKE;
    }
}
