package defpackage;

/* loaded from: classes.dex */
public final class s5f0 {
    public final String a;
    public final int b;
    public final int c;
    public final boolean d;

    public s5f0(String str, int i, int i2, boolean z) {
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s5f0)) {
            return false;
        }
        s5f0 s5f0Var = (s5f0) obj;
        return this.a.equals(s5f0Var.a) && this.b == s5f0Var.b && this.c == s5f0Var.c && this.d == s5f0Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + oyr.b(this.c, oyr.b(this.b, this.a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProcessDetails(processName=");
        sb.append(this.a);
        sb.append(", pid=");
        sb.append(this.b);
        sb.append(", importance=");
        sb.append(this.c);
        sb.append(", isDefaultProcess=");
        return unr0.u(sb, this.d, ')');
    }
}
