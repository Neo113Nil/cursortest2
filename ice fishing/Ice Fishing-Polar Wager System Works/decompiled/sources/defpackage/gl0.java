package defpackage;

/* loaded from: classes.dex */
public final class gl0 {
    public java.lang.Object[] IHQe1A4L2xu;
    public int oh6vYeIP;

    public gl0(int i) {
        this.IHQe1A4L2xu = i == 0 ? defpackage.vp0.IHQe1A4L2xu : new java.lang.Object[i];
    }

    public final int AARZUJiTa(java.lang.Object obj) {
        java.lang.Object[] objArr = this.IHQe1A4L2xu;
        int i = 0;
        if (obj == null) {
            int i2 = this.oh6vYeIP;
            while (i < i2) {
                if (objArr[i] == null) {
                    return i;
                }
                i++;
            }
            return -1;
        }
        int i3 = this.oh6vYeIP;
        while (i < i3) {
            if (obj.equals(objArr[i])) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public final void DFo87pBq1E5(int i, java.lang.Object[] objArr) {
        objArr.getClass();
        int length = objArr.length;
        java.lang.Object[] objArr2 = new java.lang.Object[java.lang.Math.max(i, (length * 3) / 2)];
        defpackage.t6.wKlPRKlRnfqr(objArr, objArr2, 0, 0, length);
        this.IHQe1A4L2xu = objArr2;
    }

    public final boolean EXtogiMhuM() {
        return this.oh6vYeIP == 0;
    }

    public final void F7NU4MC0GW() {
        defpackage.t6.nVhUznk1t(0, this.oh6vYeIP, null, this.IHQe1A4L2xu);
        this.oh6vYeIP = 0;
    }

    public final void IHQe1A4L2xu(java.lang.Object obj) {
        int i = this.oh6vYeIP + 1;
        java.lang.Object[] objArr = this.IHQe1A4L2xu;
        if (objArr.length < i) {
            DFo87pBq1E5(i, objArr);
        }
        java.lang.Object[] objArr2 = this.IHQe1A4L2xu;
        int i2 = this.oh6vYeIP;
        objArr2[i2] = obj;
        this.oh6vYeIP = i2 + 1;
    }

    public final void JlrlGoKF(int i, int i2) {
        int i3;
        if (i < 0 || i > (i3 = this.oh6vYeIP) || i2 < 0 || i2 > i3) {
            throw new java.lang.IndexOutOfBoundsException("Start (" + i + ") and end (" + i2 + ") must be in 0.." + this.oh6vYeIP);
        }
        if (i2 < i) {
            throw new java.lang.IllegalArgumentException("Start (" + i + ") is more than end (" + i2 + ')');
        }
        if (i2 != i) {
            if (i2 < i3) {
                java.lang.Object[] objArr = this.IHQe1A4L2xu;
                defpackage.t6.wKlPRKlRnfqr(objArr, objArr, i, i2, i3);
            }
            int i4 = this.oh6vYeIP;
            int i5 = i4 - (i2 - i);
            defpackage.t6.nVhUznk1t(i5, i4, null, this.IHQe1A4L2xu);
            this.oh6vYeIP = i5;
        }
    }

    public final boolean SH1y5HwkJhh(java.lang.Object obj) {
        int AARZUJiTa = AARZUJiTa(obj);
        if (AARZUJiTa < 0) {
            return false;
        }
        ez2rX8ReCYw(AARZUJiTa);
        return true;
    }

    public final void SyNS6RMn(int i) {
        java.lang.StringBuilder JlrlGoKF = defpackage.fx0.JlrlGoKF(i, "Index ", " must be in 0..");
        JlrlGoKF.append(this.oh6vYeIP - 1);
        throw new java.lang.IndexOutOfBoundsException(JlrlGoKF.toString());
    }

    public final java.lang.Object adDC3e2L() {
        if (EXtogiMhuM()) {
            throw new java.util.NoSuchElementException("ObjectList is empty.");
        }
        return this.IHQe1A4L2xu[0];
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof defpackage.gl0) {
            defpackage.gl0 gl0Var = (defpackage.gl0) obj;
            int i = gl0Var.oh6vYeIP;
            int i2 = this.oh6vYeIP;
            if (i == i2) {
                java.lang.Object[] objArr = this.IHQe1A4L2xu;
                java.lang.Object[] objArr2 = gl0Var.IHQe1A4L2xu;
                defpackage.d70 QPwENk36pDC = defpackage.x80.QPwENk36pDC(0, i2);
                int i3 = QPwENk36pDC.adDC3e2L;
                int i4 = QPwENk36pDC.xiZrDbcSW0;
                if (i3 > i4) {
                    return true;
                }
                while (defpackage.x70.QoRHpC4k(objArr[i3], objArr2[i3])) {
                    if (i3 == i4) {
                        return true;
                    }
                    i3++;
                }
                return false;
            }
        }
        return false;
    }

    public final java.lang.Object ez2rX8ReCYw(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.oh6vYeIP)) {
            SyNS6RMn(i);
            throw null;
        }
        java.lang.Object[] objArr = this.IHQe1A4L2xu;
        java.lang.Object obj = objArr[i];
        if (i != i2 - 1) {
            defpackage.t6.wKlPRKlRnfqr(objArr, objArr, i, i + 1, i2);
        }
        int i3 = this.oh6vYeIP - 1;
        this.oh6vYeIP = i3;
        objArr[i3] = null;
        return obj;
    }

    public final int hashCode() {
        java.lang.Object[] objArr = this.IHQe1A4L2xu;
        int i = this.oh6vYeIP;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            java.lang.Object obj = objArr[i3];
            i2 += (obj != null ? obj.hashCode() : 0) * 31;
        }
        return i2;
    }

    public final void oh6vYeIP(defpackage.gl0 gl0Var) {
        gl0Var.getClass();
        if (gl0Var.EXtogiMhuM()) {
            return;
        }
        int i = this.oh6vYeIP + gl0Var.oh6vYeIP;
        java.lang.Object[] objArr = this.IHQe1A4L2xu;
        if (objArr.length < i) {
            DFo87pBq1E5(i, objArr);
        }
        defpackage.t6.wKlPRKlRnfqr(gl0Var.IHQe1A4L2xu, this.IHQe1A4L2xu, this.oh6vYeIP, 0, gl0Var.oh6vYeIP);
        this.oh6vYeIP += gl0Var.oh6vYeIP;
    }

    public final void r1MBDhnF(java.util.List list) {
        if (list.isEmpty()) {
            return;
        }
        int i = this.oh6vYeIP;
        int size = list.size() + i;
        java.lang.Object[] objArr = this.IHQe1A4L2xu;
        if (objArr.length < size) {
            DFo87pBq1E5(size, objArr);
        }
        java.lang.Object[] objArr2 = this.IHQe1A4L2xu;
        int size2 = list.size();
        for (int i2 = 0; i2 < size2; i2++) {
            objArr2[i2 + i] = list.get(i2);
        }
        this.oh6vYeIP = list.size() + this.oh6vYeIP;
    }

    public final boolean riuEU0zW4() {
        return this.oh6vYeIP != 0;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append((java.lang.CharSequence) "[");
        java.lang.Object[] objArr = this.IHQe1A4L2xu;
        int i = this.oh6vYeIP;
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                sb.append((java.lang.CharSequence) "]");
                break;
            }
            java.lang.Object obj = objArr[i2];
            if (i2 == -1) {
                sb.append((java.lang.CharSequence) "...");
                break;
            }
            if (i2 != 0) {
                sb.append((java.lang.CharSequence) ", ");
            }
            sb.append((java.lang.CharSequence) (obj == this ? "(this)" : java.lang.String.valueOf(obj)));
            i2++;
        }
        return sb.toString();
    }

    public final java.lang.Object xiZrDbcSW0(int i) {
        if (i >= 0 && i < this.oh6vYeIP) {
            return this.IHQe1A4L2xu[i];
        }
        SyNS6RMn(i);
        throw null;
    }

    public /* synthetic */ gl0() {
        this(16);
    }
}
