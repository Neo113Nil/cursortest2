package defpackage;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* loaded from: classes3.dex */
public abstract class mz7 {
    public static final /* synthetic */ int a = 0;

    static {
        fo[] foVarArr = {new fo(6, lz7.class)};
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
            msn.f(new ho(ip.class, new fo[]{new fo(6, lz7.class)}, 5), true);
            msn.g(new oz7());
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }
}
