package defpackage;

/* loaded from: classes.dex */
public final class ib1 {
    public defpackage.qq0 EXtogiMhuM;
    public final defpackage.g00 IHQe1A4L2xu;
    public boolean r1MBDhnF;
    public defpackage.hb1 riuEU0zW4;
    public final java.util.concurrent.atomic.AtomicReference oh6vYeIP = new java.util.concurrent.atomic.AtomicReference(null);
    public final defpackage.t2LXIqmbaC5 F7NU4MC0GW = new defpackage.t2LXIqmbaC5(14, this);
    public final defpackage.DFo87pBq1E5 adDC3e2L = new defpackage.DFo87pBq1E5(27, this);
    public final defpackage.xl0 xiZrDbcSW0 = new defpackage.xl0(new defpackage.hb1[16]);
    public final java.lang.Object AARZUJiTa = new java.lang.Object();
    public long SH1y5HwkJhh = -1;

    public ib1(defpackage.g00 g00Var) {
        this.IHQe1A4L2xu = g00Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean IHQe1A4L2xu() {
        boolean z;
        java.util.Set set;
        java.util.Set set2;
        synchronized (this.AARZUJiTa) {
            z = this.r1MBDhnF;
        }
        if (z) {
            return false;
        }
        boolean z2 = false;
        while (true) {
            java.util.concurrent.atomic.AtomicReference atomicReference = this.oh6vYeIP;
            while (true) {
                java.lang.Object obj = atomicReference.get();
                set = null;
                java.util.List list = null;
                java.util.List list2 = null;
                if (obj == null) {
                    break;
                }
                if (obj instanceof java.util.Set) {
                    set2 = (java.util.Set) obj;
                } else {
                    if (!(obj instanceof java.util.List)) {
                        defpackage.dh.oh6vYeIP("Unexpected notification");
                        throw new defpackage.cf();
                    }
                    java.util.List list3 = (java.util.List) obj;
                    java.util.Set set3 = (java.util.Set) list3.get(0);
                    if (list3.size() == 2) {
                        list2 = list3.get(1);
                    } else if (list3.size() > 2) {
                        list2 = list3.subList(1, list3.size());
                    }
                    set2 = set3;
                    list = list2;
                }
                while (!atomicReference.compareAndSet(obj, list)) {
                    if (atomicReference.get() != obj) {
                        break;
                    }
                }
                set = set2;
                break;
            }
            if (set == null) {
                return z2;
            }
            synchronized (this.AARZUJiTa) {
                defpackage.xl0 xl0Var = this.xiZrDbcSW0;
                java.lang.Object[] objArr = xl0Var.adDC3e2L;
                int i = xl0Var.AARZUJiTa;
                for (int i2 = 0; i2 < i; i2++) {
                    z2 = ((defpackage.hb1) objArr[i2]).IHQe1A4L2xu(set) || z2;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01ef A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0222 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r6v0, types: [xl0] */
    /* JADX WARN: Type inference failed for: r6v16, types: [java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void oh6vYeIP(java.lang.Object obj, defpackage.g00 g00Var, defpackage.vz vzVar) {
        ?? r6;
        java.lang.Object obj2;
        defpackage.hb1 hb1Var;
        boolean z;
        defpackage.hb1 hb1Var2;
        long j;
        long j2;
        defpackage.hb1 hb1Var3;
        defpackage.oa1 ri1Var;
        long j3;
        defpackage.fl0 fl0Var;
        int i;
        long j4;
        defpackage.fl0 fl0Var2;
        long DFo87pBq1E5 = defpackage.j70.DFo87pBq1E5();
        synchronized (this.AARZUJiTa) {
            r6 = this.xiZrDbcSW0;
            java.lang.Object[] objArr = r6.adDC3e2L;
            int i2 = r6.AARZUJiTa;
            int i3 = 0;
            while (true) {
                if (i3 >= i2) {
                    obj2 = null;
                    break;
                }
                obj2 = objArr[i3];
                if (((defpackage.hb1) obj2).IHQe1A4L2xu == g00Var) {
                    break;
                } else {
                    i3++;
                }
            }
            hb1Var = (defpackage.hb1) obj2;
            z = true;
            if (hb1Var == null) {
                g00Var.getClass();
                defpackage.mj1.kNAkVymC(1, g00Var);
                hb1Var = new defpackage.hb1(g00Var);
                r6.oh6vYeIP(hb1Var);
            }
            hb1Var2 = this.riuEU0zW4;
            j = this.SH1y5HwkJhh;
        }
        long j5 = r6;
        if (j != -1) {
            j5 = r6;
            if (j != DFo87pBq1E5) {
                defpackage.nw0.IHQe1A4L2xu("Detected multithreaded access to SnapshotStateObserver: previousThreadId=" + j + "), currentThread={id=" + DFo87pBq1E5 + ", name=" + java.lang.Thread.currentThread().getName() + "}. Note that observation on multiple threads in layout/draw is not supported. Make sure your measure/layout/draw for each Owner (AndroidComposeView) is executed on the same thread.");
                j5 = "}. Note that observation on multiple threads in layout/draw is not supported. Make sure your measure/layout/draw for each Owner (AndroidComposeView) is executed on the same thread.";
            }
        }
        try {
            synchronized (this.AARZUJiTa) {
                try {
                    this.riuEU0zW4 = hb1Var;
                    this.SH1y5HwkJhh = DFo87pBq1E5;
                } catch (java.lang.Throwable th) {
                    th = th;
                    j2 = j5;
                }
            }
            defpackage.DFo87pBq1E5 dFo87pBq1E5 = this.adDC3e2L;
            java.lang.Object obj3 = hb1Var.oh6vYeIP;
            defpackage.fl0 fl0Var3 = hb1Var.r1MBDhnF;
            int i4 = hb1Var.F7NU4MC0GW;
            hb1Var.oh6vYeIP = obj;
            hb1Var.r1MBDhnF = (defpackage.fl0) hb1Var.xiZrDbcSW0.AARZUJiTa(obj);
            if (hb1Var.F7NU4MC0GW == -1) {
                hb1Var.F7NU4MC0GW = java.lang.Long.hashCode(defpackage.wa1.SH1y5HwkJhh().AARZUJiTa());
            }
            defpackage.s10 s10Var = hb1Var.riuEU0zW4;
            defpackage.xl0 cnag84Bm = defpackage.c80.cnag84Bm();
            try {
                cnag84Bm.oh6vYeIP(s10Var);
                if (dFo87pBq1E5 == null) {
                    vzVar.IHQe1A4L2xu();
                    hb1Var3 = hb1Var;
                } else {
                    defpackage.oa1 oa1Var = (defpackage.oa1) defpackage.wa1.oh6vYeIP.adDC3e2L();
                    if (oa1Var instanceof defpackage.ri1) {
                        hb1Var3 = hb1Var;
                        if (((defpackage.ri1) oa1Var).fnWB2E7cs == defpackage.j70.DFo87pBq1E5()) {
                            defpackage.g00 g00Var2 = ((defpackage.ri1) oa1Var).kd6TUFXn;
                            defpackage.g00 g00Var3 = ((defpackage.ri1) oa1Var).EgCjBq0SZwJ;
                            try {
                                ((defpackage.ri1) oa1Var).kd6TUFXn = defpackage.wa1.ez2rX8ReCYw(dFo87pBq1E5, g00Var2, true);
                                ((defpackage.ri1) oa1Var).EgCjBq0SZwJ = g00Var3;
                                vzVar.IHQe1A4L2xu();
                                ((defpackage.ri1) oa1Var).kd6TUFXn = g00Var2;
                                ((defpackage.ri1) oa1Var).EgCjBq0SZwJ = g00Var3;
                            } catch (java.lang.Throwable th2) {
                                ((defpackage.ri1) oa1Var).kd6TUFXn = g00Var2;
                                ((defpackage.ri1) oa1Var).EgCjBq0SZwJ = g00Var3;
                                throw th2;
                            }
                        }
                    } else {
                        hb1Var3 = hb1Var;
                    }
                    if (oa1Var == null || (oa1Var instanceof defpackage.rl0)) {
                        ri1Var = new defpackage.ri1(oa1Var instanceof defpackage.rl0 ? (defpackage.rl0) oa1Var : null, dFo87pBq1E5, null, true, false);
                    } else {
                        ri1Var = oa1Var.kNAkVymC(dFo87pBq1E5);
                    }
                    try {
                        defpackage.oa1 SH1y5HwkJhh = ri1Var.SH1y5HwkJhh();
                        try {
                            vzVar.IHQe1A4L2xu();
                            defpackage.oa1.G3OKOH3wZRC(SH1y5HwkJhh);
                            ri1Var.r1MBDhnF();
                        } catch (java.lang.Throwable th3) {
                            try {
                                defpackage.oa1.G3OKOH3wZRC(SH1y5HwkJhh);
                                throw th3;
                            } catch (java.lang.Throwable th4) {
                                th = th4;
                                try {
                                    ri1Var.r1MBDhnF();
                                    throw th;
                                } catch (java.lang.Throwable th5) {
                                    th = th5;
                                    cnag84Bm.ez2rX8ReCYw(cnag84Bm.AARZUJiTa - 1);
                                    throw th;
                                }
                            }
                        }
                    } catch (java.lang.Throwable th6) {
                        th = th6;
                    }
                }
                cnag84Bm.ez2rX8ReCYw(cnag84Bm.AARZUJiTa - 1);
                defpackage.hb1 hb1Var4 = hb1Var3;
                java.lang.Object obj4 = hb1Var4.oh6vYeIP;
                obj4.getClass();
                int i5 = hb1Var4.F7NU4MC0GW;
                defpackage.fl0 fl0Var4 = hb1Var4.r1MBDhnF;
                if (fl0Var4 != null) {
                    try {
                        long[] jArr = fl0Var4.IHQe1A4L2xu;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i6 = 0;
                            while (true) {
                                long j6 = jArr[i6];
                                boolean z2 = z;
                                defpackage.fl0 fl0Var5 = fl0Var4;
                                if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i7 = 8 - ((~(i6 - length)) >>> 31);
                                    int i8 = 0;
                                    while (i8 < i7) {
                                        if ((j6 & 255) < 128) {
                                            i = i8;
                                            int i9 = (i6 << 3) + i;
                                            j4 = j6;
                                            fl0Var2 = fl0Var5;
                                            java.lang.Object obj5 = fl0Var2.oh6vYeIP[i9];
                                            j3 = j;
                                            try {
                                                boolean z3 = fl0Var2.r1MBDhnF[i9] != i5 ? z2 : false;
                                                if (z3) {
                                                    hb1Var4.r1MBDhnF(obj4, obj5);
                                                }
                                                if (z3) {
                                                    fl0Var2.xiZrDbcSW0(i9);
                                                }
                                            } catch (java.lang.Throwable th7) {
                                                th = th7;
                                                j2 = j3;
                                                synchronized (this.AARZUJiTa) {
                                                }
                                            }
                                        } else {
                                            i = i8;
                                            j4 = j6;
                                            fl0Var2 = fl0Var5;
                                            j3 = j;
                                        }
                                        i8 = i + 1;
                                        long j7 = j3;
                                        fl0Var5 = fl0Var2;
                                        j6 = j4 >> 8;
                                        j = j7;
                                    }
                                    fl0Var = fl0Var5;
                                    j3 = j;
                                    if (i7 != 8) {
                                        break;
                                    }
                                } else {
                                    fl0Var = fl0Var5;
                                    j3 = j;
                                }
                                if (i6 == length) {
                                    break;
                                }
                                i6++;
                                fl0Var4 = fl0Var;
                                z = z2;
                                j = j3;
                            }
                            hb1Var4.oh6vYeIP = obj3;
                            hb1Var4.r1MBDhnF = fl0Var3;
                            hb1Var4.F7NU4MC0GW = i4;
                            synchronized (this.AARZUJiTa) {
                                this.riuEU0zW4 = hb1Var2;
                                this.SH1y5HwkJhh = j3;
                            }
                            return;
                        }
                    } catch (java.lang.Throwable th8) {
                        th = th8;
                        j3 = j;
                        j2 = j3;
                        synchronized (this.AARZUJiTa) {
                            this.riuEU0zW4 = hb1Var2;
                            this.SH1y5HwkJhh = j2;
                        }
                        throw th;
                    }
                }
                j3 = j;
                hb1Var4.oh6vYeIP = obj3;
                hb1Var4.r1MBDhnF = fl0Var3;
                hb1Var4.F7NU4MC0GW = i4;
                synchronized (this.AARZUJiTa) {
                }
            } catch (java.lang.Throwable th9) {
                th = th9;
                cnag84Bm.ez2rX8ReCYw(cnag84Bm.AARZUJiTa - 1);
                throw th;
            }
        } catch (java.lang.Throwable th10) {
            th = th10;
            j2 = j;
        }
    }

    public final void r1MBDhnF() {
        defpackage.t2LXIqmbaC5 t2lxiqmbac5 = this.F7NU4MC0GW;
        defpackage.wa1.adDC3e2L(defpackage.wa1.IHQe1A4L2xu);
        synchronized (defpackage.wa1.r1MBDhnF) {
            defpackage.wa1.EXtogiMhuM = defpackage.td.ZNF7fheNE(defpackage.wa1.EXtogiMhuM, t2lxiqmbac5);
        }
        this.EXtogiMhuM = new defpackage.qq0(t2lxiqmbac5);
    }
}
