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
    private final com.anythink.basead.exoplayer.k.c f7076b;

    /* renamed from: e, reason: collision with root package name */
    private w f7079e;

    /* renamed from: a, reason: collision with root package name */
    private final CopyOnWriteArraySet<com.anythink.basead.exoplayer.a.b> f7075a = new CopyOnWriteArraySet<>();

    /* renamed from: d, reason: collision with root package name */
    private final b f7078d = new b();

    /* renamed from: c, reason: collision with root package name */
    private final ae.b f7077c = new ae.b();

    /* renamed from: com.anythink.basead.exoplayer.a.a$a, reason: collision with other inner class name */
    public static class C0014a {
        public static a a(w wVar, com.anythink.basead.exoplayer.k.c cVar) {
            return new a(wVar, cVar);
        }
    }

    public static final class b {

        /* renamed from: c, reason: collision with root package name */
        private c f7082c;

        /* renamed from: d, reason: collision with root package name */
        private c f7083d;

        /* renamed from: f, reason: collision with root package name */
        private boolean f7085f;

        /* renamed from: a, reason: collision with root package name */
        private final ArrayList<c> f7080a = new ArrayList<>();

        /* renamed from: b, reason: collision with root package name */
        private final ae.a f7081b = new ae.a();

        /* renamed from: e, reason: collision with root package name */
        private ae f7084e = ae.f7127a;

        private void i() {
            if (this.f7080a.isEmpty()) {
                return;
            }
            this.f7082c = this.f7080a.get(0);
        }

        public final c b() {
            return this.f7082c;
        }

        public final c c() {
            return this.f7083d;
        }

        public final c d() {
            if (this.f7080a.isEmpty()) {
                return null;
            }
            return this.f7080a.get(r0.size() - 1);
        }

        public final boolean e() {
            return this.f7085f;
        }

        public final void f() {
            i();
        }

        public final void g() {
            this.f7085f = true;
        }

        public final void h() {
            this.f7085f = false;
            i();
        }

        public final c a() {
            if (this.f7080a.isEmpty() || this.f7084e.a() || this.f7085f) {
                return null;
            }
            return this.f7080a.get(0);
        }

        public final void b(int i, s.a aVar) {
            c cVar = new c(i, aVar);
            this.f7080a.remove(cVar);
            if (cVar.equals(this.f7083d)) {
                this.f7083d = this.f7080a.isEmpty() ? null : this.f7080a.get(0);
            }
        }

        public final void c(int i, s.a aVar) {
            this.f7083d = new c(i, aVar);
        }

        public final s.a a(int i) {
            ae aeVar = this.f7084e;
            if (aeVar == null) {
                return null;
            }
            int c9 = aeVar.c();
            s.a aVar = null;
            for (int i4 = 0; i4 < this.f7080a.size(); i4++) {
                c cVar = this.f7080a.get(i4);
                int i6 = cVar.f7087b.f8553a;
                if (i6 < c9 && this.f7084e.a(i6, this.f7081b, false).f7130c == i) {
                    if (aVar != null) {
                        return null;
                    }
                    aVar = cVar.f7087b;
                }
            }
            return aVar;
        }

        public final void a(ae aeVar) {
            for (int i = 0; i < this.f7080a.size(); i++) {
                ArrayList<c> arrayList = this.f7080a;
                arrayList.set(i, a(arrayList.get(i), aeVar));
            }
            c cVar = this.f7083d;
            if (cVar != null) {
                this.f7083d = a(cVar, aeVar);
            }
            this.f7084e = aeVar;
            i();
        }

        public final void a(int i, s.a aVar) {
            this.f7080a.add(new c(i, aVar));
            if (this.f7080a.size() != 1 || this.f7084e.a()) {
                return;
            }
            i();
        }

        private c a(c cVar, ae aeVar) {
            int a9;
            return (aeVar.a() || this.f7084e.a() || (a9 = aeVar.a(this.f7084e.a(cVar.f7087b.f8553a, this.f7081b, true).f7129b)) == -1) ? cVar : new c(aeVar.a(a9, this.f7081b, false).f7130c, cVar.f7087b.a(a9));
        }
    }

    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final int f7086a;

        /* renamed from: b, reason: collision with root package name */
        public final s.a f7087b;

        public c(int i, s.a aVar) {
            this.f7086a = i;
            this.f7087b = aVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && c.class == obj.getClass()) {
                c cVar = (c) obj;
                if (this.f7086a == cVar.f7086a && this.f7087b.equals(cVar.f7087b)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return this.f7087b.hashCode() + (this.f7086a * 31);
        }
    }

    public a(w wVar, com.anythink.basead.exoplayer.k.c cVar) {
        this.f7079e = wVar;
        this.f7076b = (com.anythink.basead.exoplayer.k.c) com.anythink.basead.exoplayer.k.a.a(cVar);
    }

    private Set<com.anythink.basead.exoplayer.a.b> g() {
        return Collections.unmodifiableSet(this.f7075a);
    }

    private b.a h() {
        return a(this.f7078d.b());
    }

    private b.a i() {
        return a(this.f7078d.a());
    }

    private b.a j() {
        return a(this.f7078d.c());
    }

    private b.a k() {
        return a(this.f7078d.d());
    }

    public final void a(com.anythink.basead.exoplayer.a.b bVar) {
        this.f7075a.add(bVar);
    }

    public final void b(com.anythink.basead.exoplayer.a.b bVar) {
        this.f7075a.remove(bVar);
    }

    @Override // com.anythink.basead.exoplayer.b.g
    public final void c(com.anythink.basead.exoplayer.c.d dVar) {
        b.a i = i();
        Iterator<com.anythink.basead.exoplayer.a.b> it = this.f7075a.iterator();
        while (it.hasNext()) {
            it.next().d(i, 1);
        }
    }

    @Override // com.anythink.basead.exoplayer.b.g
    public final void d(com.anythink.basead.exoplayer.c.d dVar) {
        b.a h3 = h();
        Iterator<com.anythink.basead.exoplayer.a.b> it = this.f7075a.iterator();
        while (it.hasNext()) {
            it.next().e(h3, 1);
        }
    }

    @Override // com.anythink.basead.exoplayer.d.c
    public final void e() {
        b.a j6 = j();
        Iterator<com.anythink.basead.exoplayer.a.b> it = this.f7075a.iterator();
        while (it.hasNext()) {
            it.next().g(j6);
        }
    }

    @Override // com.anythink.basead.exoplayer.d.c
    public final void f() {
        b.a j6 = j();
        Iterator<com.anythink.basead.exoplayer.a.b> it = this.f7075a.iterator();
        while (it.hasNext()) {
            it.next().h(j6);
        }
    }

    @Override // com.anythink.basead.exoplayer.w.c
    public final void onLoadingChanged(boolean z6) {
        b.a i = i();
        Iterator<com.anythink.basead.exoplayer.a.b> it = this.f7075a.iterator();
        while (it.hasNext()) {
            it.next().b(i, z6);
        }
    }

    @Override // com.anythink.basead.exoplayer.w.c
    public final void onPlaybackParametersChanged(v vVar) {
        b.a i = i();
        Iterator<com.anythink.basead.exoplayer.a.b> it = this.f7075a.iterator();
        while (it.hasNext()) {
            it.next().a(i, vVar);
        }
    }

    @Override // com.anythink.basead.exoplayer.w.c
    public final void onPlayerError(com.anythink.basead.exoplayer.g gVar) {
        b.a i = i();
        Iterator<com.anythink.basead.exoplayer.a.b> it = this.f7075a.iterator();
        while (it.hasNext()) {
            it.next().a(i, gVar);
        }
    }

    @Override // com.anythink.basead.exoplayer.w.c
    public final void onPlayerStateChanged(boolean z6, int i) {
        b.a i4 = i();
        Iterator<com.anythink.basead.exoplayer.a.b> it = this.f7075a.iterator();
        while (it.hasNext()) {
            it.next().a(i4, z6, i);
        }
    }

    @Override // com.anythink.basead.exoplayer.w.c
    public final void onPositionDiscontinuity(int i) {
        this.f7078d.f();
        b.a i4 = i();
        Iterator<com.anythink.basead.exoplayer.a.b> it = this.f7075a.iterator();
        while (it.hasNext()) {
            it.next().b(i4, i);
        }
    }

    @Override // com.anythink.basead.exoplayer.w.c
    public final void onRepeatModeChanged(int i) {
        b.a i4 = i();
        Iterator<com.anythink.basead.exoplayer.a.b> it = this.f7075a.iterator();
        while (it.hasNext()) {
            it.next().c(i4, i);
        }
    }

    @Override // com.anythink.basead.exoplayer.w.c
    public final void onSeekProcessed() {
        if (this.f7078d.e()) {
            this.f7078d.h();
            b.a i = i();
            Iterator<com.anythink.basead.exoplayer.a.b> it = this.f7075a.iterator();
            while (it.hasNext()) {
                it.next().b(i);
            }
        }
    }

    @Override // com.anythink.basead.exoplayer.w.c
    public final void onShuffleModeEnabledChanged(boolean z6) {
        b.a i = i();
        Iterator<com.anythink.basead.exoplayer.a.b> it = this.f7075a.iterator();
        while (it.hasNext()) {
            it.next().a(i, z6);
        }
    }

    @Override // com.anythink.basead.exoplayer.w.c
    public final void onTimelineChanged(ae aeVar, Object obj, int i) {
        this.f7078d.a(aeVar);
        b.a i4 = i();
        Iterator<com.anythink.basead.exoplayer.a.b> it = this.f7075a.iterator();
        while (it.hasNext()) {
            it.next().a(i4, i);
        }
    }

    @Override // com.anythink.basead.exoplayer.w.c
    public final void onTracksChanged(af afVar, com.anythink.basead.exoplayer.i.g gVar) {
        b.a i = i();
        Iterator<com.anythink.basead.exoplayer.a.b> it = this.f7075a.iterator();
        while (it.hasNext()) {
            it.next().a(i, gVar);
        }
    }

    private void a(w wVar) {
        com.anythink.basead.exoplayer.k.a.b(this.f7079e == null);
        this.f7079e = (w) com.anythink.basead.exoplayer.k.a.a(wVar);
    }

    public final void b() {
        Iterator it = new ArrayList(this.f7078d.f7080a).iterator();
        while (it.hasNext()) {
            c cVar = (c) it.next();
            b(cVar.f7086a, cVar.f7087b);
        }
    }

    public final void a() {
        if (this.f7078d.e()) {
            return;
        }
        b.a i = i();
        this.f7078d.g();
        Iterator<com.anythink.basead.exoplayer.a.b> it = this.f7075a.iterator();
        while (it.hasNext()) {
            it.next().a(i);
        }
    }

    @Override // com.anythink.basead.exoplayer.h.t
    public final void c(int i, s.a aVar, t.b bVar, t.c cVar) {
        d(i, aVar);
        Iterator<com.anythink.basead.exoplayer.a.b> it = this.f7075a.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    @Override // com.anythink.basead.exoplayer.d.c
    public final void d() {
        b.a j6 = j();
        Iterator<com.anythink.basead.exoplayer.a.b> it = this.f7075a.iterator();
        while (it.hasNext()) {
            it.next().f(j6);
        }
    }

    @Override // com.anythink.basead.exoplayer.b.g
    public final void b(String str, long j6, long j9) {
        b.a j10 = j();
        Iterator<com.anythink.basead.exoplayer.a.b> it = this.f7075a.iterator();
        while (it.hasNext()) {
            it.next().a(j10, 1, str);
        }
    }

    @Override // com.anythink.basead.exoplayer.h.t
    public final void c(int i, s.a aVar) {
        this.f7078d.c(i, aVar);
        b.a d9 = d(i, aVar);
        Iterator<com.anythink.basead.exoplayer.a.b> it = this.f7075a.iterator();
        while (it.hasNext()) {
            it.next().e(d9);
        }
    }

    private b.a d(int i, s.a aVar) {
        com.anythink.basead.exoplayer.k.a.a(this.f7079e);
        long a9 = this.f7076b.a();
        ae F8 = this.f7079e.F();
        long j6 = 0;
        if (i == this.f7079e.p()) {
            if (aVar != null && aVar.a()) {
                if (this.f7079e.z() == aVar.f8554b && this.f7079e.A() == aVar.f8555c) {
                    j6 = this.f7079e.t();
                }
            } else {
                j6 = this.f7079e.B();
            }
        } else if (i < F8.b() && (aVar == null || !aVar.a())) {
            j6 = com.anythink.basead.exoplayer.b.a(F8.a(i, this.f7077c, false).f7141h);
        }
        return new b.a(a9, F8, i, aVar, j6, this.f7079e.t(), this.f7079e.u() - this.f7079e.B());
    }

    private void a(int i, int i4) {
        b.a i6 = i();
        Iterator<com.anythink.basead.exoplayer.a.b> it = this.f7075a.iterator();
        while (it.hasNext()) {
            it.next().a(i6, i, i4);
        }
    }

    @Override // com.anythink.basead.exoplayer.b.g
    public final void b(m mVar) {
        b.a j6 = j();
        Iterator<com.anythink.basead.exoplayer.a.b> it = this.f7075a.iterator();
        while (it.hasNext()) {
            it.next().a(j6, 1, mVar);
        }
    }

    @Override // com.anythink.basead.exoplayer.j.d.a
    public final void c() {
        a(this.f7078d.d());
        Iterator<com.anythink.basead.exoplayer.a.b> it = this.f7075a.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    private void a(NetworkInfo networkInfo) {
        b.a i = i();
        Iterator<com.anythink.basead.exoplayer.a.b> it = this.f7075a.iterator();
        while (it.hasNext()) {
            it.next().a(i, networkInfo);
        }
    }

    @Override // com.anythink.basead.exoplayer.l.h
    public final void b(com.anythink.basead.exoplayer.c.d dVar) {
        b.a h3 = h();
        Iterator<com.anythink.basead.exoplayer.a.b> it = this.f7075a.iterator();
        while (it.hasNext()) {
            it.next().e(h3, 2);
        }
    }

    @Override // com.anythink.basead.exoplayer.g.f
    public final void a(com.anythink.basead.exoplayer.g.a aVar) {
        b.a i = i();
        Iterator<com.anythink.basead.exoplayer.a.b> it = this.f7075a.iterator();
        while (it.hasNext()) {
            it.next().a(i, aVar);
        }
    }

    @Override // com.anythink.basead.exoplayer.h.t
    public final void b(int i, s.a aVar) {
        this.f7078d.b(i, aVar);
        b.a d9 = d(i, aVar);
        Iterator<com.anythink.basead.exoplayer.a.b> it = this.f7075a.iterator();
        while (it.hasNext()) {
            it.next().d(d9);
        }
    }

    @Override // com.anythink.basead.exoplayer.b.g
    public final void a(int i) {
        b.a j6 = j();
        Iterator<com.anythink.basead.exoplayer.a.b> it = this.f7075a.iterator();
        while (it.hasNext()) {
            it.next().f(j6, i);
        }
    }

    @Override // com.anythink.basead.exoplayer.h.t
    public final void b(int i, s.a aVar, t.b bVar, t.c cVar) {
        d(i, aVar);
        Iterator<com.anythink.basead.exoplayer.a.b> it = this.f7075a.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    @Override // com.anythink.basead.exoplayer.b.g
    public final void a(int i, long j6, long j9) {
        b.a j10 = j();
        Iterator<com.anythink.basead.exoplayer.a.b> it = this.f7075a.iterator();
        while (it.hasNext()) {
            it.next().a(j10, i, j6, j9);
        }
    }

    @Override // com.anythink.basead.exoplayer.h.t
    public final void b(int i, s.a aVar, t.c cVar) {
        b.a d9 = d(i, aVar);
        Iterator<com.anythink.basead.exoplayer.a.b> it = this.f7075a.iterator();
        while (it.hasNext()) {
            it.next().a(d9, cVar);
        }
    }

    @Override // com.anythink.basead.exoplayer.l.h
    public final void a(com.anythink.basead.exoplayer.c.d dVar) {
        b.a i = i();
        Iterator<com.anythink.basead.exoplayer.a.b> it = this.f7075a.iterator();
        while (it.hasNext()) {
            it.next().d(i, 2);
        }
    }

    @Override // com.anythink.basead.exoplayer.l.h
    public final void a(String str, long j6, long j9) {
        b.a j10 = j();
        Iterator<com.anythink.basead.exoplayer.a.b> it = this.f7075a.iterator();
        while (it.hasNext()) {
            it.next().a(j10, 2, str);
        }
    }

    @Override // com.anythink.basead.exoplayer.l.h
    public final void a(m mVar) {
        b.a j6 = j();
        Iterator<com.anythink.basead.exoplayer.a.b> it = this.f7075a.iterator();
        while (it.hasNext()) {
            it.next().a(j6, 2, mVar);
        }
    }

    @Override // com.anythink.basead.exoplayer.l.h
    public final void a(int i, long j6) {
        b.a h3 = h();
        Iterator<com.anythink.basead.exoplayer.a.b> it = this.f7075a.iterator();
        while (it.hasNext()) {
            it.next().g(h3, i);
        }
    }

    @Override // com.anythink.basead.exoplayer.l.h
    public final void a(int i, int i4, int i6, float f2) {
        b.a j6 = j();
        Iterator<com.anythink.basead.exoplayer.a.b> it = this.f7075a.iterator();
        while (it.hasNext()) {
            it.next().b(j6, i, i4);
        }
    }

    @Override // com.anythink.basead.exoplayer.l.h
    public final void a(Surface surface) {
        b.a j6 = j();
        Iterator<com.anythink.basead.exoplayer.a.b> it = this.f7075a.iterator();
        while (it.hasNext()) {
            it.next().a(j6, surface);
        }
    }

    @Override // com.anythink.basead.exoplayer.h.t
    public final void a(int i, s.a aVar) {
        this.f7078d.a(i, aVar);
        b.a d9 = d(i, aVar);
        Iterator<com.anythink.basead.exoplayer.a.b> it = this.f7075a.iterator();
        while (it.hasNext()) {
            it.next().c(d9);
        }
    }

    @Override // com.anythink.basead.exoplayer.h.t
    public final void a(int i, s.a aVar, t.b bVar, t.c cVar) {
        d(i, aVar);
        Iterator<com.anythink.basead.exoplayer.a.b> it = this.f7075a.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    @Override // com.anythink.basead.exoplayer.h.t
    public final void a(int i, s.a aVar, t.b bVar, t.c cVar, IOException iOException, boolean z6) {
        b.a d9 = d(i, aVar);
        Iterator<com.anythink.basead.exoplayer.a.b> it = this.f7075a.iterator();
        while (it.hasNext()) {
            it.next().a(d9, iOException);
        }
    }

    @Override // com.anythink.basead.exoplayer.h.t
    public final void a(int i, s.a aVar, t.c cVar) {
        b.a d9 = d(i, aVar);
        Iterator<com.anythink.basead.exoplayer.a.b> it = this.f7075a.iterator();
        while (it.hasNext()) {
            it.next().b(d9, cVar);
        }
    }

    @Override // com.anythink.basead.exoplayer.d.c
    public final void a(Exception exc) {
        b.a j6 = j();
        Iterator<com.anythink.basead.exoplayer.a.b> it = this.f7075a.iterator();
        while (it.hasNext()) {
            it.next().a(j6, exc);
        }
    }

    private b.a a(c cVar) {
        if (cVar == null) {
            int p9 = ((w) com.anythink.basead.exoplayer.k.a.a(this.f7079e)).p();
            return d(p9, this.f7078d.a(p9));
        }
        return d(cVar.f7086a, cVar.f7087b);
    }
}
