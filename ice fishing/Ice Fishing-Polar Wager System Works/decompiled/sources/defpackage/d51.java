package defpackage;

/* loaded from: classes.dex */
public abstract class d51 {
    public static final java.lang.Class IHQe1A4L2xu;
    public static final defpackage.qk1 oh6vYeIP;
    public static final defpackage.qk1 r1MBDhnF;

    static {
        java.lang.Class<?> cls;
        java.lang.Class<?> cls2;
        defpackage.jy0 jy0Var = defpackage.jy0.r1MBDhnF;
        defpackage.qk1 qk1Var = null;
        try {
            cls = java.lang.Class.forName("androidx.datastore.preferences.protobuf.GeneratedMessage");
        } catch (java.lang.Throwable unused) {
            cls = null;
        }
        IHQe1A4L2xu = cls;
        try {
            defpackage.jy0 jy0Var2 = defpackage.jy0.r1MBDhnF;
            try {
                cls2 = java.lang.Class.forName("androidx.datastore.preferences.protobuf.UnknownFieldSetSchema");
            } catch (java.lang.Throwable unused2) {
                cls2 = null;
            }
            if (cls2 != null) {
                qk1Var = (defpackage.qk1) cls2.getConstructor(null).newInstance(null);
            }
        } catch (java.lang.Throwable unused3) {
        }
        oh6vYeIP = qk1Var;
        r1MBDhnF = new defpackage.qk1();
    }

    public static int AARZUJiTa(java.util.List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            long longValue = ((java.lang.Long) list.get(i2)).longValue();
            i += defpackage.rd.SH1y5HwkJhh((longValue >> 63) ^ (longValue << 1));
        }
        return i;
    }

    public static void DFo87pBq1E5(int i, java.util.List list, defpackage.c1NqjJifC7 c1nqjjifc7, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        defpackage.rd rdVar = (defpackage.rd) c1nqjjifc7.xiZrDbcSW0;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                rdVar.cnag84Bm(i, ((java.lang.Boolean) list.get(i2)).booleanValue());
                i2++;
            }
            return;
        }
        rdVar.UsuH8pd5P(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((java.lang.Boolean) list.get(i4)).getClass();
            java.util.logging.Logger logger = defpackage.rd.xiZrDbcSW0;
            i3++;
        }
        rdVar.v5iciZok(i3);
        while (i2 < list.size()) {
            rdVar.DFo87pBq1E5(((java.lang.Boolean) list.get(i2)).booleanValue() ? (byte) 1 : (byte) 0);
            i2++;
        }
    }

    public static int EXtogiMhuM(java.util.List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += defpackage.rd.riuEU0zW4(((java.lang.Integer) list.get(i2)).intValue());
        }
        return i;
    }

    public static void EgCjBq0SZwJ(int i, java.util.List list, defpackage.c1NqjJifC7 c1nqjjifc7, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        defpackage.rd rdVar = (defpackage.rd) c1nqjjifc7.xiZrDbcSW0;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                rdVar.V7bD7b8KA(i, ((java.lang.Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        rdVar.UsuH8pd5P(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += defpackage.rd.SH1y5HwkJhh(((java.lang.Integer) list.get(i4)).intValue());
        }
        rdVar.v5iciZok(i3);
        while (i2 < list.size()) {
            rdVar.PAEGRtP0bX(((java.lang.Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static int F7NU4MC0GW(java.util.List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += defpackage.rd.SH1y5HwkJhh(((java.lang.Integer) list.get(i2)).intValue());
        }
        return i;
    }

    public static void G3OKOH3wZRC(int i, java.util.List list, defpackage.c1NqjJifC7 c1nqjjifc7, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        defpackage.rd rdVar = (defpackage.rd) c1nqjjifc7.xiZrDbcSW0;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                rdVar.fnWB2E7cs(i, ((java.lang.Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        rdVar.UsuH8pd5P(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((java.lang.Long) list.get(i4)).getClass();
            java.util.logging.Logger logger = defpackage.rd.xiZrDbcSW0;
            i3 += 8;
        }
        rdVar.v5iciZok(i3);
        while (i2 < list.size()) {
            rdVar.kNAkVymC(((java.lang.Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static int IHQe1A4L2xu(java.util.List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += defpackage.rd.SH1y5HwkJhh(((java.lang.Integer) list.get(i2)).intValue());
        }
        return i;
    }

    public static boolean JlrlGoKF(java.lang.Object obj, java.lang.Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static void NHJTzaLwkd(int i, java.util.List list, defpackage.c1NqjJifC7 c1nqjjifc7, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        defpackage.rd rdVar = (defpackage.rd) c1nqjjifc7.xiZrDbcSW0;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                rdVar.nBH8hAHy(i, ((java.lang.Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        rdVar.UsuH8pd5P(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += defpackage.rd.riuEU0zW4(((java.lang.Integer) list.get(i4)).intValue());
        }
        rdVar.v5iciZok(i3);
        while (i2 < list.size()) {
            rdVar.v5iciZok(((java.lang.Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void PAEGRtP0bX(int i, java.util.List list, defpackage.c1NqjJifC7 c1nqjjifc7, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        defpackage.rd rdVar = (defpackage.rd) c1nqjjifc7.xiZrDbcSW0;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                int intValue = ((java.lang.Integer) list.get(i2)).intValue();
                rdVar.nBH8hAHy(i, (intValue >> 31) ^ (intValue << 1));
                i2++;
            }
            return;
        }
        rdVar.UsuH8pd5P(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            int intValue2 = ((java.lang.Integer) list.get(i4)).intValue();
            i3 += defpackage.rd.riuEU0zW4((intValue2 >> 31) ^ (intValue2 << 1));
        }
        rdVar.v5iciZok(i3);
        while (i2 < list.size()) {
            int intValue3 = ((java.lang.Integer) list.get(i2)).intValue();
            rdVar.v5iciZok((intValue3 >> 31) ^ (intValue3 << 1));
            i2++;
        }
    }

    public static void QQUzIjv3iOC5(int i, java.util.List list, defpackage.c1NqjJifC7 c1nqjjifc7, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        defpackage.rd rdVar = (defpackage.rd) c1nqjjifc7.xiZrDbcSW0;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                rdVar.D2vUnMij(i, ((java.lang.Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        rdVar.UsuH8pd5P(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += defpackage.rd.SH1y5HwkJhh(((java.lang.Long) list.get(i4)).longValue());
        }
        rdVar.v5iciZok(i3);
        while (i2 < list.size()) {
            rdVar.frpfPPIgqM9O(((java.lang.Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static void QoRHpC4k(int i, java.util.List list, defpackage.c1NqjJifC7 c1nqjjifc7, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        defpackage.rd rdVar = (defpackage.rd) c1nqjjifc7.xiZrDbcSW0;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                rdVar.kd6TUFXn(i, ((java.lang.Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        rdVar.UsuH8pd5P(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((java.lang.Integer) list.get(i4)).getClass();
            java.util.logging.Logger logger = defpackage.rd.xiZrDbcSW0;
            i3 += 4;
        }
        rdVar.v5iciZok(i3);
        while (i2 < list.size()) {
            rdVar.EgCjBq0SZwJ(((java.lang.Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void SyNS6RMn(int i, java.util.List list, defpackage.c1NqjJifC7 c1nqjjifc7, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        defpackage.rd rdVar = (defpackage.rd) c1nqjjifc7.xiZrDbcSW0;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                double doubleValue = ((java.lang.Double) list.get(i2)).doubleValue();
                rdVar.getClass();
                rdVar.fnWB2E7cs(i, java.lang.Double.doubleToRawLongBits(doubleValue));
                i2++;
            }
            return;
        }
        rdVar.UsuH8pd5P(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((java.lang.Double) list.get(i4)).getClass();
            java.util.logging.Logger logger = defpackage.rd.xiZrDbcSW0;
            i3 += 8;
        }
        rdVar.v5iciZok(i3);
        while (i2 < list.size()) {
            rdVar.kNAkVymC(java.lang.Double.doubleToRawLongBits(((java.lang.Double) list.get(i2)).doubleValue()));
            i2++;
        }
    }

    public static void V7bD7b8KA(int i, java.util.List list, defpackage.c1NqjJifC7 c1nqjjifc7, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        defpackage.rd rdVar = (defpackage.rd) c1nqjjifc7.xiZrDbcSW0;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                rdVar.fnWB2E7cs(i, ((java.lang.Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        rdVar.UsuH8pd5P(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((java.lang.Long) list.get(i4)).getClass();
            java.util.logging.Logger logger = defpackage.rd.xiZrDbcSW0;
            i3 += 8;
        }
        rdVar.v5iciZok(i3);
        while (i2 < list.size()) {
            rdVar.kNAkVymC(((java.lang.Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static void abhbClRa(int i, java.util.List list, defpackage.c1NqjJifC7 c1nqjjifc7, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        defpackage.rd rdVar = (defpackage.rd) c1nqjjifc7.xiZrDbcSW0;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                long longValue = ((java.lang.Long) list.get(i2)).longValue();
                rdVar.D2vUnMij(i, (longValue >> 63) ^ (longValue << 1));
                i2++;
            }
            return;
        }
        rdVar.UsuH8pd5P(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            long longValue2 = ((java.lang.Long) list.get(i4)).longValue();
            i3 += defpackage.rd.SH1y5HwkJhh((longValue2 >> 63) ^ (longValue2 << 1));
        }
        rdVar.v5iciZok(i3);
        while (i2 < list.size()) {
            long longValue3 = ((java.lang.Long) list.get(i2)).longValue();
            rdVar.frpfPPIgqM9O((longValue3 >> 63) ^ (longValue3 << 1));
            i2++;
        }
    }

    public static int adDC3e2L(java.util.List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += defpackage.rd.SH1y5HwkJhh(((java.lang.Long) list.get(i2)).longValue());
        }
        return i;
    }

    public static void cnag84Bm(int i, java.util.List list, defpackage.c1NqjJifC7 c1nqjjifc7, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        defpackage.rd rdVar = (defpackage.rd) c1nqjjifc7.xiZrDbcSW0;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                rdVar.V7bD7b8KA(i, ((java.lang.Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        rdVar.UsuH8pd5P(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += defpackage.rd.SH1y5HwkJhh(((java.lang.Integer) list.get(i4)).intValue());
        }
        rdVar.v5iciZok(i3);
        while (i2 < list.size()) {
            rdVar.PAEGRtP0bX(((java.lang.Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void ez2rX8ReCYw(defpackage.qk1 qk1Var, java.lang.Object obj, java.lang.Object obj2) {
        qk1Var.getClass();
        defpackage.e20 e20Var = (defpackage.e20) obj;
        defpackage.pk1 pk1Var = e20Var.unknownFields;
        defpackage.pk1 pk1Var2 = ((defpackage.e20) obj2).unknownFields;
        defpackage.pk1 pk1Var3 = defpackage.pk1.xiZrDbcSW0;
        if (!pk1Var3.equals(pk1Var2)) {
            if (pk1Var3.equals(pk1Var)) {
                int i = pk1Var.IHQe1A4L2xu + pk1Var2.IHQe1A4L2xu;
                int[] copyOf = java.util.Arrays.copyOf(pk1Var.oh6vYeIP, i);
                java.lang.System.arraycopy(pk1Var2.oh6vYeIP, 0, copyOf, pk1Var.IHQe1A4L2xu, pk1Var2.IHQe1A4L2xu);
                java.lang.Object[] copyOf2 = java.util.Arrays.copyOf(pk1Var.r1MBDhnF, i);
                java.lang.System.arraycopy(pk1Var2.r1MBDhnF, 0, copyOf2, pk1Var.IHQe1A4L2xu, pk1Var2.IHQe1A4L2xu);
                pk1Var = new defpackage.pk1(i, copyOf, copyOf2, true);
            } else {
                pk1Var.getClass();
                if (!pk1Var2.equals(pk1Var3)) {
                    if (!pk1Var.adDC3e2L) {
                        throw new java.lang.UnsupportedOperationException();
                    }
                    int i2 = pk1Var.IHQe1A4L2xu + pk1Var2.IHQe1A4L2xu;
                    pk1Var.IHQe1A4L2xu(i2);
                    java.lang.System.arraycopy(pk1Var2.oh6vYeIP, 0, pk1Var.oh6vYeIP, pk1Var.IHQe1A4L2xu, pk1Var2.IHQe1A4L2xu);
                    java.lang.System.arraycopy(pk1Var2.r1MBDhnF, 0, pk1Var.r1MBDhnF, pk1Var.IHQe1A4L2xu, pk1Var2.IHQe1A4L2xu);
                    pk1Var.IHQe1A4L2xu = i2;
                }
            }
        }
        e20Var.unknownFields = pk1Var;
    }

    public static void fnWB2E7cs(int i, java.util.List list, defpackage.c1NqjJifC7 c1nqjjifc7, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        defpackage.rd rdVar = (defpackage.rd) c1nqjjifc7.xiZrDbcSW0;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                rdVar.D2vUnMij(i, ((java.lang.Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        rdVar.UsuH8pd5P(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += defpackage.rd.SH1y5HwkJhh(((java.lang.Long) list.get(i4)).longValue());
        }
        rdVar.v5iciZok(i3);
        while (i2 < list.size()) {
            rdVar.frpfPPIgqM9O(((java.lang.Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static void kNAkVymC(int i, java.util.List list, defpackage.c1NqjJifC7 c1nqjjifc7, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        defpackage.rd rdVar = (defpackage.rd) c1nqjjifc7.xiZrDbcSW0;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                rdVar.kd6TUFXn(i, ((java.lang.Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        rdVar.UsuH8pd5P(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((java.lang.Integer) list.get(i4)).getClass();
            java.util.logging.Logger logger = defpackage.rd.xiZrDbcSW0;
            i3 += 4;
        }
        rdVar.v5iciZok(i3);
        while (i2 < list.size()) {
            rdVar.EgCjBq0SZwJ(((java.lang.Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void kd6TUFXn(int i, java.util.List list, defpackage.c1NqjJifC7 c1nqjjifc7, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        defpackage.rd rdVar = (defpackage.rd) c1nqjjifc7.xiZrDbcSW0;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                float floatValue = ((java.lang.Float) list.get(i2)).floatValue();
                rdVar.getClass();
                rdVar.kd6TUFXn(i, java.lang.Float.floatToRawIntBits(floatValue));
                i2++;
            }
            return;
        }
        rdVar.UsuH8pd5P(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((java.lang.Float) list.get(i4)).getClass();
            java.util.logging.Logger logger = defpackage.rd.xiZrDbcSW0;
            i3 += 4;
        }
        rdVar.v5iciZok(i3);
        while (i2 < list.size()) {
            rdVar.EgCjBq0SZwJ(java.lang.Float.floatToRawIntBits(((java.lang.Float) list.get(i2)).floatValue()));
            i2++;
        }
    }

    public static int oh6vYeIP(int i, java.util.List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (defpackage.rd.EXtogiMhuM(i) + 4) * size;
    }

    public static int r1MBDhnF(int i, java.util.List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (defpackage.rd.EXtogiMhuM(i) + 8) * size;
    }

    public static int riuEU0zW4(java.util.List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += defpackage.rd.SH1y5HwkJhh(((java.lang.Long) list.get(i2)).longValue());
        }
        return i;
    }

    public static int xiZrDbcSW0(java.util.List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            int intValue = ((java.lang.Integer) list.get(i2)).intValue();
            i += defpackage.rd.riuEU0zW4((intValue >> 31) ^ (intValue << 1));
        }
        return i;
    }

    public static java.lang.Object SH1y5HwkJhh(java.lang.Object obj, int i, defpackage.p70 p70Var, java.lang.Object obj2, defpackage.qk1 qk1Var) {
        return obj2;
    }
}
