package defpackage;

/* loaded from: classes.dex */
public final class ok extends defpackage.hj {
    @Override // defpackage.hj
    public final defpackage.e90 F7NU4MC0GW(long j, float f, float f2, float f3, float f4, defpackage.w90 w90Var) {
        if (f + f2 + f4 + f3 == 0.0f) {
            return new defpackage.ns0(defpackage.j70.r1MBDhnF(0L, j));
        }
        defpackage.y2 IHQe1A4L2xu = defpackage.z2.IHQe1A4L2xu();
        android.graphics.Path path = IHQe1A4L2xu.IHQe1A4L2xu;
        defpackage.w90 w90Var2 = defpackage.w90.adDC3e2L;
        float f5 = w90Var == w90Var2 ? f : f2;
        path.moveTo(0.0f, f5);
        IHQe1A4L2xu.r1MBDhnF(f5, 0.0f);
        if (w90Var == w90Var2) {
            f = f2;
        }
        int i = (int) (j >> 32);
        IHQe1A4L2xu.r1MBDhnF(java.lang.Float.intBitsToFloat(i) - f, 0.0f);
        IHQe1A4L2xu.r1MBDhnF(java.lang.Float.intBitsToFloat(i), f);
        float f6 = w90Var == w90Var2 ? f3 : f4;
        int i2 = (int) (j & 4294967295L);
        IHQe1A4L2xu.r1MBDhnF(java.lang.Float.intBitsToFloat(i), java.lang.Float.intBitsToFloat(i2) - f6);
        IHQe1A4L2xu.r1MBDhnF(java.lang.Float.intBitsToFloat(i) - f6, java.lang.Float.intBitsToFloat(i2));
        if (w90Var == w90Var2) {
            f3 = f4;
        }
        IHQe1A4L2xu.r1MBDhnF(f3, java.lang.Float.intBitsToFloat(i2));
        IHQe1A4L2xu.r1MBDhnF(0.0f, java.lang.Float.intBitsToFloat(i2) - f3);
        path.close();
        return new defpackage.ms0(IHQe1A4L2xu);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.ok)) {
            return false;
        }
        defpackage.ok okVar = (defpackage.ok) obj;
        return defpackage.x70.QoRHpC4k(this.IHQe1A4L2xu, okVar.IHQe1A4L2xu) && defpackage.x70.QoRHpC4k(this.oh6vYeIP, okVar.oh6vYeIP) && defpackage.x70.QoRHpC4k(this.r1MBDhnF, okVar.r1MBDhnF) && defpackage.x70.QoRHpC4k(this.F7NU4MC0GW, okVar.F7NU4MC0GW);
    }

    public final int hashCode() {
        return this.F7NU4MC0GW.hashCode() + ((this.r1MBDhnF.hashCode() + ((this.oh6vYeIP.hashCode() + (this.IHQe1A4L2xu.hashCode() * 31)) * 31)) * 31);
    }

    @Override // defpackage.hj
    public final defpackage.hj oh6vYeIP(defpackage.ij ijVar, defpackage.ij ijVar2, defpackage.ij ijVar3, defpackage.ij ijVar4) {
        return new defpackage.ok(ijVar, ijVar2, ijVar3, ijVar4);
    }

    public final java.lang.String toString() {
        return "CutCornerShape(topStart = " + this.IHQe1A4L2xu + ", topEnd = " + this.oh6vYeIP + ", bottomEnd = " + this.r1MBDhnF + ", bottomStart = " + this.F7NU4MC0GW + ')';
    }
}
