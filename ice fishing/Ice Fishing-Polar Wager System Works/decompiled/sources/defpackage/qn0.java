package defpackage;

/* loaded from: classes.dex */
public final class qn0 {
    public final boolean AARZUJiTa;
    public final android.app.Activity F7NU4MC0GW;
    public final android.content.Context IHQe1A4L2xu;
    public boolean adDC3e2L;
    public final defpackage.ym0 oh6vYeIP;
    public final defpackage.a6 r1MBDhnF;
    public final defpackage.p7 xiZrDbcSW0;

    /* JADX WARN: Multi-variable type inference failed */
    public qn0(android.content.Context context) {
        java.lang.Object obj;
        context.getClass();
        this.IHQe1A4L2xu = context;
        this.oh6vYeIP = new defpackage.ym0(this, new defpackage.tm0(this, 0));
        this.r1MBDhnF = new defpackage.a6(context, 0 == true ? 1 : 0);
        java.util.Iterator it = defpackage.a81.yIx6ChFVk(context, new defpackage.uc0(9)).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((android.content.Context) obj) instanceof android.app.Activity) {
                    break;
                }
            }
        }
        this.F7NU4MC0GW = (android.app.Activity) obj;
        int i = 1;
        this.xiZrDbcSW0 = new defpackage.p7(i, this);
        this.AARZUJiTa = true;
        defpackage.po0 po0Var = this.oh6vYeIP.EgCjBq0SZwJ;
        po0Var.IHQe1A4L2xu(new defpackage.pn0(po0Var));
        this.oh6vYeIP.EgCjBq0SZwJ.IHQe1A4L2xu(new defpackage.LoQIcHWpPq(this.IHQe1A4L2xu));
        new defpackage.le1(new defpackage.tm0(this, i));
    }

    public final void IHQe1A4L2xu() {
        defpackage.ym0 ym0Var = this.oh6vYeIP;
        if (ym0Var.xiZrDbcSW0.isEmpty()) {
            return;
        }
        defpackage.gn0 EXtogiMhuM = ym0Var.EXtogiMhuM();
        EXtogiMhuM.getClass();
        if (ym0Var.SyNS6RMn(EXtogiMhuM.xiZrDbcSW0.IHQe1A4L2xu, true, false)) {
            ym0Var.oh6vYeIP();
        }
    }
}
