package com.anythink.expressad.foundation.g.f;

import android.os.Handler;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public class d implements c {

    /* renamed from: a, reason: collision with root package name */
    private final String f19255a = "d";

    /* renamed from: b, reason: collision with root package name */
    private final Executor f19256b;

    public class a implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        private final j f19277b;

        /* renamed from: c, reason: collision with root package name */
        private final l f19278c;

        public a(j jVar, l lVar) {
            this.f19277b = jVar;
            this.f19278c = lVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.f19277b.f()) {
                this.f19277b.c();
                this.f19277b.m();
                return;
            }
            l lVar = this.f19278c;
            com.anythink.expressad.foundation.g.f.a.a aVar = lVar.f19399b;
            if (aVar == null) {
                this.f19277b.a(lVar);
            } else {
                this.f19277b.b(aVar);
            }
            this.f19277b.c();
            this.f19277b.o();
        }
    }

    public d(final Handler handler) {
        this.f19256b = new Executor() { // from class: com.anythink.expressad.foundation.g.f.d.1
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                handler.post(runnable);
            }
        };
    }

    @Override // com.anythink.expressad.foundation.g.f.c
    public final void a(j<?> jVar, l<?> lVar) {
        Executor executor = this.f19256b;
        if (executor != null) {
            executor.execute(new a(jVar, lVar));
        }
    }

    @Override // com.anythink.expressad.foundation.g.f.c
    public final void b(final j<?> jVar) {
        Executor executor = this.f19256b;
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
        Executor executor = this.f19256b;
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
        Executor executor = this.f19256b;
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
        Executor executor = this.f19256b;
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
        if (this.f19256b != null) {
            this.f19256b.execute(new a(jVar, l.a(aVar)));
        }
    }

    @Override // com.anythink.expressad.foundation.g.f.c
    public final void a(final j<?> jVar) {
        Executor executor = this.f19256b;
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
    public final void a(final j<?> jVar, final long j6, final long j9) {
        Executor executor = this.f19256b;
        if (executor != null) {
            executor.execute(new Runnable() { // from class: com.anythink.expressad.foundation.g.f.d.7
                @Override // java.lang.Runnable
                public final void run() {
                    jVar.a(j6, j9);
                }
            });
        }
    }
}
