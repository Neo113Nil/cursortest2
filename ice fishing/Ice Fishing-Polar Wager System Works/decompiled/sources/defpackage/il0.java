package defpackage;

/* loaded from: classes.dex */
public final class il0 extends defpackage.o11 implements defpackage.k00 {
    public defpackage.f20 AARZUJiTa;
    public final /* synthetic */ defpackage.jl0 DFo87pBq1E5;
    public defpackage.jl0 EXtogiMhuM;
    public /* synthetic */ java.lang.Object JlrlGoKF;
    public int SH1y5HwkJhh;
    public final /* synthetic */ defpackage.f20 SyNS6RMn;
    public int ez2rX8ReCYw;
    public long[] riuEU0zW4;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public il0(defpackage.jl0 jl0Var, defpackage.f20 f20Var, defpackage.ej ejVar) {
        super(ejVar);
        this.DFo87pBq1E5 = jl0Var;
        this.SyNS6RMn = f20Var;
    }

    @Override // defpackage.v7
    public final java.lang.Object SyNS6RMn(java.lang.Object obj) {
        defpackage.z71 z71Var;
        defpackage.jl0 jl0Var;
        long[] jArr;
        int i;
        defpackage.f20 f20Var;
        int i2 = this.ez2rX8ReCYw;
        if (i2 == 0) {
            defpackage.f70.nBH8hAHy(obj);
            z71Var = (defpackage.z71) this.JlrlGoKF;
            jl0Var = this.DFo87pBq1E5;
            defpackage.hl0 hl0Var = jl0Var.xiZrDbcSW0;
            jArr = hl0Var.r1MBDhnF;
            i = hl0Var.adDC3e2L;
            f20Var = this.SyNS6RMn;
        } else {
            if (i2 != 1) {
                defpackage.db.AARZUJiTa("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = this.SH1y5HwkJhh;
            jArr = this.riuEU0zW4;
            jl0Var = this.EXtogiMhuM;
            f20Var = this.AARZUJiTa;
            z71Var = (defpackage.z71) this.JlrlGoKF;
            defpackage.f70.nBH8hAHy(obj);
        }
        if (i == Integer.MAX_VALUE) {
            return defpackage.ok1.IHQe1A4L2xu;
        }
        int i3 = (int) ((jArr[i] >> 31) & 2147483647L);
        f20Var.xiZrDbcSW0 = i;
        java.lang.Object obj2 = jl0Var.xiZrDbcSW0.oh6vYeIP[i];
        this.JlrlGoKF = z71Var;
        this.AARZUJiTa = f20Var;
        this.EXtogiMhuM = jl0Var;
        this.riuEU0zW4 = jArr;
        this.SH1y5HwkJhh = i3;
        this.ez2rX8ReCYw = 1;
        z71Var.oh6vYeIP(this, obj2);
        return defpackage.vj.adDC3e2L;
    }

    @Override // defpackage.k00
    public final java.lang.Object adDC3e2L(java.lang.Object obj, java.lang.Object obj2) {
        return ((defpackage.il0) ez2rX8ReCYw((defpackage.ej) obj2, (defpackage.z71) obj)).SyNS6RMn(defpackage.ok1.IHQe1A4L2xu);
    }

    @Override // defpackage.v7
    public final defpackage.ej ez2rX8ReCYw(defpackage.ej ejVar, java.lang.Object obj) {
        defpackage.il0 il0Var = new defpackage.il0(this.DFo87pBq1E5, this.SyNS6RMn, ejVar);
        il0Var.JlrlGoKF = obj;
        return il0Var;
    }
}
