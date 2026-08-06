package defpackage;

/* loaded from: classes.dex */
public final class oc0 {
    public final defpackage.p2 F7NU4MC0GW;
    public final defpackage.yc0 IHQe1A4L2xu;
    public final defpackage.mc0 oh6vYeIP;
    public final defpackage.hb0 r1MBDhnF;

    public oc0(defpackage.yc0 yc0Var, defpackage.mc0 mc0Var, defpackage.hb0 hb0Var, defpackage.p2 p2Var) {
        this.IHQe1A4L2xu = yc0Var;
        this.oh6vYeIP = mc0Var;
        this.r1MBDhnF = hb0Var;
        this.F7NU4MC0GW = p2Var;
    }

    public final java.lang.Object F7NU4MC0GW(int i) {
        java.lang.Object AARZUJiTa;
        defpackage.p2 p2Var = this.F7NU4MC0GW;
        java.lang.Object[] objArr = (java.lang.Object[]) p2Var.r1MBDhnF;
        int i2 = i - p2Var.IHQe1A4L2xu;
        java.lang.Object obj = (i2 < 0 || i2 >= objArr.length) ? null : objArr[i2];
        if (obj != null) {
            return obj;
        }
        defpackage.mc0 mc0Var = this.oh6vYeIP;
        mc0Var.getClass();
        defpackage.r70 oh6vYeIP = mc0Var.IHQe1A4L2xu.oh6vYeIP(i);
        int i3 = i - oh6vYeIP.IHQe1A4L2xu;
        defpackage.g00 g00Var = (defpackage.g00) oh6vYeIP.r1MBDhnF.oh6vYeIP;
        return (g00Var == null || (AARZUJiTa = g00Var.AARZUJiTa(java.lang.Integer.valueOf(i3))) == null) ? new defpackage.wm(i) : AARZUJiTa;
    }

    public final void IHQe1A4L2xu(final int i, java.lang.Object obj, defpackage.t10 t10Var, int i2) {
        int i3;
        java.lang.Object obj2;
        defpackage.t10 t10Var2;
        t10Var.QUKZkWRtw6(-462424778);
        int i4 = (t10Var.F7NU4MC0GW(i) ? 4 : 2) | i2 | (t10Var.EXtogiMhuM(obj) ? 32 : 16) | (t10Var.xiZrDbcSW0(this) ? 256 : 128);
        if (t10Var.lpprD5VAS(i4 & 1, (i4 & 147) != 146)) {
            i3 = i;
            obj2 = obj;
            t10Var2 = t10Var;
            defpackage.a70.IHQe1A4L2xu(obj2, i3, this.IHQe1A4L2xu.kd6TUFXn, defpackage.h1.XZx205DYe(-824725566, new defpackage.k00() { // from class: nc0
                @Override // defpackage.k00
                public final java.lang.Object adDC3e2L(java.lang.Object obj3, java.lang.Object obj4) {
                    defpackage.t10 t10Var3 = (defpackage.t10) obj3;
                    int intValue = ((java.lang.Integer) obj4).intValue();
                    if (t10Var3.lpprD5VAS(intValue & 1, (intValue & 3) != 2)) {
                        defpackage.oc0 oc0Var = defpackage.oc0.this;
                        defpackage.p2 p2Var = oc0Var.oh6vYeIP.IHQe1A4L2xu;
                        int i5 = i;
                        defpackage.r70 oh6vYeIP = p2Var.oh6vYeIP(i5);
                        ((defpackage.sf) oh6vYeIP.r1MBDhnF.F7NU4MC0GW).riuEU0zW4(oc0Var.r1MBDhnF, java.lang.Integer.valueOf(i5 - oh6vYeIP.IHQe1A4L2xu), t10Var3, 0);
                    } else {
                        t10Var3.WLpAkxCo();
                    }
                    return defpackage.ok1.IHQe1A4L2xu;
                }
            }, t10Var), t10Var2, ((i4 >> 3) & 14) | 3072 | ((i4 << 3) & 112));
        } else {
            i3 = i;
            obj2 = obj;
            t10Var2 = t10Var;
            t10Var2.WLpAkxCo();
        }
        defpackage.az0 kd6TUFXn = t10Var2.kd6TUFXn();
        if (kd6TUFXn != null) {
            kd6TUFXn.F7NU4MC0GW = new defpackage.tb0(this, i3, obj2, i2);
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.oc0)) {
            return false;
        }
        return defpackage.x70.QoRHpC4k(this.oh6vYeIP, ((defpackage.oc0) obj).oh6vYeIP);
    }

    public final int hashCode() {
        return this.oh6vYeIP.hashCode();
    }

    public final java.lang.Object oh6vYeIP(int i) {
        defpackage.mc0 mc0Var = this.oh6vYeIP;
        mc0Var.getClass();
        defpackage.r70 oh6vYeIP = mc0Var.IHQe1A4L2xu.oh6vYeIP(i);
        return ((defpackage.g00) oh6vYeIP.r1MBDhnF.r1MBDhnF).AARZUJiTa(java.lang.Integer.valueOf(i - oh6vYeIP.IHQe1A4L2xu));
    }

    public final int r1MBDhnF() {
        defpackage.mc0 mc0Var = this.oh6vYeIP;
        mc0Var.getClass();
        return mc0Var.IHQe1A4L2xu.IHQe1A4L2xu;
    }
}
