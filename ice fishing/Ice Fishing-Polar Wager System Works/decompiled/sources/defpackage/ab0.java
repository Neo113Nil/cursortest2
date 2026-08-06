package defpackage;

/* loaded from: classes.dex */
public final class ab0 implements defpackage.ig {
    public defpackage.id1 AARZUJiTa;
    public final defpackage.ra0 DFo87pBq1E5;
    public int EXtogiMhuM;
    public int EgCjBq0SZwJ;
    public final defpackage.xl0 G3OKOH3wZRC;
    public final defpackage.ua0 JlrlGoKF;
    public final defpackage.nl0 QoRHpC4k;
    public final defpackage.nl0 SH1y5HwkJhh;
    public final defpackage.nl0 SyNS6RMn;
    public final defpackage.ma0 adDC3e2L;
    public final defpackage.hd1 cnag84Bm;
    public final defpackage.nl0 ez2rX8ReCYw;
    public final java.lang.String fnWB2E7cs;
    public int kd6TUFXn;
    public int riuEU0zW4;
    public defpackage.fh xiZrDbcSW0;

    public ab0(defpackage.ma0 ma0Var, defpackage.id1 id1Var) {
        this.adDC3e2L = ma0Var;
        this.AARZUJiTa = id1Var;
        long[] jArr = defpackage.z41.IHQe1A4L2xu;
        this.SH1y5HwkJhh = new defpackage.nl0();
        this.ez2rX8ReCYw = new defpackage.nl0();
        this.JlrlGoKF = new defpackage.ua0(this);
        this.DFo87pBq1E5 = new defpackage.ra0(this);
        this.SyNS6RMn = new defpackage.nl0();
        this.cnag84Bm = new defpackage.hd1();
        this.QoRHpC4k = new defpackage.nl0();
        this.G3OKOH3wZRC = new defpackage.xl0(new java.lang.Object[16]);
        this.fnWB2E7cs = "Asking for intrinsic measurements of SubcomposeLayout layouts is not supported. This includes components that are built on top of SubcomposeLayout, such as lazy lists, BoxWithConstraints, TabRow, etc. To mitigate this:\n- if intrinsic measurements are used to achieve 'match parent' sizing, consider replacing the parent of the component with a custom layout which controls the order in which children are measured, making intrinsic measurement not needed\n- adding a size modifier to the component, in order to fast return the queried intrinsic measurement.";
    }

    public static void adDC3e2L(defpackage.sa0 sa0Var) {
        defpackage.ol0 ol0Var;
        defpackage.bu0 bu0Var = sa0Var.xiZrDbcSW0;
        if (bu0Var != null) {
            bu0Var.EXtogiMhuM.set(defpackage.du0.xiZrDbcSW0);
            defpackage.v01 v01Var = bu0Var.ez2rX8ReCYw;
            if (v01Var.F7NU4MC0GW.EXtogiMhuM()) {
                ol0Var = v01Var.F7NU4MC0GW;
                defpackage.ol0 ol0Var2 = defpackage.a51.IHQe1A4L2xu;
                v01Var.F7NU4MC0GW = new defpackage.ol0();
                v01Var.r1MBDhnF.AARZUJiTa();
            } else {
                ol0Var = null;
            }
            v01Var.oh6vYeIP();
            defpackage.kh khVar = bu0Var.IHQe1A4L2xu;
            khVar.kNAkVymC = null;
            if (ol0Var != null) {
                khVar.NHJTzaLwkd.ez2rX8ReCYw = ol0Var;
                khVar.C0U8sNJm = 2;
            }
            sa0Var.xiZrDbcSW0 = null;
            defpackage.kh khVar2 = sa0Var.r1MBDhnF;
            if (khVar2 != null) {
                khVar2.DFo87pBq1E5();
            }
            sa0Var.r1MBDhnF = null;
        }
    }

    public static final void r1MBDhnF(defpackage.ab0 ab0Var, java.lang.Object obj) {
        defpackage.ma0 ma0Var = ab0Var.adDC3e2L;
        ab0Var.EXtogiMhuM();
        defpackage.ma0 ma0Var2 = (defpackage.ma0) ab0Var.SyNS6RMn.ez2rX8ReCYw(obj);
        if (ma0Var2 != null) {
            if (ab0Var.EgCjBq0SZwJ <= 0) {
                defpackage.x50.oh6vYeIP("No pre-composed items to dispose");
            }
            int riuEU0zW4 = ((defpackage.ul0) ma0Var.cnag84Bm()).adDC3e2L.riuEU0zW4(ma0Var2);
            if (riuEU0zW4 < ((defpackage.ul0) ma0Var.cnag84Bm()).adDC3e2L.AARZUJiTa - ab0Var.EgCjBq0SZwJ) {
                defpackage.x50.oh6vYeIP("Item is not in pre-composed item range");
            }
            ab0Var.kd6TUFXn++;
            ab0Var.EgCjBq0SZwJ--;
            defpackage.sa0 sa0Var = (defpackage.sa0) ab0Var.SH1y5HwkJhh.AARZUJiTa(ma0Var2);
            if (sa0Var != null) {
                adDC3e2L(sa0Var);
            }
            int i = (((defpackage.ul0) ma0Var.cnag84Bm()).adDC3e2L.AARZUJiTa - ab0Var.EgCjBq0SZwJ) - ab0Var.kd6TUFXn;
            ab0Var.SH1y5HwkJhh(riuEU0zW4, i);
            ab0Var.AARZUJiTa(i);
        }
        if (ab0Var.G3OKOH3wZRC.EXtogiMhuM(obj)) {
            defpackage.ma0.wKlPRKlRnfqr(ma0Var, true, 6);
        }
    }

    public final void AARZUJiTa(int i) {
        boolean z;
        boolean z2 = false;
        this.kd6TUFXn = 0;
        java.util.List cnag84Bm = this.adDC3e2L.cnag84Bm();
        defpackage.ul0 ul0Var = (defpackage.ul0) cnag84Bm;
        int i2 = (ul0Var.adDC3e2L.AARZUJiTa - this.EgCjBq0SZwJ) - 1;
        if (i <= i2) {
            this.cnag84Bm.clear();
            if (i <= i2) {
                int i3 = i;
                while (true) {
                    java.lang.Object AARZUJiTa = this.SH1y5HwkJhh.AARZUJiTa((defpackage.ma0) ul0Var.get(i3));
                    AARZUJiTa.getClass();
                    ((defpackage.hl0) this.cnag84Bm.xiZrDbcSW0).IHQe1A4L2xu(((defpackage.sa0) AARZUJiTa).IHQe1A4L2xu);
                    if (i3 == i2) {
                        break;
                    } else {
                        i3++;
                    }
                }
            }
            this.AARZUJiTa.adDC3e2L(this.cnag84Bm);
            defpackage.oa1 QoRHpC4k = defpackage.f70.QoRHpC4k();
            defpackage.g00 adDC3e2L = QoRHpC4k != null ? QoRHpC4k.adDC3e2L() : null;
            defpackage.oa1 fnWB2E7cs = defpackage.f70.fnWB2E7cs(QoRHpC4k);
            z = false;
            while (i2 >= i) {
                try {
                    defpackage.ma0 ma0Var = (defpackage.ma0) ((defpackage.ul0) cnag84Bm).get(i2);
                    java.lang.Object AARZUJiTa2 = this.SH1y5HwkJhh.AARZUJiTa(ma0Var);
                    AARZUJiTa2.getClass();
                    defpackage.sa0 sa0Var = (defpackage.sa0) AARZUJiTa2;
                    java.lang.Object obj = sa0Var.IHQe1A4L2xu;
                    if (((defpackage.hl0) this.cnag84Bm.xiZrDbcSW0).r1MBDhnF(obj)) {
                        this.kd6TUFXn++;
                        if (((java.lang.Boolean) sa0Var.AARZUJiTa.getValue()).booleanValue()) {
                            defpackage.qa0 qa0Var = ma0Var.wll2JLbTBC2;
                            defpackage.hi0 hi0Var = qa0Var.QoRHpC4k;
                            defpackage.ka0 ka0Var = defpackage.ka0.AARZUJiTa;
                            hi0Var.QoRHpC4k = ka0Var;
                            defpackage.fg0 fg0Var = qa0Var.G3OKOH3wZRC;
                            if (fg0Var != null) {
                                fg0Var.SyNS6RMn = ka0Var;
                            }
                            JlrlGoKF(sa0Var, false);
                            if (sa0Var.EXtogiMhuM) {
                                z = true;
                            }
                        }
                    } else {
                        defpackage.ma0 ma0Var2 = this.adDC3e2L;
                        ma0Var2.fnWB2E7cs = true;
                        this.SH1y5HwkJhh.ez2rX8ReCYw(ma0Var);
                        defpackage.kh khVar = sa0Var.r1MBDhnF;
                        if (khVar != null) {
                            khVar.DFo87pBq1E5();
                        }
                        this.adDC3e2L.TFRaUu83X3E(i2, 1);
                        ma0Var2.fnWB2E7cs = false;
                    }
                    this.ez2rX8ReCYw.ez2rX8ReCYw(obj);
                    i2--;
                } catch (java.lang.Throwable th) {
                    defpackage.f70.QQUzIjv3iOC5(QoRHpC4k, fnWB2E7cs, adDC3e2L);
                    throw th;
                }
            }
            defpackage.f70.QQUzIjv3iOC5(QoRHpC4k, fnWB2E7cs, adDC3e2L);
        } else {
            z = false;
        }
        if (z) {
            synchronized (defpackage.wa1.r1MBDhnF) {
                defpackage.ol0 ol0Var = defpackage.wa1.SH1y5HwkJhh.EXtogiMhuM;
                if (ol0Var != null) {
                    if (ol0Var.EXtogiMhuM()) {
                        z2 = true;
                    }
                }
            }
            if (z2) {
                defpackage.wa1.IHQe1A4L2xu();
            }
        }
        EXtogiMhuM();
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00bf A[Catch: all -> 0x008d, TryCatch #0 {all -> 0x008d, blocks: (B:37:0x0076, B:40:0x0082, B:45:0x00ad, B:47:0x00bf, B:49:0x00d3, B:51:0x00d7, B:52:0x010b, B:55:0x00e4, B:56:0x00ef, B:58:0x00f3, B:59:0x0108, B:60:0x00c2, B:63:0x0092, B:65:0x00a0, B:66:0x0115, B:67:0x011f), top: B:36:0x0076 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00d3 A[Catch: all -> 0x008d, TryCatch #0 {all -> 0x008d, blocks: (B:37:0x0076, B:40:0x0082, B:45:0x00ad, B:47:0x00bf, B:49:0x00d3, B:51:0x00d7, B:52:0x010b, B:55:0x00e4, B:56:0x00ef, B:58:0x00f3, B:59:0x0108, B:60:0x00c2, B:63:0x0092, B:65:0x00a0, B:66:0x0115, B:67:0x011f), top: B:36:0x0076 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ef A[Catch: all -> 0x008d, TryCatch #0 {all -> 0x008d, blocks: (B:37:0x0076, B:40:0x0082, B:45:0x00ad, B:47:0x00bf, B:49:0x00d3, B:51:0x00d7, B:52:0x010b, B:55:0x00e4, B:56:0x00ef, B:58:0x00f3, B:59:0x0108, B:60:0x00c2, B:63:0x0092, B:65:0x00a0, B:66:0x0115, B:67:0x011f), top: B:36:0x0076 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00c2 A[Catch: all -> 0x008d, TryCatch #0 {all -> 0x008d, blocks: (B:37:0x0076, B:40:0x0082, B:45:0x00ad, B:47:0x00bf, B:49:0x00d3, B:51:0x00d7, B:52:0x010b, B:55:0x00e4, B:56:0x00ef, B:58:0x00f3, B:59:0x0108, B:60:0x00c2, B:63:0x0092, B:65:0x00a0, B:66:0x0115, B:67:0x011f), top: B:36:0x0076 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void DFo87pBq1E5(defpackage.ma0 ma0Var, java.lang.Object obj, boolean z, defpackage.k00 k00Var) {
        boolean z2;
        defpackage.kh khVar;
        defpackage.nl0 nl0Var = this.SH1y5HwkJhh;
        java.lang.Object AARZUJiTa = nl0Var.AARZUJiTa(ma0Var);
        java.lang.Object obj2 = AARZUJiTa;
        if (AARZUJiTa == null) {
            defpackage.sf sfVar = defpackage.ag.IHQe1A4L2xu;
            defpackage.sa0 sa0Var = new defpackage.sa0();
            sa0Var.IHQe1A4L2xu = obj;
            sa0Var.oh6vYeIP = sfVar;
            sa0Var.r1MBDhnF = null;
            sa0Var.AARZUJiTa = defpackage.c80.nBH8hAHy(java.lang.Boolean.TRUE);
            nl0Var.DFo87pBq1E5(ma0Var, sa0Var);
            obj2 = sa0Var;
        }
        defpackage.sa0 sa0Var2 = (defpackage.sa0) obj2;
        int i = 1;
        boolean z3 = sa0Var2.oh6vYeIP != k00Var;
        if (sa0Var2.xiZrDbcSW0 != null) {
            if (z3) {
                adDC3e2L(sa0Var2);
            } else if (z) {
                return;
            } else {
                F7NU4MC0GW(sa0Var2, true);
            }
        }
        defpackage.kh khVar2 = sa0Var2.r1MBDhnF;
        if (khVar2 != null) {
            synchronized (khVar2.EXtogiMhuM) {
                z2 = khVar2.kd6TUFXn.adDC3e2L > 0;
            }
        } else {
            z2 = true;
        }
        if (z3 || z2 || sa0Var2.F7NU4MC0GW) {
            sa0Var2.oh6vYeIP = k00Var;
            if (sa0Var2.xiZrDbcSW0 != null) {
                defpackage.x50.IHQe1A4L2xu("new subcompose call while paused composition is still active");
            }
            defpackage.oa1 QoRHpC4k = defpackage.f70.QoRHpC4k();
            defpackage.g00 adDC3e2L = QoRHpC4k != null ? QoRHpC4k.adDC3e2L() : null;
            defpackage.oa1 fnWB2E7cs = defpackage.f70.fnWB2E7cs(QoRHpC4k);
            try {
                defpackage.ma0 ma0Var2 = this.adDC3e2L;
                ma0Var2.fnWB2E7cs = true;
                defpackage.kh khVar3 = sa0Var2.r1MBDhnF;
                defpackage.fh fhVar = this.xiZrDbcSW0;
                if (fhVar == null) {
                    defpackage.x50.r1MBDhnF("parent composition reference not set");
                    throw new defpackage.cf();
                }
                if (khVar3 != null) {
                    if (khVar3.C0U8sNJm == 3) {
                    }
                    sa0Var2.r1MBDhnF = khVar3;
                    defpackage.k00 k00Var2 = sa0Var2.oh6vYeIP;
                    if (((defpackage.v0) defpackage.pa0.IHQe1A4L2xu(this.adDC3e2L)).getOutOfFrameExecutor() == null) {
                        sa0Var2.EXtogiMhuM = false;
                    } else {
                        sa0Var2.EXtogiMhuM = true;
                        k00Var2 = new defpackage.sf(1524156494, new defpackage.n1(i, sa0Var2, k00Var2), true);
                    }
                    if (z) {
                        if (sa0Var2.adDC3e2L) {
                            khVar3.riuEU0zW4();
                            khVar3.G3OKOH3wZRC();
                            defpackage.t10 t10Var = khVar3.QQUzIjv3iOC5;
                            t10Var.QQUzIjv3iOC5 = 0;
                            t10Var.NHJTzaLwkd = true;
                            khVar3.adDC3e2L.IHQe1A4L2xu(khVar3, k00Var2);
                            t10Var.EgCjBq0SZwJ();
                        } else {
                            khVar3.C0U8sNJm(k00Var2);
                        }
                    } else if (sa0Var2.adDC3e2L) {
                        khVar3.riuEU0zW4();
                        khVar3.G3OKOH3wZRC();
                        sa0Var2.xiZrDbcSW0 = khVar3.ez2rX8ReCYw(true, k00Var2);
                    } else {
                        sa0Var2.xiZrDbcSW0 = khVar3.ez2rX8ReCYw(khVar3.riuEU0zW4(), k00Var2);
                    }
                    sa0Var2.adDC3e2L = false;
                    ma0Var2.fnWB2E7cs = false;
                    defpackage.f70.QQUzIjv3iOC5(QoRHpC4k, fnWB2E7cs, adDC3e2L);
                    sa0Var2.F7NU4MC0GW = false;
                }
                if (z) {
                    android.view.ViewGroup.LayoutParams layoutParams = defpackage.cq1.IHQe1A4L2xu;
                    khVar = new defpackage.kh(fhVar, new defpackage.gk1(ma0Var));
                } else {
                    android.view.ViewGroup.LayoutParams layoutParams2 = defpackage.cq1.IHQe1A4L2xu;
                    khVar = new defpackage.kh(fhVar, new defpackage.gk1(ma0Var));
                }
                khVar3 = khVar;
                sa0Var2.r1MBDhnF = khVar3;
                defpackage.k00 k00Var22 = sa0Var2.oh6vYeIP;
                if (((defpackage.v0) defpackage.pa0.IHQe1A4L2xu(this.adDC3e2L)).getOutOfFrameExecutor() == null) {
                }
                if (z) {
                }
                sa0Var2.adDC3e2L = false;
                ma0Var2.fnWB2E7cs = false;
                defpackage.f70.QQUzIjv3iOC5(QoRHpC4k, fnWB2E7cs, adDC3e2L);
                sa0Var2.F7NU4MC0GW = false;
            } catch (java.lang.Throwable th) {
                defpackage.f70.QQUzIjv3iOC5(QoRHpC4k, fnWB2E7cs, adDC3e2L);
                throw th;
            }
        }
    }

    public final void EXtogiMhuM() {
        int i = ((defpackage.ul0) this.adDC3e2L.cnag84Bm()).adDC3e2L.AARZUJiTa;
        defpackage.nl0 nl0Var = this.SH1y5HwkJhh;
        if (nl0Var.adDC3e2L != i) {
            defpackage.x50.IHQe1A4L2xu("Inconsistency between the count of nodes tracked by the state (" + nl0Var.adDC3e2L + ") and the children count on the SubcomposeLayout (" + i + "). Are you trying to use the state of the disposed SubcomposeLayout?");
        }
        if ((i - this.kd6TUFXn) - this.EgCjBq0SZwJ < 0) {
            java.lang.StringBuilder JlrlGoKF = defpackage.fx0.JlrlGoKF(i, "Incorrect state. Total children ", ". Reusable children ");
            JlrlGoKF.append(this.kd6TUFXn);
            JlrlGoKF.append(". Precomposed children ");
            JlrlGoKF.append(this.EgCjBq0SZwJ);
            defpackage.x50.IHQe1A4L2xu(JlrlGoKF.toString());
        }
        defpackage.nl0 nl0Var2 = this.SyNS6RMn;
        if (nl0Var2.adDC3e2L == this.EgCjBq0SZwJ) {
            return;
        }
        defpackage.x50.IHQe1A4L2xu("Incorrect state. Precomposed children " + this.EgCjBq0SZwJ + ". Map size " + nl0Var2.adDC3e2L);
    }

    public final void F7NU4MC0GW(defpackage.sa0 sa0Var, boolean z) {
        defpackage.bu0 bu0Var = sa0Var.xiZrDbcSW0;
        if (bu0Var != null) {
            defpackage.oa1 QoRHpC4k = defpackage.f70.QoRHpC4k();
            defpackage.g00 adDC3e2L = QoRHpC4k != null ? QoRHpC4k.adDC3e2L() : null;
            defpackage.oa1 fnWB2E7cs = defpackage.f70.fnWB2E7cs(QoRHpC4k);
            try {
                defpackage.ma0 ma0Var = this.adDC3e2L;
                ma0Var.fnWB2E7cs = true;
                if (z) {
                    while (!bu0Var.r1MBDhnF()) {
                        try {
                            bu0Var.adDC3e2L(new defpackage.db(12));
                        } catch (java.lang.Throwable th) {
                            throw th;
                        }
                    }
                }
                bu0Var.IHQe1A4L2xu();
                sa0Var.xiZrDbcSW0 = null;
                ma0Var.fnWB2E7cs = false;
            } finally {
                defpackage.f70.QQUzIjv3iOC5(QoRHpC4k, fnWB2E7cs, adDC3e2L);
            }
        }
    }

    @Override // defpackage.ig
    public final void IHQe1A4L2xu() {
        defpackage.kh khVar;
        defpackage.ma0 ma0Var = this.adDC3e2L;
        ma0Var.fnWB2E7cs = true;
        defpackage.nl0 nl0Var = this.SH1y5HwkJhh;
        java.lang.Object[] objArr = nl0Var.r1MBDhnF;
        long[] jArr = nl0Var.IHQe1A4L2xu;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128 && (khVar = ((defpackage.sa0) objArr[(i << 3) + i3]).r1MBDhnF) != null) {
                            khVar.DFo87pBq1E5();
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
        ma0Var.hkbnNdmy();
        ma0Var.fnWB2E7cs = false;
        nl0Var.IHQe1A4L2xu();
        this.ez2rX8ReCYw.IHQe1A4L2xu();
        this.EgCjBq0SZwJ = 0;
        this.kd6TUFXn = 0;
        this.SyNS6RMn.IHQe1A4L2xu();
        EXtogiMhuM();
    }

    public final void JlrlGoKF(defpackage.sa0 sa0Var, boolean z) {
        defpackage.kh khVar;
        if (z || !sa0Var.EXtogiMhuM) {
            sa0Var.AARZUJiTa = defpackage.c80.nBH8hAHy(java.lang.Boolean.FALSE);
        } else {
            sa0Var.AARZUJiTa.setValue(java.lang.Boolean.FALSE);
        }
        if (sa0Var.xiZrDbcSW0 != null) {
            adDC3e2L(sa0Var);
            return;
        }
        if (z) {
            defpackage.kh khVar2 = sa0Var.r1MBDhnF;
            if (khVar2 != null) {
                khVar2.JlrlGoKF();
                return;
            }
            return;
        }
        defpackage.ls0 outOfFrameExecutor = ((defpackage.v0) defpackage.pa0.IHQe1A4L2xu(this.adDC3e2L)).getOutOfFrameExecutor();
        if (outOfFrameExecutor == null) {
            if (sa0Var.EXtogiMhuM || (khVar = sa0Var.r1MBDhnF) == null) {
                return;
            }
            khVar.JlrlGoKF();
            return;
        }
        defpackage.s4 s4Var = new defpackage.s4(6, sa0Var);
        defpackage.v0 v0Var = (defpackage.v0) outOfFrameExecutor;
        defpackage.l6 l6Var = v0Var.DFo87pBq1E5;
        boolean isEmpty = l6Var.isEmpty();
        l6Var.addLast(s4Var);
        if (isEmpty) {
            android.os.Handler handler = v0Var.getHandler();
            if (handler != null) {
                handler.postAtFrontOfQueue(v0Var.SyNS6RMn);
            } else {
                defpackage.db.fnWB2E7cs("schedule is called when outOfFrameExecutor is not available (view is detached)");
            }
        }
    }

    public final void SH1y5HwkJhh(int i, int i2) {
        defpackage.ma0 ma0Var = this.adDC3e2L;
        ma0Var.fnWB2E7cs = true;
        ma0Var.mAr5m2L7gYDP(i, i2, 1);
        ma0Var.fnWB2E7cs = false;
    }

    public final defpackage.ma0 SyNS6RMn(java.lang.Object obj) {
        defpackage.nl0 nl0Var;
        int i;
        if (this.kd6TUFXn == 0) {
            return null;
        }
        defpackage.ul0 ul0Var = (defpackage.ul0) this.adDC3e2L.cnag84Bm();
        int i2 = ul0Var.adDC3e2L.AARZUJiTa - this.EgCjBq0SZwJ;
        int i3 = i2 - this.kd6TUFXn;
        int i4 = i2 - 1;
        int i5 = i4;
        while (true) {
            nl0Var = this.SH1y5HwkJhh;
            if (i5 < i3) {
                i = -1;
                break;
            }
            java.lang.Object AARZUJiTa = nl0Var.AARZUJiTa((defpackage.ma0) ul0Var.get(i5));
            AARZUJiTa.getClass();
            if (((defpackage.sa0) AARZUJiTa).IHQe1A4L2xu.equals(obj)) {
                i = i5;
                break;
            }
            i5--;
        }
        if (i == -1) {
            while (i4 >= i3) {
                java.lang.Object AARZUJiTa2 = nl0Var.AARZUJiTa((defpackage.ma0) ul0Var.get(i4));
                AARZUJiTa2.getClass();
                defpackage.sa0 sa0Var = (defpackage.sa0) AARZUJiTa2;
                java.lang.Object obj2 = sa0Var.IHQe1A4L2xu;
                if (obj2 == defpackage.h1.PAEGRtP0bX || this.AARZUJiTa.SH1y5HwkJhh(obj, obj2)) {
                    sa0Var.IHQe1A4L2xu = obj;
                    i5 = i4;
                    i = i5;
                    break;
                }
                i4--;
            }
            i5 = i4;
        }
        if (i == -1) {
            return null;
        }
        if (i5 != i3) {
            SH1y5HwkJhh(i5, i3);
        }
        this.kd6TUFXn--;
        defpackage.ma0 ma0Var = (defpackage.ma0) ul0Var.get(i3);
        java.lang.Object AARZUJiTa3 = nl0Var.AARZUJiTa(ma0Var);
        AARZUJiTa3.getClass();
        defpackage.sa0 sa0Var2 = (defpackage.sa0) AARZUJiTa3;
        sa0Var2.AARZUJiTa = defpackage.c80.nBH8hAHy(java.lang.Boolean.TRUE);
        sa0Var2.adDC3e2L = true;
        sa0Var2.F7NU4MC0GW = true;
        return ma0Var;
    }

    public final void ez2rX8ReCYw(java.lang.Object obj, defpackage.k00 k00Var, boolean z) {
        defpackage.ma0 ma0Var = this.adDC3e2L;
        if (ma0Var.p4kuH6PDtgom()) {
            EXtogiMhuM();
            if (this.ez2rX8ReCYw.r1MBDhnF(obj)) {
                return;
            }
            this.QoRHpC4k.ez2rX8ReCYw(obj);
            defpackage.nl0 nl0Var = this.SyNS6RMn;
            java.lang.Object AARZUJiTa = nl0Var.AARZUJiTa(obj);
            if (AARZUJiTa == null) {
                AARZUJiTa = SyNS6RMn(obj);
                if (AARZUJiTa != null) {
                    SH1y5HwkJhh(((defpackage.ul0) ma0Var.cnag84Bm()).adDC3e2L.riuEU0zW4(AARZUJiTa), ((defpackage.ul0) ma0Var.cnag84Bm()).adDC3e2L.AARZUJiTa);
                    this.EgCjBq0SZwJ++;
                } else {
                    int i = ((defpackage.ul0) ma0Var.cnag84Bm()).adDC3e2L.AARZUJiTa;
                    defpackage.ma0 ma0Var2 = new defpackage.ma0(2);
                    ma0Var.fnWB2E7cs = true;
                    ma0Var.UsuH8pd5P(i, ma0Var2);
                    ma0Var.fnWB2E7cs = false;
                    this.EgCjBq0SZwJ++;
                    AARZUJiTa = ma0Var2;
                }
                nl0Var.DFo87pBq1E5(obj, AARZUJiTa);
            }
            DFo87pBq1E5((defpackage.ma0) AARZUJiTa, obj, z, k00Var);
        }
    }

    @Override // defpackage.ig
    public final void oh6vYeIP() {
        riuEU0zW4(true);
    }

    public final void riuEU0zW4(boolean z) {
        this.EgCjBq0SZwJ = 0;
        this.SyNS6RMn.IHQe1A4L2xu();
        java.util.List cnag84Bm = this.adDC3e2L.cnag84Bm();
        int i = ((defpackage.ul0) cnag84Bm).adDC3e2L.AARZUJiTa;
        if (this.kd6TUFXn != i) {
            this.kd6TUFXn = i;
            defpackage.oa1 QoRHpC4k = defpackage.f70.QoRHpC4k();
            defpackage.g00 adDC3e2L = QoRHpC4k != null ? QoRHpC4k.adDC3e2L() : null;
            defpackage.oa1 fnWB2E7cs = defpackage.f70.fnWB2E7cs(QoRHpC4k);
            for (int i2 = 0; i2 < i; i2++) {
                try {
                    defpackage.ma0 ma0Var = (defpackage.ma0) ((defpackage.ul0) cnag84Bm).get(i2);
                    defpackage.sa0 sa0Var = (defpackage.sa0) this.SH1y5HwkJhh.AARZUJiTa(ma0Var);
                    if (sa0Var != null && ((java.lang.Boolean) sa0Var.AARZUJiTa.getValue()).booleanValue()) {
                        defpackage.qa0 qa0Var = ma0Var.wll2JLbTBC2;
                        defpackage.hi0 hi0Var = qa0Var.QoRHpC4k;
                        defpackage.ka0 ka0Var = defpackage.ka0.AARZUJiTa;
                        hi0Var.QoRHpC4k = ka0Var;
                        defpackage.fg0 fg0Var = qa0Var.G3OKOH3wZRC;
                        if (fg0Var != null) {
                            fg0Var.SyNS6RMn = ka0Var;
                        }
                        JlrlGoKF(sa0Var, z);
                        sa0Var.IHQe1A4L2xu = defpackage.h1.PAEGRtP0bX;
                    }
                } catch (java.lang.Throwable th) {
                    defpackage.f70.QQUzIjv3iOC5(QoRHpC4k, fnWB2E7cs, adDC3e2L);
                    throw th;
                }
            }
            defpackage.f70.QQUzIjv3iOC5(QoRHpC4k, fnWB2E7cs, adDC3e2L);
            this.ez2rX8ReCYw.IHQe1A4L2xu();
        }
        EXtogiMhuM();
    }

    public final defpackage.dd1 xiZrDbcSW0(java.lang.Object obj) {
        return !this.adDC3e2L.p4kuH6PDtgom() ? new defpackage.xa0() : new defpackage.ya0(this, obj);
    }
}
