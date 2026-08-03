package b0;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class h0 extends hc.j implements oc.e {

    /* renamed from: g, reason: collision with root package name */
    public int f828g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ i0 f829h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f830i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(i0 i0Var, int i10, fc.d dVar) {
        super(2, dVar);
        this.f829h = i0Var;
        this.f830i = i10;
    }

    @Override // hc.a
    public final fc.d create(Object obj, fc.d dVar) {
        return new h0(this.f829h, this.f830i, dVar);
    }

    @Override // oc.e
    public final Object invoke(Object obj, Object obj2) {
        return ((h0) create((yc.y) obj, (fc.d) obj2)).invokeSuspend(ac.o.f277a);
    }

    @Override // hc.a
    public final Object invokeSuspend(Object obj) {
        int i10 = this.f828g;
        ac.o oVar = ac.o.f277a;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            v6.a.W(obj);
            return oVar;
        }
        v6.a.W(obj);
        a0.d dVar = this.f829h.f834v;
        this.f828g = 1;
        a0.b0 b0Var = dVar.f40a;
        v0.j jVar = a0.b0.f15w;
        b0Var.getClass();
        Object e10 = b0Var.e(w.p0.f7480g, new a0.z(b0Var, this.f830i, (fc.d) null), this);
        gc.a aVar = gc.a.f2559g;
        if (e10 != aVar) {
            e10 = oVar;
        }
        if (e10 != aVar) {
            e10 = oVar;
        }
        return e10 == aVar ? aVar : oVar;
    }
}
