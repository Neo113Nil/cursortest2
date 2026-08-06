package defpackage;

/* loaded from: classes.dex */
public final class jx0 implements defpackage.dc0 {
    public final defpackage.g00 AARZUJiTa;
    public boolean DFo87pBq1E5;
    public defpackage.ki EXtogiMhuM;
    public long EgCjBq0SZwJ;
    public boolean G3OKOH3wZRC;
    public boolean JlrlGoKF;
    public defpackage.ix0 QoRHpC4k;
    public defpackage.za0 SH1y5HwkJhh;
    public java.lang.Object SyNS6RMn;
    public final /* synthetic */ defpackage.q90 V7bD7b8KA;
    public final int adDC3e2L;
    public boolean cnag84Bm;
    public boolean ez2rX8ReCYw;
    public long fnWB2E7cs;
    public boolean kNAkVymC;
    public long kd6TUFXn;
    public defpackage.dd1 riuEU0zW4;
    public final defpackage.v5 xiZrDbcSW0;

    public jx0(defpackage.q90 q90Var, int i, defpackage.v5 v5Var, defpackage.uc0 uc0Var) {
        this.V7bD7b8KA = q90Var;
        this.adDC3e2L = i;
        this.xiZrDbcSW0 = v5Var;
        this.AARZUJiTa = uc0Var;
        int i2 = defpackage.rj0.oh6vYeIP;
        this.fnWB2E7cs = java.lang.System.nanoTime() - defpackage.rj0.IHQe1A4L2xu;
    }

    public final void AARZUJiTa(java.lang.Object obj, java.lang.Object obj2, final defpackage.h7 h7Var) {
        defpackage.za0 za0Var;
        defpackage.za0 za0Var2 = this.SH1y5HwkJhh;
        int i = 0;
        if (za0Var2 == null) {
            defpackage.q90 q90Var = this.V7bD7b8KA;
            defpackage.k00 IHQe1A4L2xu = ((defpackage.sb0) q90Var.oh6vYeIP).IHQe1A4L2xu(this.adDC3e2L, obj, obj2);
            defpackage.ab0 IHQe1A4L2xu2 = ((defpackage.fd1) q90Var.r1MBDhnF).IHQe1A4L2xu();
            if (IHQe1A4L2xu2.adDC3e2L.p4kuH6PDtgom()) {
                IHQe1A4L2xu2.ez2rX8ReCYw(obj, IHQe1A4L2xu, true);
                za0Var = new defpackage.za0(IHQe1A4L2xu2, obj, 1);
            } else {
                za0Var = new defpackage.za0(IHQe1A4L2xu2, obj, i);
            }
            za0Var2 = za0Var;
            this.SH1y5HwkJhh = za0Var2;
            this.SyNS6RMn = obj;
        }
        this.kNAkVymC = false;
        while (!za0Var2.r1MBDhnF() && !this.kNAkVymC) {
            defpackage.r91 r91Var = new defpackage.r91() { // from class: hx0
                @Override // defpackage.r91
                public final boolean IHQe1A4L2xu() {
                    defpackage.jx0 jx0Var = defpackage.jx0.this;
                    if (!jx0Var.kNAkVymC) {
                        jx0Var.SH1y5HwkJhh();
                        long j = jx0Var.EgCjBq0SZwJ;
                        defpackage.h7 h7Var2 = h7Var;
                        h7Var2.IHQe1A4L2xu = defpackage.h7.IHQe1A4L2xu(j, h7Var2.IHQe1A4L2xu);
                        jx0Var.kNAkVymC = !jx0Var.riuEU0zW4(jx0Var.kd6TUFXn, r1 + h7Var2.oh6vYeIP);
                    }
                    return jx0Var.kNAkVymC;
                }
            };
            switch (za0Var2.IHQe1A4L2xu) {
                case 0:
                    break;
                default:
                    defpackage.sa0 oh6vYeIP = za0Var2.oh6vYeIP();
                    defpackage.bu0 bu0Var = oh6vYeIP != null ? oh6vYeIP.xiZrDbcSW0 : null;
                    if (bu0Var != null && !bu0Var.r1MBDhnF()) {
                        defpackage.oa1 QoRHpC4k = defpackage.f70.QoRHpC4k();
                        defpackage.g00 adDC3e2L = QoRHpC4k != null ? QoRHpC4k.adDC3e2L() : null;
                        defpackage.oa1 fnWB2E7cs = defpackage.f70.fnWB2E7cs(QoRHpC4k);
                        try {
                            bu0Var.adDC3e2L(r91Var);
                            break;
                        } finally {
                        }
                    }
                    break;
            }
        }
        SH1y5HwkJhh();
        boolean z = this.kNAkVymC;
        long j = this.EgCjBq0SZwJ;
        if (z) {
            h7Var.oh6vYeIP = defpackage.h7.IHQe1A4L2xu(j, h7Var.oh6vYeIP);
        } else {
            h7Var.IHQe1A4L2xu = defpackage.h7.IHQe1A4L2xu(j, h7Var.IHQe1A4L2xu);
        }
    }

    public final defpackage.ix0 EXtogiMhuM() {
        defpackage.dd1 dd1Var = this.riuEU0zW4;
        if (dd1Var == null) {
            defpackage.a60.oh6vYeIP("Should precompose before resolving nested prefetch states");
            throw new defpackage.cf();
        }
        defpackage.rz0 rz0Var = new defpackage.rz0();
        dd1Var.oh6vYeIP(new defpackage.on0(1, rz0Var));
        java.util.List list = (java.util.List) rz0Var.adDC3e2L;
        if (list != null) {
            return new defpackage.ix0(this, list);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0231 A[Catch: all -> 0x0250, LOOP:2: B:96:0x0205->B:106:0x0231, LOOP_END, TRY_ENTER, TryCatch #0 {all -> 0x0250, blocks: (B:84:0x0170, B:86:0x0178, B:88:0x017e, B:91:0x018c, B:93:0x0199, B:94:0x01f8, B:95:0x01fe, B:96:0x0205, B:98:0x020d, B:103:0x021e, B:104:0x0223, B:106:0x0231, B:113:0x0237, B:115:0x01a1, B:117:0x01b0, B:118:0x01b6, B:123:0x01c6, B:127:0x01e5, B:128:0x01d4, B:131:0x01ec), top: B:83:0x0170 }] */
    /* JADX WARN: Removed duplicated region for block: B:107:0x022d A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean F7NU4MC0GW(defpackage.c3 c3Var) {
        long j;
        boolean z;
        defpackage.g00 g00Var;
        ?? r9;
        int i;
        java.util.List list;
        int i2;
        int i3;
        boolean z2;
        defpackage.dd1 xiZrDbcSW0;
        int i4 = this.adDC3e2L;
        long j2 = i4;
        defpackage.fm.WLpAkxCo("compose:lazy:prefetch:execute:item", j2);
        defpackage.oc0 oc0Var = (defpackage.oc0) ((defpackage.sb0) this.V7bD7b8KA.oh6vYeIP).oh6vYeIP.IHQe1A4L2xu();
        if (!this.JlrlGoKF) {
            int r1MBDhnF = oc0Var.r1MBDhnF();
            if (i4 >= 0 && i4 < r1MBDhnF) {
                java.lang.Object F7NU4MC0GW = oc0Var.F7NU4MC0GW(i4);
                java.lang.Object obj = this.SyNS6RMn;
                if (obj != null && !F7NU4MC0GW.equals(obj)) {
                    oh6vYeIP();
                    return false;
                }
                java.lang.Object oh6vYeIP = oc0Var.oh6vYeIP(i4);
                defpackage.v5 v5Var = this.xiZrDbcSW0;
                defpackage.h7 h7Var = (defpackage.h7) v5Var.F7NU4MC0GW;
                if (v5Var.r1MBDhnF != oh6vYeIP || h7Var == null) {
                    defpackage.nl0 nl0Var = (defpackage.nl0) v5Var.oh6vYeIP;
                    java.lang.Object AARZUJiTa = nl0Var.AARZUJiTa(oh6vYeIP);
                    java.lang.Object obj2 = AARZUJiTa;
                    if (AARZUJiTa == null) {
                        defpackage.h7 h7Var2 = new defpackage.h7();
                        h7Var2.adDC3e2L = -1;
                        nl0Var.DFo87pBq1E5(oh6vYeIP, h7Var2);
                        obj2 = h7Var2;
                    }
                    h7Var = (defpackage.h7) obj2;
                    v5Var.r1MBDhnF = oh6vYeIP;
                    v5Var.F7NU4MC0GW = h7Var;
                }
                adDC3e2L();
                long IHQe1A4L2xu = c3Var.IHQe1A4L2xu();
                this.kd6TUFXn = IHQe1A4L2xu;
                int i5 = defpackage.rj0.oh6vYeIP;
                this.fnWB2E7cs = java.lang.System.nanoTime() - defpackage.rj0.IHQe1A4L2xu;
                this.EgCjBq0SZwJ = 0L;
                defpackage.fm.WLpAkxCo("compose:lazy:prefetch:available_time_nanos", IHQe1A4L2xu);
                if (adDC3e2L()) {
                    j = 0;
                } else {
                    j = 0;
                    if (riuEU0zW4(this.kd6TUFXn, h7Var.IHQe1A4L2xu + h7Var.oh6vYeIP)) {
                        android.os.Trace.beginSection("compose:lazy:prefetch:compose");
                        try {
                            AARZUJiTa(F7NU4MC0GW, oh6vYeIP, h7Var);
                        } finally {
                        }
                    }
                    if (!adDC3e2L()) {
                        return true;
                    }
                }
                defpackage.g00 g00Var2 = null;
                if (this.SH1y5HwkJhh != null) {
                    if (!riuEU0zW4(this.kd6TUFXn, h7Var.r1MBDhnF)) {
                        return true;
                    }
                    android.os.Trace.beginSection("compose:lazy:prefetch:apply");
                    try {
                        defpackage.za0 za0Var = this.SH1y5HwkJhh;
                        if (za0Var == null) {
                            throw new java.lang.IllegalArgumentException("Nothing to apply!");
                        }
                        switch (za0Var.IHQe1A4L2xu) {
                            case 0:
                                xiZrDbcSW0 = za0Var.oh6vYeIP.xiZrDbcSW0(za0Var.r1MBDhnF);
                                break;
                            default:
                                defpackage.ab0 ab0Var = za0Var.oh6vYeIP;
                                defpackage.sa0 oh6vYeIP2 = za0Var.oh6vYeIP();
                                if (oh6vYeIP2 != null) {
                                    ab0Var.F7NU4MC0GW(oh6vYeIP2, false);
                                }
                                xiZrDbcSW0 = ab0Var.xiZrDbcSW0(za0Var.r1MBDhnF);
                                break;
                        }
                        this.riuEU0zW4 = xiZrDbcSW0;
                        this.SH1y5HwkJhh = null;
                        this.DFo87pBq1E5 = true;
                        android.os.Trace.endSection();
                        SH1y5HwkJhh();
                        h7Var.r1MBDhnF = defpackage.h7.IHQe1A4L2xu(this.EgCjBq0SZwJ, h7Var.r1MBDhnF);
                    } finally {
                    }
                }
                if (!this.cnag84Bm) {
                    if (this.kd6TUFXn <= j) {
                        return true;
                    }
                    android.os.Trace.beginSection("compose:lazy:prefetch:resolve-nested");
                    try {
                        this.QoRHpC4k = EXtogiMhuM();
                        this.cnag84Bm = true;
                    } finally {
                    }
                }
                defpackage.ix0 ix0Var = this.QoRHpC4k;
                if (ix0Var != null) {
                    int i6 = h7Var.adDC3e2L;
                    boolean z3 = this.G3OKOH3wZRC;
                    java.util.List[] listArr = ix0Var.oh6vYeIP;
                    int i7 = ix0Var.r1MBDhnF;
                    java.util.List list2 = ix0Var.IHQe1A4L2xu;
                    if (i7 < list2.size()) {
                        if (ix0Var.xiZrDbcSW0.JlrlGoKF) {
                            defpackage.a60.r1MBDhnF("Should not execute nested prefetch on canceled request");
                        }
                        android.os.Trace.beginSection("compose:lazy:prefetch:update_nested_prefetch_count");
                        try {
                            int size = list2.size();
                            for (int i8 = 0; i8 < size; i8++) {
                                ((defpackage.ec0) list2.get(i8)).F7NU4MC0GW = i6;
                            }
                            android.os.Trace.endSection();
                            android.os.Trace.beginSection("compose:lazy:prefetch:nested");
                            while (ix0Var.r1MBDhnF < list2.size()) {
                                try {
                                    if (listArr[ix0Var.r1MBDhnF] != null) {
                                        z = z3;
                                        g00Var = g00Var2;
                                    } else {
                                        if (c3Var.IHQe1A4L2xu() <= j) {
                                            android.os.Trace.endSection();
                                            return true;
                                        }
                                        int i9 = ix0Var.r1MBDhnF;
                                        defpackage.ec0 ec0Var = (defpackage.ec0) list2.get(i9);
                                        defpackage.vc0 vc0Var = ec0Var.IHQe1A4L2xu;
                                        if (vc0Var == null) {
                                            list = defpackage.nt.adDC3e2L;
                                            i = i9;
                                            z = z3;
                                            g00Var = g00Var2;
                                        } else {
                                            int i10 = ec0Var.F7NU4MC0GW;
                                            java.util.ArrayList arrayList = new java.util.ArrayList();
                                            int i11 = vc0Var.adDC3e2L;
                                            defpackage.oa1 QoRHpC4k = defpackage.f70.QoRHpC4k();
                                            if (QoRHpC4k != null) {
                                                g00Var2 = QoRHpC4k.adDC3e2L();
                                            }
                                            defpackage.f70.QQUzIjv3iOC5(QoRHpC4k, defpackage.f70.fnWB2E7cs(QoRHpC4k), g00Var2);
                                            if (i10 == -1) {
                                                i10 = 2;
                                            }
                                            int i12 = 0;
                                            while (i12 < i10) {
                                                int i13 = i11 + i12;
                                                defpackage.q90 q90Var = ec0Var.r1MBDhnF;
                                                if (q90Var == null) {
                                                    i2 = i12;
                                                    i3 = i9;
                                                    z2 = z3;
                                                } else {
                                                    i2 = i12;
                                                    i3 = i9;
                                                    z2 = z3;
                                                    arrayList.add(new defpackage.jx0(q90Var, i13, ec0Var.oh6vYeIP, null));
                                                }
                                                i12 = i2 + 1;
                                                i9 = i3;
                                                z3 = z2;
                                            }
                                            i = i9;
                                            z = z3;
                                            g00Var = null;
                                            ec0Var.xiZrDbcSW0 = arrayList.size();
                                            list = arrayList;
                                        }
                                        listArr[i] = list;
                                    }
                                    java.util.List list3 = listArr[ix0Var.r1MBDhnF];
                                    list3.getClass();
                                    while (ix0Var.F7NU4MC0GW < list3.size()) {
                                        defpackage.jx0 jx0Var = (defpackage.jx0) list3.get(ix0Var.F7NU4MC0GW);
                                        if (z) {
                                            defpackage.jx0 jx0Var2 = jx0Var != null ? jx0Var : g00Var;
                                            if (jx0Var2 != 0) {
                                                r9 = 1;
                                                jx0Var2.G3OKOH3wZRC = true;
                                                ix0Var.adDC3e2L = r9;
                                                if (!jx0Var.r1MBDhnF(c3Var)) {
                                                    return r9;
                                                }
                                                ix0Var.F7NU4MC0GW += r9;
                                            }
                                        }
                                        r9 = 1;
                                        ix0Var.adDC3e2L = r9;
                                        if (!jx0Var.r1MBDhnF(c3Var)) {
                                        }
                                    }
                                    ix0Var.F7NU4MC0GW = 0;
                                    ix0Var.r1MBDhnF++;
                                    g00Var2 = g00Var;
                                    z3 = z;
                                    j = 0;
                                } finally {
                                }
                            }
                        } finally {
                        }
                    }
                }
                defpackage.ix0 ix0Var2 = this.QoRHpC4k;
                if (ix0Var2 != null && ix0Var2.adDC3e2L) {
                    SH1y5HwkJhh();
                    defpackage.fm.WLpAkxCo("compose:lazy:prefetch:execute:item", j2);
                    defpackage.ix0 ix0Var3 = this.QoRHpC4k;
                    if (ix0Var3 != null) {
                        ix0Var3.adDC3e2L = false;
                    }
                }
                defpackage.ki kiVar = this.EXtogiMhuM;
                if (!this.ez2rX8ReCYw && kiVar != null) {
                    if (!riuEU0zW4(this.kd6TUFXn, h7Var.F7NU4MC0GW)) {
                        return true;
                    }
                    android.os.Trace.beginSection("compose:lazy:prefetch:measure");
                    try {
                        xiZrDbcSW0(kiVar.IHQe1A4L2xu);
                        android.os.Trace.endSection();
                        SH1y5HwkJhh();
                        h7Var.F7NU4MC0GW = defpackage.h7.IHQe1A4L2xu(this.EgCjBq0SZwJ, h7Var.F7NU4MC0GW);
                        defpackage.g00 g00Var3 = this.AARZUJiTa;
                        if (g00Var3 != null) {
                            g00Var3.AARZUJiTa(this);
                        }
                    } finally {
                    }
                }
                defpackage.ix0 ix0Var4 = this.QoRHpC4k;
                if (!this.ez2rX8ReCYw || !this.cnag84Bm || ix0Var4 == null) {
                    return false;
                }
                java.util.List list4 = ix0Var4.IHQe1A4L2xu;
                int size2 = list4.size();
                int i14 = Integer.MAX_VALUE;
                for (int i15 = 0; i15 < size2; i15++) {
                    i14 = java.lang.Math.min(i14, ((defpackage.ec0) list4.get(i15)).adDC3e2L);
                }
                int i16 = i14 == Integer.MAX_VALUE ? 0 : i14;
                int i17 = h7Var.adDC3e2L;
                h7Var.adDC3e2L = i17 == -1 ? i16 : ((i17 * 3) + i16) / 4;
                int size3 = list4.size();
                int i18 = Integer.MAX_VALUE;
                for (int i19 = 0; i19 < size3; i19++) {
                    i18 = java.lang.Math.min(i18, ((defpackage.ec0) list4.get(i19)).xiZrDbcSW0);
                }
                if (i18 == Integer.MAX_VALUE) {
                    i18 = 0;
                }
                if (i18 >= i16) {
                    return false;
                }
                h7Var.F7NU4MC0GW = 0L;
                return false;
            }
        }
        oh6vYeIP();
        return false;
    }

    @Override // defpackage.dc0
    public final void IHQe1A4L2xu() {
        this.G3OKOH3wZRC = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void SH1y5HwkJhh() {
        int i;
        int i2 = defpackage.rj0.oh6vYeIP;
        long nanoTime = java.lang.System.nanoTime() - defpackage.rj0.IHQe1A4L2xu;
        long j = this.fnWB2E7cs;
        long j2 = 0;
        if (((j - 1) | 1) == Long.MAX_VALUE) {
            if (nanoTime == j) {
                defpackage.ad1 ad1Var = defpackage.zr.adDC3e2L;
            } else {
                j2 = ((-((j < 0 ? defpackage.zr.AARZUJiTa : defpackage.zr.xiZrDbcSW0) >> 1)) << 1) + (((int) r3) & 1);
                int i3 = defpackage.as.IHQe1A4L2xu;
            }
        } else {
            if ((1 | (nanoTime - 1)) != Long.MAX_VALUE) {
                long j3 = nanoTime - j;
                i = 1;
                long j4 = (~(j3 ^ j)) & (j3 ^ nanoTime);
                defpackage.bs bsVar = defpackage.bs.NANOSECONDS;
                if (j4 < 0) {
                    defpackage.bs bsVar2 = defpackage.bs.MILLISECONDS;
                    if (bsVar.compareTo(bsVar2) < 0) {
                        long j5 = (nanoTime / 1000000) - (j / 1000000);
                        long j6 = (nanoTime % 1000000) - (j % 1000000);
                        defpackage.ad1 ad1Var2 = defpackage.zr.adDC3e2L;
                        j2 = defpackage.zr.oh6vYeIP(defpackage.x70.wKlPRKlRnfqr(j5, bsVar2), defpackage.x70.wKlPRKlRnfqr(j6, bsVar));
                    } else {
                        j2 = ((-((j3 < 0 ? defpackage.zr.AARZUJiTa : defpackage.zr.xiZrDbcSW0) >> 1)) << 1) + (((int) r3) & 1);
                        int i4 = defpackage.as.IHQe1A4L2xu;
                    }
                } else {
                    j2 = defpackage.x70.wKlPRKlRnfqr(j3, bsVar);
                }
                long j7 = j2 >> i;
                defpackage.ad1 ad1Var3 = defpackage.zr.adDC3e2L;
                long j8 = (((int) j2) & i) != 0 ? j7 : j7 > 9223372036854L ? Long.MAX_VALUE : j7 < -9223372036854L ? Long.MIN_VALUE : j7 * 1000000;
                this.EgCjBq0SZwJ = j8;
                long j9 = this.kd6TUFXn - j8;
                this.kd6TUFXn = j9;
                this.fnWB2E7cs = nanoTime;
                defpackage.fm.WLpAkxCo("compose:lazy:prefetch:available_time_nanos", j9);
            }
            j2 = nanoTime < 0 ? defpackage.zr.AARZUJiTa : defpackage.zr.xiZrDbcSW0;
        }
        i = 1;
        long j72 = j2 >> i;
        defpackage.ad1 ad1Var32 = defpackage.zr.adDC3e2L;
        if ((((int) j2) & i) != 0) {
        }
        this.EgCjBq0SZwJ = j8;
        long j92 = this.kd6TUFXn - j8;
        this.kd6TUFXn = j92;
        this.fnWB2E7cs = nanoTime;
        defpackage.fm.WLpAkxCo("compose:lazy:prefetch:available_time_nanos", j92);
    }

    public final boolean adDC3e2L() {
        defpackage.za0 za0Var;
        return this.DFo87pBq1E5 || ((za0Var = this.SH1y5HwkJhh) != null && za0Var.r1MBDhnF());
    }

    @Override // defpackage.dc0
    public final void cancel() {
        if (this.JlrlGoKF) {
            return;
        }
        this.JlrlGoKF = true;
        oh6vYeIP();
    }

    public final void oh6vYeIP() {
        defpackage.za0 za0Var = this.SH1y5HwkJhh;
        if (za0Var != null) {
            switch (za0Var.IHQe1A4L2xu) {
                case 0:
                    break;
                default:
                    defpackage.sa0 oh6vYeIP = za0Var.oh6vYeIP();
                    if ((oh6vYeIP != null ? oh6vYeIP.xiZrDbcSW0 : null) != null) {
                        defpackage.ab0.r1MBDhnF(za0Var.oh6vYeIP, za0Var.r1MBDhnF);
                        break;
                    }
                    break;
            }
        }
        this.SH1y5HwkJhh = null;
        defpackage.dd1 dd1Var = this.riuEU0zW4;
        if (dd1Var != null) {
            dd1Var.IHQe1A4L2xu();
        }
        this.riuEU0zW4 = null;
        this.QoRHpC4k = null;
    }

    public final boolean r1MBDhnF(defpackage.c3 c3Var) {
        boolean F7NU4MC0GW;
        if (!this.V7bD7b8KA.IHQe1A4L2xu) {
            return false;
        }
        if (this.G3OKOH3wZRC) {
            android.os.Trace.beginSection("compose:lazy:prefetch:execute:urgent");
            try {
                F7NU4MC0GW = F7NU4MC0GW(c3Var);
            } finally {
                android.os.Trace.endSection();
            }
        } else {
            F7NU4MC0GW = F7NU4MC0GW(c3Var);
        }
        defpackage.fm.WLpAkxCo("compose:lazy:prefetch:execute:item", -1L);
        return F7NU4MC0GW;
    }

    public final boolean riuEU0zW4(long j, long j2) {
        if (this.G3OKOH3wZRC) {
            j2 = 0;
        }
        return j > j2;
    }

    public final java.lang.String toString() {
        return "HandleAndRequestImpl { index = " + this.adDC3e2L + ", constraints = " + this.EXtogiMhuM + ", isComposed = " + adDC3e2L() + ", isMeasured = " + this.ez2rX8ReCYw + ", isCanceled = " + this.JlrlGoKF + " }";
    }

    public final void xiZrDbcSW0(long j) {
        if (this.JlrlGoKF) {
            defpackage.a60.IHQe1A4L2xu("Callers should check whether the request is still valid before calling performMeasure()");
        }
        if (this.ez2rX8ReCYw) {
            defpackage.a60.IHQe1A4L2xu("Request was already measured!");
        }
        this.ez2rX8ReCYw = true;
        defpackage.dd1 dd1Var = this.riuEU0zW4;
        if (dd1Var == null) {
            defpackage.a60.oh6vYeIP("performComposition() must be called before performMeasure()");
            throw new defpackage.cf();
        }
        int r1MBDhnF = dd1Var.r1MBDhnF();
        for (int i = 0; i < r1MBDhnF; i++) {
            dd1Var.F7NU4MC0GW(i, j);
        }
    }
}
