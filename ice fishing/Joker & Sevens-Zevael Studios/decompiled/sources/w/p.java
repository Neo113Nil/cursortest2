package w;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class p extends hc.j implements oc.f {

    /* renamed from: g, reason: collision with root package name */
    public int f7476g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ x.h0 f7477h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ long f7478i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ q f7479j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(q qVar, fc.d dVar) {
        super(3, dVar);
        this.f7479j = qVar;
    }

    @Override // oc.f
    public final Object b(Object obj, Object obj2, Object obj3) {
        long j3 = ((e1.b) obj2).f1929a;
        p pVar = new p(this.f7479j, (fc.d) obj3);
        pVar.f7477h = (x.h0) obj;
        pVar.f7478i = j3;
        return pVar.invokeSuspend(ac.o.f277a);
    }

    @Override // hc.a
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        int i10 = this.f7476g;
        ac.o oVar = ac.o.f277a;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            v6.a.W(obj);
            return oVar;
        }
        v6.a.W(obj);
        x.h0 h0Var = this.f7477h;
        long j3 = this.f7478i;
        q qVar = this.f7479j;
        if (qVar.f7486z) {
            this.f7476g = 1;
            y.i iVar = qVar.f7483w;
            gc.a aVar = gc.a.f2559g;
            if (iVar == null || (obj2 = yc.a0.e(new b(h0Var, j3, iVar, qVar, null), this)) != aVar) {
                obj2 = oVar;
            }
            if (obj2 == aVar) {
                return aVar;
            }
        }
        return oVar;
    }
}
