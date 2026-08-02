package defpackage;

/* loaded from: classes2.dex */
public final class zsz0 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;

    public zsz0(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4) {
        boolean booleanValue = bool != null ? bool.booleanValue() : true;
        boolean booleanValue2 = bool2 != null ? bool2.booleanValue() : false;
        boolean booleanValue3 = bool3 != null ? bool3.booleanValue() : true;
        boolean booleanValue4 = bool4 != null ? bool4.booleanValue() : true;
        this.a = booleanValue;
        this.b = booleanValue2;
        this.c = booleanValue3;
        this.d = booleanValue4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zsz0)) {
            return false;
        }
        zsz0 zsz0Var = (zsz0) obj;
        return this.a == zsz0Var.a && this.b == zsz0Var.b && this.c == zsz0Var.c && this.d == zsz0Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + unr0.e(unr0.e(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ToolbarPresentationOptions(showToolbar=");
        sb.append(this.a);
        sb.append(", showDash=");
        sb.append(this.b);
        sb.append(", showCross=");
        sb.append(this.c);
        sb.append(", showArrow=");
        return unr0.u(sb, this.d, ')');
    }
}
