package O1;

/* loaded from: classes.dex */
public final class c implements f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d f847a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ D1.n f848b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f f849c;

    public c(d dVar, D1.n nVar, f fVar) {
        this.f847a = dVar;
        this.f848b = nVar;
        this.f849c = fVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // O1.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Object obj, v1.d dVar) {
        b bVar;
        int i;
        if (dVar instanceof b) {
            bVar = (b) dVar;
            int i2 = bVar.f846f;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bVar.f846f = i2 - Integer.MIN_VALUE;
                Object obj2 = bVar.f845d;
                w1.a aVar = w1.a.f4662a;
                i = bVar.f846f;
                t1.i iVar = t1.i.f4388c;
                if (i != 0) {
                    h0.f.D(obj2);
                    this.f847a.getClass();
                    D1.n nVar = this.f848b;
                    Object obj3 = nVar.f170b;
                    if (obj3 != P1.b.f915b && ((Boolean) g.f851b.d(obj3, obj)).booleanValue()) {
                        return iVar;
                    }
                    nVar.f170b = obj;
                    bVar.f846f = 1;
                    if (this.f849c.a(obj, bVar) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h0.f.D(obj2);
                }
                return iVar;
            }
        }
        bVar = new b(this, dVar);
        Object obj22 = bVar.f845d;
        w1.a aVar2 = w1.a.f4662a;
        i = bVar.f846f;
        t1.i iVar2 = t1.i.f4388c;
        if (i != 0) {
        }
        return iVar2;
    }
}
