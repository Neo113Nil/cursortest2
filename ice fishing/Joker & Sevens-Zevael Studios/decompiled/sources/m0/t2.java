package m0;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class t2 extends hc.j implements oc.e {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f4770g;

    /* renamed from: h, reason: collision with root package name */
    public int f4771h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f4772i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ oc.e f4773j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ d1 f4774k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t2(oc.e eVar, d1 d1Var, fc.d dVar, int i10) {
        super(2, dVar);
        this.f4770g = i10;
        this.f4773j = eVar;
        this.f4774k = d1Var;
    }

    @Override // hc.a
    public final fc.d create(Object obj, fc.d dVar) {
        switch (this.f4770g) {
            case 0:
                t2 t2Var = new t2(this.f4773j, this.f4774k, dVar, 0);
                t2Var.f4772i = obj;
                return t2Var;
            default:
                t2 t2Var2 = new t2(this.f4773j, this.f4774k, dVar, 1);
                t2Var2.f4772i = obj;
                return t2Var2;
        }
    }

    @Override // oc.e
    public final Object invoke(Object obj, Object obj2) {
        yc.y yVar = (yc.y) obj;
        fc.d dVar = (fc.d) obj2;
        switch (this.f4770g) {
        }
        return ((t2) create(yVar, dVar)).invokeSuspend(ac.o.f277a);
    }

    @Override // hc.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f4770g) {
            case 0:
                int i10 = this.f4771h;
                if (i10 == 0) {
                    v6.a.W(obj);
                    t1 t1Var = new t1(this.f4774k, ((yc.y) this.f4772i).f());
                    this.f4771h = 1;
                    Object invoke = this.f4773j.invoke(t1Var, this);
                    gc.a aVar = gc.a.f2559g;
                    if (invoke == aVar) {
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
                int i11 = this.f4771h;
                if (i11 == 0) {
                    v6.a.W(obj);
                    t1 t1Var2 = new t1(this.f4774k, ((yc.y) this.f4772i).f());
                    this.f4771h = 1;
                    Object invoke2 = this.f4773j.invoke(t1Var2, this);
                    gc.a aVar2 = gc.a.f2559g;
                    if (invoke2 == aVar2) {
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
