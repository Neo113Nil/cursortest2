package P0;

import t0.C0252g;

/* loaded from: classes.dex */
public final class t extends x0.f implements D0.p {

    /* renamed from: i, reason: collision with root package name */
    public int f863i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f864j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ O0.e f865k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(O0.e eVar, v0.d dVar) {
        super(2, dVar);
        this.f865k = eVar;
    }

    @Override // D0.p
    public final Object f(Object obj, Object obj2) {
        return ((t) l(obj, (v0.d) obj2)).n(C0252g.f2994a);
    }

    @Override // x0.b
    public final v0.d l(Object obj, v0.d dVar) {
        t tVar = new t(this.f865k, dVar);
        tVar.f864j = obj;
        return tVar;
    }

    @Override // x0.b
    public final Object n(Object obj) {
        w0.a aVar = w0.a.f3076e;
        int i2 = this.f863i;
        if (i2 == 0) {
            o.g.z(obj);
            Object obj2 = this.f864j;
            this.f863i = 1;
            if (this.f865k.b(obj2, this) == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.g.z(obj);
        }
        return C0252g.f2994a;
    }
}
