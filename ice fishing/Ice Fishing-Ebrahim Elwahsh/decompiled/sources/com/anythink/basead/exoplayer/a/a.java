package com.anythink.basead.exoplayer.a;

import android.net.NetworkInfo;
import android.view.Surface;
import com.anythink.basead.exoplayer.a.b;
import com.anythink.basead.exoplayer.ae;
import com.anythink.basead.exoplayer.b.g;
import com.anythink.basead.exoplayer.g.f;
import com.anythink.basead.exoplayer.h.af;
import com.anythink.basead.exoplayer.h.s;
import com.anythink.basead.exoplayer.h.t;
import com.anythink.basead.exoplayer.j.d;
import com.anythink.basead.exoplayer.k.C0544a;
import com.anythink.basead.exoplayer.l.h;
import com.anythink.basead.exoplayer.m;
import com.anythink.basead.exoplayer.v;
import com.anythink.basead.exoplayer.w;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes.dex */
public final class a implements g, com.anythink.basead.exoplayer.d.c, f, t, d.a, h, w.c {

    /* renamed from: b, reason: collision with root package name */
    private final com.anythink.basead.exoplayer.k.c f6447b;

    /* renamed from: e, reason: collision with root package name */
    private w f6450e;

    /* renamed from: a, reason: collision with root package name */
    private final CopyOnWriteArraySet<com.anythink.basead.exoplayer.a.b> f6446a = new CopyOnWriteArraySet<>();

    /* renamed from: d, reason: collision with root package name */
    private final b f6449d = new b();

    /* renamed from: c, reason: collision with root package name */
    private final ae.b f6448c = new ae.b();

    /* renamed from: com.anythink.basead.exoplayer.a.a$a, reason: collision with other inner class name */
    public static class C0013a {
        public static a a(w wVar, com.anythink.basead.exoplayer.k.c cVar) {
            return new a(wVar, cVar);
        }
    }

    public static final class b {

        /* renamed from: c, reason: collision with root package name */
        private c f6453c;

        /* renamed from: d, reason: collision with root package name */
        private c f6454d;

        /* renamed from: f, reason: collision with root package name */
        private boolean f6456f;

        /* renamed from: a, reason: collision with root package name */
        private final ArrayList<c> f6451a = new ArrayList<>();

        /* renamed from: b, reason: collision with root package name */
        private final ae.a f6452b = new ae.a();

        /* renamed from: e, reason: collision with root package name */
        private ae f6455e = ae.f6498a;

        private void i() {
            if (this.f6451a.isEmpty()) {
                return;
            }
            this.f6453c = this.f6451a.get(0);
        }

        public final c b() {
            return this.f6453c;
        }

        public final c c() {
            return this.f6454d;
        }

        public final c d() {
            if (this.f6451a.isEmpty()) {
                return null;
            }
            return this.f6451a.get(r0.size() - 1);
        }

        public final boolean e() {
            return this.f6456f;
        }

        public final void f() {
            i();
        }

        public final void g() {
            this.f6456f = true;
        }

        public final void h() {
            this.f6456f = false;
            i();
        }

        public final c a() {
            if (this.f6451a.isEmpty() || this.f6455e.a() || this.f6456f) {
                return null;
            }
            return this.f6451a.get(0);
        }

        public final void b(int i, s.a aVar) {
            c cVar = new c(i, aVar);
            this.f6451a.remove(cVar);
            if (cVar.equals(this.f6454d)) {
                this.f6454d = this.f6451a.isEmpty() ? null : this.f6451a.get(0);
            }
        }

        public final void c(int i, s.a aVar) {
            this.f6454d = new c(i, aVar);
        }

        public final s.a a(int i) {
            ae aeVar = this.f6455e;
            if (aeVar == null) {
                return null;
            }
            int c4 = aeVar.c();
            s.a aVar = null;
            for (int i4 = 0; i4 < this.f6451a.size(); i4++) {
                c cVar = this.f6451a.get(i4);
                int i9 = cVar.f6458b.f7924a;
                if (i9 < c4 && this.f6455e.a(i9, this.f6452b, false).f6501c == i) {
                    if (aVar != null) {
                        return null;
                    }
                    aVar = cVar.f6458b;
                }
            }
            return aVar;
        }

        public final void a(ae aeVar) {
            for (int i = 0; i < this.f6451a.size(); i++) {
                ArrayList<c> arrayList = this.f6451a;
                arrayList.set(i, a(arrayList.get(i), aeVar));
            }
            c cVar = this.f6454d;
            if (cVar != null) {
                this.f6454d = a(cVar, aeVar);
            }
            this.f6455e = aeVar;
            i();
        }

        public final void a(int i, s.a aVar) {
            this.f6451a.add(new c(i, aVar));
            if (this.f6451a.size() != 1 || this.f6455e.a()) {
                return;
            }
            i();
        }

        private c a(c cVar, ae aeVar) {
            int a9;
            return (aeVar.a() || this.f6455e.a() || (a9 = aeVar.a(this.f6455e.a(cVar.f6458b.f7924a, this.f6452b, true).f6500b)) == -1) ? cVar : new c(aeVar.a(a9, this.f6452b, false).f6501c, cVar.f6458b.a(a9));
        }
    }

    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final int f6457a;

        /* renamed from: b, reason: collision with root package name */
        public final s.a f6458b;

        public c(int i, s.a aVar) {
            this.f6457a = i;
            this.f6458b = aVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && c.class == obj.getClass()) {
                c cVar = (c) obj;
                if (this.f6457a == cVar.f6457a && this.f6458b.equals(cVar.f6458b)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return this.f6458b.hashCode() + (this.f6457a * 31);
        }
    }

    public a(w wVar, com.anythink.basead.exoplayer.k.c cVar) {
        this.f6450e = wVar;
        this.f6447b = (com.anythink.basead.exoplayer.k.c) C0544a.a(cVar);
    }

    private Set<com.anythink.basead.exoplayer.a.b> g() {
        return Collections.unmodifiableSet(this.f6446a);
    }

    private b.a h() {
        return a(this.f6449d.b());
    }

    private b.a i() {
        return a(this.f6449d.a());
    }

    private b.a j() {
        return a(this.f6449d.c());
    }

    private b.a k() {
        return a(this.f6449d.d());
    }

    public final void a(com.anythink.basead.exoplayer.a.b bVar) {
        this.f6446a.add(bVar);
    }

    public final void b(com.anythink.basead.exoplayer.a.b bVar) {
        this.f6446a.remove(bVar);
    }

    @Override // com.anythink.basead.exoplayer.b.g
    public final void c(com.anythink.basead.exoplayer.c.d dVar) {
        b.a i = i();
        Iterator<com.anythink.basead.exoplayer.a.b> it = this.f6446a.iterator();
        while (it.hasNext()) {
            it.next().d(i, 1);
        }
    }

    @Override // com.anythink.basead.exoplayer.b.g
    public final void d(com.anythink.basead.exoplayer.c.d dVar) {
        b.a h9 = h();
        Iterator<com.anythink.basead.exoplayer.a.b> it = this.f6446a.iterator();
        while (it.hasNext()) {
            it.next().e(h9, 1);
        }
    }

    @Override // com.anythink.basead.exoplayer.d.c
    public final void e() {
        b.a j9 = j();
        Iterator<com.anythink.basead.exoplayer.a.b> it = this.f6446a.iterator();
        while (it.hasNext()) {
            it.next().g(j9);
        }
    }

    @Override // com.anythink.basead.exoplayer.d.c
    public final void f() {
        b.a j9 = j();
        Iterator<com.anythink.basead.exoplayer.a.b> it = this.f6446a.iterator();
        while (it.hasNext()) {
            it.next().h(j9);
        }
    }

    @Override // com.anythink.basead.exoplayer.w.c
    public final void onLoadingChanged(boolean z8) {
        b.a i = i();
        Iterator<com.anythink.basead.exoplayer.a.b> it = this.f6446a.iterator();
        while (it.hasNext()) {
            it.next().b(i, z8);
        }
    }

    @Override // com.anythink.basead.exoplayer.w.c
    public final void onPlaybackParametersChanged(v vVar) {
        b.a i = i();
        Iterator<com.anythink.basead.exoplayer.a.b> it = this.f6446a.iterator();
        while (it.hasNext()) {
            it.next().a(i, vVar);
        }
    }

    @Override // com.anythink.basead.exoplayer.w.c
    public final void onPlayerError(com.anythink.basead.exoplayer.g gVar) {
        b.a i = i();
        Iterator<com.anythink.basead.exoplayer.a.b> it = this.f6446a.iterator();
        while (it.hasNext()) {
            it.next().a(i, gVar);
        }
    }

    @Override // com.anythink.basead.exoplayer.w.c
    public final void onPlayerStateChanged(boolean z8, int i) {
        b.a i4 = i();
        Iterator<com.anythink.basead.exoplayer.a.b> it = this.f6446a.iterator();
        while (it.hasNext()) {
            it.next().a(i4, z8, i);
        }
    }

    @Override // com.anythink.basead.exoplayer.w.c
    public final void onPositionDiscontinuity(int i) {
        this.f6449d.f();
        b.a i4 = i();
        Iterator<com.anythink.basead.exoplayer.a.b> it = this.f6446a.iterator();
        while (it.hasNext()) {
            it.next().b(i4, i);
        }
    }

    @Override // com.anythink.basead.exoplayer.w.c
    public final void onRepeatModeChanged(int i) {
        b.a i4 = i();
        Iterator<com.anythink.basead.exoplayer.a.b> it = this.f6446a.iterator();
        while (it.hasNext()) {
            it.next().c(i4, i);
        }
    }

    @Override // com.anythink.basead.exoplayer.w.c
    public final void onSeekProcessed() {
        if (this.f6449d.e()) {
            this.f6449d.h();
            b.a i = i();
            Iterator<com.anythink.basead.exoplayer.a.b> it = this.f6446a.iterator();
            while (it.hasNext()) {
                it.next().b(i);
            }
        }
    }

    @Override // com.anythink.basead.exoplayer.w.c
    public final void onShuffleModeEnabledChanged(boolean z8) {
        b.a i = i();
        Iterator<com.anythink.basead.exoplayer.a.b> it = this.f6446a.iterator();
        while (it.hasNext()) {
            it.next().a(i, z8);
        }
    }

    @Override // com.anythink.basead.exoplayer.w.c
    public final void onTimelineChanged(ae aeVar, Object obj, int i) {
        this.f6449d.a(aeVar);
        b.a i4 = i();
        Iterator<com.anythink.basead.exoplayer.a.b> it = this.f6446a.iterator();
        while (it.hasNext()) {
            it.next().a(i4, i);
        }
    }

    @Override // com.anythink.basead.exoplayer.w.c
    public final void onTracksChanged(af afVar, com.anythink.basead.exoplayer.i.g gVar) {
        b.a i = i();
        Iterator<com.anythink.basead.exoplayer.a.b> it = this.f6446a.iterator();
        while (it.hasNext()) {
            it.next().a(i, gVar);
        }
    }

    private void a(w wVar) {
        C0544a.b(this.f6450e == null);
        this.f6450e = (w) C0544a.a(wVar);
    }

    public final void b() {
        Iterator it = new ArrayList(this.f6449d.f6451a).iterator();
        while (it.hasNext()) {
            c cVar = (c) it.next();
            b(cVar.f6457a, cVar.f6458b);
        }
    }

    public final void a() {
        if (this.f6449d.e()) {
            return;
        }
        b.a i = i();
        this.f6449d.g();
        Iterator<com.anythink.basead.exoplayer.a.b> it = this.f6446a.iterator();
        while (it.hasNext()) {
            it.next().a(i);
        }
    }

    @Override // com.anythink.basead.exoplayer.h.t
    public final void c(int i, s.a aVar, t.b bVar, t.c cVar) {
        d(i, aVar);
        Iterator<com.anythink.basead.exoplayer.a.b> it = this.f6446a.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    @Override // com.anythink.basead.exoplayer.d.c
    public final void d() {
        b.a j9 = j();
        Iterator<com.anythink.basead.exoplayer.a.b> it = this.f6446a.iterator();
        while (it.hasNext()) {
            it.next().f(j9);
        }
    }

    @Override // com.anythink.basead.exoplayer.b.g
    public final void b(String str, long j9, long j10) {
        b.a j11 = j();
        Iterator<com.anythink.basead.exoplayer.a.b> it = this.f6446a.iterator();
        while (it.hasNext()) {
            it.next().a(j11, 1, str);
        }
    }

    @Override // com.anythink.basead.exoplayer.h.t
    public final void c(int i, s.a aVar) {
        this.f6449d.c(i, aVar);
        b.a d2 = d(i, aVar);
        Iterator<com.anythink.basead.exoplayer.a.b> it = this.f6446a.iterator();
        while (it.hasNext()) {
            it.next().e(d2);
        }
    }

    private b.a d(int i, s.a aVar) {
        C0544a.a(this.f6450e);
        long a9 = this.f6447b.a();
        ae F8 = this.f6450e.F();
        long j9 = 0;
        if (i == this.f6450e.p()) {
            if (aVar != null && aVar.a()) {
                if (this.f6450e.z() == aVar.f7925b && this.f6450e.A() == aVar.f7926c) {
                    j9 = this.f6450e.t();
                }
            } else {
                j9 = this.f6450e.B();
            }
        } else if (i < F8.b() && (aVar == null || !aVar.a())) {
            j9 = com.anythink.basead.exoplayer.b.a(F8.a(i, this.f6448c, false).f6512h);
        }
        return new b.a(a9, F8, i, aVar, j9, this.f6450e.t(), this.f6450e.u() - this.f6450e.B());
    }

    private void a(int i, int i4) {
        b.a i9 = i();
        Iterator<com.anythink.basead.exoplayer.a.b> it = this.f6446a.iterator();
        while (it.hasNext()) {
            it.next().a(i9, i, i4);
        }
    }

    @Override // com.anythink.basead.exoplayer.b.g
    public final void b(m mVar) {
        b.a j9 = j();
        Iterator<com.anythink.basead.exoplayer.a.b> it = this.f6446a.iterator();
        while (it.hasNext()) {
            it.next().a(j9, 1, mVar);
        }
    }

    @Override // com.anythink.basead.exoplayer.j.d.a
    public final void c() {
        a(this.f6449d.d());
        Iterator<com.anythink.basead.exoplayer.a.b> it = this.f6446a.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    private void a(NetworkInfo networkInfo) {
        b.a i = i();
        Iterator<com.anythink.basead.exoplayer.a.b> it = this.f6446a.iterator();
        while (it.hasNext()) {
            it.next().a(i, networkInfo);
        }
    }

    @Override // com.anythink.basead.exoplayer.l.h
    public final void b(com.anythink.basead.exoplayer.c.d dVar) {
        b.a h9 = h();
        Iterator<com.anythink.basead.exoplayer.a.b> it = this.f6446a.iterator();
        while (it.hasNext()) {
            it.next().e(h9, 2);
        }
    }

    @Override // com.anythink.basead.exoplayer.g.f
    public final void a(com.anythink.basead.exoplayer.g.a aVar) {
        b.a i = i();
        Iterator<com.anythink.basead.exoplayer.a.b> it = this.f6446a.iterator();
        while (it.hasNext()) {
            it.next().a(i, aVar);
        }
    }

    @Override // com.anythink.basead.exoplayer.h.t
    public final void b(int i, s.a aVar) {
        this.f6449d.b(i, aVar);
        b.a d2 = d(i, aVar);
        Iterator<com.anythink.basead.exoplayer.a.b> it = this.f6446a.iterator();
        while (it.hasNext()) {
            it.next().d(d2);
        }
    }

    @Override // com.anythink.basead.exoplayer.b.g
    public final void a(int i) {
        b.a j9 = j();
        Iterator<com.anythink.basead.exoplayer.a.b> it = this.f6446a.iterator();
        while (it.hasNext()) {
            it.next().f(j9, i);
        }
    }

    @Override // com.anythink.basead.exoplayer.h.t
    public final void b(int i, s.a aVar, t.b bVar, t.c cVar) {
        d(i, aVar);
        Iterator<com.anythink.basead.exoplayer.a.b> it = this.f6446a.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    @Override // com.anythink.basead.exoplayer.b.g
    public final void a(int i, long j9, long j10) {
        b.a j11 = j();
        Iterator<com.anythink.basead.exoplayer.a.b> it = this.f6446a.iterator();
        while (it.hasNext()) {
            it.next().a(j11, i, j9, j10);
        }
    }

    @Override // com.anythink.basead.exoplayer.h.t
    public final void b(int i, s.a aVar, t.c cVar) {
        b.a d2 = d(i, aVar);
        Iterator<com.anythink.basead.exoplayer.a.b> it = this.f6446a.iterator();
        while (it.hasNext()) {
            it.next().a(d2, cVar);
        }
    }

    @Override // com.anythink.basead.exoplayer.l.h
    public final void a(com.anythink.basead.exoplayer.c.d dVar) {
        b.a i = i();
        Iterator<com.anythink.basead.exoplayer.a.b> it = this.f6446a.iterator();
        while (it.hasNext()) {
            it.next().d(i, 2);
        }
    }

    @Override // com.anythink.basead.exoplayer.l.h
    public final void a(String str, long j9, long j10) {
        b.a j11 = j();
        Iterator<com.anythink.basead.exoplayer.a.b> it = this.f6446a.iterator();
        while (it.hasNext()) {
            it.next().a(j11, 2, str);
        }
    }

    @Override // com.anythink.basead.exoplayer.l.h
    public final void a(m mVar) {
        b.a j9 = j();
        Iterator<com.anythink.basead.exoplayer.a.b> it = this.f6446a.iterator();
        while (it.hasNext()) {
            it.next().a(j9, 2, mVar);
        }
    }

    @Override // com.anythink.basead.exoplayer.l.h
    public final void a(int i, long j9) {
        b.a h9 = h();
        Iterator<com.anythink.basead.exoplayer.a.b> it = this.f6446a.iterator();
        while (it.hasNext()) {
            it.next().g(h9, i);
        }
    }

    @Override // com.anythink.basead.exoplayer.l.h
    public final void a(int i, int i4, int i9, float f6) {
        b.a j9 = j();
        Iterator<com.anythink.basead.exoplayer.a.b> it = this.f6446a.iterator();
        while (it.hasNext()) {
            it.next().b(j9, i, i4);
        }
    }

    @Override // com.anythink.basead.exoplayer.l.h
    public final void a(Surface surface) {
        b.a j9 = j();
        Iterator<com.anythink.basead.exoplayer.a.b> it = this.f6446a.iterator();
        while (it.hasNext()) {
            it.next().a(j9, surface);
        }
    }

    @Override // com.anythink.basead.exoplayer.h.t
    public final void a(int i, s.a aVar) {
        this.f6449d.a(i, aVar);
        b.a d2 = d(i, aVar);
        Iterator<com.anythink.basead.exoplayer.a.b> it = this.f6446a.iterator();
        while (it.hasNext()) {
            it.next().c(d2);
        }
    }

    @Override // com.anythink.basead.exoplayer.h.t
    public final void a(int i, s.a aVar, t.b bVar, t.c cVar) {
        d(i, aVar);
        Iterator<com.anythink.basead.exoplayer.a.b> it = this.f6446a.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    @Override // com.anythink.basead.exoplayer.h.t
    public final void a(int i, s.a aVar, t.b bVar, t.c cVar, IOException iOException, boolean z8) {
        b.a d2 = d(i, aVar);
        Iterator<com.anythink.basead.exoplayer.a.b> it = this.f6446a.iterator();
        while (it.hasNext()) {
            it.next().a(d2, iOException);
        }
    }

    @Override // com.anythink.basead.exoplayer.h.t
    public final void a(int i, s.a aVar, t.c cVar) {
        b.a d2 = d(i, aVar);
        Iterator<com.anythink.basead.exoplayer.a.b> it = this.f6446a.iterator();
        while (it.hasNext()) {
            it.next().b(d2, cVar);
        }
    }

    @Override // com.anythink.basead.exoplayer.d.c
    public final void a(Exception exc) {
        b.a j9 = j();
        Iterator<com.anythink.basead.exoplayer.a.b> it = this.f6446a.iterator();
        while (it.hasNext()) {
            it.next().a(j9, exc);
        }
    }

    private b.a a(c cVar) {
        if (cVar == null) {
            int p6 = ((w) C0544a.a(this.f6450e)).p();
            return d(p6, this.f6449d.a(p6));
        }
        return d(cVar.f6457a, cVar.f6458b);
    }
}
