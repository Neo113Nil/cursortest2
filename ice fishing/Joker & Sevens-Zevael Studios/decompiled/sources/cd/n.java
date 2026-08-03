package cd;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class n implements bd.f {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ad.e f1371g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f1372h;

    public n(ad.e eVar, int i10) {
        this.f1371g = eVar;
        this.f1372h = i10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0051, code lost:
    
        if (yc.a0.D(r0) != r4) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0053, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0048, code lost:
    
        if (r5.f1371g.c(r0, r7) == r4) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // bd.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Object obj, fc.d dVar) {
        m mVar;
        int i10;
        if (dVar instanceof m) {
            mVar = (m) dVar;
            int i11 = mVar.f1370i;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                mVar.f1370i = i11 - Integer.MIN_VALUE;
                Object obj2 = mVar.f1368g;
                i10 = mVar.f1370i;
                gc.a aVar = gc.a.f2559g;
                if (i10 != 0) {
                    v6.a.W(obj2);
                    bc.y yVar = new bc.y(this.f1372h, obj);
                    mVar.f1370i = 1;
                } else {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        v6.a.W(obj2);
                        return ac.o.f277a;
                    }
                    v6.a.W(obj2);
                }
                mVar.f1370i = 2;
            }
        }
        mVar = new m(this, dVar);
        Object obj22 = mVar.f1368g;
        i10 = mVar.f1370i;
        gc.a aVar2 = gc.a.f2559g;
        if (i10 != 0) {
        }
        mVar.f1370i = 2;
    }
}
