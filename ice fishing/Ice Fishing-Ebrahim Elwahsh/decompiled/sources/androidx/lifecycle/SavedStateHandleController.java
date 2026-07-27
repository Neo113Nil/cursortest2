package androidx.lifecycle;

import x0.C5202c;

/* loaded from: classes.dex */
public final class SavedStateHandleController implements InterfaceC0511t {

    /* renamed from: n, reason: collision with root package name */
    public final String f5257n;

    /* renamed from: u, reason: collision with root package name */
    public final K f5258u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f5259v;

    public SavedStateHandleController(String str, K k6) {
        this.f5257n = str;
        this.f5258u = k6;
    }

    @Override // androidx.lifecycle.InterfaceC0511t
    public final void a(InterfaceC0513v interfaceC0513v, EnumC0506n enumC0506n) {
        if (enumC0506n == EnumC0506n.ON_DESTROY) {
            this.f5259v = false;
            interfaceC0513v.getLifecycle().b(this);
        }
    }

    public final void b(AbstractC0508p lifecycle, C5202c registry) {
        kotlin.jvm.internal.h.e(registry, "registry");
        kotlin.jvm.internal.h.e(lifecycle, "lifecycle");
        if (this.f5259v) {
            throw new IllegalStateException("Already attached to lifecycleOwner");
        }
        this.f5259v = true;
        lifecycle.a(this);
        registry.c(this.f5257n, this.f5258u.f5231e);
    }
}
