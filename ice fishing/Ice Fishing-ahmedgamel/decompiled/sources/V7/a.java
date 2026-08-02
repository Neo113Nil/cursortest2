package V7;

import W7.q;
import z7.InterfaceC5240d;

/* loaded from: classes2.dex */
public final class a extends B7.c {

    /* renamed from: n, reason: collision with root package name */
    public q f3448n;

    /* renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f3449u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ I0.j f3450v;

    /* renamed from: w, reason: collision with root package name */
    public int f3451w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(I0.j jVar, InterfaceC5240d interfaceC5240d) {
        super(interfaceC5240d);
        this.f3450v = jVar;
    }

    @Override // B7.a
    public final Object invokeSuspend(Object obj) {
        this.f3449u = obj;
        this.f3451w |= Integer.MIN_VALUE;
        return this.f3450v.l(null, this);
    }
}
