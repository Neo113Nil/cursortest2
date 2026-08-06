package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class c30 extends defpackage.gj {
    public java.util.HashSet JhCgjQRTAOCT;
    public final /* synthetic */ defpackage.e30 QiMR8OkAhezm;
    public final defpackage.zn0 WDYagTQQm9ns;
    public final long ZpBGe2uQfcn8;
    public final boolean fWTAfUmVKrZq;
    public final boolean giKS3J6vZuNy;
    public final defpackage.pw0 oh71FJcDz6S2;

    public c30(defpackage.e30 e30Var, long j, boolean z, boolean z2, defpackage.k0 k0Var) {
        this.QiMR8OkAhezm = e30Var;
        this.ZpBGe2uQfcn8 = j;
        this.giKS3J6vZuNy = z;
        this.fWTAfUmVKrZq = z2;
        defpackage.zn0 zn0Var = defpackage.n81.ZpBGe2uQfcn8;
        this.WDYagTQQm9ns = new defpackage.zn0();
        this.oh71FJcDz6S2 = new defpackage.pw0(defpackage.ay0.P05cfTpS5W5L, defpackage.jVUAPb5NnIYW.GoIRkIe1iwj6);
    }

    @Override // defpackage.gj
    public final defpackage.fd BHfvd2J71qpO(defpackage.w2 w2Var) {
        return this.QiMR8OkAhezm.giKS3J6vZuNy.BHfvd2J71qpO(w2Var);
    }

    @Override // defpackage.gj
    public final defpackage.jm GE9mJIPrb8gP() {
        return this.QiMR8OkAhezm.giKS3J6vZuNy.GE9mJIPrb8gP();
    }

    public final void IJ0hOnjhPOri() {
        defpackage.zn0 zn0Var = this.WDYagTQQm9ns;
        if (zn0Var.P05cfTpS5W5L()) {
            java.util.HashSet hashSet = this.JhCgjQRTAOCT;
            if (hashSet != null) {
                java.lang.Object[] objArr = zn0Var.giKS3J6vZuNy;
                long[] jArr = zn0Var.ZpBGe2uQfcn8;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i = 0;
                    while (true) {
                        long j = jArr[i];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i2 = 8 - ((~(i - length)) >>> 31);
                            for (int i3 = 0; i3 < i2; i3++) {
                                if ((255 & j) < 128) {
                                    defpackage.e30 e30Var = (defpackage.e30) objArr[(i << 3) + i3];
                                    java.util.Iterator it = hashSet.iterator();
                                    while (it.hasNext()) {
                                        ((java.util.Set) it.next()).remove(e30Var.IJ0hOnjhPOri());
                                    }
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
            }
            zn0Var.giKS3J6vZuNy();
        }
    }

    @Override // defpackage.gj
    public final boolean JhCgjQRTAOCT() {
        return this.QiMR8OkAhezm.giKS3J6vZuNy.JhCgjQRTAOCT();
    }

    @Override // defpackage.gj
    public final boolean Ns0WNyEWdPsk() {
        return this.QiMR8OkAhezm.giKS3J6vZuNy.Ns0WNyEWdPsk();
    }

    @Override // defpackage.gj
    public final defpackage.fj P05cfTpS5W5L() {
        return this.QiMR8OkAhezm.P05cfTpS5W5L;
    }

    @Override // defpackage.gj
    public final long QiMR8OkAhezm() {
        return this.ZpBGe2uQfcn8;
    }

    @Override // defpackage.gj
    public final void T1fB7bDYiVJQ(java.util.Set set) {
        java.util.HashSet hashSet = this.JhCgjQRTAOCT;
        if (hashSet == null) {
            hashSet = new java.util.HashSet();
            this.JhCgjQRTAOCT = hashSet;
        }
        hashSet.add(set);
    }

    @Override // defpackage.gj
    public final boolean WDYagTQQm9ns() {
        return this.giKS3J6vZuNy;
    }

    @Override // defpackage.gj
    public final void WmetiUbpKU9I(defpackage.f31 f31Var) {
        this.QiMR8OkAhezm.giKS3J6vZuNy.WmetiUbpKU9I(f31Var);
    }

    @Override // defpackage.gj
    public final void XntWc4eZSQ8j(defpackage.e30 e30Var) {
        this.WDYagTQQm9ns.ZpBGe2uQfcn8(e30Var);
    }

    @Override // defpackage.gj
    public final void ZVVdXbWmyCSK() {
        this.QiMR8OkAhezm.OcTWLQzke1i2++;
    }

    @Override // defpackage.gj
    public final void ZpBGe2uQfcn8(defpackage.lj ljVar, defpackage.c20 c20Var) {
        this.QiMR8OkAhezm.giKS3J6vZuNy.ZpBGe2uQfcn8(ljVar, c20Var);
    }

    @Override // defpackage.gj
    public final defpackage.ay0 e6mdH7fiFuta() {
        return (defpackage.ay0) this.oh71FJcDz6S2.getValue();
    }

    @Override // defpackage.gj
    public final void fNwYGHIYeJcR(defpackage.lj ljVar) {
        defpackage.e30 e30Var = this.QiMR8OkAhezm;
        e30Var.giKS3J6vZuNy.fNwYGHIYeJcR(e30Var.P05cfTpS5W5L);
        e30Var.giKS3J6vZuNy.fNwYGHIYeJcR(ljVar);
    }

    @Override // defpackage.gj
    public final void fWTAfUmVKrZq() {
        defpackage.e30 e30Var = this.QiMR8OkAhezm;
        e30Var.OcTWLQzke1i2--;
    }

    @Override // defpackage.gj
    public final defpackage.zn0 gUjdnLbkVAaA(defpackage.lj ljVar, defpackage.td1 td1Var, defpackage.zn0 zn0Var) {
        return this.QiMR8OkAhezm.giKS3J6vZuNy.gUjdnLbkVAaA(ljVar, td1Var, zn0Var);
    }

    @Override // defpackage.gj
    public final defpackage.zn0 giKS3J6vZuNy(defpackage.lj ljVar, defpackage.td1 td1Var, defpackage.c20 c20Var) {
        return this.QiMR8OkAhezm.giKS3J6vZuNy.giKS3J6vZuNy(ljVar, td1Var, c20Var);
    }

    @Override // defpackage.gj
    public final defpackage.rm0 h3m55N1URyyK(defpackage.sm0 sm0Var) {
        return this.QiMR8OkAhezm.giKS3J6vZuNy.h3m55N1URyyK(sm0Var);
    }

    @Override // defpackage.gj
    public final void maCixPsq4ml2(defpackage.lj ljVar) {
        this.QiMR8OkAhezm.giKS3J6vZuNy.maCixPsq4ml2(ljVar);
    }

    @Override // defpackage.gj
    public final boolean oh71FJcDz6S2() {
        return this.fWTAfUmVKrZq;
    }

    @Override // defpackage.gj
    public final void s0TASMVLSWD5(defpackage.lj ljVar) {
        this.QiMR8OkAhezm.giKS3J6vZuNy.s0TASMVLSWD5(ljVar);
    }

    @Override // defpackage.gj
    public final void w7APNrr0aGRc(defpackage.e30 e30Var) {
        java.util.HashSet hashSet = this.JhCgjQRTAOCT;
        if (hashSet != null) {
            java.util.Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                java.util.Set set = (java.util.Set) it.next();
                e30Var.getClass();
                set.remove(e30Var.IJ0hOnjhPOri());
            }
        }
        if (e30Var != null) {
            this.WDYagTQQm9ns.fNwYGHIYeJcR(e30Var);
        }
    }
}
