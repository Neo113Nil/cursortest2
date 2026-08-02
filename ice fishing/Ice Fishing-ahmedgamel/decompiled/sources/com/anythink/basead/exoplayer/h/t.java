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
        public final int f8557a;

        /* renamed from: b, reason: collision with root package name */
        public final s.a f8558b;

        /* renamed from: c, reason: collision with root package name */
        private final CopyOnWriteArrayList<C0029a> f8559c;

        /* renamed from: d, reason: collision with root package name */
        private final long f8560d;

        /* renamed from: com.anythink.basead.exoplayer.h.t$a$a, reason: collision with other inner class name */
        public static final class C0029a {

            /* renamed from: a, reason: collision with root package name */
            public final Handler f8591a;

            /* renamed from: b, reason: collision with root package name */
            public final t f8592b;

            public C0029a(Handler handler, t tVar) {
                this.f8591a = handler;
                this.f8592b = tVar;
            }
        }

        public a() {
            this(new CopyOnWriteArrayList(), 0, null, 0L);
        }

        public final a a(int i, s.a aVar, long j6) {
            return new a(this.f8559c, i, aVar, j6);
        }

        public final void b() {
            com.anythink.basead.exoplayer.k.a.b(this.f8558b != null);
            Iterator<C0029a> it = this.f8559c.iterator();
            while (it.hasNext()) {
                C0029a next = it.next();
                final t tVar = next.f8592b;
                a(next.f8591a, new Runnable() { // from class: com.anythink.basead.exoplayer.h.t.a.2
                    @Override // java.lang.Runnable
                    public final void run() {
                        t tVar2 = tVar;
                        a aVar = a.this;
                        tVar2.b(aVar.f8557a, aVar.f8558b);
                    }
                });
            }
        }

        public final void c(final b bVar, final c cVar) {
            Iterator<C0029a> it = this.f8559c.iterator();
            while (it.hasNext()) {
                C0029a next = it.next();
                final t tVar = next.f8592b;
                a(next.f8591a, new Runnable() { // from class: com.anythink.basead.exoplayer.h.t.a.5
                    @Override // java.lang.Runnable
                    public final void run() {
                        t tVar2 = tVar;
                        a aVar = a.this;
                        tVar2.c(aVar.f8557a, aVar.f8558b, bVar, cVar);
                    }
                });
            }
        }

        private a(CopyOnWriteArrayList<C0029a> copyOnWriteArrayList, int i, s.a aVar, long j6) {
            this.f8559c = copyOnWriteArrayList;
            this.f8557a = i;
            this.f8558b = aVar;
            this.f8560d = j6;
        }

        public final void a(Handler handler, t tVar) {
            com.anythink.basead.exoplayer.k.a.a((handler == null || tVar == null) ? false : true);
            this.f8559c.add(new C0029a(handler, tVar));
        }

        public final void a(t tVar) {
            Iterator<C0029a> it = this.f8559c.iterator();
            while (it.hasNext()) {
                C0029a next = it.next();
                if (next.f8592b == tVar) {
                    this.f8559c.remove(next);
                }
            }
        }

        public final void c() {
            com.anythink.basead.exoplayer.k.a.b(this.f8558b != null);
            Iterator<C0029a> it = this.f8559c.iterator();
            while (it.hasNext()) {
                C0029a next = it.next();
                final t tVar = next.f8592b;
                a(next.f8591a, new Runnable() { // from class: com.anythink.basead.exoplayer.h.t.a.7
                    @Override // java.lang.Runnable
                    public final void run() {
                        t tVar2 = tVar;
                        a aVar = a.this;
                        tVar2.c(aVar.f8557a, aVar.f8558b);
                    }
                });
            }
        }

        public final void b(final b bVar, final c cVar) {
            Iterator<C0029a> it = this.f8559c.iterator();
            while (it.hasNext()) {
                C0029a next = it.next();
                final t tVar = next.f8592b;
                a(next.f8591a, new Runnable() { // from class: com.anythink.basead.exoplayer.h.t.a.4
                    @Override // java.lang.Runnable
                    public final void run() {
                        t tVar2 = tVar;
                        a aVar = a.this;
                        tVar2.b(aVar.f8557a, aVar.f8558b, bVar, cVar);
                    }
                });
            }
        }

        public final void a() {
            com.anythink.basead.exoplayer.k.a.b(this.f8558b != null);
            Iterator<C0029a> it = this.f8559c.iterator();
            while (it.hasNext()) {
                C0029a next = it.next();
                final t tVar = next.f8592b;
                a(next.f8591a, new Runnable() { // from class: com.anythink.basead.exoplayer.h.t.a.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        t tVar2 = tVar;
                        a aVar = a.this;
                        tVar2.a(aVar.f8557a, aVar.f8558b);
                    }
                });
            }
        }

        private void b(com.anythink.basead.exoplayer.j.k kVar, int i, long j6, long j9, long j10) {
            b(kVar, i, -1, null, 0, null, com.anythink.basead.exoplayer.b.f7168b, com.anythink.basead.exoplayer.b.f7168b, j6, j9, j10);
        }

        public final void b(com.anythink.basead.exoplayer.j.k kVar, int i, int i4, com.anythink.basead.exoplayer.m mVar, int i6, Object obj, long j6, long j9, long j10, long j11, long j12) {
            c(new b(kVar, j10, j11, j12), new c(i, i4, mVar, i6, obj, a(j6), a(j9)));
        }

        private void a(com.anythink.basead.exoplayer.j.k kVar, int i, long j6) {
            a(kVar, i, -1, null, 0, null, com.anythink.basead.exoplayer.b.f7168b, com.anythink.basead.exoplayer.b.f7168b, j6);
        }

        public final void a(com.anythink.basead.exoplayer.j.k kVar, int i, int i4, com.anythink.basead.exoplayer.m mVar, int i6, Object obj, long j6, long j9, long j10) {
            a(new b(kVar, j10, 0L, 0L), new c(i, i4, mVar, i6, obj, a(j6), a(j9)));
        }

        public final void b(final c cVar) {
            Iterator<C0029a> it = this.f8559c.iterator();
            while (it.hasNext()) {
                C0029a next = it.next();
                final t tVar = next.f8592b;
                a(next.f8591a, new Runnable() { // from class: com.anythink.basead.exoplayer.h.t.a.9
                    @Override // java.lang.Runnable
                    public final void run() {
                        t tVar2 = tVar;
                        a aVar = a.this;
                        tVar2.b(aVar.f8557a, aVar.f8558b, cVar);
                    }
                });
            }
        }

        public final void a(final b bVar, final c cVar) {
            Iterator<C0029a> it = this.f8559c.iterator();
            while (it.hasNext()) {
                C0029a next = it.next();
                final t tVar = next.f8592b;
                a(next.f8591a, new Runnable() { // from class: com.anythink.basead.exoplayer.h.t.a.3
                    @Override // java.lang.Runnable
                    public final void run() {
                        t tVar2 = tVar;
                        a aVar = a.this;
                        tVar2.a(aVar.f8557a, aVar.f8558b, bVar, cVar);
                    }
                });
            }
        }

        private void a(com.anythink.basead.exoplayer.j.k kVar, int i, long j6, long j9, long j10) {
            a(kVar, i, -1, null, 0, null, com.anythink.basead.exoplayer.b.f7168b, com.anythink.basead.exoplayer.b.f7168b, j6, j9, j10);
        }

        public final void a(com.anythink.basead.exoplayer.j.k kVar, int i, int i4, com.anythink.basead.exoplayer.m mVar, int i6, Object obj, long j6, long j9, long j10, long j11, long j12) {
            b(new b(kVar, j10, j11, j12), new c(i, i4, mVar, i6, obj, a(j6), a(j9)));
        }

        public final void a(com.anythink.basead.exoplayer.j.k kVar, IOException iOException) {
            a(kVar, 6, -1, null, 0, null, com.anythink.basead.exoplayer.b.f7168b, com.anythink.basead.exoplayer.b.f7168b, -1L, 0L, 0L, iOException, true);
        }

        public final void a(com.anythink.basead.exoplayer.j.k kVar, int i, int i4, com.anythink.basead.exoplayer.m mVar, int i6, Object obj, long j6, long j9, long j10, long j11, long j12, IOException iOException, boolean z6) {
            a(new b(kVar, j10, j11, j12), new c(i, i4, mVar, i6, obj, a(j6), a(j9)), iOException, z6);
        }

        public final void a(final b bVar, final c cVar, final IOException iOException, final boolean z6) {
            Iterator<C0029a> it = this.f8559c.iterator();
            while (it.hasNext()) {
                C0029a next = it.next();
                final t tVar = next.f8592b;
                a(next.f8591a, new Runnable() { // from class: com.anythink.basead.exoplayer.h.t.a.6
                    @Override // java.lang.Runnable
                    public final void run() {
                        t tVar2 = tVar;
                        a aVar = a.this;
                        tVar2.a(aVar.f8557a, aVar.f8558b, bVar, cVar, iOException, z6);
                    }
                });
            }
        }

        public final void a(int i, long j6, long j9) {
            a(new c(1, i, null, 3, null, a(j6), a(j9)));
        }

        public final void a(final c cVar) {
            Iterator<C0029a> it = this.f8559c.iterator();
            while (it.hasNext()) {
                C0029a next = it.next();
                final t tVar = next.f8592b;
                a(next.f8591a, new Runnable() { // from class: com.anythink.basead.exoplayer.h.t.a.8
                    @Override // java.lang.Runnable
                    public final void run() {
                        t tVar2 = tVar;
                        a aVar = a.this;
                        tVar2.a(aVar.f8557a, aVar.f8558b, cVar);
                    }
                });
            }
        }

        public final void a(int i, com.anythink.basead.exoplayer.m mVar, int i4, Object obj, long j6) {
            b(new c(1, i, mVar, i4, obj, a(j6), com.anythink.basead.exoplayer.b.f7168b));
        }

        private long a(long j6) {
            long a9 = com.anythink.basead.exoplayer.b.a(j6);
            return a9 == com.anythink.basead.exoplayer.b.f7168b ? com.anythink.basead.exoplayer.b.f7168b : this.f8560d + a9;
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
        public final com.anythink.basead.exoplayer.j.k f8593a;

        /* renamed from: b, reason: collision with root package name */
        public final long f8594b;

        /* renamed from: c, reason: collision with root package name */
        public final long f8595c;

        /* renamed from: d, reason: collision with root package name */
        public final long f8596d;

        public b(com.anythink.basead.exoplayer.j.k kVar, long j6, long j9, long j10) {
            this.f8593a = kVar;
            this.f8594b = j6;
            this.f8595c = j9;
            this.f8596d = j10;
        }
    }

    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final int f8597a;

        /* renamed from: b, reason: collision with root package name */
        public final int f8598b;

        /* renamed from: c, reason: collision with root package name */
        public final com.anythink.basead.exoplayer.m f8599c;

        /* renamed from: d, reason: collision with root package name */
        public final int f8600d;

        /* renamed from: e, reason: collision with root package name */
        public final Object f8601e;

        /* renamed from: f, reason: collision with root package name */
        public final long f8602f;

        /* renamed from: g, reason: collision with root package name */
        public final long f8603g;

        public c(int i, int i4, com.anythink.basead.exoplayer.m mVar, int i6, Object obj, long j6, long j9) {
            this.f8597a = i;
            this.f8598b = i4;
            this.f8599c = mVar;
            this.f8600d = i6;
            this.f8601e = obj;
            this.f8602f = j6;
            this.f8603g = j9;
        }
    }

    void a(int i, s.a aVar);

    void a(int i, s.a aVar, b bVar, c cVar);

    void a(int i, s.a aVar, b bVar, c cVar, IOException iOException, boolean z6);

    void a(int i, s.a aVar, c cVar);

    void b(int i, s.a aVar);

    void b(int i, s.a aVar, b bVar, c cVar);

    void b(int i, s.a aVar, c cVar);

    void c(int i, s.a aVar);

    void c(int i, s.a aVar, b bVar, c cVar);
}
