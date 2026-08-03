package v;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class s implements e {

    /* renamed from: a, reason: collision with root package name */
    public final x4.i f6959a;

    /* renamed from: b, reason: collision with root package name */
    public final x4.s f6960b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f6961c;

    /* renamed from: d, reason: collision with root package name */
    public final n f6962d;

    /* renamed from: e, reason: collision with root package name */
    public final n f6963e;

    /* renamed from: f, reason: collision with root package name */
    public final n f6964f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f6965g;

    /* renamed from: h, reason: collision with root package name */
    public final long f6966h;

    public s(t tVar, x4.s sVar, Object obj, n nVar) {
        m7.g gVar = tVar.f6969a;
        x4.i iVar = new x4.i();
        iVar.f8303a = gVar;
        this.f6959a = iVar;
        this.f6960b = sVar;
        this.f6961c = obj;
        n nVar2 = (n) ((oc.c) sVar.f8356h).invoke(obj);
        this.f6962d = nVar2;
        this.f6963e = d.e(nVar);
        oc.c cVar = (oc.c) sVar.f8357i;
        if (((n) iVar.f8306d) == null) {
            iVar.f8306d = nVar2.c();
        }
        n nVar3 = (n) iVar.f8306d;
        if (nVar3 == null) {
            pc.j.k("targetVector");
            throw null;
        }
        int b2 = nVar3.b();
        int i10 = 0;
        while (i10 < b2) {
            n nVar4 = (n) iVar.f8306d;
            if (nVar4 == null) {
                pc.j.k("targetVector");
                throw null;
            }
            m7.g gVar2 = (m7.g) iVar.f8303a;
            float a6 = nVar2.a(i10);
            float a8 = nVar.a(i10);
            double b10 = ((u.j0) gVar2.f4957h).b(a8);
            double d10 = u.k0.f6613a;
            int i11 = i10;
            nVar4.e(i11, (Math.signum(a8) * ((float) (Math.exp((d10 / (d10 - 1.0d)) * b10) * r13.f6609a * r13.f6610b))) + a6);
            i10 = i11 + 1;
        }
        n nVar5 = (n) iVar.f8306d;
        if (nVar5 == null) {
            pc.j.k("targetVector");
            throw null;
        }
        this.f6965g = cVar.invoke(nVar5);
        x4.i iVar2 = this.f6959a;
        n nVar6 = this.f6962d;
        if (((n) iVar2.f8305c) == null) {
            iVar2.f8305c = nVar6.c();
        }
        n nVar7 = (n) iVar2.f8305c;
        if (nVar7 == null) {
            pc.j.k("velocityVector");
            throw null;
        }
        int b11 = nVar7.b();
        long j3 = 0;
        for (int i12 = 0; i12 < b11; i12++) {
            m7.g gVar3 = (m7.g) iVar2.f8303a;
            nVar6.getClass();
            j3 = Math.max(j3, ((long) (Math.exp(((u.j0) gVar3.f4957h).b(nVar.a(i12)) / (u.k0.f6613a - 1.0d)) * 1000.0d)) * 1000000);
        }
        this.f6966h = j3;
        n e10 = d.e(this.f6959a.d(j3, this.f6962d, nVar));
        this.f6964f = e10;
        int b12 = e10.b();
        for (int i13 = 0; i13 < b12; i13++) {
            n nVar8 = this.f6964f;
            float a10 = nVar8.a(i13);
            this.f6959a.getClass();
            this.f6959a.getClass();
            nVar8.e(i13, uc.e.g(a10, -0.0f, 0.0f));
        }
    }

    @Override // v.e
    public final boolean a() {
        return false;
    }

    @Override // v.e
    public final Object b(long j3) {
        if (g(j3)) {
            return this.f6965g;
        }
        oc.c cVar = (oc.c) this.f6960b.f8357i;
        x4.i iVar = this.f6959a;
        n nVar = (n) iVar.f8304b;
        n nVar2 = this.f6962d;
        if (nVar == null) {
            iVar.f8304b = nVar2.c();
        }
        n nVar3 = (n) iVar.f8304b;
        if (nVar3 == null) {
            pc.j.k("valueVector");
            throw null;
        }
        int b2 = nVar3.b();
        for (int i10 = 0; i10 < b2; i10++) {
            n nVar4 = (n) iVar.f8304b;
            if (nVar4 == null) {
                pc.j.k("valueVector");
                throw null;
            }
            m7.g gVar = (m7.g) iVar.f8303a;
            float a6 = nVar2.a(i10);
            long j6 = j3 / 1000000;
            u.i0 a8 = ((u.j0) gVar.f4957h).a(this.f6963e.a(i10));
            long j10 = a8.f6607c;
            nVar4.e(i10, (Math.signum(a8.f6605a) * a8.f6606b * u.b.a(j10 > 0 ? j6 / j10 : 1.0f).f6561a) + a6);
        }
        n nVar5 = (n) iVar.f8304b;
        if (nVar5 != null) {
            return cVar.invoke(nVar5);
        }
        pc.j.k("valueVector");
        throw null;
    }

    @Override // v.e
    public final long c() {
        return this.f6966h;
    }

    @Override // v.e
    public final x4.s d() {
        return this.f6960b;
    }

    @Override // v.e
    public final Object e() {
        return this.f6965g;
    }

    @Override // v.e
    public final n f(long j3) {
        if (g(j3)) {
            return this.f6964f;
        }
        return this.f6959a.d(j3, this.f6962d, this.f6963e);
    }
}
