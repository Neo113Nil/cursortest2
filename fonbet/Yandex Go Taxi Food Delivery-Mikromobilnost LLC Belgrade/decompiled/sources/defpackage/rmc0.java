package defpackage;

/* loaded from: classes2.dex */
public final class rmc0 {
    public final String a;
    public final smc0 b;

    public rmc0(String str, smc0 smc0Var) {
        this.a = str;
        this.b = smc0Var;
    }

    public final smc0 a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rmc0)) {
            return false;
        }
        rmc0 rmc0Var = (rmc0) obj;
        return this.a.equals(rmc0Var.a) && this.b.equals(rmc0Var.b);
    }

    public final int hashCode() {
        return this.b.a.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "DisplayRules(__typename=" + this.a + ", onPlaqueNotificationDisplayRules=" + this.b + ')';
    }
}
