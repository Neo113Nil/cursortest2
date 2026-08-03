package x;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class y0 extends hc.j implements oc.e {

    /* renamed from: g, reason: collision with root package name */
    public long f7941g;

    /* renamed from: h, reason: collision with root package name */
    public int f7942h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ long f7943i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ z0 f7944j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(z0 z0Var, fc.d dVar) {
        super(2, dVar);
        this.f7944j = z0Var;
    }

    @Override // hc.a
    public final fc.d create(Object obj, fc.d dVar) {
        y0 y0Var = new y0(this.f7944j, dVar);
        y0Var.f7943i = ((s2.p) obj).f6404a;
        return y0Var;
    }

    @Override // oc.e
    public final Object invoke(Object obj, Object obj2) {
        long j3 = ((s2.p) obj).f6404a;
        y0 y0Var = new y0(this.f7944j, (fc.d) obj2);
        y0Var.f7943i = j3;
        return y0Var.invokeSuspend(ac.o.f277a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x003e, code lost:
    
        if (r15 == r5) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006f  */
    @Override // hc.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        long j3;
        long j6;
        long j10;
        long j11;
        int i10 = this.f7942h;
        z0 z0Var = this.f7944j;
        gc.a aVar = gc.a.f2559g;
        if (i10 == 0) {
            v6.a.W(obj);
            j3 = this.f7943i;
            x4.i iVar = z0Var.f7956f;
            this.f7943i = j3;
            this.f7942h = 1;
            obj = iVar.b(j3, this);
        } else {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    j11 = this.f7941g;
                    j10 = this.f7943i;
                    v6.a.W(obj);
                    return new s2.p(s2.p.d(j10, s2.p.d(j11, ((s2.p) obj).f6404a)));
                }
                j6 = this.f7941g;
                j3 = this.f7943i;
                v6.a.W(obj);
                long j12 = ((s2.p) obj).f6404a;
                x4.i iVar2 = z0Var.f7956f;
                long d10 = s2.p.d(j6, j12);
                this.f7943i = j3;
                this.f7941g = j12;
                this.f7942h = 3;
                obj = iVar2.a(d10, j12, this);
                if (obj != aVar) {
                    j10 = j3;
                    j11 = j12;
                    return new s2.p(s2.p.d(j10, s2.p.d(j11, ((s2.p) obj).f6404a)));
                }
                return aVar;
            }
            j3 = this.f7943i;
            v6.a.W(obj);
        }
        long d11 = s2.p.d(j3, ((s2.p) obj).f6404a);
        this.f7943i = j3;
        this.f7941g = d11;
        this.f7942h = 2;
        obj = z0Var.b(d11, this);
        if (obj != aVar) {
            j6 = d11;
            long j122 = ((s2.p) obj).f6404a;
            x4.i iVar22 = z0Var.f7956f;
            long d102 = s2.p.d(j6, j122);
            this.f7943i = j3;
            this.f7941g = j122;
            this.f7942h = 3;
            obj = iVar22.a(d102, j122, this);
            if (obj != aVar) {
            }
        }
        return aVar;
    }
}
