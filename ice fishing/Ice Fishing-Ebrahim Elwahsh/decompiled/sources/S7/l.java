package S7;

import v7.InterfaceC5136g;
import v7.InterfaceC5137h;
import v7.InterfaceC5138i;

/* loaded from: classes2.dex */
public final class l implements InterfaceC5138i {

    /* renamed from: n, reason: collision with root package name */
    public final Throwable f3010n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ InterfaceC5138i f3011u;

    public l(Throwable th, InterfaceC5138i interfaceC5138i) {
        this.f3010n = th;
        this.f3011u = interfaceC5138i;
    }

    @Override // v7.InterfaceC5138i
    public final InterfaceC5138i g(InterfaceC5137h interfaceC5137h) {
        return this.f3011u.g(interfaceC5137h);
    }

    @Override // v7.InterfaceC5138i
    public final InterfaceC5136g i(InterfaceC5137h interfaceC5137h) {
        return this.f3011u.i(interfaceC5137h);
    }

    @Override // v7.InterfaceC5138i
    public final Object m(Object obj, E7.p pVar) {
        return this.f3011u.m(obj, pVar);
    }

    @Override // v7.InterfaceC5138i
    public final InterfaceC5138i n(InterfaceC5138i interfaceC5138i) {
        return this.f3011u.n(interfaceC5138i);
    }
}
