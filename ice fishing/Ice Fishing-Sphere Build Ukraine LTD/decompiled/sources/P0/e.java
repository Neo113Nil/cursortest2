package P0;

import t0.C0252g;

/* loaded from: classes.dex */
public final class e extends x0.f implements D0.p {

    /* renamed from: i, reason: collision with root package name */
    public int f837i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f838j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ f f839k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, v0.d dVar) {
        super(2, dVar);
        this.f839k = fVar;
    }

    @Override // D0.p
    public final Object f(Object obj, Object obj2) {
        return ((e) l((N0.p) obj, (v0.d) obj2)).n(C0252g.f2994a);
    }

    @Override // x0.b
    public final v0.d l(Object obj, v0.d dVar) {
        e eVar = new e(this.f839k, dVar);
        eVar.f838j = obj;
        return eVar;
    }

    @Override // x0.b
    public final Object n(Object obj) {
        w0.a aVar = w0.a.f3076e;
        int i2 = this.f837i;
        if (i2 == 0) {
            o.g.z(obj);
            N0.p pVar = (N0.p) this.f838j;
            this.f837i = 1;
            if (this.f839k.a(pVar, this) == aVar) {
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
