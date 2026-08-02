package i7;

import java.util.HashMap;
import o7.C4807b;
import o7.C4808c;
import o7.C4809d;
import o7.C4810e;
import o7.C4811f;
import o7.C4813h;

/* renamed from: i7.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC4599a {

    /* renamed from: a, reason: collision with root package name */
    public static final HashMap f38183a;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(com.anythink.core.express.b.a.f18317f, C4808c.f39750a);
        hashMap.put("sum", C4813h.f39757a);
        hashMap.put("last_value", C4811f.f39755a);
        hashMap.put("drop", C4809d.f39752a);
        C4810e c4810e = C4810e.f39753b;
        hashMap.put("explicit_bucket_histogram", c4810e);
        hashMap.put("base2_exponential_bucket_histogram", C4807b.f39749a);
        HashMap hashMap2 = new HashMap();
        f38183a = hashMap2;
        hashMap2.put(C4808c.class, com.anythink.core.express.b.a.f18317f);
        hashMap2.put(C4813h.class, "sum");
        hashMap2.put(C4811f.class, "last_value");
        hashMap2.put(C4809d.class, "drop");
        hashMap2.put(c4810e.getClass(), "explicit_bucket_histogram");
        hashMap2.put(C4807b.class, "base2_exponential_bucket_histogram");
    }

    public static String a(g7.b bVar) {
        String str = (String) f38183a.get(bVar.getClass());
        if (str != null) {
            return str;
        }
        throw new IllegalStateException("Unrecognized aggregation ".concat(bVar.getClass().getName()));
    }
}
