package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class m3 extends defpackage.ul0 implements defpackage.mj, defpackage.bt, defpackage.pc0 {
    public final defpackage.in0 BHfvd2J71qpO;
    public final defpackage.ap IJ0hOnjhPOri;
    public boolean OcTWLQzke1i2;
    public defpackage.y51 UmgHb6n58gfG;
    public defpackage.ke VFeft99leXEK;
    public final boolean ZVVdXbWmyCSK;
    public final defpackage.bp maCixPsq4ml2;
    public float oCu53ZX2v4Ju;
    public defpackage.z51 qjMheFZ0l9kA;
    public final float w7APNrr0aGRc;
    public long dG7RjM6DqYVL = 0;
    public final defpackage.sn0 blKFvluuDQOf = new defpackage.sn0();

    public m3(defpackage.in0 in0Var, boolean z, float f, defpackage.bp bpVar, defpackage.ap apVar) {
        this.BHfvd2J71qpO = in0Var;
        this.ZVVdXbWmyCSK = z;
        this.w7APNrr0aGRc = f;
        this.maCixPsq4ml2 = bpVar;
        this.IJ0hOnjhPOri = apVar;
    }

    @Override // defpackage.ul0
    public final boolean RIHPIrzkudeW() {
        return false;
    }

    public final void YZh1E3mnTFwf(defpackage.w11 w11Var) {
        defpackage.z51 z51Var;
        if (!(w11Var instanceof defpackage.u11)) {
            if (w11Var instanceof defpackage.v11) {
                defpackage.z51 z51Var2 = this.qjMheFZ0l9kA;
                if (z51Var2 != null) {
                    z51Var2.JhCgjQRTAOCT();
                    return;
                }
                return;
            }
            if (!(w11Var instanceof defpackage.t11) || (z51Var = this.qjMheFZ0l9kA) == null) {
                return;
            }
            z51Var.JhCgjQRTAOCT();
            return;
        }
        defpackage.u11 u11Var = (defpackage.u11) w11Var;
        long j = this.dG7RjM6DqYVL;
        float f = this.oCu53ZX2v4Ju;
        defpackage.y51 y51Var = this.UmgHb6n58gfG;
        int i = 0;
        if (y51Var == null) {
            java.lang.Object obj = (android.view.View) defpackage.nq1.blKFvluuDQOf(this, defpackage.j0.oh71FJcDz6S2);
            while (!(obj instanceof android.view.ViewGroup)) {
                java.lang.Object parent = ((android.view.View) obj).getParent();
                if (!(parent instanceof android.view.View)) {
                    defpackage.p81.JhCgjQRTAOCT("Couldn't find a valid parent for ", obj, ". Are you overriding LocalView and providing a View that is not attached to the view hierarchy?");
                    return;
                }
                obj = parent;
            }
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) obj;
            int childCount = viewGroup.getChildCount();
            int i2 = 0;
            while (true) {
                if (i2 >= childCount) {
                    defpackage.y51 y51Var2 = new defpackage.y51(viewGroup.getContext());
                    viewGroup.addView(y51Var2);
                    y51Var = y51Var2;
                    break;
                } else {
                    android.view.View childAt = viewGroup.getChildAt(i2);
                    if (childAt instanceof defpackage.y51) {
                        y51Var = (defpackage.y51) childAt;
                        break;
                    }
                    i2++;
                }
            }
            this.UmgHb6n58gfG = y51Var;
        }
        java.util.ArrayList arrayList = y51Var.oh71FJcDz6S2;
        defpackage.n80 n80Var = y51Var.P05cfTpS5W5L;
        java.util.LinkedHashMap linkedHashMap = (java.util.LinkedHashMap) n80Var.oh71FJcDz6S2;
        java.util.LinkedHashMap linkedHashMap2 = (java.util.LinkedHashMap) n80Var.oh71FJcDz6S2;
        java.util.LinkedHashMap linkedHashMap3 = (java.util.LinkedHashMap) n80Var.QiMR8OkAhezm;
        defpackage.z51 z51Var3 = (defpackage.z51) linkedHashMap.get(this);
        if (z51Var3 == null) {
            java.util.ArrayList arrayList2 = y51Var.QiMR8OkAhezm;
            arrayList2.getClass();
            z51Var3 = (defpackage.z51) (arrayList2.isEmpty() ? null : arrayList2.remove(0));
            if (z51Var3 == null) {
                if (y51Var.e6mdH7fiFuta > defpackage.ma0.BHfvd2J71qpO(arrayList)) {
                    z51Var3 = new defpackage.z51(y51Var.getContext());
                    y51Var.addView(z51Var3);
                    arrayList.add(z51Var3);
                } else {
                    z51Var3 = (defpackage.z51) arrayList.get(y51Var.e6mdH7fiFuta);
                    defpackage.m3 m3Var = (defpackage.m3) linkedHashMap3.get(z51Var3);
                    if (m3Var != null) {
                        m3Var.qjMheFZ0l9kA = null;
                        defpackage.nq1.KrtOTfE6jiS2(m3Var);
                        defpackage.z51 z51Var4 = (defpackage.z51) linkedHashMap2.get(m3Var);
                        if (z51Var4 != null) {
                        }
                        linkedHashMap2.remove(m3Var);
                        z51Var3.fWTAfUmVKrZq();
                    }
                }
                int i3 = y51Var.e6mdH7fiFuta;
                if (i3 < y51Var.WDYagTQQm9ns - 1) {
                    y51Var.e6mdH7fiFuta = i3 + 1;
                } else {
                    y51Var.e6mdH7fiFuta = 0;
                }
            }
            linkedHashMap2.put(this, z51Var3);
            linkedHashMap3.put(z51Var3, this);
        }
        int CZa7MwI9IzLd = defpackage.ok0.CZa7MwI9IzLd(f);
        long ZpBGe2uQfcn8 = this.maCixPsq4ml2.ZpBGe2uQfcn8();
        this.IJ0hOnjhPOri.ZpBGe2uQfcn8();
        defpackage.z51 z51Var5 = z51Var3;
        z51Var5.giKS3J6vZuNy(u11Var, this.ZVVdXbWmyCSK, j, CZa7MwI9IzLd, ZpBGe2uQfcn8, new defpackage.l3(i, this));
        this.qjMheFZ0l9kA = z51Var5;
        defpackage.nq1.KrtOTfE6jiS2(this);
    }

    @Override // defpackage.ul0
    public final void ZEXjjCYihNTt() {
        defpackage.ok0.zJPqDeoF0Os1(XuMcJunjB8iA(), null, new defpackage.JhCgjQRTAOCT(this, null, 22), 3);
    }

    @Override // defpackage.ul0
    public final void awuGf4qH8HFd() {
        defpackage.y51 y51Var = this.UmgHb6n58gfG;
        if (y51Var != null) {
            this.qjMheFZ0l9kA = null;
            defpackage.nq1.KrtOTfE6jiS2(this);
            defpackage.n80 n80Var = y51Var.P05cfTpS5W5L;
            defpackage.z51 z51Var = (defpackage.z51) ((java.util.LinkedHashMap) n80Var.oh71FJcDz6S2).get(this);
            if (z51Var != null) {
                z51Var.fWTAfUmVKrZq();
                java.util.LinkedHashMap linkedHashMap = (java.util.LinkedHashMap) n80Var.oh71FJcDz6S2;
                defpackage.z51 z51Var2 = (defpackage.z51) linkedHashMap.get(this);
                if (z51Var2 != null) {
                }
                linkedHashMap.remove(this);
                y51Var.QiMR8OkAhezm.add(z51Var);
            }
        }
    }

    @Override // defpackage.pc0, defpackage.yk0
    public final void fWTAfUmVKrZq(long j) {
        float dG7RjM6DqYVL;
        this.OcTWLQzke1i2 = true;
        defpackage.hp hpVar = defpackage.la0.UmgHb6n58gfG(this).blKFvluuDQOf;
        this.dG7RjM6DqYVL = defpackage.w60.EPEWHACkMcF1(j);
        float f = this.w7APNrr0aGRc;
        if (java.lang.Float.isNaN(f)) {
            long j2 = this.dG7RjM6DqYVL;
            float intBitsToFloat = java.lang.Float.intBitsToFloat((int) (j2 >> 32));
            float intBitsToFloat2 = java.lang.Float.intBitsToFloat((int) (j2 & 4294967295L));
            dG7RjM6DqYVL = defpackage.ws0.fWTAfUmVKrZq((java.lang.Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (java.lang.Float.floatToRawIntBits(intBitsToFloat) << 32)) / 2.0f;
            if (this.ZVVdXbWmyCSK) {
                dG7RjM6DqYVL += hpVar.dG7RjM6DqYVL(10.0f);
            }
        } else {
            dG7RjM6DqYVL = hpVar.dG7RjM6DqYVL(f);
        }
        this.oCu53ZX2v4Ju = dG7RjM6DqYVL;
        defpackage.sn0 sn0Var = this.blKFvluuDQOf;
        java.lang.Object[] objArr = sn0Var.ZpBGe2uQfcn8;
        int i = sn0Var.giKS3J6vZuNy;
        for (int i2 = 0; i2 < i; i2++) {
            YZh1E3mnTFwf((defpackage.w11) objArr[i2]);
        }
        sn0Var.JhCgjQRTAOCT();
    }

    @Override // defpackage.bt
    public final void w6IV1lieBIux(defpackage.ld0 ld0Var) {
        defpackage.ld ldVar = ld0Var.WDYagTQQm9ns;
        ld0Var.ZpBGe2uQfcn8();
        defpackage.ke keVar = this.VFeft99leXEK;
        if (keVar != null) {
            float f = this.oCu53ZX2v4Ju;
            long ZpBGe2uQfcn8 = this.maCixPsq4ml2.ZpBGe2uQfcn8();
            float floatValue = ((java.lang.Number) ((defpackage.z4) keVar.fWTAfUmVKrZq).JhCgjQRTAOCT()).floatValue();
            if (floatValue > 0.0f) {
                long giKS3J6vZuNy = defpackage.pf.giKS3J6vZuNy(ZpBGe2uQfcn8, floatValue);
                if (keVar.ZpBGe2uQfcn8) {
                    float intBitsToFloat = java.lang.Float.intBitsToFloat((int) (ldVar.JhCgjQRTAOCT() >> 32));
                    float intBitsToFloat2 = java.lang.Float.intBitsToFloat((int) (ldVar.JhCgjQRTAOCT() & 4294967295L));
                    defpackage.a7 a7Var = ldVar.oh71FJcDz6S2;
                    long Ns0WNyEWdPsk = a7Var.Ns0WNyEWdPsk();
                    a7Var.oh71FJcDz6S2().fNwYGHIYeJcR();
                    try {
                        ((defpackage.a7) ((defpackage.k0) a7Var.giKS3J6vZuNy).oh71FJcDz6S2).oh71FJcDz6S2().WDYagTQQm9ns(0.0f, 0.0f, intBitsToFloat, intBitsToFloat2, 1);
                        defpackage.ct.cCeDCHgnx5OL(ld0Var, giKS3J6vZuNy, f, 0L, 124);
                    } finally {
                        a7Var.oh71FJcDz6S2().e6mdH7fiFuta();
                        a7Var.IJ0hOnjhPOri(Ns0WNyEWdPsk);
                    }
                } else {
                    defpackage.ct.cCeDCHgnx5OL(ld0Var, giKS3J6vZuNy, f, 0L, 124);
                }
            }
        }
        defpackage.id oh71FJcDz6S2 = ldVar.oh71FJcDz6S2.oh71FJcDz6S2();
        defpackage.z51 z51Var = this.qjMheFZ0l9kA;
        if (z51Var != null) {
            long j = this.dG7RjM6DqYVL;
            int CZa7MwI9IzLd = defpackage.ok0.CZa7MwI9IzLd(this.oCu53ZX2v4Ju);
            long ZpBGe2uQfcn82 = this.maCixPsq4ml2.ZpBGe2uQfcn8();
            this.IJ0hOnjhPOri.ZpBGe2uQfcn8();
            z51Var.WDYagTQQm9ns(CZa7MwI9IzLd, j, ZpBGe2uQfcn82);
            z51Var.draw(defpackage.a.ZpBGe2uQfcn8(oh71FJcDz6S2));
        }
    }
}
