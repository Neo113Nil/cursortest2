package com.anythink.expressad.foundation.g.f;

import android.os.Handler;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public class d implements c {

    /* renamed from: a, reason: collision with root package name */
    private final String f20042a = "d";

    /* renamed from: b, reason: collision with root package name */
    private final Executor f20043b;

    public class a implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        private final j f20064b;

        /* renamed from: c, reason: collision with root package name */
        private final l f20065c;

        public a(j jVar, l lVar) {
            this.f20064b = jVar;
            this.f20065c = lVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.f20064b.f()) {
                this.f20064b.c();
                this.f20064b.m();
                return;
            }
            l lVar = this.f20065c;
            com.anythink.expressad.foundation.g.f.a.a aVar = lVar.f20186b;
            if (aVar == null) {
                this.f20064b.a(lVar);
            } else {
                this.f20064b.b(aVar);
            }
            this.f20064b.c();
            this.f20064b.o();
        }
    }

    public d(final Handler handler) {
        this.f20043b = new Executor() { // from class: com.anythink.expressad.foundation.g.f.d.1
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                handler.post(runnable);
            }
        };
    }

    @Override // com.anythink.expressad.foundation.g.f.c
    public final void a(j<?> jVar, l<?> lVar) {
        Executor executor = this.f20043b;
        if (executor != null) {
            executor.execute(new a(jVar, lVar));
        }
    }

    @Override // com.anythink.expressad.foundation.g.f.c
    public final void b(final j<?> jVar) {
        Executor executor = this.f20043b;
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
        Executor executor = this.f20043b;
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
        Executor executor = this.f20043b;
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
        Executor executor = this.f20043b;
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
        if (this.f20043b != null) {
            this.f20043b.execute(new a(jVar, l.a(aVar)));
        }
    }

    @Override // com.anythink.expressad.foundation.g.f.c
    public final void a(final j<?> jVar) {
        Executor executor = this.f20043b;
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
        Executor executor = this.f20043b;
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
