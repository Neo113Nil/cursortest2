package defpackage;

/* loaded from: classes.dex */
public final class ix {
    public final int F7NU4MC0GW;
    public final defpackage.nx IHQe1A4L2xu;
    public final long oh6vYeIP;
    public final int r1MBDhnF;

    public ix(defpackage.nx nxVar, long j, int i, int i2) {
        this.IHQe1A4L2xu = nxVar;
        this.oh6vYeIP = j;
        this.r1MBDhnF = i;
        this.F7NU4MC0GW = i2;
    }

    public final defpackage.w70 IHQe1A4L2xu(defpackage.hx hxVar, boolean z, int i, int i2, int i3, int i4) {
        if (!hxVar.oh6vYeIP) {
            return null;
        }
        this.IHQe1A4L2xu.getClass();
        return null;
    }

    public final defpackage.hx oh6vYeIP(boolean z, int i, long j, defpackage.u60 u60Var, int i2, int i3, int i4, boolean z2, boolean z3) {
        int i5 = i3 + i4;
        if (u60Var == null) {
            return new defpackage.hx(true, true);
        }
        long j2 = u60Var.IHQe1A4L2xu;
        this.IHQe1A4L2xu.getClass();
        if (i2 >= Integer.MAX_VALUE || ((int) (j & 4294967295L)) - ((int) (j2 & 4294967295L)) < 0) {
            return new defpackage.hx(true, true);
        }
        if (i != 0 && (i >= Integer.MAX_VALUE || ((int) (j >> 32)) - ((int) (j2 >> 32)) < 0)) {
            return z2 ? new defpackage.hx(true, true) : new defpackage.hx(true, oh6vYeIP(z, 0, defpackage.u60.IHQe1A4L2xu(defpackage.ki.EXtogiMhuM(this.oh6vYeIP), (((int) (j & 4294967295L)) - this.F7NU4MC0GW) - i4), new defpackage.u60(defpackage.u60.IHQe1A4L2xu(((int) (j2 >> 32)) - this.r1MBDhnF, (int) (j2 & 4294967295L))), i2 + 1, i5, 0, true, false).oh6vYeIP);
        }
        java.lang.Math.max(i4, (int) (j2 & 4294967295L));
        return new defpackage.hx(false, false);
    }
}
