package defpackage;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public abstract class hf0 extends gf0 {
    public int MdtA4re8;
    public String NCTxEWno;
    public kz[] qoPGr6Ce;

    public hf0(hf0 hf0Var) {
        this.qoPGr6Ce = null;
        this.MdtA4re8 = 0;
        this.NCTxEWno = hf0Var.NCTxEWno;
        kz[] kzVarArr = hf0Var.qoPGr6Ce;
        kz[] kzVarArr2 = new kz[kzVarArr.length];
        for (int i = 0; i < kzVarArr.length; i++) {
            kzVarArr2[i] = new kz(kzVarArr[i]);
        }
        this.qoPGr6Ce = kzVarArr2;
    }

    public kz[] getPathData() {
        return this.qoPGr6Ce;
    }

    public String getPathName() {
        return this.NCTxEWno;
    }

    public void setPathData(kz[] kzVarArr) {
        int i;
        kz[] kzVarArr2 = this.qoPGr6Ce;
        if (kzVarArr2 != null && kzVarArr != null && kzVarArr2.length == kzVarArr.length) {
            for (0; i < kzVarArr2.length; i + 1) {
                kz kzVar = kzVarArr2[i];
                char c = kzVar.qoPGr6Ce;
                kz kzVar2 = kzVarArr[i];
                i = (c == kzVar2.qoPGr6Ce && kzVar.NCTxEWno.length == kzVar2.NCTxEWno.length) ? i + 1 : 0;
            }
            kz[] kzVarArr3 = this.qoPGr6Ce;
            for (int i2 = 0; i2 < kzVarArr.length; i2++) {
                kzVarArr3[i2].qoPGr6Ce = kzVarArr[i2].qoPGr6Ce;
                int i3 = 0;
                while (true) {
                    float[] fArr = kzVarArr[i2].NCTxEWno;
                    if (i3 < fArr.length) {
                        kzVarArr3[i2].NCTxEWno[i3] = fArr[i3];
                        i3++;
                    }
                }
            }
            return;
        }
        kz[] kzVarArr4 = new kz[kzVarArr.length];
        for (int i4 = 0; i4 < kzVarArr.length; i4++) {
            kzVarArr4[i4] = new kz(kzVarArr[i4]);
        }
        this.qoPGr6Ce = kzVarArr4;
    }

    public hf0() {
        this.qoPGr6Ce = null;
        this.MdtA4re8 = 0;
    }
}
