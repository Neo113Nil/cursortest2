package defpackage;

/* loaded from: classes.dex */
public final class tk0 {
    public final defpackage.nl0 IHQe1A4L2xu;

    public static final java.lang.Object IHQe1A4L2xu(defpackage.nl0 nl0Var) {
        java.lang.Object AARZUJiTa = nl0Var.AARZUJiTa(null);
        if (AARZUJiTa == null) {
            return null;
        }
        if (!(AARZUJiTa instanceof defpackage.gl0)) {
            nl0Var.ez2rX8ReCYw(null);
            return AARZUJiTa;
        }
        defpackage.gl0 gl0Var = (defpackage.gl0) AARZUJiTa;
        if (gl0Var.EXtogiMhuM()) {
            throw new java.util.NoSuchElementException("List is empty.");
        }
        int i = gl0Var.oh6vYeIP - 1;
        java.lang.Object xiZrDbcSW0 = gl0Var.xiZrDbcSW0(i);
        gl0Var.ez2rX8ReCYw(i);
        xiZrDbcSW0.getClass();
        if (gl0Var.EXtogiMhuM()) {
            nl0Var.ez2rX8ReCYw(null);
        }
        if (gl0Var.oh6vYeIP == 1) {
            nl0Var.DFo87pBq1E5(null, gl0Var.adDC3e2L());
        }
        return xiZrDbcSW0;
    }

    public static final defpackage.gl0 oh6vYeIP(defpackage.nl0 nl0Var) {
        if (nl0Var.riuEU0zW4()) {
            defpackage.gl0 gl0Var = defpackage.vp0.oh6vYeIP;
            gl0Var.getClass();
            return gl0Var;
        }
        defpackage.gl0 gl0Var2 = new defpackage.gl0();
        java.lang.Object[] objArr = nl0Var.r1MBDhnF;
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
                            java.lang.Object obj = objArr[(i << 3) + i3];
                            if (obj instanceof defpackage.gl0) {
                                gl0Var2.oh6vYeIP((defpackage.gl0) obj);
                            } else {
                                obj.getClass();
                                gl0Var2.IHQe1A4L2xu(obj);
                            }
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
        return gl0Var2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof defpackage.tk0) {
            return this.IHQe1A4L2xu.equals(((defpackage.tk0) obj).IHQe1A4L2xu);
        }
        return false;
    }

    public final int hashCode() {
        return this.IHQe1A4L2xu.hashCode();
    }

    public final java.lang.String toString() {
        return "MultiValueMap(map=" + this.IHQe1A4L2xu + ')';
    }
}
