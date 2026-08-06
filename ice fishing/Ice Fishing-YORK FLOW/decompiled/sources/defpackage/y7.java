package defpackage;

/* loaded from: classes.dex */
public abstract class y7 extends defpackage.nq1 {
    public static /* synthetic */ void EgL5gQQnyJKX(java.lang.Object[] objArr, java.lang.Object[] objArr2, int i, int i2, int i3) {
        if ((i3 & 4) != 0) {
            i = 0;
        }
        if ((i3 & 8) != 0) {
            i2 = objArr.length;
        }
        hwoZxnIesQBZ(objArr, objArr2, 0, i, i2);
    }

    public static java.util.List Hx18F4M3RgD4(int[] iArr) {
        iArr.getClass();
        int length = iArr.length;
        if (length == 0) {
            return defpackage.av.WDYagTQQm9ns;
        }
        if (length == 1) {
            return defpackage.ma0.VFeft99leXEK(java.lang.Integer.valueOf(iArr[0]));
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(iArr.length);
        for (int i : iArr) {
            arrayList.add(java.lang.Integer.valueOf(i));
        }
        return arrayList;
    }

    public static void I5Vdbaz9SDkL(int i, int i2, java.lang.Object obj, java.lang.Object[] objArr) {
        objArr.getClass();
        java.util.Arrays.fill(objArr, i, i2, obj);
    }

    public static java.lang.Object[] LCK4GGEwbWAr(java.lang.Object[] objArr, int i, int i2) {
        objArr.getClass();
        int length = objArr.length;
        if (i2 > length) {
            defpackage.p81.giKS3J6vZuNy(i2, length, ") is greater than size (", "toIndex (");
            return null;
        }
        java.lang.Object[] copyOfRange = java.util.Arrays.copyOfRange(objArr, i, i2);
        copyOfRange.getClass();
        return copyOfRange;
    }

    public static int S0YpfprlOYIn(long[] jArr) {
        jArr.getClass();
        return jArr.length - 1;
    }

    public static java.util.ArrayList ULjnV488Y6RO(java.lang.Object[] objArr) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : objArr) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static java.util.Set XuMcJunjB8iA(java.lang.Object[] objArr) {
        objArr.getClass();
        int length = objArr.length;
        if (length == 0) {
            return defpackage.ev.WDYagTQQm9ns;
        }
        if (length == 1) {
            java.util.Set singleton = java.util.Collections.singleton(objArr[0]);
            singleton.getClass();
            return singleton;
        }
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet(defpackage.jk0.zJPqDeoF0Os1(objArr.length));
        for (java.lang.Object obj : objArr) {
            linkedHashSet.add(obj);
        }
        return linkedHashSet;
    }

    public static java.util.List a6r05ZxsOP0A(java.lang.Object[] objArr) {
        int length = objArr.length;
        if (length == 0) {
            return defpackage.av.WDYagTQQm9ns;
        }
        if (length == 1) {
            return defpackage.ma0.VFeft99leXEK(objArr[0]);
        }
        java.util.List asList = java.util.Arrays.asList(java.util.Arrays.copyOf(objArr, objArr.length));
        asList.getClass();
        return asList;
    }

    public static java.util.List awu2ulftxHsa(boolean[] zArr) {
        zArr.getClass();
        int length = zArr.length;
        if (length == 0) {
            return defpackage.av.WDYagTQQm9ns;
        }
        if (length == 1) {
            return defpackage.ma0.VFeft99leXEK(java.lang.Boolean.valueOf(zArr[0]));
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(zArr.length);
        for (boolean z : zArr) {
            arrayList.add(java.lang.Boolean.valueOf(z));
        }
        return arrayList;
    }

    public static void cCeDCHgnx5OL(int[] iArr, int[] iArr2, int i, int i2, int i3) {
        iArr.getClass();
        iArr2.getClass();
        java.lang.System.arraycopy(iArr, i2, iArr2, i, i3 - i2);
    }

    public static java.util.List cSrsis27vXSh(long[] jArr) {
        jArr.getClass();
        int length = jArr.length;
        if (length == 0) {
            return defpackage.av.WDYagTQQm9ns;
        }
        if (length == 1) {
            return defpackage.ma0.VFeft99leXEK(java.lang.Long.valueOf(jArr[0]));
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(jArr.length);
        for (long j : jArr) {
            arrayList.add(java.lang.Long.valueOf(j));
        }
        return arrayList;
    }

    public static int eSwlWMUpitz8(java.lang.Object[] objArr, java.lang.Object obj) {
        int i = 0;
        if (obj == null) {
            int length = objArr.length;
            while (i < length) {
                if (objArr[i] == null) {
                    return i;
                }
                i++;
            }
            return -1;
        }
        int length2 = objArr.length;
        while (i < length2) {
            if (obj.equals(objArr[i])) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static void hwoZxnIesQBZ(java.lang.Object[] objArr, java.lang.Object[] objArr2, int i, int i2, int i3) {
        objArr.getClass();
        objArr2.getClass();
        java.lang.System.arraycopy(objArr, i2, objArr2, i, i3 - i2);
    }

    public static void lXYSMswtzmix(long[] jArr, long j) {
        int length = jArr.length;
        jArr.getClass();
        java.util.Arrays.fill(jArr, 0, length, j);
    }

    public static /* synthetic */ void m6iZQUu7XjoL(int[] iArr, int[] iArr2, int i, int i2, int i3) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 8) != 0) {
            i2 = iArr.length;
        }
        cCeDCHgnx5OL(iArr, iArr2, i, 0, i2);
    }

    public static java.util.List mnkwqFSfsWTC(double[] dArr) {
        dArr.getClass();
        int length = dArr.length;
        if (length == 0) {
            return defpackage.av.WDYagTQQm9ns;
        }
        if (length == 1) {
            return defpackage.ma0.VFeft99leXEK(java.lang.Double.valueOf(dArr[0]));
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(dArr.length);
        for (double d : dArr) {
            arrayList.add(java.lang.Double.valueOf(d));
        }
        return arrayList;
    }

    public static void omM9cAlgeGXx(long[] jArr, long[] jArr2, int i, int i2, int i3) {
        jArr.getClass();
        jArr2.getClass();
        java.lang.System.arraycopy(jArr, i2, jArr2, i, i3 - i2);
    }

    public static java.util.List pf0OXpZQoaz3(float[] fArr) {
        fArr.getClass();
        int length = fArr.length;
        if (length == 0) {
            return defpackage.av.WDYagTQQm9ns;
        }
        if (length == 1) {
            return defpackage.ma0.VFeft99leXEK(java.lang.Float.valueOf(fArr[0]));
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(fArr.length);
        for (float f : fArr) {
            arrayList.add(java.lang.Float.valueOf(f));
        }
        return arrayList;
    }
}
