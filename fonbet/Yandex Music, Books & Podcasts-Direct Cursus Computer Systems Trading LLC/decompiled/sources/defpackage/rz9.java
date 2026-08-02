package defpackage;

/* loaded from: classes3.dex */
public final class rz9 implements re9 {
    public final /* synthetic */ tz9 a;
    public final /* synthetic */ gc8 b;
    public final /* synthetic */ xzb c;
    public final /* synthetic */ pz9 d;
    public final /* synthetic */ grm e;

    public rz9(tz9 tz9Var, gc8 gc8Var, xzb xzbVar, pz9 pz9Var, grm grmVar) {
        this.a = tz9Var;
        this.b = gc8Var;
        this.c = xzbVar;
        this.d = pz9Var;
        this.e = grmVar;
    }

    @Override // defpackage.re9
    public final void a() {
        qg8.c(this.a.c, this.b, this.c, this.d.y, "video");
    }

    @Override // defpackage.re9
    public final void c(Throwable th) {
        this.b.I(new RuntimeException(su4.o(new StringBuilder("Playback in div with id '"), this.d.t, "' encountered an error:"), th));
        g();
    }

    @Override // defpackage.re9
    public final void d() {
        qg8.c(this.a.c, this.b, this.c, this.d.n, "video");
    }

    @Override // defpackage.re9
    public final void e() {
        qg8.c(this.a.c, this.b, this.c, this.d.j, "video");
    }

    @Override // defpackage.re9
    public final void f() {
        qg8.c(this.a.c, this.b, this.c, this.d.D, "video");
    }

    @Override // defpackage.re9
    public final void g() {
        qg8.c(this.a.c, this.b, this.c, this.d.p, "video");
    }

    @Override // defpackage.re9
    public final void onReady() {
        this.e.setVisibility(4);
    }
}
