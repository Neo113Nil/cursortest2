package defpackage;

/* loaded from: classes4.dex */
public final class zl implements knq {
    public final /* synthetic */ int a = 3;
    public final Object b;

    public zl(rm1 rm1Var) {
        rm1Var.getClass();
        this.b = rm1Var;
    }

    @Override // defpackage.knq
    public final rrf a(rnq rnqVar, qnq qnqVar) {
        switch (this.a) {
            case 0:
                rm rmVar = (rm) rnqVar;
                qnqVar.getClass();
                return vnj.d(rmVar.a, new g3(qnqVar, this, rmVar), new wn5(new u2(this, qnqVar), 375910265, true));
            case 1:
                wn1 wn1Var = (wn1) rnqVar;
                qnqVar.getClass();
                ((rm1) this.b).getClass();
                return vnj.d(wn1Var.d, new g3(10, wn1Var, new bnd(qnqVar, 5), qnqVar), new wn5(new h3(3, this), 1477668339, true));
            case 2:
                fhq fhqVar = (fhq) rnqVar;
                qnqVar.getClass();
                return vnj.d(fhqVar.d, new p3e(25, this, qnqVar, fhqVar), new wn5(new ep5(this, 25), -194878391, true));
            default:
                dnu dnuVar = (dnu) rnqVar;
                qnqVar.getClass();
                knn knnVar = new knn(17, this);
                return new cyd(vnj.d(dnuVar.a, new zzq(16, dnuVar, qnqVar, knnVar), new wn5(new ep5(this, 29), 1705484874, true)), asq.K(dnuVar.e, new xlu(1)));
        }
    }

    @Override // defpackage.knq
    public final rnq b(s63 s63Var) {
        switch (this.a) {
            case 0:
                vjg vjgVar = (vjg) s63Var.a;
                yl ylVar = (yl) this.b;
                return new rm(vjgVar, (oq7) ylVar.b.getValue(), (fm) ylVar.a.getValue(), (hwl) ylVar.c.getValue(), (sy7) ylVar.d.getValue());
            case 1:
                vjg vjgVar2 = (vjg) s63Var.a;
                rm1 rm1Var = (rm1) this.b;
                return new wn1(vjgVar2, (e0j) rm1Var.c.getValue(), (pm1) rm1Var.d.getValue(), (om1) rm1Var.b.getValue(), (qm1) rm1Var.e.getValue(), new ri1(5, this));
            case 2:
                vjg vjgVar3 = (vjg) s63Var.a;
                nnk nnkVar = (nnk) this.b;
                return new fhq(vjgVar3, (oq7) nnkVar.a, new f4m((e0j) ((jyr) nnkVar.b).getValue()));
            default:
                drf drfVar = s63Var.a;
                jtb jtbVar = (jtb) this.b;
                return new dnu(drfVar, (oq7) jtbVar.a.getValue(), (dy6) jtbVar.b.getValue(), (z66) jtbVar.c.getValue());
        }
    }

    public zl(yl ylVar) {
        ylVar.getClass();
        this.b = ylVar;
    }

    public zl(nnk nnkVar) {
        nnkVar.getClass();
        this.b = nnkVar;
    }

    public zl(jtb jtbVar) {
        jtbVar.getClass();
        this.b = jtbVar;
    }
}
