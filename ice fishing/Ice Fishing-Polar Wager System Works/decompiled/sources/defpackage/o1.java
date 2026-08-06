package defpackage;

/* loaded from: classes.dex */
public final class o1 implements defpackage.ym, android.view.View.OnAttachStateChangeListener {
    public defpackage.F7NU4MC0GW AARZUJiTa;
    public defpackage.xk0 DFo87pBq1E5;
    public boolean G3OKOH3wZRC;
    public defpackage.g71 QoRHpC4k;
    public long SyNS6RMn;
    public final defpackage.v0 adDC3e2L;
    public final defpackage.xk0 cnag84Bm;
    public final defpackage.cnag84Bm kd6TUFXn;
    public final defpackage.m0 xiZrDbcSW0;
    public final java.util.ArrayList EXtogiMhuM = new java.util.ArrayList();
    public final long riuEU0zW4 = 100;
    public defpackage.k1 SH1y5HwkJhh = defpackage.k1.adDC3e2L;
    public boolean ez2rX8ReCYw = true;
    public final defpackage.x9 JlrlGoKF = defpackage.w70.oh6vYeIP(1, 6, null);

    public o1(defpackage.v0 v0Var, defpackage.m0 m0Var) {
        this.adDC3e2L = v0Var;
        this.xiZrDbcSW0 = m0Var;
        new android.os.Handler(android.os.Looper.getMainLooper());
        defpackage.xk0 xk0Var = defpackage.y60.IHQe1A4L2xu;
        xk0Var.getClass();
        this.DFo87pBq1E5 = xk0Var;
        this.cnag84Bm = new defpackage.xk0();
        this.QoRHpC4k = new defpackage.g71(v0Var.getSemanticsOwner().IHQe1A4L2xu(), xk0Var);
        this.kd6TUFXn = new defpackage.cnag84Bm(2, this);
    }

    public final void DFo87pBq1E5(defpackage.f71 f71Var) {
        if (xiZrDbcSW0()) {
            this.EXtogiMhuM.add(new defpackage.pi(f71Var.xiZrDbcSW0, this.SyNS6RMn, defpackage.qi.xiZrDbcSW0, null));
            java.util.List SH1y5HwkJhh = defpackage.f71.SH1y5HwkJhh(4, f71Var);
            int size = SH1y5HwkJhh.size();
            for (int i = 0; i < size; i++) {
                DFo87pBq1E5((defpackage.f71) SH1y5HwkJhh.get(i));
            }
        }
    }

    public final void EXtogiMhuM() {
        defpackage.F7NU4MC0GW f7nu4mc0gw = this.AARZUJiTa;
        if (f7nu4mc0gw == null) {
            return;
        }
        java.lang.Object obj = f7nu4mc0gw.xiZrDbcSW0;
        if (android.os.Build.VERSION.SDK_INT < 29) {
            return;
        }
        java.util.ArrayList arrayList = this.EXtogiMhuM;
        if (arrayList.isEmpty()) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            defpackage.pi piVar = (defpackage.pi) arrayList.get(i);
            int ordinal = piVar.r1MBDhnF.ordinal();
            if (ordinal == 0) {
                defpackage.sa1 sa1Var = piVar.F7NU4MC0GW;
                if (sa1Var != null) {
                    android.view.ViewStructure viewStructure = (android.view.ViewStructure) sa1Var.xiZrDbcSW0;
                    if (android.os.Build.VERSION.SDK_INT >= 29) {
                        defpackage.ri.F7NU4MC0GW(defpackage.b0.F7NU4MC0GW(obj), viewStructure);
                    }
                }
            } else {
                if (ordinal != 1) {
                    defpackage.db.F7NU4MC0GW();
                    return;
                }
                android.view.autofill.AutofillId V7bD7b8KA = f7nu4mc0gw.V7bD7b8KA(piVar.IHQe1A4L2xu);
                if (V7bD7b8KA != null && android.os.Build.VERSION.SDK_INT >= 29) {
                    defpackage.ri.adDC3e2L(defpackage.b0.F7NU4MC0GW(obj), V7bD7b8KA);
                }
            }
        }
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            android.view.contentcapture.ContentCaptureSession F7NU4MC0GW = defpackage.b0.F7NU4MC0GW(obj);
            defpackage.FyULxpbU8bu V7bD7b8KA2 = defpackage.s70.V7bD7b8KA((android.view.View) f7nu4mc0gw.AARZUJiTa);
            java.util.Objects.requireNonNull(V7bD7b8KA2);
            defpackage.ri.AARZUJiTa(F7NU4MC0GW, defpackage.e7.oh6vYeIP(V7bD7b8KA2.IHQe1A4L2xu), new long[]{Long.MIN_VALUE});
        }
        arrayList.clear();
    }

    @Override // defpackage.ym
    public final void F7NU4MC0GW(defpackage.ud0 ud0Var) {
        this.AARZUJiTa = (defpackage.F7NU4MC0GW) this.xiZrDbcSW0.IHQe1A4L2xu();
        JlrlGoKF(-1, this.adDC3e2L.getSemanticsOwner().IHQe1A4L2xu());
        EXtogiMhuM();
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x004e, code lost:
    
        if (r8 != r4) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0082, code lost:
    
        if (defpackage.fm.PAEGRtP0bX(r7.riuEU0zW4, r0) == r4) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0084, code lost:
    
        return r4;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0082 -> B:11:0x0046). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object IHQe1A4L2xu(defpackage.fj fjVar) {
        defpackage.m1 m1Var;
        int i;
        defpackage.u9 u9Var;
        if (fjVar instanceof defpackage.m1) {
            m1Var = (defpackage.m1) fjVar;
            int i2 = m1Var.ez2rX8ReCYw;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                m1Var.ez2rX8ReCYw = i2 - Integer.MIN_VALUE;
                java.lang.Object obj = m1Var.riuEU0zW4;
                i = m1Var.ez2rX8ReCYw;
                defpackage.vj vjVar = defpackage.vj.adDC3e2L;
                if (i != 0) {
                    defpackage.f70.nBH8hAHy(obj);
                    defpackage.x9 x9Var = this.JlrlGoKF;
                    x9Var.getClass();
                    u9Var = new defpackage.u9(x9Var);
                } else if (i == 1) {
                    u9Var = m1Var.EXtogiMhuM;
                    defpackage.f70.nBH8hAHy(obj);
                    if (!((java.lang.Boolean) obj).booleanValue()) {
                        return defpackage.ok1.IHQe1A4L2xu;
                    }
                    u9Var.r1MBDhnF();
                    if (xiZrDbcSW0()) {
                        EXtogiMhuM();
                    }
                    android.os.Handler handler = this.adDC3e2L.getHandler();
                    if (!this.G3OKOH3wZRC && handler != null) {
                        this.G3OKOH3wZRC = true;
                        handler.post(this.kd6TUFXn);
                    }
                    m1Var.EXtogiMhuM = u9Var;
                    m1Var.ez2rX8ReCYw = 2;
                } else {
                    if (i != 2) {
                        defpackage.db.AARZUJiTa("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    u9Var = m1Var.EXtogiMhuM;
                    defpackage.f70.nBH8hAHy(obj);
                }
                m1Var.EXtogiMhuM = u9Var;
                m1Var.ez2rX8ReCYw = 1;
                obj = u9Var.oh6vYeIP(m1Var);
            }
        }
        m1Var = new defpackage.m1(this, fjVar);
        java.lang.Object obj2 = m1Var.riuEU0zW4;
        i = m1Var.ez2rX8ReCYw;
        defpackage.vj vjVar2 = defpackage.vj.adDC3e2L;
        if (i != 0) {
        }
        m1Var.EXtogiMhuM = u9Var;
        m1Var.ez2rX8ReCYw = 1;
        obj2 = u9Var.oh6vYeIP(m1Var);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r8v12 android.view.autofill.AutofillId, still in use, count: 2, list:
          (r8v12 android.view.autofill.AutofillId) from 0x0097: IF  (r8v12 android.view.autofill.AutofillId) == (null android.view.autofill.AutofillId)  -> B:22:0x0075 A[HIDDEN] (LINE:152)
          (r8v12 android.view.autofill.AutofillId) from 0x00a0: PHI (r8v4 android.view.autofill.AutofillId) = (r8v3 android.view.autofill.AutofillId), (r8v12 android.view.autofill.AutofillId) binds: [B:103:0x009a, B:42:0x0097] A[DONT_GENERATE, DONT_INLINE]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:114)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:62)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:45)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:67)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:35)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:34)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    /* JADX WARN: Removed duplicated region for block: B:24:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x01cd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void JlrlGoKF(int r19, defpackage.f71 r20) {
        /*
            Method dump skipped, instructions count: 491
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o1.JlrlGoKF(int, f71):void");
    }

    public final void SH1y5HwkJhh(defpackage.f71 f71Var, defpackage.g71 g71Var) {
        int i = 0;
        defpackage.n1 n1Var = new defpackage.n1(i, g71Var, this);
        f71Var.getClass();
        java.util.List SH1y5HwkJhh = defpackage.f71.SH1y5HwkJhh(4, f71Var);
        int size = SH1y5HwkJhh.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            java.lang.Object obj = SH1y5HwkJhh.get(i3);
            if (adDC3e2L().IHQe1A4L2xu(((defpackage.f71) obj).xiZrDbcSW0)) {
                n1Var.adDC3e2L(java.lang.Integer.valueOf(i2), obj);
                i2++;
            }
        }
        java.util.List SH1y5HwkJhh2 = defpackage.f71.SH1y5HwkJhh(4, f71Var);
        int size2 = SH1y5HwkJhh2.size();
        while (i < size2) {
            defpackage.f71 f71Var2 = (defpackage.f71) SH1y5HwkJhh2.get(i);
            defpackage.x60 adDC3e2L = adDC3e2L();
            int i4 = f71Var2.xiZrDbcSW0;
            if (adDC3e2L.IHQe1A4L2xu(i4)) {
                defpackage.xk0 xk0Var = this.cnag84Bm;
                if (xk0Var.IHQe1A4L2xu(i4)) {
                    java.lang.Object oh6vYeIP = xk0Var.oh6vYeIP(i4);
                    if (oh6vYeIP == null) {
                        throw defpackage.fx0.AARZUJiTa("node not present in pruned tree before this change");
                    }
                    SH1y5HwkJhh(f71Var2, (defpackage.g71) oh6vYeIP);
                } else {
                    continue;
                }
            }
            i++;
        }
    }

    public final void SyNS6RMn() {
        defpackage.xk0 xk0Var = this.cnag84Bm;
        xk0Var.r1MBDhnF();
        defpackage.x60 adDC3e2L = adDC3e2L();
        int[] iArr = adDC3e2L.oh6vYeIP;
        java.lang.Object[] objArr = adDC3e2L.r1MBDhnF;
        long[] jArr = adDC3e2L.IHQe1A4L2xu;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = (i << 3) + i3;
                            xk0Var.EXtogiMhuM(iArr[i4], new defpackage.g71(((defpackage.h71) objArr[i4]).IHQe1A4L2xu, adDC3e2L()));
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
        this.QoRHpC4k = new defpackage.g71(this.adDC3e2L.getSemanticsOwner().IHQe1A4L2xu(), adDC3e2L());
    }

    public final defpackage.x60 adDC3e2L() {
        if (this.ez2rX8ReCYw) {
            this.ez2rX8ReCYw = false;
            this.DFo87pBq1E5 = defpackage.h1.PAEGRtP0bX(this.adDC3e2L.getSemanticsOwner(), defpackage.q0.riuEU0zW4);
            this.SyNS6RMn = java.lang.System.currentTimeMillis();
        }
        return this.DFo87pBq1E5;
    }

    public final void ez2rX8ReCYw(java.lang.String str, int i) {
        defpackage.F7NU4MC0GW f7nu4mc0gw;
        int i2 = android.os.Build.VERSION.SDK_INT;
        if (i2 >= 29 && (f7nu4mc0gw = this.AARZUJiTa) != null) {
            android.view.autofill.AutofillId V7bD7b8KA = f7nu4mc0gw.V7bD7b8KA(i);
            if (V7bD7b8KA == null) {
                throw defpackage.fx0.AARZUJiTa("Invalid content capture ID");
            }
            if (i2 >= 29) {
                defpackage.ri.xiZrDbcSW0(defpackage.b0.F7NU4MC0GW(f7nu4mc0gw.xiZrDbcSW0), V7bD7b8KA, str);
            }
        }
    }

    @Override // defpackage.ym
    public final void oh6vYeIP(defpackage.ud0 ud0Var) {
        DFo87pBq1E5(this.adDC3e2L.getSemanticsOwner().IHQe1A4L2xu());
        EXtogiMhuM();
        this.AARZUJiTa = null;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(android.view.View view) {
        android.os.Handler handler = this.adDC3e2L.getHandler();
        handler.getClass();
        handler.removeCallbacks(this.kd6TUFXn);
        this.AARZUJiTa = null;
    }

    public final void r1MBDhnF(defpackage.x60 x60Var) {
        int[] iArr;
        int[] iArr2;
        long j;
        char c;
        long j2;
        int i;
        int i2;
        long j3;
        long j4;
        defpackage.x60 x60Var2 = x60Var;
        int[] iArr3 = x60Var2.oh6vYeIP;
        long[] jArr = x60Var2.IHQe1A4L2xu;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i3 = 0;
        while (true) {
            long j5 = jArr[i3];
            char c2 = 7;
            long j6 = -9187201950435737472L;
            if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i4 = 8;
                int i5 = 8 - ((~(i3 - length)) >>> 31);
                int i6 = 0;
                while (i6 < i5) {
                    if ((j5 & 255) < 128) {
                        int i7 = iArr3[(i3 << 3) + i6];
                        c = c2;
                        defpackage.g71 g71Var = (defpackage.g71) this.cnag84Bm.oh6vYeIP(i7);
                        defpackage.h71 h71Var = (defpackage.h71) x60Var2.oh6vYeIP(i7);
                        defpackage.f71 f71Var = h71Var != null ? h71Var.IHQe1A4L2xu : null;
                        if (f71Var == null) {
                            throw defpackage.fx0.AARZUJiTa("no value for specified key");
                        }
                        j2 = j6;
                        int i8 = f71Var.xiZrDbcSW0;
                        defpackage.nl0 nl0Var = f71Var.F7NU4MC0GW.adDC3e2L;
                        if (g71Var == null) {
                            java.lang.Object[] objArr = nl0Var.oh6vYeIP;
                            long[] jArr2 = nl0Var.IHQe1A4L2xu;
                            int length2 = jArr2.length - 2;
                            iArr2 = iArr3;
                            if (length2 >= 0) {
                                int i9 = i4;
                                int i10 = 0;
                                while (true) {
                                    long j7 = jArr2[i10];
                                    j = j5;
                                    if ((((~j7) << c) & j7 & j2) != j2) {
                                        int i11 = 8 - ((~(i10 - length2)) >>> 31);
                                        for (int i12 = 0; i12 < i11; i12++) {
                                            if ((j7 & 255) < 128) {
                                                j4 = j7;
                                                defpackage.m71 m71Var = (defpackage.m71) objArr[(i10 << 3) + i12];
                                                defpackage.m71 m71Var2 = defpackage.j71.UsuH8pd5P;
                                                if (defpackage.x70.QoRHpC4k(m71Var, m71Var2)) {
                                                    java.lang.Object AARZUJiTa = nl0Var.AARZUJiTa(m71Var2);
                                                    if (AARZUJiTa == null) {
                                                        AARZUJiTa = null;
                                                    }
                                                    java.util.List list = (java.util.List) AARZUJiTa;
                                                    ez2rX8ReCYw(java.lang.String.valueOf(list != null ? (defpackage.l5) defpackage.td.gG5uWf3dqScO(list) : null), i8);
                                                }
                                            } else {
                                                j4 = j7;
                                            }
                                            j7 = j4 >> i9;
                                        }
                                        if (i11 != i9) {
                                            break;
                                        }
                                    }
                                    if (i10 == length2) {
                                        break;
                                    }
                                    i10++;
                                    j5 = j;
                                    i9 = 8;
                                }
                            } else {
                                j = j5;
                            }
                        } else {
                            iArr2 = iArr3;
                            j = j5;
                            java.lang.Object[] objArr2 = nl0Var.oh6vYeIP;
                            long[] jArr3 = nl0Var.IHQe1A4L2xu;
                            int length3 = jArr3.length - 2;
                            if (length3 >= 0) {
                                long[] jArr4 = jArr3;
                                int i13 = 0;
                                while (true) {
                                    long j8 = jArr4[i13];
                                    long[] jArr5 = jArr4;
                                    i = i6;
                                    if ((((~j8) << c) & j8 & j2) != j2) {
                                        int i14 = 8 - ((~(i13 - length3)) >>> 31);
                                        int i15 = 0;
                                        while (i15 < i14) {
                                            if ((j8 & 255) < 128) {
                                                j3 = j8;
                                                defpackage.m71 m71Var3 = (defpackage.m71) objArr2[(i13 << 3) + i15];
                                                defpackage.m71 m71Var4 = defpackage.j71.UsuH8pd5P;
                                                if (defpackage.x70.QoRHpC4k(m71Var3, m71Var4)) {
                                                    java.lang.Object AARZUJiTa2 = g71Var.IHQe1A4L2xu.adDC3e2L.AARZUJiTa(m71Var4);
                                                    if (AARZUJiTa2 == null) {
                                                        AARZUJiTa2 = null;
                                                    }
                                                    java.util.List list2 = (java.util.List) AARZUJiTa2;
                                                    defpackage.l5 l5Var = list2 != null ? (defpackage.l5) defpackage.td.gG5uWf3dqScO(list2) : null;
                                                    java.lang.Object AARZUJiTa3 = nl0Var.AARZUJiTa(m71Var4);
                                                    if (AARZUJiTa3 == null) {
                                                        AARZUJiTa3 = null;
                                                    }
                                                    java.util.List list3 = (java.util.List) AARZUJiTa3;
                                                    defpackage.l5 l5Var2 = list3 != null ? (defpackage.l5) defpackage.td.gG5uWf3dqScO(list3) : null;
                                                    if (!defpackage.x70.QoRHpC4k(l5Var, l5Var2)) {
                                                        ez2rX8ReCYw(java.lang.String.valueOf(l5Var2), i8);
                                                    }
                                                }
                                            } else {
                                                j3 = j8;
                                            }
                                            i15++;
                                            j8 = j3 >> 8;
                                        }
                                        if (i14 != 8) {
                                            break;
                                        }
                                    }
                                    if (i13 == length3) {
                                        break;
                                    }
                                    i13++;
                                    i6 = i;
                                    jArr4 = jArr5;
                                }
                                i2 = 8;
                            }
                        }
                        i = i6;
                        i2 = 8;
                    } else {
                        iArr2 = iArr3;
                        j = j5;
                        c = c2;
                        j2 = j6;
                        i = i6;
                        i2 = i4;
                    }
                    j5 = j >> i2;
                    i6 = i + 1;
                    i4 = i2;
                    c2 = c;
                    j6 = j2;
                    iArr3 = iArr2;
                    x60Var2 = x60Var;
                }
                iArr = iArr3;
                if (i5 != i4) {
                    return;
                }
            } else {
                iArr = iArr3;
            }
            if (i3 == length) {
                return;
            }
            i3++;
            x60Var2 = x60Var;
            iArr3 = iArr;
        }
    }

    public final boolean xiZrDbcSW0() {
        return this.AARZUJiTa != null;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(android.view.View view) {
    }
}
