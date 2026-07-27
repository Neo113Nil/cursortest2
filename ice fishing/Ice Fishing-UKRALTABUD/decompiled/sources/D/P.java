package D;

/* loaded from: classes.dex */
public final class P extends x0.b {

    /* renamed from: i, reason: collision with root package name */
    public E0.o f114i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f115j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ S f116k;

    /* renamed from: l, reason: collision with root package name */
    public int f117l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P(S s2, x0.b bVar) {
        super(bVar);
        this.f116k = s2;
    }

    @Override // x0.b
    public final Object n(Object obj) {
        this.f115j = obj;
        this.f117l |= Integer.MIN_VALUE;
        return this.f116k.i(null, false, this);
    }
}
