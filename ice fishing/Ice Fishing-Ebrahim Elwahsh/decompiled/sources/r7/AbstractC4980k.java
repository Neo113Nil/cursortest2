package r7;

import java.util.ArrayList;
import java.util.List;

/* renamed from: r7.k, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC4980k extends p8.g {
    public static int A(List list) {
        kotlin.jvm.internal.h.e(list, "<this>");
        return list.size() - 1;
    }

    public static List B(Object... elements) {
        kotlin.jvm.internal.h.e(elements, "elements");
        return elements.length > 0 ? AbstractC4978i.H(elements) : C4985p.f40358n;
    }

    public static ArrayList C(Object... objArr) {
        return objArr.length == 0 ? new ArrayList() : new ArrayList(new C4976g(objArr, true));
    }

    public static void D() {
        throw new ArithmeticException("Index overflow has happened.");
    }
}
