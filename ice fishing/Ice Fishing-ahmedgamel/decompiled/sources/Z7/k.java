package Z7;

import X7.v;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    public static final String f4193a;

    /* renamed from: b, reason: collision with root package name */
    public static final long f4194b;

    /* renamed from: c, reason: collision with root package name */
    public static final int f4195c;

    /* renamed from: d, reason: collision with root package name */
    public static final int f4196d;

    /* renamed from: e, reason: collision with root package name */
    public static final long f4197e;

    /* renamed from: f, reason: collision with root package name */
    public static final g f4198f;

    /* renamed from: g, reason: collision with root package name */
    public static final N6.i f4199g;

    /* renamed from: h, reason: collision with root package name */
    public static final N6.i f4200h;

    static {
        String str;
        int i = v.f3817a;
        try {
            str = System.getProperty("kotlinx.coroutines.scheduler.default.name");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str == null) {
            str = "DefaultDispatcher";
        }
        f4193a = str;
        f4194b = X7.a.j("kotlinx.coroutines.scheduler.resolution.ns", 100000L, 1L, Long.MAX_VALUE);
        int i4 = v.f3817a;
        if (i4 < 2) {
            i4 = 2;
        }
        f4195c = X7.a.k(i4, 8, "kotlinx.coroutines.scheduler.core.pool.size");
        f4196d = X7.a.k(2097150, 4, "kotlinx.coroutines.scheduler.max.pool.size");
        f4197e = TimeUnit.SECONDS.toNanos(X7.a.j("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 1L, Long.MAX_VALUE));
        f4198f = g.f4188a;
        f4199g = new N6.i(0, 1);
        f4200h = new N6.i(1, 1);
    }
}
