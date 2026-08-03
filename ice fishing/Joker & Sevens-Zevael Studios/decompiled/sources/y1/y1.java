package y1;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class y1 extends hc.j implements oc.e {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f8724g;

    /* renamed from: h, reason: collision with root package name */
    public int f8725h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ a2 f8726i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y1(a2 a2Var, fc.d dVar, int i10) {
        super(2, dVar);
        this.f8724g = i10;
        this.f8726i = a2Var;
    }

    @Override // hc.a
    public final fc.d create(Object obj, fc.d dVar) {
        switch (this.f8724g) {
            case 0:
                return new y1(this.f8726i, dVar, 0);
            default:
                return new y1(this.f8726i, dVar, 1);
        }
    }

    @Override // oc.e
    public final Object invoke(Object obj, Object obj2) {
        yc.y yVar = (yc.y) obj;
        fc.d dVar = (fc.d) obj2;
        switch (this.f8724g) {
        }
        return ((y1) create(yVar, dVar)).invokeSuspend(ac.o.f277a);
    }

    @Override // hc.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f8724g) {
            case 0:
                int i10 = this.f8725h;
                ac.o oVar = ac.o.f277a;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    v6.a.W(obj);
                    return oVar;
                }
                v6.a.W(obj);
                r rVar = this.f8726i.f8468g;
                this.f8725h = 1;
                Object g8 = rVar.f8642y.g(this);
                gc.a aVar = gc.a.f2559g;
                if (g8 != aVar) {
                    g8 = oVar;
                }
                return g8 == aVar ? aVar : oVar;
            default:
                int i11 = this.f8725h;
                ac.o oVar2 = ac.o.f277a;
                if (i11 != 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    v6.a.W(obj);
                    return oVar2;
                }
                v6.a.W(obj);
                r rVar2 = this.f8726i.f8468g;
                this.f8725h = 1;
                Object c3 = rVar2.f8644z.c(this);
                gc.a aVar2 = gc.a.f2559g;
                if (c3 != aVar2) {
                    c3 = oVar2;
                }
                return c3 == aVar2 ? aVar2 : oVar2;
        }
    }
}
