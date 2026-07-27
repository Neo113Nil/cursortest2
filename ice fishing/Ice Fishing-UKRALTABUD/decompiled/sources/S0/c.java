package S0;

import D0.l;
import K0.C0030f;
import K0.InterfaceC0029e;
import K0.m0;
import P0.v;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class c implements InterfaceC0029e, m0 {

    /* renamed from: f, reason: collision with root package name */
    public final C0030f f986f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ d f987g;

    public c(d dVar, C0030f c0030f) {
        this.f987g = dVar;
        this.f986f = c0030f;
    }

    @Override // K0.m0
    public final void a(v vVar, int i2) {
        this.f986f.a(vVar, i2);
    }

    @Override // v0.d
    public final void c(Object obj) {
        this.f986f.c(obj);
    }

    @Override // K0.InterfaceC0029e
    public final A.j d(Object obj, l lVar) {
        d dVar = this.f987g;
        b bVar = new b(1, dVar, this);
        A.j d2 = this.f986f.d((t0.g) obj, bVar);
        if (d2 != null) {
            d.f988g.set(dVar, null);
        }
        return d2;
    }

    @Override // K0.InterfaceC0029e
    public final void e(Object obj, l lVar) {
        t0.g gVar = t0.g.f2989a;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d.f988g;
        d dVar = this.f987g;
        atomicReferenceFieldUpdater.set(dVar, null);
        this.f986f.e(gVar, new b(0, dVar, this));
    }

    @Override // v0.d
    public final v0.i j() {
        return this.f986f.f509j;
    }

    @Override // K0.InterfaceC0029e
    public final void k(Object obj) {
        this.f986f.k(obj);
    }
}
