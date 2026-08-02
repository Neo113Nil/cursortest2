package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import kotlin.ranges.IntRange;

/* loaded from: classes5.dex */
public class u75 extends t75 {
    public static ArrayList d(Object... objArr) {
        return objArr.length == 0 ? new ArrayList() : new ArrayList(new rx0(objArr, true));
    }

    public static int e(List list, Comparable comparable) {
        int size = list.size();
        list.getClass();
        l(list.size(), size);
        int i = size - 1;
        int i2 = 0;
        while (i2 <= i) {
            int i3 = (i2 + i) >>> 1;
            int b = gl5.b((Comparable) list.get(i3), comparable);
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

    public static IntRange f(Collection collection) {
        collection.getClass();
        return new IntRange(0, collection.size() - 1, 1);
    }

    public static int g(List list) {
        list.getClass();
        return list.size() - 1;
    }

    public static List h(Object... objArr) {
        objArr.getClass();
        if (objArr.length <= 0) {
            return c5b.a;
        }
        List asList = Arrays.asList(objArr);
        asList.getClass();
        return asList;
    }

    public static List i(Object obj) {
        return obj != null ? t75.c(obj) : c5b.a;
    }

    public static ArrayList j(Object... objArr) {
        return objArr.length == 0 ? new ArrayList() : new ArrayList(new rx0(objArr, true));
    }

    public static final List k(ArrayList arrayList) {
        int size = arrayList.size();
        return size != 0 ? size != 1 ? arrayList : t75.c(arrayList.get(0)) : c5b.a;
    }

    public static final void l(int i, int i2) {
        if (i2 < 0) {
            xq0.x(dfi.c(i2, "fromIndex (0) is greater than toIndex (", ")."));
        } else {
            if (i2 <= i) {
                return;
            }
            e7o.o(dfi.f("toIndex (", i2, i, ") is greater than size (", ")."));
        }
    }

    public static void m() {
        throw new ArithmeticException("Count overflow has happened.");
    }

    public static void n() {
        throw new ArithmeticException("Index overflow has happened.");
    }
}
