package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class mm0 {
    public final long ZpBGe2uQfcn8;
    public final boolean fWTAfUmVKrZq;
    public final long giKS3J6vZuNy;

    public mm0(long j, long j2, boolean z) {
        this.ZpBGe2uQfcn8 = j;
        this.giKS3J6vZuNy = j2;
        this.fWTAfUmVKrZq = z;
    }

    public final defpackage.mm0 ZpBGe2uQfcn8(defpackage.mm0 mm0Var) {
        return new defpackage.mm0(defpackage.ws0.WDYagTQQm9ns(this.ZpBGe2uQfcn8, mm0Var.ZpBGe2uQfcn8), java.lang.Math.max(this.giKS3J6vZuNy, mm0Var.giKS3J6vZuNy), this.fWTAfUmVKrZq);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.mm0)) {
            return false;
        }
        defpackage.mm0 mm0Var = (defpackage.mm0) obj;
        return defpackage.ws0.giKS3J6vZuNy(this.ZpBGe2uQfcn8, mm0Var.ZpBGe2uQfcn8) && this.giKS3J6vZuNy == mm0Var.giKS3J6vZuNy && this.fWTAfUmVKrZq == mm0Var.fWTAfUmVKrZq;
    }

    public final int hashCode() {
        return java.lang.Boolean.hashCode(this.fWTAfUmVKrZq) + defpackage.pVQOaWB9QMo4.fWTAfUmVKrZq(java.lang.Long.hashCode(this.ZpBGe2uQfcn8) * 31, 31, this.giKS3J6vZuNy);
    }

    public final java.lang.String toString() {
        return "MouseWheelScrollDelta(value=" + ((java.lang.Object) defpackage.ws0.QiMR8OkAhezm(this.ZpBGe2uQfcn8)) + ", timeMillis=" + this.giKS3J6vZuNy + ", shouldApplyImmediately=" + this.fWTAfUmVKrZq + ')';
    }
}
