package v7;

import java.util.ArrayList;
import java.util.List;

/* renamed from: v7.k, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC5130k extends d6.c {
    public static int u(List list) {
        kotlin.jvm.internal.h.e(list, "<this>");
        return list.size() - 1;
    }

    public static List v(Object... elements) {
        kotlin.jvm.internal.h.e(elements, "elements");
        return elements.length > 0 ? AbstractC5128i.q(elements) : C5135p.f41439n;
    }

    public static ArrayList w(Object... objArr) {
        return objArr.length == 0 ? new ArrayList() : new ArrayList(new C5126g(objArr, true));
    }

    public static void x() {
        throw new ArithmeticException("Index overflow has happened.");
    }
}
