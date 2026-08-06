package defpackage;

/* loaded from: classes.dex */
public final class rf1 {
    public final float F7NU4MC0GW;
    public final defpackage.qf1 IHQe1A4L2xu;
    public final float adDC3e2L;
    public final defpackage.nk0 oh6vYeIP;
    public final long r1MBDhnF;
    public final java.util.ArrayList xiZrDbcSW0;

    public rf1(defpackage.qf1 qf1Var, defpackage.nk0 nk0Var, long j) {
        this.IHQe1A4L2xu = qf1Var;
        this.oh6vYeIP = nk0Var;
        this.r1MBDhnF = j;
        java.util.ArrayList arrayList = (java.util.ArrayList) nk0Var.adDC3e2L;
        float f = 0.0f;
        this.F7NU4MC0GW = arrayList.isEmpty() ? 0.0f : ((defpackage.gt0) arrayList.get(0)).IHQe1A4L2xu.F7NU4MC0GW.r1MBDhnF(0);
        if (!arrayList.isEmpty()) {
            defpackage.gt0 gt0Var = (defpackage.gt0) defpackage.td.NWDBeGGF(arrayList);
            f = gt0Var.IHQe1A4L2xu.F7NU4MC0GW.r1MBDhnF(r4.xiZrDbcSW0 - 1) + gt0Var.xiZrDbcSW0;
        }
        this.adDC3e2L = f;
        this.xiZrDbcSW0 = (java.util.ArrayList) nk0Var.F7NU4MC0GW;
    }

    public final float F7NU4MC0GW(int i) {
        defpackage.nk0 nk0Var = this.oh6vYeIP;
        nk0Var.oh6vYeIP(i);
        java.util.ArrayList arrayList = (java.util.ArrayList) nk0Var.adDC3e2L;
        defpackage.gt0 gt0Var = (defpackage.gt0) arrayList.get(defpackage.f70.JlrlGoKF(i, arrayList));
        defpackage.t2 t2Var = gt0Var.IHQe1A4L2xu;
        return t2Var.F7NU4MC0GW.xiZrDbcSW0(i - gt0Var.F7NU4MC0GW) + gt0Var.xiZrDbcSW0;
    }

    public final int IHQe1A4L2xu(int i) {
        defpackage.nk0 nk0Var = this.oh6vYeIP;
        java.util.ArrayList arrayList = (java.util.ArrayList) nk0Var.adDC3e2L;
        defpackage.gt0 gt0Var = (defpackage.gt0) arrayList.get(i >= ((defpackage.l5) ((defpackage.m7) nk0Var.r1MBDhnF).IHQe1A4L2xu).xiZrDbcSW0.length() ? defpackage.fm.nBH8hAHy(arrayList) : i < 0 ? 0 : defpackage.f70.ez2rX8ReCYw(i, arrayList));
        return gt0Var.IHQe1A4L2xu.F7NU4MC0GW.adDC3e2L.getLineForOffset(gt0Var.IHQe1A4L2xu(i)) + gt0Var.F7NU4MC0GW;
    }

    public final defpackage.l11 adDC3e2L(int i) {
        defpackage.nk0 nk0Var = this.oh6vYeIP;
        defpackage.l5 l5Var = (defpackage.l5) ((defpackage.m7) nk0Var.r1MBDhnF).IHQe1A4L2xu;
        if (i < 0 || i > l5Var.xiZrDbcSW0.length()) {
            java.lang.StringBuilder JlrlGoKF = defpackage.fx0.JlrlGoKF(i, "offset(", ") is out of bounds [0, ");
            JlrlGoKF.append(l5Var.xiZrDbcSW0.length());
            JlrlGoKF.append(']');
            defpackage.y50.IHQe1A4L2xu(JlrlGoKF.toString());
        }
        int length = ((defpackage.l5) ((defpackage.m7) nk0Var.r1MBDhnF).IHQe1A4L2xu).xiZrDbcSW0.length();
        java.util.ArrayList arrayList = (java.util.ArrayList) nk0Var.adDC3e2L;
        defpackage.gt0 gt0Var = (defpackage.gt0) arrayList.get(i == length ? defpackage.fm.nBH8hAHy(arrayList) : defpackage.f70.ez2rX8ReCYw(i, arrayList));
        defpackage.t2 t2Var = gt0Var.IHQe1A4L2xu;
        int IHQe1A4L2xu = gt0Var.IHQe1A4L2xu(i);
        defpackage.pf1 pf1Var = t2Var.F7NU4MC0GW;
        return pf1Var.adDC3e2L.getParagraphDirection(pf1Var.adDC3e2L.getLineForOffset(IHQe1A4L2xu)) == 1 ? defpackage.l11.adDC3e2L : defpackage.l11.xiZrDbcSW0;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.rf1) {
            defpackage.rf1 rf1Var = (defpackage.rf1) obj;
            if (defpackage.x70.QoRHpC4k(this.IHQe1A4L2xu, rf1Var.IHQe1A4L2xu) && this.oh6vYeIP == rf1Var.oh6vYeIP && defpackage.i70.IHQe1A4L2xu(this.r1MBDhnF, rf1Var.r1MBDhnF) && this.F7NU4MC0GW == rf1Var.F7NU4MC0GW && this.adDC3e2L == rf1Var.adDC3e2L && defpackage.x70.QoRHpC4k(this.xiZrDbcSW0, rf1Var.xiZrDbcSW0)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.xiZrDbcSW0.hashCode() + defpackage.fx0.IHQe1A4L2xu(this.adDC3e2L, defpackage.fx0.IHQe1A4L2xu(this.F7NU4MC0GW, defpackage.fx0.r1MBDhnF((this.oh6vYeIP.hashCode() + (this.IHQe1A4L2xu.hashCode() * 31)) * 31, 31, this.r1MBDhnF), 31), 31);
    }

    public final int oh6vYeIP(float f) {
        java.util.ArrayList arrayList = (java.util.ArrayList) this.oh6vYeIP.adDC3e2L;
        int i = 0;
        if (f > 0.0f) {
            if (f < ((defpackage.gt0) defpackage.td.NWDBeGGF(arrayList)).AARZUJiTa) {
                int size = arrayList.size() - 1;
                int i2 = 0;
                while (true) {
                    if (i2 > size) {
                        i = -(i2 + 1);
                        break;
                    }
                    int i3 = (i2 + size) >>> 1;
                    defpackage.gt0 gt0Var = (defpackage.gt0) arrayList.get(i3);
                    char c = gt0Var.xiZrDbcSW0 > f ? (char) 1 : gt0Var.AARZUJiTa <= f ? (char) 65535 : (char) 0;
                    if (c >= 0) {
                        if (c <= 0) {
                            i = i3;
                            break;
                        }
                        size = i3 - 1;
                    } else {
                        i2 = i3 + 1;
                    }
                }
            } else {
                i = arrayList.size() - 1;
            }
        }
        defpackage.gt0 gt0Var2 = (defpackage.gt0) arrayList.get(i);
        int i4 = gt0Var2.r1MBDhnF;
        int i5 = gt0Var2.F7NU4MC0GW;
        if (i4 - gt0Var2.oh6vYeIP == 0) {
            return i5;
        }
        defpackage.t2 t2Var = gt0Var2.IHQe1A4L2xu;
        float f2 = f - gt0Var2.xiZrDbcSW0;
        defpackage.pf1 pf1Var = t2Var.F7NU4MC0GW;
        return pf1Var.adDC3e2L.getLineForVertical(((int) f2) - pf1Var.AARZUJiTa) + i5;
    }

    public final int r1MBDhnF(int i) {
        defpackage.nk0 nk0Var = this.oh6vYeIP;
        nk0Var.oh6vYeIP(i);
        java.util.ArrayList arrayList = (java.util.ArrayList) nk0Var.adDC3e2L;
        defpackage.gt0 gt0Var = (defpackage.gt0) arrayList.get(defpackage.f70.JlrlGoKF(i, arrayList));
        defpackage.t2 t2Var = gt0Var.IHQe1A4L2xu;
        return t2Var.F7NU4MC0GW.adDC3e2L.getLineStart(i - gt0Var.F7NU4MC0GW) + gt0Var.oh6vYeIP;
    }

    public final java.lang.String toString() {
        return "TextLayoutResult(layoutInput=" + this.IHQe1A4L2xu + ", multiParagraph=" + this.oh6vYeIP + ", size=" + ((java.lang.Object) defpackage.i70.oh6vYeIP(this.r1MBDhnF)) + ", firstBaseline=" + this.F7NU4MC0GW + ", lastBaseline=" + this.adDC3e2L + ", placeholderRects=" + this.xiZrDbcSW0 + ')';
    }
}
