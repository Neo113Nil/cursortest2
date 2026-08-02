package defpackage;

import java.util.Collections;
import java.util.HashMap;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes.dex */
public final class w6b {
    public static final w6b b;
    public static final /* synthetic */ w6b[] c;
    public final qec a;

    static {
        jp o = kp.o();
        o.d();
        kp.m((kp) o.b);
        kp kpVar = (kp) o.b();
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
        w6b w6bVar = new w6b(qec.U("type.googleapis.com/google.crypto.tink.AesSivKey", kpVar.c()));
        b = w6bVar;
        c = new w6b[]{w6bVar};
    }

    public w6b(qec qecVar) {
        this.a = qecVar;
    }

    public static w6b valueOf(String str) {
        return (w6b) Enum.valueOf(w6b.class, str);
    }

    public static w6b[] values() {
        return (w6b[]) c.clone();
    }
}
