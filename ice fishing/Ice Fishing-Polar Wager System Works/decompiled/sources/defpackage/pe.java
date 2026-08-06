package defpackage;

/* loaded from: classes.dex */
public final class pe implements defpackage.ii0, defpackage.b31 {
    public final defpackage.j6 IHQe1A4L2xu;
    public final defpackage.c8 oh6vYeIP;

    public pe(defpackage.j6 j6Var, defpackage.c8 c8Var) {
        this.IHQe1A4L2xu = j6Var;
        this.oh6vYeIP = c8Var;
    }

    @Override // defpackage.ii0
    public final int AARZUJiTa(defpackage.t70 t70Var, java.util.List list, int i) {
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
            int RmCzwkUxICV = di0Var.RmCzwkUxICV(i);
            if (EgCjBq0SZwJ == 0.0f) {
                i3 += RmCzwkUxICV;
            } else if (EgCjBq0SZwJ > 0.0f) {
                f += EgCjBq0SZwJ;
                i2 = java.lang.Math.max(i2, java.lang.Math.round(RmCzwkUxICV / EgCjBq0SZwJ));
            }
        }
        return ((list.size() - 1) * yIx6ChFVk) + java.lang.Math.round(i2 * f) + i3;
    }

    @Override // defpackage.b31
    public final int EXtogiMhuM(defpackage.bv0 bv0Var) {
        return bv0Var.xiZrDbcSW0;
    }

    @Override // defpackage.b31
    public final long F7NU4MC0GW(int i, int i2, int i3, boolean z) {
        return !z ? defpackage.li.IHQe1A4L2xu(0, i3, i, i2) : defpackage.fm.abhbClRa(0, i3, i, i2);
    }

    @Override // defpackage.ii0
    public final int IHQe1A4L2xu(defpackage.t70 t70Var, java.util.List list, int i) {
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
            int AARZUJiTa = di0Var.AARZUJiTa(i);
            if (EgCjBq0SZwJ == 0.0f) {
                i3 += AARZUJiTa;
            } else if (EgCjBq0SZwJ > 0.0f) {
                f += EgCjBq0SZwJ;
                i2 = java.lang.Math.max(i2, java.lang.Math.round(AARZUJiTa / EgCjBq0SZwJ));
            }
        }
        return ((list.size() - 1) * yIx6ChFVk) + java.lang.Math.round(i2 * f) + i3;
    }

    @Override // defpackage.b31
    public final defpackage.ji0 SH1y5HwkJhh(final defpackage.bv0[] bv0VarArr, final defpackage.ki0 ki0Var, final int[] iArr, int i, final int i2, int[] iArr2, int i3, int i4, int i5) {
        return ki0Var.EoOhNTTfIN7K(i2, i, defpackage.ot.adDC3e2L, new defpackage.g00() { // from class: oe
            @Override // defpackage.g00
            public final java.lang.Object AARZUJiTa(java.lang.Object obj) {
                defpackage.av0 av0Var = (defpackage.av0) obj;
                defpackage.bv0[] bv0VarArr2 = bv0VarArr;
                int length = bv0VarArr2.length;
                int i6 = 0;
                int i7 = 0;
                while (i6 < length) {
                    defpackage.bv0 bv0Var = bv0VarArr2[i6];
                    int i8 = i7 + 1;
                    bv0Var.getClass();
                    java.lang.Object ez2rX8ReCYw = bv0Var.ez2rX8ReCYw();
                    defpackage.c31 c31Var = ez2rX8ReCYw instanceof defpackage.c31 ? (defpackage.c31) ez2rX8ReCYw : null;
                    defpackage.w90 layoutDirection = ki0Var.getLayoutDirection();
                    defpackage.gk gkVar = c31Var != null ? c31Var.r1MBDhnF : null;
                    int i9 = i2;
                    defpackage.av0.SH1y5HwkJhh(av0Var, bv0Var, gkVar != null ? gkVar.WLpAkxCo.IHQe1A4L2xu(bv0Var.adDC3e2L, i9, layoutDirection) : this.oh6vYeIP.IHQe1A4L2xu(bv0Var.adDC3e2L, i9, layoutDirection), iArr[i7]);
                    i6++;
                    i7 = i8;
                }
                return defpackage.ok1.IHQe1A4L2xu;
            }
        });
    }

    @Override // defpackage.b31
    public final int adDC3e2L(defpackage.bv0 bv0Var) {
        return bv0Var.adDC3e2L;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.pe)) {
            return false;
        }
        defpackage.pe peVar = (defpackage.pe) obj;
        return this.IHQe1A4L2xu.equals(peVar.IHQe1A4L2xu) && this.oh6vYeIP.equals(peVar.oh6vYeIP);
    }

    public final int hashCode() {
        return java.lang.Float.hashCode(this.oh6vYeIP.IHQe1A4L2xu) + (this.IHQe1A4L2xu.hashCode() * 31);
    }

    @Override // defpackage.b31
    public final void oh6vYeIP(int i, defpackage.ki0 ki0Var, int[] iArr, int[] iArr2) {
        this.IHQe1A4L2xu.EXtogiMhuM(i, ki0Var, iArr, iArr2);
    }

    @Override // defpackage.ii0
    public final int r1MBDhnF(defpackage.t70 t70Var, java.util.List list, int i) {
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
                int min2 = java.lang.Math.min(di0Var.AARZUJiTa(Integer.MAX_VALUE), i == Integer.MAX_VALUE ? Integer.MAX_VALUE : i - min);
                min += min2;
                i2 = java.lang.Math.max(i2, di0Var.AsxAYCCkb3Hi(min2));
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
                i2 = java.lang.Math.max(i2, di0Var2.AsxAYCCkb3Hi(round != Integer.MAX_VALUE ? java.lang.Math.round(round * EgCjBq0SZwJ2) : Integer.MAX_VALUE));
            }
        }
        return i2;
    }

    @Override // defpackage.ii0
    public final int riuEU0zW4(defpackage.t70 t70Var, java.util.List list, int i) {
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
                int min2 = java.lang.Math.min(di0Var.AARZUJiTa(Integer.MAX_VALUE), i == Integer.MAX_VALUE ? Integer.MAX_VALUE : i - min);
                min += min2;
                i2 = java.lang.Math.max(i2, di0Var.lpprD5VAS(min2));
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
                i2 = java.lang.Math.max(i2, di0Var2.lpprD5VAS(round != Integer.MAX_VALUE ? java.lang.Math.round(round * EgCjBq0SZwJ2) : Integer.MAX_VALUE));
            }
        }
        return i2;
    }

    public final java.lang.String toString() {
        return "ColumnMeasurePolicy(verticalArrangement=" + this.IHQe1A4L2xu + ", horizontalAlignment=" + this.oh6vYeIP + ')';
    }

    @Override // defpackage.ii0
    public final defpackage.ji0 xiZrDbcSW0(defpackage.ki0 ki0Var, java.util.List list, long j) {
        return defpackage.x80.SiPhmbmu(this, defpackage.ki.riuEU0zW4(j), defpackage.ki.SH1y5HwkJhh(j), defpackage.ki.AARZUJiTa(j), defpackage.ki.EXtogiMhuM(j), ki0Var.yIx6ChFVk(this.IHQe1A4L2xu.IHQe1A4L2xu()), ki0Var, list, new defpackage.bv0[list.size()], 0, list.size(), null, 0);
    }
}
