package defpackage;

/* loaded from: classes3.dex */
public final class prc implements d7o {
    public final /* synthetic */ int a;
    public final pjc b;

    public prc(s6o s6oVar) {
        this.a = 3;
        jyr jyrVar = s6oVar.a;
        pjc b0 = zsd.b0(new h0m(((frt) jyrVar.getValue()).g(), 29));
        int i = 0;
        pjc b02 = zsd.b0(new p6o(((frt) jyrVar.getValue()).j(), i));
        jyr jyrVar2 = p6m.f;
        this.b = new f9l(11, new p6o(zsd.b0(zsd.R(b0, b02, zsd.b0(new p6o(o6m.e() ? ((j6m) ((d6m) s6oVar.b.getValue())).j : ydr.a(t6m.a), 1)), s6oVar.d, ((oq7) s6oVar.c.getValue()).a.c, new r6o(s6oVar, null, i))), 2));
    }

    @Override // defpackage.d7o
    public final pjc a() {
        switch (this.a) {
            case 0:
                return (fs) this.b;
            case 1:
                return (fs) this.b;
            case 2:
                return (fs) this.b;
            default:
                return (f9l) this.b;
        }
    }

    public prc(z66 z66Var) {
        this.a = 1;
        this.b = new fs(20, new ifd(zsd.b0(new ifd(z66Var.c(), 6)), 5));
    }

    public prc(lrc lrcVar) {
        this.a = 0;
        this.b = new fs(16, new bca(zsd.b0(new bca(frc.a.g, 20)), 21));
    }

    public prc(frt frtVar) {
        this.a = 2;
        this.b = new fs(21, new ifd(zsd.b0(new ifd(frtVar.g(), 25)), 24));
    }
}
