package defpackage;

/* loaded from: classes.dex */
public final class o30 extends defpackage.ce1 implements defpackage.k00 {
    public /* synthetic */ java.lang.Object SH1y5HwkJhh;
    public final /* synthetic */ defpackage.qn0 ez2rX8ReCYw;
    public final /* synthetic */ int riuEU0zW4;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o30(defpackage.qn0 qn0Var, defpackage.ej ejVar, int i) {
        super(2, ejVar);
        this.riuEU0zW4 = i;
        this.ez2rX8ReCYw = qn0Var;
    }

    @Override // defpackage.v7
    public final java.lang.Object SyNS6RMn(java.lang.Object obj) {
        int i = this.riuEU0zW4;
        defpackage.ok1 ok1Var = defpackage.ok1.IHQe1A4L2xu;
        defpackage.qn0 qn0Var = this.ez2rX8ReCYw;
        java.lang.Object obj2 = this.SH1y5HwkJhh;
        switch (i) {
            case 0:
                defpackage.f70.nBH8hAHy(obj);
                if (!defpackage.x70.QoRHpC4k((defpackage.i30) obj2, defpackage.i30.IHQe1A4L2xu)) {
                    defpackage.db.F7NU4MC0GW();
                    break;
                } else {
                    defpackage.x80.wll2JLbTBC2(qn0Var);
                    break;
                }
            case 1:
                defpackage.f70.nBH8hAHy(obj);
                if (!defpackage.x70.QoRHpC4k((defpackage.nf0) obj2, defpackage.nf0.IHQe1A4L2xu)) {
                    defpackage.db.F7NU4MC0GW();
                    break;
                } else {
                    defpackage.x80.wll2JLbTBC2(qn0Var);
                    break;
                }
            case defpackage.gx0.FLOAT_FIELD_NUMBER /* 2 */:
                defpackage.li0 li0Var = (defpackage.li0) obj2;
                defpackage.f70.nBH8hAHy(obj);
                if (li0Var == null) {
                    defpackage.db.F7NU4MC0GW();
                    break;
                } else {
                    defpackage.x80.p4kuH6PDtgom(qn0Var, li0Var.IHQe1A4L2xu);
                    break;
                }
            default:
                defpackage.f70.nBH8hAHy(obj);
                if (!defpackage.x70.QoRHpC4k((defpackage.am1) obj2, defpackage.am1.IHQe1A4L2xu)) {
                    defpackage.db.F7NU4MC0GW();
                    break;
                } else {
                    defpackage.x80.wll2JLbTBC2(qn0Var);
                    break;
                }
        }
        return null;
    }

    @Override // defpackage.k00
    public final java.lang.Object adDC3e2L(java.lang.Object obj, java.lang.Object obj2) {
        int i = this.riuEU0zW4;
        defpackage.ok1 ok1Var = defpackage.ok1.IHQe1A4L2xu;
        switch (i) {
            case 0:
                ((defpackage.o30) ez2rX8ReCYw((defpackage.ej) obj2, (defpackage.i30) obj)).SyNS6RMn(ok1Var);
                break;
            case 1:
                ((defpackage.o30) ez2rX8ReCYw((defpackage.ej) obj2, (defpackage.nf0) obj)).SyNS6RMn(ok1Var);
                break;
            case defpackage.gx0.FLOAT_FIELD_NUMBER /* 2 */:
                ((defpackage.o30) ez2rX8ReCYw((defpackage.ej) obj2, (defpackage.li0) obj)).SyNS6RMn(ok1Var);
                break;
            default:
                ((defpackage.o30) ez2rX8ReCYw((defpackage.ej) obj2, (defpackage.am1) obj)).SyNS6RMn(ok1Var);
                break;
        }
        return ok1Var;
    }

    @Override // defpackage.v7
    public final defpackage.ej ez2rX8ReCYw(defpackage.ej ejVar, java.lang.Object obj) {
        switch (this.riuEU0zW4) {
            case 0:
                defpackage.o30 o30Var = new defpackage.o30(this.ez2rX8ReCYw, ejVar, 0);
                o30Var.SH1y5HwkJhh = obj;
                return o30Var;
            case 1:
                defpackage.o30 o30Var2 = new defpackage.o30(this.ez2rX8ReCYw, ejVar, 1);
                o30Var2.SH1y5HwkJhh = obj;
                return o30Var2;
            case defpackage.gx0.FLOAT_FIELD_NUMBER /* 2 */:
                defpackage.o30 o30Var3 = new defpackage.o30(this.ez2rX8ReCYw, ejVar, 2);
                o30Var3.SH1y5HwkJhh = obj;
                return o30Var3;
            default:
                defpackage.o30 o30Var4 = new defpackage.o30(this.ez2rX8ReCYw, ejVar, 3);
                o30Var4.SH1y5HwkJhh = obj;
                return o30Var4;
        }
    }
}
