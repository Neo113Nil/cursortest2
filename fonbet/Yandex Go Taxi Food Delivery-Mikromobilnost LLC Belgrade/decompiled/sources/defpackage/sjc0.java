package defpackage;

/* loaded from: classes2.dex */
public final class sjc0 {
    public final String a;
    public final qnc0 b;

    public sjc0(String str, qnc0 qnc0Var) {
        this.a = str;
        this.b = qnc0Var;
    }

    public final qnc0 a() {
        return this.b;
    }

    public final String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sjc0)) {
            return false;
        }
        sjc0 sjc0Var = (sjc0) obj;
        return this.a.equals(sjc0Var.a) && this.b.equals(sjc0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Linear(__typename=" + this.a + ", plaqueLinearGradient=" + this.b + ')';
    }
}
