package N0;

import L.Q;

/* loaded from: classes.dex */
public final class j extends x0.b {

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f768i;

    /* renamed from: j, reason: collision with root package name */
    public int f769j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Q f770k;

    /* renamed from: l, reason: collision with root package name */
    public Q f771l;

    /* renamed from: m, reason: collision with root package name */
    public e f772m;

    /* renamed from: n, reason: collision with root package name */
    public O0.n f773n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(Q q2, v0.d dVar) {
        super(dVar);
        this.f770k = q2;
    }

    @Override // x0.b
    public final Object n(Object obj) {
        this.f768i = obj;
        this.f769j |= Integer.MIN_VALUE;
        return this.f770k.n(null, this);
    }
}
