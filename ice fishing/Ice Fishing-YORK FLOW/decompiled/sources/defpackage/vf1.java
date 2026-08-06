package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class vf1 implements defpackage.ex {
    public final float ZpBGe2uQfcn8;
    public final java.lang.Object fWTAfUmVKrZq;
    public final float giKS3J6vZuNy;

    public vf1(float f, float f2, java.lang.Object obj) {
        this.ZpBGe2uQfcn8 = f;
        this.giKS3J6vZuNy = f2;
        this.fWTAfUmVKrZq = obj;
    }

    @Override // defpackage.a6
    public final defpackage.ft1 ZpBGe2uQfcn8(defpackage.lq1 lq1Var) {
        java.lang.Object obj = this.fWTAfUmVKrZq;
        return new defpackage.ci1(this.ZpBGe2uQfcn8, this.giKS3J6vZuNy, obj == null ? null : (defpackage.g6) lq1Var.ZpBGe2uQfcn8.P05cfTpS5W5L(obj));
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof defpackage.vf1) {
            defpackage.vf1 vf1Var = (defpackage.vf1) obj;
            if (vf1Var.ZpBGe2uQfcn8 == this.ZpBGe2uQfcn8 && vf1Var.giKS3J6vZuNy == this.giKS3J6vZuNy && defpackage.ma0.QiMR8OkAhezm(vf1Var.fWTAfUmVKrZq, this.fWTAfUmVKrZq)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        java.lang.Object obj = this.fWTAfUmVKrZq;
        return java.lang.Float.hashCode(this.giKS3J6vZuNy) + defpackage.pVQOaWB9QMo4.ZpBGe2uQfcn8(this.ZpBGe2uQfcn8, (obj != null ? obj.hashCode() : 0) * 31, 31);
    }

    public /* synthetic */ vf1(java.lang.Object obj) {
        this(1.0f, 1500.0f, obj);
    }
}
