package O0;

/* loaded from: classes.dex */
public final class s implements v0.d, x0.c {

    /* renamed from: f, reason: collision with root package name */
    public final v0.d f842f;

    /* renamed from: g, reason: collision with root package name */
    public final v0.i f843g;

    public s(v0.d dVar, v0.i iVar) {
        this.f842f = dVar;
        this.f843g = iVar;
    }

    @Override // v0.d
    public final void c(Object obj) {
        this.f842f.c(obj);
    }

    @Override // x0.c
    public final x0.c h() {
        v0.d dVar = this.f842f;
        if (dVar instanceof x0.c) {
            return (x0.c) dVar;
        }
        return null;
    }

    @Override // v0.d
    public final v0.i j() {
        return this.f843g;
    }
}
