package v7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: v7.i, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC5118i extends X2.a {
    public static Object A(Object[] objArr, int i) {
        kotlin.jvm.internal.h.e(objArr, "<this>");
        if (i < 0 || i >= objArr.length) {
            return null;
        }
        return objArr[i];
    }

    public static List B(Object[] objArr) {
        int length = objArr.length;
        return length != 0 ? length != 1 ? new ArrayList(new C5116g(objArr, false)) : Z2.d.n(objArr[0]) : C5125p.f41221n;
    }

    public static List t(Object[] objArr) {
        kotlin.jvm.internal.h.e(objArr, "<this>");
        List asList = Arrays.asList(objArr);
        kotlin.jvm.internal.h.d(asList, "asList(...)");
        return asList;
    }

    public static void u(int i, int i4, int i6, Object[] objArr, Object[] destination) {
        kotlin.jvm.internal.h.e(objArr, "<this>");
        kotlin.jvm.internal.h.e(destination, "destination");
        System.arraycopy(objArr, i4, destination, i, i6 - i4);
    }

    public static void v(byte[] bArr, int i, byte[] destination, int i4, int i6) {
        kotlin.jvm.internal.h.e(bArr, "<this>");
        kotlin.jvm.internal.h.e(destination, "destination");
        System.arraycopy(bArr, i4, destination, i, i6 - i4);
    }

    public static byte[] w(byte[] bArr, int i, int i4) {
        kotlin.jvm.internal.h.e(bArr, "<this>");
        X2.a.e(i4, bArr.length);
        byte[] copyOfRange = Arrays.copyOfRange(bArr, i, i4);
        kotlin.jvm.internal.h.d(copyOfRange, "copyOfRange(...)");
        return copyOfRange;
    }

    public static Object[] x(Object[] objArr, int i, int i4) {
        kotlin.jvm.internal.h.e(objArr, "<this>");
        X2.a.e(i4, objArr.length);
        Object[] copyOfRange = Arrays.copyOfRange(objArr, i, i4);
        kotlin.jvm.internal.h.d(copyOfRange, "copyOfRange(...)");
        return copyOfRange;
    }

    public static void y(Object[] objArr, int i, int i4) {
        kotlin.jvm.internal.h.e(objArr, "<this>");
        Arrays.fill(objArr, i, i4, (Object) null);
    }

    public static ArrayList z(Object[] objArr) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : objArr) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
