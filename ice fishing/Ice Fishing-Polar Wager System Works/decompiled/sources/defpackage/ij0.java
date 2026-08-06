package defpackage;

/* loaded from: classes.dex */
public final class ij0 extends defpackage.lj0 implements defpackage.lh, defpackage.da0 {
    public java.util.LinkedHashMap EgCjBq0SZwJ;

    @Override // defpackage.da0
    public final defpackage.ji0 nVhUznk1t(defpackage.ki0 ki0Var, defpackage.di0 di0Var, long j) {
        float f = ((defpackage.uq) defpackage.mj1.abhbClRa(this, defpackage.o70.r1MBDhnF)).adDC3e2L;
        if (f < 0.0f) {
            f = 0.0f;
        }
        defpackage.bv0 xiZrDbcSW0 = di0Var.xiZrDbcSW0(j);
        boolean z = this.kd6TUFXn && !java.lang.Float.isNaN(f) && defpackage.uq.IHQe1A4L2xu(f, 0.0f) > 0;
        int yIx6ChFVk = !java.lang.Float.isNaN(f) ? ki0Var.yIx6ChFVk(f) : 0;
        int i = xiZrDbcSW0.adDC3e2L;
        if (z) {
            i = java.lang.Math.max(i, yIx6ChFVk);
        }
        int i2 = xiZrDbcSW0.xiZrDbcSW0;
        if (z) {
            i2 = java.lang.Math.max(i2, yIx6ChFVk);
        }
        if (z) {
            java.util.LinkedHashMap linkedHashMap = this.EgCjBq0SZwJ;
            if (linkedHashMap == null) {
                linkedHashMap = new java.util.LinkedHashMap(2);
                this.EgCjBq0SZwJ = linkedHashMap;
            }
            defpackage.yl1 yl1Var = defpackage.o70.oh6vYeIP;
            int round = java.lang.Math.round((yIx6ChFVk - xiZrDbcSW0.adDC3e2L) / 2.0f);
            if (round < 0) {
                round = 0;
            }
            linkedHashMap.put(yl1Var, java.lang.Integer.valueOf(round));
            defpackage.g40 g40Var = defpackage.o70.IHQe1A4L2xu;
            int round2 = java.lang.Math.round((yIx6ChFVk - xiZrDbcSW0.xiZrDbcSW0) / 2.0f);
            linkedHashMap.put(g40Var, java.lang.Integer.valueOf(round2 >= 0 ? round2 : 0));
        }
        java.util.Map map = this.EgCjBq0SZwJ;
        if (map == null) {
            map = defpackage.ot.adDC3e2L;
        }
        return ki0Var.EoOhNTTfIN7K(i, i2, map, new defpackage.o60(i, i2, xiZrDbcSW0));
    }
}
