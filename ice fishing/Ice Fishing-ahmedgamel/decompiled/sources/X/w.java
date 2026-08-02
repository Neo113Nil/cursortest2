package X;

/* loaded from: classes.dex */
public final class w extends B7.c {

    /* renamed from: n, reason: collision with root package name */
    public D f3719n;

    /* renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f3720u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ D f3721v;

    /* renamed from: w, reason: collision with root package name */
    public int f3722w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(D d9, B7.c cVar) {
        super(cVar);
        this.f3721v = d9;
    }

    @Override // B7.a
    public final Object invokeSuspend(Object obj) {
        this.f3720u = obj;
        this.f3722w |= Integer.MIN_VALUE;
        return this.f3721v.d(this);
    }
}
