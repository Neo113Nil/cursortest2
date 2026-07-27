package V7;

import S7.Y;
import z7.InterfaceC5267d;

/* loaded from: classes2.dex */
public final class m extends B7.c {

    /* renamed from: A, reason: collision with root package name */
    public int f3348A;

    /* renamed from: n, reason: collision with root package name */
    public n f3349n;

    /* renamed from: u, reason: collision with root package name */
    public c f3350u;

    /* renamed from: v, reason: collision with root package name */
    public p f3351v;

    /* renamed from: w, reason: collision with root package name */
    public Y f3352w;

    /* renamed from: x, reason: collision with root package name */
    public Object f3353x;

    /* renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f3354y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ n f3355z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(n nVar, InterfaceC5267d interfaceC5267d) {
        super(interfaceC5267d);
        this.f3355z = nVar;
    }

    @Override // B7.a
    public final Object invokeSuspend(Object obj) {
        this.f3354y = obj;
        this.f3348A |= Integer.MIN_VALUE;
        this.f3355z.p(null, this);
        return A7.a.f58n;
    }
}
