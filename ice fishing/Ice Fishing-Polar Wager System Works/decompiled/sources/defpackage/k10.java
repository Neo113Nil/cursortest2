package defpackage;

/* loaded from: classes.dex */
public final class k10 extends defpackage.ce1 implements defpackage.k00 {
    public final /* synthetic */ long DFo87pBq1E5;
    public final /* synthetic */ long JlrlGoKF;
    public final /* synthetic */ java.lang.String SH1y5HwkJhh;
    public final /* synthetic */ defpackage.l10 ez2rX8ReCYw;
    public /* synthetic */ java.lang.Object riuEU0zW4;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k10(java.lang.String str, defpackage.l10 l10Var, long j, long j2, defpackage.ej ejVar) {
        super(2, ejVar);
        this.SH1y5HwkJhh = str;
        this.ez2rX8ReCYw = l10Var;
        this.JlrlGoKF = j;
        this.DFo87pBq1E5 = j2;
    }

    @Override // defpackage.v7
    public final java.lang.Object SyNS6RMn(java.lang.Object obj) {
        defpackage.n10 n10Var = (defpackage.n10) this.riuEU0zW4;
        defpackage.f70.nBH8hAHy(obj);
        java.util.List list = defpackage.p80.IHQe1A4L2xu;
        defpackage.o80 o80Var = (defpackage.o80) defpackage.p80.oh6vYeIP.get(this.SH1y5HwkJhh);
        defpackage.l10 l10Var = this.ez2rX8ReCYw;
        if (o80Var == null) {
            return defpackage.l10.AARZUJiTa(l10Var, "That island is not on any chart.");
        }
        if (n10Var.SH1y5HwkJhh != null) {
            return defpackage.l10.AARZUJiTa(l10Var, "Finish the dig you already started first.");
        }
        if (!defpackage.x70.p4kuH6PDtgom(o80Var, n10Var.EXtogiMhuM)) {
            return defpackage.l10.AARZUJiTa(l10Var, o80Var.oh6vYeIP.concat(" is still uncharted."));
        }
        defpackage.j11 lpprD5VAS = defpackage.x70.lpprD5VAS(n10Var.oh6vYeIP, (n10Var.riuEU0zW4.size() * 2) + 20, n10Var.r1MBDhnF, this.JlrlGoKF);
        int i = lpprD5VAS.IHQe1A4L2xu;
        int i2 = o80Var.xiZrDbcSW0;
        if (i < i2) {
            return defpackage.l10.AARZUJiTa(l10Var, "You need " + i2 + " energy to land here.");
        }
        return new defpackage.c10(defpackage.n10.IHQe1A4L2xu(n10Var, 0, i - i2, lpprD5VAS.oh6vYeIP, 0L, null, null, null, null, new defpackage.op(o80Var.IHQe1A4L2xu, this.DFo87pBq1E5, o80Var.AARZUJiTa, defpackage.nt.adDC3e2L, false), 505), new defpackage.uLnPvzwk(null, true));
    }

    @Override // defpackage.k00
    public final java.lang.Object adDC3e2L(java.lang.Object obj, java.lang.Object obj2) {
        return ((defpackage.k10) ez2rX8ReCYw((defpackage.ej) obj2, (defpackage.n10) obj)).SyNS6RMn(defpackage.ok1.IHQe1A4L2xu);
    }

    @Override // defpackage.v7
    public final defpackage.ej ez2rX8ReCYw(defpackage.ej ejVar, java.lang.Object obj) {
        defpackage.k10 k10Var = new defpackage.k10(this.SH1y5HwkJhh, this.ez2rX8ReCYw, this.JlrlGoKF, this.DFo87pBq1E5, ejVar);
        k10Var.riuEU0zW4 = obj;
        return k10Var;
    }
}
