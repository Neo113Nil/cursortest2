package cd;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class e extends hc.j implements oc.e {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f1344g;

    /* renamed from: h, reason: collision with root package name */
    public int f1345h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f1346i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ f f1347j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(f fVar, fc.d dVar, int i10) {
        super(2, dVar);
        this.f1344g = i10;
        this.f1347j = fVar;
    }

    @Override // hc.a
    public final fc.d create(Object obj, fc.d dVar) {
        switch (this.f1344g) {
            case 0:
                e eVar = new e(this.f1347j, dVar, 0);
                eVar.f1346i = obj;
                return eVar;
            default:
                e eVar2 = new e(this.f1347j, dVar, 1);
                eVar2.f1346i = obj;
                return eVar2;
        }
    }

    @Override // oc.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f1344g) {
            case 0:
                return ((e) create((ad.r) obj, (fc.d) obj2)).invokeSuspend(ac.o.f277a);
            default:
                return ((e) create((bd.f) obj, (fc.d) obj2)).invokeSuspend(ac.o.f277a);
        }
    }

    @Override // hc.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f1344g) {
            case 0:
                int i10 = this.f1345h;
                ac.o oVar = ac.o.f277a;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    v6.a.W(obj);
                    return oVar;
                }
                v6.a.W(obj);
                ad.r rVar = (ad.r) this.f1346i;
                this.f1345h = 1;
                Object d10 = this.f1347j.d(new z(rVar), this);
                gc.a aVar = gc.a.f2559g;
                if (d10 != aVar) {
                    d10 = oVar;
                }
                return d10 == aVar ? aVar : oVar;
            default:
                int i11 = this.f1345h;
                if (i11 == 0) {
                    v6.a.W(obj);
                    bd.f fVar = (bd.f) this.f1346i;
                    this.f1345h = 1;
                    Object d11 = this.f1347j.d(fVar, this);
                    gc.a aVar2 = gc.a.f2559g;
                    if (d11 == aVar2) {
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
