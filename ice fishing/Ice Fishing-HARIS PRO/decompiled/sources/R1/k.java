package R1;

import Q1.v;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    public static final String f1043a;

    /* renamed from: b, reason: collision with root package name */
    public static final long f1044b;

    /* renamed from: c, reason: collision with root package name */
    public static final int f1045c;

    /* renamed from: d, reason: collision with root package name */
    public static final int f1046d;
    public static final long e;

    /* renamed from: f, reason: collision with root package name */
    public static final f f1047f;

    /* renamed from: g, reason: collision with root package name */
    public static final i f1048g;

    /* renamed from: h, reason: collision with root package name */
    public static final i f1049h;

    static {
        String str;
        int i = v.f974a;
        try {
            str = System.getProperty("kotlinx.coroutines.scheduler.default.name");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str == null) {
            str = "DefaultDispatcher";
        }
        f1043a = str;
        f1044b = Q1.a.i("kotlinx.coroutines.scheduler.resolution.ns", 100000L, 1L, Long.MAX_VALUE);
        int i2 = v.f974a;
        if (i2 < 2) {
            i2 = 2;
        }
        f1045c = Q1.a.j("kotlinx.coroutines.scheduler.core.pool.size", i2, 1, 0, 8);
        f1046d = Q1.a.j("kotlinx.coroutines.scheduler.max.pool.size", 2097150, 0, 2097150, 4);
        e = TimeUnit.SECONDS.toNanos(Q1.a.i("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 1L, Long.MAX_VALUE));
        f1047f = f.f1037a;
        f1048g = new i(0);
        f1049h = new i(1);
    }
}
