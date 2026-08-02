package defpackage;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* loaded from: classes.dex */
public abstract class x9j {
    static {
        g2f0[] g2f0VarArr = {new jf1(5, w9j.class)};
        HashMap hashMap = new HashMap();
        for (g2f0 g2f0Var : g2f0VarArr) {
            boolean containsKey = hashMap.containsKey(g2f0Var.a);
            Class cls = g2f0Var.a;
            if (containsKey) {
                vg10.g(cls.getCanonicalName(), "KeyTypeManager constructed with duplicate factories for primitive ");
                return;
            }
            hashMap.put(cls, g2f0Var);
        }
        if (g2f0VarArr.length > 0) {
            Class cls2 = g2f0VarArr[0].a;
        }
        Collections.unmodifiableMap(hashMap);
        int i = qri0.CONFIG_NAME_FIELD_NUMBER;
        try {
            a();
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    public static void a() {
        nri0.g(baj.b);
        if (yez0.a()) {
            return;
        }
        nri0.e(new lf1(hi1.class, new g2f0[]{new jf1(5, w9j.class)}, 5), true);
        md90 md90Var = oi1.a;
        jz40 jz40Var = jz40.b;
        jz40Var.e(oi1.a);
        jz40Var.d(oi1.b);
        jz40Var.c(oi1.c);
        jz40Var.b(oi1.d);
    }
}
