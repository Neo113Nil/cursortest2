package defpackage;

/* loaded from: classes3.dex */
public final class gh5 {
    public final String a;
    public final String b;

    public gh5(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gh5)) {
            return false;
        }
        gh5 gh5Var = (gh5) obj;
        return this.a.equals(gh5Var.a) && this.b.equals(gh5Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return hrg.s("Color(lightTheme=", this.a, ", darkTheme=", this.b, ")");
    }
}
