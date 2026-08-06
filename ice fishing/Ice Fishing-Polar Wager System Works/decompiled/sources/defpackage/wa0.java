package defpackage;

/* loaded from: classes.dex */
public final class wa0 extends defpackage.ja0 {
    public final /* synthetic */ defpackage.ab0 oh6vYeIP;
    public final /* synthetic */ defpackage.k00 r1MBDhnF;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wa0(defpackage.ab0 ab0Var, defpackage.k00 k00Var, java.lang.String str) {
        super(str);
        this.oh6vYeIP = ab0Var;
        this.r1MBDhnF = k00Var;
    }

    @Override // defpackage.ii0
    public final defpackage.ji0 xiZrDbcSW0(defpackage.ki0 ki0Var, java.util.List list, long j) {
        defpackage.ab0 ab0Var = this.oh6vYeIP;
        defpackage.ua0 ua0Var = ab0Var.JlrlGoKF;
        ua0Var.adDC3e2L = ki0Var.getLayoutDirection();
        ua0Var.xiZrDbcSW0 = ki0Var.oh6vYeIP();
        ua0Var.AARZUJiTa = ki0Var.EXtogiMhuM();
        boolean cnag84Bm = ki0Var.cnag84Bm();
        defpackage.k00 k00Var = this.r1MBDhnF;
        if (cnag84Bm || ab0Var.adDC3e2L.JlrlGoKF == null) {
            ab0Var.EXtogiMhuM = 0;
            defpackage.ji0 ji0Var = (defpackage.ji0) k00Var.adDC3e2L(ua0Var, new defpackage.ki(j));
            return new defpackage.va0(ji0Var, ab0Var, ab0Var.EXtogiMhuM, ji0Var, 1);
        }
        ab0Var.riuEU0zW4 = 0;
        defpackage.ji0 ji0Var2 = (defpackage.ji0) k00Var.adDC3e2L(ab0Var.DFo87pBq1E5, new defpackage.ki(j));
        return new defpackage.va0(ji0Var2, ab0Var, ab0Var.riuEU0zW4, ji0Var2, 0);
    }
}
