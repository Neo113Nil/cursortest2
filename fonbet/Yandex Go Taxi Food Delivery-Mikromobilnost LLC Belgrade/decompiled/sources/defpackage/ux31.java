package defpackage;

/* loaded from: classes6.dex */
public final class ux31 {
    public final int a;
    public final int b;

    public ux31(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ux31.class.equals(obj.getClass())) {
            ux31 ux31Var = (ux31) obj;
            if (this.a == ux31Var.a && this.b == ux31Var.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.b * 31) + (this.a * 31);
    }
}
