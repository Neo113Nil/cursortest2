package m0;

/* renamed from: m0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0294b extends x1.c {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f4064d;
    public int e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C0295c f4065f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0294b(C0295c c0295c, v1.d dVar) {
        super(dVar);
        this.f4065f = c0295c;
    }

    @Override // x1.a
    public final Object k(Object obj) {
        this.f4064d = obj;
        this.e |= Integer.MIN_VALUE;
        return this.f4065f.a(null, this);
    }
}
