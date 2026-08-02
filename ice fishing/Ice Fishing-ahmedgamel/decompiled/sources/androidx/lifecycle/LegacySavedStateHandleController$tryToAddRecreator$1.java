package androidx.lifecycle;

import x0.C5180c;

/* loaded from: classes.dex */
public final class LegacySavedStateHandleController$tryToAddRecreator$1 implements InterfaceC0505t {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ AbstractC0502p f5090n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C5180c f5091u;

    public LegacySavedStateHandleController$tryToAddRecreator$1(AbstractC0502p abstractC0502p, C5180c c5180c) {
        this.f5090n = abstractC0502p;
        this.f5091u = c5180c;
    }

    @Override // androidx.lifecycle.InterfaceC0505t
    public final void a(InterfaceC0507v interfaceC0507v, EnumC0500n enumC0500n) {
        if (enumC0500n == EnumC0500n.ON_START) {
            this.f5090n.b(this);
            this.f5091u.d();
        }
    }
}
