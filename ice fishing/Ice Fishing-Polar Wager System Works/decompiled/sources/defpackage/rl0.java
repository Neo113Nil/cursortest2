package defpackage;

/* loaded from: classes.dex */
public class rl0 extends defpackage.oa1 {
    public static final int[] SyNS6RMn = new int[0];
    public int AARZUJiTa;
    public boolean DFo87pBq1E5;
    public defpackage.ol0 EXtogiMhuM;
    public int JlrlGoKF;
    public defpackage.ua1 SH1y5HwkJhh;
    public final defpackage.g00 adDC3e2L;
    public int[] ez2rX8ReCYw;
    public java.util.ArrayList riuEU0zW4;
    public final defpackage.g00 xiZrDbcSW0;

    public rl0(long j, defpackage.ua1 ua1Var, defpackage.g00 g00Var, defpackage.g00 g00Var2) {
        super(j, ua1Var);
        this.adDC3e2L = g00Var;
        this.xiZrDbcSW0 = g00Var2;
        this.SH1y5HwkJhh = defpackage.ua1.riuEU0zW4;
        this.ez2rX8ReCYw = SyNS6RMn;
        this.JlrlGoKF = 1;
    }

    public final void C0U8sNJm(long j) {
        synchronized (defpackage.wa1.r1MBDhnF) {
            this.SH1y5HwkJhh = this.SH1y5HwkJhh.xiZrDbcSW0(j);
        }
    }

    @Override // defpackage.oa1
    public void DFo87pBq1E5() {
        if (this.DFo87pBq1E5 || this.r1MBDhnF) {
            return;
        }
        V7bD7b8KA();
    }

    @Override // defpackage.oa1
    public int EXtogiMhuM() {
        return this.AARZUJiTa;
    }

    @Override // defpackage.oa1
    public void JlrlGoKF() {
        if (this.JlrlGoKF <= 0) {
            defpackage.nw0.IHQe1A4L2xu("no pending nested snapshots");
        }
        int i = this.JlrlGoKF - 1;
        this.JlrlGoKF = i;
        if (i != 0 || this.DFo87pBq1E5) {
            return;
        }
        defpackage.ol0 abhbClRa = abhbClRa();
        if (abhbClRa != null) {
            if (this.DFo87pBq1E5) {
                defpackage.nw0.oh6vYeIP("Unsupported operation on a snapshot that has been applied");
            }
            UsuH8pd5P(null);
            long AARZUJiTa = AARZUJiTa();
            java.lang.Object[] objArr = abhbClRa.oh6vYeIP;
            long[] jArr = abhbClRa.IHQe1A4L2xu;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i2 = 0;
                while (true) {
                    long j = jArr[i2];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i3 = 8 - ((~(i2 - length)) >>> 31);
                        for (int i4 = 0; i4 < i3; i4++) {
                            if ((255 & j) < 128) {
                                for (defpackage.mc1 IHQe1A4L2xu = ((defpackage.kc1) objArr[(i2 << 3) + i4]).IHQe1A4L2xu(); IHQe1A4L2xu != null; IHQe1A4L2xu = IHQe1A4L2xu.oh6vYeIP) {
                                    long j2 = IHQe1A4L2xu.IHQe1A4L2xu;
                                    if (j2 == AARZUJiTa || defpackage.td.CGXpA9s3RjIa(this.SH1y5HwkJhh, java.lang.Long.valueOf(j2))) {
                                        defpackage.r41 r41Var = defpackage.wa1.IHQe1A4L2xu;
                                        IHQe1A4L2xu.IHQe1A4L2xu = 0L;
                                    }
                                }
                            }
                            j >>= 8;
                        }
                        if (i3 != 8) {
                            break;
                        }
                    }
                    if (i2 == length) {
                        break;
                    } else {
                        i2++;
                    }
                }
            }
        }
        IHQe1A4L2xu();
    }

    @Override // defpackage.oa1
    /* renamed from: NHJTzaLwkd, reason: merged with bridge method [inline-methods] */
    public defpackage.g00 adDC3e2L() {
        return this.adDC3e2L;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ab A[LOOP:1: B:31:0x00a9->B:32:0x00ab, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ba A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0111 A[Catch: all -> 0x00fe, TryCatch #1 {all -> 0x00fe, blocks: (B:37:0x00ba, B:39:0x00ca, B:42:0x00d6, B:44:0x00e2, B:46:0x00ec, B:48:0x00f2, B:50:0x0100, B:56:0x0111, B:59:0x011b, B:61:0x0125, B:63:0x012f, B:65:0x0135, B:67:0x013f, B:73:0x0147, B:75:0x014a, B:77:0x014e, B:79:0x0155, B:81:0x0161, B:87:0x0108), top: B:36:0x00ba }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x014e A[Catch: all -> 0x00fe, TryCatch #1 {all -> 0x00fe, blocks: (B:37:0x00ba, B:39:0x00ca, B:42:0x00d6, B:44:0x00e2, B:46:0x00ec, B:48:0x00f2, B:50:0x0100, B:56:0x0111, B:59:0x011b, B:61:0x0125, B:63:0x012f, B:65:0x0135, B:67:0x013f, B:73:0x0147, B:75:0x014a, B:77:0x014e, B:79:0x0155, B:81:0x0161, B:87:0x0108), top: B:36:0x00ba }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public defpackage.j70 PAEGRtP0bX() {
        java.util.HashMap hashMap;
        java.util.List list;
        defpackage.ol0 ol0Var;
        long j;
        long j2;
        java.util.ArrayList arrayList;
        int size;
        int i;
        defpackage.ol0 abhbClRa = abhbClRa();
        if (abhbClRa != null) {
            long j3 = defpackage.wa1.SH1y5HwkJhh.oh6vYeIP;
            hashMap = defpackage.wa1.oh6vYeIP(j3, this, defpackage.wa1.F7NU4MC0GW.oh6vYeIP(j3));
        } else {
            hashMap = null;
        }
        defpackage.nt ntVar = defpackage.nt.adDC3e2L;
        synchronized (defpackage.wa1.r1MBDhnF) {
            try {
                defpackage.wa1.r1MBDhnF(this);
                if (abhbClRa != null && abhbClRa.F7NU4MC0GW != 0) {
                    defpackage.l20 l20Var = defpackage.wa1.SH1y5HwkJhh;
                    defpackage.j70 QQUzIjv3iOC5 = QQUzIjv3iOC5(defpackage.wa1.adDC3e2L, abhbClRa, hashMap, defpackage.wa1.F7NU4MC0GW.oh6vYeIP(l20Var.oh6vYeIP));
                    if (!QQUzIjv3iOC5.equals(defpackage.ra1.adDC3e2L)) {
                        return QQUzIjv3iOC5;
                    }
                    oh6vYeIP();
                    ol0Var = l20Var.EXtogiMhuM;
                    defpackage.wa1.V7bD7b8KA(l20Var, defpackage.wa1.IHQe1A4L2xu);
                    UsuH8pd5P(null);
                    l20Var.EXtogiMhuM = null;
                    list = defpackage.wa1.EXtogiMhuM;
                    this.DFo87pBq1E5 = true;
                    if (ol0Var != null) {
                        defpackage.b51 b51Var = new defpackage.b51(ol0Var);
                        if (!ol0Var.AARZUJiTa()) {
                            int size2 = list.size();
                            for (int i2 = 0; i2 < size2; i2++) {
                                ((defpackage.k00) list.get(i2)).adDC3e2L(b51Var, this);
                            }
                        }
                    }
                    if (abhbClRa != null && abhbClRa.EXtogiMhuM()) {
                        defpackage.b51 b51Var2 = new defpackage.b51(abhbClRa);
                        size = list.size();
                        for (i = 0; i < size; i++) {
                            ((defpackage.k00) list.get(i)).adDC3e2L(b51Var2, this);
                        }
                    }
                    synchronized (defpackage.wa1.r1MBDhnF) {
                        try {
                            QoRHpC4k();
                            defpackage.wa1.xiZrDbcSW0();
                            if (ol0Var != null) {
                                java.lang.Object[] objArr = ol0Var.oh6vYeIP;
                                long[] jArr = ol0Var.IHQe1A4L2xu;
                                int length = jArr.length - 2;
                                if (length >= 0) {
                                    int i3 = 0;
                                    j = 128;
                                    while (true) {
                                        long j4 = jArr[i3];
                                        j2 = 255;
                                        if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i4 = 8 - ((~(i3 - length)) >>> 31);
                                            for (int i5 = 0; i5 < i4; i5++) {
                                                if ((j4 & 255) < 128) {
                                                    defpackage.wa1.G3OKOH3wZRC((defpackage.kc1) objArr[(i3 << 3) + i5]);
                                                }
                                                j4 >>= 8;
                                            }
                                            if (i4 != 8) {
                                                break;
                                            }
                                        }
                                        if (i3 == length) {
                                            break;
                                        }
                                        i3++;
                                    }
                                    if (abhbClRa != null) {
                                        java.lang.Object[] objArr2 = abhbClRa.oh6vYeIP;
                                        long[] jArr2 = abhbClRa.IHQe1A4L2xu;
                                        int length2 = jArr2.length - 2;
                                        if (length2 >= 0) {
                                            int i6 = 0;
                                            while (true) {
                                                long j5 = jArr2[i6];
                                                if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                    int i7 = 8 - ((~(i6 - length2)) >>> 31);
                                                    for (int i8 = 0; i8 < i7; i8++) {
                                                        if ((j5 & j2) < j) {
                                                            defpackage.wa1.G3OKOH3wZRC((defpackage.kc1) objArr2[(i6 << 3) + i8]);
                                                        }
                                                        j5 >>= 8;
                                                    }
                                                    if (i7 != 8) {
                                                        break;
                                                    }
                                                }
                                                if (i6 == length2) {
                                                    break;
                                                }
                                                i6++;
                                            }
                                        }
                                    }
                                    arrayList = this.riuEU0zW4;
                                    if (arrayList != null) {
                                        int size3 = arrayList.size();
                                        for (int i9 = 0; i9 < size3; i9++) {
                                            defpackage.wa1.G3OKOH3wZRC((defpackage.kc1) arrayList.get(i9));
                                        }
                                    }
                                    this.riuEU0zW4 = null;
                                }
                            }
                            j = 128;
                            j2 = 255;
                            if (abhbClRa != null) {
                            }
                            arrayList = this.riuEU0zW4;
                            if (arrayList != null) {
                            }
                            this.riuEU0zW4 = null;
                        } catch (java.lang.Throwable th) {
                            throw th;
                        }
                    }
                    return defpackage.ra1.adDC3e2L;
                }
                oh6vYeIP();
                defpackage.l20 l20Var2 = defpackage.wa1.SH1y5HwkJhh;
                defpackage.ol0 ol0Var2 = l20Var2.EXtogiMhuM;
                defpackage.wa1.V7bD7b8KA(l20Var2, defpackage.wa1.IHQe1A4L2xu);
                if (ol0Var2 == null || !ol0Var2.EXtogiMhuM()) {
                    list = ntVar;
                    ol0Var = null;
                } else {
                    list = defpackage.wa1.EXtogiMhuM;
                    ol0Var = ol0Var2;
                }
                this.DFo87pBq1E5 = true;
                if (ol0Var != null) {
                }
                if (abhbClRa != null) {
                    defpackage.b51 b51Var22 = new defpackage.b51(abhbClRa);
                    size = list.size();
                    while (i < size) {
                    }
                }
                synchronized (defpackage.wa1.r1MBDhnF) {
                }
            } catch (java.lang.Throwable th2) {
                throw th2;
            }
        }
    }

    public final defpackage.j70 QQUzIjv3iOC5(long j, defpackage.ol0 ol0Var, java.util.HashMap hashMap, defpackage.ua1 ua1Var) {
        java.util.ArrayList arrayList;
        java.util.ArrayList arrayList2;
        java.util.ArrayList arrayList3;
        defpackage.ua1 ua1Var2;
        java.lang.Object[] objArr;
        long[] jArr;
        defpackage.ua1 ua1Var3;
        java.lang.Object[] objArr2;
        long[] jArr2;
        int i;
        long j2;
        java.util.ArrayList arrayList4;
        defpackage.mc1 oh6vYeIP;
        defpackage.ua1 adDC3e2L = F7NU4MC0GW().xiZrDbcSW0(AARZUJiTa()).adDC3e2L(this.SH1y5HwkJhh);
        java.lang.Object[] objArr3 = ol0Var.oh6vYeIP;
        long[] jArr3 = ol0Var.IHQe1A4L2xu;
        int length = jArr3.length - 2;
        if (length >= 0) {
            int i2 = 0;
            arrayList3 = null;
            arrayList2 = null;
            while (true) {
                long j3 = jArr3[i2];
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    int i4 = 0;
                    while (i4 < i3) {
                        if ((j3 & 255) < 128) {
                            objArr2 = objArr3;
                            defpackage.kc1 kc1Var = (defpackage.kc1) objArr3[(i2 << 3) + i4];
                            jArr2 = jArr3;
                            defpackage.mc1 IHQe1A4L2xu = kc1Var.IHQe1A4L2xu();
                            i = i4;
                            java.util.ArrayList arrayList5 = arrayList3;
                            defpackage.mc1 EgCjBq0SZwJ = defpackage.wa1.EgCjBq0SZwJ(IHQe1A4L2xu, j, ua1Var);
                            if (EgCjBq0SZwJ == null) {
                                arrayList4 = arrayList2;
                                j2 = j3;
                            } else {
                                arrayList4 = arrayList2;
                                j2 = j3;
                                defpackage.mc1 EgCjBq0SZwJ2 = defpackage.wa1.EgCjBq0SZwJ(IHQe1A4L2xu, AARZUJiTa(), adDC3e2L);
                                if (EgCjBq0SZwJ2 != null && EgCjBq0SZwJ2.IHQe1A4L2xu != 1 && !EgCjBq0SZwJ.equals(EgCjBq0SZwJ2)) {
                                    ua1Var3 = adDC3e2L;
                                    defpackage.mc1 EgCjBq0SZwJ3 = defpackage.wa1.EgCjBq0SZwJ(IHQe1A4L2xu, AARZUJiTa(), F7NU4MC0GW());
                                    if (EgCjBq0SZwJ3 == null) {
                                        defpackage.wa1.kd6TUFXn();
                                        throw null;
                                    }
                                    if (hashMap == null || (oh6vYeIP = (defpackage.mc1) hashMap.get(EgCjBq0SZwJ)) == null) {
                                        oh6vYeIP = kc1Var.oh6vYeIP(EgCjBq0SZwJ2, EgCjBq0SZwJ, EgCjBq0SZwJ3);
                                    }
                                    if (oh6vYeIP == null) {
                                        return new defpackage.qa1(this);
                                    }
                                    if (!oh6vYeIP.equals(EgCjBq0SZwJ3)) {
                                        if (oh6vYeIP.equals(EgCjBq0SZwJ)) {
                                            java.util.ArrayList arrayList6 = arrayList5 == null ? new java.util.ArrayList() : arrayList5;
                                            arrayList6.add(new defpackage.et0(kc1Var, EgCjBq0SZwJ.oh6vYeIP(AARZUJiTa())));
                                            arrayList2 = arrayList4 == null ? new java.util.ArrayList() : arrayList4;
                                            arrayList2.add(kc1Var);
                                            arrayList3 = arrayList6;
                                        } else {
                                            arrayList3 = arrayList5 == null ? new java.util.ArrayList() : arrayList5;
                                            arrayList3.add(!oh6vYeIP.equals(EgCjBq0SZwJ2) ? new defpackage.et0(kc1Var, oh6vYeIP) : new defpackage.et0(kc1Var, EgCjBq0SZwJ2.oh6vYeIP(AARZUJiTa())));
                                            arrayList2 = arrayList4;
                                        }
                                    }
                                    arrayList3 = arrayList5;
                                    arrayList2 = arrayList4;
                                }
                            }
                            ua1Var3 = adDC3e2L;
                            arrayList3 = arrayList5;
                            arrayList2 = arrayList4;
                        } else {
                            ua1Var3 = adDC3e2L;
                            objArr2 = objArr3;
                            jArr2 = jArr3;
                            i = i4;
                            j2 = j3;
                        }
                        j3 = j2 >> 8;
                        i4 = i + 1;
                        jArr3 = jArr2;
                        objArr3 = objArr2;
                        adDC3e2L = ua1Var3;
                    }
                    ua1Var2 = adDC3e2L;
                    objArr = objArr3;
                    jArr = jArr3;
                    if (i3 != 8) {
                        break;
                    }
                } else {
                    ua1Var2 = adDC3e2L;
                    objArr = objArr3;
                    jArr = jArr3;
                }
                if (i2 == length) {
                    arrayList = arrayList3;
                    break;
                }
                i2++;
                jArr3 = jArr;
                objArr3 = objArr;
                adDC3e2L = ua1Var2;
            }
        } else {
            arrayList = null;
            arrayList2 = null;
        }
        arrayList3 = arrayList;
        if (arrayList3 != null) {
            V7bD7b8KA();
            int size = arrayList3.size();
            for (int i5 = 0; i5 < size; i5++) {
                defpackage.et0 et0Var = (defpackage.et0) arrayList3.get(i5);
                defpackage.kc1 kc1Var2 = (defpackage.kc1) et0Var.adDC3e2L;
                defpackage.mc1 mc1Var = (defpackage.mc1) et0Var.xiZrDbcSW0;
                mc1Var.IHQe1A4L2xu = j;
                synchronized (defpackage.wa1.r1MBDhnF) {
                    mc1Var.oh6vYeIP = kc1Var2.IHQe1A4L2xu();
                    kc1Var2.r1MBDhnF(mc1Var);
                }
            }
        }
        if (arrayList2 != null) {
            int size2 = arrayList2.size();
            for (int i6 = 0; i6 < size2; i6++) {
                ol0Var.JlrlGoKF((defpackage.kc1) arrayList2.get(i6));
            }
            java.util.ArrayList arrayList7 = this.riuEU0zW4;
            if (arrayList7 != null) {
                arrayList2 = defpackage.td.flIYPhR0(arrayList7, arrayList2);
            }
            this.riuEU0zW4 = arrayList2;
        }
        return defpackage.ra1.adDC3e2L;
    }

    @Override // defpackage.oa1
    public final void QoRHpC4k() {
        int length = this.ez2rX8ReCYw.length;
        for (int i = 0; i < length; i++) {
            defpackage.wa1.kNAkVymC(this.ez2rX8ReCYw[i]);
        }
        cnag84Bm();
    }

    @Override // defpackage.oa1
    public void SyNS6RMn(defpackage.kc1 kc1Var) {
        defpackage.ol0 abhbClRa = abhbClRa();
        if (abhbClRa == null) {
            defpackage.ol0 ol0Var = defpackage.a51.IHQe1A4L2xu;
            abhbClRa = new defpackage.ol0();
            UsuH8pd5P(abhbClRa);
        }
        abhbClRa.IHQe1A4L2xu(kc1Var);
    }

    public void UsuH8pd5P(defpackage.ol0 ol0Var) {
        this.EXtogiMhuM = ol0Var;
    }

    public final void V7bD7b8KA() {
        C0U8sNJm(AARZUJiTa());
        if (this.DFo87pBq1E5 || this.r1MBDhnF) {
            return;
        }
        long AARZUJiTa = AARZUJiTa();
        synchronized (defpackage.wa1.r1MBDhnF) {
            long j = defpackage.wa1.adDC3e2L;
            defpackage.wa1.adDC3e2L = j + 1;
            EgCjBq0SZwJ(j);
            defpackage.wa1.F7NU4MC0GW = defpackage.wa1.F7NU4MC0GW.xiZrDbcSW0(AARZUJiTa());
        }
        kd6TUFXn(defpackage.wa1.F7NU4MC0GW(F7NU4MC0GW(), AARZUJiTa + 1, AARZUJiTa()));
    }

    public defpackage.ol0 abhbClRa() {
        return this.EXtogiMhuM;
    }

    @Override // defpackage.oa1
    public void ez2rX8ReCYw() {
        this.JlrlGoKF++;
    }

    @Override // defpackage.oa1
    public void fnWB2E7cs(int i) {
        this.AARZUJiTa = i;
    }

    @Override // defpackage.oa1
    public defpackage.oa1 kNAkVymC(defpackage.g00 g00Var) {
        defpackage.so0 so0Var;
        if (this.r1MBDhnF) {
            defpackage.nw0.IHQe1A4L2xu("Cannot use a disposed snapshot");
        }
        if (this.DFo87pBq1E5 && this.F7NU4MC0GW < 0) {
            defpackage.nw0.oh6vYeIP("Unsupported operation on a disposed or applied snapshot");
        }
        long AARZUJiTa = AARZUJiTa();
        C0U8sNJm(AARZUJiTa());
        java.lang.Object obj = defpackage.wa1.r1MBDhnF;
        synchronized (obj) {
            long j = defpackage.wa1.adDC3e2L;
            defpackage.wa1.adDC3e2L = j + 1;
            defpackage.wa1.F7NU4MC0GW = defpackage.wa1.F7NU4MC0GW.xiZrDbcSW0(j);
            so0Var = new defpackage.so0(j, defpackage.wa1.F7NU4MC0GW(F7NU4MC0GW(), AARZUJiTa + 1, j), defpackage.wa1.ez2rX8ReCYw(g00Var, adDC3e2L(), true), this);
        }
        if (this.DFo87pBq1E5 || this.r1MBDhnF) {
            return so0Var;
        }
        long AARZUJiTa2 = AARZUJiTa();
        synchronized (obj) {
            long j2 = defpackage.wa1.adDC3e2L;
            defpackage.wa1.adDC3e2L = j2 + 1;
            EgCjBq0SZwJ(j2);
            defpackage.wa1.F7NU4MC0GW = defpackage.wa1.F7NU4MC0GW.xiZrDbcSW0(AARZUJiTa());
        }
        kd6TUFXn(defpackage.wa1.F7NU4MC0GW(F7NU4MC0GW(), AARZUJiTa2 + 1, AARZUJiTa()));
        return so0Var;
    }

    public defpackage.rl0 nBH8hAHy(defpackage.g00 g00Var, defpackage.g00 g00Var2) {
        defpackage.ro0 ro0Var;
        if (this.r1MBDhnF) {
            defpackage.nw0.IHQe1A4L2xu("Cannot use a disposed snapshot");
        }
        if (this.DFo87pBq1E5 && this.F7NU4MC0GW < 0) {
            defpackage.nw0.oh6vYeIP("Unsupported operation on a disposed or applied snapshot");
        }
        C0U8sNJm(AARZUJiTa());
        java.lang.Object obj = defpackage.wa1.r1MBDhnF;
        synchronized (obj) {
            long j = defpackage.wa1.adDC3e2L;
            defpackage.wa1.adDC3e2L = j + 1;
            defpackage.wa1.F7NU4MC0GW = defpackage.wa1.F7NU4MC0GW.xiZrDbcSW0(j);
            defpackage.ua1 F7NU4MC0GW = F7NU4MC0GW();
            kd6TUFXn(F7NU4MC0GW.xiZrDbcSW0(j));
            ro0Var = new defpackage.ro0(j, defpackage.wa1.F7NU4MC0GW(F7NU4MC0GW, AARZUJiTa() + 1, j), defpackage.wa1.ez2rX8ReCYw(g00Var, adDC3e2L(), true), defpackage.wa1.JlrlGoKF(g00Var2, riuEU0zW4()), this);
        }
        if (this.DFo87pBq1E5 || this.r1MBDhnF) {
            return ro0Var;
        }
        long AARZUJiTa = AARZUJiTa();
        synchronized (obj) {
            long j2 = defpackage.wa1.adDC3e2L;
            defpackage.wa1.adDC3e2L = j2 + 1;
            EgCjBq0SZwJ(j2);
            defpackage.wa1.F7NU4MC0GW = defpackage.wa1.F7NU4MC0GW.xiZrDbcSW0(AARZUJiTa());
        }
        kd6TUFXn(defpackage.wa1.F7NU4MC0GW(F7NU4MC0GW(), AARZUJiTa + 1, AARZUJiTa()));
        return ro0Var;
    }

    @Override // defpackage.oa1
    public final void oh6vYeIP() {
        defpackage.wa1.F7NU4MC0GW = defpackage.wa1.F7NU4MC0GW.oh6vYeIP(AARZUJiTa()).IHQe1A4L2xu(this.SH1y5HwkJhh);
    }

    @Override // defpackage.oa1
    public void r1MBDhnF() {
        if (this.r1MBDhnF) {
            return;
        }
        this.r1MBDhnF = true;
        synchronized (defpackage.wa1.r1MBDhnF) {
            cnag84Bm();
        }
        JlrlGoKF();
    }

    @Override // defpackage.oa1
    public defpackage.g00 riuEU0zW4() {
        return this.xiZrDbcSW0;
    }

    @Override // defpackage.oa1
    public boolean xiZrDbcSW0() {
        return false;
    }
}
