package K0;

/* loaded from: classes.dex */
public final class l0 implements v0.g, v0.h {

    /* renamed from: f, reason: collision with root package name */
    public static final l0 f516f = new l0();

    @Override // v0.i
    public final v0.i f(v0.i iVar) {
        E0.i.e(iVar, "context");
        return iVar == v0.j.f3009f ? this : (v0.i) iVar.m(this, new v0.b(1));
    }

    @Override // v0.i
    public final v0.i g(v0.h hVar) {
        return o.g.x(this, hVar);
    }

    @Override // v0.i
    public final v0.g i(v0.h hVar) {
        return o.g.p(this, hVar);
    }

    @Override // v0.i
    public final Object m(Object obj, D0.p pVar) {
        return pVar.f(obj, this);
    }

    @Override // v0.g
    public final v0.h getKey() {
        return this;
    }
}
