package X;

/* loaded from: classes.dex */
public final class A extends B7.c {

    /* renamed from: n, reason: collision with root package name */
    public D f3626n;

    /* renamed from: u, reason: collision with root package name */
    public Object f3627u;

    /* renamed from: v, reason: collision with root package name */
    public Object f3628v;

    /* renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f3629w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ D f3630x;

    /* renamed from: y, reason: collision with root package name */
    public int f3631y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A(D d9, B7.c cVar) {
        super(cVar);
        this.f3630x = d9;
    }

    @Override // B7.a
    public final Object invokeSuspend(Object obj) {
        this.f3629w = obj;
        this.f3631y |= Integer.MIN_VALUE;
        return this.f3630x.h(null, null, this);
    }
}
