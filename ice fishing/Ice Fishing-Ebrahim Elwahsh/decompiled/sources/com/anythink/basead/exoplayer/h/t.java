package com.anythink.basead.exoplayer.h;

import android.os.Handler;
import android.os.Looper;
import com.anythink.basead.exoplayer.h.s;
import com.anythink.basead.exoplayer.k.C0544a;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public interface t {

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f7928a;

        /* renamed from: b, reason: collision with root package name */
        public final s.a f7929b;

        /* renamed from: c, reason: collision with root package name */
        private final CopyOnWriteArrayList<C0028a> f7930c;

        /* renamed from: d, reason: collision with root package name */
        private final long f7931d;

        /* renamed from: com.anythink.basead.exoplayer.h.t$a$a, reason: collision with other inner class name */
        public static final class C0028a {

            /* renamed from: a, reason: collision with root package name */
            public final Handler f7962a;

            /* renamed from: b, reason: collision with root package name */
            public final t f7963b;

            public C0028a(Handler handler, t tVar) {
                this.f7962a = handler;
                this.f7963b = tVar;
            }
        }

        public a() {
            this(new CopyOnWriteArrayList(), 0, null, 0L);
        }

        public final a a(int i, s.a aVar, long j9) {
            return new a(this.f7930c, i, aVar, j9);
        }

        public final void b() {
            C0544a.b(this.f7929b != null);
            Iterator<C0028a> it = this.f7930c.iterator();
            while (it.hasNext()) {
                C0028a next = it.next();
                final t tVar = next.f7963b;
                a(next.f7962a, new Runnable() { // from class: com.anythink.basead.exoplayer.h.t.a.2
                    @Override // java.lang.Runnable
                    public final void run() {
                        t tVar2 = tVar;
                        a aVar = a.this;
                        tVar2.b(aVar.f7928a, aVar.f7929b);
                    }
                });
            }
        }

        public final void c(final b bVar, final c cVar) {
            Iterator<C0028a> it = this.f7930c.iterator();
            while (it.hasNext()) {
                C0028a next = it.next();
                final t tVar = next.f7963b;
                a(next.f7962a, new Runnable() { // from class: com.anythink.basead.exoplayer.h.t.a.5
                    @Override // java.lang.Runnable
                    public final void run() {
                        t tVar2 = tVar;
                        a aVar = a.this;
                        tVar2.c(aVar.f7928a, aVar.f7929b, bVar, cVar);
                    }
                });
            }
        }

        private a(CopyOnWriteArrayList<C0028a> copyOnWriteArrayList, int i, s.a aVar, long j9) {
            this.f7930c = copyOnWriteArrayList;
            this.f7928a = i;
            this.f7929b = aVar;
            this.f7931d = j9;
        }

        public final void a(Handler handler, t tVar) {
            C0544a.a((handler == null || tVar == null) ? false : true);
            this.f7930c.add(new C0028a(handler, tVar));
        }

        public final void a(t tVar) {
            Iterator<C0028a> it = this.f7930c.iterator();
            while (it.hasNext()) {
                C0028a next = it.next();
                if (next.f7963b == tVar) {
                    this.f7930c.remove(next);
                }
            }
        }

        public final void c() {
            C0544a.b(this.f7929b != null);
            Iterator<C0028a> it = this.f7930c.iterator();
            while (it.hasNext()) {
                C0028a next = it.next();
                final t tVar = next.f7963b;
                a(next.f7962a, new Runnable() { // from class: com.anythink.basead.exoplayer.h.t.a.7
                    @Override // java.lang.Runnable
                    public final void run() {
                        t tVar2 = tVar;
                        a aVar = a.this;
                        tVar2.c(aVar.f7928a, aVar.f7929b);
                    }
                });
            }
        }

        public final void b(final b bVar, final c cVar) {
            Iterator<C0028a> it = this.f7930c.iterator();
            while (it.hasNext()) {
                C0028a next = it.next();
                final t tVar = next.f7963b;
                a(next.f7962a, new Runnable() { // from class: com.anythink.basead.exoplayer.h.t.a.4
                    @Override // java.lang.Runnable
                    public final void run() {
                        t tVar2 = tVar;
                        a aVar = a.this;
                        tVar2.b(aVar.f7928a, aVar.f7929b, bVar, cVar);
                    }
                });
            }
        }

        public final void a() {
            C0544a.b(this.f7929b != null);
            Iterator<C0028a> it = this.f7930c.iterator();
            while (it.hasNext()) {
                C0028a next = it.next();
                final t tVar = next.f7963b;
                a(next.f7962a, new Runnable() { // from class: com.anythink.basead.exoplayer.h.t.a.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        t tVar2 = tVar;
                        a aVar = a.this;
                        tVar2.a(aVar.f7928a, aVar.f7929b);
                    }
                });
            }
        }

        private void b(com.anythink.basead.exoplayer.j.k kVar, int i, long j9, long j10, long j11) {
            b(kVar, i, -1, null, 0, null, com.anythink.basead.exoplayer.b.f6539b, com.anythink.basead.exoplayer.b.f6539b, j9, j10, j11);
        }

        public final void b(com.anythink.basead.exoplayer.j.k kVar, int i, int i4, com.anythink.basead.exoplayer.m mVar, int i9, Object obj, long j9, long j10, long j11, long j12, long j13) {
            c(new b(kVar, j11, j12, j13), new c(i, i4, mVar, i9, obj, a(j9), a(j10)));
        }

        private void a(com.anythink.basead.exoplayer.j.k kVar, int i, long j9) {
            a(kVar, i, -1, null, 0, null, com.anythink.basead.exoplayer.b.f6539b, com.anythink.basead.exoplayer.b.f6539b, j9);
        }

        public final void a(com.anythink.basead.exoplayer.j.k kVar, int i, int i4, com.anythink.basead.exoplayer.m mVar, int i9, Object obj, long j9, long j10, long j11) {
            a(new b(kVar, j11, 0L, 0L), new c(i, i4, mVar, i9, obj, a(j9), a(j10)));
        }

        public final void b(final c cVar) {
            Iterator<C0028a> it = this.f7930c.iterator();
            while (it.hasNext()) {
                C0028a next = it.next();
                final t tVar = next.f7963b;
                a(next.f7962a, new Runnable() { // from class: com.anythink.basead.exoplayer.h.t.a.9
                    @Override // java.lang.Runnable
                    public final void run() {
                        t tVar2 = tVar;
                        a aVar = a.this;
                        tVar2.b(aVar.f7928a, aVar.f7929b, cVar);
                    }
                });
            }
        }

        public final void a(final b bVar, final c cVar) {
            Iterator<C0028a> it = this.f7930c.iterator();
            while (it.hasNext()) {
                C0028a next = it.next();
                final t tVar = next.f7963b;
                a(next.f7962a, new Runnable() { // from class: com.anythink.basead.exoplayer.h.t.a.3
                    @Override // java.lang.Runnable
                    public final void run() {
                        t tVar2 = tVar;
                        a aVar = a.this;
                        tVar2.a(aVar.f7928a, aVar.f7929b, bVar, cVar);
                    }
                });
            }
        }

        private void a(com.anythink.basead.exoplayer.j.k kVar, int i, long j9, long j10, long j11) {
            a(kVar, i, -1, null, 0, null, com.anythink.basead.exoplayer.b.f6539b, com.anythink.basead.exoplayer.b.f6539b, j9, j10, j11);
        }

        public final void a(com.anythink.basead.exoplayer.j.k kVar, int i, int i4, com.anythink.basead.exoplayer.m mVar, int i9, Object obj, long j9, long j10, long j11, long j12, long j13) {
            b(new b(kVar, j11, j12, j13), new c(i, i4, mVar, i9, obj, a(j9), a(j10)));
        }

        public final void a(com.anythink.basead.exoplayer.j.k kVar, IOException iOException) {
            a(kVar, 6, -1, null, 0, null, com.anythink.basead.exoplayer.b.f6539b, com.anythink.basead.exoplayer.b.f6539b, -1L, 0L, 0L, iOException, true);
        }

        public final void a(com.anythink.basead.exoplayer.j.k kVar, int i, int i4, com.anythink.basead.exoplayer.m mVar, int i9, Object obj, long j9, long j10, long j11, long j12, long j13, IOException iOException, boolean z8) {
            a(new b(kVar, j11, j12, j13), new c(i, i4, mVar, i9, obj, a(j9), a(j10)), iOException, z8);
        }

        public final void a(final b bVar, final c cVar, final IOException iOException, final boolean z8) {
            Iterator<C0028a> it = this.f7930c.iterator();
            while (it.hasNext()) {
                C0028a next = it.next();
                final t tVar = next.f7963b;
                a(next.f7962a, new Runnable() { // from class: com.anythink.basead.exoplayer.h.t.a.6
                    @Override // java.lang.Runnable
                    public final void run() {
                        t tVar2 = tVar;
                        a aVar = a.this;
                        tVar2.a(aVar.f7928a, aVar.f7929b, bVar, cVar, iOException, z8);
                    }
                });
            }
        }

        public final void a(int i, long j9, long j10) {
            a(new c(1, i, null, 3, null, a(j9), a(j10)));
        }

        public final void a(final c cVar) {
            Iterator<C0028a> it = this.f7930c.iterator();
            while (it.hasNext()) {
                C0028a next = it.next();
                final t tVar = next.f7963b;
                a(next.f7962a, new Runnable() { // from class: com.anythink.basead.exoplayer.h.t.a.8
                    @Override // java.lang.Runnable
                    public final void run() {
                        t tVar2 = tVar;
                        a aVar = a.this;
                        tVar2.a(aVar.f7928a, aVar.f7929b, cVar);
                    }
                });
            }
        }

        public final void a(int i, com.anythink.basead.exoplayer.m mVar, int i4, Object obj, long j9) {
            b(new c(1, i, mVar, i4, obj, a(j9), com.anythink.basead.exoplayer.b.f6539b));
        }

        private long a(long j9) {
            long a9 = com.anythink.basead.exoplayer.b.a(j9);
            return a9 == com.anythink.basead.exoplayer.b.f6539b ? com.anythink.basead.exoplayer.b.f6539b : this.f7931d + a9;
        }

        private static void a(Handler handler, Runnable runnable) {
            if (handler.getLooper() == Looper.myLooper()) {
                runnable.run();
            } else {
                handler.post(runnable);
            }
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final com.anythink.basead.exoplayer.j.k f7964a;

        /* renamed from: b, reason: collision with root package name */
        public final long f7965b;

        /* renamed from: c, reason: collision with root package name */
        public final long f7966c;

        /* renamed from: d, reason: collision with root package name */
        public final long f7967d;

        public b(com.anythink.basead.exoplayer.j.k kVar, long j9, long j10, long j11) {
            this.f7964a = kVar;
            this.f7965b = j9;
            this.f7966c = j10;
            this.f7967d = j11;
        }
    }

    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final int f7968a;

        /* renamed from: b, reason: collision with root package name */
        public final int f7969b;

        /* renamed from: c, reason: collision with root package name */
        public final com.anythink.basead.exoplayer.m f7970c;

        /* renamed from: d, reason: collision with root package name */
        public final int f7971d;

        /* renamed from: e, reason: collision with root package name */
        public final Object f7972e;

        /* renamed from: f, reason: collision with root package name */
        public final long f7973f;

        /* renamed from: g, reason: collision with root package name */
        public final long f7974g;

        public c(int i, int i4, com.anythink.basead.exoplayer.m mVar, int i9, Object obj, long j9, long j10) {
            this.f7968a = i;
            this.f7969b = i4;
            this.f7970c = mVar;
            this.f7971d = i9;
            this.f7972e = obj;
            this.f7973f = j9;
            this.f7974g = j10;
        }
    }

    void a(int i, s.a aVar);

    void a(int i, s.a aVar, b bVar, c cVar);

    void a(int i, s.a aVar, b bVar, c cVar, IOException iOException, boolean z8);

    void a(int i, s.a aVar, c cVar);

    void b(int i, s.a aVar);

    void b(int i, s.a aVar, b bVar, c cVar);

    void b(int i, s.a aVar, c cVar);

    void c(int i, s.a aVar);

    void c(int i, s.a aVar, b bVar, c cVar);
}
