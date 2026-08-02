package defpackage;

/* loaded from: classes3.dex */
public final class at3 {
    public final int a;
    public final boolean b;
    public final String c;
    public final boolean d;

    public at3(String str, boolean z, boolean z2, int i) {
        this.a = i;
        this.b = z;
        this.c = str;
        this.d = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof at3)) {
            return false;
        }
        at3 at3Var = (at3) obj;
        return this.a == at3Var.a && this.b == at3Var.b && this.c.equals(at3Var.c) && this.d == at3Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + k5r.c(k5r.e(Integer.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return "CallerInfo(uid=" + this.a + ", isVerified=" + this.b + ", reason=" + this.c + ", isSuggestedSection=" + this.d + ")";
    }
}
