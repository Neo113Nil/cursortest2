package defpackage;

/* loaded from: classes.dex */
public final class b71 implements defpackage.n71, java.lang.Iterable, defpackage.g90 {
    public boolean AARZUJiTa;
    public boolean EXtogiMhuM;
    public final defpackage.nl0 adDC3e2L;
    public defpackage.xh0 xiZrDbcSW0;

    public b71() {
        long[] jArr = defpackage.z41.IHQe1A4L2xu;
        this.adDC3e2L = new defpackage.nl0();
    }

    @Override // defpackage.n71
    public final void IHQe1A4L2xu(defpackage.m71 m71Var, java.lang.Object obj) {
        boolean z = obj instanceof defpackage.TFRaUu83X3E;
        defpackage.nl0 nl0Var = this.adDC3e2L;
        if (z && nl0Var.r1MBDhnF(m71Var)) {
            java.lang.Object AARZUJiTa = nl0Var.AARZUJiTa(m71Var);
            AARZUJiTa.getClass();
            defpackage.TFRaUu83X3E tFRaUu83X3E = (defpackage.TFRaUu83X3E) AARZUJiTa;
            defpackage.TFRaUu83X3E tFRaUu83X3E2 = (defpackage.TFRaUu83X3E) obj;
            java.lang.String str = tFRaUu83X3E2.IHQe1A4L2xu;
            if (str == null) {
                str = tFRaUu83X3E.IHQe1A4L2xu;
            }
            defpackage.s00 s00Var = tFRaUu83X3E2.oh6vYeIP;
            if (s00Var == null) {
                s00Var = tFRaUu83X3E.oh6vYeIP;
            }
            nl0Var.DFo87pBq1E5(m71Var, new defpackage.TFRaUu83X3E(str, s00Var));
        } else {
            nl0Var.DFo87pBq1E5(m71Var, obj);
        }
        m71Var.getClass();
    }

    public final void adDC3e2L(defpackage.b71 b71Var) {
        defpackage.nl0 nl0Var = b71Var.adDC3e2L;
        java.lang.Object[] objArr = nl0Var.oh6vYeIP;
        java.lang.Object[] objArr2 = nl0Var.r1MBDhnF;
        long[] jArr = nl0Var.IHQe1A4L2xu;
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
                        defpackage.m71 m71Var = (defpackage.m71) obj;
                        defpackage.nl0 nl0Var2 = this.adDC3e2L;
                        java.lang.Object AARZUJiTa = nl0Var2.AARZUJiTa(m71Var);
                        m71Var.getClass();
                        java.lang.Object adDC3e2L = m71Var.oh6vYeIP.adDC3e2L(AARZUJiTa, obj2);
                        if (adDC3e2L != null) {
                            nl0Var2.DFo87pBq1E5(m71Var, adDC3e2L);
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

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.b71)) {
            return false;
        }
        defpackage.b71 b71Var = (defpackage.b71) obj;
        return defpackage.x70.QoRHpC4k(this.adDC3e2L, b71Var.adDC3e2L) && this.AARZUJiTa == b71Var.AARZUJiTa && this.EXtogiMhuM == b71Var.EXtogiMhuM;
    }

    public final int hashCode() {
        return java.lang.Boolean.hashCode(this.EXtogiMhuM) + defpackage.fx0.adDC3e2L(this.adDC3e2L.hashCode() * 31, 31, this.AARZUJiTa);
    }

    @Override // java.lang.Iterable
    public final java.util.Iterator iterator() {
        defpackage.xh0 xh0Var = this.xiZrDbcSW0;
        if (xh0Var == null) {
            defpackage.nl0 nl0Var = this.adDC3e2L;
            nl0Var.getClass();
            defpackage.xh0 xh0Var2 = new defpackage.xh0(nl0Var);
            this.xiZrDbcSW0 = xh0Var2;
            xh0Var = xh0Var2;
        }
        return ((defpackage.eu) xh0Var.entrySet()).iterator();
    }

    public final defpackage.b71 oh6vYeIP() {
        defpackage.b71 b71Var = new defpackage.b71();
        b71Var.AARZUJiTa = this.AARZUJiTa;
        b71Var.EXtogiMhuM = this.EXtogiMhuM;
        defpackage.nl0 nl0Var = b71Var.adDC3e2L;
        nl0Var.getClass();
        defpackage.nl0 nl0Var2 = this.adDC3e2L;
        nl0Var2.getClass();
        java.lang.Object[] objArr = nl0Var2.oh6vYeIP;
        java.lang.Object[] objArr2 = nl0Var2.r1MBDhnF;
        long[] jArr = nl0Var2.IHQe1A4L2xu;
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
                            nl0Var.DFo87pBq1E5(objArr[i4], objArr2[i4]);
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
        return b71Var;
    }

    public final java.lang.Object r1MBDhnF(defpackage.m71 m71Var) {
        java.lang.Object AARZUJiTa = this.adDC3e2L.AARZUJiTa(m71Var);
        if (AARZUJiTa != null) {
            return AARZUJiTa;
        }
        throw new java.lang.IllegalStateException("Key not present: " + m71Var + " - consider getOrElse or getOrNull");
    }

    public final java.lang.String toString() {
        java.lang.String str;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (this.AARZUJiTa) {
            sb.append("mergeDescendants=true");
            str = ", ";
        } else {
            str = "";
        }
        if (this.EXtogiMhuM) {
            sb.append(str);
            sb.append("isClearingSemantics=true");
            str = ", ";
        }
        defpackage.nl0 nl0Var = this.adDC3e2L;
        java.lang.Object[] objArr = nl0Var.oh6vYeIP;
        java.lang.Object[] objArr2 = nl0Var.r1MBDhnF;
        long[] jArr = nl0Var.IHQe1A4L2xu;
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
                            sb.append(((defpackage.m71) obj).IHQe1A4L2xu);
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
        return defpackage.e90.C0U8sNJm(this) + "{ " + ((java.lang.Object) sb) + " }";
    }
}
