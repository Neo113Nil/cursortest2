package com.anythink.expressad.foundation.g.f;

import android.os.Handler;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public class d implements c {

    /* renamed from: a, reason: collision with root package name */
    private final String f19413a = "d";

    /* renamed from: b, reason: collision with root package name */
    private final Executor f19414b;

    public class a implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        private final j f19435b;

        /* renamed from: c, reason: collision with root package name */
        private final l f19436c;

        public a(j jVar, l lVar) {
            this.f19435b = jVar;
            this.f19436c = lVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.f19435b.f()) {
                this.f19435b.c();
                this.f19435b.m();
                return;
            }
            l lVar = this.f19436c;
            com.anythink.expressad.foundation.g.f.a.a aVar = lVar.f19557b;
            if (aVar == null) {
                this.f19435b.a(lVar);
            } else {
                this.f19435b.b(aVar);
            }
            this.f19435b.c();
            this.f19435b.o();
        }
    }

    public d(final Handler handler) {
        this.f19414b = new Executor() { // from class: com.anythink.expressad.foundation.g.f.d.1
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                handler.post(runnable);
            }
        };
    }

    @Override // com.anythink.expressad.foundation.g.f.c
    public final void a(j<?> jVar, l<?> lVar) {
        Executor executor = this.f19414b;
        if (executor != null) {
            executor.execute(new a(jVar, lVar));
        }
    }

    @Override // com.anythink.expressad.foundation.g.f.c
    public final void b(final j<?> jVar) {
        Executor executor = this.f19414b;
        if (executor != null) {
            executor.execute(new Runnable() { // from class: com.anythink.expressad.foundation.g.f.d.3
                @Override // java.lang.Runnable
                public final void run() {
                    jVar.m();
                }
            });
        }
    }

    @Override // com.anythink.expressad.foundation.g.f.c
    public final void c(final j<?> jVar) {
        Executor executor = this.f19414b;
        if (executor != null) {
            executor.execute(new Runnable() { // from class: com.anythink.expressad.foundation.g.f.d.4
                @Override // java.lang.Runnable
                public final void run() {
                    jVar.n();
                }
            });
        }
    }

    @Override // com.anythink.expressad.foundation.g.f.c
    public final void d(final j<?> jVar) {
        Executor executor = this.f19414b;
        if (executor != null) {
            executor.execute(new Runnable() { // from class: com.anythink.expressad.foundation.g.f.d.5
                @Override // java.lang.Runnable
                public final void run() {
                }
            });
        }
    }

    @Override // com.anythink.expressad.foundation.g.f.c
    public final void e(final j<?> jVar) {
        Executor executor = this.f19414b;
        if (executor != null) {
            executor.execute(new Runnable() { // from class: com.anythink.expressad.foundation.g.f.d.6
                @Override // java.lang.Runnable
                public final void run() {
                }
            });
        }
    }

    @Override // com.anythink.expressad.foundation.g.f.c
    public final void a(j<?> jVar, com.anythink.expressad.foundation.g.f.a.a aVar) {
        if (this.f19414b != null) {
            this.f19414b.execute(new a(jVar, l.a(aVar)));
        }
    }

    @Override // com.anythink.expressad.foundation.g.f.c
    public final void a(final j<?> jVar) {
        Executor executor = this.f19414b;
        if (executor != null) {
            executor.execute(new Runnable() { // from class: com.anythink.expressad.foundation.g.f.d.2
                @Override // java.lang.Runnable
                public final void run() {
                    jVar.o();
                }
            });
        }
    }

    @Override // com.anythink.expressad.foundation.g.f.c
    public final void a(final j<?> jVar, final long j9, final long j10) {
        Executor executor = this.f19414b;
        if (executor != null) {
            executor.execute(new Runnable() { // from class: com.anythink.expressad.foundation.g.f.d.7
                @Override // java.lang.Runnable
                public final void run() {
                    jVar.a(j9, j10);
                }
            });
        }
    }
}
