package defpackage;

/* loaded from: classes.dex */
public final class yx0 extends defpackage.kd6TUFXn implements defpackage.sb, defpackage.w71 {
    public final defpackage.x9 SH1y5HwkJhh;

    public yx0(defpackage.lj ljVar, defpackage.x9 x9Var) {
        super(ljVar, true);
        this.SH1y5HwkJhh = x9Var;
    }

    @Override // defpackage.sb
    public final java.lang.Object EXtogiMhuM() {
        return this.SH1y5HwkJhh.EXtogiMhuM();
    }

    @Override // defpackage.c90, defpackage.u80
    public final void F7NU4MC0GW(java.util.concurrent.CancellationException cancellationException) {
        if (isCancelled()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new defpackage.v80(frpfPPIgqM9O(), null, this);
        }
        v5iciZok(cancellationException);
    }

    @Override // defpackage.w71
    public final java.lang.Object IHQe1A4L2xu(defpackage.ej ejVar, java.lang.Object obj) {
        return this.SH1y5HwkJhh.IHQe1A4L2xu(ejVar, obj);
    }

    @Override // defpackage.sb
    public final java.lang.Object SyNS6RMn(defpackage.ue ueVar) {
        defpackage.x9 x9Var = this.SH1y5HwkJhh;
        x9Var.getClass();
        return defpackage.x9.SiPhmbmu(x9Var, ueVar);
    }

    @Override // defpackage.kd6TUFXn
    public final void ZNF7fheNE(java.lang.Object obj) {
        defpackage.f70.xiZrDbcSW0(this.SH1y5HwkJhh);
    }

    @Override // defpackage.sb
    public final java.lang.Object adDC3e2L(defpackage.ce1 ce1Var) {
        defpackage.x9 x9Var = this.SH1y5HwkJhh;
        x9Var.getClass();
        return defpackage.x9.frpfPPIgqM9O(x9Var, ce1Var);
    }

    @Override // defpackage.kd6TUFXn
    public final void dOmtpLcqqI1y(java.lang.Throwable th, boolean z) {
        if (this.SH1y5HwkJhh.SH1y5HwkJhh(th, false) || z) {
            return;
        }
        defpackage.gq1.kNAkVymC(this.riuEU0zW4, th);
    }

    @Override // defpackage.sb
    public final defpackage.u9 iterator() {
        defpackage.x9 x9Var = this.SH1y5HwkJhh;
        x9Var.getClass();
        return new defpackage.u9(x9Var);
    }

    @Override // defpackage.w71
    public final java.lang.Object riuEU0zW4(java.lang.Object obj) {
        return this.SH1y5HwkJhh.riuEU0zW4(obj);
    }

    @Override // defpackage.c90
    public final void v5iciZok(java.util.concurrent.CancellationException cancellationException) {
        this.SH1y5HwkJhh.SH1y5HwkJhh(cancellationException, true);
        nBH8hAHy(cancellationException);
    }
}
