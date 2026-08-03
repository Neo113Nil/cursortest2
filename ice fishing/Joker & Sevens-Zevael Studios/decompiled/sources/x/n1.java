package x;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class n1 {

    /* renamed from: f, reason: collision with root package name */
    public static final v.j f7854f = new v.j(0.0f);

    /* renamed from: a, reason: collision with root package name */
    public final v.j1 f7855a;

    /* renamed from: b, reason: collision with root package name */
    public long f7856b = Long.MIN_VALUE;

    /* renamed from: c, reason: collision with root package name */
    public v.j f7857c = f7854f;

    /* renamed from: d, reason: collision with root package name */
    public boolean f7858d;

    /* renamed from: e, reason: collision with root package name */
    public float f7859e;

    public n1(v.h hVar) {
        this.f7855a = hVar.a(v.i1.f6863a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00b1, code lost:
    
        if (r13 != 0.0f) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00db, code lost:
    
        if (m0.z.p(r1.getContext()).l(r0, r1) == r9) goto L46;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /* JADX WARN: Type inference failed for: r14v0, types: [a0.l] */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v17 */
    /* JADX WARN: Type inference failed for: r14v18 */
    /* JADX WARN: Type inference failed for: r14v2, types: [x.n1] */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Type inference failed for: r1v7, types: [oc.c] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00a9 -> B:24:0x00ac). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(a0.r rVar, a0.l lVar, hc.c cVar) {
        l1 l1Var;
        int i10;
        l1 l1Var2;
        oc.a aVar;
        a0.r rVar2;
        float f10;
        n1 n1Var;
        oc.a aVar2;
        n1 n1Var2;
        try {
            if (cVar instanceof l1) {
                l1Var = (l1) cVar;
                int i11 = l1Var.f7844m;
                if ((i11 & Integer.MIN_VALUE) != 0) {
                    l1Var.f7844m = i11 - Integer.MIN_VALUE;
                    Object obj = l1Var.f7842k;
                    i10 = l1Var.f7844m;
                    v.j jVar = f7854f;
                    gc.a aVar3 = gc.a.f2559g;
                    if (i10 != 0) {
                        v6.a.W(obj);
                        if (this.f7858d) {
                            throw new IllegalStateException("animateToZero called while previous animation is running");
                        }
                        y0.o oVar = (y0.o) l1Var.getContext().v(y0.c.f8432t);
                        float u10 = oVar != null ? oVar.u() : 1.0f;
                        this.f7858d = true;
                        l1Var2 = l1Var;
                        aVar = lVar;
                        rVar2 = rVar;
                        f10 = u10;
                        n1Var = this;
                        if (Math.abs(n1Var.f7859e) >= 0.01f) {
                            m1 m1Var = new m1(n1Var, f10, rVar2);
                            l1Var2.f7838g = n1Var;
                            l1Var2.f7839h = rVar2;
                            l1Var2.f7840i = aVar;
                            l1Var2.f7841j = f10;
                            l1Var2.f7844m = 1;
                            if (m0.z.p(l1Var2.getContext()).l(m1Var, l1Var2) == aVar3) {
                                return aVar3;
                            }
                            aVar.invoke();
                        }
                        n1 n1Var3 = n1Var;
                        a0.r rVar3 = rVar2;
                        n1 n1Var4 = n1Var3;
                        aVar2 = aVar;
                        if (Math.abs(n1Var4.f7859e) == 0.0f) {
                            n1Var2 = n1Var4;
                            n1Var2.f7856b = Long.MIN_VALUE;
                            n1Var2.f7857c = jVar;
                            n1Var2.f7858d = false;
                            return ac.o.f277a;
                        }
                        b0.l0 l0Var = new b0.l0(19, n1Var4, rVar3);
                        l1Var2.f7838g = n1Var4;
                        l1Var2.f7839h = aVar2;
                        l1Var2.f7840i = null;
                        l1Var2.f7844m = 2;
                        lVar = n1Var4;
                    } else {
                        if (i10 != 1) {
                            if (i10 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            aVar2 = (oc.a) l1Var.f7839h;
                            n1 n1Var5 = l1Var.f7838g;
                            v6.a.W(obj);
                            lVar = n1Var5;
                            aVar2.invoke();
                            n1Var2 = lVar;
                            n1Var2.f7856b = Long.MIN_VALUE;
                            n1Var2.f7857c = jVar;
                            n1Var2.f7858d = false;
                            return ac.o.f277a;
                        }
                        f10 = l1Var.f7841j;
                        oc.a aVar4 = l1Var.f7840i;
                        ?? r12 = (oc.c) l1Var.f7839h;
                        n1 n1Var6 = l1Var.f7838g;
                        try {
                            v6.a.W(obj);
                            l1 l1Var3 = l1Var;
                            aVar = aVar4;
                            rVar2 = r12;
                            l1Var2 = l1Var3;
                            n1Var = n1Var6;
                        } catch (Throwable th) {
                            th = th;
                            lVar = n1Var6;
                            lVar.f7856b = Long.MIN_VALUE;
                            lVar.f7857c = jVar;
                            lVar.f7858d = false;
                            throw th;
                        }
                        try {
                            aVar.invoke();
                        } catch (Throwable th2) {
                            th = th2;
                            lVar = n1Var;
                            lVar.f7856b = Long.MIN_VALUE;
                            lVar.f7857c = jVar;
                            lVar.f7858d = false;
                            throw th;
                        }
                    }
                }
            }
            if (i10 != 0) {
            }
        } catch (Throwable th3) {
            th = th3;
        }
        l1Var = new l1(this, cVar);
        Object obj2 = l1Var.f7842k;
        i10 = l1Var.f7844m;
        v.j jVar2 = f7854f;
        gc.a aVar32 = gc.a.f2559g;
    }
}
