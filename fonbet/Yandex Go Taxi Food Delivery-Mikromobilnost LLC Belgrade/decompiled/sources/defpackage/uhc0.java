package defpackage;

/* loaded from: classes2.dex */
public final class uhc0 {
    public final String a;
    public final tmc0 b;
    public final wkc0 c;

    public uhc0(String str, tmc0 tmc0Var, wkc0 wkc0Var) {
        this.a = str;
        this.b = tmc0Var;
        this.c = wkc0Var;
    }

    public final wkc0 a() {
        return this.c;
    }

    public final tmc0 b() {
        return this.b;
    }

    public final String c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uhc0)) {
            return false;
        }
        uhc0 uhc0Var = (uhc0) obj;
        return jl40.l(this.a, uhc0Var.a) && jl40.l(this.b, uhc0Var.b) && jl40.l(this.c, uhc0Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        tmc0 tmc0Var = this.b;
        int hashCode2 = (hashCode + (tmc0Var == null ? 0 : tmc0Var.hashCode())) * 31;
        wkc0 wkc0Var = this.c;
        return hashCode2 + (wkc0Var != null ? wkc0Var.hashCode() : 0);
    }

    public final String toString() {
        return "Notification(__typename=" + this.a + ", plaqueIconNotification=" + this.b + ", plaqueCounterNotification=" + this.c + ')';
    }
}
