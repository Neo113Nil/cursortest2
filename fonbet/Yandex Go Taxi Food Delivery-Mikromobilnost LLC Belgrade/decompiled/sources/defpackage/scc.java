package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import kotlin.collections.EmptyList;

/* loaded from: classes9.dex */
public class scc extends rcc {
    public static ArrayList c(Object... objArr) {
        return objArr.length == 0 ? new ArrayList() : new ArrayList(new n43(objArr, true));
    }

    public static int d(ArrayList arrayList, Comparable comparable) {
        int size = arrayList.size();
        k(arrayList.size(), size);
        int i = size - 1;
        int i2 = 0;
        while (i2 <= i) {
            int i3 = (i2 + i) >>> 1;
            int b = uvc.b((Comparable) arrayList.get(i3), comparable);
            if (b < 0) {
                i2 = i3 + 1;
            } else {
                if (b <= 0) {
                    return i3;
                }
                i = i3 - 1;
            }
        }
        return -(i2 + 1);
    }

    public static d6w e(Collection collection) {
        return new d6w(0, collection.size() - 1, 1);
    }

    public static int f(List list) {
        return list.size() - 1;
    }

    public static List g(Object... objArr) {
        return objArr.length > 0 ? Arrays.asList(objArr) : EmptyList.a;
    }

    public static List h(Object obj) {
        return obj != null ? Collections.singletonList(obj) : EmptyList.a;
    }

    public static ArrayList i(Object... objArr) {
        return objArr.length == 0 ? new ArrayList() : new ArrayList(new n43(objArr, true));
    }

    public static final List j(List list) {
        int size = list.size();
        return size != 0 ? size != 1 ? list : Collections.singletonList(list.get(0)) : EmptyList.a;
    }

    public static final void k(int i, int i2) {
        if (i2 < 0) {
            ny61.g(oyr.j(i2, "fromIndex (0) is greater than toIndex (", ")."));
        } else {
            if (i2 <= i) {
                return;
            }
            ny61.m(b64.d(i2, i, "toIndex (", ") is greater than size (", ")."));
        }
    }

    public static void l() {
        throw new ArithmeticException("Count overflow has happened.");
    }

    public static void m() {
        throw new ArithmeticException("Index overflow has happened.");
    }
}
