package S7;

import z7.InterfaceC5240d;
import z7.InterfaceC5245i;

/* loaded from: classes2.dex */
public final class i0 extends B {

    /* renamed from: x, reason: collision with root package name */
    public final InterfaceC5240d f3056x;

    public i0(InterfaceC5245i interfaceC5245i, I7.p pVar) {
        super(interfaceC5245i, false, 0);
        this.f3056x = A8.b.g(pVar, this, this);
    }

    @Override // S7.h0
    public final void P() {
        try {
            X7.a.h(u7.v.f41073a, A8.b.n(this.f3056x));
        } catch (Throwable th) {
            resumeWith(Q3.b.b(th));
            throw th;
        }
    }
}
