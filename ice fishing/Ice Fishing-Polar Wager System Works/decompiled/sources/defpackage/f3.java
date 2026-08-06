package defpackage;

/* loaded from: classes.dex */
public final class f3 extends defpackage.lj0 implements defpackage.lh, defpackage.wr, defpackage.t90 {
    public boolean C0U8sNJm;
    public final defpackage.zk0 EgCjBq0SZwJ;
    public float NHJTzaLwkd;
    public final defpackage.nn PAEGRtP0bX;
    public long QQUzIjv3iOC5 = 0;
    public final defpackage.gl0 UsuH8pd5P = new defpackage.gl0();
    public final defpackage.c1NqjJifC7 V7bD7b8KA;
    public defpackage.kc abhbClRa;
    public final boolean fnWB2E7cs;
    public final float kNAkVymC;
    public defpackage.g21 nBH8hAHy;
    public defpackage.h21 v5iciZok;

    public f3(defpackage.zk0 zk0Var, boolean z, float f, defpackage.c1NqjJifC7 c1nqjjifc7, defpackage.nn nnVar) {
        this.EgCjBq0SZwJ = zk0Var;
        this.fnWB2E7cs = z;
        this.kNAkVymC = f;
        this.V7bD7b8KA = c1nqjjifc7;
        this.PAEGRtP0bX = nnVar;
    }

    @Override // defpackage.wr
    public final void D2vUnMij(defpackage.oa0 oa0Var) {
        defpackage.jb jbVar = oa0Var.adDC3e2L;
        oa0Var.IHQe1A4L2xu();
        defpackage.kc kcVar = this.abhbClRa;
        if (kcVar != null) {
            float f = this.NHJTzaLwkd;
            long F7NU4MC0GW = this.V7bD7b8KA.F7NU4MC0GW();
            float floatValue = ((java.lang.Number) ((defpackage.w3) kcVar.r1MBDhnF).F7NU4MC0GW()).floatValue();
            if (floatValue > 0.0f) {
                long oh6vYeIP = defpackage.ae.oh6vYeIP(F7NU4MC0GW, floatValue);
                if (kcVar.IHQe1A4L2xu) {
                    float intBitsToFloat = java.lang.Float.intBitsToFloat((int) (jbVar.r1MBDhnF() >> 32));
                    float intBitsToFloat2 = java.lang.Float.intBitsToFloat((int) (jbVar.r1MBDhnF() & 4294967295L));
                    defpackage.v5 v5Var = jbVar.xiZrDbcSW0;
                    long riuEU0zW4 = v5Var.riuEU0zW4();
                    v5Var.xiZrDbcSW0().riuEU0zW4();
                    try {
                        ((defpackage.v5) ((defpackage.c1NqjJifC7) v5Var.oh6vYeIP).xiZrDbcSW0).xiZrDbcSW0().F7NU4MC0GW(0.0f, 0.0f, intBitsToFloat, intBitsToFloat2, 1);
                        defpackage.xr.v5iciZok(oa0Var, oh6vYeIP, f, 0L, null, 124);
                    } finally {
                        v5Var.xiZrDbcSW0().AARZUJiTa();
                        v5Var.EgCjBq0SZwJ(riuEU0zW4);
                    }
                } else {
                    defpackage.xr.v5iciZok(oa0Var, oh6vYeIP, f, 0L, null, 124);
                }
            }
        }
        defpackage.hb xiZrDbcSW0 = jbVar.xiZrDbcSW0.xiZrDbcSW0();
        defpackage.h21 h21Var = this.v5iciZok;
        if (h21Var != null) {
            long j = this.QQUzIjv3iOC5;
            int TFRaUu83X3E = defpackage.ci0.TFRaUu83X3E(this.NHJTzaLwkd);
            long F7NU4MC0GW2 = this.V7bD7b8KA.F7NU4MC0GW();
            this.PAEGRtP0bX.IHQe1A4L2xu();
            h21Var.adDC3e2L(TFRaUu83X3E, j, F7NU4MC0GW2);
            h21Var.draw(defpackage.d0.IHQe1A4L2xu(xiZrDbcSW0));
        }
    }

    @Override // defpackage.t90
    public final void DFo87pBq1E5(long j) {
        float EgCjBq0SZwJ;
        this.C0U8sNJm = true;
        defpackage.qn qnVar = defpackage.w70.D2vUnMij(this).UsuH8pd5P;
        this.QQUzIjv3iOC5 = defpackage.j70.frpfPPIgqM9O(j);
        float f = this.kNAkVymC;
        if (java.lang.Float.isNaN(f)) {
            long j2 = this.QQUzIjv3iOC5;
            float intBitsToFloat = java.lang.Float.intBitsToFloat((int) (j2 >> 32));
            float intBitsToFloat2 = java.lang.Float.intBitsToFloat((int) (j2 & 4294967295L));
            EgCjBq0SZwJ = defpackage.gq0.r1MBDhnF((java.lang.Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (java.lang.Float.floatToRawIntBits(intBitsToFloat) << 32)) / 2.0f;
            if (this.fnWB2E7cs) {
                EgCjBq0SZwJ += qnVar.EgCjBq0SZwJ(10.0f);
            }
        } else {
            EgCjBq0SZwJ = qnVar.EgCjBq0SZwJ(f);
        }
        this.NHJTzaLwkd = EgCjBq0SZwJ;
        defpackage.gl0 gl0Var = this.UsuH8pd5P;
        java.lang.Object[] objArr = gl0Var.IHQe1A4L2xu;
        int i = gl0Var.oh6vYeIP;
        for (int i2 = 0; i2 < i; i2++) {
            UVjEelCZ((defpackage.rx0) objArr[i2]);
        }
        gl0Var.F7NU4MC0GW();
    }

    @Override // defpackage.lj0
    public final void JX5fKip1C6() {
        defpackage.fm.SiPhmbmu(dOmtpLcqqI1y(), null, new defpackage.t01(this, null, 1), 3);
    }

    public final void UVjEelCZ(defpackage.rx0 rx0Var) {
        defpackage.h21 h21Var;
        if (!(rx0Var instanceof defpackage.px0)) {
            if (rx0Var instanceof defpackage.qx0) {
                defpackage.h21 h21Var2 = this.v5iciZok;
                if (h21Var2 != null) {
                    h21Var2.F7NU4MC0GW();
                    return;
                }
                return;
            }
            if (!(rx0Var instanceof defpackage.ox0) || (h21Var = this.v5iciZok) == null) {
                return;
            }
            h21Var.F7NU4MC0GW();
            return;
        }
        defpackage.px0 px0Var = (defpackage.px0) rx0Var;
        long j = this.QQUzIjv3iOC5;
        float f = this.NHJTzaLwkd;
        defpackage.g21 g21Var = this.nBH8hAHy;
        int i = 0;
        if (g21Var == null) {
            java.lang.Object obj = (android.view.View) defpackage.mj1.abhbClRa(this, defpackage.j1.adDC3e2L);
            while (!(obj instanceof android.view.ViewGroup)) {
                java.lang.Object parent = ((android.view.View) obj).getParent();
                if (!(parent instanceof android.view.View)) {
                    defpackage.db.QoRHpC4k("Couldn't find a valid parent for ", obj, ". Are you overriding LocalView and providing a View that is not attached to the view hierarchy?");
                    return;
                }
                obj = parent;
            }
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) obj;
            int childCount = viewGroup.getChildCount();
            int i2 = 0;
            while (true) {
                if (i2 >= childCount) {
                    defpackage.g21 g21Var2 = new defpackage.g21(viewGroup.getContext());
                    viewGroup.addView(g21Var2);
                    g21Var = g21Var2;
                    break;
                } else {
                    android.view.View childAt = viewGroup.getChildAt(i2);
                    if (childAt instanceof defpackage.g21) {
                        g21Var = (defpackage.g21) childAt;
                        break;
                    }
                    i2++;
                }
            }
            this.nBH8hAHy = g21Var;
        }
        java.util.ArrayList arrayList = g21Var.xiZrDbcSW0;
        defpackage.F7NU4MC0GW f7nu4mc0gw = g21Var.EXtogiMhuM;
        java.util.LinkedHashMap linkedHashMap = (java.util.LinkedHashMap) f7nu4mc0gw.xiZrDbcSW0;
        java.util.LinkedHashMap linkedHashMap2 = (java.util.LinkedHashMap) f7nu4mc0gw.xiZrDbcSW0;
        java.util.LinkedHashMap linkedHashMap3 = (java.util.LinkedHashMap) f7nu4mc0gw.AARZUJiTa;
        defpackage.h21 h21Var3 = (defpackage.h21) linkedHashMap.get(this);
        if (h21Var3 == null) {
            java.util.ArrayList arrayList2 = g21Var.AARZUJiTa;
            arrayList2.getClass();
            h21Var3 = (defpackage.h21) (arrayList2.isEmpty() ? null : arrayList2.remove(0));
            if (h21Var3 == null) {
                if (g21Var.riuEU0zW4 > defpackage.fm.nBH8hAHy(arrayList)) {
                    h21Var3 = new defpackage.h21(g21Var.getContext());
                    g21Var.addView(h21Var3);
                    arrayList.add(h21Var3);
                } else {
                    h21Var3 = (defpackage.h21) arrayList.get(g21Var.riuEU0zW4);
                    defpackage.f3 f3Var = (defpackage.f3) linkedHashMap3.get(h21Var3);
                    if (f3Var != null) {
                        f3Var.v5iciZok = null;
                        defpackage.fm.D2vUnMij(f3Var);
                        defpackage.h21 h21Var4 = (defpackage.h21) linkedHashMap2.get(f3Var);
                        if (h21Var4 != null) {
                        }
                        linkedHashMap2.remove(f3Var);
                        h21Var3.r1MBDhnF();
                    }
                }
                int i3 = g21Var.riuEU0zW4;
                if (i3 < g21Var.adDC3e2L - 1) {
                    g21Var.riuEU0zW4 = i3 + 1;
                } else {
                    g21Var.riuEU0zW4 = 0;
                }
            }
            linkedHashMap2.put(this, h21Var3);
            linkedHashMap3.put(h21Var3, this);
        }
        int TFRaUu83X3E = defpackage.ci0.TFRaUu83X3E(f);
        long F7NU4MC0GW = this.V7bD7b8KA.F7NU4MC0GW();
        this.PAEGRtP0bX.IHQe1A4L2xu();
        defpackage.h21 h21Var5 = h21Var3;
        h21Var5.oh6vYeIP(px0Var, this.fnWB2E7cs, j, TFRaUu83X3E, F7NU4MC0GW, new defpackage.e3(i, this));
        this.v5iciZok = h21Var5;
        defpackage.fm.D2vUnMij(this);
    }

    @Override // defpackage.lj0
    public final boolean ZNF7fheNE() {
        return false;
    }

    @Override // defpackage.lj0
    public final void yUiIS9dG7NYk() {
        defpackage.g21 g21Var = this.nBH8hAHy;
        if (g21Var != null) {
            this.v5iciZok = null;
            defpackage.fm.D2vUnMij(this);
            defpackage.F7NU4MC0GW f7nu4mc0gw = g21Var.EXtogiMhuM;
            defpackage.h21 h21Var = (defpackage.h21) ((java.util.LinkedHashMap) f7nu4mc0gw.xiZrDbcSW0).get(this);
            if (h21Var != null) {
                h21Var.r1MBDhnF();
                java.util.LinkedHashMap linkedHashMap = (java.util.LinkedHashMap) f7nu4mc0gw.xiZrDbcSW0;
                defpackage.h21 h21Var2 = (defpackage.h21) linkedHashMap.get(this);
                if (h21Var2 != null) {
                }
                linkedHashMap.remove(this);
                g21Var.AARZUJiTa.add(h21Var);
            }
        }
    }
}
