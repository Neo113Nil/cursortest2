package defpackage;

import com.yandex.passport.sloth.ui.dependencies.m;

/* loaded from: classes3.dex */
public final class vka {
    public final wka a;
    public final s62 b;
    public final jyr c;
    public final jyr d;
    public final jyr e;
    public final cca f;
    public final jyr g;
    public final jyr h;
    public final jyr i;
    public final jyr j;
    public final jyr k;
    public final jyr l;
    public final jyr m;
    public final jyr n;
    public final jyr o;
    public final jyr p;
    public final jyr q;

    public vka(jur jurVar, sca scaVar, oga ogaVar, wka wkaVar, s62 s62Var, hvs hvsVar, cur curVar) {
        this.a = wkaVar;
        this.b = s62Var;
        jyr b = btf.b(new bv7(28));
        this.c = b;
        jyr b2 = btf.b(new uka(jurVar, this));
        this.d = b2;
        jyr b3 = btf.b(new bv7(29));
        this.e = b3;
        this.f = new cca(btf.b(new ska(this, 0)), b, b2, btf.b(new ska(this, 1)), wkaVar, hvsVar, curVar, btf.b(new ska(this, 2)), b3);
        this.g = btf.b(new aw5(25, scaVar, this));
        this.h = btf.b(new aw5(26, ogaVar, this));
        this.i = btf.b(new ska(this, 3));
        this.j = btf.b(new ska(this, 4));
        this.k = btf.b(new vd(18, this, jurVar, curVar));
        this.l = btf.b(new ska(this, 6));
        this.m = btf.b(new ska(this, 7));
        this.n = btf.b(new ska(this, 8));
        btf.b(new tka(1, this));
        this.o = btf.b(new ska(this, 9));
        this.p = btf.b(new uka(this, jurVar, 0));
        this.q = btf.b(new uka(this, jurVar, 1));
    }

    public final m a(cq4 cq4Var) {
        wka wkaVar = this.a;
        yka ykaVar = (yka) wkaVar;
        return new m(cq4Var, this.k, this.c, this.d, this.j, this.i, (z66) ykaVar.h.getValue(), (xka) ykaVar.j.getValue(), (xba) this.l.getValue(), new dda(0, wkaVar, wka.class, "isDownloadUnavailableByFreemium", "isDownloadUnavailableByFreemium()Z", 0, 15));
    }
}
