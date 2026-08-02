package com.anythink.basead.exoplayer.b;

import android.os.Handler;

/* loaded from: classes.dex */
public interface g {

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final Handler f7227a;

        /* renamed from: b, reason: collision with root package name */
        private final g f7228b;

        public a(Handler handler, g gVar) {
            this.f7227a = gVar != null ? (Handler) com.anythink.basead.exoplayer.k.a.a(handler) : null;
            this.f7228b = gVar;
        }

        public final void b(final com.anythink.basead.exoplayer.c.d dVar) {
            if (this.f7228b != null) {
                this.f7227a.post(new Runnable() { // from class: com.anythink.basead.exoplayer.b.g.a.5
                    @Override // java.lang.Runnable
                    public final void run() {
                        a.this.f7228b.d(dVar);
                    }
                });
            }
        }

        public final void a(final com.anythink.basead.exoplayer.c.d dVar) {
            if (this.f7228b != null) {
                this.f7227a.post(new Runnable() { // from class: com.anythink.basead.exoplayer.b.g.a.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        a.this.f7228b.c(dVar);
                    }
                });
            }
        }

        public final void a(final String str, final long j6, final long j9) {
            if (this.f7228b != null) {
                this.f7227a.post(new Runnable() { // from class: com.anythink.basead.exoplayer.b.g.a.2
                    @Override // java.lang.Runnable
                    public final void run() {
                        a.this.f7228b.b(str, j6, j9);
                    }
                });
            }
        }

        public final void a(final com.anythink.basead.exoplayer.m mVar) {
            if (this.f7228b != null) {
                this.f7227a.post(new Runnable() { // from class: com.anythink.basead.exoplayer.b.g.a.3
                    @Override // java.lang.Runnable
                    public final void run() {
                        a.this.f7228b.b(mVar);
                    }
                });
            }
        }

        public final void a(final int i, final long j6, final long j9) {
            if (this.f7228b != null) {
                this.f7227a.post(new Runnable() { // from class: com.anythink.basead.exoplayer.b.g.a.4
                    @Override // java.lang.Runnable
                    public final void run() {
                        a.this.f7228b.a(i, j6, j9);
                    }
                });
            }
        }

        public final void a(final int i) {
            if (this.f7228b != null) {
                this.f7227a.post(new Runnable() { // from class: com.anythink.basead.exoplayer.b.g.a.6
                    @Override // java.lang.Runnable
                    public final void run() {
                        a.this.f7228b.a(i);
                    }
                });
            }
        }
    }

    void a(int i);

    void a(int i, long j6, long j9);

    void b(com.anythink.basead.exoplayer.m mVar);

    void b(String str, long j6, long j9);

    void c(com.anythink.basead.exoplayer.c.d dVar);

    void d(com.anythink.basead.exoplayer.c.d dVar);
}
