package com.anythink.core.common.t;

import android.os.SystemClock;
import com.anythink.core.common.d.t;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    long f17220a;

    /* renamed from: b, reason: collision with root package name */
    long f17221b;

    /* renamed from: c, reason: collision with root package name */
    Runnable f17222c;

    /* renamed from: d, reason: collision with root package name */
    boolean f17223d;

    /* renamed from: e, reason: collision with root package name */
    boolean f17224e;

    /* renamed from: f, reason: collision with root package name */
    b f17225f;

    /* renamed from: g, reason: collision with root package name */
    private final a f17226g;

    public c(long j6, Runnable runnable) {
        this.f17223d = false;
        this.f17224e = true;
        this.f17226g = d.a();
        this.f17225f = new b() { // from class: com.anythink.core.common.t.c.1
            @Override // java.lang.Runnable
            public final void run() {
                c cVar = c.this;
                cVar.f17223d = false;
                cVar.f17221b = -1L;
                if (cVar.f17224e) {
                    t.b().b(c.this.f17222c);
                } else {
                    t.b();
                    t.c(c.this.f17222c);
                }
            }
        };
        this.f17221b = j6;
        this.f17222c = runnable;
    }

    public final synchronized void a() {
        if (this.f17221b >= 0 && !this.f17223d) {
            this.f17223d = true;
            this.f17220a = SystemClock.elapsedRealtime();
            this.f17226g.a(this.f17225f, this.f17221b, false);
        }
    }

    public final synchronized void b() {
        if (this.f17223d) {
            this.f17223d = false;
            this.f17221b -= SystemClock.elapsedRealtime() - this.f17220a;
            this.f17226g.b(this.f17225f);
        }
    }

    public final synchronized void c() {
        this.f17223d = false;
        this.f17226g.b(this.f17225f);
        this.f17221b = -1L;
    }

    public c(long j6, Runnable runnable, boolean z6) {
        this(j6, runnable);
        this.f17224e = z6;
    }
}
