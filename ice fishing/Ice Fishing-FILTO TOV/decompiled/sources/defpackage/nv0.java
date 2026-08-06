package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class nv0 implements w00 {
    public final boolean GWasM1elztuh;
    public final long X1lG3V04pd;
    public final float Yi7zF1RB1;

    public nv0(float f, long j, boolean z) {
        this.GWasM1elztuh = z;
        this.Yi7zF1RB1 = f;
        this.X1lG3V04pd = j;
    }

    @Override // defpackage.w00
    public final xk GWasM1elztuh(tf0 tf0Var) {
        return new al(tf0Var, this.GWasM1elztuh, this.Yi7zF1RB1, new j6IIN2O8eOU(25, this));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nv0)) {
            return false;
        }
        nv0 nv0Var = (nv0) obj;
        if (this.GWasM1elztuh == nv0Var.GWasM1elztuh && cn.Yi7zF1RB1(this.Yi7zF1RB1, nv0Var.Yi7zF1RB1)) {
            return yb.X1lG3V04pd(this.X1lG3V04pd, nv0Var.X1lG3V04pd);
        }
        return false;
    }

    @Override // defpackage.w00
    public final int hashCode() {
        int GWasM1elztuh = mr0.GWasM1elztuh(this.Yi7zF1RB1, Boolean.hashCode(this.GWasM1elztuh) * 31, 961);
        int i = yb.encWxUiV2;
        return Long.hashCode(this.X1lG3V04pd) + GWasM1elztuh;
    }
}
