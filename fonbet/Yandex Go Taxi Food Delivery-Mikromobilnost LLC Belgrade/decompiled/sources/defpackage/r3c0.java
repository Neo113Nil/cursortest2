package defpackage;

/* loaded from: classes10.dex */
public final class r3c0 {
    public final long a;
    public final long b;
    public final int c;

    public r3c0(int i, long j, long j2) {
        this.a = j;
        this.b = j2;
        this.c = i;
        tty0[] tty0VarArr = sty0.b;
        if ((j & 1095216660480L) == 0) {
            jxv.a("width cannot be TextUnit.Unspecified");
        }
        if ((1095216660480L & j2) == 0) {
            jxv.a("height cannot be TextUnit.Unspecified");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r3c0)) {
            return false;
        }
        r3c0 r3c0Var = (r3c0) obj;
        return sty0.a(this.a, r3c0Var.a) && sty0.a(this.b, r3c0Var.b) && this.c == r3c0Var.c;
    }

    public final int hashCode() {
        tty0[] tty0VarArr = sty0.b;
        return Integer.hashCode(this.c) + qv10.c(Long.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Placeholder(width=");
        sb.append((Object) sty0.e(this.a));
        sb.append(", height=");
        sb.append((Object) sty0.e(this.b));
        sb.append(", placeholderVerticalAlign=");
        int i = this.c;
        sb.append((Object) (i == 1 ? "AboveBaseline" : i == 2 ? "Top" : i == 3 ? "Bottom" : i == 4 ? "Center" : i == 5 ? "TextTop" : i == 6 ? "TextBottom" : i == 7 ? "TextCenter" : "Invalid"));
        sb.append(')');
        return sb.toString();
    }
}
