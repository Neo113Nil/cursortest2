package e7;

import java.util.HashMap;
import k7.C4661b;
import k7.C4662c;
import k7.C4663d;
import k7.C4664e;
import k7.C4665f;
import k7.C4667h;

/* renamed from: e7.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC4479a {

    /* renamed from: a, reason: collision with root package name */
    public static final HashMap f37333a;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(com.anythink.core.express.b.a.f17688f, C4662c.f38818a);
        hashMap.put("sum", C4667h.f38825a);
        hashMap.put("last_value", C4665f.f38823a);
        hashMap.put("drop", C4663d.f38820a);
        C4664e c4664e = C4664e.f38821b;
        hashMap.put("explicit_bucket_histogram", c4664e);
        hashMap.put("base2_exponential_bucket_histogram", C4661b.f38817a);
        HashMap hashMap2 = new HashMap();
        f37333a = hashMap2;
        hashMap2.put(C4662c.class, com.anythink.core.express.b.a.f17688f);
        hashMap2.put(C4667h.class, "sum");
        hashMap2.put(C4665f.class, "last_value");
        hashMap2.put(C4663d.class, "drop");
        hashMap2.put(c4664e.getClass(), "explicit_bucket_histogram");
        hashMap2.put(C4661b.class, "base2_exponential_bucket_histogram");
    }

    public static String a(c7.b bVar) {
        String str = (String) f37333a.get(bVar.getClass());
        if (str != null) {
            return str;
        }
        throw new IllegalStateException("Unrecognized aggregation ".concat(bVar.getClass().getName()));
    }
}
