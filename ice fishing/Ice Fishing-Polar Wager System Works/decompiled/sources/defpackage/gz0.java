package defpackage;

/* loaded from: classes.dex */
public final class gz0 extends defpackage.fh {
    public java.util.List AARZUJiTa;
    public final defpackage.F7NU4MC0GW DFo87pBq1E5;
    public defpackage.ol0 EXtogiMhuM;
    public final defpackage.hc1 EgCjBq0SZwJ;
    public defpackage.u80 F7NU4MC0GW;
    public defpackage.ol0 G3OKOH3wZRC;
    public final defpackage.o3 IHQe1A4L2xu;
    public final defpackage.nl0 JlrlGoKF;
    public final defpackage.ky NHJTzaLwkd;
    public final defpackage.w80 PAEGRtP0bX;
    public java.util.ArrayList QoRHpC4k;
    public final java.util.ArrayList SH1y5HwkJhh;
    public final defpackage.nl0 SyNS6RMn;
    public final defpackage.v5 V7bD7b8KA;
    public final defpackage.lj abhbClRa;
    public java.lang.Throwable adDC3e2L;
    public final defpackage.nl0 cnag84Bm;
    public final java.util.ArrayList ez2rX8ReCYw;
    public boolean fnWB2E7cs;
    public final defpackage.hc1 kNAkVymC;
    public defpackage.bb kd6TUFXn;
    public final defpackage.v5 oh6vYeIP;
    public final java.lang.Object r1MBDhnF;
    public final defpackage.xl0 riuEU0zW4;
    public final java.util.ArrayList xiZrDbcSW0;
    public static final defpackage.hc1 QQUzIjv3iOC5 = defpackage.gq1.F7NU4MC0GW(defpackage.qu0.EXtogiMhuM);
    public static final java.util.concurrent.atomic.AtomicReference C0U8sNJm = new java.util.concurrent.atomic.AtomicReference(java.lang.Boolean.FALSE);

    public gz0(defpackage.lj ljVar) {
        defpackage.o3 o3Var = new defpackage.o3(new defpackage.bz0(this, 0));
        this.IHQe1A4L2xu = o3Var;
        this.oh6vYeIP = new defpackage.v5(new defpackage.bz0(this, 1));
        this.r1MBDhnF = new java.lang.Object();
        this.xiZrDbcSW0 = new java.util.ArrayList();
        this.EXtogiMhuM = new defpackage.ol0();
        this.riuEU0zW4 = new defpackage.xl0(new defpackage.kh[16]);
        this.SH1y5HwkJhh = new java.util.ArrayList();
        this.ez2rX8ReCYw = new java.util.ArrayList();
        this.JlrlGoKF = new defpackage.nl0();
        this.DFo87pBq1E5 = new defpackage.F7NU4MC0GW(16);
        this.SyNS6RMn = new defpackage.nl0();
        this.cnag84Bm = new defpackage.nl0();
        this.EgCjBq0SZwJ = defpackage.gq1.F7NU4MC0GW(null);
        this.kNAkVymC = defpackage.gq1.F7NU4MC0GW(defpackage.dz0.AARZUJiTa);
        this.V7bD7b8KA = new defpackage.v5(14);
        defpackage.w80 w80Var = new defpackage.w80((defpackage.u80) ljVar.cnag84Bm(defpackage.n.lpprD5VAS));
        w80Var.kNAkVymC(new defpackage.DFo87pBq1E5(21, this));
        this.PAEGRtP0bX = w80Var;
        this.abhbClRa = ljVar.JlrlGoKF(o3Var).JlrlGoKF(w80Var);
        this.NHJTzaLwkd = new defpackage.ky(26);
    }

    public static void PAEGRtP0bX(defpackage.rl0 rl0Var) {
        try {
            if (rl0Var.PAEGRtP0bX() instanceof defpackage.qa1) {
                throw new java.lang.IllegalStateException("Unsupported concurrent change during composition. A state object was modified by composition as well as being modified outside composition.");
            }
        } finally {
            rl0Var.r1MBDhnF();
        }
    }

    public static final void SiPhmbmu(java.util.ArrayList arrayList, defpackage.gz0 gz0Var, defpackage.kh khVar) {
        arrayList.clear();
        synchronized (gz0Var.r1MBDhnF) {
            java.util.Iterator it = gz0Var.ez2rX8ReCYw.iterator();
            if (it.hasNext()) {
                ((defpackage.jk0) it.next()).getClass();
                throw null;
            }
        }
    }

    @Override // defpackage.fh
    public final long AARZUJiTa() {
        return 1000L;
    }

    public final boolean C0U8sNJm() {
        return this.riuEU0zW4.AARZUJiTa != 0 || QQUzIjv3iOC5() || UsuH8pd5P() || this.JlrlGoKF.SH1y5HwkJhh();
    }

    public final void D2vUnMij() {
        defpackage.ab NHJTzaLwkd;
        synchronized (this.r1MBDhnF) {
            NHJTzaLwkd = NHJTzaLwkd();
            if (((defpackage.dz0) this.kNAkVymC.getValue()).compareTo(defpackage.dz0.xiZrDbcSW0) <= 0) {
                java.lang.Throwable th = this.adDC3e2L;
                java.util.concurrent.CancellationException cancellationException = new java.util.concurrent.CancellationException("Recomposer shutdown; frame clock awaiter will never resume");
                cancellationException.initCause(th);
                throw cancellationException;
            }
        }
        if (NHJTzaLwkd != null) {
            ((defpackage.bb) NHJTzaLwkd).SH1y5HwkJhh(defpackage.ok1.IHQe1A4L2xu);
        }
    }

    @Override // defpackage.fh
    public final defpackage.ik0 DFo87pBq1E5(defpackage.jk0 jk0Var) {
        defpackage.ik0 ik0Var;
        synchronized (this.r1MBDhnF) {
            ik0Var = (defpackage.ik0) this.SyNS6RMn.ez2rX8ReCYw(jk0Var);
        }
        return ik0Var;
    }

    @Override // defpackage.fh
    public final defpackage.eh EXtogiMhuM() {
        return null;
    }

    @Override // defpackage.fh
    public final defpackage.eb EgCjBq0SZwJ(defpackage.s4 s4Var) {
        defpackage.v5 v5Var = this.oh6vYeIP;
        defpackage.m7 m7Var = (defpackage.m7) v5Var.r1MBDhnF;
        defpackage.ap0 ap0Var = new defpackage.ap0();
        ap0Var.IHQe1A4L2xu = s4Var;
        return m7Var.F7NU4MC0GW(ap0Var, (defpackage.DSux0S2nxMSk) v5Var.F7NU4MC0GW);
    }

    @Override // defpackage.fh
    public final boolean F7NU4MC0GW() {
        return ((java.lang.Boolean) C0U8sNJm.get()).booleanValue();
    }

    @Override // defpackage.fh
    public final void G3OKOH3wZRC(defpackage.az0 az0Var) {
        defpackage.v5 v5Var = this.V7bD7b8KA;
        defpackage.ol0 ol0Var = (defpackage.ol0) v5Var.adDC3e2L();
        if (ol0Var == null) {
            defpackage.ol0 ol0Var2 = defpackage.a51.IHQe1A4L2xu;
            ol0Var = new defpackage.ol0();
            v5Var.cnag84Bm(ol0Var);
        }
        ol0Var.IHQe1A4L2xu(az0Var);
    }

    @Override // defpackage.fh
    public final void IHQe1A4L2xu(defpackage.kh khVar, defpackage.k00 k00Var) {
        defpackage.dz0 dz0Var;
        boolean contains;
        defpackage.rl0 nBH8hAHy;
        boolean z = khVar.QQUzIjv3iOC5.frpfPPIgqM9O;
        synchronized (this.r1MBDhnF) {
            defpackage.dz0 dz0Var2 = (defpackage.dz0) this.kNAkVymC.getValue();
            dz0Var = defpackage.dz0.xiZrDbcSW0;
            contains = dz0Var2.compareTo(dz0Var) > 0 ? true ^ v5iciZok().contains(khVar) : true;
        }
        try {
            defpackage.DFo87pBq1E5 dFo87pBq1E5 = new defpackage.DFo87pBq1E5(20, khVar);
            defpackage.r1MBDhnF r1mbdhnf = new defpackage.r1MBDhnF(21, khVar, null);
            defpackage.oa1 SH1y5HwkJhh = defpackage.wa1.SH1y5HwkJhh();
            defpackage.rl0 rl0Var = SH1y5HwkJhh instanceof defpackage.rl0 ? (defpackage.rl0) SH1y5HwkJhh : null;
            if (rl0Var == null || (nBH8hAHy = rl0Var.nBH8hAHy(dFo87pBq1E5, r1mbdhnf)) == null) {
                throw new java.lang.IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
            }
            try {
                defpackage.oa1 SH1y5HwkJhh2 = nBH8hAHy.SH1y5HwkJhh();
                try {
                    khVar.SH1y5HwkJhh(k00Var);
                    synchronized (this.r1MBDhnF) {
                        if (((defpackage.dz0) this.kNAkVymC.getValue()).compareTo(dz0Var) > 0 && !v5iciZok().contains(khVar)) {
                            this.xiZrDbcSW0.add(khVar);
                            this.AARZUJiTa = null;
                        }
                    }
                    if (!z) {
                        defpackage.wa1.SH1y5HwkJhh().DFo87pBq1E5();
                    }
                    try {
                        frpfPPIgqM9O(khVar);
                        try {
                            khVar.F7NU4MC0GW();
                            khVar.xiZrDbcSW0();
                            if (z) {
                                return;
                            }
                            defpackage.wa1.SH1y5HwkJhh().DFo87pBq1E5();
                        } catch (java.lang.Throwable th) {
                            wll2JLbTBC2(th, null);
                        }
                    } catch (java.lang.Throwable th2) {
                        wll2JLbTBC2(th2, khVar);
                    }
                } finally {
                    defpackage.oa1.G3OKOH3wZRC(SH1y5HwkJhh2);
                }
            } finally {
                PAEGRtP0bX(nBH8hAHy);
            }
        } catch (java.lang.Throwable th3) {
            if (contains) {
                synchronized (this.r1MBDhnF) {
                }
            }
            wll2JLbTBC2(th3, khVar);
        }
    }

    @Override // defpackage.fh
    public final void JlrlGoKF(defpackage.kh khVar) {
        defpackage.ab abVar;
        synchronized (this.r1MBDhnF) {
            if (this.riuEU0zW4.EXtogiMhuM(khVar)) {
                abVar = null;
            } else {
                this.riuEU0zW4.oh6vYeIP(khVar);
                abVar = NHJTzaLwkd();
            }
        }
        if (abVar != null) {
            ((defpackage.bb) abVar).SH1y5HwkJhh(defpackage.ok1.IHQe1A4L2xu);
        }
    }

    public final defpackage.ab NHJTzaLwkd() {
        defpackage.hc1 hc1Var = this.kNAkVymC;
        int compareTo = ((defpackage.dz0) hc1Var.getValue()).compareTo(defpackage.dz0.xiZrDbcSW0);
        defpackage.hc1 hc1Var2 = this.EgCjBq0SZwJ;
        java.util.ArrayList arrayList = this.ez2rX8ReCYw;
        java.util.ArrayList arrayList2 = this.SH1y5HwkJhh;
        defpackage.xl0 xl0Var = this.riuEU0zW4;
        if (compareTo > 0) {
            java.lang.Object value = hc1Var2.getValue();
            defpackage.dz0 dz0Var = defpackage.dz0.SH1y5HwkJhh;
            defpackage.dz0 dz0Var2 = defpackage.dz0.AARZUJiTa;
            if (value == null) {
                if (this.F7NU4MC0GW == null) {
                    this.EXtogiMhuM = new defpackage.ol0();
                    xl0Var.AARZUJiTa();
                    if (QQUzIjv3iOC5() || UsuH8pd5P()) {
                        dz0Var2 = defpackage.dz0.EXtogiMhuM;
                    }
                } else {
                    dz0Var2 = (xl0Var.AARZUJiTa != 0 || this.EXtogiMhuM.EXtogiMhuM() || !arrayList2.isEmpty() || !arrayList.isEmpty() || QQUzIjv3iOC5() || UsuH8pd5P() || this.JlrlGoKF.SH1y5HwkJhh()) ? dz0Var : defpackage.dz0.riuEU0zW4;
                }
            }
            hc1Var.ez2rX8ReCYw(null, dz0Var2);
            if (dz0Var2 != dz0Var) {
                return null;
            }
            defpackage.bb bbVar = this.kd6TUFXn;
            this.kd6TUFXn = null;
            return bbVar;
        }
        java.util.List v5iciZok = v5iciZok();
        int size = v5iciZok.size();
        for (int i = 0; i < size; i++) {
        }
        this.xiZrDbcSW0.clear();
        this.AARZUJiTa = defpackage.nt.adDC3e2L;
        this.EXtogiMhuM = new defpackage.ol0();
        xl0Var.AARZUJiTa();
        arrayList2.clear();
        arrayList.clear();
        this.QoRHpC4k = null;
        defpackage.bb bbVar2 = this.kd6TUFXn;
        if (bbVar2 != null) {
            bbVar2.fnWB2E7cs(null);
        }
        this.kd6TUFXn = null;
        hc1Var2.SH1y5HwkJhh(null);
        return null;
    }

    public final boolean QQUzIjv3iOC5() {
        return !this.fnWB2E7cs && (((defpackage.y6) ((defpackage.m7) this.IHQe1A4L2xu.AARZUJiTa).r1MBDhnF).get() & 134217727) > 0;
    }

    @Override // defpackage.fh
    public final defpackage.lj SH1y5HwkJhh() {
        return this.abhbClRa;
    }

    @Override // defpackage.fh
    public final defpackage.ol0 SyNS6RMn(defpackage.kh khVar, defpackage.r91 r91Var, defpackage.ol0 ol0Var) {
        defpackage.v5 v5Var = this.V7bD7b8KA;
        try {
            XZx205DYe();
            khVar.abhbClRa(new defpackage.b51(ol0Var));
            defpackage.r91 r91Var2 = khVar.fnWB2E7cs;
            khVar.fnWB2E7cs = r91Var;
            try {
                defpackage.kh yIx6ChFVk = yIx6ChFVk(khVar, null);
                if (yIx6ChFVk != null) {
                    frpfPPIgqM9O(khVar);
                    yIx6ChFVk.F7NU4MC0GW();
                    yIx6ChFVk.xiZrDbcSW0();
                }
                defpackage.ol0 ol0Var2 = (defpackage.ol0) v5Var.adDC3e2L();
                if (ol0Var2 == null) {
                    ol0Var2 = defpackage.a51.IHQe1A4L2xu;
                    ol0Var2.getClass();
                }
                return ol0Var2;
            } finally {
                khVar.fnWB2E7cs = r91Var2;
            }
        } finally {
            v5Var.cnag84Bm(null);
        }
    }

    public final boolean UsuH8pd5P() {
        return !this.fnWB2E7cs && (((defpackage.y6) ((defpackage.m7) this.oh6vYeIP.r1MBDhnF).r1MBDhnF).get() & 134217727) > 0;
    }

    @Override // defpackage.fh
    public final void V7bD7b8KA(defpackage.kh khVar) {
        synchronized (this.r1MBDhnF) {
            if (this.xiZrDbcSW0.remove(khVar)) {
                this.AARZUJiTa = null;
            }
            this.riuEU0zW4.SH1y5HwkJhh(khVar);
            this.SH1y5HwkJhh.remove(khVar);
        }
    }

    public final boolean XZx205DYe() {
        boolean C0U8sNJm2;
        synchronized (this.r1MBDhnF) {
            if (this.EXtogiMhuM.AARZUJiTa()) {
                return C0U8sNJm();
            }
            java.util.List v5iciZok = v5iciZok();
            defpackage.b51 b51Var = new defpackage.b51(this.EXtogiMhuM);
            this.EXtogiMhuM = new defpackage.ol0();
            try {
                int size = v5iciZok.size();
                for (int i = 0; i < size; i++) {
                    ((defpackage.kh) v5iciZok.get(i)).abhbClRa(b51Var);
                    if (((defpackage.dz0) this.kNAkVymC.getValue()).compareTo(defpackage.dz0.xiZrDbcSW0) <= 0) {
                        break;
                    }
                }
                synchronized (this.r1MBDhnF) {
                    if (NHJTzaLwkd() != null) {
                        throw new java.lang.IllegalStateException("called outside of runRecomposeAndApplyChanges");
                    }
                    C0U8sNJm2 = C0U8sNJm();
                }
                return C0U8sNJm2;
            } catch (java.lang.Throwable th) {
                synchronized (this.r1MBDhnF) {
                    defpackage.ol0 ol0Var = this.EXtogiMhuM;
                    ol0Var.getClass();
                    java.util.Iterator<E> it = b51Var.iterator();
                    while (it.hasNext()) {
                        ol0Var.ez2rX8ReCYw(it.next());
                    }
                    throw th;
                }
            }
        }
    }

    public final void abhbClRa() {
        synchronized (this.r1MBDhnF) {
            if (((defpackage.dz0) this.kNAkVymC.getValue()).compareTo(defpackage.dz0.riuEU0zW4) >= 0) {
                defpackage.hc1 hc1Var = this.kNAkVymC;
                defpackage.dz0 dz0Var = defpackage.dz0.xiZrDbcSW0;
                hc1Var.getClass();
                hc1Var.ez2rX8ReCYw(null, dz0Var);
            }
        }
        this.PAEGRtP0bX.F7NU4MC0GW(null);
    }

    @Override // defpackage.fh
    public final boolean adDC3e2L() {
        return false;
    }

    @Override // defpackage.fh
    public final boolean ez2rX8ReCYw() {
        return false;
    }

    public final void frpfPPIgqM9O(defpackage.kh khVar) {
        synchronized (this.r1MBDhnF) {
            java.util.ArrayList arrayList = this.ez2rX8ReCYw;
            if (arrayList.size() > 0) {
                ((defpackage.jk0) arrayList.get(0)).getClass();
                throw null;
            }
        }
    }

    @Override // defpackage.fh
    public final void kd6TUFXn(defpackage.kh khVar) {
        synchronized (this.r1MBDhnF) {
            try {
                defpackage.ol0 ol0Var = this.G3OKOH3wZRC;
                if (ol0Var == null) {
                    defpackage.ol0 ol0Var2 = defpackage.a51.IHQe1A4L2xu;
                    ol0Var = new defpackage.ol0();
                    this.G3OKOH3wZRC = ol0Var;
                }
                ol0Var.IHQe1A4L2xu(khVar);
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    public final void mAr5m2L7gYDP(defpackage.kh khVar) {
        java.util.ArrayList arrayList = this.QoRHpC4k;
        if (arrayList == null) {
            arrayList = new java.util.ArrayList();
            this.QoRHpC4k = arrayList;
        }
        if (!arrayList.contains(khVar)) {
            arrayList.add(khVar);
        }
        if (this.xiZrDbcSW0.remove(khVar)) {
            this.AARZUJiTa = null;
        }
    }

    public final boolean nBH8hAHy() {
        boolean z;
        synchronized (this.r1MBDhnF) {
            if (!this.EXtogiMhuM.EXtogiMhuM() && this.riuEU0zW4.AARZUJiTa == 0 && !QQUzIjv3iOC5()) {
                z = UsuH8pd5P();
            }
        }
        return z;
    }

    @Override // defpackage.fh
    public final defpackage.ol0 oh6vYeIP(defpackage.kh khVar, defpackage.r91 r91Var, defpackage.k00 k00Var) {
        defpackage.v5 v5Var = this.V7bD7b8KA;
        try {
            defpackage.r91 r91Var2 = khVar.fnWB2E7cs;
            khVar.fnWB2E7cs = r91Var;
            try {
                IHQe1A4L2xu(khVar, k00Var);
                defpackage.ol0 ol0Var = (defpackage.ol0) v5Var.adDC3e2L();
                if (ol0Var == null) {
                    ol0Var = defpackage.a51.IHQe1A4L2xu;
                    ol0Var.getClass();
                }
                return ol0Var;
            } finally {
                khVar.fnWB2E7cs = r91Var2;
            }
        } finally {
            v5Var.cnag84Bm(null);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x013a, code lost:
    
        r3 = r11.size();
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x013f, code lost:
    
        if (r4 >= r3) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0149, code lost:
    
        if (((defpackage.et0) r11.get(r4)).xiZrDbcSW0 == null) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x014b, code lost:
    
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x014e, code lost:
    
        r3 = new java.util.ArrayList(r11.size());
        r4 = r11.size();
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x015c, code lost:
    
        if (r9 >= r4) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x015e, code lost:
    
        r12 = (defpackage.et0) r11.get(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0166, code lost:
    
        if (r12.xiZrDbcSW0 != null) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0168, code lost:
    
        r12 = (defpackage.jk0) r12.adDC3e2L;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x016f, code lost:
    
        r9 = r9 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0172, code lost:
    
        r4 = r18.r1MBDhnF;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0174, code lost:
    
        monitor-enter(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0175, code lost:
    
        defpackage.yd.AsxAYCCkb3Hi(r18.ez2rX8ReCYw, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x017a, code lost:
    
        monitor-exit(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x017b, code lost:
    
        r3 = new java.util.ArrayList(r11.size());
        r4 = r11.size();
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0189, code lost:
    
        if (r9 >= r4) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x018b, code lost:
    
        r12 = r11.get(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0194, code lost:
    
        if (((defpackage.et0) r12).xiZrDbcSW0 == null) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0196, code lost:
    
        r3.add(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0199, code lost:
    
        r9 = r9 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x019c, code lost:
    
        r11 = r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.util.List p4kuH6PDtgom(java.util.List list, defpackage.ol0 ol0Var) {
        defpackage.rl0 nBH8hAHy;
        java.util.ArrayList arrayList;
        java.util.HashMap hashMap = new java.util.HashMap(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            java.lang.Object obj = list.get(i);
            ((defpackage.jk0) obj).getClass();
            java.lang.Object obj2 = hashMap.get(null);
            if (obj2 == null) {
                obj2 = new java.util.ArrayList();
                hashMap.put(null, obj2);
            }
            ((java.util.ArrayList) obj2).add(obj);
        }
        for (java.util.Map.Entry entry : hashMap.entrySet()) {
            defpackage.kh khVar = (defpackage.kh) entry.getKey();
            java.util.List list2 = (java.util.List) entry.getValue();
            if (khVar.QQUzIjv3iOC5.frpfPPIgqM9O) {
                defpackage.dh.IHQe1A4L2xu("Check failed");
            }
            defpackage.DFo87pBq1E5 dFo87pBq1E5 = new defpackage.DFo87pBq1E5(20, khVar);
            defpackage.r1MBDhnF r1mbdhnf = new defpackage.r1MBDhnF(21, khVar, ol0Var);
            defpackage.oa1 SH1y5HwkJhh = defpackage.wa1.SH1y5HwkJhh();
            defpackage.rl0 rl0Var = SH1y5HwkJhh instanceof defpackage.rl0 ? (defpackage.rl0) SH1y5HwkJhh : null;
            if (rl0Var == null || (nBH8hAHy = rl0Var.nBH8hAHy(dFo87pBq1E5, r1mbdhnf)) == null) {
                defpackage.db.AARZUJiTa("Cannot create a mutable snapshot of an read-only snapshot");
                return null;
            }
            try {
                defpackage.oa1 SH1y5HwkJhh2 = nBH8hAHy.SH1y5HwkJhh();
                try {
                    synchronized (this.r1MBDhnF) {
                        try {
                            arrayList = new java.util.ArrayList(list2.size());
                            int size2 = list2.size();
                            for (int i2 = 0; i2 < size2; i2++) {
                                defpackage.jk0 jk0Var = (defpackage.jk0) list2.get(i2);
                                defpackage.nl0 nl0Var = this.JlrlGoKF;
                                jk0Var.getClass();
                                java.lang.Object IHQe1A4L2xu = defpackage.tk0.IHQe1A4L2xu(nl0Var);
                                arrayList.add(new defpackage.et0(jk0Var, IHQe1A4L2xu));
                            }
                            int size3 = arrayList.size();
                            int i3 = 0;
                            while (true) {
                                if (i3 >= size3) {
                                    break;
                                }
                                defpackage.et0 et0Var = (defpackage.et0) arrayList.get(i3);
                                if (et0Var.xiZrDbcSW0 == null) {
                                    defpackage.F7NU4MC0GW f7nu4mc0gw = this.DFo87pBq1E5;
                                    ((defpackage.jk0) et0Var.adDC3e2L).getClass();
                                    if (((defpackage.nl0) f7nu4mc0gw.xiZrDbcSW0).oh6vYeIP(null)) {
                                        java.util.ArrayList arrayList2 = new java.util.ArrayList(arrayList.size());
                                        int size4 = arrayList.size();
                                        for (int i4 = 0; i4 < size4; i4++) {
                                            defpackage.et0 et0Var2 = (defpackage.et0) arrayList.get(i4);
                                            if (et0Var2.xiZrDbcSW0 == null) {
                                                defpackage.F7NU4MC0GW f7nu4mc0gw2 = this.DFo87pBq1E5;
                                                ((defpackage.jk0) et0Var2.adDC3e2L).getClass();
                                                defpackage.nl0 nl0Var2 = (defpackage.nl0) f7nu4mc0gw2.xiZrDbcSW0;
                                                if (nl0Var2.riuEU0zW4()) {
                                                    ((defpackage.nl0) f7nu4mc0gw2.AARZUJiTa).IHQe1A4L2xu();
                                                }
                                            }
                                            arrayList2.add(et0Var2);
                                        }
                                        arrayList = arrayList2;
                                    }
                                }
                                i3++;
                            }
                        } finally {
                        }
                    }
                    int size5 = arrayList.size();
                    int i5 = 0;
                    while (true) {
                        if (i5 >= size5) {
                            break;
                        }
                        if (((defpackage.et0) arrayList.get(i5)).xiZrDbcSW0 != null) {
                            break;
                        }
                        i5++;
                    }
                    khVar.kd6TUFXn(arrayList);
                    defpackage.oa1.G3OKOH3wZRC(SH1y5HwkJhh2);
                } catch (java.lang.Throwable th) {
                    defpackage.oa1.G3OKOH3wZRC(SH1y5HwkJhh2);
                    throw th;
                }
            } finally {
                PAEGRtP0bX(nBH8hAHy);
            }
        }
        return defpackage.td.boH8X4DXyc4(hashMap.keySet());
    }

    public final java.util.List v5iciZok() {
        java.util.List list = this.AARZUJiTa;
        if (list != null) {
            return list;
        }
        java.util.ArrayList arrayList = this.xiZrDbcSW0;
        java.util.List arrayList2 = arrayList.isEmpty() ? defpackage.nt.adDC3e2L : new java.util.ArrayList(arrayList);
        this.AARZUJiTa = arrayList2;
        return arrayList2;
    }

    public final void wll2JLbTBC2(java.lang.Throwable th, defpackage.kh khVar) {
        if (!((java.lang.Boolean) C0U8sNJm.get()).booleanValue() || (th instanceof defpackage.ng)) {
            synchronized (this.r1MBDhnF) {
                android.util.Log.e("ComposeInternal", "Error was captured in composition.", th);
                defpackage.cz0 cz0Var = (defpackage.cz0) this.EgCjBq0SZwJ.getValue();
                if (cz0Var != null) {
                    throw cz0Var.IHQe1A4L2xu;
                }
                defpackage.hc1 hc1Var = this.EgCjBq0SZwJ;
                defpackage.cz0 cz0Var2 = new defpackage.cz0(th);
                hc1Var.getClass();
                hc1Var.ez2rX8ReCYw(null, cz0Var2);
            }
            throw th;
        }
        synchronized (this.r1MBDhnF) {
            try {
                android.util.Log.e("ComposeInternal", "Error was captured in composition while live edit was enabled.", th);
                this.SH1y5HwkJhh.clear();
                this.riuEU0zW4.AARZUJiTa();
                this.EXtogiMhuM = new defpackage.ol0();
                this.ez2rX8ReCYw.clear();
                this.JlrlGoKF.IHQe1A4L2xu();
                this.SyNS6RMn.IHQe1A4L2xu();
                defpackage.hc1 hc1Var2 = this.EgCjBq0SZwJ;
                defpackage.cz0 cz0Var3 = new defpackage.cz0(th);
                hc1Var2.getClass();
                hc1Var2.ez2rX8ReCYw(null, cz0Var3);
                if (khVar != null) {
                    mAr5m2L7gYDP(khVar);
                }
                if (NHJTzaLwkd() != null) {
                    defpackage.dh.IHQe1A4L2xu("expected to go to inactive state due to composition error");
                }
            } catch (java.lang.Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // defpackage.fh
    public final boolean xiZrDbcSW0() {
        return false;
    }

    public final defpackage.kh yIx6ChFVk(defpackage.kh khVar, defpackage.ol0 ol0Var) {
        defpackage.rl0 nBH8hAHy;
        if (khVar.QQUzIjv3iOC5.frpfPPIgqM9O || khVar.C0U8sNJm == 3) {
            return null;
        }
        defpackage.ol0 ol0Var2 = this.G3OKOH3wZRC;
        if (ol0Var2 == null || !ol0Var2.r1MBDhnF(khVar)) {
            defpackage.DFo87pBq1E5 dFo87pBq1E5 = new defpackage.DFo87pBq1E5(20, khVar);
            defpackage.r1MBDhnF r1mbdhnf = new defpackage.r1MBDhnF(21, khVar, ol0Var);
            defpackage.oa1 SH1y5HwkJhh = defpackage.wa1.SH1y5HwkJhh();
            defpackage.rl0 rl0Var = SH1y5HwkJhh instanceof defpackage.rl0 ? (defpackage.rl0) SH1y5HwkJhh : null;
            if (rl0Var == null || (nBH8hAHy = rl0Var.nBH8hAHy(dFo87pBq1E5, r1mbdhnf)) == null) {
                defpackage.db.AARZUJiTa("Cannot create a mutable snapshot of an read-only snapshot");
            } else {
                try {
                    defpackage.oa1 SH1y5HwkJhh2 = nBH8hAHy.SH1y5HwkJhh();
                    if (ol0Var != null) {
                        try {
                            if (ol0Var.EXtogiMhuM()) {
                                defpackage.DSux0S2nxMSk dSux0S2nxMSk = new defpackage.DSux0S2nxMSk(10, ol0Var, khVar);
                                defpackage.t10 t10Var = khVar.QQUzIjv3iOC5;
                                if (t10Var.frpfPPIgqM9O) {
                                    defpackage.dh.IHQe1A4L2xu("Preparing a composition while composing is not supported");
                                }
                                t10Var.frpfPPIgqM9O = true;
                                try {
                                    dSux0S2nxMSk.IHQe1A4L2xu();
                                    t10Var.frpfPPIgqM9O = false;
                                } catch (java.lang.Throwable th) {
                                    t10Var.frpfPPIgqM9O = false;
                                    throw th;
                                }
                            }
                        } catch (java.lang.Throwable th2) {
                            defpackage.oa1.G3OKOH3wZRC(SH1y5HwkJhh2);
                            throw th2;
                        }
                    }
                    boolean PAEGRtP0bX = khVar.PAEGRtP0bX();
                    defpackage.oa1.G3OKOH3wZRC(SH1y5HwkJhh2);
                    if (PAEGRtP0bX) {
                        return khVar;
                    }
                } finally {
                    PAEGRtP0bX(nBH8hAHy);
                }
            }
        }
        return null;
    }

    @Override // defpackage.fh
    public final void cnag84Bm(java.util.Set set) {
    }
}
