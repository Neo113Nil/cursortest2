package com.anythink.basead.exoplayer.l;

import android.os.Handler;
import android.view.Surface;
import com.anythink.basead.exoplayer.k.C0544a;
import com.anythink.basead.exoplayer.m;

/* loaded from: classes.dex */
public interface h {

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final Handler f8790a;

        /* renamed from: b, reason: collision with root package name */
        private final h f8791b;

        public a(Handler handler, h hVar) {
            this.f8790a = hVar != null ? (Handler) C0544a.a(handler) : null;
            this.f8791b = hVar;
        }

        public final void b(final com.anythink.basead.exoplayer.c.d dVar) {
            if (this.f8791b != null) {
                this.f8790a.post(new Runnable() { // from class: com.anythink.basead.exoplayer.l.h.a.7
                    @Override // java.lang.Runnable
                    public final void run() {
                        a.this.f8791b.b(dVar);
                    }
                });
            }
        }

        public final void a(final com.anythink.basead.exoplayer.c.d dVar) {
            if (this.f8791b != null) {
                this.f8790a.post(new Runnable() { // from class: com.anythink.basead.exoplayer.l.h.a.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        a.this.f8791b.a(dVar);
                    }
                });
            }
        }

        public final void a(final String str, final long j9, final long j10) {
            if (this.f8791b != null) {
                this.f8790a.post(new Runnable() { // from class: com.anythink.basead.exoplayer.l.h.a.2
                    @Override // java.lang.Runnable
                    public final void run() {
                        a.this.f8791b.a(str, j9, j10);
                    }
                });
            }
        }

        public final void a(final m mVar) {
            if (this.f8791b != null) {
                this.f8790a.post(new Runnable() { // from class: com.anythink.basead.exoplayer.l.h.a.3
                    @Override // java.lang.Runnable
                    public final void run() {
                        a.this.f8791b.a(mVar);
                    }
                });
            }
        }

        public final void a(final int i, final long j9) {
            if (this.f8791b != null) {
                this.f8790a.post(new Runnable() { // from class: com.anythink.basead.exoplayer.l.h.a.4
                    @Override // java.lang.Runnable
                    public final void run() {
                        a.this.f8791b.a(i, j9);
                    }
                });
            }
        }

        public final void a(final int i, final int i4, final int i9, final float f6) {
            if (this.f8791b != null) {
                this.f8790a.post(new Runnable() { // from class: com.anythink.basead.exoplayer.l.h.a.5
                    @Override // java.lang.Runnable
                    public final void run() {
                        a.this.f8791b.a(i, i4, i9, f6);
                    }
                });
            }
        }

        public final void a(final Surface surface) {
            if (this.f8791b != null) {
                this.f8790a.post(new Runnable() { // from class: com.anythink.basead.exoplayer.l.h.a.6
                    @Override // java.lang.Runnable
                    public final void run() {
                        a.this.f8791b.a(surface);
                    }
                });
            }
        }
    }

    void a(int i, int i4, int i9, float f6);

    void a(int i, long j9);

    void a(Surface surface);

    void a(com.anythink.basead.exoplayer.c.d dVar);

    void a(m mVar);

    void a(String str, long j9, long j10);

    void b(com.anythink.basead.exoplayer.c.d dVar);
}
