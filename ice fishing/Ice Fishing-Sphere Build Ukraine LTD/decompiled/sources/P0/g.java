package P0;

import t0.C0252g;

/* loaded from: classes.dex */
public final class g extends x0.f implements D0.p {

    /* renamed from: i, reason: collision with root package name */
    public int f843i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f844j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ h f845k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, v0.d dVar) {
        super(2, dVar);
        this.f845k = hVar;
    }

    @Override // D0.p
    public final Object f(Object obj, Object obj2) {
        return ((g) l((O0.e) obj, (v0.d) obj2)).n(C0252g.f2994a);
    }

    @Override // x0.b
    public final v0.d l(Object obj, v0.d dVar) {
        g gVar = new g(this.f845k, dVar);
        gVar.f844j = obj;
        return gVar;
    }

    @Override // x0.b
    public final Object n(Object obj) {
        w0.a aVar = w0.a.f3076e;
        int i2 = this.f843i;
        C0252g c0252g = C0252g.f2994a;
        if (i2 == 0) {
            o.g.z(obj);
            O0.e eVar = (O0.e) this.f844j;
            this.f843i = 1;
            Object c2 = this.f845k.f846h.c(eVar, this);
            if (c2 != aVar) {
                c2 = c0252g;
            }
            if (c2 == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.g.z(obj);
        }
        return c0252g;
    }
}
