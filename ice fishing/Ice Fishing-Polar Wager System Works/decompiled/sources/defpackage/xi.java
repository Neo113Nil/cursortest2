package defpackage;

/* loaded from: classes.dex */
public final class xi extends defpackage.ce1 implements defpackage.k00 {
    public final /* synthetic */ defpackage.l9 DFo87pBq1E5;
    public final /* synthetic */ defpackage.el1 JlrlGoKF;
    public /* synthetic */ java.lang.Object SH1y5HwkJhh;
    public final /* synthetic */ long SyNS6RMn;
    public final /* synthetic */ defpackage.yi ez2rX8ReCYw;
    public int riuEU0zW4;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xi(defpackage.yi yiVar, defpackage.el1 el1Var, defpackage.l9 l9Var, long j, defpackage.ej ejVar) {
        super(2, ejVar);
        this.ez2rX8ReCYw = yiVar;
        this.JlrlGoKF = el1Var;
        this.DFo87pBq1E5 = l9Var;
        this.SyNS6RMn = j;
    }

    @Override // defpackage.v7
    public final java.lang.Object SyNS6RMn(java.lang.Object obj) {
        defpackage.yi yiVar = this.ez2rX8ReCYw;
        defpackage.f9 f9Var = yiVar.PAEGRtP0bX;
        int i = this.riuEU0zW4;
        try {
            try {
                if (i == 0) {
                    defpackage.f70.nBH8hAHy(obj);
                    defpackage.u80 abhbClRa = defpackage.x80.abhbClRa(((defpackage.uj) this.SH1y5HwkJhh).AARZUJiTa());
                    yiVar.QQUzIjv3iOC5 = true;
                    defpackage.i61 i61Var = yiVar.fnWB2E7cs;
                    defpackage.am0 am0Var = defpackage.am0.adDC3e2L;
                    defpackage.wi wiVar = new defpackage.wi(this.JlrlGoKF, yiVar, this.DFo87pBq1E5, this.SyNS6RMn, abhbClRa, null);
                    this.riuEU0zW4 = 1;
                    java.lang.Object xiZrDbcSW0 = i61Var.xiZrDbcSW0(am0Var, wiVar, this);
                    defpackage.vj vjVar = defpackage.vj.adDC3e2L;
                    if (xiZrDbcSW0 == vjVar) {
                        return vjVar;
                    }
                } else {
                    if (i != 1) {
                        defpackage.db.AARZUJiTa("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    defpackage.f70.nBH8hAHy(obj);
                }
                f9Var.oh6vYeIP();
                yiVar.QQUzIjv3iOC5 = false;
                f9Var.IHQe1A4L2xu(null);
                yiVar.abhbClRa = false;
                return defpackage.ok1.IHQe1A4L2xu;
            } catch (java.util.concurrent.CancellationException e) {
                throw e;
            }
        } catch (java.lang.Throwable th) {
            yiVar.QQUzIjv3iOC5 = false;
            f9Var.IHQe1A4L2xu(null);
            yiVar.abhbClRa = false;
            throw th;
        }
    }

    @Override // defpackage.k00
    public final java.lang.Object adDC3e2L(java.lang.Object obj, java.lang.Object obj2) {
        return ((defpackage.xi) ez2rX8ReCYw((defpackage.ej) obj2, (defpackage.uj) obj)).SyNS6RMn(defpackage.ok1.IHQe1A4L2xu);
    }

    @Override // defpackage.v7
    public final defpackage.ej ez2rX8ReCYw(defpackage.ej ejVar, java.lang.Object obj) {
        defpackage.xi xiVar = new defpackage.xi(this.ez2rX8ReCYw, this.JlrlGoKF, this.DFo87pBq1E5, this.SyNS6RMn, ejVar);
        xiVar.SH1y5HwkJhh = obj;
        return xiVar;
    }
}
