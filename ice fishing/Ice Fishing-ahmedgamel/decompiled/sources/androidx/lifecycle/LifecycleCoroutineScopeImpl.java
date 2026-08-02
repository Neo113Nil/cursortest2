package androidx.lifecycle;

import S7.AbstractC0410y;
import S7.InterfaceC0408w;
import z7.InterfaceC5245i;

/* loaded from: classes.dex */
public final class LifecycleCoroutineScopeImpl implements InterfaceC0505t, InterfaceC0408w {

    /* renamed from: n, reason: collision with root package name */
    public final AbstractC0502p f5092n;

    /* renamed from: u, reason: collision with root package name */
    public final InterfaceC5245i f5093u;

    public LifecycleCoroutineScopeImpl(AbstractC0502p abstractC0502p, InterfaceC5245i coroutineContext) {
        kotlin.jvm.internal.h.e(coroutineContext, "coroutineContext");
        this.f5092n = abstractC0502p;
        this.f5093u = coroutineContext;
        if (((C0509x) abstractC0502p).f5145d == EnumC0501o.f5131n) {
            AbstractC0410y.d(coroutineContext, null);
        }
    }

    @Override // androidx.lifecycle.InterfaceC0505t
    public final void a(InterfaceC0507v interfaceC0507v, EnumC0500n enumC0500n) {
        AbstractC0502p abstractC0502p = this.f5092n;
        if (((C0509x) abstractC0502p).f5145d.compareTo(EnumC0501o.f5131n) <= 0) {
            abstractC0502p.b(this);
            AbstractC0410y.d(this.f5093u, null);
        }
    }

    @Override // S7.InterfaceC0408w
    public final InterfaceC5245i z() {
        return this.f5093u;
    }
}
