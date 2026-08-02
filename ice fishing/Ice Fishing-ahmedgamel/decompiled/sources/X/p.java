package X;

import z7.InterfaceC5240d;

/* loaded from: classes.dex */
public final class p extends B7.c {

    /* renamed from: n, reason: collision with root package name */
    public /* synthetic */ Object f3684n;

    /* renamed from: u, reason: collision with root package name */
    public int f3685u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ V7.i f3686v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(V7.i iVar, InterfaceC5240d interfaceC5240d) {
        super(interfaceC5240d);
        this.f3686v = iVar;
    }

    @Override // B7.a
    public final Object invokeSuspend(Object obj) {
        this.f3684n = obj;
        this.f3685u |= Integer.MIN_VALUE;
        return this.f3686v.a(null, this);
    }
}
