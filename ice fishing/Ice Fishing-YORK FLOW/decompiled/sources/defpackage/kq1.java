package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class kq1 implements defpackage.ex {
    public final int ZpBGe2uQfcn8;
    public final defpackage.ot fWTAfUmVKrZq;
    public final int giKS3J6vZuNy;

    public kq1(int i, int i2, defpackage.ot otVar) {
        this.ZpBGe2uQfcn8 = i;
        this.giKS3J6vZuNy = i2;
        this.fWTAfUmVKrZq = otVar;
    }

    @Override // defpackage.a6
    public final defpackage.ft1 ZpBGe2uQfcn8(defpackage.lq1 lq1Var) {
        return new defpackage.xs0(this.ZpBGe2uQfcn8, this.giKS3J6vZuNy, this.fWTAfUmVKrZq);
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof defpackage.kq1) {
            defpackage.kq1 kq1Var = (defpackage.kq1) obj;
            if (kq1Var.ZpBGe2uQfcn8 == this.ZpBGe2uQfcn8 && kq1Var.giKS3J6vZuNy == this.giKS3J6vZuNy && defpackage.ma0.QiMR8OkAhezm(kq1Var.fWTAfUmVKrZq, this.fWTAfUmVKrZq)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.fWTAfUmVKrZq.hashCode() + (this.ZpBGe2uQfcn8 * 31)) * 31) + this.giKS3J6vZuNy;
    }
}
