package D;

/* loaded from: classes.dex */
public final class P extends x0.b {

    /* renamed from: h, reason: collision with root package name */
    public E0.o f114h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f115i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ S f116j;

    /* renamed from: k, reason: collision with root package name */
    public int f117k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P(S s2, x0.b bVar) {
        super(bVar);
        this.f116j = s2;
    }

    @Override // x0.b
    public final Object n(Object obj) {
        this.f115i = obj;
        this.f117k |= Integer.MIN_VALUE;
        return this.f116j.i(null, false, this);
    }
}
