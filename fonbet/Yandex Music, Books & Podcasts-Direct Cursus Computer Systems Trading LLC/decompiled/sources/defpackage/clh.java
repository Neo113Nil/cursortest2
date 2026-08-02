package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class clh implements qlh, zcg, ycg {
    public final /* synthetic */ int a;
    public final /* synthetic */ ulh b;

    public /* synthetic */ clh(ulh ulhVar, int i) {
        this.a = i;
        this.b = ulhVar;
    }

    @Override // defpackage.qlh
    public void b(c9e c9eVar, int i) {
        switch (this.a) {
            case 0:
                c9eVar.L(this.b.c, i);
                break;
            case 1:
                c9eVar.p(this.b.c, i);
                break;
            case 2:
                c9eVar.P(this.b.c, i);
                break;
            case 3:
                c9eVar.b0(this.b.c, i);
                break;
            case 4:
                c9eVar.E(this.b.c, i);
                break;
            case 5:
                c9eVar.s0(this.b.c, i);
                break;
            case 6:
            case 11:
            case 12:
            default:
                ulh ulhVar = this.b;
                c9eVar.y0(ulhVar.c, i, ulhVar.y);
                break;
            case 7:
                c9eVar.m0(this.b.c, i);
                break;
            case 8:
                c9eVar.F0(this.b.c, i);
                break;
            case 9:
                c9eVar.e(this.b.c, i);
                break;
            case 10:
                c9eVar.Z(this.b.c, i);
                break;
            case 13:
                c9eVar.y0(this.b.c, i, null);
                break;
            case 14:
                c9eVar.r(this.b.c, i);
                break;
            case 15:
                c9eVar.y0(this.b.c, i, null);
                break;
            case 16:
                c9eVar.q0(this.b.c, i);
                break;
            case 17:
                c9eVar.u(this.b.c, i);
                break;
            case 18:
                c9eVar.C(this.b.c, i);
                break;
            case 19:
                c9eVar.y0(this.b.c, i, null);
                break;
        }
    }

    @Override // defpackage.zcg
    public void c(Object obj, xgc xgcVar) {
        ((f8l) obj).N(this.b.a, new e8l(xgcVar));
    }

    @Override // defpackage.ycg
    public void invoke(Object obj) {
        f8l f8lVar = (f8l) obj;
        switch (this.a) {
            case 11:
                f8lVar.V(this.b.x);
                break;
            default:
                f8lVar.V(this.b.x);
                break;
        }
    }
}
