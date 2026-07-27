package R0;

import P0.AbstractC0068a;
import P0.x;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    public static final String f966a;

    /* renamed from: b, reason: collision with root package name */
    public static final long f967b;

    /* renamed from: c, reason: collision with root package name */
    public static final int f968c;

    /* renamed from: d, reason: collision with root package name */
    public static final int f969d;

    /* renamed from: e, reason: collision with root package name */
    public static final long f970e;

    /* renamed from: f, reason: collision with root package name */
    public static final f f971f;

    /* renamed from: g, reason: collision with root package name */
    public static final i f972g;

    /* renamed from: h, reason: collision with root package name */
    public static final i f973h;

    static {
        String str;
        int i2 = x.f907a;
        try {
            str = System.getProperty("kotlinx.coroutines.scheduler.default.name");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str == null) {
            str = "DefaultDispatcher";
        }
        f966a = str;
        f967b = AbstractC0068a.k("kotlinx.coroutines.scheduler.resolution.ns", 100000L, 1L, Long.MAX_VALUE);
        int i3 = x.f907a;
        if (i3 < 2) {
            i3 = 2;
        }
        f968c = AbstractC0068a.l("kotlinx.coroutines.scheduler.core.pool.size", i3, 1, 0, 8);
        f969d = AbstractC0068a.l("kotlinx.coroutines.scheduler.max.pool.size", 2097150, 0, 2097150, 4);
        f970e = TimeUnit.SECONDS.toNanos(AbstractC0068a.k("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 1L, Long.MAX_VALUE));
        f971f = f.f960a;
        f972g = new i(0);
        f973h = new i(1);
    }
}
