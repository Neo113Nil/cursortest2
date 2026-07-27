package g8;

import u7.C5090h;

/* loaded from: classes2.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final int f37708a;

    static {
        Object f3;
        try {
            String property = System.getProperty("kotlinx.serialization.json.pool.size");
            kotlin.jvm.internal.h.d(property, "getProperty(...)");
            f3 = Q7.q.S(property);
        } catch (Throwable th) {
            f3 = com.bumptech.glide.d.f(th);
        }
        if (f3 instanceof C5090h) {
            f3 = null;
        }
        Integer num = (Integer) f3;
        f37708a = num != null ? num.intValue() : 2097152;
    }
}
