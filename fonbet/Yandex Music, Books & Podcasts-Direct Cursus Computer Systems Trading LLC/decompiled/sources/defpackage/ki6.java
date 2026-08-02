package defpackage;

/* loaded from: classes4.dex */
public final class ki6 extends bfu {
    public final eg6 k;
    public final voi l;

    public ki6(hek hekVar, egk egkVar, eg6 eg6Var) {
        hekVar.getClass();
        egkVar.getClass();
        eg6Var.getClass();
        this.k = eg6Var;
        voi voiVar = new voi();
        this.l = voiVar;
        lw3 lw3Var = new lw3(1, this);
        qxp qxpVar = new qxp(this);
        c9g c9gVar = egkVar.b;
        if (c9gVar instanceof cgk) {
            voiVar.l(gi6.a);
            hekVar.a = lw3Var;
            hmf hmfVar = hekVar.b;
            if (hmfVar != null) {
                lw3Var.a(hmfVar.a, hmfVar.b);
            }
            egkVar.a.b = qxpVar;
            return;
        }
        if (c9gVar instanceof agk) {
            voiVar.l(new fi6(((agk) c9gVar).a));
        } else {
            if (!(c9gVar instanceof dgk)) {
                xq0.q("ContinuePayment without active payment");
                throw null;
            }
            int i = ji6.a[((dgk) c9gVar).a.ordinal()];
            voiVar.l(new hi6());
        }
    }
}
