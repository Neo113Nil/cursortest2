package v0;

import D0.p;

/* loaded from: classes.dex */
public abstract class a implements g {

    /* renamed from: f, reason: collision with root package name */
    public final h f3004f;

    public a(h hVar) {
        this.f3004f = hVar;
    }

    @Override // v0.i
    public final i f(i iVar) {
        E0.i.e(iVar, "context");
        return iVar == j.f3009f ? this : (i) iVar.m(this, new b(1));
    }

    @Override // v0.i
    public i g(h hVar) {
        return o.g.x(this, hVar);
    }

    @Override // v0.g
    public final h getKey() {
        return this.f3004f;
    }

    @Override // v0.i
    public g i(h hVar) {
        return o.g.p(this, hVar);
    }

    @Override // v0.i
    public final Object m(Object obj, p pVar) {
        return pVar.f(obj, this);
    }
}
