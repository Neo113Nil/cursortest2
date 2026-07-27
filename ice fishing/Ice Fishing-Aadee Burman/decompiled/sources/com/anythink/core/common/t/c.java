package com.anythink.core.common.t;

import android.os.SystemClock;
import com.anythink.core.common.d.t;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    long f16433a;

    /* renamed from: b, reason: collision with root package name */
    long f16434b;

    /* renamed from: c, reason: collision with root package name */
    Runnable f16435c;

    /* renamed from: d, reason: collision with root package name */
    boolean f16436d;

    /* renamed from: e, reason: collision with root package name */
    boolean f16437e;

    /* renamed from: f, reason: collision with root package name */
    b f16438f;

    /* renamed from: g, reason: collision with root package name */
    private final a f16439g;

    public c(long j6, Runnable runnable) {
        this.f16436d = false;
        this.f16437e = true;
        this.f16439g = d.a();
        this.f16438f = new b() { // from class: com.anythink.core.common.t.c.1
            @Override // java.lang.Runnable
            public final void run() {
                c cVar = c.this;
                cVar.f16436d = false;
                cVar.f16434b = -1L;
                if (cVar.f16437e) {
                    t.b().b(c.this.f16435c);
                } else {
                    t.b();
                    t.c(c.this.f16435c);
                }
            }
        };
        this.f16434b = j6;
        this.f16435c = runnable;
    }

    public final synchronized void a() {
        if (this.f16434b >= 0 && !this.f16436d) {
            this.f16436d = true;
            this.f16433a = SystemClock.elapsedRealtime();
            this.f16439g.a(this.f16438f, this.f16434b, false);
        }
    }

    public final synchronized void b() {
        if (this.f16436d) {
            this.f16436d = false;
            this.f16434b -= SystemClock.elapsedRealtime() - this.f16433a;
            this.f16439g.b(this.f16438f);
        }
    }

    public final synchronized void c() {
        this.f16436d = false;
        this.f16439g.b(this.f16438f);
        this.f16434b = -1L;
    }

    public c(long j6, Runnable runnable, boolean z3) {
        this(j6, runnable);
        this.f16437e = z3;
    }
}
