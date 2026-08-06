package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class zf1 implements defpackage.a6 {
    public final defpackage.a6 ZpBGe2uQfcn8;
    public final long giKS3J6vZuNy;

    public zf1(defpackage.ex exVar, long j) {
        this.ZpBGe2uQfcn8 = exVar;
        this.giKS3J6vZuNy = j;
    }

    @Override // defpackage.a6
    public final defpackage.ft1 ZpBGe2uQfcn8(defpackage.lq1 lq1Var) {
        return new defpackage.ag1(this.ZpBGe2uQfcn8.ZpBGe2uQfcn8(lq1Var), this.giKS3J6vZuNy);
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof defpackage.zf1)) {
            return false;
        }
        defpackage.zf1 zf1Var = (defpackage.zf1) obj;
        return zf1Var.giKS3J6vZuNy == this.giKS3J6vZuNy && defpackage.ma0.QiMR8OkAhezm(zf1Var.ZpBGe2uQfcn8, this.ZpBGe2uQfcn8);
    }

    public final int hashCode() {
        return java.lang.Long.hashCode(this.giKS3J6vZuNy) + (this.ZpBGe2uQfcn8.hashCode() * 31);
    }
}
