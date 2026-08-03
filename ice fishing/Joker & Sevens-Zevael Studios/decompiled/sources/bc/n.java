package bc;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public abstract class n extends i7.b {
    public static ArrayList J(Object... objArr) {
        return objArr.length == 0 ? new ArrayList() : new ArrayList(new j(objArr, true));
    }

    public static int K(List list) {
        pc.j.e(list, "<this>");
        return list.size() - 1;
    }

    public static List L(Object... objArr) {
        pc.j.e(objArr, "elements");
        return objArr.length > 0 ? l.N(objArr) : v.f1067g;
    }

    public static ArrayList M(Object... objArr) {
        return objArr.length == 0 ? new ArrayList() : new ArrayList(new j(objArr, true));
    }

    public static void N() {
        throw new ArithmeticException("Index overflow has happened.");
    }
}
