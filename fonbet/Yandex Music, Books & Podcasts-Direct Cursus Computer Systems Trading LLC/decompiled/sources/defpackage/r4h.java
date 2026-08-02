package defpackage;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* loaded from: classes3.dex */
public abstract class r4h {
    static {
        fo[] foVarArr = {new fo(8, q4h.class)};
        HashMap hashMap = new HashMap();
        fo foVar = foVarArr[0];
        boolean containsKey = hashMap.containsKey(foVar.a);
        Class cls = foVar.a;
        if (containsKey) {
            xq0.x(tlm.i(cls, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
            return;
        }
        hashMap.put(cls, foVar);
        Class cls2 = foVarArr[0].a;
        Collections.unmodifiableMap(hashMap);
        int i = osn.CONFIG_NAME_FIELD_NUMBER;
        try {
            a();
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    public static void a() {
        msn.f(new ho(), true);
        msn.f(new ho(bo.class, new fo[]{new fo(0, q4h.class)}, 0), true);
        msn.g(new t4h());
    }
}
