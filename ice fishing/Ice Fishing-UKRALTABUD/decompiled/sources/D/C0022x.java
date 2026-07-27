package D;

/* renamed from: D.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0022x extends x0.f implements D0.l {

    /* renamed from: j, reason: collision with root package name */
    public int f275j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ I f276k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0022x(I i2, v0.d dVar) {
        super(1, dVar);
        this.f276k = i2;
    }

    @Override // D0.l
    public final Object i(Object obj) {
        return new C0022x(this.f276k, (v0.d) obj).n(t0.g.f2989a);
    }

    @Override // x0.b
    public final Object n(Object obj) {
        w0.a aVar = w0.a.f3071f;
        int i2 = this.f275j;
        if (i2 == 0) {
            o.g.C(obj);
            this.f275j = 1;
            obj = this.f276k.i(this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.g.C(obj);
        }
        return obj;
    }
}
