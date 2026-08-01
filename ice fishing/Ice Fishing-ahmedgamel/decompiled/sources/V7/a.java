package V7;

import W7.q;
import g1.C4523c;
import z7.InterfaceC5267d;

/* loaded from: classes2.dex */
public final class a extends B7.c {

    /* renamed from: n, reason: collision with root package name */
    public q f3318n;

    /* renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f3319u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ C4523c f3320v;

    /* renamed from: w, reason: collision with root package name */
    public int f3321w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(C4523c c4523c, InterfaceC5267d interfaceC5267d) {
        super(interfaceC5267d);
        this.f3320v = c4523c;
    }

    @Override // B7.a
    public final Object invokeSuspend(Object obj) {
        this.f3319u = obj;
        this.f3321w |= Integer.MIN_VALUE;
        return this.f3320v.p(null, this);
    }
}
