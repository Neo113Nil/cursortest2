package fd;

import dd.x;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public abstract class l {

    /* renamed from: a, reason: collision with root package name */
    public static final String f2386a;

    /* renamed from: b, reason: collision with root package name */
    public static final long f2387b;

    /* renamed from: c, reason: collision with root package name */
    public static final int f2388c;

    /* renamed from: d, reason: collision with root package name */
    public static final int f2389d;

    /* renamed from: e, reason: collision with root package name */
    public static final long f2390e;

    /* renamed from: f, reason: collision with root package name */
    public static final g f2391f;

    /* renamed from: g, reason: collision with root package name */
    public static final j f2392g;

    /* renamed from: h, reason: collision with root package name */
    public static final j f2393h;

    static {
        String str;
        int i10 = x.f1888a;
        try {
            str = System.getProperty("kotlinx.coroutines.scheduler.default.name");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str == null) {
            str = "DefaultDispatcher";
        }
        f2386a = str;
        f2387b = dd.a.i("kotlinx.coroutines.scheduler.resolution.ns", 100000L, 1L, Long.MAX_VALUE);
        int i11 = x.f1888a;
        if (i11 < 2) {
            i11 = 2;
        }
        f2388c = dd.a.j("kotlinx.coroutines.scheduler.core.pool.size", i11, 8);
        f2389d = dd.a.j("kotlinx.coroutines.scheduler.max.pool.size", 2097150, 4);
        f2390e = TimeUnit.SECONDS.toNanos(dd.a.i("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 1L, Long.MAX_VALUE));
        f2391f = g.f2380a;
        f2392g = new j(0);
        f2393h = new j(1);
    }
}
