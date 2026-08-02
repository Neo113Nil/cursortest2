package U7;

import S7.AbstractC0387a;
import S7.AbstractC0410y;
import S7.C0402p;
import S7.Z;
import S7.f0;
import java.util.concurrent.CancellationException;
import z7.InterfaceC5240d;
import z7.InterfaceC5245i;

/* loaded from: classes2.dex */
public final class o extends AbstractC0387a implements p, g {

    /* renamed from: w, reason: collision with root package name */
    public final c f3387w;

    public o(InterfaceC5245i interfaceC5245i, c cVar) {
        super(interfaceC5245i, true);
        this.f3387w = cVar;
    }

    @Override // S7.AbstractC0387a
    public final void U(Throwable th, boolean z6) {
        if (this.f3387w.i(th, false) || z6) {
            return;
        }
        AbstractC0410y.l(th, this.f3025v);
    }

    @Override // S7.AbstractC0387a
    public final void V(Object obj) {
        this.f3387w.i(null, false);
    }

    @Override // S7.h0, S7.Y
    public final void a(CancellationException cancellationException) {
        Object C8 = C();
        if (C8 instanceof C0402p) {
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
    public final Object b(InterfaceC5240d interfaceC5240d) {
        return this.f3387w.b(interfaceC5240d);
    }

    @Override // U7.r
    public final Object d(Object obj, InterfaceC5240d interfaceC5240d) {
        return this.f3387w.d(obj, interfaceC5240d);
    }

    @Override // U7.r
    public final Object e(Object obj) {
        return this.f3387w.e(obj);
    }

    @Override // S7.h0
    public final void p(CancellationException cancellationException) {
        this.f3387w.i(cancellationException, true);
        o(cancellationException);
    }
}
