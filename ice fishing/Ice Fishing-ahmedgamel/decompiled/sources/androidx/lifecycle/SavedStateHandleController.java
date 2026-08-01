package androidx.lifecycle;

import x0.C5181c;

/* loaded from: classes.dex */
public final class SavedStateHandleController implements InterfaceC0501t {

    /* renamed from: n, reason: collision with root package name */
    public final String f5145n;

    /* renamed from: u, reason: collision with root package name */
    public final K f5146u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f5147v;

    public SavedStateHandleController(String str, K k9) {
        this.f5145n = str;
        this.f5146u = k9;
    }

    @Override // androidx.lifecycle.InterfaceC0501t
    public final void a(InterfaceC0503v interfaceC0503v, EnumC0496n enumC0496n) {
        if (enumC0496n == EnumC0496n.ON_DESTROY) {
            this.f5147v = false;
            interfaceC0503v.getLifecycle().b(this);
        }
    }

    public final void b(AbstractC0498p lifecycle, C5181c registry) {
        kotlin.jvm.internal.h.e(registry, "registry");
        kotlin.jvm.internal.h.e(lifecycle, "lifecycle");
        if (this.f5147v) {
            throw new IllegalStateException("Already attached to lifecycleOwner");
        }
        this.f5147v = true;
        lifecycle.a(this);
        registry.c(this.f5145n, this.f5146u.f5119e);
    }
}
