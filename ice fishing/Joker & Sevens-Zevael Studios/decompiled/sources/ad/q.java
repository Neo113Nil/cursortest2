package ad;

import java.util.concurrent.CancellationException;
import yc.a0;
import yc.c1;
import yc.i1;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class q extends yc.a implements r, i {

    /* renamed from: j, reason: collision with root package name */
    public final e f333j;

    public q(fc.i iVar, e eVar) {
        super(iVar, true);
        this.f333j = eVar;
    }

    @Override // yc.k1
    public final void B(CancellationException cancellationException) {
        this.f333j.g(cancellationException, true);
        A(cancellationException);
    }

    @Override // yc.k1, yc.b1, ad.t
    public final void a(CancellationException cancellationException) {
        Object M = M();
        if (M instanceof yc.p) {
            return;
        }
        if ((M instanceof i1) && ((i1) M).d()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new c1(D(), null, this);
        }
        B(cancellationException);
    }

    @Override // ad.u
    public final Object c(fc.d dVar, Object obj) {
        return this.f333j.c(dVar, obj);
    }

    @Override // yc.a
    public final void d0(Throwable th, boolean z10) {
        if (this.f333j.g(th, false) || z10) {
            return;
        }
        a0.m(this.f8817i, th);
    }

    @Override // yc.a
    public final void e0(Object obj) {
        i7.b.q(this.f333j);
    }

    @Override // ad.t
    public final Object h(fc.d dVar) {
        return this.f333j.h(dVar);
    }

    @Override // ad.t
    public final Object p() {
        return this.f333j.p();
    }

    @Override // ad.u
    public final Object s(Object obj) {
        return this.f333j.s(obj);
    }

    @Override // ad.t
    public final Object t(cd.p pVar) {
        e eVar = this.f333j;
        eVar.getClass();
        return e.B(eVar, pVar);
    }
}
