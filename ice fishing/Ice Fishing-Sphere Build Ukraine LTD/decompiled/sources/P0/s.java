package P0;

/* loaded from: classes.dex */
public final class s implements v0.d, x0.c {

    /* renamed from: e, reason: collision with root package name */
    public final v0.d f861e;

    /* renamed from: f, reason: collision with root package name */
    public final v0.i f862f;

    public s(v0.d dVar, v0.i iVar) {
        this.f861e = dVar;
        this.f862f = iVar;
    }

    @Override // v0.d
    public final void c(Object obj) {
        this.f861e.c(obj);
    }

    @Override // x0.c
    public final x0.c h() {
        v0.d dVar = this.f861e;
        if (dVar instanceof x0.c) {
            return (x0.c) dVar;
        }
        return null;
    }

    @Override // v0.d
    public final v0.i j() {
        return this.f862f;
    }
}
