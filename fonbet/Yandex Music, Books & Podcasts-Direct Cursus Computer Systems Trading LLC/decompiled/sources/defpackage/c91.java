package defpackage;

/* loaded from: classes3.dex */
public final class c91 implements d91 {
    public final String a;
    public final String b;
    public final j81 c;
    public final thj d;

    public c91(String str, String str2, j81 j81Var) {
        this.a = str;
        this.b = str2;
        this.c = j81Var;
        this.d = new thj(pkb.Shortcut, str, 1, 1, "");
    }

    @Override // defpackage.d91
    public final thj a() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c91)) {
            return false;
        }
        c91 c91Var = (c91) obj;
        return this.a.equals(c91Var.a) && this.b.equals(c91Var.b) && this.c == c91Var.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + k5r.c(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder m = f1d.m("Success(title=", this.a, ", subtitle=", this.b, ", tab=");
        m.append(this.c);
        m.append(")");
        return m.toString();
    }
}
