package s;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class d0 extends hc.i implements oc.e {

    /* renamed from: h, reason: collision with root package name */
    public e0 f6245h;

    /* renamed from: i, reason: collision with root package name */
    public f0 f6246i;

    /* renamed from: j, reason: collision with root package name */
    public long[] f6247j;

    /* renamed from: k, reason: collision with root package name */
    public int f6248k;

    /* renamed from: l, reason: collision with root package name */
    public int f6249l;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f6250m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ f0 f6251n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ e0 f6252o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(f0 f0Var, e0 e0Var, fc.d dVar) {
        super(dVar);
        this.f6251n = f0Var;
        this.f6252o = e0Var;
    }

    @Override // hc.a
    public final fc.d create(Object obj, fc.d dVar) {
        d0 d0Var = new d0(this.f6251n, this.f6252o, dVar);
        d0Var.f6250m = obj;
        return d0Var;
    }

    @Override // oc.e
    public final Object invoke(Object obj, Object obj2) {
        return ((d0) create((wc.f) obj, (fc.d) obj2)).invokeSuspend(ac.o.f277a);
    }

    @Override // hc.a
    public final Object invokeSuspend(Object obj) {
        wc.f fVar;
        f0 f0Var;
        long[] jArr;
        int i10;
        e0 e0Var;
        int i11 = this.f6249l;
        if (i11 == 0) {
            v6.a.W(obj);
            fVar = (wc.f) this.f6250m;
            f0Var = this.f6251n;
            c0 c0Var = f0Var.f6262h;
            jArr = c0Var.f6235c;
            i10 = c0Var.f6237e;
            e0Var = this.f6252o;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i10 = this.f6248k;
            jArr = this.f6247j;
            f0Var = this.f6246i;
            e0Var = this.f6245h;
            fVar = (wc.f) this.f6250m;
            v6.a.W(obj);
        }
        if (i10 == Integer.MAX_VALUE) {
            return ac.o.f277a;
        }
        int i12 = (int) ((jArr[i10] >> 31) & 2147483647L);
        e0Var.f6255h = i10;
        Object obj2 = f0Var.f6262h.f6234b[i10];
        this.f6250m = fVar;
        this.f6245h = e0Var;
        this.f6246i = f0Var;
        this.f6247j = jArr;
        this.f6248k = i12;
        this.f6249l = 1;
        fVar.b(obj2, this);
        return gc.a.f2559g;
    }
}
