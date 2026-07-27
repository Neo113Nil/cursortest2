package W7;

import E7.l;
import O7.C0382g;
import O7.InterfaceC0381f;
import O7.y0;
import T7.t;
import T7.v;
import v7.InterfaceC5138i;

/* loaded from: classes2.dex */
public final class c implements InterfaceC0381f, y0 {

    /* renamed from: n, reason: collision with root package name */
    public final C0382g f3501n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ d f3502u;

    public c(d dVar, C0382g c0382g) {
        this.f3502u = dVar;
        this.f3501n = c0382g;
    }

    @Override // O7.y0
    public final void a(t tVar, int i) {
        this.f3501n.a(tVar, i);
    }

    @Override // O7.InterfaceC0381f
    public final v d(Object obj, l lVar) {
        d dVar = this.f3502u;
        b bVar = new b(dVar, this, 1);
        v d2 = this.f3501n.d((q7.v) obj, bVar);
        if (d2 != null) {
            d.f3503g.set(dVar, null);
        }
        return d2;
    }

    @Override // O7.InterfaceC0381f
    public final void f(Object obj) {
        this.f3501n.f(obj);
    }

    @Override // v7.InterfaceC5133d
    public final InterfaceC5138i getContext() {
        return this.f3501n.f2600x;
    }

    @Override // v7.InterfaceC5133d
    public final void resumeWith(Object obj) {
        this.f3501n.resumeWith(obj);
    }
}
