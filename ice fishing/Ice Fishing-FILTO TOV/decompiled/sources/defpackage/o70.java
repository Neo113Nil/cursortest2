package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class o70 {
    public final iw0 GWasM1elztuh;
    public final hg0 X1lG3V04pd;
    public final r70 Yi7zF1RB1;

    public o70(iw0 iw0Var, r70 r70Var) {
        this.GWasM1elztuh = iw0Var;
        this.Yi7zF1RB1 = r70Var;
        long[] jArr = kx0.GWasM1elztuh;
        this.X1lG3V04pd = new hg0();
    }

    public final lv GWasM1elztuh(int i, Object obj, Object obj2) {
        hg0 hg0Var = this.X1lG3V04pd;
        n70 n70Var = (n70) hg0Var.AvO7iQsrTN(obj);
        int i2 = 8;
        if (n70Var != null && n70Var.X1lG3V04pd == i && o30.rQPn8YBR(n70Var.Yi7zF1RB1, obj2)) {
            jd jdVar = n70Var.xqGvceK5x;
            if (jdVar != null) {
                return jdVar;
            }
            jd jdVar2 = new jd(818252804, true, new t7(i2, n70Var.OOA6hdeuvCS, n70Var));
            n70Var.xqGvceK5x = jdVar2;
            return jdVar2;
        }
        n70 n70Var2 = new n70(this, i, obj, obj2);
        hg0Var.XnEVoBF0td1l(obj, n70Var2);
        jd jdVar3 = n70Var2.xqGvceK5x;
        if (jdVar3 != null) {
            return jdVar3;
        }
        jd jdVar4 = new jd(818252804, true, new t7(i2, this, n70Var2));
        n70Var2.xqGvceK5x = jdVar4;
        return jdVar4;
    }

    public final Object Yi7zF1RB1(Object obj) {
        if (obj != null) {
            n70 n70Var = (n70) this.X1lG3V04pd.AvO7iQsrTN(obj);
            if (n70Var != null) {
                return n70Var.Yi7zF1RB1;
            }
            k80 k80Var = (k80) this.Yi7zF1RB1.GWasM1elztuh();
            int Yi7zF1RB1 = k80Var.xqGvceK5x.Yi7zF1RB1(obj);
            if (Yi7zF1RB1 != -1) {
                k80Var.Yi7zF1RB1(Yi7zF1RB1);
            }
        }
        return null;
    }
}
