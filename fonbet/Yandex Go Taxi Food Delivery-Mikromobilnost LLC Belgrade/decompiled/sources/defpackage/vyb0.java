package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class vyb0 extends xyb0 {
    public final String a;
    public final uyb0 b;
    public final uyb0 c;
    public final t1a1 d;
    public final String e;

    public vyb0(String str, uyb0 uyb0Var, uyb0 uyb0Var2, t1a1 t1a1Var, String str2) {
        this.a = str;
        this.b = uyb0Var;
        this.c = uyb0Var2;
        this.d = t1a1Var;
        this.e = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof vyb0) {
            vyb0 vyb0Var = (vyb0) obj;
            if (jl40.l(this.a, vyb0Var.a) && this.b == vyb0Var.b && this.c == vyb0Var.c && this.d.equals(vyb0Var.d) && jl40.l(this.e, vyb0Var.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NeedConfirmation(title=");
        sb.append(this.a);
        sb.append(", acceptAction=");
        sb.append(this.b);
        sb.append(", declineAction=");
        sb.append(this.c);
        sb.append(", confirmationType=");
        sb.append(this.d);
        sb.append(", reason=");
        return oyr.t(sb, this.e, Extension.C_BRAKE);
    }
}
