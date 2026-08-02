package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class r3z0 extends w3z0 {
    public final u2z0 a;
    public final u2z0 b;
    public final String c;
    public final String d;
    public final wp2 e;
    public final List f;

    public r3z0(u2z0 u2z0Var, u2z0 u2z0Var2, String str, String str2, wp2 wp2Var, List list) {
        this.a = u2z0Var;
        this.b = u2z0Var2;
        this.c = str;
        this.d = str2;
        this.e = wp2Var;
        this.f = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r3z0)) {
            return false;
        }
        r3z0 r3z0Var = (r3z0) obj;
        return this.a.equals(r3z0Var.a) && this.b.equals(r3z0Var.b) && this.c.equals(r3z0Var.c) && this.d.equals(r3z0Var.d) && jl40.l(this.e, r3z0Var.e) && jl40.l(this.f, r3z0Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + n.b(this.e, unr0.b(unr0.b((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31, this.d), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClipboardCopy(title=");
        sb.append(this.a);
        sb.append(", inactiveTitle=");
        sb.append(this.b);
        sb.append(", subtitle=");
        g8e.D(sb, this.c, ", textToCopy=", this.d, ", buttonColor=");
        sb.append(this.e);
        sb.append(", extraActions=");
        sb.append(this.f);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }
}
