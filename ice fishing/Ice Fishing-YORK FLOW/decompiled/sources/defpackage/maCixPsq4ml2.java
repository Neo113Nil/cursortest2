package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class maCixPsq4ml2 extends defpackage.IJ0hOnjhPOri implements java.util.RandomAccess {
    public final int P05cfTpS5W5L;
    public final int QiMR8OkAhezm;
    public final defpackage.IJ0hOnjhPOri oh71FJcDz6S2;

    public maCixPsq4ml2(defpackage.IJ0hOnjhPOri iJ0hOnjhPOri, int i, int i2) {
        this.oh71FJcDz6S2 = iJ0hOnjhPOri;
        this.QiMR8OkAhezm = i;
        defpackage.ok0.ZVVdXbWmyCSK(i, i2, iJ0hOnjhPOri.ZpBGe2uQfcn8());
        this.P05cfTpS5W5L = i2 - i;
    }

    @Override // defpackage.lr1
    public final int ZpBGe2uQfcn8() {
        return this.P05cfTpS5W5L;
    }

    @Override // java.util.List
    public final java.lang.Object get(int i) {
        int i2 = this.P05cfTpS5W5L;
        if (i < 0 || i >= i2) {
            defpackage.h7.WmetiUbpKU9I(defpackage.pVQOaWB9QMo4.P05cfTpS5W5L(i, i2, "index: ", ", size: "));
            return null;
        }
        return this.oh71FJcDz6S2.get(this.QiMR8OkAhezm + i);
    }

    @Override // defpackage.IJ0hOnjhPOri, java.util.List
    public final java.util.List subList(int i, int i2) {
        defpackage.ok0.ZVVdXbWmyCSK(i, i2, this.P05cfTpS5W5L);
        int i3 = this.QiMR8OkAhezm;
        return new defpackage.maCixPsq4ml2(this.oh71FJcDz6S2, i + i3, i3 + i2);
    }
}
