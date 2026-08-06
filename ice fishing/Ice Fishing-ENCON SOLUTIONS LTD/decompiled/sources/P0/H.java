package P0;

/* loaded from: classes.dex */
public final class H implements io.flutter.embedding.engine.renderer.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Runnable f1391a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ J f1392b;

    public H(J j2, Runnable runnable) {
        this.f1392b = j2;
        this.f1391a = runnable;
    }

    @Override // io.flutter.embedding.engine.renderer.i
    public final void b() {
        this.f1391a.run();
        io.flutter.embedding.engine.renderer.h hVar = this.f1392b.f1396b;
        if (hVar != null) {
            hVar.c(this);
        }
    }

    @Override // io.flutter.embedding.engine.renderer.i
    public final void a() {
    }
}
