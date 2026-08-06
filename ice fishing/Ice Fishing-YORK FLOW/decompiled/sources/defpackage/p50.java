package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class p50 implements defpackage.yc0 {
    public final defpackage.n10 JhCgjQRTAOCT;
    public final defpackage.vl1 ZpBGe2uQfcn8;
    public final defpackage.ap1 fWTAfUmVKrZq;
    public final int giKS3J6vZuNy;

    public p50(defpackage.vl1 vl1Var, int i, defpackage.ap1 ap1Var, defpackage.n10 n10Var) {
        this.ZpBGe2uQfcn8 = vl1Var;
        this.giKS3J6vZuNy = i;
        this.fWTAfUmVKrZq = ap1Var;
        this.JhCgjQRTAOCT = n10Var;
    }

    @Override // defpackage.yc0
    public final defpackage.wk0 WDYagTQQm9ns(defpackage.xk0 xk0Var, defpackage.qk0 qk0Var, long j) {
        long j2;
        if (qk0Var.GoIRkIe1iwj6(defpackage.mk.QiMR8OkAhezm(j)) < defpackage.mk.P05cfTpS5W5L(j)) {
            j2 = j;
        } else {
            j2 = j;
            j = defpackage.mk.ZpBGe2uQfcn8(j2, 0, Integer.MAX_VALUE, 0, 0, 13);
        }
        defpackage.ry0 WDYagTQQm9ns = qk0Var.WDYagTQQm9ns(j);
        int min = java.lang.Math.min(WDYagTQQm9ns.WDYagTQQm9ns, defpackage.mk.P05cfTpS5W5L(j2));
        return xk0Var.hwoZxnIesQBZ(min, WDYagTQQm9ns.oh71FJcDz6S2, defpackage.bv.WDYagTQQm9ns, new defpackage.op(this, xk0Var, WDYagTQQm9ns, min, 1));
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.p50) {
            defpackage.p50 p50Var = (defpackage.p50) obj;
            if (this.ZpBGe2uQfcn8 == p50Var.ZpBGe2uQfcn8 && this.giKS3J6vZuNy == p50Var.giKS3J6vZuNy && this.fWTAfUmVKrZq.equals(p50Var.fWTAfUmVKrZq) && defpackage.ma0.QiMR8OkAhezm(this.JhCgjQRTAOCT, p50Var.JhCgjQRTAOCT)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.JhCgjQRTAOCT.hashCode() + ((this.fWTAfUmVKrZq.hashCode() + defpackage.pVQOaWB9QMo4.giKS3J6vZuNy(this.giKS3J6vZuNy, this.ZpBGe2uQfcn8.hashCode() * 31, 31)) * 31);
    }

    public final java.lang.String toString() {
        return "HorizontalScrollLayoutModifier(scrollerPosition=" + this.ZpBGe2uQfcn8 + ", cursorOffset=" + this.giKS3J6vZuNy + ", transformedText=" + this.fWTAfUmVKrZq + ", textLayoutResultProvider=" + this.JhCgjQRTAOCT + ')';
    }
}
