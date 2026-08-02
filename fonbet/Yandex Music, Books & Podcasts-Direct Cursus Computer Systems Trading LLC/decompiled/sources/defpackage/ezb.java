package defpackage;

/* loaded from: classes3.dex */
public final class ezb implements wyb {
    public static final yyb e = yyb.c;
    public final gzb a;
    public final tf6 b;
    public final xdr c;
    public final fkn d;

    public ezb(frt frtVar, gzb gzbVar) {
        this.a = gzbVar;
        tf6 e2 = gld.e(dm6.b);
        this.b = e2;
        yyb yybVar = e;
        xdr a = ydr.a(yybVar);
        this.c = a;
        bca bcaVar = new bca(frtVar.j(), 17);
        Boolean bool = Boolean.FALSE;
        t7l t7lVar = lbq.a;
        this.d = zsd.F0(new u21(10, a, zsd.F0(bcaVar, e2, t7lVar, bool), new hk4(3, 3, null)), e2, t7lVar, yybVar);
        ox6.B(new ub7(10, frtVar.g(), this), e2, new u58(19, this));
    }

    public final yyb a() {
        return v3g.E((frt) this.a.b.getValue()).f ? yyb.d : (yyb) this.c.getValue();
    }
}
