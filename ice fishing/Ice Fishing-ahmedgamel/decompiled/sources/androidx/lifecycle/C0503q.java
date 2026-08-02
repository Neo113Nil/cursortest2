package androidx.lifecycle;

import S7.AbstractC0410y;
import S7.InterfaceC0408w;
import z7.InterfaceC5240d;

/* renamed from: androidx.lifecycle.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0503q extends B7.h implements I7.p {

    /* renamed from: n, reason: collision with root package name */
    public /* synthetic */ Object f5138n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ LifecycleCoroutineScopeImpl f5139u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0503q(LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl, InterfaceC5240d interfaceC5240d) {
        super(2, interfaceC5240d);
        this.f5139u = lifecycleCoroutineScopeImpl;
    }

    @Override // B7.a
    public final InterfaceC5240d create(Object obj, InterfaceC5240d interfaceC5240d) {
        C0503q c0503q = new C0503q(this.f5139u, interfaceC5240d);
        c0503q.f5138n = obj;
        return c0503q;
    }

    @Override // I7.p
    public final Object invoke(Object obj, Object obj2) {
        C0503q c0503q = (C0503q) create((InterfaceC0408w) obj, (InterfaceC5240d) obj2);
        u7.v vVar = u7.v.f41073a;
        c0503q.invokeSuspend(vVar);
        return vVar;
    }

    @Override // B7.a
    public final Object invokeSuspend(Object obj) {
        A7.a aVar = A7.a.f215n;
        Q3.b.s(obj);
        InterfaceC0408w interfaceC0408w = (InterfaceC0408w) this.f5138n;
        LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl = this.f5139u;
        AbstractC0502p abstractC0502p = lifecycleCoroutineScopeImpl.f5092n;
        if (((C0509x) abstractC0502p).f5145d.compareTo(EnumC0501o.f5132u) >= 0) {
            abstractC0502p.a(lifecycleCoroutineScopeImpl);
        } else {
            AbstractC0410y.d(interfaceC0408w.z(), null);
        }
        return u7.v.f41073a;
    }
}
