package defpackage;

/* loaded from: classes10.dex */
public final class zsy0 {
    public final String a;
    public String b;
    public boolean c = false;
    public fc90 d = null;

    public zsy0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zsy0)) {
            return false;
        }
        zsy0 zsy0Var = (zsy0) obj;
        return jl40.l(this.a, zsy0Var.a) && jl40.l(this.b, zsy0Var.b) && this.c == zsy0Var.c && jl40.l(this.d, zsy0Var.d);
    }

    public final int hashCode() {
        int e = unr0.e(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        fc90 fc90Var = this.d;
        return e + (fc90Var == null ? 0 : fc90Var.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextSubstitution(layoutCache=");
        sb.append(this.d);
        sb.append(", isShowingSubstitution=");
        return unr0.u(sb, this.c, ')');
    }
}
