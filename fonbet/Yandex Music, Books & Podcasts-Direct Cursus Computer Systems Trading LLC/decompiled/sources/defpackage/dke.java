package defpackage;

import java.util.HashMap;

/* loaded from: classes3.dex */
public abstract class dke {
    public static final tf6 a = gld.e(dm6.b);
    public static final HashMap b = new HashMap();

    public static p7b a(qke qkeVar) {
        String str = qkeVar.a;
        HashMap hashMap = b;
        p7b p7bVar = (p7b) hashMap.get(str);
        if (p7bVar != null) {
            return p7bVar;
        }
        p7b p7bVar2 = new p7b(a, qkeVar);
        hashMap.put(str, p7bVar2);
        return p7bVar2;
    }
}
