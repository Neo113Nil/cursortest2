package defpackage;

/* loaded from: classes.dex */
public final class d5 implements defpackage.ec1 {
    public defpackage.i5 AARZUJiTa;
    public long EXtogiMhuM;
    public boolean SH1y5HwkJhh;
    public final defpackage.F7NU4MC0GW adDC3e2L;
    public long riuEU0zW4;
    public final defpackage.qt0 xiZrDbcSW0;

    public d5(defpackage.F7NU4MC0GW f7nu4mc0gw, java.lang.Object obj, defpackage.i5 i5Var, long j, long j2, boolean z) {
        defpackage.i5 i5Var2;
        this.adDC3e2L = f7nu4mc0gw;
        this.xiZrDbcSW0 = defpackage.c80.nBH8hAHy(obj);
        if (i5Var != null) {
            i5Var2 = defpackage.ci0.kd6TUFXn(i5Var);
        } else {
            i5Var2 = (defpackage.i5) ((defpackage.g00) f7nu4mc0gw.xiZrDbcSW0).AARZUJiTa(obj);
            i5Var2.F7NU4MC0GW();
        }
        this.AARZUJiTa = i5Var2;
        this.EXtogiMhuM = j;
        this.riuEU0zW4 = j2;
        this.SH1y5HwkJhh = z;
    }

    @Override // defpackage.ec1
    public final java.lang.Object getValue() {
        return this.xiZrDbcSW0.getValue();
    }

    public final java.lang.String toString() {
        return "AnimationState(value=" + this.xiZrDbcSW0.getValue() + ", velocity=" + ((defpackage.g00) this.adDC3e2L.AARZUJiTa).AARZUJiTa(this.AARZUJiTa) + ", isRunning=" + this.SH1y5HwkJhh + ", lastFrameTimeNanos=" + this.EXtogiMhuM + ", finishedTimeNanos=" + this.riuEU0zW4 + ')';
    }

    public /* synthetic */ d5(defpackage.F7NU4MC0GW f7nu4mc0gw, java.lang.Object obj, defpackage.i5 i5Var, int i) {
        this(f7nu4mc0gw, obj, (i & 4) != 0 ? null : i5Var, Long.MIN_VALUE, Long.MIN_VALUE, false);
    }
}
