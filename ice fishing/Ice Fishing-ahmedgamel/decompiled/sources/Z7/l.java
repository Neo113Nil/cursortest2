package Z7;

import S7.AbstractC0402u;
import z7.InterfaceC5272i;

/* loaded from: classes2.dex */
public final class l extends AbstractC0402u {

    /* renamed from: v, reason: collision with root package name */
    public static final l f4223v = new l();

    public final AbstractC0402u A(int i) {
        X7.a.a(i);
        if (i >= k.f4218d) {
            return this;
        }
        X7.a.a(i);
        return new X7.i(this, i);
    }

    @Override // S7.AbstractC0402u
    public final void p(InterfaceC5272i interfaceC5272i, Runnable runnable) {
        e eVar = e.f4209w;
        eVar.f4211v.i(runnable, k.f4222h, false);
    }

    @Override // S7.AbstractC0402u
    public final void q(InterfaceC5272i interfaceC5272i, Runnable runnable) {
        e eVar = e.f4209w;
        eVar.f4211v.i(runnable, k.f4222h, true);
    }
}
