package bd;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class j extends hc.j implements oc.f {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f1111g;

    /* renamed from: h, reason: collision with root package name */
    public int f1112h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ f f1113i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f1114j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ hc.j f1115k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(hc.j jVar, fc.d dVar, int i10) {
        super(3, dVar);
        this.f1111g = i10;
        this.f1115k = jVar;
    }

    @Override // oc.f
    public final Object b(Object obj, Object obj2, Object obj3) {
        f fVar = (f) obj;
        switch (this.f1111g) {
            case 0:
                j jVar = new j((o) this.f1115k, (fc.d) obj3, 0);
                jVar.f1113i = fVar;
                jVar.f1114j = obj2;
                return jVar.invokeSuspend(ac.o.f277a);
            default:
                j jVar2 = new j((rd.b0) this.f1115k, (fc.d) obj3, 1);
                jVar2.f1113i = fVar;
                jVar2.f1114j = (Object[]) obj2;
                return jVar2.invokeSuspend(ac.o.f277a);
        }
    }

    @Override // hc.a
    public final Object invokeSuspend(Object obj) {
        f fVar;
        f fVar2;
        switch (this.f1111g) {
            case 0:
                int i10 = this.f1112h;
                gc.a aVar = gc.a.f2559g;
                if (i10 == 0) {
                    v6.a.W(obj);
                    fVar = this.f1113i;
                    Object obj2 = this.f1114j;
                    o oVar = (o) this.f1115k;
                    this.f1113i = fVar;
                    this.f1112h = 1;
                    obj = oVar.invoke(obj2, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        v6.a.W(obj);
                        return ac.o.f277a;
                    }
                    fVar = this.f1113i;
                    v6.a.W(obj);
                }
                this.f1113i = null;
                this.f1112h = 2;
                if (fVar.a(obj, this) == aVar) {
                    return aVar;
                }
                return ac.o.f277a;
            default:
                int i11 = this.f1112h;
                gc.a aVar2 = gc.a.f2559g;
                if (i11 == 0) {
                    v6.a.W(obj);
                    fVar2 = this.f1113i;
                    Object[] objArr = (Object[]) this.f1114j;
                    rd.b0 b0Var = (rd.b0) this.f1115k;
                    Object obj3 = objArr[0];
                    Object obj4 = objArr[1];
                    this.f1113i = fVar2;
                    this.f1112h = 1;
                    obj = b0Var.b(obj3, obj4, this);
                    if (obj == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i11 != 1) {
                        if (i11 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        v6.a.W(obj);
                        return ac.o.f277a;
                    }
                    fVar2 = this.f1113i;
                    v6.a.W(obj);
                }
                this.f1113i = null;
                this.f1112h = 2;
                if (fVar2.a(obj, this) == aVar2) {
                    return aVar2;
                }
                return ac.o.f277a;
        }
    }
}
