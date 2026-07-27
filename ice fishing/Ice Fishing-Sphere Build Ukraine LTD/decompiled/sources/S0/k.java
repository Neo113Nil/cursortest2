package S0;

import Q0.AbstractC0068a;
import Q0.x;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    public static final String f977a;

    /* renamed from: b, reason: collision with root package name */
    public static final long f978b;

    /* renamed from: c, reason: collision with root package name */
    public static final int f979c;

    /* renamed from: d, reason: collision with root package name */
    public static final int f980d;

    /* renamed from: e, reason: collision with root package name */
    public static final long f981e;

    /* renamed from: f, reason: collision with root package name */
    public static final f f982f;

    /* renamed from: g, reason: collision with root package name */
    public static final i f983g;

    /* renamed from: h, reason: collision with root package name */
    public static final i f984h;

    static {
        String str;
        int i2 = x.f916a;
        try {
            str = System.getProperty("kotlinx.coroutines.scheduler.default.name");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str == null) {
            str = "DefaultDispatcher";
        }
        f977a = str;
        f978b = AbstractC0068a.k("kotlinx.coroutines.scheduler.resolution.ns", 100000L, 1L, Long.MAX_VALUE);
        int i3 = x.f916a;
        if (i3 < 2) {
            i3 = 2;
        }
        f979c = AbstractC0068a.l("kotlinx.coroutines.scheduler.core.pool.size", i3, 1, 0, 8);
        f980d = AbstractC0068a.l("kotlinx.coroutines.scheduler.max.pool.size", 2097150, 0, 2097150, 4);
        f981e = TimeUnit.SECONDS.toNanos(AbstractC0068a.k("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 1L, Long.MAX_VALUE));
        f982f = f.f971a;
        f983g = new i(0);
        f984h = new i(1);
    }
}
