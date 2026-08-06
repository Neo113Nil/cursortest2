package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class wd0 implements nx0 {
    public final WRKkgoJXwDn GWasM1elztuh;
    public final ar X1lG3V04pd;
    public final mc1 Yi7zF1RB1;

    public wd0(mc1 mc1Var, ar arVar, WRKkgoJXwDn wRKkgoJXwDn) {
        this.Yi7zF1RB1 = mc1Var;
        arVar.getClass();
        this.X1lG3V04pd = arVar;
        this.GWasM1elztuh = wRKkgoJXwDn;
    }

    @Override // defpackage.nx0
    public final boolean AvO7iQsrTN(ay ayVar, ay ayVar2) {
        this.Yi7zF1RB1.getClass();
        return ayVar.unknownFields.equals(ayVar2.unknownFields);
    }

    @Override // defpackage.nx0
    public final void EljAMC1QTz(Object obj, j6IIN2O8eOU j6iin2o8eou) {
        this.X1lG3V04pd.getClass();
        mr0.WIEu4Ya2g8(obj);
        throw null;
    }

    @Override // defpackage.nx0
    public final int GWasM1elztuh(ay ayVar) {
        this.Yi7zF1RB1.getClass();
        return ayVar.unknownFields.hashCode();
    }

    @Override // defpackage.nx0
    public final boolean OOA6hdeuvCS(Object obj) {
        this.X1lG3V04pd.getClass();
        mr0.WIEu4Ya2g8(obj);
        throw null;
    }

    @Override // defpackage.nx0
    public final void X1lG3V04pd(Object obj) {
        this.Yi7zF1RB1.getClass();
        lc1 lc1Var = ((ay) obj).unknownFields;
        if (lc1Var.OOA6hdeuvCS) {
            lc1Var.OOA6hdeuvCS = false;
        }
        this.X1lG3V04pd.getClass();
        mr0.WIEu4Ya2g8(obj);
        throw null;
    }

    @Override // defpackage.nx0
    public final void Yi7zF1RB1(Object obj, Object obj2) {
        ox0.rQPn8YBR(this.Yi7zF1RB1, obj, obj2);
    }

    @Override // defpackage.nx0
    public final void encWxUiV2(Object obj, nb nbVar, zq zqVar) {
        this.Yi7zF1RB1.getClass();
        mc1.GWasM1elztuh(obj);
        this.X1lG3V04pd.getClass();
        obj.getClass();
        throw new ClassCastException();
    }

    @Override // defpackage.nx0
    public final ay mOu10nynGul() {
        WRKkgoJXwDn wRKkgoJXwDn = this.GWasM1elztuh;
        return wRKkgoJXwDn instanceof ay ? ((ay) wRKkgoJXwDn).mOu10nynGul() : ((yx) ((ay) wRKkgoJXwDn).X1lG3V04pd(5)).Yi7zF1RB1();
    }

    @Override // defpackage.nx0
    public final int xqGvceK5x(ay ayVar) {
        this.Yi7zF1RB1.getClass();
        lc1 lc1Var = ayVar.unknownFields;
        int i = lc1Var.xqGvceK5x;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < lc1Var.GWasM1elztuh; i3++) {
            int i4 = lc1Var.Yi7zF1RB1[i3] >>> 3;
            i2 += pb.EljAMC1QTz(3, (c9) lc1Var.X1lG3V04pd[i3]) + pb.mOu10nynGul(i4) + pb.encWxUiV2(2) + (pb.encWxUiV2(1) * 2);
        }
        lc1Var.xqGvceK5x = i2;
        return i2;
    }
}
