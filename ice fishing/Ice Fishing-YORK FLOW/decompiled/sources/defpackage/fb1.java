package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class fb1 implements defpackage.rb1, java.lang.Iterable, defpackage.nb0 {
    public boolean P05cfTpS5W5L;
    public boolean QiMR8OkAhezm;
    public final defpackage.yn0 WDYagTQQm9ns;
    public defpackage.ik0 oh71FJcDz6S2;

    public fb1() {
        long[] jArr = defpackage.m81.ZpBGe2uQfcn8;
        this.WDYagTQQm9ns = new defpackage.yn0();
    }

    public final void JhCgjQRTAOCT(defpackage.fb1 fb1Var) {
        defpackage.yn0 yn0Var = fb1Var.WDYagTQQm9ns;
        java.lang.Object[] objArr = yn0Var.giKS3J6vZuNy;
        java.lang.Object[] objArr2 = yn0Var.fWTAfUmVKrZq;
        long[] jArr = yn0Var.ZpBGe2uQfcn8;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        java.lang.Object obj = objArr[i4];
                        java.lang.Object obj2 = objArr2[i4];
                        defpackage.qb1 qb1Var = (defpackage.qb1) obj;
                        defpackage.yn0 yn0Var2 = this.WDYagTQQm9ns;
                        java.lang.Object QiMR8OkAhezm = yn0Var2.QiMR8OkAhezm(qb1Var);
                        qb1Var.getClass();
                        java.lang.Object QiMR8OkAhezm2 = qb1Var.giKS3J6vZuNy.QiMR8OkAhezm(QiMR8OkAhezm, obj2);
                        if (QiMR8OkAhezm2 != null) {
                            yn0Var2.h3m55N1URyyK(qb1Var, QiMR8OkAhezm2);
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    @Override // defpackage.rb1
    public final void ZpBGe2uQfcn8(defpackage.qb1 qb1Var, java.lang.Object obj) {
        boolean z = obj instanceof defpackage.xahdJg25P1Bv;
        defpackage.yn0 yn0Var = this.WDYagTQQm9ns;
        if (z && yn0Var.fWTAfUmVKrZq(qb1Var)) {
            java.lang.Object QiMR8OkAhezm = yn0Var.QiMR8OkAhezm(qb1Var);
            QiMR8OkAhezm.getClass();
            defpackage.xahdJg25P1Bv xahdjg25p1bv = (defpackage.xahdJg25P1Bv) QiMR8OkAhezm;
            defpackage.xahdJg25P1Bv xahdjg25p1bv2 = (defpackage.xahdJg25P1Bv) obj;
            java.lang.String str = xahdjg25p1bv2.ZpBGe2uQfcn8;
            if (str == null) {
                str = xahdjg25p1bv.ZpBGe2uQfcn8;
            }
            defpackage.k20 k20Var = xahdjg25p1bv2.giKS3J6vZuNy;
            if (k20Var == null) {
                k20Var = xahdjg25p1bv.giKS3J6vZuNy;
            }
            yn0Var.h3m55N1URyyK(qb1Var, new defpackage.xahdJg25P1Bv(str, k20Var));
        } else {
            yn0Var.h3m55N1URyyK(qb1Var, obj);
        }
        qb1Var.getClass();
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.fb1)) {
            return false;
        }
        defpackage.fb1 fb1Var = (defpackage.fb1) obj;
        return defpackage.ma0.QiMR8OkAhezm(this.WDYagTQQm9ns, fb1Var.WDYagTQQm9ns) && this.QiMR8OkAhezm == fb1Var.QiMR8OkAhezm && this.P05cfTpS5W5L == fb1Var.P05cfTpS5W5L;
    }

    public final java.lang.Object fWTAfUmVKrZq(defpackage.qb1 qb1Var) {
        java.lang.Object QiMR8OkAhezm = this.WDYagTQQm9ns.QiMR8OkAhezm(qb1Var);
        if (QiMR8OkAhezm != null) {
            return QiMR8OkAhezm;
        }
        throw new java.lang.IllegalStateException("Key not present: " + qb1Var + " - consider getOrElse or getOrNull");
    }

    public final defpackage.fb1 giKS3J6vZuNy() {
        defpackage.fb1 fb1Var = new defpackage.fb1();
        fb1Var.QiMR8OkAhezm = this.QiMR8OkAhezm;
        fb1Var.P05cfTpS5W5L = this.P05cfTpS5W5L;
        defpackage.yn0 yn0Var = fb1Var.WDYagTQQm9ns;
        yn0Var.getClass();
        defpackage.yn0 yn0Var2 = this.WDYagTQQm9ns;
        yn0Var2.getClass();
        java.lang.Object[] objArr = yn0Var2.giKS3J6vZuNy;
        java.lang.Object[] objArr2 = yn0Var2.fWTAfUmVKrZq;
        long[] jArr = yn0Var2.ZpBGe2uQfcn8;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = (i << 3) + i3;
                            yn0Var.h3m55N1URyyK(objArr[i4], objArr2[i4]);
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        return fb1Var;
    }

    public final int hashCode() {
        return java.lang.Boolean.hashCode(this.P05cfTpS5W5L) + defpackage.pVQOaWB9QMo4.JhCgjQRTAOCT(this.WDYagTQQm9ns.hashCode() * 31, 31, this.QiMR8OkAhezm);
    }

    @Override // java.lang.Iterable
    public final java.util.Iterator iterator() {
        defpackage.ik0 ik0Var = this.oh71FJcDz6S2;
        if (ik0Var == null) {
            defpackage.yn0 yn0Var = this.WDYagTQQm9ns;
            yn0Var.getClass();
            defpackage.ik0 ik0Var2 = new defpackage.ik0(yn0Var);
            this.oh71FJcDz6S2 = ik0Var2;
            ik0Var = ik0Var2;
        }
        return ((defpackage.qv) ik0Var.entrySet()).iterator();
    }

    public final java.lang.String toString() {
        java.lang.String str;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (this.QiMR8OkAhezm) {
            sb.append("mergeDescendants=true");
            str = ", ";
        } else {
            str = "";
        }
        if (this.P05cfTpS5W5L) {
            sb.append(str);
            sb.append("isClearingSemantics=true");
            str = ", ";
        }
        defpackage.yn0 yn0Var = this.WDYagTQQm9ns;
        java.lang.Object[] objArr = yn0Var.giKS3J6vZuNy;
        java.lang.Object[] objArr2 = yn0Var.fWTAfUmVKrZq;
        long[] jArr = yn0Var.ZpBGe2uQfcn8;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = (i << 3) + i3;
                            java.lang.Object obj = objArr[i4];
                            java.lang.Object obj2 = objArr2[i4];
                            sb.append(str);
                            sb.append(((defpackage.qb1) obj).ZpBGe2uQfcn8);
                            sb.append(" : ");
                            sb.append(obj2);
                            str = ", ";
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        return defpackage.j80.xahdJg25P1Bv(this) + "{ " + ((java.lang.Object) sb) + " }";
    }
}
