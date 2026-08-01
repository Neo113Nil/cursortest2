package O1;

/* loaded from: classes.dex */
public final class a extends x1.c {

    /* renamed from: d, reason: collision with root package name */
    public P1.g f842d;
    public /* synthetic */ Object e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ B.b f843f;

    /* renamed from: g, reason: collision with root package name */
    public int f844g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(B.b bVar, x1.c cVar) {
        super(cVar);
        this.f843f = bVar;
    }

    @Override // x1.a
    public final Object k(Object obj) {
        this.e = obj;
        this.f844g |= Integer.MIN_VALUE;
        return this.f843f.w(null, this);
    }
}
