package defpackage;

/* loaded from: classes.dex */
public final class na0 {
    public final /* synthetic */ int EXtogiMhuM;
    public boolean F7NU4MC0GW;
    public final defpackage.t IHQe1A4L2xu;
    public boolean adDC3e2L;
    public boolean r1MBDhnF;
    public defpackage.t xiZrDbcSW0;
    public boolean oh6vYeIP = true;
    public final java.util.HashMap AARZUJiTa = new java.util.HashMap();

    public na0(defpackage.t tVar, int i) {
        this.EXtogiMhuM = i;
        this.IHQe1A4L2xu = tVar;
    }

    public static final void IHQe1A4L2xu(defpackage.na0 na0Var, defpackage.o oVar, int i, defpackage.ip0 ip0Var) {
        java.util.HashMap hashMap = na0Var.AARZUJiTa;
        float f = i;
        long floatToRawIntBits = java.lang.Float.floatToRawIntBits(f) << 32;
        long floatToRawIntBits2 = java.lang.Float.floatToRawIntBits(f) & 4294967295L;
        while (true) {
            long j = floatToRawIntBits | floatToRawIntBits2;
            do {
                switch (na0Var.EXtogiMhuM) {
                    case 0:
                        defpackage.ss0 ss0Var = ip0Var.hkbnNdmy;
                        if (ss0Var != null) {
                            defpackage.t20 t20Var = (defpackage.t20) ss0Var;
                            float[] oh6vYeIP = t20Var.oh6vYeIP();
                            if (!t20Var.PAEGRtP0bX) {
                                j = defpackage.c80.C0U8sNJm(oh6vYeIP, j);
                            }
                        }
                        j = defpackage.a70.PAEGRtP0bX(j, ip0Var.v5iciZok);
                        break;
                    default:
                        defpackage.bg0 QuX7t5UZl9 = ip0Var.QuX7t5UZl9();
                        QuX7t5UZl9.getClass();
                        long j2 = QuX7t5UZl9.fnWB2E7cs;
                        j = defpackage.gq0.adDC3e2L((java.lang.Float.floatToRawIntBits((int) (j2 & 4294967295L)) & 4294967295L) | (java.lang.Float.floatToRawIntBits((int) (j2 >> 32)) << 32), j);
                        break;
                }
                ip0Var = ip0Var.kNAkVymC;
                ip0Var.getClass();
                if (ip0Var.equals(na0Var.IHQe1A4L2xu.kNAkVymC())) {
                    int round = java.lang.Math.round(oVar instanceof defpackage.g40 ? java.lang.Float.intBitsToFloat((int) (j & 4294967295L)) : java.lang.Float.intBitsToFloat((int) (j >> 32)));
                    if (hashMap.containsKey(oVar)) {
                        int intValue = ((java.lang.Number) defpackage.yh0.p4kuH6PDtgom(oVar, hashMap)).intValue();
                        defpackage.g40 g40Var = defpackage.r.IHQe1A4L2xu;
                        round = ((java.lang.Number) oVar.IHQe1A4L2xu.adDC3e2L(java.lang.Integer.valueOf(intValue), java.lang.Integer.valueOf(round))).intValue();
                    }
                    hashMap.put(oVar, java.lang.Integer.valueOf(round));
                    return;
                }
            } while (!na0Var.oh6vYeIP(ip0Var).containsKey(oVar));
            float r1MBDhnF = na0Var.r1MBDhnF(ip0Var, oVar);
            long floatToRawIntBits3 = java.lang.Float.floatToRawIntBits(r1MBDhnF);
            long floatToRawIntBits4 = java.lang.Float.floatToRawIntBits(r1MBDhnF);
            floatToRawIntBits = floatToRawIntBits3 << 32;
            floatToRawIntBits2 = floatToRawIntBits4 & 4294967295L;
        }
    }

    public final void AARZUJiTa() {
        java.util.HashMap hashMap = this.AARZUJiTa;
        hashMap.clear();
        defpackage.s sVar = new defpackage.s(0, this);
        defpackage.t tVar = this.IHQe1A4L2xu;
        tVar.DFo87pBq1E5(sVar);
        hashMap.putAll(oh6vYeIP(tVar.kNAkVymC()));
        this.oh6vYeIP = false;
    }

    public final void EXtogiMhuM() {
        defpackage.na0 IHQe1A4L2xu;
        defpackage.na0 IHQe1A4L2xu2;
        boolean F7NU4MC0GW = F7NU4MC0GW();
        defpackage.t tVar = this.IHQe1A4L2xu;
        if (!F7NU4MC0GW) {
            defpackage.t V7bD7b8KA = tVar.V7bD7b8KA();
            if (V7bD7b8KA == null) {
                return;
            }
            tVar = V7bD7b8KA.IHQe1A4L2xu().xiZrDbcSW0;
            if (tVar == null || !tVar.IHQe1A4L2xu().F7NU4MC0GW()) {
                defpackage.t tVar2 = this.xiZrDbcSW0;
                if (tVar2 == null || tVar2.IHQe1A4L2xu().F7NU4MC0GW()) {
                    return;
                }
                defpackage.t V7bD7b8KA2 = tVar2.V7bD7b8KA();
                if (V7bD7b8KA2 != null && (IHQe1A4L2xu2 = V7bD7b8KA2.IHQe1A4L2xu()) != null) {
                    IHQe1A4L2xu2.EXtogiMhuM();
                }
                defpackage.t V7bD7b8KA3 = tVar2.V7bD7b8KA();
                tVar = (V7bD7b8KA3 == null || (IHQe1A4L2xu = V7bD7b8KA3.IHQe1A4L2xu()) == null) ? null : IHQe1A4L2xu.xiZrDbcSW0;
            }
        }
        this.xiZrDbcSW0 = tVar;
    }

    public final boolean F7NU4MC0GW() {
        return this.r1MBDhnF || this.F7NU4MC0GW || this.adDC3e2L;
    }

    public final boolean adDC3e2L() {
        EXtogiMhuM();
        return this.xiZrDbcSW0 != null;
    }

    public final java.util.Map oh6vYeIP(defpackage.ip0 ip0Var) {
        switch (this.EXtogiMhuM) {
            case 0:
                return ip0Var.seT5W8IHOge().IHQe1A4L2xu();
            default:
                defpackage.bg0 QuX7t5UZl9 = ip0Var.QuX7t5UZl9();
                QuX7t5UZl9.getClass();
                return QuX7t5UZl9.seT5W8IHOge().IHQe1A4L2xu();
        }
    }

    public final int r1MBDhnF(defpackage.ip0 ip0Var, defpackage.o oVar) {
        switch (this.EXtogiMhuM) {
            case 0:
                return ip0Var.k3hcgHS3MP(oVar);
            default:
                defpackage.bg0 QuX7t5UZl9 = ip0Var.QuX7t5UZl9();
                QuX7t5UZl9.getClass();
                return QuX7t5UZl9.k3hcgHS3MP(oVar);
        }
    }

    public final void xiZrDbcSW0() {
        this.oh6vYeIP = true;
        defpackage.t tVar = this.IHQe1A4L2xu;
        defpackage.t V7bD7b8KA = tVar.V7bD7b8KA();
        if (V7bD7b8KA == null) {
            return;
        }
        if (this.r1MBDhnF) {
            V7bD7b8KA.requestLayout();
        }
        if (this.F7NU4MC0GW) {
            tVar.wKlPRKlRnfqr();
        }
        if (this.adDC3e2L) {
            tVar.requestLayout();
        }
        V7bD7b8KA.IHQe1A4L2xu().xiZrDbcSW0();
    }
}
