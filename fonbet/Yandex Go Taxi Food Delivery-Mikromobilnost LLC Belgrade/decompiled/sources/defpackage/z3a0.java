package defpackage;

/* loaded from: classes2.dex */
public final class z3a0 {
    public final String a;
    public final String b;
    public final String c;

    public z3a0(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z3a0)) {
            return false;
        }
        z3a0 z3a0Var = (z3a0) obj;
        return this.a.equals(z3a0Var.a) && this.b.equals(z3a0Var.b) && this.c.equals(z3a0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DarkTheme(backgroundColor=");
        sb.append(this.a);
        sb.append(", iconUrl=");
        sb.append(this.b);
        sb.append(", textColor=");
        return b64.p(sb, this.c, ')');
    }
}
