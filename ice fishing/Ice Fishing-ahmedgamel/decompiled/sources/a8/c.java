package a8;

import E2.C0316m;
import I7.l;
import S7.C0393g;
import S7.InterfaceC0392f;
import S7.y0;
import X7.t;
import u7.v;
import z7.InterfaceC5245i;

/* loaded from: classes2.dex */
public final class c implements InterfaceC0392f, y0 {

    /* renamed from: n, reason: collision with root package name */
    public final C0393g f4358n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ d f4359u;

    public c(d dVar, C0393g c0393g) {
        this.f4359u = dVar;
        this.f4358n = c0393g;
    }

    @Override // S7.y0
    public final void a(t tVar, int i) {
        this.f4358n.a(tVar, i);
    }

    @Override // S7.InterfaceC0392f
    public final C0316m c(Object obj, l lVar) {
        d dVar = this.f4359u;
        C0452b c0452b = new C0452b(dVar, this, 1);
        C0316m c9 = this.f4358n.c((v) obj, c0452b);
        if (c9 != null) {
            d.f4360g.set(dVar, null);
        }
        return c9;
    }

    @Override // S7.InterfaceC0392f
    public final void f(Object obj) {
        this.f4358n.f(obj);
    }

    @Override // z7.InterfaceC5240d
    public final InterfaceC5245i getContext() {
        return this.f4358n.f3047x;
    }

    @Override // z7.InterfaceC5240d
    public final void resumeWith(Object obj) {
        this.f4358n.resumeWith(obj);
    }
}
