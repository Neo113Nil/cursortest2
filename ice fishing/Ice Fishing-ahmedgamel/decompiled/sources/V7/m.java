package V7;

import S7.Y;
import z7.InterfaceC5240d;

/* loaded from: classes2.dex */
public final class m extends B7.c {

    /* renamed from: A, reason: collision with root package name */
    public int f3478A;

    /* renamed from: n, reason: collision with root package name */
    public n f3479n;

    /* renamed from: u, reason: collision with root package name */
    public c f3480u;

    /* renamed from: v, reason: collision with root package name */
    public p f3481v;

    /* renamed from: w, reason: collision with root package name */
    public Y f3482w;

    /* renamed from: x, reason: collision with root package name */
    public Object f3483x;

    /* renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f3484y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ n f3485z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(n nVar, InterfaceC5240d interfaceC5240d) {
        super(interfaceC5240d);
        this.f3485z = nVar;
    }

    @Override // B7.a
    public final Object invokeSuspend(Object obj) {
        this.f3484y = obj;
        this.f3478A |= Integer.MIN_VALUE;
        this.f3485z.l(null, this);
        return A7.a.f215n;
    }
}
