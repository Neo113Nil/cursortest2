package W7;

import z7.InterfaceC5240d;

/* loaded from: classes2.dex */
public final class h extends B7.c {

    /* renamed from: n, reason: collision with root package name */
    public i f3593n;

    /* renamed from: u, reason: collision with root package name */
    public Object f3594u;

    /* renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object f3595v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ i f3596w;

    /* renamed from: x, reason: collision with root package name */
    public int f3597x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar, InterfaceC5240d interfaceC5240d) {
        super(interfaceC5240d);
        this.f3596w = iVar;
    }

    @Override // B7.a
    public final Object invokeSuspend(Object obj) {
        this.f3595v = obj;
        this.f3597x |= Integer.MIN_VALUE;
        return this.f3596w.a(null, this);
    }
}
