package androidx.lifecycle;

import S7.AbstractC0406y;
import S7.InterfaceC0404w;
import z7.InterfaceC5272i;

/* loaded from: classes.dex */
public final class LifecycleCoroutineScopeImpl implements InterfaceC0501t, InterfaceC0404w {

    /* renamed from: n, reason: collision with root package name */
    public final AbstractC0498p f5125n;

    /* renamed from: u, reason: collision with root package name */
    public final InterfaceC5272i f5126u;

    public LifecycleCoroutineScopeImpl(AbstractC0498p abstractC0498p, InterfaceC5272i coroutineContext) {
        kotlin.jvm.internal.h.e(coroutineContext, "coroutineContext");
        this.f5125n = abstractC0498p;
        this.f5126u = coroutineContext;
        if (((C0505x) abstractC0498p).f5178d == EnumC0497o.f5164n) {
            AbstractC0406y.d(coroutineContext, null);
        }
    }

    @Override // androidx.lifecycle.InterfaceC0501t
    public final void a(InterfaceC0503v interfaceC0503v, EnumC0496n enumC0496n) {
        AbstractC0498p abstractC0498p = this.f5125n;
        if (((C0505x) abstractC0498p).f5178d.compareTo(EnumC0497o.f5164n) <= 0) {
            abstractC0498p.b(this);
            AbstractC0406y.d(this.f5126u, null);
        }
    }

    @Override // S7.InterfaceC0404w
    public final InterfaceC5272i z() {
        return this.f5126u;
    }
}
