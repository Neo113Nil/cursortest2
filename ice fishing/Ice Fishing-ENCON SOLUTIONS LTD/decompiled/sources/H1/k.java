package H1;

import F1.w;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    public static final String f692a;

    /* renamed from: b, reason: collision with root package name */
    public static final long f693b;

    /* renamed from: c, reason: collision with root package name */
    public static final int f694c;

    /* renamed from: d, reason: collision with root package name */
    public static final int f695d;

    /* renamed from: e, reason: collision with root package name */
    public static final long f696e;

    /* renamed from: f, reason: collision with root package name */
    public static final f f697f;

    /* renamed from: g, reason: collision with root package name */
    public static final i f698g;

    /* renamed from: h, reason: collision with root package name */
    public static final i f699h;

    static {
        String str;
        int i2 = w.f633a;
        try {
            str = System.getProperty("kotlinx.coroutines.scheduler.default.name");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str == null) {
            str = "DefaultDispatcher";
        }
        f692a = str;
        f693b = F1.a.j("kotlinx.coroutines.scheduler.resolution.ns", 100000L, 1L, Long.MAX_VALUE);
        int i3 = w.f633a;
        if (i3 < 2) {
            i3 = 2;
        }
        f694c = F1.a.k("kotlinx.coroutines.scheduler.core.pool.size", i3, 1, 0, 8);
        f695d = F1.a.k("kotlinx.coroutines.scheduler.max.pool.size", 2097150, 0, 2097150, 4);
        f696e = TimeUnit.SECONDS.toNanos(F1.a.j("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 1L, Long.MAX_VALUE));
        f697f = f.f686a;
        f698g = new i(0);
        f699h = new i(1);
    }
}
