package defpackage;

/* loaded from: classes.dex */
public final class e31 implements defpackage.ii0, defpackage.b31 {
    public final defpackage.h6 IHQe1A4L2xu;
    public final defpackage.d8 oh6vYeIP;

    public e31(defpackage.h6 h6Var, defpackage.d8 d8Var) {
        this.IHQe1A4L2xu = h6Var;
        this.oh6vYeIP = d8Var;
    }

    @Override // defpackage.ii0
    public final int AARZUJiTa(defpackage.t70 t70Var, java.util.List list, int i) {
        int yIx6ChFVk = t70Var.yIx6ChFVk(this.IHQe1A4L2xu.IHQe1A4L2xu());
        if (list.isEmpty()) {
            return 0;
        }
        int min = java.lang.Math.min((list.size() - 1) * yIx6ChFVk, i);
        int size = list.size();
        int i2 = 0;
        float f = 0.0f;
        for (int i3 = 0; i3 < size; i3++) {
            defpackage.di0 di0Var = (defpackage.di0) list.get(i3);
            float EgCjBq0SZwJ = defpackage.l80.EgCjBq0SZwJ(defpackage.l80.G3OKOH3wZRC(di0Var));
            if (EgCjBq0SZwJ == 0.0f) {
                int min2 = java.lang.Math.min(di0Var.AsxAYCCkb3Hi(Integer.MAX_VALUE), i == Integer.MAX_VALUE ? Integer.MAX_VALUE : i - min);
                min += min2;
                i2 = java.lang.Math.max(i2, di0Var.RmCzwkUxICV(min2));
            } else if (EgCjBq0SZwJ > 0.0f) {
                f += EgCjBq0SZwJ;
            }
        }
        int round = f == 0.0f ? 0 : i == Integer.MAX_VALUE ? Integer.MAX_VALUE : java.lang.Math.round(java.lang.Math.max(i - min, 0) / f);
        int size2 = list.size();
        for (int i4 = 0; i4 < size2; i4++) {
            defpackage.di0 di0Var2 = (defpackage.di0) list.get(i4);
            float EgCjBq0SZwJ2 = defpackage.l80.EgCjBq0SZwJ(defpackage.l80.G3OKOH3wZRC(di0Var2));
            if (EgCjBq0SZwJ2 > 0.0f) {
                i2 = java.lang.Math.max(i2, di0Var2.RmCzwkUxICV(round != Integer.MAX_VALUE ? java.lang.Math.round(round * EgCjBq0SZwJ2) : Integer.MAX_VALUE));
            }
        }
        return i2;
    }

    @Override // defpackage.b31
    public final int EXtogiMhuM(defpackage.bv0 bv0Var) {
        return bv0Var.adDC3e2L;
    }

    @Override // defpackage.b31
    public final long F7NU4MC0GW(int i, int i2, int i3, boolean z) {
        return !z ? defpackage.li.IHQe1A4L2xu(i, i2, 0, i3) : defpackage.fm.NHJTzaLwkd(i, i2, 0, i3);
    }

    @Override // defpackage.ii0
    public final int IHQe1A4L2xu(defpackage.t70 t70Var, java.util.List list, int i) {
        int yIx6ChFVk = t70Var.yIx6ChFVk(this.IHQe1A4L2xu.IHQe1A4L2xu());
        if (list.isEmpty()) {
            return 0;
        }
        int min = java.lang.Math.min((list.size() - 1) * yIx6ChFVk, i);
        int size = list.size();
        int i2 = 0;
        float f = 0.0f;
        for (int i3 = 0; i3 < size; i3++) {
            defpackage.di0 di0Var = (defpackage.di0) list.get(i3);
            float EgCjBq0SZwJ = defpackage.l80.EgCjBq0SZwJ(defpackage.l80.G3OKOH3wZRC(di0Var));
            if (EgCjBq0SZwJ == 0.0f) {
                int min2 = java.lang.Math.min(di0Var.AsxAYCCkb3Hi(Integer.MAX_VALUE), i == Integer.MAX_VALUE ? Integer.MAX_VALUE : i - min);
                min += min2;
                i2 = java.lang.Math.max(i2, di0Var.AARZUJiTa(min2));
            } else if (EgCjBq0SZwJ > 0.0f) {
                f += EgCjBq0SZwJ;
            }
        }
        int round = f == 0.0f ? 0 : i == Integer.MAX_VALUE ? Integer.MAX_VALUE : java.lang.Math.round(java.lang.Math.max(i - min, 0) / f);
        int size2 = list.size();
        for (int i4 = 0; i4 < size2; i4++) {
            defpackage.di0 di0Var2 = (defpackage.di0) list.get(i4);
            float EgCjBq0SZwJ2 = defpackage.l80.EgCjBq0SZwJ(defpackage.l80.G3OKOH3wZRC(di0Var2));
            if (EgCjBq0SZwJ2 > 0.0f) {
                i2 = java.lang.Math.max(i2, di0Var2.AARZUJiTa(round != Integer.MAX_VALUE ? java.lang.Math.round(round * EgCjBq0SZwJ2) : Integer.MAX_VALUE));
            }
        }
        return i2;
    }

    @Override // defpackage.b31
    public final defpackage.ji0 SH1y5HwkJhh(defpackage.bv0[] bv0VarArr, defpackage.ki0 ki0Var, int[] iArr, int i, int i2, int[] iArr2, int i3, int i4, int i5) {
        return ki0Var.EoOhNTTfIN7K(i, i2, defpackage.ot.adDC3e2L, new defpackage.j(bv0VarArr, this, i2, iArr));
    }

    @Override // defpackage.b31
    public final int adDC3e2L(defpackage.bv0 bv0Var) {
        return bv0Var.xiZrDbcSW0;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.e31)) {
            return false;
        }
        defpackage.e31 e31Var = (defpackage.e31) obj;
        return this.IHQe1A4L2xu.equals(e31Var.IHQe1A4L2xu) && this.oh6vYeIP.equals(e31Var.oh6vYeIP);
    }

    public final int hashCode() {
        return java.lang.Float.hashCode(this.oh6vYeIP.IHQe1A4L2xu) + (this.IHQe1A4L2xu.hashCode() * 31);
    }

    @Override // defpackage.b31
    public final void oh6vYeIP(int i, defpackage.ki0 ki0Var, int[] iArr, int[] iArr2) {
        this.IHQe1A4L2xu.AARZUJiTa(ki0Var, i, iArr, ki0Var.getLayoutDirection(), iArr2);
    }

    @Override // defpackage.ii0
    public final int r1MBDhnF(defpackage.t70 t70Var, java.util.List list, int i) {
        int yIx6ChFVk = t70Var.yIx6ChFVk(this.IHQe1A4L2xu.IHQe1A4L2xu());
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int i2 = 0;
        int i3 = 0;
        float f = 0.0f;
        for (int i4 = 0; i4 < size; i4++) {
            defpackage.di0 di0Var = (defpackage.di0) list.get(i4);
            float EgCjBq0SZwJ = defpackage.l80.EgCjBq0SZwJ(defpackage.l80.G3OKOH3wZRC(di0Var));
            int AsxAYCCkb3Hi = di0Var.AsxAYCCkb3Hi(i);
            if (EgCjBq0SZwJ == 0.0f) {
                i3 += AsxAYCCkb3Hi;
            } else if (EgCjBq0SZwJ > 0.0f) {
                f += EgCjBq0SZwJ;
                i2 = java.lang.Math.max(i2, java.lang.Math.round(AsxAYCCkb3Hi / EgCjBq0SZwJ));
            }
        }
        return ((list.size() - 1) * yIx6ChFVk) + java.lang.Math.round(i2 * f) + i3;
    }

    @Override // defpackage.ii0
    public final int riuEU0zW4(defpackage.t70 t70Var, java.util.List list, int i) {
        int yIx6ChFVk = t70Var.yIx6ChFVk(this.IHQe1A4L2xu.IHQe1A4L2xu());
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int i2 = 0;
        int i3 = 0;
        float f = 0.0f;
        for (int i4 = 0; i4 < size; i4++) {
            defpackage.di0 di0Var = (defpackage.di0) list.get(i4);
            float EgCjBq0SZwJ = defpackage.l80.EgCjBq0SZwJ(defpackage.l80.G3OKOH3wZRC(di0Var));
            int lpprD5VAS = di0Var.lpprD5VAS(i);
            if (EgCjBq0SZwJ == 0.0f) {
                i3 += lpprD5VAS;
            } else if (EgCjBq0SZwJ > 0.0f) {
                f += EgCjBq0SZwJ;
                i2 = java.lang.Math.max(i2, java.lang.Math.round(lpprD5VAS / EgCjBq0SZwJ));
            }
        }
        return ((list.size() - 1) * yIx6ChFVk) + java.lang.Math.round(i2 * f) + i3;
    }

    public final java.lang.String toString() {
        return "RowMeasurePolicy(horizontalArrangement=" + this.IHQe1A4L2xu + ", verticalAlignment=" + this.oh6vYeIP + ')';
    }

    @Override // defpackage.ii0
    public final defpackage.ji0 xiZrDbcSW0(defpackage.ki0 ki0Var, java.util.List list, long j) {
        return defpackage.x80.SiPhmbmu(this, defpackage.ki.SH1y5HwkJhh(j), defpackage.ki.riuEU0zW4(j), defpackage.ki.EXtogiMhuM(j), defpackage.ki.AARZUJiTa(j), ki0Var.yIx6ChFVk(this.IHQe1A4L2xu.IHQe1A4L2xu()), ki0Var, list, new defpackage.bv0[list.size()], 0, list.size(), null, 0);
    }
}
