package defpackage;

/* loaded from: classes.dex */
public final class oh0 extends defpackage.ce1 implements defpackage.k00 {
    public final /* synthetic */ defpackage.qn0 JlrlGoKF;
    public /* synthetic */ java.lang.Object SH1y5HwkJhh;
    public final /* synthetic */ defpackage.g00 ez2rX8ReCYw;
    public final /* synthetic */ int riuEU0zW4;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ oh0(defpackage.g00 g00Var, defpackage.qn0 qn0Var, defpackage.ej ejVar, int i) {
        super(2, ejVar);
        this.riuEU0zW4 = i;
        this.ez2rX8ReCYw = g00Var;
        this.JlrlGoKF = qn0Var;
    }

    @Override // defpackage.v7
    public final java.lang.Object SyNS6RMn(java.lang.Object obj) {
        int i = this.riuEU0zW4;
        defpackage.ok1 ok1Var = defpackage.ok1.IHQe1A4L2xu;
        defpackage.qn0 qn0Var = this.JlrlGoKF;
        defpackage.g00 g00Var = this.ez2rX8ReCYw;
        java.lang.Object obj2 = this.SH1y5HwkJhh;
        switch (i) {
            case 0:
                defpackage.xg0 xg0Var = (defpackage.xg0) obj2;
                defpackage.f70.nBH8hAHy(obj);
                if (!(xg0Var instanceof defpackage.ug0)) {
                    if (!(xg0Var instanceof defpackage.vg0)) {
                        if (!defpackage.x70.QoRHpC4k(xg0Var, defpackage.wg0.IHQe1A4L2xu)) {
                            defpackage.db.F7NU4MC0GW();
                            break;
                        } else {
                            defpackage.x80.yIx6ChFVk(qn0Var, "menu", new defpackage.uc0(4));
                        }
                    } else {
                        defpackage.x80.p4kuH6PDtgom(qn0Var, ((defpackage.vg0) xg0Var).IHQe1A4L2xu);
                    }
                } else {
                    g00Var.AARZUJiTa(((defpackage.ug0) xg0Var).IHQe1A4L2xu);
                }
                break;
            default:
                defpackage.h81 h81Var = (defpackage.h81) obj2;
                defpackage.f70.nBH8hAHy(obj);
                if (!(h81Var instanceof defpackage.f81)) {
                    if (!defpackage.x70.QoRHpC4k(h81Var, defpackage.g81.IHQe1A4L2xu)) {
                        defpackage.db.F7NU4MC0GW();
                        break;
                    } else {
                        defpackage.x80.wll2JLbTBC2(qn0Var);
                    }
                } else {
                    g00Var.AARZUJiTa("The ledger has been wiped clean.");
                }
                break;
        }
        return null;
    }

    @Override // defpackage.k00
    public final java.lang.Object adDC3e2L(java.lang.Object obj, java.lang.Object obj2) {
        int i = this.riuEU0zW4;
        defpackage.ok1 ok1Var = defpackage.ok1.IHQe1A4L2xu;
        switch (i) {
            case 0:
                ((defpackage.oh0) ez2rX8ReCYw((defpackage.ej) obj2, (defpackage.xg0) obj)).SyNS6RMn(ok1Var);
                break;
            default:
                ((defpackage.oh0) ez2rX8ReCYw((defpackage.ej) obj2, (defpackage.h81) obj)).SyNS6RMn(ok1Var);
                break;
        }
        return ok1Var;
    }

    @Override // defpackage.v7
    public final defpackage.ej ez2rX8ReCYw(defpackage.ej ejVar, java.lang.Object obj) {
        switch (this.riuEU0zW4) {
            case 0:
                defpackage.oh0 oh0Var = new defpackage.oh0(this.ez2rX8ReCYw, this.JlrlGoKF, ejVar, 0);
                oh0Var.SH1y5HwkJhh = obj;
                return oh0Var;
            default:
                defpackage.oh0 oh0Var2 = new defpackage.oh0(this.ez2rX8ReCYw, this.JlrlGoKF, ejVar, 1);
                oh0Var2.SH1y5HwkJhh = obj;
                return oh0Var2;
        }
    }
}
