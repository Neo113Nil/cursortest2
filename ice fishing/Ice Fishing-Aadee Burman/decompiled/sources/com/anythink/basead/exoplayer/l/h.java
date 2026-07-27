package com.anythink.basead.exoplayer.l;

import android.os.Handler;
import android.view.Surface;
import com.anythink.basead.exoplayer.m;

/* loaded from: classes.dex */
public interface h {

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final Handler f8633a;

        /* renamed from: b, reason: collision with root package name */
        private final h f8634b;

        public a(Handler handler, h hVar) {
            this.f8633a = hVar != null ? (Handler) com.anythink.basead.exoplayer.k.a.a(handler) : null;
            this.f8634b = hVar;
        }

        public final void b(final com.anythink.basead.exoplayer.c.d dVar) {
            if (this.f8634b != null) {
                this.f8633a.post(new Runnable() { // from class: com.anythink.basead.exoplayer.l.h.a.7
                    @Override // java.lang.Runnable
                    public final void run() {
                        a.this.f8634b.b(dVar);
                    }
                });
            }
        }

        public final void a(final com.anythink.basead.exoplayer.c.d dVar) {
            if (this.f8634b != null) {
                this.f8633a.post(new Runnable() { // from class: com.anythink.basead.exoplayer.l.h.a.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        a.this.f8634b.a(dVar);
                    }
                });
            }
        }

        public final void a(final String str, final long j6, final long j9) {
            if (this.f8634b != null) {
                this.f8633a.post(new Runnable() { // from class: com.anythink.basead.exoplayer.l.h.a.2
                    @Override // java.lang.Runnable
                    public final void run() {
                        a.this.f8634b.a(str, j6, j9);
                    }
                });
            }
        }

        public final void a(final m mVar) {
            if (this.f8634b != null) {
                this.f8633a.post(new Runnable() { // from class: com.anythink.basead.exoplayer.l.h.a.3
                    @Override // java.lang.Runnable
                    public final void run() {
                        a.this.f8634b.a(mVar);
                    }
                });
            }
        }

        public final void a(final int i, final long j6) {
            if (this.f8634b != null) {
                this.f8633a.post(new Runnable() { // from class: com.anythink.basead.exoplayer.l.h.a.4
                    @Override // java.lang.Runnable
                    public final void run() {
                        a.this.f8634b.a(i, j6);
                    }
                });
            }
        }

        public final void a(final int i, final int i6, final int i9, final float f3) {
            if (this.f8634b != null) {
                this.f8633a.post(new Runnable() { // from class: com.anythink.basead.exoplayer.l.h.a.5
                    @Override // java.lang.Runnable
                    public final void run() {
                        a.this.f8634b.a(i, i6, i9, f3);
                    }
                });
            }
        }

        public final void a(final Surface surface) {
            if (this.f8634b != null) {
                this.f8633a.post(new Runnable() { // from class: com.anythink.basead.exoplayer.l.h.a.6
                    @Override // java.lang.Runnable
                    public final void run() {
                        a.this.f8634b.a(surface);
                    }
                });
            }
        }
    }

    void a(int i, int i6, int i9, float f3);

    void a(int i, long j6);

    void a(Surface surface);

    void a(com.anythink.basead.exoplayer.c.d dVar);

    void a(m mVar);

    void a(String str, long j6, long j9);

    void b(com.anythink.basead.exoplayer.c.d dVar);
}
