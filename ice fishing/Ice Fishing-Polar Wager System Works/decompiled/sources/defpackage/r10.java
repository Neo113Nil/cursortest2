package defpackage;

/* loaded from: classes.dex */
public final class r10 extends defpackage.fh {
    public final /* synthetic */ defpackage.t10 AARZUJiTa;
    public java.util.HashSet F7NU4MC0GW;
    public final long IHQe1A4L2xu;
    public final defpackage.ol0 adDC3e2L;
    public final boolean oh6vYeIP;
    public final boolean r1MBDhnF;
    public final defpackage.qt0 xiZrDbcSW0;

    public r10(defpackage.t10 t10Var, long j, boolean z, boolean z2, defpackage.c1NqjJifC7 c1nqjjifc7) {
        this.AARZUJiTa = t10Var;
        this.IHQe1A4L2xu = j;
        this.oh6vYeIP = z;
        this.r1MBDhnF = z2;
        defpackage.ol0 ol0Var = defpackage.a51.IHQe1A4L2xu;
        this.adDC3e2L = new defpackage.ol0();
        this.xiZrDbcSW0 = new defpackage.qt0(defpackage.gu0.EXtogiMhuM, defpackage.n.AsxAYCCkb3Hi);
    }

    @Override // defpackage.fh
    public final long AARZUJiTa() {
        return this.IHQe1A4L2xu;
    }

    @Override // defpackage.fh
    public final defpackage.ik0 DFo87pBq1E5(defpackage.jk0 jk0Var) {
        return this.AARZUJiTa.oh6vYeIP.DFo87pBq1E5(jk0Var);
    }

    @Override // defpackage.fh
    public final defpackage.eh EXtogiMhuM() {
        return this.AARZUJiTa.EXtogiMhuM;
    }

    @Override // defpackage.fh
    public final defpackage.eb EgCjBq0SZwJ(defpackage.s4 s4Var) {
        return this.AARZUJiTa.oh6vYeIP.EgCjBq0SZwJ(s4Var);
    }

    @Override // defpackage.fh
    public final boolean F7NU4MC0GW() {
        return this.AARZUJiTa.oh6vYeIP.F7NU4MC0GW();
    }

    @Override // defpackage.fh
    public final void G3OKOH3wZRC(defpackage.az0 az0Var) {
        this.AARZUJiTa.oh6vYeIP.G3OKOH3wZRC(az0Var);
    }

    @Override // defpackage.fh
    public final void IHQe1A4L2xu(defpackage.kh khVar, defpackage.k00 k00Var) {
        this.AARZUJiTa.oh6vYeIP.IHQe1A4L2xu(khVar, k00Var);
    }

    @Override // defpackage.fh
    public final void JlrlGoKF(defpackage.kh khVar) {
        defpackage.t10 t10Var = this.AARZUJiTa;
        t10Var.oh6vYeIP.JlrlGoKF(t10Var.EXtogiMhuM);
        t10Var.oh6vYeIP.JlrlGoKF(khVar);
    }

    public final void PAEGRtP0bX() {
        defpackage.ol0 ol0Var = this.adDC3e2L;
        if (ol0Var.EXtogiMhuM()) {
            java.util.HashSet hashSet = this.F7NU4MC0GW;
            if (hashSet != null) {
                java.lang.Object[] objArr = ol0Var.oh6vYeIP;
                long[] jArr = ol0Var.IHQe1A4L2xu;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i = 0;
                    while (true) {
                        long j = jArr[i];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i2 = 8 - ((~(i - length)) >>> 31);
                            for (int i3 = 0; i3 < i2; i3++) {
                                if ((255 & j) < 128) {
                                    defpackage.t10 t10Var = (defpackage.t10) objArr[(i << 3) + i3];
                                    java.util.Iterator it = hashSet.iterator();
                                    while (it.hasNext()) {
                                        ((java.util.Set) it.next()).remove(t10Var.PAEGRtP0bX());
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
                        } else {
                            i++;
                        }
                    }
                }
            }
            ol0Var.oh6vYeIP();
        }
    }

    @Override // defpackage.fh
    public final void QoRHpC4k(defpackage.t10 t10Var) {
        this.adDC3e2L.IHQe1A4L2xu(t10Var);
    }

    @Override // defpackage.fh
    public final defpackage.lj SH1y5HwkJhh() {
        return this.AARZUJiTa.oh6vYeIP.SH1y5HwkJhh();
    }

    @Override // defpackage.fh
    public final defpackage.ol0 SyNS6RMn(defpackage.kh khVar, defpackage.r91 r91Var, defpackage.ol0 ol0Var) {
        return this.AARZUJiTa.oh6vYeIP.SyNS6RMn(khVar, r91Var, ol0Var);
    }

    @Override // defpackage.fh
    public final void V7bD7b8KA(defpackage.kh khVar) {
        this.AARZUJiTa.oh6vYeIP.V7bD7b8KA(khVar);
    }

    @Override // defpackage.fh
    public final boolean adDC3e2L() {
        return this.oh6vYeIP;
    }

    @Override // defpackage.fh
    public final void cnag84Bm(java.util.Set set) {
        java.util.HashSet hashSet = this.F7NU4MC0GW;
        if (hashSet == null) {
            hashSet = new java.util.HashSet();
            this.F7NU4MC0GW = hashSet;
        }
        hashSet.add(set);
    }

    @Override // defpackage.fh
    public final boolean ez2rX8ReCYw() {
        return this.AARZUJiTa.oh6vYeIP.ez2rX8ReCYw();
    }

    @Override // defpackage.fh
    public final void fnWB2E7cs() {
        this.AARZUJiTa.C0U8sNJm++;
    }

    @Override // defpackage.fh
    public final void kNAkVymC(defpackage.t10 t10Var) {
        java.util.HashSet hashSet = this.F7NU4MC0GW;
        if (hashSet != null) {
            java.util.Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                java.util.Set set = (java.util.Set) it.next();
                t10Var.getClass();
                set.remove(t10Var.PAEGRtP0bX());
            }
        }
        if (t10Var != null) {
            this.adDC3e2L.JlrlGoKF(t10Var);
        }
    }

    @Override // defpackage.fh
    public final void kd6TUFXn(defpackage.kh khVar) {
        this.AARZUJiTa.oh6vYeIP.kd6TUFXn(khVar);
    }

    @Override // defpackage.fh
    public final defpackage.ol0 oh6vYeIP(defpackage.kh khVar, defpackage.r91 r91Var, defpackage.k00 k00Var) {
        return this.AARZUJiTa.oh6vYeIP.oh6vYeIP(khVar, r91Var, k00Var);
    }

    @Override // defpackage.fh
    public final void r1MBDhnF() {
        defpackage.t10 t10Var = this.AARZUJiTa;
        t10Var.C0U8sNJm--;
    }

    @Override // defpackage.fh
    public final defpackage.gu0 riuEU0zW4() {
        return (defpackage.gu0) this.xiZrDbcSW0.getValue();
    }

    @Override // defpackage.fh
    public final boolean xiZrDbcSW0() {
        return this.r1MBDhnF;
    }
}
