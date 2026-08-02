package defpackage;

/* loaded from: classes2.dex */
public final class tmc0 {
    public final String a;
    public final rmc0 b;

    public tmc0(String str, rmc0 rmc0Var) {
        this.a = str;
        this.b = rmc0Var;
    }

    public final rmc0 a() {
        return this.b;
    }

    public final String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tmc0)) {
            return false;
        }
        tmc0 tmc0Var = (tmc0) obj;
        return this.a.equals(tmc0Var.a) && this.b.equals(tmc0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "PlaqueIconNotification(url=" + this.a + ", displayRules=" + this.b + ')';
    }
}
