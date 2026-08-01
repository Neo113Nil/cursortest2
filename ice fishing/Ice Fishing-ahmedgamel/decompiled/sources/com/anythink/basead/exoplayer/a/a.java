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
    private final com.anythink.basead.exoplayer.k.c f6290b;

    /* renamed from: e, reason: collision with root package name */
    private w f6293e;

    /* renamed from: a, reason: collision with root package name */
    private final CopyOnWriteArraySet<com.anythink.basead.exoplayer.a.b> f6289a = new CopyOnWriteArraySet<>();

    /* renamed from: d, reason: collision with root package name */
    private final b f6292d = new b();

    /* renamed from: c, reason: collision with root package name */
    private final ae.b f6291c = new ae.b();

    /* renamed from: com.anythink.basead.exoplayer.a.a$a, reason: collision with other inner class name */
    public static class C0014a {
        public static a a(w wVar, com.anythink.basead.exoplayer.k.c cVar) {
            return new a(wVar, cVar);
        }
    }

    public static final class b {

        /* renamed from: c, reason: collision with root package name */
        private c f6296c;

        /* renamed from: d, reason: collision with root package name */
        private c f6297d;

        /* renamed from: f, reason: collision with root package name */
        private boolean f6299f;

        /* renamed from: a, reason: collision with root package name */
        private final ArrayList<c> f6294a = new ArrayList<>();

        /* renamed from: b, reason: collision with root package name */
        private final ae.a f6295b = new ae.a();

        /* renamed from: e, reason: collision with root package name */
        private ae f6298e = ae.f6341a;

        private void i() {
            if (this.f6294a.isEmpty()) {
                return;
            }
            this.f6296c = this.f6294a.get(0);
        }

        public final c b() {
            return this.f6296c;
        }

        public final c c() {
            return this.f6297d;
        }

        public final c d() {
            if (this.f6294a.isEmpty()) {
                return null;
            }
            return this.f6294a.get(r0.size() - 1);
        }

        public final boolean e() {
            return this.f6299f;
        }

        public final void f() {
            i();
        }

        public final void g() {
            this.f6299f = true;
        }

        public final void h() {
            this.f6299f = false;
            i();
        }

        public final c a() {
            if (this.f6294a.isEmpty() || this.f6298e.a() || this.f6299f) {
                return null;
            }
            return this.f6294a.get(0);
        }

        public final void b(int i, s.a aVar) {
            c cVar = new c(i, aVar);
            this.f6294a.remove(cVar);
            if (cVar.equals(this.f6297d)) {
                this.f6297d = this.f6294a.isEmpty() ? null : this.f6294a.get(0);
            }
        }

        public final void c(int i, s.a aVar) {
            this.f6297d = new c(i, aVar);
        }

        public final s.a a(int i) {
            ae aeVar = this.f6298e;
            if (aeVar == null) {
                return null;
            }
            int c9 = aeVar.c();
            s.a aVar = null;
            for (int i6 = 0; i6 < this.f6294a.size(); i6++) {
                c cVar = this.f6294a.get(i6);
                int i9 = cVar.f6301b.f7767a;
                if (i9 < c9 && this.f6298e.a(i9, this.f6295b, false).f6344c == i) {
                    if (aVar != null) {
                        return null;
                    }
                    aVar = cVar.f6301b;
                }
            }
            return aVar;
        }

        public final void a(ae aeVar) {
            for (int i = 0; i < this.f6294a.size(); i++) {
                ArrayList<c> arrayList = this.f6294a;
                arrayList.set(i, a(arrayList.get(i), aeVar));
            }
            c cVar = this.f6297d;
            if (cVar != null) {
                this.f6297d = a(cVar, aeVar);
            }
            this.f6298e = aeVar;
            i();
        }

        public final void a(int i, s.a aVar) {
            this.f6294a.add(new c(i, aVar));
            if (this.f6294a.size() != 1 || this.f6298e.a()) {
                return;
            }
            i();
        }

        private c a(c cVar, ae aeVar) {
            int a9;
            return (aeVar.a() || this.f6298e.a() || (a9 = aeVar.a(this.f6298e.a(cVar.f6301b.f7767a, this.f6295b, true).f6343b)) == -1) ? cVar : new c(aeVar.a(a9, this.f6295b, false).f6344c, cVar.f6301b.a(a9));
        }
    }

    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final int f6300a;

        /* renamed from: b, reason: collision with root package name */
        public final s.a f6301b;

        public c(int i, s.a aVar) {
            this.f6300a = i;
            this.f6301b = aVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && c.class == obj.getClass()) {
                c cVar = (c) obj;
                if (this.f6300a == cVar.f6300a && this.f6301b.equals(cVar.f6301b)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return this.f6301b.hashCode() + (this.f6300a * 31);
        }
    }

    public a(w wVar, com.anythink.basead.exoplayer.k.c cVar) {
        this.f6293e = wVar;
        this.f6290b = (com.anythink.basead.exoplayer.k.c) com.anythink.basead.exoplayer.k.a.a(cVar);
    }

    private Set<com.anythink.basead.exoplayer.a.b> g() {
        return Collections.unmodifiableSet(this.f6289a);
    }

    private b.a h() {
        return a(this.f6292d.b());
    }

    private b.a i() {
        return a(this.f6292d.a());
    }

    private b.a j() {
        return a(this.f6292d.c());
    }

    private b.a k() {
        return a(this.f6292d.d());
    }

    public final void a(com.anythink.basead.exoplayer.a.b bVar) {
        this.f6289a.add(bVar);
    }

    public final void b(com.anythink.basead.exoplayer.a.b bVar) {
        this.f6289a.remove(bVar);
    }

    @Override // com.anythink.basead.exoplayer.b.g
    public final void c(com.anythink.basead.exoplayer.c.d dVar) {
        b.a i = i();
        Iterator<com.anythink.basead.exoplayer.a.b> it = this.f6289a.iterator();
        while (it.hasNext()) {
            it.next().d(i, 1);
        }
    }

    @Override // com.anythink.basead.exoplayer.b.g
    public final void d(com.anythink.basead.exoplayer.c.d dVar) {
        b.a h9 = h();
        Iterator<com.anythink.basead.exoplayer.a.b> it = this.f6289a.iterator();
        while (it.hasNext()) {
            it.next().e(h9, 1);
        }
    }

    @Override // com.anythink.basead.exoplayer.d.c
    public final void e() {
        b.a j6 = j();
        Iterator<com.anythink.basead.exoplayer.a.b> it = this.f6289a.iterator();
        while (it.hasNext()) {
            it.next().g(j6);
        }
    }

    @Override // com.anythink.basead.exoplayer.d.c
    public final void f() {
        b.a j6 = j();
        Iterator<com.anythink.basead.exoplayer.a.b> it = this.f6289a.iterator();
        while (it.hasNext()) {
            it.next().h(j6);
        }
    }

    @Override // com.anythink.basead.exoplayer.w.c
    public final void onLoadingChanged(boolean z3) {
        b.a i = i();
        Iterator<com.anythink.basead.exoplayer.a.b> it = this.f6289a.iterator();
        while (it.hasNext()) {
            it.next().b(i, z3);
        }
    }

    @Override // com.anythink.basead.exoplayer.w.c
    public final void onPlaybackParametersChanged(v vVar) {
        b.a i = i();
        Iterator<com.anythink.basead.exoplayer.a.b> it = this.f6289a.iterator();
        while (it.hasNext()) {
            it.next().a(i, vVar);
        }
    }

    @Override // com.anythink.basead.exoplayer.w.c
    public final void onPlayerError(com.anythink.basead.exoplayer.g gVar) {
        b.a i = i();
        Iterator<com.anythink.basead.exoplayer.a.b> it = this.f6289a.iterator();
        while (it.hasNext()) {
            it.next().a(i, gVar);
        }
    }

    @Override // com.anythink.basead.exoplayer.w.c
    public final void onPlayerStateChanged(boolean z3, int i) {
        b.a i6 = i();
        Iterator<com.anythink.basead.exoplayer.a.b> it = this.f6289a.iterator();
        while (it.hasNext()) {
            it.next().a(i6, z3, i);
        }
    }

    @Override // com.anythink.basead.exoplayer.w.c
    public final void onPositionDiscontinuity(int i) {
        this.f6292d.f();
        b.a i6 = i();
        Iterator<com.anythink.basead.exoplayer.a.b> it = this.f6289a.iterator();
        while (it.hasNext()) {
            it.next().b(i6, i);
        }
    }

    @Override // com.anythink.basead.exoplayer.w.c
    public final void onRepeatModeChanged(int i) {
        b.a i6 = i();
        Iterator<com.anythink.basead.exoplayer.a.b> it = this.f6289a.iterator();
        while (it.hasNext()) {
            it.next().c(i6, i);
        }
    }

    @Override // com.anythink.basead.exoplayer.w.c
    public final void onSeekProcessed() {
        if (this.f6292d.e()) {
            this.f6292d.h();
            b.a i = i();
            Iterator<com.anythink.basead.exoplayer.a.b> it = this.f6289a.iterator();
            while (it.hasNext()) {
                it.next().b(i);
            }
        }
    }

    @Override // com.anythink.basead.exoplayer.w.c
    public final void onShuffleModeEnabledChanged(boolean z3) {
        b.a i = i();
        Iterator<com.anythink.basead.exoplayer.a.b> it = this.f6289a.iterator();
        while (it.hasNext()) {
            it.next().a(i, z3);
        }
    }

    @Override // com.anythink.basead.exoplayer.w.c
    public final void onTimelineChanged(ae aeVar, Object obj, int i) {
        this.f6292d.a(aeVar);
        b.a i6 = i();
        Iterator<com.anythink.basead.exoplayer.a.b> it = this.f6289a.iterator();
        while (it.hasNext()) {
            it.next().a(i6, i);
        }
    }

    @Override // com.anythink.basead.exoplayer.w.c
    public final void onTracksChanged(af afVar, com.anythink.basead.exoplayer.i.g gVar) {
        b.a i = i();
        Iterator<com.anythink.basead.exoplayer.a.b> it = this.f6289a.iterator();
        while (it.hasNext()) {
            it.next().a(i, gVar);
        }
    }

    private void a(w wVar) {
        com.anythink.basead.exoplayer.k.a.b(this.f6293e == null);
        this.f6293e = (w) com.anythink.basead.exoplayer.k.a.a(wVar);
    }

    public final void b() {
        Iterator it = new ArrayList(this.f6292d.f6294a).iterator();
        while (it.hasNext()) {
            c cVar = (c) it.next();
            b(cVar.f6300a, cVar.f6301b);
        }
    }

    public final void a() {
        if (this.f6292d.e()) {
            return;
        }
        b.a i = i();
        this.f6292d.g();
        Iterator<com.anythink.basead.exoplayer.a.b> it = this.f6289a.iterator();
        while (it.hasNext()) {
            it.next().a(i);
        }
    }

    @Override // com.anythink.basead.exoplayer.h.t
    public final void c(int i, s.a aVar, t.b bVar, t.c cVar) {
        d(i, aVar);
        Iterator<com.anythink.basead.exoplayer.a.b> it = this.f6289a.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    @Override // com.anythink.basead.exoplayer.d.c
    public final void d() {
        b.a j6 = j();
        Iterator<com.anythink.basead.exoplayer.a.b> it = this.f6289a.iterator();
        while (it.hasNext()) {
            it.next().f(j6);
        }
    }

    @Override // com.anythink.basead.exoplayer.b.g
    public final void b(String str, long j6, long j9) {
        b.a j10 = j();
        Iterator<com.anythink.basead.exoplayer.a.b> it = this.f6289a.iterator();
        while (it.hasNext()) {
            it.next().a(j10, 1, str);
        }
    }

    @Override // com.anythink.basead.exoplayer.h.t
    public final void c(int i, s.a aVar) {
        this.f6292d.c(i, aVar);
        b.a d2 = d(i, aVar);
        Iterator<com.anythink.basead.exoplayer.a.b> it = this.f6289a.iterator();
        while (it.hasNext()) {
            it.next().e(d2);
        }
    }

    private b.a d(int i, s.a aVar) {
        com.anythink.basead.exoplayer.k.a.a(this.f6293e);
        long a9 = this.f6290b.a();
        ae F8 = this.f6293e.F();
        long j6 = 0;
        if (i == this.f6293e.p()) {
            if (aVar != null && aVar.a()) {
                if (this.f6293e.z() == aVar.f7768b && this.f6293e.A() == aVar.f7769c) {
                    j6 = this.f6293e.t();
                }
            } else {
                j6 = this.f6293e.B();
            }
        } else if (i < F8.b() && (aVar == null || !aVar.a())) {
            j6 = com.anythink.basead.exoplayer.b.a(F8.a(i, this.f6291c, false).f6355h);
        }
        return new b.a(a9, F8, i, aVar, j6, this.f6293e.t(), this.f6293e.u() - this.f6293e.B());
    }

    private void a(int i, int i6) {
        b.a i9 = i();
        Iterator<com.anythink.basead.exoplayer.a.b> it = this.f6289a.iterator();
        while (it.hasNext()) {
            it.next().a(i9, i, i6);
        }
    }

    @Override // com.anythink.basead.exoplayer.b.g
    public final void b(m mVar) {
        b.a j6 = j();
        Iterator<com.anythink.basead.exoplayer.a.b> it = this.f6289a.iterator();
        while (it.hasNext()) {
            it.next().a(j6, 1, mVar);
        }
    }

    @Override // com.anythink.basead.exoplayer.j.d.a
    public final void c() {
        a(this.f6292d.d());
        Iterator<com.anythink.basead.exoplayer.a.b> it = this.f6289a.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    private void a(NetworkInfo networkInfo) {
        b.a i = i();
        Iterator<com.anythink.basead.exoplayer.a.b> it = this.f6289a.iterator();
        while (it.hasNext()) {
            it.next().a(i, networkInfo);
        }
    }

    @Override // com.anythink.basead.exoplayer.l.h
    public final void b(com.anythink.basead.exoplayer.c.d dVar) {
        b.a h9 = h();
        Iterator<com.anythink.basead.exoplayer.a.b> it = this.f6289a.iterator();
        while (it.hasNext()) {
            it.next().e(h9, 2);
        }
    }

    @Override // com.anythink.basead.exoplayer.g.f
    public final void a(com.anythink.basead.exoplayer.g.a aVar) {
        b.a i = i();
        Iterator<com.anythink.basead.exoplayer.a.b> it = this.f6289a.iterator();
        while (it.hasNext()) {
            it.next().a(i, aVar);
        }
    }

    @Override // com.anythink.basead.exoplayer.h.t
    public final void b(int i, s.a aVar) {
        this.f6292d.b(i, aVar);
        b.a d2 = d(i, aVar);
        Iterator<com.anythink.basead.exoplayer.a.b> it = this.f6289a.iterator();
        while (it.hasNext()) {
            it.next().d(d2);
        }
    }

    @Override // com.anythink.basead.exoplayer.b.g
    public final void a(int i) {
        b.a j6 = j();
        Iterator<com.anythink.basead.exoplayer.a.b> it = this.f6289a.iterator();
        while (it.hasNext()) {
            it.next().f(j6, i);
        }
    }

    @Override // com.anythink.basead.exoplayer.h.t
    public final void b(int i, s.a aVar, t.b bVar, t.c cVar) {
        d(i, aVar);
        Iterator<com.anythink.basead.exoplayer.a.b> it = this.f6289a.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    @Override // com.anythink.basead.exoplayer.b.g
    public final void a(int i, long j6, long j9) {
        b.a j10 = j();
        Iterator<com.anythink.basead.exoplayer.a.b> it = this.f6289a.iterator();
        while (it.hasNext()) {
            it.next().a(j10, i, j6, j9);
        }
    }

    @Override // com.anythink.basead.exoplayer.h.t
    public final void b(int i, s.a aVar, t.c cVar) {
        b.a d2 = d(i, aVar);
        Iterator<com.anythink.basead.exoplayer.a.b> it = this.f6289a.iterator();
        while (it.hasNext()) {
            it.next().a(d2, cVar);
        }
    }

    @Override // com.anythink.basead.exoplayer.l.h
    public final void a(com.anythink.basead.exoplayer.c.d dVar) {
        b.a i = i();
        Iterator<com.anythink.basead.exoplayer.a.b> it = this.f6289a.iterator();
        while (it.hasNext()) {
            it.next().d(i, 2);
        }
    }

    @Override // com.anythink.basead.exoplayer.l.h
    public final void a(String str, long j6, long j9) {
        b.a j10 = j();
        Iterator<com.anythink.basead.exoplayer.a.b> it = this.f6289a.iterator();
        while (it.hasNext()) {
            it.next().a(j10, 2, str);
        }
    }

    @Override // com.anythink.basead.exoplayer.l.h
    public final void a(m mVar) {
        b.a j6 = j();
        Iterator<com.anythink.basead.exoplayer.a.b> it = this.f6289a.iterator();
        while (it.hasNext()) {
            it.next().a(j6, 2, mVar);
        }
    }

    @Override // com.anythink.basead.exoplayer.l.h
    public final void a(int i, long j6) {
        b.a h9 = h();
        Iterator<com.anythink.basead.exoplayer.a.b> it = this.f6289a.iterator();
        while (it.hasNext()) {
            it.next().g(h9, i);
        }
    }

    @Override // com.anythink.basead.exoplayer.l.h
    public final void a(int i, int i6, int i9, float f3) {
        b.a j6 = j();
        Iterator<com.anythink.basead.exoplayer.a.b> it = this.f6289a.iterator();
        while (it.hasNext()) {
            it.next().b(j6, i, i6);
        }
    }

    @Override // com.anythink.basead.exoplayer.l.h
    public final void a(Surface surface) {
        b.a j6 = j();
        Iterator<com.anythink.basead.exoplayer.a.b> it = this.f6289a.iterator();
        while (it.hasNext()) {
            it.next().a(j6, surface);
        }
    }

    @Override // com.anythink.basead.exoplayer.h.t
    public final void a(int i, s.a aVar) {
        this.f6292d.a(i, aVar);
        b.a d2 = d(i, aVar);
        Iterator<com.anythink.basead.exoplayer.a.b> it = this.f6289a.iterator();
        while (it.hasNext()) {
            it.next().c(d2);
        }
    }

    @Override // com.anythink.basead.exoplayer.h.t
    public final void a(int i, s.a aVar, t.b bVar, t.c cVar) {
        d(i, aVar);
        Iterator<com.anythink.basead.exoplayer.a.b> it = this.f6289a.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    @Override // com.anythink.basead.exoplayer.h.t
    public final void a(int i, s.a aVar, t.b bVar, t.c cVar, IOException iOException, boolean z3) {
        b.a d2 = d(i, aVar);
        Iterator<com.anythink.basead.exoplayer.a.b> it = this.f6289a.iterator();
        while (it.hasNext()) {
            it.next().a(d2, iOException);
        }
    }

    @Override // com.anythink.basead.exoplayer.h.t
    public final void a(int i, s.a aVar, t.c cVar) {
        b.a d2 = d(i, aVar);
        Iterator<com.anythink.basead.exoplayer.a.b> it = this.f6289a.iterator();
        while (it.hasNext()) {
            it.next().b(d2, cVar);
        }
    }

    @Override // com.anythink.basead.exoplayer.d.c
    public final void a(Exception exc) {
        b.a j6 = j();
        Iterator<com.anythink.basead.exoplayer.a.b> it = this.f6289a.iterator();
        while (it.hasNext()) {
            it.next().a(j6, exc);
        }
    }

    private b.a a(c cVar) {
        if (cVar == null) {
            int p9 = ((w) com.anythink.basead.exoplayer.k.a.a(this.f6293e)).p();
            return d(p9, this.f6292d.a(p9));
        }
        return d(cVar.f6300a, cVar.f6301b);
    }
}
