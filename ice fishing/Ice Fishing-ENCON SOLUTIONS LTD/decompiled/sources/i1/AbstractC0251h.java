package i1;

import a.AbstractC0083a;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: i1.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0251h extends R1.l {
    public static List L(Object[] objArr) {
        kotlin.jvm.internal.i.e(objArr, "<this>");
        List asList = Arrays.asList(objArr);
        kotlin.jvm.internal.i.d(asList, "asList(...)");
        return asList;
    }

    public static void M(int i2, int i3, int i4, byte[] bArr, byte[] destination) {
        kotlin.jvm.internal.i.e(bArr, "<this>");
        kotlin.jvm.internal.i.e(destination, "destination");
        System.arraycopy(bArr, i3, destination, i2, i4 - i3);
    }

    public static final void N(Object[] objArr, Object[] destination, int i2, int i3, int i4) {
        kotlin.jvm.internal.i.e(objArr, "<this>");
        kotlin.jvm.internal.i.e(destination, "destination");
        System.arraycopy(objArr, i3, destination, i2, i4 - i3);
    }

    public static byte[] O(byte[] bArr, int i2, int i3) {
        kotlin.jvm.internal.i.e(bArr, "<this>");
        int length = bArr.length;
        if (i3 <= length) {
            byte[] copyOfRange = Arrays.copyOfRange(bArr, i2, i3);
            kotlin.jvm.internal.i.d(copyOfRange, "copyOfRange(...)");
            return copyOfRange;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i3 + ") is greater than size (" + length + ").");
    }

    public static void P(Object[] objArr, int i2, int i3) {
        kotlin.jvm.internal.i.e(objArr, "<this>");
        Arrays.fill(objArr, i2, i3, (Object) null);
    }

    public static Object Q(int i2, Object[] objArr) {
        kotlin.jvm.internal.i.e(objArr, "<this>");
        if (i2 < 0 || i2 >= objArr.length) {
            return null;
        }
        return objArr[i2];
    }

    public static String R(Object[] objArr, CharSequence separator, CharSequence prefix, CharSequence postfix, int i2, CharSequence truncated, t1.l lVar) {
        kotlin.jvm.internal.i.e(objArr, "<this>");
        kotlin.jvm.internal.i.e(separator, "separator");
        kotlin.jvm.internal.i.e(prefix, "prefix");
        kotlin.jvm.internal.i.e(postfix, "postfix");
        kotlin.jvm.internal.i.e(truncated, "truncated");
        StringBuilder sb = new StringBuilder();
        sb.append(prefix);
        int i3 = 0;
        for (Object obj : objArr) {
            i3++;
            if (i3 > 1) {
                sb.append(separator);
            }
            if (i2 >= 0 && i3 > i2) {
                break;
            }
            R1.l.a(sb, obj, lVar);
        }
        if (i2 >= 0 && i3 > i2) {
            sb.append(truncated);
        }
        sb.append(postfix);
        return sb.toString();
    }

    public static final void S(Object[] objArr, AbstractSet abstractSet) {
        kotlin.jvm.internal.i.e(objArr, "<this>");
        for (Object obj : objArr) {
            abstractSet.add(obj);
        }
    }

    public static List T(int[] iArr) {
        kotlin.jvm.internal.i.e(iArr, "<this>");
        int length = iArr.length;
        if (length == 0) {
            return r.f3416a;
        }
        if (length == 1) {
            return AbstractC0083a.m(Integer.valueOf(iArr[0]));
        }
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i2 : iArr) {
            arrayList.add(Integer.valueOf(i2));
        }
        return arrayList;
    }

    public static List U(Object[] objArr) {
        kotlin.jvm.internal.i.e(objArr, "<this>");
        int length = objArr.length;
        return length != 0 ? length != 1 ? new ArrayList(new C0249f(objArr, false)) : AbstractC0083a.m(objArr[0]) : r.f3416a;
    }
}
