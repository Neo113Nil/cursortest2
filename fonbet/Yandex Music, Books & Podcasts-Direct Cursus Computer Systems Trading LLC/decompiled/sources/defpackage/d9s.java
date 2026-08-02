package defpackage;

import java.util.EnumSet;

/* loaded from: classes3.dex */
public abstract class d9s {
    public static volatile b9s[] a = {b9s.a};
    public static final EnumSet b;

    static {
        EnumSet allOf = EnumSet.allOf(c9s.class);
        allOf.getClass();
        b = allOf;
    }

    public static boolean a(b9s b9sVar) {
        b9s[] b9sVarArr = a;
        b9s[] b9sVarArr2 = {b9s.a, b9sVar};
        b9sVarArr.getClass();
        int i = 0;
        while (true) {
            if (i >= 2) {
                i = -1;
                break;
            }
            if (xz0.u(b9sVarArr, b9sVarArr2[i])) {
                break;
            }
            i++;
        }
        return i != -1;
    }
}
