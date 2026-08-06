package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class vi implements defpackage.g00 {
    public final /* synthetic */ java.lang.Object AARZUJiTa;
    public final /* synthetic */ java.lang.Object EXtogiMhuM;
    public final /* synthetic */ int adDC3e2L;
    public final /* synthetic */ java.lang.Object xiZrDbcSW0;

    public /* synthetic */ vi(defpackage.yi yiVar, defpackage.el1 el1Var, defpackage.u80 u80Var, defpackage.g61 g61Var) {
        this.adDC3e2L = 0;
        this.xiZrDbcSW0 = yiVar;
        this.AARZUJiTa = u80Var;
        this.EXtogiMhuM = g61Var;
    }

    @Override // defpackage.g00
    public final java.lang.Object AARZUJiTa(java.lang.Object obj) {
        int i = this.adDC3e2L;
        defpackage.ok1 ok1Var = defpackage.ok1.IHQe1A4L2xu;
        java.lang.Object obj2 = this.EXtogiMhuM;
        java.lang.Object obj3 = this.AARZUJiTa;
        java.lang.Object obj4 = this.xiZrDbcSW0;
        switch (i) {
            case 0:
                defpackage.yi yiVar = (defpackage.yi) obj4;
                defpackage.u80 u80Var = (defpackage.u80) obj3;
                defpackage.g61 g61Var = (defpackage.g61) obj2;
                float floatValue = ((java.lang.Float) obj).floatValue();
                float f = yiVar.kNAkVymC ? 1.0f : -1.0f;
                defpackage.i61 i61Var = yiVar.fnWB2E7cs;
                long adDC3e2L = i61Var.adDC3e2L(i61Var.EXtogiMhuM(f * floatValue));
                defpackage.i61 i61Var2 = g61Var.IHQe1A4L2xu;
                float AARZUJiTa = i61Var.AARZUJiTa(i61Var.adDC3e2L(i61Var2.r1MBDhnF(i61Var2.ez2rX8ReCYw, adDC3e2L, 1))) * f;
                if (java.lang.Math.abs(AARZUJiTa) < java.lang.Math.abs(floatValue)) {
                    java.util.concurrent.CancellationException cancellationException = new java.util.concurrent.CancellationException("Scroll animation cancelled because scroll was not consumed (" + AARZUJiTa + " < " + floatValue + ')');
                    cancellationException.initCause(null);
                    u80Var.F7NU4MC0GW(cancellationException);
                }
                return ok1Var;
            case 1:
                defpackage.gb1 gb1Var = (defpackage.gb1) obj4;
                defpackage.nm0 nm0Var = (defpackage.nm0) obj3;
                gb1Var.add(nm0Var);
                return new defpackage.b4((defpackage.no) obj2, nm0Var, gb1Var);
            case defpackage.gx0.FLOAT_FIELD_NUMBER /* 2 */:
                defpackage.sl0 sl0Var = (defpackage.sl0) obj4;
                java.util.ArrayList arrayList = (java.util.ArrayList) obj3;
                java.util.List list = (java.util.List) obj2;
                defpackage.av0 av0Var = (defpackage.av0) obj;
                av0Var.adDC3e2L = true;
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((defpackage.tc0) arrayList.get(i2)).oh6vYeIP(av0Var);
                }
                int size2 = list.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    ((defpackage.tc0) list.get(i3)).oh6vYeIP(av0Var);
                }
                av0Var.adDC3e2L = false;
                sl0Var.getValue();
                return ok1Var;
            case defpackage.gx0.INTEGER_FIELD_NUMBER /* 3 */:
                defpackage.ud0 ud0Var = (defpackage.ud0) obj4;
                final defpackage.be0 be0Var = (defpackage.be0) obj3;
                final defpackage.g00 g00Var = (defpackage.g00) obj2;
                final defpackage.rz0 rz0Var = new defpackage.rz0();
                defpackage.sd0 sd0Var = new defpackage.sd0() { // from class: qd0
                    @Override // defpackage.sd0
                    public final void riuEU0zW4(defpackage.ud0 ud0Var2, defpackage.md0 md0Var) {
                        int i4 = defpackage.rd0.IHQe1A4L2xu[md0Var.ordinal()];
                        defpackage.rz0 rz0Var2 = rz0Var;
                        if (i4 == 1) {
                            rz0Var2.adDC3e2L = g00Var.AARZUJiTa(defpackage.be0.this);
                        } else {
                            if (i4 != 2) {
                                return;
                            }
                            defpackage.tw0 tw0Var = (defpackage.tw0) rz0Var2.adDC3e2L;
                            if (tw0Var != null) {
                                tw0Var.IHQe1A4L2xu();
                            }
                            rz0Var2.adDC3e2L = null;
                        }
                    }
                };
                ud0Var.EXtogiMhuM().IHQe1A4L2xu(sd0Var);
                return new defpackage.b4(ud0Var, sd0Var, rz0Var, 2);
            default:
                defpackage.s31 s31Var = (defpackage.s31) obj4;
                defpackage.x31 x31Var = (defpackage.x31) obj2;
                defpackage.nl0 nl0Var = s31Var.xiZrDbcSW0;
                if (nl0Var.oh6vYeIP(obj3)) {
                    defpackage.db.QoRHpC4k("Key ", obj3, " was used multiple times ");
                    return null;
                }
                s31Var.adDC3e2L.remove(obj3);
                nl0Var.DFo87pBq1E5(obj3, x31Var);
                return new defpackage.b4(s31Var, obj3, x31Var, 3);
        }
    }

    public /* synthetic */ vi(defpackage.sl0 sl0Var, java.util.ArrayList arrayList, java.util.List list, boolean z) {
        this.adDC3e2L = 2;
        this.xiZrDbcSW0 = sl0Var;
        this.AARZUJiTa = arrayList;
        this.EXtogiMhuM = list;
    }

    public /* synthetic */ vi(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, int i) {
        this.adDC3e2L = i;
        this.xiZrDbcSW0 = obj;
        this.AARZUJiTa = obj2;
        this.EXtogiMhuM = obj3;
    }
}
