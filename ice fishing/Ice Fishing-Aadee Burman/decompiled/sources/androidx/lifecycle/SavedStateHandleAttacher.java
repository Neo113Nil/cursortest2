package androidx.lifecycle;

/* loaded from: classes.dex */
public final class SavedStateHandleAttacher implements InterfaceC0501t {

    /* renamed from: n, reason: collision with root package name */
    public final M f5144n;

    public SavedStateHandleAttacher(M m4) {
        this.f5144n = m4;
    }

    @Override // androidx.lifecycle.InterfaceC0501t
    public final void a(InterfaceC0503v interfaceC0503v, EnumC0496n enumC0496n) {
        if (enumC0496n == EnumC0496n.ON_CREATE) {
            interfaceC0503v.getLifecycle().b(this);
            this.f5144n.b();
        } else {
            throw new IllegalStateException(("Next event must be ON_CREATE, it was " + enumC0496n).toString());
        }
    }
}
