package P0;

/* loaded from: classes.dex */
public final class s implements io.flutter.embedding.engine.renderer.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ io.flutter.embedding.engine.renderer.h f1451a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ F0.a f1452b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t f1453c;

    public s(t tVar, io.flutter.embedding.engine.renderer.h hVar, F0.a aVar) {
        this.f1453c = tVar;
        this.f1451a = hVar;
        this.f1452b = aVar;
    }

    @Override // io.flutter.embedding.engine.renderer.i
    public final void b() {
        C0077j c0077j;
        this.f1451a.c(this);
        this.f1452b.run();
        t tVar = this.f1453c;
        if ((tVar.f1460e instanceof C0077j) || (c0077j = tVar.f1459d) == null) {
            return;
        }
        c0077j.c();
        C0077j c0077j2 = tVar.f1459d;
        if (c0077j2 != null) {
            c0077j2.f1429a.close();
            tVar.removeView(tVar.f1459d);
            tVar.f1459d = null;
        }
    }

    @Override // io.flutter.embedding.engine.renderer.i
    public final void a() {
    }
}
