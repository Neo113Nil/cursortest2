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
    private static e f16747d;

    /* renamed from: b, reason: collision with root package name */
    long f16749b;

    /* renamed from: f, reason: collision with root package name */
    private Context f16752f;

    /* renamed from: g, reason: collision with root package name */
    private ActivityManager f16753g;

    /* renamed from: h, reason: collision with root package name */
    private d f16754h;

    /* renamed from: j, reason: collision with root package name */
    private boolean f16755j;

    /* renamed from: k, reason: collision with root package name */
    private volatile Integer f16756k;

    /* renamed from: l, reason: collision with root package name */
    private volatile Integer f16757l;

    /* renamed from: m, reason: collision with root package name */
    private volatile Long f16758m;

    /* renamed from: e, reason: collision with root package name */
    private boolean f16751e = false;
    private final File i = Environment.getDataDirectory();

    /* renamed from: a, reason: collision with root package name */
    final long f16748a = f.f7973a;

    /* renamed from: c, reason: collision with root package name */
    AtomicInteger f16750c = new AtomicInteger();

    private e() {
        Context g9 = t.b().g();
        this.f16752f = g9;
        this.f16753g = (ActivityManager) g9.getSystemService("activity");
        this.f16754h = new d();
    }

    public static e a() {
        if (f16747d == null) {
            synchronized (e.class) {
                try {
                    if (f16747d == null) {
                        f16747d = new e();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f16747d;
    }

    private void i() {
        d dVar = this.f16754h;
        Context context = this.f16752f;
        ActivityManager activityManager = this.f16753g;
        int memoryClass = activityManager.getMemoryClass();
        if ((context.getApplicationContext().getApplicationInfo().flags & o.f8528d) == 1048576) {
            memoryClass = activityManager.getLargeMemoryClass();
        }
        dVar.f16742d = memoryClass;
        if (t.b().c("t_mem")) {
            return;
        }
        if (this.f16756k == null) {
            this.f16756k = Integer.valueOf(af.b(this.f16752f, u.b.f13633a, u.a.f13614g, -1));
        }
        if (this.f16756k.intValue() <= 0) {
            this.f16756k = Integer.valueOf(b.a());
            af.a(this.f16752f, u.b.f13633a, u.a.f13614g, this.f16756k.intValue());
        }
        this.f16754h.f16739a = this.f16756k.intValue();
    }

    private void j() {
        if (t.b().c("c_num")) {
            return;
        }
        if (this.f16757l == null) {
            this.f16757l = Integer.valueOf(af.b(this.f16752f, u.b.f13633a, u.a.f13615h, -1));
        }
        if (this.f16757l.intValue() <= 0) {
            this.f16757l = Integer.valueOf(Runtime.getRuntime().availableProcessors());
            af.a(this.f16752f, u.b.f13633a, u.a.f13615h, this.f16757l.intValue());
        }
        this.f16754h.f16743e = this.f16757l.intValue();
    }

    private void k() {
        if (t.b().c("t_store")) {
            return;
        }
        if (this.f16758m == null) {
            this.f16758m = Long.valueOf(af.b(this.f16752f, u.b.f13633a, u.a.i, -1L));
        }
        if (this.f16758m.longValue() <= 0) {
            try {
                this.f16758m = Long.valueOf((new StatFs(this.i.getPath()).getBlockCountLong() * r0.getBlockSize()) / 1048576);
            } catch (Throwable unused) {
            }
            af.a(this.f16752f, u.b.f13633a, u.a.i, this.f16758m.longValue());
        }
        this.f16754h.f16744f = this.f16758m.longValue();
    }

    private long l() {
        try {
            return (new StatFs(this.i.getPath()).getAvailableBlocksLong() * r0.getBlockSize()) / 1048576;
        } catch (Throwable unused) {
            return 0L;
        }
    }

    public final d b() {
        if (!this.f16751e) {
            return null;
        }
        if (SystemClock.elapsedRealtime() - this.f16749b <= f.f7973a) {
            return this.f16754h;
        }
        this.f16749b = SystemClock.elapsedRealtime();
        this.f16754h.f16746h = a.a();
        this.f16754h.f16740b = b.b();
        this.f16754h.f16745g = l();
        this.f16754h.f16741c = b.a(this.f16753g);
        return this.f16754h;
    }

    public final synchronized void c() {
        this.f16750c.incrementAndGet();
    }

    public final synchronized void d() {
        this.f16750c.decrementAndGet();
    }

    public final synchronized int e() {
        return this.f16750c.get();
    }

    public final int f() {
        if (t.b().c("t_mem")) {
            return 0;
        }
        if (this.f16756k == null) {
            this.f16756k = Integer.valueOf(af.b(this.f16752f, u.b.f13633a, u.a.f13614g, -1));
        }
        if (this.f16756k.intValue() > 0) {
            return this.f16756k.intValue();
        }
        return 0;
    }

    public final int g() {
        if (t.b().c("c_num")) {
            return 0;
        }
        if (this.f16757l == null) {
            this.f16757l = Integer.valueOf(af.b(this.f16752f, u.b.f13633a, u.a.f13615h, -1));
        }
        if (this.f16757l.intValue() > 0) {
            return this.f16757l.intValue();
        }
        return 0;
    }

    public final long h() {
        if (t.b().c("t_store")) {
            return 0L;
        }
        if (this.f16758m == null) {
            this.f16758m = Long.valueOf(af.b(this.f16752f, u.b.f13633a, u.a.i, -1L));
        }
        if (this.f16758m.longValue() > 0) {
            return this.f16758m.longValue();
        }
        return 0L;
    }

    public final void a(com.anythink.core.d.b bVar) {
        this.f16751e = bVar.i();
        synchronized (this) {
            try {
                if (!this.f16755j) {
                    d dVar = this.f16754h;
                    Context context = this.f16752f;
                    ActivityManager activityManager = this.f16753g;
                    int memoryClass = activityManager.getMemoryClass();
                    if ((context.getApplicationContext().getApplicationInfo().flags & o.f8528d) == 1048576) {
                        memoryClass = activityManager.getLargeMemoryClass();
                    }
                    dVar.f16742d = memoryClass;
                    if (!t.b().c("t_mem")) {
                        if (this.f16756k == null) {
                            this.f16756k = Integer.valueOf(af.b(this.f16752f, u.b.f13633a, u.a.f13614g, -1));
                        }
                        if (this.f16756k.intValue() <= 0) {
                            this.f16756k = Integer.valueOf(b.a());
                            af.a(this.f16752f, u.b.f13633a, u.a.f13614g, this.f16756k.intValue());
                        }
                        this.f16754h.f16739a = this.f16756k.intValue();
                    }
                    if (!t.b().c("c_num")) {
                        if (this.f16757l == null) {
                            this.f16757l = Integer.valueOf(af.b(this.f16752f, u.b.f13633a, u.a.f13615h, -1));
                        }
                        if (this.f16757l.intValue() <= 0) {
                            this.f16757l = Integer.valueOf(Runtime.getRuntime().availableProcessors());
                            af.a(this.f16752f, u.b.f13633a, u.a.f13615h, this.f16757l.intValue());
                        }
                        this.f16754h.f16743e = this.f16757l.intValue();
                    }
                    if (!t.b().c("t_store")) {
                        if (this.f16758m == null) {
                            this.f16758m = Long.valueOf(af.b(this.f16752f, u.b.f13633a, u.a.i, -1L));
                        }
                        if (this.f16758m.longValue() <= 0) {
                            try {
                                this.f16758m = Long.valueOf((new StatFs(this.i.getPath()).getBlockCountLong() * r5.getBlockSize()) / 1048576);
                            } catch (Throwable unused) {
                            }
                            af.a(this.f16752f, u.b.f13633a, u.a.i, this.f16758m.longValue());
                        }
                        this.f16754h.f16744f = this.f16758m.longValue();
                    }
                    this.f16755j = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
