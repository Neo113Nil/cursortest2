package W7;

import z7.InterfaceC5270g;
import z7.InterfaceC5271h;
import z7.InterfaceC5272i;

/* loaded from: classes2.dex */
public final class l implements InterfaceC5272i {

    /* renamed from: n, reason: collision with root package name */
    public final Throwable f3444n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ InterfaceC5272i f3445u;

    public l(Throwable th, InterfaceC5272i interfaceC5272i) {
        this.f3444n = th;
        this.f3445u = interfaceC5272i;
    }

    @Override // z7.InterfaceC5272i
    public final InterfaceC5272i i(InterfaceC5271h interfaceC5271h) {
        return this.f3445u.i(interfaceC5271h);
    }

    @Override // z7.InterfaceC5272i
    public final Object l(Object obj, I7.p pVar) {
        return this.f3445u.l(obj, pVar);
    }

    @Override // z7.InterfaceC5272i
    public final InterfaceC5270g m(InterfaceC5271h interfaceC5271h) {
        return this.f3445u.m(interfaceC5271h);
    }

    @Override // z7.InterfaceC5272i
    public final InterfaceC5272i n(InterfaceC5272i interfaceC5272i) {
        return this.f3445u.n(interfaceC5272i);
    }
}
