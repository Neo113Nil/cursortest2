package defpackage;

/* loaded from: classes.dex */
public final class z21 extends defpackage.hj {
    @Override // defpackage.hj
    public final defpackage.e90 F7NU4MC0GW(long j, float f, float f2, float f3, float f4, defpackage.w90 w90Var) {
        if (f + f2 + f3 + f4 == 0.0f) {
            return new defpackage.ns0(defpackage.j70.r1MBDhnF(0L, j));
        }
        defpackage.kz0 r1MBDhnF = defpackage.j70.r1MBDhnF(0L, j);
        defpackage.w90 w90Var2 = defpackage.w90.adDC3e2L;
        float f5 = w90Var == w90Var2 ? f : f2;
        long floatToRawIntBits = (java.lang.Float.floatToRawIntBits(f5) << 32) | (java.lang.Float.floatToRawIntBits(f5) & 4294967295L);
        float f6 = w90Var == w90Var2 ? f2 : f;
        long floatToRawIntBits2 = (java.lang.Float.floatToRawIntBits(f6) << 32) | (java.lang.Float.floatToRawIntBits(f6) & 4294967295L);
        float f7 = w90Var == w90Var2 ? f3 : f4;
        long floatToRawIntBits3 = (java.lang.Float.floatToRawIntBits(f7) << 32) | (java.lang.Float.floatToRawIntBits(f7) & 4294967295L);
        float f8 = w90Var == w90Var2 ? f4 : f3;
        return new defpackage.os0(new defpackage.x21(r1MBDhnF.IHQe1A4L2xu, r1MBDhnF.oh6vYeIP, r1MBDhnF.r1MBDhnF, r1MBDhnF.F7NU4MC0GW, floatToRawIntBits, floatToRawIntBits2, floatToRawIntBits3, (java.lang.Float.floatToRawIntBits(f8) << 32) | (java.lang.Float.floatToRawIntBits(f8) & 4294967295L)));
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.z21)) {
            return false;
        }
        defpackage.z21 z21Var = (defpackage.z21) obj;
        return defpackage.x70.QoRHpC4k(this.IHQe1A4L2xu, z21Var.IHQe1A4L2xu) && defpackage.x70.QoRHpC4k(this.oh6vYeIP, z21Var.oh6vYeIP) && defpackage.x70.QoRHpC4k(this.r1MBDhnF, z21Var.r1MBDhnF) && defpackage.x70.QoRHpC4k(this.F7NU4MC0GW, z21Var.F7NU4MC0GW);
    }

    public final int hashCode() {
        return this.F7NU4MC0GW.hashCode() + ((this.r1MBDhnF.hashCode() + ((this.oh6vYeIP.hashCode() + (this.IHQe1A4L2xu.hashCode() * 31)) * 31)) * 31);
    }

    @Override // defpackage.hj
    public final defpackage.hj oh6vYeIP(defpackage.ij ijVar, defpackage.ij ijVar2, defpackage.ij ijVar3, defpackage.ij ijVar4) {
        return new defpackage.z21(ijVar, ijVar2, ijVar3, ijVar4);
    }

    public final java.lang.String toString() {
        return "RoundedCornerShape(topStart = " + this.IHQe1A4L2xu + ", topEnd = " + this.oh6vYeIP + ", bottomEnd = " + this.r1MBDhnF + ", bottomStart = " + this.F7NU4MC0GW + ')';
    }
}
