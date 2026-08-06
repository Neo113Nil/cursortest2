package defpackage;

/* loaded from: classes.dex */
public abstract class t6 extends defpackage.mj1 {
    public static void AQHddgaEX(long[] jArr, long j) {
        int length = jArr.length;
        jArr.getClass();
        java.util.Arrays.fill(jArr, 0, length, j);
    }

    public static /* synthetic */ void AsxAYCCkb3Hi(int[] iArr, int[] iArr2, int i, int i2, int i3) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 8) != 0) {
            i2 = iArr.length;
        }
        Ye0N2xE9Hc(iArr, iArr2, i, 0, i2);
    }

    public static java.util.ArrayList CGXpA9s3RjIa(java.lang.Object[] objArr) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : objArr) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static void EoOhNTTfIN7K(long[] jArr, long[] jArr2, int i, int i2, int i3) {
        jArr.getClass();
        jArr2.getClass();
        java.lang.System.arraycopy(jArr, i2, jArr2, i, i3 - i2);
    }

    public static int JcqDrWrgMf(java.lang.Object[] objArr, java.lang.Object obj) {
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

    public static boolean QPwENk36pDC(java.lang.Object[] objArr, java.lang.Object[] objArr2) {
        if (objArr == objArr2) {
            return true;
        }
        if (objArr == null || objArr2 == null || objArr.length != objArr2.length) {
            return false;
        }
        int length = objArr.length;
        for (int i = 0; i < length; i++) {
            java.lang.Object obj = objArr[i];
            java.lang.Object obj2 = objArr2[i];
            if (obj != obj2) {
                if (obj == null || obj2 == null) {
                    return false;
                }
                if ((obj instanceof java.lang.Object[]) && (obj2 instanceof java.lang.Object[])) {
                    if (!QPwENk36pDC((java.lang.Object[]) obj, (java.lang.Object[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof byte[]) && (obj2 instanceof byte[])) {
                    if (!java.util.Arrays.equals((byte[]) obj, (byte[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof short[]) && (obj2 instanceof short[])) {
                    if (!java.util.Arrays.equals((short[]) obj, (short[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof int[]) && (obj2 instanceof int[])) {
                    if (!java.util.Arrays.equals((int[]) obj, (int[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof long[]) && (obj2 instanceof long[])) {
                    if (!java.util.Arrays.equals((long[]) obj, (long[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof float[]) && (obj2 instanceof float[])) {
                    if (!java.util.Arrays.equals((float[]) obj, (float[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof double[]) && (obj2 instanceof double[])) {
                    if (!java.util.Arrays.equals((double[]) obj, (double[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof char[]) && (obj2 instanceof char[])) {
                    if (!java.util.Arrays.equals((char[]) obj, (char[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof boolean[]) && (obj2 instanceof boolean[])) {
                    if (!java.util.Arrays.equals((boolean[]) obj, (boolean[]) obj2)) {
                        return false;
                    }
                } else if (!obj.equals(obj2)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static java.lang.Object[] QUKZkWRtw6(java.lang.Object[] objArr, int i, int i2) {
        objArr.getClass();
        int length = objArr.length;
        if (i2 <= length) {
            java.lang.Object[] copyOfRange = java.util.Arrays.copyOfRange(objArr, i, i2);
            copyOfRange.getClass();
            return copyOfRange;
        }
        throw new java.lang.IndexOutOfBoundsException("toIndex (" + i2 + ") is greater than size (" + length + ").");
    }

    public static /* synthetic */ void RmCzwkUxICV(java.lang.Object[] objArr, java.lang.Object[] objArr2, int i, int i2, int i3) {
        if ((i3 & 4) != 0) {
            i = 0;
        }
        if ((i3 & 8) != 0) {
            i2 = objArr.length;
        }
        wKlPRKlRnfqr(objArr, objArr2, 0, i, i2);
    }

    public static void Ye0N2xE9Hc(int[] iArr, int[] iArr2, int i, int i2, int i3) {
        iArr.getClass();
        iArr2.getClass();
        java.lang.System.arraycopy(iArr, i2, iArr2, i, i3 - i2);
    }

    public static java.util.List gG5uWf3dqScO(java.lang.Object[] objArr) {
        int length = objArr.length;
        if (length == 0) {
            return defpackage.nt.adDC3e2L;
        }
        if (length == 1) {
            return defpackage.fm.p4kuH6PDtgom(objArr[0]);
        }
        java.util.List asList = java.util.Arrays.asList(java.util.Arrays.copyOf(objArr, objArr.length));
        asList.getClass();
        return asList;
    }

    public static int mL9sMlGfef(long[] jArr) {
        jArr.getClass();
        return jArr.length - 1;
    }

    public static void nVhUznk1t(int i, int i2, java.lang.Object obj, java.lang.Object[] objArr) {
        objArr.getClass();
        java.util.Arrays.fill(objArr, i, i2, obj);
    }

    public static java.util.Set sJNB7mCer5(java.lang.Object[] objArr) {
        objArr.getClass();
        int length = objArr.length;
        if (length == 0) {
            return defpackage.rt.adDC3e2L;
        }
        if (length == 1) {
            java.util.Set singleton = java.util.Collections.singleton(objArr[0]);
            singleton.getClass();
            return singleton;
        }
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet(defpackage.yh0.yIx6ChFVk(objArr.length));
        for (java.lang.Object obj : objArr) {
            linkedHashSet.add(obj);
        }
        return linkedHashSet;
    }

    public static void wKlPRKlRnfqr(java.lang.Object[] objArr, java.lang.Object[] objArr2, int i, int i2, int i3) {
        objArr.getClass();
        objArr2.getClass();
        java.lang.System.arraycopy(objArr, i2, objArr2, i, i3 - i2);
    }
}
