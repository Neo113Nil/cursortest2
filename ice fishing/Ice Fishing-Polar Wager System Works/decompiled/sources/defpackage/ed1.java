package defpackage;

/* loaded from: classes.dex */
public final class ed1 extends defpackage.p90 implements defpackage.k00 {
    public final /* synthetic */ defpackage.fd1 AARZUJiTa;
    public final /* synthetic */ int xiZrDbcSW0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ed1(defpackage.fd1 fd1Var, int i) {
        super(2);
        this.xiZrDbcSW0 = i;
        this.AARZUJiTa = fd1Var;
    }

    @Override // defpackage.k00
    public final java.lang.Object adDC3e2L(java.lang.Object obj, java.lang.Object obj2) {
        int i = this.xiZrDbcSW0;
        defpackage.ok1 ok1Var = defpackage.ok1.IHQe1A4L2xu;
        defpackage.fd1 fd1Var = this.AARZUJiTa;
        switch (i) {
            case 0:
                fd1Var.IHQe1A4L2xu().xiZrDbcSW0 = (defpackage.fh) obj2;
                break;
            case 1:
                defpackage.ab0 IHQe1A4L2xu = fd1Var.IHQe1A4L2xu();
                ((defpackage.ma0) obj).mL9sMlGfef(new defpackage.wa0(IHQe1A4L2xu, (defpackage.k00) obj2, IHQe1A4L2xu.fnWB2E7cs));
                break;
            default:
                defpackage.ma0 ma0Var = (defpackage.ma0) obj;
                defpackage.id1 id1Var = fd1Var.IHQe1A4L2xu;
                defpackage.ab0 ab0Var = ma0Var.XZx205DYe;
                if (ab0Var == null) {
                    ab0Var = new defpackage.ab0(ma0Var, id1Var);
                    ma0Var.XZx205DYe = ab0Var;
                }
                fd1Var.oh6vYeIP = ab0Var;
                fd1Var.IHQe1A4L2xu().EXtogiMhuM();
                defpackage.ab0 IHQe1A4L2xu2 = fd1Var.IHQe1A4L2xu();
                if (IHQe1A4L2xu2.AARZUJiTa != id1Var) {
                    IHQe1A4L2xu2.AARZUJiTa = id1Var;
                    IHQe1A4L2xu2.riuEU0zW4(false);
                    defpackage.ma0.wKlPRKlRnfqr(IHQe1A4L2xu2.adDC3e2L, false, 7);
                    break;
                }
                break;
        }
        return ok1Var;
    }
}
