package N0;

import K0.Q;

/* loaded from: classes.dex */
public final class p extends x0.b {

    /* renamed from: i, reason: collision with root package name */
    public q f796i;

    /* renamed from: j, reason: collision with root package name */
    public e f797j;

    /* renamed from: k, reason: collision with root package name */
    public s f798k;

    /* renamed from: l, reason: collision with root package name */
    public Q f799l;

    /* renamed from: m, reason: collision with root package name */
    public Object f800m;

    /* renamed from: n, reason: collision with root package name */
    public /* synthetic */ Object f801n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ q f802o;

    /* renamed from: p, reason: collision with root package name */
    public int f803p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(q qVar, v0.d dVar) {
        super(dVar);
        this.f802o = qVar;
    }

    @Override // x0.b
    public final Object n(Object obj) {
        this.f801n = obj;
        this.f803p |= Integer.MIN_VALUE;
        this.f802o.n(null, this);
        return w0.a.f3071f;
    }
}
