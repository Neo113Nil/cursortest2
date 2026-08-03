package v;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class w0 implements e {

    /* renamed from: a, reason: collision with root package name */
    public final j1 f7004a;

    /* renamed from: b, reason: collision with root package name */
    public final x4.s f7005b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f7006c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f7007d;

    /* renamed from: e, reason: collision with root package name */
    public final n f7008e;

    /* renamed from: f, reason: collision with root package name */
    public final n f7009f;

    /* renamed from: g, reason: collision with root package name */
    public final n f7010g;

    /* renamed from: h, reason: collision with root package name */
    public long f7011h;

    /* renamed from: i, reason: collision with root package name */
    public n f7012i;

    public w0(h hVar, x4.s sVar, Object obj, Object obj2, n nVar) {
        this.f7004a = hVar.a(sVar);
        this.f7005b = sVar;
        this.f7006c = obj2;
        this.f7007d = obj;
        this.f7008e = (n) ((oc.c) sVar.f8356h).invoke(obj);
        oc.c cVar = (oc.c) sVar.f8356h;
        this.f7009f = (n) cVar.invoke(obj2);
        this.f7010g = nVar != null ? d.e(nVar) : ((n) cVar.invoke(obj)).c();
        this.f7011h = -1L;
    }

    @Override // v.e
    public final boolean a() {
        return this.f7004a.a();
    }

    @Override // v.e
    public final Object b(long j3) {
        if (g(j3)) {
            return this.f7006c;
        }
        n k3 = this.f7004a.k(j3, this.f7008e, this.f7009f, this.f7010g);
        int b2 = k3.b();
        for (int i10 = 0; i10 < b2; i10++) {
            if (Float.isNaN(k3.a(i10))) {
                m0.b("AnimationVector cannot contain a NaN. " + k3 + ". Animation: " + this + ", playTimeNanos: " + j3);
            }
        }
        return ((oc.c) this.f7005b.f8357i).invoke(k3);
    }

    @Override // v.e
    public final long c() {
        if (this.f7011h < 0) {
            this.f7011h = this.f7004a.b(this.f7008e, this.f7009f, this.f7010g);
        }
        return this.f7011h;
    }

    @Override // v.e
    public final x4.s d() {
        return this.f7005b;
    }

    @Override // v.e
    public final Object e() {
        return this.f7006c;
    }

    @Override // v.e
    public final n f(long j3) {
        if (!g(j3)) {
            return this.f7004a.p(j3, this.f7008e, this.f7009f, this.f7010g);
        }
        n nVar = this.f7012i;
        if (nVar != null) {
            return nVar;
        }
        n n7 = this.f7004a.n(this.f7008e, this.f7009f, this.f7010g);
        this.f7012i = n7;
        return n7;
    }

    public final String toString() {
        return "TargetBasedAnimation: " + this.f7007d + " -> " + this.f7006c + ",initial velocity: " + this.f7010g + ", duration: " + (c() / 1000000) + " ms,animationSpec: " + this.f7004a;
    }
}
