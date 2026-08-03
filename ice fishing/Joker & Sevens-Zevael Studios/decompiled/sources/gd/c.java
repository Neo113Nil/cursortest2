package gd;

import ac.o;
import dd.u;
import dd.w;
import yc.b2;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class c implements yc.f, b2 {

    /* renamed from: g, reason: collision with root package name */
    public final yc.g f2571g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ d f2572h;

    public c(d dVar, yc.g gVar) {
        this.f2572h = dVar;
        this.f2571g = gVar;
    }

    @Override // yc.b2
    public final void a(u uVar, int i10) {
        this.f2571g.a(uVar, i10);
    }

    @Override // yc.f
    public final w e(Object obj, oc.c cVar) {
        d dVar = this.f2572h;
        b bVar = new b(dVar, this, 1);
        w e10 = this.f2571g.e((o) obj, bVar);
        if (e10 != null) {
            d.f2573g.set(dVar, null);
        }
        return e10;
    }

    @Override // fc.d
    public final fc.i getContext() {
        return this.f2571g.f8849k;
    }

    @Override // yc.f
    public final boolean n(Throwable th) {
        return this.f2571g.n(th);
    }

    @Override // fc.d
    public final void resumeWith(Object obj) {
        this.f2571g.resumeWith(obj);
    }

    @Override // yc.f
    public final void y(Object obj) {
        this.f2571g.y(obj);
    }
}
