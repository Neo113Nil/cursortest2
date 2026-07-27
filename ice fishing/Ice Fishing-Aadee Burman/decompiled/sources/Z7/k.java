package Z7;

import X7.v;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    public static final String f4215a;

    /* renamed from: b, reason: collision with root package name */
    public static final long f4216b;

    /* renamed from: c, reason: collision with root package name */
    public static final int f4217c;

    /* renamed from: d, reason: collision with root package name */
    public static final int f4218d;

    /* renamed from: e, reason: collision with root package name */
    public static final long f4219e;

    /* renamed from: f, reason: collision with root package name */
    public static final g f4220f;

    /* renamed from: g, reason: collision with root package name */
    public static final N6.i f4221g;

    /* renamed from: h, reason: collision with root package name */
    public static final N6.i f4222h;

    static {
        String str;
        int i = v.f3862a;
        try {
            str = System.getProperty("kotlinx.coroutines.scheduler.default.name");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str == null) {
            str = "DefaultDispatcher";
        }
        f4215a = str;
        f4216b = X7.a.j("kotlinx.coroutines.scheduler.resolution.ns", 100000L, 1L, Long.MAX_VALUE);
        int i6 = v.f3862a;
        if (i6 < 2) {
            i6 = 2;
        }
        f4217c = X7.a.k(i6, 8, "kotlinx.coroutines.scheduler.core.pool.size");
        f4218d = X7.a.k(2097150, 4, "kotlinx.coroutines.scheduler.max.pool.size");
        f4219e = TimeUnit.SECONDS.toNanos(X7.a.j("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 1L, Long.MAX_VALUE));
        f4220f = g.f4210a;
        f4221g = new N6.i(0, 1);
        f4222h = new N6.i(1, 1);
    }
}
