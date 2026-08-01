package u1;

import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public abstract class h extends h0.f {
    public static int E(List list) {
        D1.i.e(list, "<this>");
        return list.size() - 1;
    }

    public static List F(Object... objArr) {
        if (objArr.length <= 0) {
            return o.f4473a;
        }
        List asList = Arrays.asList(objArr);
        D1.i.d(asList, "asList(...)");
        return asList;
    }

    public static final List G(List list) {
        int size = list.size();
        return size != 0 ? size != 1 ? list : h0.f.s(list.get(0)) : o.f4473a;
    }

    public static void H() {
        throw new ArithmeticException("Index overflow has happened.");
    }
}
