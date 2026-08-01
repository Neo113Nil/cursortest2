package v1;

import C1.p;

/* loaded from: classes.dex */
public abstract class a implements g {

    /* renamed from: a, reason: collision with root package name */
    public final h f4490a;

    public a(h hVar) {
        this.f4490a = hVar;
    }

    @Override // v1.i
    public i c(h hVar) {
        return h0.f.t(this, hVar);
    }

    @Override // v1.i
    public final Object d(Object obj, p pVar) {
        return pVar.d(obj, this);
    }

    @Override // v1.i
    public g e(h hVar) {
        return h0.f.m(this, hVar);
    }

    @Override // v1.i
    public final i f(i iVar) {
        return h0.f.v(this, iVar);
    }

    @Override // v1.g
    public final h getKey() {
        return this.f4490a;
    }
}
