package x;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class f1 extends hc.j implements oc.e {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f7783g;

    /* renamed from: h, reason: collision with root package name */
    public int f7784h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ oc.f f7785i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ h0 f7786j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ r1.n f7787k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f1(oc.f fVar, h0 h0Var, r1.n nVar, fc.d dVar, int i10) {
        super(2, dVar);
        this.f7783g = i10;
        this.f7785i = fVar;
        this.f7786j = h0Var;
        this.f7787k = nVar;
    }

    @Override // hc.a
    public final fc.d create(Object obj, fc.d dVar) {
        switch (this.f7783g) {
            case 0:
                return new f1(this.f7785i, this.f7786j, this.f7787k, dVar, 0);
            default:
                return new f1(this.f7785i, this.f7786j, this.f7787k, dVar, 1);
        }
    }

    @Override // oc.e
    public final Object invoke(Object obj, Object obj2) {
        yc.y yVar = (yc.y) obj;
        fc.d dVar = (fc.d) obj2;
        switch (this.f7783g) {
        }
        return ((f1) create(yVar, dVar)).invokeSuspend(ac.o.f277a);
    }

    @Override // hc.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f7783g) {
            case 0:
                int i10 = this.f7784h;
                if (i10 == 0) {
                    v6.a.W(obj);
                    e1.b bVar = new e1.b(this.f7787k.f5965c);
                    this.f7784h = 1;
                    Object b2 = this.f7785i.b(this.f7786j, bVar, this);
                    gc.a aVar = gc.a.f2559g;
                    if (b2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    v6.a.W(obj);
                }
                return ac.o.f277a;
            default:
                int i11 = this.f7784h;
                if (i11 == 0) {
                    v6.a.W(obj);
                    e1.b bVar2 = new e1.b(this.f7787k.f5965c);
                    this.f7784h = 1;
                    Object b10 = this.f7785i.b(this.f7786j, bVar2, this);
                    gc.a aVar2 = gc.a.f2559g;
                    if (b10 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    v6.a.W(obj);
                }
                return ac.o.f277a;
        }
    }
}
