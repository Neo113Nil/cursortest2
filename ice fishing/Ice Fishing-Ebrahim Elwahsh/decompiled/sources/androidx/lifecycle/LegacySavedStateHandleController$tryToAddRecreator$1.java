package androidx.lifecycle;

import x0.C5202c;

/* loaded from: classes.dex */
public final class LegacySavedStateHandleController$tryToAddRecreator$1 implements InterfaceC0511t {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ AbstractC0508p f5235n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C5202c f5236u;

    public LegacySavedStateHandleController$tryToAddRecreator$1(AbstractC0508p abstractC0508p, C5202c c5202c) {
        this.f5235n = abstractC0508p;
        this.f5236u = c5202c;
    }

    @Override // androidx.lifecycle.InterfaceC0511t
    public final void a(InterfaceC0513v interfaceC0513v, EnumC0506n enumC0506n) {
        if (enumC0506n == EnumC0506n.ON_START) {
            this.f5235n.b(this);
            this.f5236u.d();
        }
    }
}
