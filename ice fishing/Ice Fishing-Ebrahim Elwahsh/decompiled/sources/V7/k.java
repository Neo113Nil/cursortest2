package V7;

import T7.w;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    public static final String f3359a;

    /* renamed from: b, reason: collision with root package name */
    public static final long f3360b;

    /* renamed from: c, reason: collision with root package name */
    public static final int f3361c;

    /* renamed from: d, reason: collision with root package name */
    public static final int f3362d;

    /* renamed from: e, reason: collision with root package name */
    public static final long f3363e;

    /* renamed from: f, reason: collision with root package name */
    public static final g f3364f;

    /* renamed from: g, reason: collision with root package name */
    public static final J6.i f3365g;

    /* renamed from: h, reason: collision with root package name */
    public static final J6.i f3366h;

    static {
        String str;
        int i = w.f3171a;
        try {
            str = System.getProperty("kotlinx.coroutines.scheduler.default.name");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str == null) {
            str = "DefaultDispatcher";
        }
        f3359a = str;
        f3360b = T7.a.j("kotlinx.coroutines.scheduler.resolution.ns", 100000L, 1L, Long.MAX_VALUE);
        int i4 = w.f3171a;
        if (i4 < 2) {
            i4 = 2;
        }
        f3361c = T7.a.k(i4, 8, "kotlinx.coroutines.scheduler.core.pool.size");
        f3362d = T7.a.k(2097150, 4, "kotlinx.coroutines.scheduler.max.pool.size");
        f3363e = TimeUnit.SECONDS.toNanos(T7.a.j("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 1L, Long.MAX_VALUE));
        f3364f = g.f3354a;
        f3365g = new J6.i(0, 1);
        f3366h = new J6.i(1, 1);
    }
}
