package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class r421 implements uhx0, e6v, lhx0 {
    public final String a;
    public final q421 b;
    public final boolean c;
    public final String d;
    public final String e;

    public r421(String str, q421 q421Var, boolean z, String str2) {
        this.a = str;
        this.b = q421Var;
        this.c = z;
        this.d = str2;
        this.e = v891.l(q421Var.a, q421Var.b);
    }

    @Override // defpackage.lhx0
    public final String b() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r421)) {
            return false;
        }
        r421 r421Var = (r421) obj;
        return this.a.equals(r421Var.a) && this.b.equals(r421Var.b) && this.c == r421Var.c && this.d.equals(r421Var.d);
    }

    @Override // defpackage.e6v
    public final String getId() {
        return this.e;
    }

    public final int hashCode() {
        return this.d.hashCode() + unr0.e((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UnsupportedRequirement(title=");
        sb.append((Object) this.a);
        sb.append(", data=");
        sb.append(this.b);
        sb.append(", hasTopDivider=");
        return n.m(", contentDescription=", this.d, Extension.C_BRAKE, sb, this.c);
    }
}
