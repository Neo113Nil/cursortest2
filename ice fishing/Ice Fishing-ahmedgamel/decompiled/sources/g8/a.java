package g8;

import u7.C5082h;

/* loaded from: classes2.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final int f37733a;

    static {
        Object b9;
        try {
            String property = System.getProperty("kotlinx.serialization.json.pool.size");
            kotlin.jvm.internal.h.d(property, "getProperty(...)");
            b9 = Q7.q.i0(property);
        } catch (Throwable th) {
            b9 = Q3.b.b(th);
        }
        if (b9 instanceof C5082h) {
            b9 = null;
        }
        Integer num = (Integer) b9;
        f37733a = num != null ? num.intValue() : 2097152;
    }
}
