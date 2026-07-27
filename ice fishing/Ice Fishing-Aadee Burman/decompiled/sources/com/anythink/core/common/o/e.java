package com.anythink.core.common.o;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Environment;
import android.os.StatFs;
import android.os.SystemClock;
import com.anythink.basead.exoplayer.f;
import com.anythink.basead.exoplayer.h.o;
import com.anythink.core.common.d.t;
import com.anythink.core.common.d.u;
import com.anythink.core.common.v.af;
import java.io.File;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class e {

    /* renamed from: d, reason: collision with root package name */
    private static e f15960d;

    /* renamed from: b, reason: collision with root package name */
    long f15962b;

    /* renamed from: f, reason: collision with root package name */
    private Context f15965f;

    /* renamed from: g, reason: collision with root package name */
    private ActivityManager f15966g;

    /* renamed from: h, reason: collision with root package name */
    private d f15967h;

    /* renamed from: j, reason: collision with root package name */
    private boolean f15968j;

    /* renamed from: k, reason: collision with root package name */
    private volatile Integer f15969k;

    /* renamed from: l, reason: collision with root package name */
    private volatile Integer f15970l;

    /* renamed from: m, reason: collision with root package name */
    private volatile Long f15971m;

    /* renamed from: e, reason: collision with root package name */
    private boolean f15964e = false;
    private final File i = Environment.getDataDirectory();

    /* renamed from: a, reason: collision with root package name */
    final long f15961a = f.f7187a;

    /* renamed from: c, reason: collision with root package name */
    AtomicInteger f15963c = new AtomicInteger();

    private e() {
        Context g4 = t.b().g();
        this.f15965f = g4;
        this.f15966g = (ActivityManager) g4.getSystemService("activity");
        this.f15967h = new d();
    }

    public static e a() {
        if (f15960d == null) {
            synchronized (e.class) {
                try {
                    if (f15960d == null) {
                        f15960d = new e();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f15960d;
    }

    private void i() {
        d dVar = this.f15967h;
        Context context = this.f15965f;
        ActivityManager activityManager = this.f15966g;
        int memoryClass = activityManager.getMemoryClass();
        if ((context.getApplicationContext().getApplicationInfo().flags & o.f7742d) == 1048576) {
            memoryClass = activityManager.getLargeMemoryClass();
        }
        dVar.f15955d = memoryClass;
        if (t.b().c("t_mem")) {
            return;
        }
        if (this.f15969k == null) {
            this.f15969k = Integer.valueOf(af.b(this.f15965f, u.b.f12847a, u.a.f12828g, -1));
        }
        if (this.f15969k.intValue() <= 0) {
            this.f15969k = Integer.valueOf(b.a());
            af.a(this.f15965f, u.b.f12847a, u.a.f12828g, this.f15969k.intValue());
        }
        this.f15967h.f15952a = this.f15969k.intValue();
    }

    private void j() {
        if (t.b().c("c_num")) {
            return;
        }
        if (this.f15970l == null) {
            this.f15970l = Integer.valueOf(af.b(this.f15965f, u.b.f12847a, u.a.f12829h, -1));
        }
        if (this.f15970l.intValue() <= 0) {
            this.f15970l = Integer.valueOf(Runtime.getRuntime().availableProcessors());
            af.a(this.f15965f, u.b.f12847a, u.a.f12829h, this.f15970l.intValue());
        }
        this.f15967h.f15956e = this.f15970l.intValue();
    }

    private void k() {
        if (t.b().c("t_store")) {
            return;
        }
        if (this.f15971m == null) {
            this.f15971m = Long.valueOf(af.b(this.f15965f, u.b.f12847a, u.a.i, -1L));
        }
        if (this.f15971m.longValue() <= 0) {
            try {
                this.f15971m = Long.valueOf((new StatFs(this.i.getPath()).getBlockCountLong() * r0.getBlockSize()) / 1048576);
            } catch (Throwable unused) {
            }
            af.a(this.f15965f, u.b.f12847a, u.a.i, this.f15971m.longValue());
        }
        this.f15967h.f15957f = this.f15971m.longValue();
    }

    private long l() {
        try {
            return (new StatFs(this.i.getPath()).getAvailableBlocksLong() * r0.getBlockSize()) / 1048576;
        } catch (Throwable unused) {
            return 0L;
        }
    }

    public final d b() {
        if (!this.f15964e) {
            return null;
        }
        if (SystemClock.elapsedRealtime() - this.f15962b <= f.f7187a) {
            return this.f15967h;
        }
        this.f15962b = SystemClock.elapsedRealtime();
        this.f15967h.f15959h = a.a();
        this.f15967h.f15953b = b.b();
        this.f15967h.f15958g = l();
        this.f15967h.f15954c = b.a(this.f15966g);
        return this.f15967h;
    }

    public final synchronized void c() {
        this.f15963c.incrementAndGet();
    }

    public final synchronized void d() {
        this.f15963c.decrementAndGet();
    }

    public final synchronized int e() {
        return this.f15963c.get();
    }

    public final int f() {
        if (t.b().c("t_mem")) {
            return 0;
        }
        if (this.f15969k == null) {
            this.f15969k = Integer.valueOf(af.b(this.f15965f, u.b.f12847a, u.a.f12828g, -1));
        }
        if (this.f15969k.intValue() > 0) {
            return this.f15969k.intValue();
        }
        return 0;
    }

    public final int g() {
        if (t.b().c("c_num")) {
            return 0;
        }
        if (this.f15970l == null) {
            this.f15970l = Integer.valueOf(af.b(this.f15965f, u.b.f12847a, u.a.f12829h, -1));
        }
        if (this.f15970l.intValue() > 0) {
            return this.f15970l.intValue();
        }
        return 0;
    }

    public final long h() {
        if (t.b().c("t_store")) {
            return 0L;
        }
        if (this.f15971m == null) {
            this.f15971m = Long.valueOf(af.b(this.f15965f, u.b.f12847a, u.a.i, -1L));
        }
        if (this.f15971m.longValue() > 0) {
            return this.f15971m.longValue();
        }
        return 0L;
    }

    public final void a(com.anythink.core.d.b bVar) {
        this.f15964e = bVar.i();
        synchronized (this) {
            try {
                if (!this.f15968j) {
                    d dVar = this.f15967h;
                    Context context = this.f15965f;
                    ActivityManager activityManager = this.f15966g;
                    int memoryClass = activityManager.getMemoryClass();
                    if ((context.getApplicationContext().getApplicationInfo().flags & o.f7742d) == 1048576) {
                        memoryClass = activityManager.getLargeMemoryClass();
                    }
                    dVar.f15955d = memoryClass;
                    if (!t.b().c("t_mem")) {
                        if (this.f15969k == null) {
                            this.f15969k = Integer.valueOf(af.b(this.f15965f, u.b.f12847a, u.a.f12828g, -1));
                        }
                        if (this.f15969k.intValue() <= 0) {
                            this.f15969k = Integer.valueOf(b.a());
                            af.a(this.f15965f, u.b.f12847a, u.a.f12828g, this.f15969k.intValue());
                        }
                        this.f15967h.f15952a = this.f15969k.intValue();
                    }
                    if (!t.b().c("c_num")) {
                        if (this.f15970l == null) {
                            this.f15970l = Integer.valueOf(af.b(this.f15965f, u.b.f12847a, u.a.f12829h, -1));
                        }
                        if (this.f15970l.intValue() <= 0) {
                            this.f15970l = Integer.valueOf(Runtime.getRuntime().availableProcessors());
                            af.a(this.f15965f, u.b.f12847a, u.a.f12829h, this.f15970l.intValue());
                        }
                        this.f15967h.f15956e = this.f15970l.intValue();
                    }
                    if (!t.b().c("t_store")) {
                        if (this.f15971m == null) {
                            this.f15971m = Long.valueOf(af.b(this.f15965f, u.b.f12847a, u.a.i, -1L));
                        }
                        if (this.f15971m.longValue() <= 0) {
                            try {
                                this.f15971m = Long.valueOf((new StatFs(this.i.getPath()).getBlockCountLong() * r5.getBlockSize()) / 1048576);
                            } catch (Throwable unused) {
                            }
                            af.a(this.f15965f, u.b.f12847a, u.a.i, this.f15971m.longValue());
                        }
                        this.f15967h.f15957f = this.f15971m.longValue();
                    }
                    this.f15968j = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
