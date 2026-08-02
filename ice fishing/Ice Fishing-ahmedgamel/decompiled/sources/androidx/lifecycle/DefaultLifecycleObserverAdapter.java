package androidx.lifecycle;

/* loaded from: classes.dex */
public final class DefaultLifecycleObserverAdapter implements InterfaceC0505t {

    /* renamed from: n, reason: collision with root package name */
    public final InterfaceC0492f f5068n;

    /* renamed from: u, reason: collision with root package name */
    public final InterfaceC0505t f5069u;

    public DefaultLifecycleObserverAdapter(InterfaceC0492f interfaceC0492f, InterfaceC0505t interfaceC0505t) {
        this.f5068n = interfaceC0492f;
        this.f5069u = interfaceC0505t;
    }

    @Override // androidx.lifecycle.InterfaceC0505t
    public final void a(InterfaceC0507v interfaceC0507v, EnumC0500n enumC0500n) {
        int i = AbstractC0493g.f5129a[enumC0500n.ordinal()];
        InterfaceC0492f interfaceC0492f = this.f5068n;
        if (i == 3) {
            interfaceC0492f.onResume();
        } else if (i == 7) {
            throw new IllegalArgumentException("ON_ANY must not been send by anybody");
        }
        InterfaceC0505t interfaceC0505t = this.f5069u;
        if (interfaceC0505t != null) {
            interfaceC0505t.a(interfaceC0507v, enumC0500n);
        }
    }
}
