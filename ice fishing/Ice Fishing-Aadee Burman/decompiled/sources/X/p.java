package X;

import z7.InterfaceC5267d;

/* loaded from: classes.dex */
public final class p extends B7.c {

    /* renamed from: n, reason: collision with root package name */
    public /* synthetic */ Object f3522n;

    /* renamed from: u, reason: collision with root package name */
    public int f3523u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ V7.i f3524v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(V7.i iVar, InterfaceC5267d interfaceC5267d) {
        super(interfaceC5267d);
        this.f3524v = iVar;
    }

    @Override // B7.a
    public final Object invokeSuspend(Object obj) {
        this.f3522n = obj;
        this.f3523u |= Integer.MIN_VALUE;
        return this.f3524v.a(null, this);
    }
}
