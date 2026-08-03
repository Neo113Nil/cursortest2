package bc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public abstract class l extends a.a {
    public static List N(Object[] objArr) {
        pc.j.e(objArr, "<this>");
        List asList = Arrays.asList(objArr);
        pc.j.d(asList, "asList(...)");
        return asList;
    }

    public static boolean O(Object[] objArr, Object obj) {
        return Z(objArr, obj) >= 0;
    }

    public static void P(int i10, int i11, int i12, int[] iArr, int[] iArr2) {
        pc.j.e(iArr, "<this>");
        pc.j.e(iArr2, "destination");
        System.arraycopy(iArr, i11, iArr2, i10, i12 - i11);
    }

    public static void Q(long[] jArr, long[] jArr2, int i10, int i11, int i12) {
        pc.j.e(jArr, "<this>");
        pc.j.e(jArr2, "destination");
        System.arraycopy(jArr, i11, jArr2, i10, i12 - i11);
    }

    public static void R(Object[] objArr, Object[] objArr2, int i10, int i11, int i12) {
        pc.j.e(objArr, "<this>");
        pc.j.e(objArr2, "destination");
        System.arraycopy(objArr, i11, objArr2, i10, i12 - i11);
    }

    public static /* synthetic */ void S(int i10, int i11, int i12, int[] iArr, int[] iArr2) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 8) != 0) {
            i11 = iArr.length;
        }
        P(i10, 0, i11, iArr, iArr2);
    }

    public static /* synthetic */ void T(Object[] objArr, Object[] objArr2, int i10, int i11, int i12) {
        if ((i12 & 4) != 0) {
            i10 = 0;
        }
        if ((i12 & 8) != 0) {
            i11 = objArr.length;
        }
        R(objArr, objArr2, 0, i10, i11);
    }

    public static Object[] U(Object[] objArr, int i10, int i11) {
        pc.j.e(objArr, "<this>");
        a.a.q(i11, objArr.length);
        Object[] copyOfRange = Arrays.copyOfRange(objArr, i10, i11);
        pc.j.d(copyOfRange, "copyOfRange(...)");
        return copyOfRange;
    }

    public static void V(int i10, int i11, Object obj, Object[] objArr) {
        pc.j.e(objArr, "<this>");
        Arrays.fill(objArr, i10, i11, obj);
    }

    public static void W(long[] jArr, long j3) {
        int length = jArr.length;
        pc.j.e(jArr, "<this>");
        Arrays.fill(jArr, 0, length, j3);
    }

    public static Object X(Object[] objArr) {
        pc.j.e(objArr, "<this>");
        if (objArr.length != 0) {
            return objArr[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static int Y(long[] jArr) {
        pc.j.e(jArr, "<this>");
        return jArr.length - 1;
    }

    public static int Z(Object[] objArr, Object obj) {
        int i10 = 0;
        if (obj == null) {
            int length = objArr.length;
            while (i10 < length) {
                if (objArr[i10] == null) {
                    return i10;
                }
                i10++;
            }
            return -1;
        }
        int length2 = objArr.length;
        while (i10 < length2) {
            if (obj.equals(objArr[i10])) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public static String a0(int i10, Object[] objArr) {
        String str = (i10 & 2) != 0 ? "" : "innermostOf(";
        String str2 = (i10 & 4) == 0 ? ")" : "";
        pc.j.e(objArr, "<this>");
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) str);
        int i11 = 0;
        for (Object obj : objArr) {
            i11++;
            if (i11 > 1) {
                sb.append((CharSequence) ", ");
            }
            u5.d.a(sb, obj, null);
        }
        sb.append((CharSequence) str2);
        String sb2 = sb.toString();
        pc.j.d(sb2, "toString(...)");
        return sb2;
    }

    public static void b0(Object[] objArr, Comparator comparator, int i10, int i11) {
        pc.j.e(objArr, "<this>");
        pc.j.e(comparator, "comparator");
        Arrays.sort(objArr, i10, i11, comparator);
    }

    public static List c0(Object[] objArr) {
        int length = objArr.length;
        return length != 0 ? length != 1 ? new ArrayList(new j(objArr, false)) : i7.b.z(objArr[0]) : v.f1067g;
    }
}
