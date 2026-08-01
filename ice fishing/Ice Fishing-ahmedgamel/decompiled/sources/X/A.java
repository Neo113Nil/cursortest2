package X;

/* loaded from: classes.dex */
public final class A extends B7.c {

    /* renamed from: n, reason: collision with root package name */
    public D f3464n;

    /* renamed from: u, reason: collision with root package name */
    public Object f3465u;

    /* renamed from: v, reason: collision with root package name */
    public Object f3466v;

    /* renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f3467w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ D f3468x;

    /* renamed from: y, reason: collision with root package name */
    public int f3469y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A(D d2, B7.c cVar) {
        super(cVar);
        this.f3468x = d2;
    }

    @Override // B7.a
    public final Object invokeSuspend(Object obj) {
        this.f3467w = obj;
        this.f3469y |= Integer.MIN_VALUE;
        return this.f3468x.h(null, null, this);
    }
}
