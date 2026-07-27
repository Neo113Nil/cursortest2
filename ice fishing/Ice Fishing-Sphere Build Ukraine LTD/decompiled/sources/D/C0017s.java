package D;

import t0.C0252g;

/* renamed from: D.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0017s extends x0.f implements D0.q {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f259i = 1;

    /* renamed from: j, reason: collision with root package name */
    public int f260j;

    /* renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f261k;

    public /* synthetic */ C0017s(int i2, v0.d dVar) {
        super(i2, dVar);
    }

    @Override // x0.b
    public final Object n(Object obj) {
        switch (this.f259i) {
            case 0:
                w0.a aVar = w0.a.f3076e;
                int i2 = this.f260j;
                if (i2 == 0) {
                    o.g.z(obj);
                    this.f260j = 1;
                    if (S.a((S) this.f261k, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.g.z(obj);
                }
                return C0252g.f2994a;
            default:
                w0.a aVar2 = w0.a.f3076e;
                int i3 = this.f260j;
                if (i3 == 0) {
                    o.g.z(obj);
                    U u2 = (U) this.f261k;
                    this.f260j = 1;
                    u2.getClass();
                    obj = U.a(u2, this);
                    if (obj == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.g.z(obj);
                }
                return obj;
        }
    }

    public final Object p(Object obj, Object obj2, x0.b bVar) {
        switch (this.f259i) {
            case 0:
                return new C0017s((S) this.f261k, bVar).n(C0252g.f2994a);
            default:
                ((Boolean) obj2).getClass();
                C0017s c0017s = new C0017s(3, bVar);
                c0017s.f261k = (U) obj;
                return c0017s.n(C0252g.f2994a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0017s(S s2, v0.d dVar) {
        super(3, dVar);
        this.f261k = s2;
    }
}
