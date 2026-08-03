package w;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class d extends hc.j implements oc.e {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f7399g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ q f7400h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(q qVar, fc.d dVar, int i10) {
        super(2, dVar);
        this.f7399g = i10;
        this.f7400h = qVar;
    }

    @Override // hc.a
    public final fc.d create(Object obj, fc.d dVar) {
        switch (this.f7399g) {
            case 0:
                return new d(this.f7400h, dVar, 0);
            default:
                return new d(this.f7400h, dVar, 1);
        }
    }

    @Override // oc.e
    public final Object invoke(Object obj, Object obj2) {
        yc.y yVar = (yc.y) obj;
        fc.d dVar = (fc.d) obj2;
        switch (this.f7399g) {
            case 0:
                d dVar2 = (d) create(yVar, dVar);
                ac.o oVar = ac.o.f277a;
                dVar2.invokeSuspend(oVar);
                return oVar;
            default:
                d dVar3 = (d) create(yVar, dVar);
                ac.o oVar2 = ac.o.f277a;
                dVar3.invokeSuspend(oVar2);
                return oVar2;
        }
    }

    @Override // hc.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f7399g) {
            case 0:
                v6.a.W(obj);
                q qVar = this.f7400h;
                if (qVar.G == null) {
                    y.f fVar = new y.f();
                    y.i iVar = qVar.f7483w;
                    if (iVar != null) {
                        yc.a0.q(qVar.f0(), null, new c0.d(iVar, fVar, null, 9), 3);
                    }
                    qVar.G = fVar;
                }
                break;
            default:
                v6.a.W(obj);
                q qVar2 = this.f7400h;
                y.f fVar2 = qVar2.G;
                if (fVar2 != null) {
                    y.g gVar = new y.g(fVar2);
                    y.i iVar2 = qVar2.f7483w;
                    fc.d dVar = null;
                    if (iVar2 != null) {
                        yc.a0.q(qVar2.f0(), null, new c0.d(iVar2, gVar, dVar, 10), 3);
                    }
                    qVar2.G = null;
                }
                break;
        }
        return ac.o.f277a;
    }
}
