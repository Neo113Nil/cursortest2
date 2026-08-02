package androidx.lifecycle;

/* loaded from: classes.dex */
public final class SavedStateHandleAttacher implements InterfaceC0505t {

    /* renamed from: n, reason: collision with root package name */
    public final M f5111n;

    public SavedStateHandleAttacher(M m9) {
        this.f5111n = m9;
    }

    @Override // androidx.lifecycle.InterfaceC0505t
    public final void a(InterfaceC0507v interfaceC0507v, EnumC0500n enumC0500n) {
        if (enumC0500n == EnumC0500n.ON_CREATE) {
            interfaceC0507v.getLifecycle().b(this);
            this.f5111n.b();
        } else {
            throw new IllegalStateException(("Next event must be ON_CREATE, it was " + enumC0500n).toString());
        }
    }
}
