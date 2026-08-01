package i7;

import java.util.HashMap;
import o7.C4803b;
import o7.C4804c;
import o7.C4805d;
import o7.C4806e;
import o7.C4807f;
import o7.C4809h;

/* renamed from: i7.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC4590a {

    /* renamed from: a, reason: collision with root package name */
    public static final HashMap f38064a;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(com.anythink.core.express.b.a.f17530f, C4804c.f39642a);
        hashMap.put("sum", C4809h.f39649a);
        hashMap.put("last_value", C4807f.f39647a);
        hashMap.put("drop", C4805d.f39644a);
        C4806e c4806e = C4806e.f39645b;
        hashMap.put("explicit_bucket_histogram", c4806e);
        hashMap.put("base2_exponential_bucket_histogram", C4803b.f39641a);
        HashMap hashMap2 = new HashMap();
        f38064a = hashMap2;
        hashMap2.put(C4804c.class, com.anythink.core.express.b.a.f17530f);
        hashMap2.put(C4809h.class, "sum");
        hashMap2.put(C4807f.class, "last_value");
        hashMap2.put(C4805d.class, "drop");
        hashMap2.put(c4806e.getClass(), "explicit_bucket_histogram");
        hashMap2.put(C4803b.class, "base2_exponential_bucket_histogram");
    }

    public static String a(g7.b bVar) {
        String str = (String) f38064a.get(bVar.getClass());
        if (str != null) {
            return str;
        }
        throw new IllegalStateException("Unrecognized aggregation ".concat(bVar.getClass().getName()));
    }
}
