package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class q60 extends defpackage.IJ0hOnjhPOri {
    public final int P05cfTpS5W5L;
    public final int QiMR8OkAhezm;
    public final defpackage.blKFvluuDQOf oh71FJcDz6S2;

    public q60(defpackage.blKFvluuDQOf blkfvluudqof, int i, int i2) {
        this.oh71FJcDz6S2 = blkfvluudqof;
        this.QiMR8OkAhezm = i;
        defpackage.n70.fNwYGHIYeJcR(i, i2, blkfvluudqof.ZpBGe2uQfcn8());
        this.P05cfTpS5W5L = i2 - i;
    }

    @Override // defpackage.lr1
    public final int ZpBGe2uQfcn8() {
        return this.P05cfTpS5W5L;
    }

    @Override // java.util.List
    public final java.lang.Object get(int i) {
        defpackage.n70.GE9mJIPrb8gP(i, this.P05cfTpS5W5L);
        return this.oh71FJcDz6S2.get(this.QiMR8OkAhezm + i);
    }

    @Override // defpackage.IJ0hOnjhPOri, java.util.List
    public final java.util.List subList(int i, int i2) {
        defpackage.n70.fNwYGHIYeJcR(i, i2, this.P05cfTpS5W5L);
        int i3 = this.QiMR8OkAhezm;
        return new defpackage.q60(this.oh71FJcDz6S2, i + i3, i3 + i2);
    }
}
