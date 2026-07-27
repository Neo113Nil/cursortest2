package c0;

/* loaded from: classes.dex */
public final class q implements io.flutter.embedding.engine.renderer.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ io.flutter.embedding.engine.renderer.h f1722a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ androidx.lifecycle.k f1723b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r f1724c;

    public q(r rVar, io.flutter.embedding.engine.renderer.h hVar, androidx.lifecycle.k kVar) {
        this.f1724c = rVar;
        this.f1722a = hVar;
        this.f1723b = kVar;
    }

    @Override // io.flutter.embedding.engine.renderer.i
    public final void a() {
        C0108j c0108j;
        this.f1722a.c(this);
        this.f1723b.run();
        r rVar = this.f1724c;
        if ((rVar.f1736j instanceof C0108j) || (c0108j = rVar.f1735i) == null) {
            return;
        }
        c0108j.d();
        C0108j c0108j2 = rVar.f1735i;
        if (c0108j2 != null) {
            c0108j2.f1702f.close();
            rVar.removeView(rVar.f1735i);
            rVar.f1735i = null;
        }
    }

    @Override // io.flutter.embedding.engine.renderer.i
    public final void b() {
    }
}
