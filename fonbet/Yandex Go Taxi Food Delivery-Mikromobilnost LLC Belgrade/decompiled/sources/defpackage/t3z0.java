package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class t3z0 extends w3z0 {
    public final u2z0 a;
    public final wp2 b;
    public final boolean c;
    public final String d;
    public final List e;

    public t3z0(u2z0 u2z0Var, wp2 wp2Var, boolean z, String str, List list) {
        this.a = u2z0Var;
        this.b = wp2Var;
        this.c = z;
        this.d = str;
        this.e = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t3z0)) {
            return false;
        }
        t3z0 t3z0Var = (t3z0) obj;
        return this.a.equals(t3z0Var.a) && jl40.l(this.b, t3z0Var.b) && this.c == t3z0Var.c && jl40.l(this.d, t3z0Var.d) && jl40.l(this.e, t3z0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + unr0.b(unr0.e(n.b(this.b, this.a.hashCode() * 31, 31), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Deeplink(title=");
        sb.append(this.a);
        sb.append(", color=");
        sb.append(this.b);
        sb.append(", enabled=");
        unr0.A(", deeplink=", this.d, ", extraActions=", sb, this.c);
        return ly3.s(sb, this.e, Extension.C_BRAKE);
    }
}
