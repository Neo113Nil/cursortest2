package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class b6 implements defpackage.dg1 {
    public boolean GE9mJIPrb8gP;
    public long P05cfTpS5W5L;
    public defpackage.g6 QiMR8OkAhezm;
    public final defpackage.lq1 WDYagTQQm9ns;
    public long e6mdH7fiFuta;
    public final defpackage.pw0 oh71FJcDz6S2;

    public b6(defpackage.lq1 lq1Var, java.lang.Object obj, defpackage.g6 g6Var, long j, long j2, boolean z) {
        defpackage.g6 g6Var2;
        this.WDYagTQQm9ns = lq1Var;
        this.oh71FJcDz6S2 = defpackage.w60.hH0RRJrNssvh(obj);
        if (g6Var != null) {
            g6Var2 = defpackage.ok0.maCixPsq4ml2(g6Var);
        } else {
            g6Var2 = (defpackage.g6) lq1Var.ZpBGe2uQfcn8.P05cfTpS5W5L(obj);
            g6Var2.JhCgjQRTAOCT();
        }
        this.QiMR8OkAhezm = g6Var2;
        this.P05cfTpS5W5L = j;
        this.e6mdH7fiFuta = j2;
        this.GE9mJIPrb8gP = z;
    }

    @Override // defpackage.dg1
    public final java.lang.Object getValue() {
        return this.oh71FJcDz6S2.getValue();
    }

    public final java.lang.String toString() {
        return "AnimationState(value=" + this.oh71FJcDz6S2.getValue() + ", velocity=" + this.WDYagTQQm9ns.giKS3J6vZuNy.P05cfTpS5W5L(this.QiMR8OkAhezm) + ", isRunning=" + this.GE9mJIPrb8gP + ", lastFrameTimeNanos=" + this.P05cfTpS5W5L + ", finishedTimeNanos=" + this.e6mdH7fiFuta + ')';
    }

    public /* synthetic */ b6(defpackage.lq1 lq1Var, java.lang.Object obj, defpackage.g6 g6Var, int i) {
        this(lq1Var, obj, (i & 4) != 0 ? null : g6Var, Long.MIN_VALUE, Long.MIN_VALUE, false);
    }
}
