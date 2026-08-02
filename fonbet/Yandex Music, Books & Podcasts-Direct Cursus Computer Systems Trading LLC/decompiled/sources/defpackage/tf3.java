package defpackage;

/* loaded from: classes3.dex */
public final class tf3 {
    public final rf3 a;
    public final boolean b;
    public final boolean c;

    public tf3(rf3 rf3Var, boolean z, boolean z2) {
        rf3Var.getClass();
        this.a = rf3Var;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tf3)) {
            return false;
        }
        tf3 tf3Var = (tf3) obj;
        return this.a == tf3Var.a && this.b == tf3Var.b && this.c == tf3Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + k5r.e(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BottomTabState(bottomTab=");
        sb.append(this.a);
        sb.append(", isActive=");
        sb.append(this.b);
        sb.append(", hasNotification=");
        return ouj.r(sb, this.c, ")");
    }
}
