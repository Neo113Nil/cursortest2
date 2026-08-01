package X;

/* loaded from: classes.dex */
public final class w extends B7.c {

    /* renamed from: n, reason: collision with root package name */
    public D f3557n;

    /* renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f3558u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ D f3559v;

    /* renamed from: w, reason: collision with root package name */
    public int f3560w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(D d2, B7.c cVar) {
        super(cVar);
        this.f3559v = d2;
    }

    @Override // B7.a
    public final Object invokeSuspend(Object obj) {
        this.f3558u = obj;
        this.f3560w |= Integer.MIN_VALUE;
        return this.f3559v.d(this);
    }
}
