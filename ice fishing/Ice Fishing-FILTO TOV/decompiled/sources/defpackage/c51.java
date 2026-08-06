package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class c51 implements xr {
    public final float GWasM1elztuh;
    public final Object X1lG3V04pd;
    public final float Yi7zF1RB1;

    public c51(float f, float f2, Object obj) {
        this.GWasM1elztuh = f;
        this.Yi7zF1RB1 = f2;
        this.X1lG3V04pd = obj;
    }

    @Override // defpackage.l3
    public final td1 GWasM1elztuh(eb1 eb1Var) {
        Object obj = this.X1lG3V04pd;
        return new ha1(this.GWasM1elztuh, this.Yi7zF1RB1, obj == null ? null : (r3) eb1Var.GWasM1elztuh.mOu10nynGul(obj));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof c51) {
            c51 c51Var = (c51) obj;
            if (c51Var.GWasM1elztuh == this.GWasM1elztuh && c51Var.Yi7zF1RB1 == this.Yi7zF1RB1 && o30.rQPn8YBR(c51Var.X1lG3V04pd, this.X1lG3V04pd)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.X1lG3V04pd;
        return Float.hashCode(this.Yi7zF1RB1) + mr0.GWasM1elztuh(this.GWasM1elztuh, (obj != null ? obj.hashCode() : 0) * 31, 31);
    }
}
