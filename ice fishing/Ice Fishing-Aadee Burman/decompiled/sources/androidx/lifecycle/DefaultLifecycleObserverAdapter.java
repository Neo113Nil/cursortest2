package androidx.lifecycle;

/* loaded from: classes.dex */
public final class DefaultLifecycleObserverAdapter implements InterfaceC0501t {

    /* renamed from: n, reason: collision with root package name */
    public final InterfaceC0488f f5101n;

    /* renamed from: u, reason: collision with root package name */
    public final InterfaceC0501t f5102u;

    public DefaultLifecycleObserverAdapter(InterfaceC0488f interfaceC0488f, InterfaceC0501t interfaceC0501t) {
        this.f5101n = interfaceC0488f;
        this.f5102u = interfaceC0501t;
    }

    @Override // androidx.lifecycle.InterfaceC0501t
    public final void a(InterfaceC0503v interfaceC0503v, EnumC0496n enumC0496n) {
        int i = AbstractC0489g.f5162a[enumC0496n.ordinal()];
        InterfaceC0488f interfaceC0488f = this.f5101n;
        if (i == 3) {
            interfaceC0488f.onResume();
        } else if (i == 7) {
            throw new IllegalArgumentException("ON_ANY must not been send by anybody");
        }
        InterfaceC0501t interfaceC0501t = this.f5102u;
        if (interfaceC0501t != null) {
            interfaceC0501t.a(interfaceC0503v, enumC0496n);
        }
    }
}
