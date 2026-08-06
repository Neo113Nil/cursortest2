package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class p0 implements defpackage.go, android.view.View.OnAttachStateChangeListener {
    public defpackage.n80 QiMR8OkAhezm;
    public final defpackage.gn0 T1fB7bDYiVJQ;
    public final defpackage.u WDYagTQQm9ns;
    public boolean WmetiUbpKU9I;
    public defpackage.kb1 XntWc4eZSQ8j;
    public long gUjdnLbkVAaA;
    public defpackage.gn0 h3m55N1URyyK;
    public final defpackage.j oh71FJcDz6S2;
    public final defpackage.gUjdnLbkVAaA s0TASMVLSWD5;
    public final java.util.ArrayList P05cfTpS5W5L = new java.util.ArrayList();
    public final long e6mdH7fiFuta = 100;
    public defpackage.l0 GE9mJIPrb8gP = defpackage.l0.WDYagTQQm9ns;
    public boolean Ns0WNyEWdPsk = true;
    public final defpackage.dc fNwYGHIYeJcR = defpackage.ok0.giKS3J6vZuNy(1, 6, null);

    public p0(defpackage.u uVar, defpackage.j jVar) {
        this.WDYagTQQm9ns = uVar;
        this.oh71FJcDz6S2 = jVar;
        new android.os.Handler(android.os.Looper.getMainLooper());
        defpackage.gn0 gn0Var = defpackage.k90.ZpBGe2uQfcn8;
        gn0Var.getClass();
        this.h3m55N1URyyK = gn0Var;
        this.T1fB7bDYiVJQ = new defpackage.gn0();
        this.XntWc4eZSQ8j = new defpackage.kb1(uVar.getSemanticsOwner().ZpBGe2uQfcn8(), gn0Var);
        this.s0TASMVLSWD5 = new defpackage.gUjdnLbkVAaA(2, this);
    }

    public final void GE9mJIPrb8gP(defpackage.jb1 jb1Var, defpackage.kb1 kb1Var) {
        int i = 0;
        defpackage.o0 o0Var = new defpackage.o0(i, kb1Var, this);
        jb1Var.getClass();
        java.util.List GE9mJIPrb8gP = defpackage.jb1.GE9mJIPrb8gP(4, jb1Var);
        int size = GE9mJIPrb8gP.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            java.lang.Object obj = GE9mJIPrb8gP.get(i3);
            if (WDYagTQQm9ns().ZpBGe2uQfcn8(((defpackage.jb1) obj).oh71FJcDz6S2)) {
                o0Var.QiMR8OkAhezm(java.lang.Integer.valueOf(i2), obj);
                i2++;
            }
        }
        java.util.List GE9mJIPrb8gP2 = defpackage.jb1.GE9mJIPrb8gP(4, jb1Var);
        int size2 = GE9mJIPrb8gP2.size();
        while (i < size2) {
            defpackage.jb1 jb1Var2 = (defpackage.jb1) GE9mJIPrb8gP2.get(i);
            defpackage.j90 WDYagTQQm9ns = WDYagTQQm9ns();
            int i4 = jb1Var2.oh71FJcDz6S2;
            if (WDYagTQQm9ns.ZpBGe2uQfcn8(i4)) {
                defpackage.gn0 gn0Var = this.T1fB7bDYiVJQ;
                if (gn0Var.ZpBGe2uQfcn8(i4)) {
                    java.lang.Object giKS3J6vZuNy = gn0Var.giKS3J6vZuNy(i4);
                    if (giKS3J6vZuNy == null) {
                        throw defpackage.pVQOaWB9QMo4.oh71FJcDz6S2("node not present in pruned tree before this change");
                    }
                    GE9mJIPrb8gP(jb1Var2, (defpackage.kb1) giKS3J6vZuNy);
                } else {
                    continue;
                }
            }
            i++;
        }
    }

    @Override // defpackage.go
    public final void JhCgjQRTAOCT(defpackage.wg0 wg0Var) {
        this.QiMR8OkAhezm = (defpackage.n80) this.oh71FJcDz6S2.ZpBGe2uQfcn8();
        fNwYGHIYeJcR(-1, this.WDYagTQQm9ns.getSemanticsOwner().ZpBGe2uQfcn8());
        P05cfTpS5W5L();
    }

    public final void Ns0WNyEWdPsk(java.lang.String str, int i) {
        defpackage.n80 n80Var;
        int i2 = android.os.Build.VERSION.SDK_INT;
        if (i2 >= 29 && (n80Var = this.QiMR8OkAhezm) != null) {
            android.view.autofill.AutofillId VFeft99leXEK = n80Var.VFeft99leXEK(i);
            if (VFeft99leXEK == null) {
                throw defpackage.pVQOaWB9QMo4.oh71FJcDz6S2("Invalid content capture ID");
            }
            if (i2 >= 29) {
                defpackage.rk.oh71FJcDz6S2(defpackage.sGDr7tcBtHOt.WDYagTQQm9ns(n80Var.QiMR8OkAhezm), VFeft99leXEK, str);
            }
        }
    }

    public final void P05cfTpS5W5L() {
        defpackage.n80 n80Var = this.QiMR8OkAhezm;
        if (n80Var == null) {
            return;
        }
        java.lang.Object obj = n80Var.QiMR8OkAhezm;
        if (android.os.Build.VERSION.SDK_INT < 29) {
            return;
        }
        java.util.ArrayList arrayList = this.P05cfTpS5W5L;
        if (arrayList.isEmpty()) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            defpackage.pk pkVar = (defpackage.pk) arrayList.get(i);
            int ordinal = pkVar.fWTAfUmVKrZq.ordinal();
            if (ordinal == 0) {
                defpackage.ci1 ci1Var = pkVar.JhCgjQRTAOCT;
                if (ci1Var != null) {
                    android.view.ViewStructure viewStructure = (android.view.ViewStructure) ci1Var.oh71FJcDz6S2;
                    if (android.os.Build.VERSION.SDK_INT >= 29) {
                        defpackage.rk.JhCgjQRTAOCT(defpackage.sGDr7tcBtHOt.WDYagTQQm9ns(obj), viewStructure);
                    }
                }
            } else {
                if (ordinal != 1) {
                    defpackage.h7.T1fB7bDYiVJQ();
                    return;
                }
                android.view.autofill.AutofillId VFeft99leXEK = n80Var.VFeft99leXEK(pkVar.ZpBGe2uQfcn8);
                if (VFeft99leXEK != null && android.os.Build.VERSION.SDK_INT >= 29) {
                    defpackage.rk.WDYagTQQm9ns(defpackage.sGDr7tcBtHOt.WDYagTQQm9ns(obj), VFeft99leXEK);
                }
            }
        }
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            android.view.contentcapture.ContentCaptureSession WDYagTQQm9ns = defpackage.sGDr7tcBtHOt.WDYagTQQm9ns(obj);
            defpackage.LCK4GGEwbWAr WmetiUbpKU9I = defpackage.b80.WmetiUbpKU9I((android.view.View) n80Var.oh71FJcDz6S2);
            java.util.Objects.requireNonNull(WmetiUbpKU9I);
            defpackage.rk.QiMR8OkAhezm(WDYagTQQm9ns, defpackage.PS16moFv2oLu.WDYagTQQm9ns(WmetiUbpKU9I.ZpBGe2uQfcn8), new long[]{Long.MIN_VALUE});
        }
        arrayList.clear();
    }

    public final defpackage.j90 WDYagTQQm9ns() {
        if (this.Ns0WNyEWdPsk) {
            this.Ns0WNyEWdPsk = false;
            this.h3m55N1URyyK = defpackage.h0.blKFvluuDQOf(this.WDYagTQQm9ns.getSemanticsOwner(), defpackage.n.GE9mJIPrb8gP);
            this.gUjdnLbkVAaA = java.lang.System.currentTimeMillis();
        }
        return this.h3m55N1URyyK;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x004e, code lost:
    
        if (r8 != r4) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0082, code lost:
    
        if (defpackage.nn.GE9mJIPrb8gP(r7.e6mdH7fiFuta, r0) == r4) goto L31;
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
    public final java.lang.Object ZpBGe2uQfcn8(defpackage.ll llVar) {
        defpackage.n0 n0Var;
        int i;
        defpackage.ac acVar;
        if (llVar instanceof defpackage.n0) {
            n0Var = (defpackage.n0) llVar;
            int i2 = n0Var.Ns0WNyEWdPsk;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                n0Var.Ns0WNyEWdPsk = i2 - Integer.MIN_VALUE;
                java.lang.Object obj = n0Var.e6mdH7fiFuta;
                i = n0Var.Ns0WNyEWdPsk;
                defpackage.tm tmVar = defpackage.tm.WDYagTQQm9ns;
                if (i != 0) {
                    defpackage.b80.KrtOTfE6jiS2(obj);
                    defpackage.dc dcVar = this.fNwYGHIYeJcR;
                    dcVar.getClass();
                    acVar = new defpackage.ac(dcVar);
                } else if (i == 1) {
                    acVar = n0Var.P05cfTpS5W5L;
                    defpackage.b80.KrtOTfE6jiS2(obj);
                    if (!((java.lang.Boolean) obj).booleanValue()) {
                        return defpackage.gs1.ZpBGe2uQfcn8;
                    }
                    acVar.fWTAfUmVKrZq();
                    if (oh71FJcDz6S2()) {
                        P05cfTpS5W5L();
                    }
                    android.os.Handler handler = this.WDYagTQQm9ns.getHandler();
                    if (!this.WmetiUbpKU9I && handler != null) {
                        this.WmetiUbpKU9I = true;
                        handler.post(this.s0TASMVLSWD5);
                    }
                    n0Var.P05cfTpS5W5L = acVar;
                    n0Var.Ns0WNyEWdPsk = 2;
                } else {
                    if (i != 2) {
                        defpackage.h7.P05cfTpS5W5L("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    acVar = n0Var.P05cfTpS5W5L;
                    defpackage.b80.KrtOTfE6jiS2(obj);
                }
                n0Var.P05cfTpS5W5L = acVar;
                n0Var.Ns0WNyEWdPsk = 1;
                obj = acVar.giKS3J6vZuNy(n0Var);
            }
        }
        n0Var = new defpackage.n0(this, llVar);
        java.lang.Object obj2 = n0Var.e6mdH7fiFuta;
        i = n0Var.Ns0WNyEWdPsk;
        defpackage.tm tmVar2 = defpackage.tm.WDYagTQQm9ns;
        if (i != 0) {
        }
        n0Var.P05cfTpS5W5L = acVar;
        n0Var.Ns0WNyEWdPsk = 1;
        obj2 = acVar.giKS3J6vZuNy(n0Var);
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
    public final void fNwYGHIYeJcR(int r19, defpackage.jb1 r20) {
        /*
            Method dump skipped, instructions count: 491
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p0.fNwYGHIYeJcR(int, jb1):void");
    }

    public final void fWTAfUmVKrZq(defpackage.j90 j90Var) {
        int[] iArr;
        int[] iArr2;
        long j;
        char c;
        long j2;
        int i;
        int i2;
        long j3;
        long j4;
        defpackage.j90 j90Var2 = j90Var;
        int[] iArr3 = j90Var2.giKS3J6vZuNy;
        long[] jArr = j90Var2.ZpBGe2uQfcn8;
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
                        defpackage.kb1 kb1Var = (defpackage.kb1) this.T1fB7bDYiVJQ.giKS3J6vZuNy(i7);
                        defpackage.lb1 lb1Var = (defpackage.lb1) j90Var2.giKS3J6vZuNy(i7);
                        defpackage.jb1 jb1Var = lb1Var != null ? lb1Var.ZpBGe2uQfcn8 : null;
                        if (jb1Var == null) {
                            throw defpackage.pVQOaWB9QMo4.oh71FJcDz6S2("no value for specified key");
                        }
                        j2 = j6;
                        int i8 = jb1Var.oh71FJcDz6S2;
                        defpackage.yn0 yn0Var = jb1Var.JhCgjQRTAOCT.WDYagTQQm9ns;
                        if (kb1Var == null) {
                            java.lang.Object[] objArr = yn0Var.giKS3J6vZuNy;
                            long[] jArr2 = yn0Var.ZpBGe2uQfcn8;
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
                                                defpackage.qb1 qb1Var = (defpackage.qb1) objArr[(i10 << 3) + i12];
                                                defpackage.qb1 qb1Var2 = defpackage.nb1.UmgHb6n58gfG;
                                                if (defpackage.ma0.QiMR8OkAhezm(qb1Var, qb1Var2)) {
                                                    java.lang.Object QiMR8OkAhezm = yn0Var.QiMR8OkAhezm(qb1Var2);
                                                    if (QiMR8OkAhezm == null) {
                                                        QiMR8OkAhezm = null;
                                                    }
                                                    java.util.List list = (java.util.List) QiMR8OkAhezm;
                                                    Ns0WNyEWdPsk(java.lang.String.valueOf(list != null ? (defpackage.l6) defpackage.hf.FhgBoOud6zyW(list) : null), i8);
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
                            java.lang.Object[] objArr2 = yn0Var.giKS3J6vZuNy;
                            long[] jArr3 = yn0Var.ZpBGe2uQfcn8;
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
                                                defpackage.qb1 qb1Var3 = (defpackage.qb1) objArr2[(i13 << 3) + i15];
                                                defpackage.qb1 qb1Var4 = defpackage.nb1.UmgHb6n58gfG;
                                                if (defpackage.ma0.QiMR8OkAhezm(qb1Var3, qb1Var4)) {
                                                    java.lang.Object QiMR8OkAhezm2 = kb1Var.ZpBGe2uQfcn8.WDYagTQQm9ns.QiMR8OkAhezm(qb1Var4);
                                                    if (QiMR8OkAhezm2 == null) {
                                                        QiMR8OkAhezm2 = null;
                                                    }
                                                    java.util.List list2 = (java.util.List) QiMR8OkAhezm2;
                                                    defpackage.l6 l6Var = list2 != null ? (defpackage.l6) defpackage.hf.FhgBoOud6zyW(list2) : null;
                                                    java.lang.Object QiMR8OkAhezm3 = yn0Var.QiMR8OkAhezm(qb1Var4);
                                                    if (QiMR8OkAhezm3 == null) {
                                                        QiMR8OkAhezm3 = null;
                                                    }
                                                    java.util.List list3 = (java.util.List) QiMR8OkAhezm3;
                                                    defpackage.l6 l6Var2 = list3 != null ? (defpackage.l6) defpackage.hf.FhgBoOud6zyW(list3) : null;
                                                    if (!defpackage.ma0.QiMR8OkAhezm(l6Var, l6Var2)) {
                                                        Ns0WNyEWdPsk(java.lang.String.valueOf(l6Var2), i8);
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
                    j90Var2 = j90Var;
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
            j90Var2 = j90Var;
            iArr3 = iArr;
        }
    }

    public final void gUjdnLbkVAaA() {
        defpackage.gn0 gn0Var = this.T1fB7bDYiVJQ;
        gn0Var.fWTAfUmVKrZq();
        defpackage.j90 WDYagTQQm9ns = WDYagTQQm9ns();
        int[] iArr = WDYagTQQm9ns.giKS3J6vZuNy;
        java.lang.Object[] objArr = WDYagTQQm9ns.fWTAfUmVKrZq;
        long[] jArr = WDYagTQQm9ns.ZpBGe2uQfcn8;
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
                            gn0Var.P05cfTpS5W5L(iArr[i4], new defpackage.kb1(((defpackage.lb1) objArr[i4]).ZpBGe2uQfcn8, WDYagTQQm9ns()));
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
        this.XntWc4eZSQ8j = new defpackage.kb1(this.WDYagTQQm9ns.getSemanticsOwner().ZpBGe2uQfcn8(), WDYagTQQm9ns());
    }

    @Override // defpackage.go
    public final void giKS3J6vZuNy(defpackage.wg0 wg0Var) {
        h3m55N1URyyK(this.WDYagTQQm9ns.getSemanticsOwner().ZpBGe2uQfcn8());
        P05cfTpS5W5L();
        this.QiMR8OkAhezm = null;
    }

    public final void h3m55N1URyyK(defpackage.jb1 jb1Var) {
        if (oh71FJcDz6S2()) {
            this.P05cfTpS5W5L.add(new defpackage.pk(jb1Var.oh71FJcDz6S2, this.gUjdnLbkVAaA, defpackage.qk.oh71FJcDz6S2, null));
            java.util.List GE9mJIPrb8gP = defpackage.jb1.GE9mJIPrb8gP(4, jb1Var);
            int size = GE9mJIPrb8gP.size();
            for (int i = 0; i < size; i++) {
                h3m55N1URyyK((defpackage.jb1) GE9mJIPrb8gP.get(i));
            }
        }
    }

    public final boolean oh71FJcDz6S2() {
        return this.QiMR8OkAhezm != null;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(android.view.View view) {
        android.os.Handler handler = this.WDYagTQQm9ns.getHandler();
        handler.getClass();
        handler.removeCallbacks(this.s0TASMVLSWD5);
        this.QiMR8OkAhezm = null;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(android.view.View view) {
    }
}
