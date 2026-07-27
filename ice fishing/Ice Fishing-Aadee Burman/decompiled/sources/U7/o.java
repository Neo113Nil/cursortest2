package U7;

import S7.AbstractC0383a;
import S7.AbstractC0406y;
import S7.C0398p;
import S7.Z;
import S7.f0;
import java.util.concurrent.CancellationException;
import z7.InterfaceC5267d;
import z7.InterfaceC5272i;

/* loaded from: classes2.dex */
public final class o extends AbstractC0383a implements p, g {

    /* renamed from: w, reason: collision with root package name */
    public final c f3264w;

    public o(InterfaceC5272i interfaceC5272i, c cVar) {
        super(interfaceC5272i, true);
        this.f3264w = cVar;
    }

    @Override // S7.AbstractC0383a
    public final void U(Throwable th, boolean z3) {
        if (this.f3264w.i(th, false) || z3) {
            return;
        }
        AbstractC0406y.l(th, this.f2942v);
    }

    @Override // S7.AbstractC0383a
    public final void V(Object obj) {
        this.f3264w.i(null, false);
    }

    @Override // S7.h0, S7.Y
    public final void a(CancellationException cancellationException) {
        Object C8 = C();
        if (C8 instanceof C0398p) {
            return;
        }
        if ((C8 instanceof f0) && ((f0) C8).c()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new Z(r(), null, this);
        }
        p(cancellationException);
    }

    @Override // U7.q
    public final Object b(InterfaceC5267d interfaceC5267d) {
        return this.f3264w.b(interfaceC5267d);
    }

    @Override // U7.r
    public final Object d(Object obj, InterfaceC5267d interfaceC5267d) {
        return this.f3264w.d(obj, interfaceC5267d);
    }

    @Override // U7.r
    public final Object e(Object obj) {
        return this.f3264w.e(obj);
    }

    @Override // S7.h0
    public final void p(CancellationException cancellationException) {
        this.f3264w.i(cancellationException, true);
        o(cancellationException);
    }
}
