package c0;

/* loaded from: classes.dex */
public final class q implements io.flutter.embedding.engine.renderer.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ io.flutter.embedding.engine.renderer.h f1730a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ androidx.lifecycle.k f1731b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r f1732c;

    public q(r rVar, io.flutter.embedding.engine.renderer.h hVar, androidx.lifecycle.k kVar) {
        this.f1732c = rVar;
        this.f1730a = hVar;
        this.f1731b = kVar;
    }

    @Override // io.flutter.embedding.engine.renderer.i
    public final void a() {
        C0108j c0108j;
        this.f1730a.c(this);
        this.f1731b.run();
        r rVar = this.f1732c;
        if ((rVar.f1743i instanceof C0108j) || (c0108j = rVar.f1742h) == null) {
            return;
        }
        c0108j.d();
        C0108j c0108j2 = rVar.f1742h;
        if (c0108j2 != null) {
            c0108j2.f1710e.close();
            rVar.removeView(rVar.f1742h);
            rVar.f1742h = null;
        }
    }

    @Override // io.flutter.embedding.engine.renderer.i
    public final void b() {
    }
}
