package defpackage;

/* loaded from: classes.dex */
public final class m3 extends defpackage.p90 implements defpackage.g00 {
    public final /* synthetic */ java.lang.Object AARZUJiTa;
    public final /* synthetic */ java.lang.Object EXtogiMhuM;
    public final /* synthetic */ int xiZrDbcSW0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m3(int i, java.lang.Object obj, java.lang.Object obj2) {
        super(1);
        this.xiZrDbcSW0 = i;
        this.EXtogiMhuM = obj;
        this.AARZUJiTa = obj2;
    }

    @Override // defpackage.g00
    public final java.lang.Object AARZUJiTa(java.lang.Object obj) {
        defpackage.ok1 ok1Var;
        switch (this.xiZrDbcSW0) {
            case 0:
                defpackage.l3 l3Var = (defpackage.l3) this.EXtogiMhuM;
                defpackage.n3 n3Var = (defpackage.n3) this.AARZUJiTa;
                synchronized (l3Var.riuEU0zW4) {
                    l3Var.ez2rX8ReCYw.remove(n3Var);
                }
                return defpackage.ok1.IHQe1A4L2xu;
            case 1:
                ((android.view.Choreographer) ((defpackage.o3) this.EXtogiMhuM).xiZrDbcSW0).removeFrameCallback((defpackage.n3) this.AARZUJiTa);
                return defpackage.ok1.IHQe1A4L2xu;
            case defpackage.gx0.FLOAT_FIELD_NUMBER /* 2 */:
                defpackage.av0 av0Var = (defpackage.av0) obj;
                defpackage.bv0 bv0Var = (defpackage.bv0) this.EXtogiMhuM;
                float AARZUJiTa = ((defpackage.zi) this.AARZUJiTa).r1MBDhnF.AARZUJiTa();
                av0Var.getClass();
                defpackage.av0.IHQe1A4L2xu(av0Var, bv0Var);
                bv0Var.mL9sMlGfef(defpackage.z60.r1MBDhnF(0L, bv0Var.riuEU0zW4), AARZUJiTa, null);
                return defpackage.ok1.IHQe1A4L2xu;
            case defpackage.gx0.INTEGER_FIELD_NUMBER /* 3 */:
                defpackage.av0.QoRHpC4k((defpackage.av0) obj, (defpackage.bv0) this.EXtogiMhuM, ((defpackage.h8) this.AARZUJiTa).EgCjBq0SZwJ);
                return defpackage.ok1.IHQe1A4L2xu;
            case defpackage.gx0.LONG_FIELD_NUMBER /* 4 */:
                defpackage.ok1 ok1Var2 = defpackage.ok1.IHQe1A4L2xu;
                java.lang.Throwable th = (java.lang.Throwable) obj;
                ((defpackage.s) this.EXtogiMhuM).AARZUJiTa(th);
                defpackage.x9 x9Var = (defpackage.x9) ((defpackage.y) this.AARZUJiTa).AARZUJiTa;
                x9Var.SH1y5HwkJhh(th, false);
                do {
                    java.lang.Object IHQe1A4L2xu = defpackage.dc.IHQe1A4L2xu(x9Var.EXtogiMhuM());
                    if (IHQe1A4L2xu != null) {
                        ((defpackage.xi0) IHQe1A4L2xu).oh6vYeIP.wKlPRKlRnfqr(new defpackage.bf(th == null ? new java.util.concurrent.CancellationException("DataStore scope was cancelled before updateData could complete") : th, false));
                        ok1Var = ok1Var2;
                    } else {
                        ok1Var = null;
                    }
                } while (ok1Var != null);
                return ok1Var2;
            case defpackage.gx0.STRING_FIELD_NUMBER /* 5 */:
                defpackage.av0.QoRHpC4k((defpackage.av0) obj, (defpackage.bv0) this.EXtogiMhuM, ((defpackage.t91) this.AARZUJiTa).v5iciZok);
                return defpackage.ok1.IHQe1A4L2xu;
            default:
                defpackage.zg zgVar = (defpackage.zg) obj;
                defpackage.k00 k00Var = (defpackage.k00) this.AARZUJiTa;
                defpackage.aq1 aq1Var = (defpackage.aq1) this.EXtogiMhuM;
                if (!aq1Var.AARZUJiTa) {
                    defpackage.ud0 ud0Var = zgVar.r1MBDhnF;
                    android.view.View view = zgVar.IHQe1A4L2xu;
                    defpackage.xd0 EXtogiMhuM = ud0Var.EXtogiMhuM();
                    aq1Var.riuEU0zW4 = k00Var;
                    if (aq1Var.EXtogiMhuM == null) {
                        if (defpackage.x70.QoRHpC4k(android.os.Looper.myLooper(), view.getHandler().getLooper())) {
                            aq1Var.EXtogiMhuM = EXtogiMhuM;
                            EXtogiMhuM.IHQe1A4L2xu(aq1Var);
                        } else {
                            view.post(new defpackage.l1(3, aq1Var, EXtogiMhuM));
                        }
                    } else if (EXtogiMhuM.EXtogiMhuM.compareTo(defpackage.nd0.AARZUJiTa) >= 0) {
                        aq1Var.xiZrDbcSW0.C0U8sNJm(new defpackage.sf(-1723985096, new defpackage.u1(aq1Var, zgVar, k00Var), true));
                    }
                }
                return defpackage.ok1.IHQe1A4L2xu;
        }
    }
}
