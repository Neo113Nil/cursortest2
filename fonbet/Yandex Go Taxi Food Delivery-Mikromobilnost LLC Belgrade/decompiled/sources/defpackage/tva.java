package defpackage;

/* loaded from: classes12.dex */
public final class tva implements upc {
    public final /* synthetic */ int a;
    public final /* synthetic */ h55 b;
    public final /* synthetic */ Object c;

    public /* synthetic */ tva(h55 h55Var, Object obj, int i) {
        this.a = i;
        this.b = h55Var;
        this.c = obj;
    }

    @Override // defpackage.sy60
    public final void a() {
        int i = this.a;
        h55 h55Var = this.b;
        switch (i) {
            case 0:
                ((uva) h55Var).r(new qu(9));
                break;
            case 1:
                ((s2p0) h55Var).r(new qu(9));
                break;
            case 2:
                ((kpw0) h55Var).r(new qu(9));
                break;
            default:
                ((yuw0) h55Var).r(new qu(9));
                break;
        }
    }

    @Override // defpackage.upc
    public final void b1() {
        int i = this.a;
        Object obj = this.c;
        h55 h55Var = this.b;
        switch (i) {
            case 0:
                uva uvaVar = (uva) h55Var;
                uvaVar.A((m950) ((pw) uvaVar.F).get(), new sva((rva) obj), new dl1(13, uvaVar));
                break;
            case 1:
                s2p0 s2p0Var = (s2p0) h55Var;
                s2p0Var.A((m950) s2p0Var.F.get(), (r2p0) obj, new p4g0(s2p0Var, 12));
                break;
            case 2:
                kpw0 kpw0Var = (kpw0) h55Var;
                kpw0Var.A((m950) ((yvf0) kpw0Var.L).get(), (String) obj, new p4g0(kpw0Var, 17));
                break;
            default:
                yuw0 yuw0Var = (yuw0) h55Var;
                yuw0Var.A((m950) ((ahu) yuw0Var.M).get(), (String) obj, new p4g0(yuw0Var, 18));
                break;
        }
    }
}
