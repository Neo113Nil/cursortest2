package x;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class w0 extends hc.j implements oc.e {

    /* renamed from: g, reason: collision with root package name */
    public z0 f7921g;

    /* renamed from: h, reason: collision with root package name */
    public pc.r f7922h;

    /* renamed from: i, reason: collision with root package name */
    public long f7923i;

    /* renamed from: j, reason: collision with root package name */
    public int f7924j;

    /* renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f7925k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ z0 f7926l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ pc.r f7927m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ long f7928n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(z0 z0Var, pc.r rVar, long j3, fc.d dVar) {
        super(2, dVar);
        this.f7926l = z0Var;
        this.f7927m = rVar;
        this.f7928n = j3;
    }

    @Override // hc.a
    public final fc.d create(Object obj, fc.d dVar) {
        w0 w0Var = new w0(this.f7926l, this.f7927m, this.f7928n, dVar);
        w0Var.f7925k = obj;
        return w0Var;
    }

    @Override // oc.e
    public final Object invoke(Object obj, Object obj2) {
        return ((w0) create((x0) obj, (fc.d) obj2)).invokeSuspend(ac.o.f277a);
    }

    @Override // hc.a
    public final Object invokeSuspend(Object obj) {
        z0 z0Var;
        pc.r rVar;
        long j3;
        z0 z0Var2;
        int i10 = this.f7924j;
        e0 e0Var = e0.f7770h;
        if (i10 == 0) {
            v6.a.W(obj);
            x0 x0Var = (x0) this.f7925k;
            z0Var = this.f7926l;
            v0 v0Var = new v0(z0Var, x0Var);
            k kVar = z0Var.f7953c;
            pc.r rVar2 = this.f7927m;
            long j6 = rVar2.f5682g;
            e0 e0Var2 = z0Var.f7954d;
            long j10 = this.f7928n;
            float c3 = z0Var.c(e0Var2 == e0Var ? s2.p.b(j10) : s2.p.c(j10));
            this.f7925k = z0Var;
            this.f7921g = z0Var;
            this.f7922h = rVar2;
            this.f7923i = j6;
            this.f7924j = 1;
            kVar.getClass();
            obj = yc.a0.A(kVar.f7835b, new j(c3, kVar, v0Var, null), this);
            gc.a aVar = gc.a.f2559g;
            if (obj == aVar) {
                return aVar;
            }
            rVar = rVar2;
            j3 = j6;
            z0Var2 = z0Var;
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j3 = this.f7923i;
            rVar = this.f7922h;
            z0Var = this.f7921g;
            z0Var2 = (z0) this.f7925k;
            v6.a.W(obj);
        }
        float c7 = z0Var2.c(((Number) obj).floatValue());
        rVar.f5682g = z0Var.f7954d == e0Var ? s2.p.a(j3, c7, 0.0f, 2) : s2.p.a(j3, 0.0f, c7, 1);
        return ac.o.f277a;
    }
}
