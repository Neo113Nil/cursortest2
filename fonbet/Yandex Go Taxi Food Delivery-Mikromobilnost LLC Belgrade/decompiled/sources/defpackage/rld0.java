package defpackage;

/* loaded from: classes2.dex */
public final class rld0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final db90 g;

    public rld0(String str, String str2, String str3, String str4, String str5, String str6, db90 db90Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = db90Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rld0)) {
            return false;
        }
        rld0 rld0Var = (rld0) obj;
        return this.a.equals(rld0Var.a) && this.b.equals(rld0Var.b) && jl40.l(this.c, rld0Var.c) && jl40.l(this.d, rld0Var.d) && jl40.l(this.e, rld0Var.e) && jl40.l(this.f, rld0Var.f) && jl40.l(this.g, rld0Var.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + unr0.b(unr0.b(unr0.b(unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f);
    }

    public final String toString() {
        return "Loaded(configId=" + this.a + ", configName=" + this.b + ", sectionId=" + this.c + ", sectionName=" + this.d + ", shortcutId=" + this.e + ", shortcutName=" + this.f + ", childParams=" + this.g + ')';
    }
}
