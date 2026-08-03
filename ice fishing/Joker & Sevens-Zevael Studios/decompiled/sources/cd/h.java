package cd;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class h extends hc.j implements oc.e {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f1352g = 1;

    /* renamed from: h, reason: collision with root package name */
    public int f1353h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f1354i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ k f1355j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ bd.f f1356k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(k kVar, bd.f fVar, fc.d dVar) {
        super(2, dVar);
        this.f1355j = kVar;
        this.f1356k = fVar;
    }

    @Override // hc.a
    public final fc.d create(Object obj, fc.d dVar) {
        switch (this.f1352g) {
            case 0:
                return new h(this.f1355j, this.f1356k, this.f1354i, dVar);
            default:
                h hVar = new h(this.f1355j, this.f1356k, dVar);
                hVar.f1354i = obj;
                return hVar;
        }
    }

    @Override // oc.e
    public final Object invoke(Object obj, Object obj2) {
        yc.y yVar = (yc.y) obj;
        fc.d dVar = (fc.d) obj2;
        switch (this.f1352g) {
        }
        return ((h) create(yVar, dVar)).invokeSuspend(ac.o.f277a);
    }

    /* JADX WARN: Type inference failed for: r9v2, types: [hc.j, oc.f] */
    @Override // hc.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f1352g) {
            case 0:
                int i10 = this.f1353h;
                if (i10 == 0) {
                    v6.a.W(obj);
                    ?? r92 = this.f1355j.f1367k;
                    Object obj2 = this.f1354i;
                    this.f1353h = 1;
                    Object b2 = r92.b(this.f1356k, obj2, this);
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
                int i11 = this.f1353h;
                if (i11 == 0) {
                    v6.a.W(obj);
                    yc.y yVar = (yc.y) this.f1354i;
                    pc.s sVar = new pc.s();
                    k kVar = this.f1355j;
                    bd.e eVar = kVar.f1351j;
                    j jVar = new j(sVar, yVar, kVar, this.f1356k, 0);
                    this.f1353h = 1;
                    Object c3 = eVar.c(jVar, this);
                    gc.a aVar2 = gc.a.f2559g;
                    if (c3 == aVar2) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(k kVar, bd.f fVar, Object obj, fc.d dVar) {
        super(2, dVar);
        this.f1355j = kVar;
        this.f1356k = fVar;
        this.f1354i = obj;
    }
}
