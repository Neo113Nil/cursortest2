package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class z70 extends defpackage.uz0 {
    public final boolean fNwYGHIYeJcR;

    public z70(java.lang.String str, defpackage.a80 a80Var) {
        super(str, a80Var, 1);
        this.fNwYGHIYeJcR = true;
    }

    public final boolean equals(java.lang.Object obj) {
        int i;
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.z70) {
            defpackage.hc1 hc1Var = (defpackage.hc1) obj;
            if (this.ZpBGe2uQfcn8.equals(hc1Var.ZpBGe2uQfcn8())) {
                defpackage.z70 z70Var = (defpackage.z70) obj;
                if (z70Var.fNwYGHIYeJcR && java.util.Arrays.equals((defpackage.hc1[]) this.GE9mJIPrb8gP.getValue(), (defpackage.hc1[]) z70Var.GE9mJIPrb8gP.getValue())) {
                    int fWTAfUmVKrZq = hc1Var.fWTAfUmVKrZq();
                    int i2 = this.fWTAfUmVKrZq;
                    if (i2 == fWTAfUmVKrZq) {
                        for (0; i < i2; i + 1) {
                            i = (defpackage.ma0.QiMR8OkAhezm(QiMR8OkAhezm(i).ZpBGe2uQfcn8(), hc1Var.QiMR8OkAhezm(i).ZpBGe2uQfcn8()) && defpackage.ma0.QiMR8OkAhezm(QiMR8OkAhezm(i).giKS3J6vZuNy(), hc1Var.QiMR8OkAhezm(i).giKS3J6vZuNy())) ? i + 1 : 0;
                        }
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // defpackage.uz0
    public final int hashCode() {
        return super.hashCode() * 31;
    }
}
