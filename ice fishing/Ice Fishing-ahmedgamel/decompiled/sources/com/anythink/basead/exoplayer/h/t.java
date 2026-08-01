package com.anythink.basead.exoplayer.h;

import android.os.Handler;
import android.os.Looper;
import com.anythink.basead.exoplayer.h.s;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public interface t {

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f7771a;

        /* renamed from: b, reason: collision with root package name */
        public final s.a f7772b;

        /* renamed from: c, reason: collision with root package name */
        private final CopyOnWriteArrayList<C0029a> f7773c;

        /* renamed from: d, reason: collision with root package name */
        private final long f7774d;

        /* renamed from: com.anythink.basead.exoplayer.h.t$a$a, reason: collision with other inner class name */
        public static final class C0029a {

            /* renamed from: a, reason: collision with root package name */
            public final Handler f7805a;

            /* renamed from: b, reason: collision with root package name */
            public final t f7806b;

            public C0029a(Handler handler, t tVar) {
                this.f7805a = handler;
                this.f7806b = tVar;
            }
        }

        public a() {
            this(new CopyOnWriteArrayList(), 0, null, 0L);
        }

        public final a a(int i, s.a aVar, long j6) {
            return new a(this.f7773c, i, aVar, j6);
        }

        public final void b() {
            com.anythink.basead.exoplayer.k.a.b(this.f7772b != null);
            Iterator<C0029a> it = this.f7773c.iterator();
            while (it.hasNext()) {
                C0029a next = it.next();
                final t tVar = next.f7806b;
                a(next.f7805a, new Runnable() { // from class: com.anythink.basead.exoplayer.h.t.a.2
                    @Override // java.lang.Runnable
                    public final void run() {
                        t tVar2 = tVar;
                        a aVar = a.this;
                        tVar2.b(aVar.f7771a, aVar.f7772b);
                    }
                });
            }
        }

        public final void c(final b bVar, final c cVar) {
            Iterator<C0029a> it = this.f7773c.iterator();
            while (it.hasNext()) {
                C0029a next = it.next();
                final t tVar = next.f7806b;
                a(next.f7805a, new Runnable() { // from class: com.anythink.basead.exoplayer.h.t.a.5
                    @Override // java.lang.Runnable
                    public final void run() {
                        t tVar2 = tVar;
                        a aVar = a.this;
                        tVar2.c(aVar.f7771a, aVar.f7772b, bVar, cVar);
                    }
                });
            }
        }

        private a(CopyOnWriteArrayList<C0029a> copyOnWriteArrayList, int i, s.a aVar, long j6) {
            this.f7773c = copyOnWriteArrayList;
            this.f7771a = i;
            this.f7772b = aVar;
            this.f7774d = j6;
        }

        public final void a(Handler handler, t tVar) {
            com.anythink.basead.exoplayer.k.a.a((handler == null || tVar == null) ? false : true);
            this.f7773c.add(new C0029a(handler, tVar));
        }

        public final void a(t tVar) {
            Iterator<C0029a> it = this.f7773c.iterator();
            while (it.hasNext()) {
                C0029a next = it.next();
                if (next.f7806b == tVar) {
                    this.f7773c.remove(next);
                }
            }
        }

        public final void c() {
            com.anythink.basead.exoplayer.k.a.b(this.f7772b != null);
            Iterator<C0029a> it = this.f7773c.iterator();
            while (it.hasNext()) {
                C0029a next = it.next();
                final t tVar = next.f7806b;
                a(next.f7805a, new Runnable() { // from class: com.anythink.basead.exoplayer.h.t.a.7
                    @Override // java.lang.Runnable
                    public final void run() {
                        t tVar2 = tVar;
                        a aVar = a.this;
                        tVar2.c(aVar.f7771a, aVar.f7772b);
                    }
                });
            }
        }

        public final void b(final b bVar, final c cVar) {
            Iterator<C0029a> it = this.f7773c.iterator();
            while (it.hasNext()) {
                C0029a next = it.next();
                final t tVar = next.f7806b;
                a(next.f7805a, new Runnable() { // from class: com.anythink.basead.exoplayer.h.t.a.4
                    @Override // java.lang.Runnable
                    public final void run() {
                        t tVar2 = tVar;
                        a aVar = a.this;
                        tVar2.b(aVar.f7771a, aVar.f7772b, bVar, cVar);
                    }
                });
            }
        }

        public final void a() {
            com.anythink.basead.exoplayer.k.a.b(this.f7772b != null);
            Iterator<C0029a> it = this.f7773c.iterator();
            while (it.hasNext()) {
                C0029a next = it.next();
                final t tVar = next.f7806b;
                a(next.f7805a, new Runnable() { // from class: com.anythink.basead.exoplayer.h.t.a.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        t tVar2 = tVar;
                        a aVar = a.this;
                        tVar2.a(aVar.f7771a, aVar.f7772b);
                    }
                });
            }
        }

        private void b(com.anythink.basead.exoplayer.j.k kVar, int i, long j6, long j9, long j10) {
            b(kVar, i, -1, null, 0, null, com.anythink.basead.exoplayer.b.f6382b, com.anythink.basead.exoplayer.b.f6382b, j6, j9, j10);
        }

        public final void b(com.anythink.basead.exoplayer.j.k kVar, int i, int i6, com.anythink.basead.exoplayer.m mVar, int i9, Object obj, long j6, long j9, long j10, long j11, long j12) {
            c(new b(kVar, j10, j11, j12), new c(i, i6, mVar, i9, obj, a(j6), a(j9)));
        }

        private void a(com.anythink.basead.exoplayer.j.k kVar, int i, long j6) {
            a(kVar, i, -1, null, 0, null, com.anythink.basead.exoplayer.b.f6382b, com.anythink.basead.exoplayer.b.f6382b, j6);
        }

        public final void a(com.anythink.basead.exoplayer.j.k kVar, int i, int i6, com.anythink.basead.exoplayer.m mVar, int i9, Object obj, long j6, long j9, long j10) {
            a(new b(kVar, j10, 0L, 0L), new c(i, i6, mVar, i9, obj, a(j6), a(j9)));
        }

        public final void b(final c cVar) {
            Iterator<C0029a> it = this.f7773c.iterator();
            while (it.hasNext()) {
                C0029a next = it.next();
                final t tVar = next.f7806b;
                a(next.f7805a, new Runnable() { // from class: com.anythink.basead.exoplayer.h.t.a.9
                    @Override // java.lang.Runnable
                    public final void run() {
                        t tVar2 = tVar;
                        a aVar = a.this;
                        tVar2.b(aVar.f7771a, aVar.f7772b, cVar);
                    }
                });
            }
        }

        public final void a(final b bVar, final c cVar) {
            Iterator<C0029a> it = this.f7773c.iterator();
            while (it.hasNext()) {
                C0029a next = it.next();
                final t tVar = next.f7806b;
                a(next.f7805a, new Runnable() { // from class: com.anythink.basead.exoplayer.h.t.a.3
                    @Override // java.lang.Runnable
                    public final void run() {
                        t tVar2 = tVar;
                        a aVar = a.this;
                        tVar2.a(aVar.f7771a, aVar.f7772b, bVar, cVar);
                    }
                });
            }
        }

        private void a(com.anythink.basead.exoplayer.j.k kVar, int i, long j6, long j9, long j10) {
            a(kVar, i, -1, null, 0, null, com.anythink.basead.exoplayer.b.f6382b, com.anythink.basead.exoplayer.b.f6382b, j6, j9, j10);
        }

        public final void a(com.anythink.basead.exoplayer.j.k kVar, int i, int i6, com.anythink.basead.exoplayer.m mVar, int i9, Object obj, long j6, long j9, long j10, long j11, long j12) {
            b(new b(kVar, j10, j11, j12), new c(i, i6, mVar, i9, obj, a(j6), a(j9)));
        }

        public final void a(com.anythink.basead.exoplayer.j.k kVar, IOException iOException) {
            a(kVar, 6, -1, null, 0, null, com.anythink.basead.exoplayer.b.f6382b, com.anythink.basead.exoplayer.b.f6382b, -1L, 0L, 0L, iOException, true);
        }

        public final void a(com.anythink.basead.exoplayer.j.k kVar, int i, int i6, com.anythink.basead.exoplayer.m mVar, int i9, Object obj, long j6, long j9, long j10, long j11, long j12, IOException iOException, boolean z3) {
            a(new b(kVar, j10, j11, j12), new c(i, i6, mVar, i9, obj, a(j6), a(j9)), iOException, z3);
        }

        public final void a(final b bVar, final c cVar, final IOException iOException, final boolean z3) {
            Iterator<C0029a> it = this.f7773c.iterator();
            while (it.hasNext()) {
                C0029a next = it.next();
                final t tVar = next.f7806b;
                a(next.f7805a, new Runnable() { // from class: com.anythink.basead.exoplayer.h.t.a.6
                    @Override // java.lang.Runnable
                    public final void run() {
                        t tVar2 = tVar;
                        a aVar = a.this;
                        tVar2.a(aVar.f7771a, aVar.f7772b, bVar, cVar, iOException, z3);
                    }
                });
            }
        }

        public final void a(int i, long j6, long j9) {
            a(new c(1, i, null, 3, null, a(j6), a(j9)));
        }

        public final void a(final c cVar) {
            Iterator<C0029a> it = this.f7773c.iterator();
            while (it.hasNext()) {
                C0029a next = it.next();
                final t tVar = next.f7806b;
                a(next.f7805a, new Runnable() { // from class: com.anythink.basead.exoplayer.h.t.a.8
                    @Override // java.lang.Runnable
                    public final void run() {
                        t tVar2 = tVar;
                        a aVar = a.this;
                        tVar2.a(aVar.f7771a, aVar.f7772b, cVar);
                    }
                });
            }
        }

        public final void a(int i, com.anythink.basead.exoplayer.m mVar, int i6, Object obj, long j6) {
            b(new c(1, i, mVar, i6, obj, a(j6), com.anythink.basead.exoplayer.b.f6382b));
        }

        private long a(long j6) {
            long a9 = com.anythink.basead.exoplayer.b.a(j6);
            return a9 == com.anythink.basead.exoplayer.b.f6382b ? com.anythink.basead.exoplayer.b.f6382b : this.f7774d + a9;
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
        public final com.anythink.basead.exoplayer.j.k f7807a;

        /* renamed from: b, reason: collision with root package name */
        public final long f7808b;

        /* renamed from: c, reason: collision with root package name */
        public final long f7809c;

        /* renamed from: d, reason: collision with root package name */
        public final long f7810d;

        public b(com.anythink.basead.exoplayer.j.k kVar, long j6, long j9, long j10) {
            this.f7807a = kVar;
            this.f7808b = j6;
            this.f7809c = j9;
            this.f7810d = j10;
        }
    }

    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final int f7811a;

        /* renamed from: b, reason: collision with root package name */
        public final int f7812b;

        /* renamed from: c, reason: collision with root package name */
        public final com.anythink.basead.exoplayer.m f7813c;

        /* renamed from: d, reason: collision with root package name */
        public final int f7814d;

        /* renamed from: e, reason: collision with root package name */
        public final Object f7815e;

        /* renamed from: f, reason: collision with root package name */
        public final long f7816f;

        /* renamed from: g, reason: collision with root package name */
        public final long f7817g;

        public c(int i, int i6, com.anythink.basead.exoplayer.m mVar, int i9, Object obj, long j6, long j9) {
            this.f7811a = i;
            this.f7812b = i6;
            this.f7813c = mVar;
            this.f7814d = i9;
            this.f7815e = obj;
            this.f7816f = j6;
            this.f7817g = j9;
        }
    }

    void a(int i, s.a aVar);

    void a(int i, s.a aVar, b bVar, c cVar);

    void a(int i, s.a aVar, b bVar, c cVar, IOException iOException, boolean z3);

    void a(int i, s.a aVar, c cVar);

    void b(int i, s.a aVar);

    void b(int i, s.a aVar, b bVar, c cVar);

    void b(int i, s.a aVar, c cVar);

    void c(int i, s.a aVar);

    void c(int i, s.a aVar, b bVar, c cVar);
}
