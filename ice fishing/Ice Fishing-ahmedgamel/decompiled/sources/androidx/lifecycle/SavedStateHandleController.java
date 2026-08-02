package androidx.lifecycle;

import x0.C5180c;

/* loaded from: classes.dex */
public final class SavedStateHandleController implements InterfaceC0505t {

    /* renamed from: n, reason: collision with root package name */
    public final String f5112n;

    /* renamed from: u, reason: collision with root package name */
    public final K f5113u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f5114v;

    public SavedStateHandleController(String str, K k9) {
        this.f5112n = str;
        this.f5113u = k9;
    }

    @Override // androidx.lifecycle.InterfaceC0505t
    public final void a(InterfaceC0507v interfaceC0507v, EnumC0500n enumC0500n) {
        if (enumC0500n == EnumC0500n.ON_DESTROY) {
            this.f5114v = false;
            interfaceC0507v.getLifecycle().b(this);
        }
    }

    public final void b(AbstractC0502p lifecycle, C5180c registry) {
        kotlin.jvm.internal.h.e(registry, "registry");
        kotlin.jvm.internal.h.e(lifecycle, "lifecycle");
        if (this.f5114v) {
            throw new IllegalStateException("Already attached to lifecycleOwner");
        }
        this.f5114v = true;
        lifecycle.a(this);
        registry.c(this.f5112n, this.f5113u.f5086e);
    }
}
