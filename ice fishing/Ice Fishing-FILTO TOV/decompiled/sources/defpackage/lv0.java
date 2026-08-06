package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public abstract class lv0 {
    public static final lf GWasM1elztuh = new lf(new sb9fmtV8A(28));
    public static final nv0 X1lG3V04pd;
    public static final nv0 Yi7zF1RB1;

    static {
        long j = yb.AvO7iQsrTN;
        Yi7zF1RB1 = new nv0(Float.NaN, j, true);
        X1lG3V04pd = new nv0(Float.NaN, j, false);
    }

    public static nv0 GWasM1elztuh(float f, int i) {
        boolean z = (i & 1) != 0;
        if ((i & 2) != 0) {
            f = Float.NaN;
        }
        long j = yb.AvO7iQsrTN;
        return (cn.Yi7zF1RB1(f, Float.NaN) && yb.X1lG3V04pd(j, j)) ? z ? Yi7zF1RB1 : X1lG3V04pd : new nv0(f, j, z);
    }
}
