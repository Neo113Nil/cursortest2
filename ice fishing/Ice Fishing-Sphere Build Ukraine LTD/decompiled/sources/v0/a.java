package v0;

import D0.p;

/* loaded from: classes.dex */
public abstract class a implements g {

    /* renamed from: e, reason: collision with root package name */
    public final h f3009e;

    public a(h hVar) {
        this.f3009e = hVar;
    }

    @Override // v0.i
    public final i f(i iVar) {
        E0.i.e(iVar, "context");
        return iVar == j.f3014e ? this : (i) iVar.m(this, new b(1));
    }

    @Override // v0.i
    public i g(h hVar) {
        return o.g.u(this, hVar);
    }

    @Override // v0.g
    public final h getKey() {
        return this.f3009e;
    }

    @Override // v0.i
    public g i(h hVar) {
        return o.g.m(this, hVar);
    }

    @Override // v0.i
    public final Object m(Object obj, p pVar) {
        return pVar.f(obj, this);
    }
}
