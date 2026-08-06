package i1;

import a.AbstractC0083a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: i1.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0253j extends AbstractC0083a {
    public static List B(Object... elements) {
        kotlin.jvm.internal.i.e(elements, "elements");
        return elements.length > 0 ? AbstractC0251h.L(elements) : r.f3416a;
    }

    public static ArrayList C(Object... objArr) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : objArr) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static void D() {
        throw new ArithmeticException("Index overflow has happened.");
    }
}
