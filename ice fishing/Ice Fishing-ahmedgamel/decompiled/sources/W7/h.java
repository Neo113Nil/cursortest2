package W7;

import z7.InterfaceC5267d;

/* loaded from: classes2.dex */
public final class h extends B7.c {

    /* renamed from: n, reason: collision with root package name */
    public i f3431n;

    /* renamed from: u, reason: collision with root package name */
    public Object f3432u;

    /* renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object f3433v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ i f3434w;

    /* renamed from: x, reason: collision with root package name */
    public int f3435x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar, InterfaceC5267d interfaceC5267d) {
        super(interfaceC5267d);
        this.f3434w = iVar;
    }

    @Override // B7.a
    public final Object invokeSuspend(Object obj) {
        this.f3433v = obj;
        this.f3435x |= Integer.MIN_VALUE;
        return this.f3434w.a(null, this);
    }
}
