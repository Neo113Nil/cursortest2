package O1;

/* loaded from: classes.dex */
public final class b extends x1.c {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f845d;
    public final /* synthetic */ c e;

    /* renamed from: f, reason: collision with root package name */
    public int f846f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, v1.d dVar) {
        super(dVar);
        this.e = cVar;
    }

    @Override // x1.a
    public final Object k(Object obj) {
        this.f845d = obj;
        this.f846f |= Integer.MIN_VALUE;
        return this.e.a(null, this);
    }
}
