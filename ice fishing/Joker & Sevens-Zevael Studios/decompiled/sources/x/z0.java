package x;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class z0 {

    /* renamed from: a, reason: collision with root package name */
    public t0 f7951a;

    /* renamed from: b, reason: collision with root package name */
    public w.w0 f7952b;

    /* renamed from: c, reason: collision with root package name */
    public k f7953c;

    /* renamed from: d, reason: collision with root package name */
    public e0 f7954d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f7955e;

    /* renamed from: f, reason: collision with root package name */
    public x4.i f7956f;

    /* renamed from: g, reason: collision with root package name */
    public int f7957g = 1;

    /* renamed from: h, reason: collision with root package name */
    public i0 f7958h = androidx.compose.foundation.gestures.a.f520a;

    /* renamed from: i, reason: collision with root package name */
    public final x0 f7959i = new x0(this);

    /* renamed from: j, reason: collision with root package name */
    public final wc.i f7960j = new wc.i(2, this);

    public z0(t0 t0Var, w.w0 w0Var, k kVar, e0 e0Var, boolean z10, x4.i iVar) {
        this.f7951a = t0Var;
        this.f7952b = w0Var;
        this.f7953c = kVar;
        this.f7954d = e0Var;
        this.f7955e = z10;
        this.f7956f = iVar;
    }

    public static final long a(z0 z0Var, i0 i0Var, long j3, int i10) {
        q1.e eVar = (q1.e) z0Var.f7956f.f8303a;
        q1.e eVar2 = null;
        q1.e eVar3 = (eVar == null || !eVar.f8456t) ? null : (q1.e) x1.f.k(eVar);
        long v02 = eVar3 != null ? eVar3.v0(i10, j3) : 0L;
        long f10 = e1.b.f(j3, v02);
        long d10 = z0Var.d(z0Var.g(i0Var.a(z0Var.f(z0Var.d(e1.b.a(z0Var.f7954d == e0.f7770h ? 1 : 2, f10))))));
        long f11 = e1.b.f(f10, d10);
        q1.e eVar4 = (q1.e) z0Var.f7956f.f8303a;
        if (eVar4 != null && eVar4.f8456t) {
            eVar2 = (q1.e) x1.f.k(eVar4);
        }
        q1.e eVar5 = eVar2;
        return e1.b.g(e1.b.g(v02, d10), eVar5 != null ? eVar5.t0(d10, f11, i10) : 0L);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(long j3, hc.c cVar) {
        u0 u0Var;
        int i10;
        pc.r rVar;
        if (cVar instanceof u0) {
            u0Var = (u0) cVar;
            int i11 = u0Var.f7912j;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                u0Var.f7912j = i11 - Integer.MIN_VALUE;
                Object obj = u0Var.f7910h;
                i10 = u0Var.f7912j;
                if (i10 != 0) {
                    v6.a.W(obj);
                    pc.r rVar2 = new pc.r();
                    rVar2.f5682g = j3;
                    oc.e w0Var = new w0(this, rVar2, j3, null);
                    u0Var.f7909g = rVar2;
                    u0Var.f7912j = 1;
                    Object e10 = e(w.p0.f7480g, w0Var, u0Var);
                    Object obj2 = gc.a.f2559g;
                    if (e10 == obj2) {
                        return obj2;
                    }
                    rVar = rVar2;
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    rVar = u0Var.f7909g;
                    v6.a.W(obj);
                }
                return new s2.p(rVar.f5682g);
            }
        }
        u0Var = new u0(this, cVar);
        Object obj3 = u0Var.f7910h;
        i10 = u0Var.f7912j;
        if (i10 != 0) {
        }
        return new s2.p(rVar.f5682g);
    }

    public final float c(float f10) {
        return this.f7955e ? f10 * (-1) : f10;
    }

    public final long d(long j3) {
        return this.f7955e ? e1.b.h(j3, -1.0f) : j3;
    }

    public final Object e(w.p0 p0Var, oc.e eVar, hc.c cVar) {
        Object e10 = this.f7951a.e(p0Var, new c0.c(this, eVar, (fc.d) null), cVar);
        return e10 == gc.a.f2559g ? e10 : ac.o.f277a;
    }

    public final float f(long j3) {
        return this.f7954d == e0.f7770h ? e1.b.d(j3) : e1.b.e(j3);
    }

    public final long g(float f10) {
        if (f10 == 0.0f) {
            return 0L;
        }
        return this.f7954d == e0.f7770h ? v6.a.h(f10, 0.0f) : v6.a.h(0.0f, f10);
    }
}
