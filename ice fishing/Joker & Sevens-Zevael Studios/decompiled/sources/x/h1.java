package x;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class h1 extends hc.i implements oc.e {

    /* renamed from: h, reason: collision with root package name */
    public int f7802h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f7803i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ yc.y f7804j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ pc.s f7805k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ h0 f7806l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(yc.y yVar, pc.s sVar, h0 h0Var, fc.d dVar) {
        super(dVar);
        this.f7804j = yVar;
        this.f7805k = sVar;
        this.f7806l = h0Var;
    }

    @Override // hc.a
    public final fc.d create(Object obj, fc.d dVar) {
        h1 h1Var = new h1(this.f7804j, this.f7805k, this.f7806l, dVar);
        h1Var.f7803i = obj;
        return h1Var;
    }

    @Override // oc.e
    public final Object invoke(Object obj, Object obj2) {
        return ((h1) create((r1.y) obj, (fc.d) obj2)).invokeSuspend(ac.o.f277a);
    }

    @Override // hc.a
    public final Object invokeSuspend(Object obj) {
        int i10 = this.f7802h;
        if (i10 == 0) {
            v6.a.W(obj);
            r1.y yVar = (r1.y) this.f7803i;
            this.f7802h = 1;
            obj = k1.d(yVar, r1.h.f5957h, this);
            gc.a aVar = gc.a.f2559g;
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            v6.a.W(obj);
        }
        r1.n nVar = (r1.n) obj;
        yc.y yVar2 = this.f7804j;
        h0 h0Var = this.f7806l;
        if (nVar == null) {
            yc.a0.q(yVar2, null, new d1(h0Var, null, 7), 3);
            return null;
        }
        nVar.a();
        yc.a0.q(yVar2, null, new d1(h0Var, null, 6), 3);
        throw null;
    }
}
