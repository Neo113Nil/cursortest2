package com.anythink.basead.exoplayer.b;

import android.os.Handler;
import com.anythink.basead.exoplayer.k.C0544a;

/* loaded from: classes.dex */
public interface g {

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final Handler f6598a;

        /* renamed from: b, reason: collision with root package name */
        private final g f6599b;

        public a(Handler handler, g gVar) {
            this.f6598a = gVar != null ? (Handler) C0544a.a(handler) : null;
            this.f6599b = gVar;
        }

        public final void b(final com.anythink.basead.exoplayer.c.d dVar) {
            if (this.f6599b != null) {
                this.f6598a.post(new Runnable() { // from class: com.anythink.basead.exoplayer.b.g.a.5
                    @Override // java.lang.Runnable
                    public final void run() {
                        a.this.f6599b.d(dVar);
                    }
                });
            }
        }

        public final void a(final com.anythink.basead.exoplayer.c.d dVar) {
            if (this.f6599b != null) {
                this.f6598a.post(new Runnable() { // from class: com.anythink.basead.exoplayer.b.g.a.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        a.this.f6599b.c(dVar);
                    }
                });
            }
        }

        public final void a(final String str, final long j9, final long j10) {
            if (this.f6599b != null) {
                this.f6598a.post(new Runnable() { // from class: com.anythink.basead.exoplayer.b.g.a.2
                    @Override // java.lang.Runnable
                    public final void run() {
                        a.this.f6599b.b(str, j9, j10);
                    }
                });
            }
        }

        public final void a(final com.anythink.basead.exoplayer.m mVar) {
            if (this.f6599b != null) {
                this.f6598a.post(new Runnable() { // from class: com.anythink.basead.exoplayer.b.g.a.3
                    @Override // java.lang.Runnable
                    public final void run() {
                        a.this.f6599b.b(mVar);
                    }
                });
            }
        }

        public final void a(final int i, final long j9, final long j10) {
            if (this.f6599b != null) {
                this.f6598a.post(new Runnable() { // from class: com.anythink.basead.exoplayer.b.g.a.4
                    @Override // java.lang.Runnable
                    public final void run() {
                        a.this.f6599b.a(i, j9, j10);
                    }
                });
            }
        }

        public final void a(final int i) {
            if (this.f6599b != null) {
                this.f6598a.post(new Runnable() { // from class: com.anythink.basead.exoplayer.b.g.a.6
                    @Override // java.lang.Runnable
                    public final void run() {
                        a.this.f6599b.a(i);
                    }
                });
            }
        }
    }

    void a(int i);

    void a(int i, long j9, long j10);

    void b(com.anythink.basead.exoplayer.m mVar);

    void b(String str, long j9, long j10);

    void c(com.anythink.basead.exoplayer.c.d dVar);

    void d(com.anythink.basead.exoplayer.c.d dVar);
}
