package S7;

import z7.InterfaceC5267d;
import z7.InterfaceC5272i;

/* loaded from: classes2.dex */
public final class j0 extends B {

    /* renamed from: x, reason: collision with root package name */
    public final InterfaceC5267d f2974x;

    public j0(InterfaceC5272i interfaceC5272i, I7.p pVar) {
        super(interfaceC5272i, false, 1);
        this.f2974x = A8.b.f(pVar, this, this);
    }

    @Override // S7.h0
    public final void P() {
        try {
            X7.a.h(u7.v.f41350a, A8.b.l(this.f2974x));
        } catch (Throwable th) {
            resumeWith(com.bumptech.glide.d.f(th));
            throw th;
        }
    }
}
