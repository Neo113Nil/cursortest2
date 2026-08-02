package Z7;

import S7.AbstractC0406u;
import z7.InterfaceC5245i;

/* loaded from: classes2.dex */
public final class l extends AbstractC0406u {

    /* renamed from: v, reason: collision with root package name */
    public static final l f4201v = new l();

    public final AbstractC0406u A(int i) {
        X7.a.a(i);
        if (i >= k.f4196d) {
            return this;
        }
        X7.a.a(i);
        return new X7.i(this, i);
    }

    @Override // S7.AbstractC0406u
    public final void p(InterfaceC5245i interfaceC5245i, Runnable runnable) {
        e eVar = e.f4187w;
        eVar.f4189v.i(runnable, k.f4200h, false);
    }

    @Override // S7.AbstractC0406u
    public final void q(InterfaceC5245i interfaceC5245i, Runnable runnable) {
        e eVar = e.f4187w;
        eVar.f4189v.i(runnable, k.f4200h, true);
    }
}
