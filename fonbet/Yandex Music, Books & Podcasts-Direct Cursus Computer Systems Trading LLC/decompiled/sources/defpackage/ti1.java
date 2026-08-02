package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final /* synthetic */ class ti1 implements dmj {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ti1(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.dmj
    public final void a(boolean z) {
        switch (this.a) {
            case 0:
                mj1 mj1Var = ((yi1) this.b).c;
                Continuation continuation = null;
                if (!((z66) mj1Var.n.getValue()).g()) {
                    x97.y(ot0.F(mj1Var), null, null, new ij1(mj1Var, continuation, 1), 3);
                    break;
                } else {
                    xdr xdrVar = mj1Var.s;
                    xdrVar.getClass();
                    xdrVar.m(null, bj1.a);
                    mj1.H(mj1Var, null, 1);
                    break;
                }
            case 1:
                ((ny3) this.b).b.G();
                break;
            case 2:
                ((ut5) this.b).c.M();
                break;
            case 3:
                nx5 nx5Var = ((ww5) this.b).b;
                rar rarVar = nx5Var.p;
                Continuation continuation2 = null;
                if (rarVar != null) {
                    rarVar.g(null);
                }
                nx5Var.p = x97.y(ot0.F(nx5Var), null, null, new vv4(nx5Var, continuation2, 14), 3);
                break;
            case 4:
                d06 d06Var = ((tz5) this.b).c;
                Continuation continuation3 = null;
                if (!((z66) d06Var.o.getValue()).g()) {
                    x97.y(ot0.F(d06Var), null, null, new b06(d06Var, continuation3, 1), 3);
                    break;
                } else {
                    xdr xdrVar2 = d06Var.q;
                    xdrVar2.getClass();
                    xdrVar2.m(null, wz5.a);
                    d06Var.G(true);
                    break;
                }
            case 5:
                ((d26) this.b).d.P();
                break;
            case 6:
                ((n1h) this.b).a.G();
                break;
            case 7:
                gmi gmiVar = ((rli) this.b).b;
                xdr xdrVar3 = gmiVar.t;
                xdrVar3.getClass();
                Continuation continuation4 = null;
                xdrVar3.m(null, ami.a);
                rar rarVar2 = gmiVar.x;
                if (rarVar2 != null) {
                    rarVar2.g(null);
                }
                gmiVar.x = null;
                gmiVar.x = x97.y(ot0.F(gmiVar), null, null, new emi(continuation4, gmiVar, 1), 3);
                break;
            case 8:
                m3m m3mVar = ((a3m) this.b).b;
                m3mVar.G(m3mVar.k);
                break;
            case 9:
                ((xqq) ((hgp) this.b).c).S();
                break;
            case 10:
                ((nvq) this.b).d.R();
                break;
            case 11:
                ((yts) this.b).a.G();
                break;
            case 12:
                f3u f3uVar = ((x2u) this.b).c;
                f3uVar.getClass();
                x97.y(ot0.F(f3uVar), null, null, new e3u(f3uVar, null), 3);
                break;
            case 13:
                ((i3u) this.b).a.G();
                break;
            default:
                ((oru) this.b).b.K();
                break;
        }
    }
}
