package defpackage;

/* loaded from: classes.dex */
public final class yn0 extends defpackage.ce1 implements defpackage.k00 {
    public final /* synthetic */ defpackage.ec1 DFo87pBq1E5;
    public final /* synthetic */ defpackage.el0 JlrlGoKF;
    public final /* synthetic */ defpackage.qn0 SH1y5HwkJhh;
    public final /* synthetic */ defpackage.gg SyNS6RMn;
    public final /* synthetic */ defpackage.nm0 ez2rX8ReCYw;
    public final /* synthetic */ defpackage.li1 riuEU0zW4;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yn0(defpackage.li1 li1Var, defpackage.qn0 qn0Var, defpackage.nm0 nm0Var, defpackage.el0 el0Var, defpackage.ec1 ec1Var, defpackage.gg ggVar, defpackage.ej ejVar) {
        super(2, ejVar);
        this.riuEU0zW4 = li1Var;
        this.SH1y5HwkJhh = qn0Var;
        this.ez2rX8ReCYw = nm0Var;
        this.JlrlGoKF = el0Var;
        this.DFo87pBq1E5 = ec1Var;
        this.SyNS6RMn = ggVar;
    }

    @Override // defpackage.v7
    public final java.lang.Object SyNS6RMn(java.lang.Object obj) {
        defpackage.f70.nBH8hAHy(obj);
        defpackage.li1 li1Var = this.riuEU0zW4;
        java.lang.Object xiZrDbcSW0 = li1Var.IHQe1A4L2xu.xiZrDbcSW0();
        defpackage.qt0 qt0Var = li1Var.F7NU4MC0GW;
        if (defpackage.x70.QoRHpC4k(xiZrDbcSW0, qt0Var.getValue()) && (this.SH1y5HwkJhh.oh6vYeIP.AARZUJiTa() == null || defpackage.x70.QoRHpC4k(qt0Var.getValue(), this.ez2rX8ReCYw))) {
            java.util.Iterator it = ((java.util.List) this.DFo87pBq1E5.getValue()).iterator();
            while (it.hasNext()) {
                this.SyNS6RMn.oh6vYeIP().r1MBDhnF((defpackage.nm0) it.next());
            }
            defpackage.el0 el0Var = this.JlrlGoKF;
            long[] jArr = el0Var.IHQe1A4L2xu;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                while (true) {
                    long j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((j & 255) < 128) {
                                int i4 = (i << 3) + i3;
                                java.lang.Object obj2 = el0Var.oh6vYeIP[i4];
                                float f = el0Var.r1MBDhnF[i4];
                                if (!defpackage.x70.QoRHpC4k((java.lang.String) obj2, ((defpackage.nm0) qt0Var.getValue()).SH1y5HwkJhh)) {
                                    el0Var.adDC3e2L--;
                                    long[] jArr2 = el0Var.IHQe1A4L2xu;
                                    int i5 = el0Var.F7NU4MC0GW;
                                    int i6 = i4 >> 3;
                                    int i7 = (i4 & 7) << 3;
                                    long j2 = (jArr2[i6] & (~(255 << i7))) | (254 << i7);
                                    jArr2[i6] = j2;
                                    jArr2[(((i4 - 7) & i5) + (i5 & 7)) >> 3] = j2;
                                    el0Var.oh6vYeIP[i4] = null;
                                }
                            }
                            j >>= 8;
                        }
                        if (i2 != 8) {
                            break;
                        }
                    }
                    if (i == length) {
                        break;
                    }
                    i++;
                }
            }
        }
        return defpackage.ok1.IHQe1A4L2xu;
    }

    @Override // defpackage.k00
    public final java.lang.Object adDC3e2L(java.lang.Object obj, java.lang.Object obj2) {
        defpackage.yn0 yn0Var = (defpackage.yn0) ez2rX8ReCYw((defpackage.ej) obj2, (defpackage.uj) obj);
        defpackage.ok1 ok1Var = defpackage.ok1.IHQe1A4L2xu;
        yn0Var.SyNS6RMn(ok1Var);
        return ok1Var;
    }

    @Override // defpackage.v7
    public final defpackage.ej ez2rX8ReCYw(defpackage.ej ejVar, java.lang.Object obj) {
        return new defpackage.yn0(this.riuEU0zW4, this.SH1y5HwkJhh, this.ez2rX8ReCYw, this.JlrlGoKF, this.DFo87pBq1E5, this.SyNS6RMn, ejVar);
    }
}
