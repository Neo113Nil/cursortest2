package O0;

import L.Q;

/* loaded from: classes.dex */
public final class j extends x0.b {

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f776h;

    /* renamed from: i, reason: collision with root package name */
    public int f777i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Q f778j;

    /* renamed from: k, reason: collision with root package name */
    public Q f779k;

    /* renamed from: l, reason: collision with root package name */
    public e f780l;

    /* renamed from: m, reason: collision with root package name */
    public P0.n f781m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(Q q2, v0.d dVar) {
        super(dVar);
        this.f778j = q2;
    }

    @Override // x0.b
    public final Object n(Object obj) {
        this.f776h = obj;
        this.f777i |= Integer.MIN_VALUE;
        return this.f778j.c(null, this);
    }
}
