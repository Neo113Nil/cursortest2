package androidx.lifecycle;

/* loaded from: classes.dex */
public final class DefaultLifecycleObserverAdapter implements InterfaceC0511t {

    /* renamed from: n, reason: collision with root package name */
    public final InterfaceC0498f f5213n;

    /* renamed from: u, reason: collision with root package name */
    public final InterfaceC0511t f5214u;

    public DefaultLifecycleObserverAdapter(InterfaceC0498f interfaceC0498f, InterfaceC0511t interfaceC0511t) {
        this.f5213n = interfaceC0498f;
        this.f5214u = interfaceC0511t;
    }

    @Override // androidx.lifecycle.InterfaceC0511t
    public final void a(InterfaceC0513v interfaceC0513v, EnumC0506n enumC0506n) {
        int i = AbstractC0499g.f5274a[enumC0506n.ordinal()];
        InterfaceC0498f interfaceC0498f = this.f5213n;
        if (i == 3) {
            interfaceC0498f.onResume();
        } else if (i == 7) {
            throw new IllegalArgumentException("ON_ANY must not been send by anybody");
        }
        InterfaceC0511t interfaceC0511t = this.f5214u;
        if (interfaceC0511t != null) {
            interfaceC0511t.a(interfaceC0513v, enumC0506n);
        }
    }
}
