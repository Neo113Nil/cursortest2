package I1;

import A1.C0005f;
import A1.InterfaceC0004e;
import A1.n0;
import F1.u;
import h1.C0239i;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import t1.l;

/* loaded from: classes.dex */
public final class c implements InterfaceC0004e, n0 {

    /* renamed from: a, reason: collision with root package name */
    public final C0005f f727a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f728b;

    public c(d dVar, C0005f c0005f) {
        this.f728b = dVar;
        this.f727a = c0005f;
    }

    @Override // A1.n0
    public final void a(u uVar, int i2) {
        this.f727a.a(uVar, i2);
    }

    @Override // A1.InterfaceC0004e
    public final C.j d(Object obj, l lVar) {
        d dVar = this.f728b;
        b bVar = new b(1, dVar, this);
        C.j d2 = this.f727a.d((C0239i) obj, bVar);
        if (d2 != null) {
            d.f729g.set(dVar, null);
        }
        return d2;
    }

    @Override // A1.InterfaceC0004e
    public final void e(Object obj, l lVar) {
        C0239i c0239i = C0239i.f3393a;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d.f729g;
        d dVar = this.f728b;
        atomicReferenceFieldUpdater.set(dVar, null);
        this.f727a.e(c0239i, new b(0, dVar, this));
    }

    @Override // l1.d
    public final l1.i getContext() {
        return this.f727a.f48e;
    }

    @Override // l1.d
    public final void i(Object obj) {
        this.f727a.i(obj);
    }

    @Override // A1.InterfaceC0004e
    public final void n(Object obj) {
        this.f727a.n(obj);
    }
}
