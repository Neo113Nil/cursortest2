package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class m31 extends defpackage.gj {
    public final defpackage.gg1 BHfvd2J71qpO;
    public final java.util.ArrayList GE9mJIPrb8gP;
    public final defpackage.eb0 IJ0hOnjhPOri;
    public defpackage.cb0 JhCgjQRTAOCT;
    public final java.util.ArrayList Ns0WNyEWdPsk;
    public defpackage.zn0 P05cfTpS5W5L;
    public java.util.List QiMR8OkAhezm;
    public final defpackage.yn0 T1fB7bDYiVJQ;
    public final defpackage.jm VFeft99leXEK;
    public java.lang.Throwable WDYagTQQm9ns;
    public defpackage.zn0 WmetiUbpKU9I;
    public java.util.ArrayList XntWc4eZSQ8j;
    public boolean ZVVdXbWmyCSK;
    public final defpackage.q4 ZpBGe2uQfcn8;
    public final defpackage.ho0 e6mdH7fiFuta;
    public final defpackage.yn0 fNwYGHIYeJcR;
    public final java.lang.Object fWTAfUmVKrZq;
    public final defpackage.yn0 gUjdnLbkVAaA;
    public final defpackage.a7 giKS3J6vZuNy;
    public final defpackage.n80 h3m55N1URyyK;
    public final defpackage.a7 maCixPsq4ml2;
    public final defpackage.l21 oCu53ZX2v4Ju;
    public final java.util.ArrayList oh71FJcDz6S2;
    public defpackage.dd s0TASMVLSWD5;
    public final defpackage.gg1 w7APNrr0aGRc;
    public static final defpackage.gg1 dG7RjM6DqYVL = defpackage.nq1.fNwYGHIYeJcR(defpackage.jy0.e6mdH7fiFuta);
    public static final java.util.concurrent.atomic.AtomicReference OcTWLQzke1i2 = new java.util.concurrent.atomic.AtomicReference(java.lang.Boolean.FALSE);

    public m31(defpackage.jm jmVar) {
        defpackage.q4 q4Var = new defpackage.q4(new defpackage.g31(this, 0));
        this.ZpBGe2uQfcn8 = q4Var;
        this.giKS3J6vZuNy = new defpackage.a7(new defpackage.g31(this, 1));
        this.fWTAfUmVKrZq = new java.lang.Object();
        this.oh71FJcDz6S2 = new java.util.ArrayList();
        this.P05cfTpS5W5L = new defpackage.zn0();
        this.e6mdH7fiFuta = new defpackage.ho0(new defpackage.lj[16]);
        this.GE9mJIPrb8gP = new java.util.ArrayList();
        this.Ns0WNyEWdPsk = new java.util.ArrayList();
        this.fNwYGHIYeJcR = new defpackage.yn0();
        this.h3m55N1URyyK = new defpackage.n80(21);
        this.gUjdnLbkVAaA = new defpackage.yn0();
        this.T1fB7bDYiVJQ = new defpackage.yn0();
        this.BHfvd2J71qpO = defpackage.nq1.fNwYGHIYeJcR(null);
        this.w7APNrr0aGRc = defpackage.nq1.fNwYGHIYeJcR(defpackage.i31.QiMR8OkAhezm);
        this.maCixPsq4ml2 = new defpackage.a7(16);
        defpackage.eb0 eb0Var = new defpackage.eb0((defpackage.cb0) jmVar.XntWc4eZSQ8j(defpackage.jVUAPb5NnIYW.Jkfc0NcwyPL8));
        eb0Var.ZVVdXbWmyCSK(new defpackage.fNwYGHIYeJcR(23, this));
        this.IJ0hOnjhPOri = eb0Var;
        this.VFeft99leXEK = jmVar.fNwYGHIYeJcR(q4Var).fNwYGHIYeJcR(eb0Var);
        this.oCu53ZX2v4Ju = new defpackage.l21(5);
    }

    public static void IJ0hOnjhPOri(defpackage.do0 do0Var) {
        try {
            if (do0Var.IJ0hOnjhPOri() instanceof defpackage.ne1) {
                throw new java.lang.IllegalStateException("Unsupported concurrent change during composition. A state object was modified by composition as well as being modified outside composition.");
            }
        } finally {
            do0Var.fWTAfUmVKrZq();
        }
    }

    public static final void frSwwKIlbUhK(java.util.ArrayList arrayList, defpackage.m31 m31Var, defpackage.lj ljVar) {
        arrayList.clear();
        synchronized (m31Var.fWTAfUmVKrZq) {
            java.util.Iterator it = m31Var.Ns0WNyEWdPsk.iterator();
            if (it.hasNext()) {
                ((defpackage.sm0) it.next()).getClass();
                throw null;
            }
        }
    }

    @Override // defpackage.gj
    public final defpackage.fd BHfvd2J71qpO(defpackage.w2 w2Var) {
        defpackage.a7 a7Var = this.giKS3J6vZuNy;
        defpackage.x8 x8Var = (defpackage.x8) a7Var.fWTAfUmVKrZq;
        defpackage.ir0 ir0Var = new defpackage.ir0();
        ir0Var.ZpBGe2uQfcn8 = w2Var;
        return x8Var.JhCgjQRTAOCT(ir0Var, (defpackage.S0YpfprlOYIn) a7Var.JhCgjQRTAOCT);
    }

    public final void BXaznwstz2U0(java.lang.Throwable th, defpackage.lj ljVar) {
        if (!((java.lang.Boolean) OcTWLQzke1i2.get()).booleanValue() || (th instanceof defpackage.ni)) {
            synchronized (this.fWTAfUmVKrZq) {
                android.util.Log.e("ComposeInternal", "Error was captured in composition.", th);
                defpackage.h31 h31Var = (defpackage.h31) this.BHfvd2J71qpO.getValue();
                if (h31Var != null) {
                    throw h31Var.ZpBGe2uQfcn8;
                }
                defpackage.gg1 gg1Var = this.BHfvd2J71qpO;
                defpackage.h31 h31Var2 = new defpackage.h31(th);
                gg1Var.getClass();
                gg1Var.GE9mJIPrb8gP(null, h31Var2);
            }
            throw th;
        }
        synchronized (this.fWTAfUmVKrZq) {
            try {
                android.util.Log.e("ComposeInternal", "Error was captured in composition while live edit was enabled.", th);
                this.GE9mJIPrb8gP.clear();
                this.e6mdH7fiFuta.QiMR8OkAhezm();
                this.P05cfTpS5W5L = new defpackage.zn0();
                this.Ns0WNyEWdPsk.clear();
                this.fNwYGHIYeJcR.ZpBGe2uQfcn8();
                this.gUjdnLbkVAaA.ZpBGe2uQfcn8();
                defpackage.gg1 gg1Var2 = this.BHfvd2J71qpO;
                defpackage.h31 h31Var3 = new defpackage.h31(th);
                gg1Var2.getClass();
                gg1Var2.GE9mJIPrb8gP(null, h31Var3);
                if (ljVar != null) {
                    GcLuU6pT9wO9(ljVar);
                }
                if (oCu53ZX2v4Ju() != null) {
                    defpackage.ej.ZpBGe2uQfcn8("expected to go to inactive state due to composition error");
                }
            } catch (java.lang.Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // defpackage.gj
    public final defpackage.jm GE9mJIPrb8gP() {
        return this.VFeft99leXEK;
    }

    public final void GcLuU6pT9wO9(defpackage.lj ljVar) {
        java.util.ArrayList arrayList = this.XntWc4eZSQ8j;
        if (arrayList == null) {
            arrayList = new java.util.ArrayList();
            this.XntWc4eZSQ8j = arrayList;
        }
        if (!arrayList.contains(ljVar)) {
            arrayList.add(ljVar);
        }
        if (this.oh71FJcDz6S2.remove(ljVar)) {
            this.QiMR8OkAhezm = null;
        }
    }

    public final defpackage.lj IBvW5fLsPuHy(defpackage.lj ljVar, defpackage.zn0 zn0Var) {
        defpackage.do0 UmgHb6n58gfG;
        if (ljVar.dG7RjM6DqYVL.Mearx7yMn90V || ljVar.OcTWLQzke1i2 == 3) {
            return null;
        }
        defpackage.zn0 zn0Var2 = this.WmetiUbpKU9I;
        if (zn0Var2 == null || !zn0Var2.fWTAfUmVKrZq(ljVar)) {
            defpackage.fNwYGHIYeJcR fnwyghiyejcr = new defpackage.fNwYGHIYeJcR(22, ljVar);
            defpackage.fWTAfUmVKrZq fwtafumvkrzq = new defpackage.fWTAfUmVKrZq(28, ljVar, zn0Var);
            defpackage.me1 GE9mJIPrb8gP = defpackage.te1.GE9mJIPrb8gP();
            defpackage.do0 do0Var = GE9mJIPrb8gP instanceof defpackage.do0 ? (defpackage.do0) GE9mJIPrb8gP : null;
            if (do0Var == null || (UmgHb6n58gfG = do0Var.UmgHb6n58gfG(fnwyghiyejcr, fwtafumvkrzq)) == null) {
                defpackage.h7.P05cfTpS5W5L("Cannot create a mutable snapshot of an read-only snapshot");
            } else {
                try {
                    defpackage.me1 GE9mJIPrb8gP2 = UmgHb6n58gfG.GE9mJIPrb8gP();
                    if (zn0Var != null) {
                        try {
                            if (zn0Var.P05cfTpS5W5L()) {
                                defpackage.S0YpfprlOYIn s0YpfprlOYIn = new defpackage.S0YpfprlOYIn(18, zn0Var, ljVar);
                                defpackage.e30 e30Var = ljVar.dG7RjM6DqYVL;
                                if (e30Var.Mearx7yMn90V) {
                                    defpackage.ej.ZpBGe2uQfcn8("Preparing a composition while composing is not supported");
                                }
                                e30Var.Mearx7yMn90V = true;
                                try {
                                    s0YpfprlOYIn.ZpBGe2uQfcn8();
                                    e30Var.Mearx7yMn90V = false;
                                } catch (java.lang.Throwable th) {
                                    e30Var.Mearx7yMn90V = false;
                                    throw th;
                                }
                            }
                        } catch (java.lang.Throwable th2) {
                            defpackage.me1.WmetiUbpKU9I(GE9mJIPrb8gP2);
                            throw th2;
                        }
                    }
                    boolean IJ0hOnjhPOri = ljVar.IJ0hOnjhPOri();
                    defpackage.me1.WmetiUbpKU9I(GE9mJIPrb8gP2);
                    if (IJ0hOnjhPOri) {
                        return ljVar;
                    }
                } finally {
                    IJ0hOnjhPOri(UmgHb6n58gfG);
                }
            }
        }
        return null;
    }

    @Override // defpackage.gj
    public final boolean JhCgjQRTAOCT() {
        return ((java.lang.Boolean) OcTWLQzke1i2.get()).booleanValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x013a, code lost:
    
        r3 = r11.size();
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x013f, code lost:
    
        if (r4 >= r3) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0149, code lost:
    
        if (((defpackage.bw0) r11.get(r4)).oh71FJcDz6S2 == null) goto L115;
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
    
        r12 = (defpackage.bw0) r11.get(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0166, code lost:
    
        if (r12.oh71FJcDz6S2 != null) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0168, code lost:
    
        r12 = (defpackage.sm0) r12.WDYagTQQm9ns;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x016f, code lost:
    
        r9 = r9 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0172, code lost:
    
        r4 = r18.fWTAfUmVKrZq;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0174, code lost:
    
        monitor-enter(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0175, code lost:
    
        defpackage.nf.Jkfc0NcwyPL8(r18.Ns0WNyEWdPsk, r3);
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
    
        if (((defpackage.bw0) r12).oh71FJcDz6S2 == null) goto L122;
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
    public final java.util.List KrtOTfE6jiS2(java.util.List list, defpackage.zn0 zn0Var) {
        defpackage.do0 UmgHb6n58gfG;
        java.util.ArrayList arrayList;
        java.util.HashMap hashMap = new java.util.HashMap(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            java.lang.Object obj = list.get(i);
            ((defpackage.sm0) obj).getClass();
            java.lang.Object obj2 = hashMap.get(null);
            if (obj2 == null) {
                obj2 = new java.util.ArrayList();
                hashMap.put(null, obj2);
            }
            ((java.util.ArrayList) obj2).add(obj);
        }
        for (java.util.Map.Entry entry : hashMap.entrySet()) {
            defpackage.lj ljVar = (defpackage.lj) entry.getKey();
            java.util.List list2 = (java.util.List) entry.getValue();
            if (ljVar.dG7RjM6DqYVL.Mearx7yMn90V) {
                defpackage.ej.ZpBGe2uQfcn8("Check failed");
            }
            defpackage.fNwYGHIYeJcR fnwyghiyejcr = new defpackage.fNwYGHIYeJcR(22, ljVar);
            defpackage.fWTAfUmVKrZq fwtafumvkrzq = new defpackage.fWTAfUmVKrZq(28, ljVar, zn0Var);
            defpackage.me1 GE9mJIPrb8gP = defpackage.te1.GE9mJIPrb8gP();
            defpackage.do0 do0Var = GE9mJIPrb8gP instanceof defpackage.do0 ? (defpackage.do0) GE9mJIPrb8gP : null;
            if (do0Var == null || (UmgHb6n58gfG = do0Var.UmgHb6n58gfG(fnwyghiyejcr, fwtafumvkrzq)) == null) {
                defpackage.h7.P05cfTpS5W5L("Cannot create a mutable snapshot of an read-only snapshot");
                return null;
            }
            try {
                defpackage.me1 GE9mJIPrb8gP2 = UmgHb6n58gfG.GE9mJIPrb8gP();
                try {
                    synchronized (this.fWTAfUmVKrZq) {
                        try {
                            arrayList = new java.util.ArrayList(list2.size());
                            int size2 = list2.size();
                            for (int i2 = 0; i2 < size2; i2++) {
                                defpackage.sm0 sm0Var = (defpackage.sm0) list2.get(i2);
                                defpackage.yn0 yn0Var = this.fNwYGHIYeJcR;
                                sm0Var.getClass();
                                java.lang.Object ZpBGe2uQfcn8 = defpackage.cn0.ZpBGe2uQfcn8(yn0Var);
                                arrayList.add(new defpackage.bw0(sm0Var, ZpBGe2uQfcn8));
                            }
                            int size3 = arrayList.size();
                            int i3 = 0;
                            while (true) {
                                if (i3 >= size3) {
                                    break;
                                }
                                defpackage.bw0 bw0Var = (defpackage.bw0) arrayList.get(i3);
                                if (bw0Var.oh71FJcDz6S2 == null) {
                                    defpackage.n80 n80Var = this.h3m55N1URyyK;
                                    ((defpackage.sm0) bw0Var.WDYagTQQm9ns).getClass();
                                    if (((defpackage.yn0) n80Var.oh71FJcDz6S2).giKS3J6vZuNy(null)) {
                                        java.util.ArrayList arrayList2 = new java.util.ArrayList(arrayList.size());
                                        int size4 = arrayList.size();
                                        for (int i4 = 0; i4 < size4; i4++) {
                                            defpackage.bw0 bw0Var2 = (defpackage.bw0) arrayList.get(i4);
                                            if (bw0Var2.oh71FJcDz6S2 == null) {
                                                defpackage.n80 n80Var2 = this.h3m55N1URyyK;
                                                ((defpackage.sm0) bw0Var2.WDYagTQQm9ns).getClass();
                                                defpackage.yn0 yn0Var2 = (defpackage.yn0) n80Var2.oh71FJcDz6S2;
                                                if (yn0Var2.e6mdH7fiFuta()) {
                                                    ((defpackage.yn0) n80Var2.QiMR8OkAhezm).ZpBGe2uQfcn8();
                                                }
                                            }
                                            arrayList2.add(bw0Var2);
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
                        if (((defpackage.bw0) arrayList.get(i5)).oh71FJcDz6S2 != null) {
                            break;
                        }
                        i5++;
                    }
                    ljVar.s0TASMVLSWD5(arrayList);
                    defpackage.me1.WmetiUbpKU9I(GE9mJIPrb8gP2);
                } catch (java.lang.Throwable th) {
                    defpackage.me1.WmetiUbpKU9I(GE9mJIPrb8gP2);
                    throw th;
                }
            } finally {
                IJ0hOnjhPOri(UmgHb6n58gfG);
            }
        }
        return defpackage.hf.a6r05ZxsOP0A(hashMap.keySet());
    }

    public final void Mearx7yMn90V(defpackage.lj ljVar) {
        synchronized (this.fWTAfUmVKrZq) {
            java.util.ArrayList arrayList = this.Ns0WNyEWdPsk;
            if (arrayList.size() > 0) {
                ((defpackage.sm0) arrayList.get(0)).getClass();
                throw null;
            }
        }
    }

    @Override // defpackage.gj
    public final boolean Ns0WNyEWdPsk() {
        return false;
    }

    public final boolean OcTWLQzke1i2() {
        return this.e6mdH7fiFuta.QiMR8OkAhezm != 0 || dG7RjM6DqYVL() || blKFvluuDQOf() || this.fNwYGHIYeJcR.GE9mJIPrb8gP();
    }

    @Override // defpackage.gj
    public final defpackage.fj P05cfTpS5W5L() {
        return null;
    }

    @Override // defpackage.gj
    public final long QiMR8OkAhezm() {
        return 1000L;
    }

    public final boolean UmgHb6n58gfG() {
        boolean z;
        synchronized (this.fWTAfUmVKrZq) {
            if (!this.P05cfTpS5W5L.P05cfTpS5W5L() && this.e6mdH7fiFuta.QiMR8OkAhezm == 0 && !dG7RjM6DqYVL()) {
                z = blKFvluuDQOf();
            }
        }
        return z;
    }

    public final void VFeft99leXEK() {
        synchronized (this.fWTAfUmVKrZq) {
            if (((defpackage.i31) this.w7APNrr0aGRc.getValue()).compareTo(defpackage.i31.e6mdH7fiFuta) >= 0) {
                defpackage.gg1 gg1Var = this.w7APNrr0aGRc;
                defpackage.i31 i31Var = defpackage.i31.oh71FJcDz6S2;
                gg1Var.getClass();
                gg1Var.GE9mJIPrb8gP(null, i31Var);
            }
        }
        this.IJ0hOnjhPOri.JhCgjQRTAOCT(null);
    }

    @Override // defpackage.gj
    public final boolean WDYagTQQm9ns() {
        return false;
    }

    @Override // defpackage.gj
    public final void WmetiUbpKU9I(defpackage.f31 f31Var) {
        defpackage.a7 a7Var = this.maCixPsq4ml2;
        defpackage.zn0 zn0Var = (defpackage.zn0) a7Var.WDYagTQQm9ns();
        if (zn0Var == null) {
            defpackage.zn0 zn0Var2 = defpackage.n81.ZpBGe2uQfcn8;
            zn0Var = new defpackage.zn0();
            a7Var.BHfvd2J71qpO(zn0Var);
        }
        zn0Var.ZpBGe2uQfcn8(f31Var);
    }

    @Override // defpackage.gj
    public final void ZpBGe2uQfcn8(defpackage.lj ljVar, defpackage.c20 c20Var) {
        defpackage.i31 i31Var;
        boolean contains;
        defpackage.do0 UmgHb6n58gfG;
        boolean z = ljVar.dG7RjM6DqYVL.Mearx7yMn90V;
        synchronized (this.fWTAfUmVKrZq) {
            defpackage.i31 i31Var2 = (defpackage.i31) this.w7APNrr0aGRc.getValue();
            i31Var = defpackage.i31.oh71FJcDz6S2;
            contains = i31Var2.compareTo(i31Var) > 0 ? true ^ qjMheFZ0l9kA().contains(ljVar) : true;
        }
        try {
            defpackage.fNwYGHIYeJcR fnwyghiyejcr = new defpackage.fNwYGHIYeJcR(22, ljVar);
            defpackage.fWTAfUmVKrZq fwtafumvkrzq = new defpackage.fWTAfUmVKrZq(28, ljVar, null);
            defpackage.me1 GE9mJIPrb8gP = defpackage.te1.GE9mJIPrb8gP();
            defpackage.do0 do0Var = GE9mJIPrb8gP instanceof defpackage.do0 ? (defpackage.do0) GE9mJIPrb8gP : null;
            if (do0Var == null || (UmgHb6n58gfG = do0Var.UmgHb6n58gfG(fnwyghiyejcr, fwtafumvkrzq)) == null) {
                throw new java.lang.IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
            }
            try {
                defpackage.me1 GE9mJIPrb8gP2 = UmgHb6n58gfG.GE9mJIPrb8gP();
                try {
                    ljVar.GE9mJIPrb8gP(c20Var);
                    synchronized (this.fWTAfUmVKrZq) {
                        if (((defpackage.i31) this.w7APNrr0aGRc.getValue()).compareTo(i31Var) > 0 && !qjMheFZ0l9kA().contains(ljVar)) {
                            this.oh71FJcDz6S2.add(ljVar);
                            this.QiMR8OkAhezm = null;
                        }
                    }
                    if (!z) {
                        defpackage.te1.GE9mJIPrb8gP().h3m55N1URyyK();
                    }
                    try {
                        Mearx7yMn90V(ljVar);
                        try {
                            ljVar.JhCgjQRTAOCT();
                            ljVar.oh71FJcDz6S2();
                            if (z) {
                                return;
                            }
                            defpackage.te1.GE9mJIPrb8gP().h3m55N1URyyK();
                        } catch (java.lang.Throwable th) {
                            BXaznwstz2U0(th, null);
                        }
                    } catch (java.lang.Throwable th2) {
                        BXaznwstz2U0(th2, ljVar);
                    }
                } finally {
                    defpackage.me1.WmetiUbpKU9I(GE9mJIPrb8gP2);
                }
            } finally {
                IJ0hOnjhPOri(UmgHb6n58gfG);
            }
        } catch (java.lang.Throwable th3) {
            if (contains) {
                synchronized (this.fWTAfUmVKrZq) {
                }
            }
            BXaznwstz2U0(th3, ljVar);
        }
    }

    public final boolean blKFvluuDQOf() {
        return !this.ZVVdXbWmyCSK && (((defpackage.h8) ((defpackage.x8) this.giKS3J6vZuNy.fWTAfUmVKrZq).fWTAfUmVKrZq).get() & 134217727) > 0;
    }

    public final boolean dG7RjM6DqYVL() {
        return !this.ZVVdXbWmyCSK && (((defpackage.h8) ((defpackage.x8) this.ZpBGe2uQfcn8.QiMR8OkAhezm).fWTAfUmVKrZq).get() & 134217727) > 0;
    }

    @Override // defpackage.gj
    public final void fNwYGHIYeJcR(defpackage.lj ljVar) {
        defpackage.bd bdVar;
        synchronized (this.fWTAfUmVKrZq) {
            if (this.e6mdH7fiFuta.P05cfTpS5W5L(ljVar)) {
                bdVar = null;
            } else {
                this.e6mdH7fiFuta.giKS3J6vZuNy(ljVar);
                bdVar = oCu53ZX2v4Ju();
            }
        }
        if (bdVar != null) {
            ((defpackage.dd) bdVar).e6mdH7fiFuta(defpackage.gs1.ZpBGe2uQfcn8);
        }
    }

    @Override // defpackage.gj
    public final defpackage.zn0 gUjdnLbkVAaA(defpackage.lj ljVar, defpackage.td1 td1Var, defpackage.zn0 zn0Var) {
        defpackage.a7 a7Var = this.maCixPsq4ml2;
        try {
            hH0RRJrNssvh();
            ljVar.VFeft99leXEK(new defpackage.o81(zn0Var));
            defpackage.td1 td1Var2 = ljVar.ZVVdXbWmyCSK;
            ljVar.ZVVdXbWmyCSK = td1Var;
            try {
                defpackage.lj IBvW5fLsPuHy = IBvW5fLsPuHy(ljVar, null);
                if (IBvW5fLsPuHy != null) {
                    Mearx7yMn90V(ljVar);
                    IBvW5fLsPuHy.JhCgjQRTAOCT();
                    IBvW5fLsPuHy.oh71FJcDz6S2();
                }
                defpackage.zn0 zn0Var2 = (defpackage.zn0) a7Var.WDYagTQQm9ns();
                if (zn0Var2 == null) {
                    zn0Var2 = defpackage.n81.ZpBGe2uQfcn8;
                    zn0Var2.getClass();
                }
                return zn0Var2;
            } finally {
                ljVar.ZVVdXbWmyCSK = td1Var2;
            }
        } finally {
            a7Var.BHfvd2J71qpO(null);
        }
    }

    @Override // defpackage.gj
    public final defpackage.zn0 giKS3J6vZuNy(defpackage.lj ljVar, defpackage.td1 td1Var, defpackage.c20 c20Var) {
        defpackage.a7 a7Var = this.maCixPsq4ml2;
        try {
            defpackage.td1 td1Var2 = ljVar.ZVVdXbWmyCSK;
            ljVar.ZVVdXbWmyCSK = td1Var;
            try {
                ZpBGe2uQfcn8(ljVar, c20Var);
                defpackage.zn0 zn0Var = (defpackage.zn0) a7Var.WDYagTQQm9ns();
                if (zn0Var == null) {
                    zn0Var = defpackage.n81.ZpBGe2uQfcn8;
                    zn0Var.getClass();
                }
                return zn0Var;
            } finally {
                ljVar.ZVVdXbWmyCSK = td1Var2;
            }
        } finally {
            a7Var.BHfvd2J71qpO(null);
        }
    }

    @Override // defpackage.gj
    public final defpackage.rm0 h3m55N1URyyK(defpackage.sm0 sm0Var) {
        defpackage.rm0 rm0Var;
        synchronized (this.fWTAfUmVKrZq) {
            rm0Var = (defpackage.rm0) this.gUjdnLbkVAaA.Ns0WNyEWdPsk(sm0Var);
        }
        return rm0Var;
    }

    public final boolean hH0RRJrNssvh() {
        boolean OcTWLQzke1i22;
        synchronized (this.fWTAfUmVKrZq) {
            if (this.P05cfTpS5W5L.QiMR8OkAhezm()) {
                return OcTWLQzke1i2();
            }
            java.util.List qjMheFZ0l9kA = qjMheFZ0l9kA();
            defpackage.o81 o81Var = new defpackage.o81(this.P05cfTpS5W5L);
            this.P05cfTpS5W5L = new defpackage.zn0();
            try {
                int size = qjMheFZ0l9kA.size();
                for (int i = 0; i < size; i++) {
                    ((defpackage.lj) qjMheFZ0l9kA.get(i)).VFeft99leXEK(o81Var);
                    if (((defpackage.i31) this.w7APNrr0aGRc.getValue()).compareTo(defpackage.i31.oh71FJcDz6S2) <= 0) {
                        break;
                    }
                }
                synchronized (this.fWTAfUmVKrZq) {
                    if (oCu53ZX2v4Ju() != null) {
                        throw new java.lang.IllegalStateException("called outside of runRecomposeAndApplyChanges");
                    }
                    OcTWLQzke1i22 = OcTWLQzke1i2();
                }
                return OcTWLQzke1i22;
            } catch (java.lang.Throwable th) {
                synchronized (this.fWTAfUmVKrZq) {
                    defpackage.zn0 zn0Var = this.P05cfTpS5W5L;
                    zn0Var.getClass();
                    java.util.Iterator<E> it = o81Var.iterator();
                    while (it.hasNext()) {
                        zn0Var.Ns0WNyEWdPsk(it.next());
                    }
                    throw th;
                }
            }
        }
    }

    public final void jjTN4uUnoyEn() {
        defpackage.bd oCu53ZX2v4Ju;
        synchronized (this.fWTAfUmVKrZq) {
            oCu53ZX2v4Ju = oCu53ZX2v4Ju();
            if (((defpackage.i31) this.w7APNrr0aGRc.getValue()).compareTo(defpackage.i31.oh71FJcDz6S2) <= 0) {
                java.lang.Throwable th = this.WDYagTQQm9ns;
                java.util.concurrent.CancellationException cancellationException = new java.util.concurrent.CancellationException("Recomposer shutdown; frame clock awaiter will never resume");
                cancellationException.initCause(th);
                throw cancellationException;
            }
        }
        if (oCu53ZX2v4Ju != null) {
            ((defpackage.dd) oCu53ZX2v4Ju).e6mdH7fiFuta(defpackage.gs1.ZpBGe2uQfcn8);
        }
    }

    @Override // defpackage.gj
    public final void maCixPsq4ml2(defpackage.lj ljVar) {
        synchronized (this.fWTAfUmVKrZq) {
            if (this.oh71FJcDz6S2.remove(ljVar)) {
                this.QiMR8OkAhezm = null;
            }
            this.e6mdH7fiFuta.GE9mJIPrb8gP(ljVar);
            this.GE9mJIPrb8gP.remove(ljVar);
        }
    }

    public final defpackage.bd oCu53ZX2v4Ju() {
        defpackage.gg1 gg1Var = this.w7APNrr0aGRc;
        int compareTo = ((defpackage.i31) gg1Var.getValue()).compareTo(defpackage.i31.oh71FJcDz6S2);
        defpackage.gg1 gg1Var2 = this.BHfvd2J71qpO;
        java.util.ArrayList arrayList = this.Ns0WNyEWdPsk;
        java.util.ArrayList arrayList2 = this.GE9mJIPrb8gP;
        defpackage.ho0 ho0Var = this.e6mdH7fiFuta;
        if (compareTo > 0) {
            java.lang.Object value = gg1Var2.getValue();
            defpackage.i31 i31Var = defpackage.i31.GE9mJIPrb8gP;
            defpackage.i31 i31Var2 = defpackage.i31.QiMR8OkAhezm;
            if (value == null) {
                if (this.JhCgjQRTAOCT == null) {
                    this.P05cfTpS5W5L = new defpackage.zn0();
                    ho0Var.QiMR8OkAhezm();
                    if (dG7RjM6DqYVL() || blKFvluuDQOf()) {
                        i31Var2 = defpackage.i31.P05cfTpS5W5L;
                    }
                } else {
                    i31Var2 = (ho0Var.QiMR8OkAhezm != 0 || this.P05cfTpS5W5L.P05cfTpS5W5L() || !arrayList2.isEmpty() || !arrayList.isEmpty() || dG7RjM6DqYVL() || blKFvluuDQOf() || this.fNwYGHIYeJcR.GE9mJIPrb8gP()) ? i31Var : defpackage.i31.e6mdH7fiFuta;
                }
            }
            gg1Var.GE9mJIPrb8gP(null, i31Var2);
            if (i31Var2 != i31Var) {
                return null;
            }
            defpackage.dd ddVar = this.s0TASMVLSWD5;
            this.s0TASMVLSWD5 = null;
            return ddVar;
        }
        java.util.List qjMheFZ0l9kA = qjMheFZ0l9kA();
        int size = qjMheFZ0l9kA.size();
        for (int i = 0; i < size; i++) {
        }
        this.oh71FJcDz6S2.clear();
        this.QiMR8OkAhezm = defpackage.av.WDYagTQQm9ns;
        this.P05cfTpS5W5L = new defpackage.zn0();
        ho0Var.QiMR8OkAhezm();
        arrayList2.clear();
        arrayList.clear();
        this.XntWc4eZSQ8j = null;
        defpackage.dd ddVar2 = this.s0TASMVLSWD5;
        if (ddVar2 != null) {
            ddVar2.T1fB7bDYiVJQ(null);
        }
        this.s0TASMVLSWD5 = null;
        gg1Var2.e6mdH7fiFuta(null);
        return null;
    }

    @Override // defpackage.gj
    public final boolean oh71FJcDz6S2() {
        return false;
    }

    public final java.util.List qjMheFZ0l9kA() {
        java.util.List list = this.QiMR8OkAhezm;
        if (list != null) {
            return list;
        }
        java.util.ArrayList arrayList = this.oh71FJcDz6S2;
        java.util.List arrayList2 = arrayList.isEmpty() ? defpackage.av.WDYagTQQm9ns : new java.util.ArrayList(arrayList);
        this.QiMR8OkAhezm = arrayList2;
        return arrayList2;
    }

    @Override // defpackage.gj
    public final void s0TASMVLSWD5(defpackage.lj ljVar) {
        synchronized (this.fWTAfUmVKrZq) {
            try {
                defpackage.zn0 zn0Var = this.WmetiUbpKU9I;
                if (zn0Var == null) {
                    defpackage.zn0 zn0Var2 = defpackage.n81.ZpBGe2uQfcn8;
                    zn0Var = new defpackage.zn0();
                    this.WmetiUbpKU9I = zn0Var;
                }
                zn0Var.ZpBGe2uQfcn8(ljVar);
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.gj
    public final void T1fB7bDYiVJQ(java.util.Set set) {
    }
}
