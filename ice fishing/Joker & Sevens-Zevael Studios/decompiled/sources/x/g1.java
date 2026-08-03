package x;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class g1 extends hc.i implements oc.e {

    /* renamed from: h, reason: collision with root package name */
    public int f7794h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f7795i;

    @Override // hc.a
    public final fc.d create(Object obj, fc.d dVar) {
        g1 g1Var = new g1(dVar);
        g1Var.f7795i = obj;
        return g1Var;
    }

    @Override // oc.e
    public final Object invoke(Object obj, Object obj2) {
        return ((g1) create((r1.y) obj, (fc.d) obj2)).invokeSuspend(ac.o.f277a);
    }

    @Override // hc.a
    public final Object invokeSuspend(Object obj) {
        int i10 = this.f7794h;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            v6.a.W(obj);
            return obj;
        }
        v6.a.W(obj);
        r1.y yVar = (r1.y) this.f7795i;
        this.f7794h = 1;
        Object d10 = k1.d(yVar, r1.h.f5957h, this);
        gc.a aVar = gc.a.f2559g;
        return d10 == aVar ? aVar : d10;
    }
}
