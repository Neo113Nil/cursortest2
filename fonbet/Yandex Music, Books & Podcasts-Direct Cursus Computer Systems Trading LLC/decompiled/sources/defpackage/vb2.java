package defpackage;

/* loaded from: classes3.dex */
public final class vb2 extends rp6 {
    public final String a;
    public final String b;

    public vb2(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof rp6)) {
            return false;
        }
        vb2 vb2Var = (vb2) ((rp6) obj);
        return this.a.equals(vb2Var.a) && this.b.equals(vb2Var.b);
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CustomAttribute{key=");
        sb.append(this.a);
        sb.append(", value=");
        return su4.o(sb, this.b, "}");
    }
}
