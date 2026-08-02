package defpackage;

/* loaded from: classes2.dex */
public final class tjc0 {
    public final String a;
    public final hqc0 b;

    public tjc0(String str, hqc0 hqc0Var) {
        this.a = str;
        this.b = hqc0Var;
    }

    public final hqc0 a() {
        return this.b;
    }

    public final String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tjc0)) {
            return false;
        }
        tjc0 tjc0Var = (tjc0) obj;
        return this.a.equals(tjc0Var.a) && this.b.equals(tjc0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Radial(__typename=" + this.a + ", plaqueRadialGradient=" + this.b + ')';
    }
}
