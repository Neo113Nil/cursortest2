package androidx.lifecycle;

import x0.C5181c;

/* loaded from: classes.dex */
public final class LegacySavedStateHandleController$tryToAddRecreator$1 implements InterfaceC0501t {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ AbstractC0498p f5123n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C5181c f5124u;

    public LegacySavedStateHandleController$tryToAddRecreator$1(AbstractC0498p abstractC0498p, C5181c c5181c) {
        this.f5123n = abstractC0498p;
        this.f5124u = c5181c;
    }

    @Override // androidx.lifecycle.InterfaceC0501t
    public final void a(InterfaceC0503v interfaceC0503v, EnumC0496n enumC0496n) {
        if (enumC0496n == EnumC0496n.ON_START) {
            this.f5123n.b(this);
            this.f5124u.d();
        }
    }
}
