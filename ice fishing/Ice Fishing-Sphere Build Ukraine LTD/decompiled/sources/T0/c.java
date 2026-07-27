package T0;

import D0.l;
import L0.C0048f;
import L0.InterfaceC0047e;
import L0.m0;
import Q0.v;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import t0.C0252g;

/* loaded from: classes.dex */
public final class c implements InterfaceC0047e, m0 {

    /* renamed from: e, reason: collision with root package name */
    public final C0048f f994e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ d f995f;

    public c(d dVar, C0048f c0048f) {
        this.f995f = dVar;
        this.f994e = c0048f;
    }

    @Override // L0.m0
    public final void a(v vVar, int i2) {
        this.f994e.a(vVar, i2);
    }

    @Override // v0.d
    public final void c(Object obj) {
        this.f994e.c(obj);
    }

    @Override // L0.InterfaceC0047e
    public final A.j d(Object obj, l lVar) {
        d dVar = this.f995f;
        b bVar = new b(1, dVar, this);
        A.j d2 = this.f994e.d((C0252g) obj, bVar);
        if (d2 != null) {
            d.f996g.set(dVar, null);
        }
        return d2;
    }

    @Override // L0.InterfaceC0047e
    public final void e(Object obj, l lVar) {
        C0252g c0252g = C0252g.f2994a;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d.f996g;
        d dVar = this.f995f;
        atomicReferenceFieldUpdater.set(dVar, null);
        this.f994e.e(c0252g, new b(0, dVar, this));
    }

    @Override // v0.d
    public final v0.i j() {
        return this.f994e.f657i;
    }

    @Override // L0.InterfaceC0047e
    public final void k(Object obj) {
        this.f994e.k(obj);
    }
}
