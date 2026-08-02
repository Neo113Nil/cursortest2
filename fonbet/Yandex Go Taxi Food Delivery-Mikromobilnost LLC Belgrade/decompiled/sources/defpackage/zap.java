package defpackage;

import java.util.Collection;
import java.util.LinkedHashMap;

/* loaded from: classes2.dex */
public final class zap {
    public final String a;
    public final String b;
    public final bad0 c;
    public final n4u0 d;
    public final p5z e;
    public final lzs f;
    public final x75 g;

    public zap(String str, String str2, bad0 bad0Var, n4u0 n4u0Var, p5z p5zVar, lzs lzsVar, x75 x75Var) {
        this.a = str;
        this.b = str2;
        this.c = bad0Var;
        this.d = n4u0Var;
        this.e = p5zVar;
        this.f = lzsVar;
        this.g = x75Var;
    }

    public static void a(String str, LinkedHashMap linkedHashMap) {
        Collection collection = (Collection) linkedHashMap.get("available_features");
        if (collection == null) {
            collection = u4r0.d(str);
        } else if (!collection.contains(str)) {
            collection.add(str);
        }
        linkedHashMap.put("available_features", collection);
    }

    public static void b(String str, String str2, LinkedHashMap linkedHashMap) {
        linkedHashMap.put(str, scc.i(str2));
    }
}
