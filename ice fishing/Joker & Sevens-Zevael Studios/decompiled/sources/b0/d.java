package b0;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class d implements y0.l {

    /* renamed from: a, reason: collision with root package name */
    public boolean f811a;

    /* renamed from: b, reason: collision with root package name */
    public fc.k f812b;

    /* JADX WARN: Removed duplicated region for block: B:11:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(hc.c cVar) {
        c cVar2;
        int i10;
        fc.k kVar;
        if (cVar instanceof c) {
            cVar2 = (c) cVar;
            int i11 = cVar2.f810j;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                cVar2.f810j = i11 - Integer.MIN_VALUE;
                Object obj = cVar2.f808h;
                i10 = cVar2.f810j;
                ac.o oVar = ac.o.f277a;
                if (i10 != 0) {
                    v6.a.W(obj);
                    if (!this.f811a) {
                        fc.k kVar2 = this.f812b;
                        cVar2.f807g = kVar2;
                        cVar2.f810j = 1;
                        fc.k kVar3 = new fc.k(bc.a0.w(cVar2), gc.a.f2560h);
                        this.f812b = kVar3;
                        Object a6 = kVar3.a();
                        gc.a aVar = gc.a.f2559g;
                        if (a6 == aVar) {
                            return aVar;
                        }
                        kVar = kVar2;
                    }
                    return oVar;
                }
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kVar = cVar2.f807g;
                v6.a.W(obj);
                if (kVar != null) {
                    kVar.resumeWith(oVar);
                }
                return oVar;
            }
        }
        cVar2 = new c(this, cVar);
        Object obj2 = cVar2.f808h;
        i10 = cVar2.f810j;
        ac.o oVar2 = ac.o.f277a;
        if (i10 != 0) {
        }
        if (kVar != null) {
        }
        return oVar2;
    }
}
