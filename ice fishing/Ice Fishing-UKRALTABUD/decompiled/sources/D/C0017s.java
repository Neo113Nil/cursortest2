package D;

/* renamed from: D.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0017s extends x0.f implements D0.q {

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f258j = 1;

    /* renamed from: k, reason: collision with root package name */
    public int f259k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f260l;

    public /* synthetic */ C0017s(int i2, v0.d dVar) {
        super(i2, dVar);
    }

    @Override // x0.b
    public final Object n(Object obj) {
        switch (this.f258j) {
            case 0:
                w0.a aVar = w0.a.f3071f;
                int i2 = this.f259k;
                if (i2 == 0) {
                    o.g.C(obj);
                    this.f259k = 1;
                    if (S.a((S) this.f260l, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.g.C(obj);
                }
                return t0.g.f2989a;
            default:
                w0.a aVar2 = w0.a.f3071f;
                int i3 = this.f259k;
                if (i3 == 0) {
                    o.g.C(obj);
                    U u2 = (U) this.f260l;
                    this.f259k = 1;
                    u2.getClass();
                    obj = U.a(u2, this);
                    if (obj == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.g.C(obj);
                }
                return obj;
        }
    }

    public final Object p(Object obj, Object obj2, x0.b bVar) {
        switch (this.f258j) {
            case 0:
                return new C0017s((S) this.f260l, bVar).n(t0.g.f2989a);
            default:
                ((Boolean) obj2).getClass();
                C0017s c0017s = new C0017s(3, bVar);
                c0017s.f260l = (U) obj;
                return c0017s.n(t0.g.f2989a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0017s(S s2, v0.d dVar) {
        super(3, dVar);
        this.f260l = s2;
    }
}
