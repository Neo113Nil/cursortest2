package defpackage;

/* loaded from: classes.dex */
public final class va0 implements defpackage.ji0 {
    public final /* synthetic */ int F7NU4MC0GW;
    public final /* synthetic */ int IHQe1A4L2xu;
    public final /* synthetic */ defpackage.ji0 adDC3e2L;
    public final /* synthetic */ defpackage.ji0 oh6vYeIP;
    public final /* synthetic */ defpackage.ab0 r1MBDhnF;

    public /* synthetic */ va0(defpackage.ji0 ji0Var, defpackage.ab0 ab0Var, int i, defpackage.ji0 ji0Var2, int i2) {
        this.IHQe1A4L2xu = i2;
        this.r1MBDhnF = ab0Var;
        this.F7NU4MC0GW = i;
        this.adDC3e2L = ji0Var2;
        this.oh6vYeIP = ji0Var;
    }

    @Override // defpackage.ji0
    public final defpackage.g00 F7NU4MC0GW() {
        switch (this.IHQe1A4L2xu) {
        }
        return this.oh6vYeIP.F7NU4MC0GW();
    }

    @Override // defpackage.ji0
    public final java.util.Map IHQe1A4L2xu() {
        switch (this.IHQe1A4L2xu) {
        }
        return this.oh6vYeIP.IHQe1A4L2xu();
    }

    @Override // defpackage.ji0
    public final int adDC3e2L() {
        switch (this.IHQe1A4L2xu) {
        }
        return this.oh6vYeIP.adDC3e2L();
    }

    @Override // defpackage.ji0
    public final void oh6vYeIP() {
        int i;
        int i2 = this.IHQe1A4L2xu;
        defpackage.ji0 ji0Var = this.adDC3e2L;
        int i3 = this.F7NU4MC0GW;
        defpackage.ab0 ab0Var = this.r1MBDhnF;
        switch (i2) {
            case 0:
                ab0Var.riuEU0zW4 = i3;
                ji0Var.oh6vYeIP();
                defpackage.xl0 xl0Var = ab0Var.G3OKOH3wZRC;
                defpackage.nl0 nl0Var = ab0Var.QoRHpC4k;
                long[] jArr = nl0Var.IHQe1A4L2xu;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i4 = 0;
                    while (true) {
                        long j = jArr[i4];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i5 = 8;
                            int i6 = 8 - ((~(i4 - length)) >>> 31);
                            int i7 = 0;
                            while (i7 < i6) {
                                if ((255 & j) < 128) {
                                    int i8 = (i4 << 3) + i7;
                                    java.lang.Object obj = nl0Var.oh6vYeIP[i8];
                                    defpackage.dd1 dd1Var = (defpackage.dd1) nl0Var.r1MBDhnF[i8];
                                    int riuEU0zW4 = xl0Var.riuEU0zW4(obj);
                                    if (riuEU0zW4 < 0 || riuEU0zW4 >= ab0Var.riuEU0zW4) {
                                        if (riuEU0zW4 >= 0) {
                                            java.lang.Object obj2 = defpackage.h1.abhbClRa;
                                            i = i5;
                                            java.lang.Object[] objArr = xl0Var.adDC3e2L;
                                            java.lang.Object obj3 = objArr[riuEU0zW4];
                                            objArr[riuEU0zW4] = obj2;
                                        } else {
                                            i = i5;
                                        }
                                        if (ab0Var.SyNS6RMn.oh6vYeIP(obj)) {
                                            dd1Var.IHQe1A4L2xu();
                                        }
                                        nl0Var.JlrlGoKF(i8);
                                        j >>= i;
                                        i7++;
                                        i5 = i;
                                    }
                                }
                                i = i5;
                                j >>= i;
                                i7++;
                                i5 = i;
                            }
                            if (i6 != i5) {
                            }
                        }
                        if (i4 != length) {
                            i4++;
                        }
                    }
                }
                ab0Var.AARZUJiTa(ab0Var.EXtogiMhuM);
                break;
            default:
                ab0Var.EXtogiMhuM = i3;
                ji0Var.oh6vYeIP();
                if (ab0Var.adDC3e2L.JlrlGoKF == null) {
                    ab0Var.AARZUJiTa(ab0Var.EXtogiMhuM);
                    break;
                }
                break;
        }
    }

    @Override // defpackage.ji0
    public final int r1MBDhnF() {
        switch (this.IHQe1A4L2xu) {
        }
        return this.oh6vYeIP.r1MBDhnF();
    }
}
