package defpackage;

import java.util.Collections;
import java.util.HashMap;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes.dex */
public final class x6b {
    public static final x6b b;
    public static final /* synthetic */ x6b[] c;
    public final qec a;

    static {
        ap o = bp.o();
        o.d();
        bp.m((bp) o.b);
        bp bpVar = (bp) o.b();
        fo[] foVarArr = {new fo(4, un.class)};
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
        x6b x6bVar = new x6b(qec.U("type.googleapis.com/google.crypto.tink.AesGcmKey", bpVar.c()));
        b = x6bVar;
        c = new x6b[]{x6bVar};
    }

    public x6b(qec qecVar) {
        this.a = qecVar;
    }

    public static x6b valueOf(String str) {
        return (x6b) Enum.valueOf(x6b.class, str);
    }

    public static x6b[] values() {
        return (x6b[]) c.clone();
    }
}
