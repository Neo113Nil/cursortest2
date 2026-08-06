package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class nn0 {
    public final float GWasM1elztuh;
    public final float X1lG3V04pd;
    public final float Yi7zF1RB1;
    public final float xqGvceK5x;

    public nn0(float f, float f2, float f3, float f4) {
        this.GWasM1elztuh = f;
        this.Yi7zF1RB1 = f2;
        this.X1lG3V04pd = f3;
        this.xqGvceK5x = f4;
        if (!((f >= 0.0f) & (f2 >= 0.0f) & (f3 >= 0.0f)) || !(f4 >= 0.0f)) {
            r10.GWasM1elztuh("Padding must be non-negative");
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof nn0)) {
            return false;
        }
        nn0 nn0Var = (nn0) obj;
        return cn.Yi7zF1RB1(this.GWasM1elztuh, nn0Var.GWasM1elztuh) && cn.Yi7zF1RB1(this.Yi7zF1RB1, nn0Var.Yi7zF1RB1) && cn.Yi7zF1RB1(this.X1lG3V04pd, nn0Var.X1lG3V04pd) && cn.Yi7zF1RB1(this.xqGvceK5x, nn0Var.xqGvceK5x);
    }

    public final int hashCode() {
        return Float.hashCode(this.xqGvceK5x) + mr0.GWasM1elztuh(this.X1lG3V04pd, mr0.GWasM1elztuh(this.Yi7zF1RB1, Float.hashCode(this.GWasM1elztuh) * 31, 31), 31);
    }

    public final String toString() {
        return "PaddingValues(start=" + ((Object) cn.X1lG3V04pd(this.GWasM1elztuh)) + ", top=" + ((Object) cn.X1lG3V04pd(this.Yi7zF1RB1)) + ", end=" + ((Object) cn.X1lG3V04pd(this.X1lG3V04pd)) + ", bottom=" + ((Object) cn.X1lG3V04pd(this.xqGvceK5x)) + ')';
    }
}
