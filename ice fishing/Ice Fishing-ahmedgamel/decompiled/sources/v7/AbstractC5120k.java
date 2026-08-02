package v7;

import java.util.ArrayList;
import java.util.List;

/* renamed from: v7.k, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC5120k extends Z2.d {
    public static int s(List list) {
        kotlin.jvm.internal.h.e(list, "<this>");
        return list.size() - 1;
    }

    public static List t(Object... elements) {
        kotlin.jvm.internal.h.e(elements, "elements");
        return elements.length > 0 ? AbstractC5118i.t(elements) : C5125p.f41221n;
    }

    public static ArrayList u(Object... objArr) {
        return objArr.length == 0 ? new ArrayList() : new ArrayList(new C5116g(objArr, true));
    }

    public static void v() {
        throw new ArithmeticException("Index overflow has happened.");
    }
}
