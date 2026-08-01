package v7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: v7.i, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC5128i extends com.bumptech.glide.h {
    public static List q(Object[] objArr) {
        kotlin.jvm.internal.h.e(objArr, "<this>");
        List asList = Arrays.asList(objArr);
        kotlin.jvm.internal.h.d(asList, "asList(...)");
        return asList;
    }

    public static void r(int i, int i6, int i9, Object[] objArr, Object[] destination) {
        kotlin.jvm.internal.h.e(objArr, "<this>");
        kotlin.jvm.internal.h.e(destination, "destination");
        System.arraycopy(objArr, i6, destination, i, i9 - i6);
    }

    public static void s(byte[] bArr, int i, byte[] destination, int i6, int i9) {
        kotlin.jvm.internal.h.e(bArr, "<this>");
        kotlin.jvm.internal.h.e(destination, "destination");
        System.arraycopy(bArr, i6, destination, i, i9 - i6);
    }

    public static byte[] t(byte[] bArr, int i, int i6) {
        kotlin.jvm.internal.h.e(bArr, "<this>");
        com.bumptech.glide.h.d(i6, bArr.length);
        byte[] copyOfRange = Arrays.copyOfRange(bArr, i, i6);
        kotlin.jvm.internal.h.d(copyOfRange, "copyOfRange(...)");
        return copyOfRange;
    }

    public static Object[] u(Object[] objArr, int i, int i6) {
        kotlin.jvm.internal.h.e(objArr, "<this>");
        com.bumptech.glide.h.d(i6, objArr.length);
        Object[] copyOfRange = Arrays.copyOfRange(objArr, i, i6);
        kotlin.jvm.internal.h.d(copyOfRange, "copyOfRange(...)");
        return copyOfRange;
    }

    public static void v(Object[] objArr, int i, int i6) {
        kotlin.jvm.internal.h.e(objArr, "<this>");
        Arrays.fill(objArr, i, i6, (Object) null);
    }

    public static ArrayList w(Object[] objArr) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : objArr) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static Object x(Object[] objArr, int i) {
        kotlin.jvm.internal.h.e(objArr, "<this>");
        if (i < 0 || i >= objArr.length) {
            return null;
        }
        return objArr[i];
    }

    public static List y(Object[] objArr) {
        int length = objArr.length;
        return length != 0 ? length != 1 ? new ArrayList(new C5126g(objArr, false)) : d6.c.k(objArr[0]) : C5135p.f41442n;
    }
}
