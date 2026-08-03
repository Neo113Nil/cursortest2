package w;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class c extends hc.j implements oc.e {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f7390g;

    /* renamed from: h, reason: collision with root package name */
    public int f7391h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ q f7392i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ y.k f7393j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(q qVar, y.k kVar, fc.d dVar, int i10) {
        super(2, dVar);
        this.f7390g = i10;
        this.f7392i = qVar;
        this.f7393j = kVar;
    }

    @Override // hc.a
    public final fc.d create(Object obj, fc.d dVar) {
        switch (this.f7390g) {
            case 0:
                return new c(this.f7392i, this.f7393j, dVar, 0);
            default:
                return new c(this.f7392i, this.f7393j, dVar, 1);
        }
    }

    @Override // oc.e
    public final Object invoke(Object obj, Object obj2) {
        yc.y yVar = (yc.y) obj;
        fc.d dVar = (fc.d) obj2;
        switch (this.f7390g) {
        }
        return ((c) create(yVar, dVar)).invokeSuspend(ac.o.f277a);
    }

    @Override // hc.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f7390g) {
            case 0:
                int i10 = this.f7391h;
                if (i10 == 0) {
                    v6.a.W(obj);
                    y.i iVar = this.f7392i.f7483w;
                    if (iVar != null) {
                        this.f7391h = 1;
                        Object a6 = iVar.a(this.f7393j, this);
                        gc.a aVar = gc.a.f2559g;
                        if (a6 == aVar) {
                            return aVar;
                        }
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    v6.a.W(obj);
                }
                return ac.o.f277a;
            default:
                int i11 = this.f7391h;
                if (i11 == 0) {
                    v6.a.W(obj);
                    y.i iVar2 = this.f7392i.f7483w;
                    if (iVar2 != null) {
                        y.l lVar = new y.l(this.f7393j);
                        this.f7391h = 1;
                        Object a8 = iVar2.a(lVar, this);
                        gc.a aVar2 = gc.a.f2559g;
                        if (a8 == aVar2) {
                            return aVar2;
                        }
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
