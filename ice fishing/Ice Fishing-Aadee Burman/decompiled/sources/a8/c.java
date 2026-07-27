package a8;

import I7.l;
import S7.C0389g;
import S7.InterfaceC0388f;
import S7.y0;
import X7.t;
import u7.v;
import z7.InterfaceC5272i;

/* loaded from: classes2.dex */
public final class c implements InterfaceC0388f, y0 {

    /* renamed from: n, reason: collision with root package name */
    public final C0389g f4390n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ d f4391u;

    public c(d dVar, C0389g c0389g) {
        this.f4391u = dVar;
        this.f4390n = c0389g;
    }

    @Override // S7.y0
    public final void a(t tVar, int i) {
        this.f4390n.a(tVar, i);
    }

    @Override // S7.InterfaceC0388f
    public final D2.b c(Object obj, l lVar) {
        d dVar = this.f4391u;
        C0448b c0448b = new C0448b(dVar, this, 1);
        D2.b c9 = this.f4390n.c((v) obj, c0448b);
        if (c9 != null) {
            d.f4392g.set(dVar, null);
        }
        return c9;
    }

    @Override // S7.InterfaceC0388f
    public final void f(Object obj) {
        this.f4390n.f(obj);
    }

    @Override // z7.InterfaceC5267d
    public final InterfaceC5272i getContext() {
        return this.f4390n.f2964x;
    }

    @Override // z7.InterfaceC5267d
    public final void resumeWith(Object obj) {
        this.f4390n.resumeWith(obj);
    }
}
