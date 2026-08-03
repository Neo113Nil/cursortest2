package x;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class e1 extends hc.i implements oc.e {

    /* renamed from: h, reason: collision with root package name */
    public int f7772h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f7773i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ yc.y f7774j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ w.p f7775k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ a0.a0 f7776l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ h0 f7777m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(yc.y yVar, w.p pVar, a0.a0 a0Var, h0 h0Var, fc.d dVar) {
        super(dVar);
        this.f7774j = yVar;
        this.f7775k = pVar;
        this.f7776l = a0Var;
        this.f7777m = h0Var;
    }

    @Override // hc.a
    public final fc.d create(Object obj, fc.d dVar) {
        e1 e1Var = new e1(this.f7774j, this.f7775k, this.f7776l, this.f7777m, dVar);
        e1Var.f7773i = obj;
        return e1Var;
    }

    @Override // oc.e
    public final Object invoke(Object obj, Object obj2) {
        return ((e1) create((r1.y) obj, (fc.d) obj2)).invokeSuspend(ac.o.f277a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0062, code lost:
    
        if (r13 == r11) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0064, code lost:
    
        return r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x003f, code lost:
    
        if (r13 == r11) goto L18;
     */
    @Override // hc.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        r1.y yVar;
        int i10 = this.f7772h;
        yc.y yVar2 = this.f7774j;
        h0 h0Var = this.f7777m;
        gc.a aVar = gc.a.f2559g;
        if (i10 == 0) {
            v6.a.W(obj);
            yVar = (r1.y) this.f7773i;
            yc.a0.q(yVar2, null, new c1(h0Var, null, 0), 3);
            this.f7773i = yVar;
            this.f7772h = 1;
            obj = k1.b(yVar, (r3 & 1) != 0, r1.h.f5957h, this);
        } else {
            if (i10 != 1) {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                v6.a.W(obj);
                r1.n nVar = (r1.n) obj;
                if (nVar == null) {
                    yc.a0.q(yVar2, null, new d1(h0Var, null, 0), 3);
                } else {
                    nVar.a();
                    yc.a0.q(yVar2, null, new d1(h0Var, null, 1), 3);
                    w.q qVar = (w.q) this.f7776l.f6h;
                    if (qVar.f7486z) {
                        qVar.A.invoke();
                    }
                }
                return ac.o.f277a;
            }
            yVar = (r1.y) this.f7773i;
            v6.a.W(obj);
        }
        r1.n nVar2 = (r1.n) obj;
        nVar2.a();
        a0 a0Var = k1.f7836a;
        w.p pVar = this.f7775k;
        if (pVar != a0Var) {
            yc.a0.q(yVar2, null, new c0.c(pVar, h0Var, nVar2, null, 13), 3);
        }
        this.f7773i = null;
        this.f7772h = 2;
        obj = k1.d(yVar, r1.h.f5957h, this);
    }
}
