package androidx.lifecycle;

import S7.AbstractC0406y;
import S7.InterfaceC0404w;
import z7.InterfaceC5267d;

/* renamed from: androidx.lifecycle.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0499q extends B7.h implements I7.p {

    /* renamed from: n, reason: collision with root package name */
    public /* synthetic */ Object f5171n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ LifecycleCoroutineScopeImpl f5172u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0499q(LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl, InterfaceC5267d interfaceC5267d) {
        super(2, interfaceC5267d);
        this.f5172u = lifecycleCoroutineScopeImpl;
    }

    @Override // B7.a
    public final InterfaceC5267d create(Object obj, InterfaceC5267d interfaceC5267d) {
        C0499q c0499q = new C0499q(this.f5172u, interfaceC5267d);
        c0499q.f5171n = obj;
        return c0499q;
    }

    @Override // I7.p
    public final Object invoke(Object obj, Object obj2) {
        C0499q c0499q = (C0499q) create((InterfaceC0404w) obj, (InterfaceC5267d) obj2);
        u7.v vVar = u7.v.f41353a;
        c0499q.invokeSuspend(vVar);
        return vVar;
    }

    @Override // B7.a
    public final Object invokeSuspend(Object obj) {
        A7.a aVar = A7.a.f58n;
        com.bumptech.glide.d.k(obj);
        InterfaceC0404w interfaceC0404w = (InterfaceC0404w) this.f5171n;
        LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl = this.f5172u;
        AbstractC0498p abstractC0498p = lifecycleCoroutineScopeImpl.f5125n;
        if (((C0505x) abstractC0498p).f5178d.compareTo(EnumC0497o.f5165u) >= 0) {
            abstractC0498p.a(lifecycleCoroutineScopeImpl);
        } else {
            AbstractC0406y.d(interfaceC0404w.z(), null);
        }
        return u7.v.f41353a;
    }
}
