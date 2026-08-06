package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public abstract class d5 extends o30 {
    public static int EDwNPVYuViP0(long[] jArr) {
        jArr.getClass();
        return jArr.length - 1;
    }

    public static void ES6ysExf(long[] jArr, long j) {
        int length = jArr.length;
        jArr.getClass();
        Arrays.fill(jArr, 0, length, j);
    }

    public static void Fm8W7vP7q(Object[] objArr, Object[] objArr2, int i, int i2, int i3) {
        objArr.getClass();
        objArr2.getClass();
        System.arraycopy(objArr, i2, objArr2, i, i3 - i2);
    }

    public static void JFXS9W1rB5s4(Object[] objArr, int i, int i2) {
        objArr.getClass();
        Arrays.fill(objArr, i, i2, (Object) null);
    }

    public static List K0ReC6MK(boolean[] zArr) {
        zArr.getClass();
        int length = zArr.length;
        if (length == 0) {
            return xp.OOA6hdeuvCS;
        }
        if (length == 1) {
            return fb1.HFYAaqMd6(Boolean.valueOf(zArr[0]));
        }
        ArrayList arrayList = new ArrayList(zArr.length);
        for (boolean z : zArr) {
            arrayList.add(Boolean.valueOf(z));
        }
        return arrayList;
    }

    public static boolean MItybXapHX(Object[] objArr, Object[] objArr2) {
        if (objArr == objArr2) {
            return true;
        }
        if (objArr == null || objArr2 == null || objArr.length != objArr2.length) {
            return false;
        }
        int length = objArr.length;
        for (int i = 0; i < length; i++) {
            Object obj = objArr[i];
            Object obj2 = objArr2[i];
            if (obj != obj2) {
                if (obj == null || obj2 == null) {
                    return false;
                }
                if ((obj instanceof Object[]) && (obj2 instanceof Object[])) {
                    if (!MItybXapHX((Object[]) obj, (Object[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof byte[]) && (obj2 instanceof byte[])) {
                    if (!Arrays.equals((byte[]) obj, (byte[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof short[]) && (obj2 instanceof short[])) {
                    if (!Arrays.equals((short[]) obj, (short[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof int[]) && (obj2 instanceof int[])) {
                    if (!Arrays.equals((int[]) obj, (int[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof long[]) && (obj2 instanceof long[])) {
                    if (!Arrays.equals((long[]) obj, (long[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof float[]) && (obj2 instanceof float[])) {
                    if (!Arrays.equals((float[]) obj, (float[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof double[]) && (obj2 instanceof double[])) {
                    if (!Arrays.equals((double[]) obj, (double[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof char[]) && (obj2 instanceof char[])) {
                    if (!Arrays.equals((char[]) obj, (char[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof boolean[]) && (obj2 instanceof boolean[])) {
                    if (!Arrays.equals((boolean[]) obj, (boolean[]) obj2)) {
                        return false;
                    }
                } else if (!obj.equals(obj2)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void MjxSquD6Av(int[] iArr, int[] iArr2, int i, int i2, int i3) {
        iArr.getClass();
        iArr2.getClass();
        System.arraycopy(iArr, i2, iArr2, i, i3 - i2);
    }

    public static ArrayList NyNgffpi(Object[] objArr) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : objArr) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static List Qd9Q8OZgvOo4(int[] iArr) {
        iArr.getClass();
        int length = iArr.length;
        if (length == 0) {
            return xp.OOA6hdeuvCS;
        }
        if (length == 1) {
            return fb1.HFYAaqMd6(Integer.valueOf(iArr[0]));
        }
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i : iArr) {
            arrayList.add(Integer.valueOf(i));
        }
        return arrayList;
    }

    public static void Uxq83abb04(long[] jArr, long[] jArr2, int i, int i2, int i3) {
        jArr.getClass();
        jArr2.getClass();
        System.arraycopy(jArr, i2, jArr2, i, i3 - i2);
    }

    public static Object[] ZCWXqiC0(Object[] objArr, int i, int i2) {
        objArr.getClass();
        int length = objArr.length;
        if (i2 <= length) {
            Object[] copyOfRange = Arrays.copyOfRange(objArr, i, i2);
            copyOfRange.getClass();
            return copyOfRange;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i2 + ") is greater than size (" + length + ").");
    }

    public static /* synthetic */ void c4eaifQP(int[] iArr, int[] iArr2, int i, int i2, int i3) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 8) != 0) {
            i2 = iArr.length;
        }
        MjxSquD6Av(iArr, iArr2, i, 0, i2);
    }

    public static int dcDmLGVhzWm(Object[] objArr, Object obj) {
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

    public static /* synthetic */ void mqNvfisv7(Object[] objArr, Object[] objArr2, int i, int i2, int i3) {
        if ((i3 & 4) != 0) {
            i = 0;
        }
        Fm8W7vP7q(objArr, objArr2, 0, i, i2);
    }

    public static List nXl1EmE5(Object[] objArr) {
        int length = objArr.length;
        if (length == 0) {
            return xp.OOA6hdeuvCS;
        }
        if (length == 1) {
            return fb1.HFYAaqMd6(objArr[0]);
        }
        List asList = Arrays.asList(Arrays.copyOf(objArr, objArr.length));
        asList.getClass();
        return asList;
    }
}
