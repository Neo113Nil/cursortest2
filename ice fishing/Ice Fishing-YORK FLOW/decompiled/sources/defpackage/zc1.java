package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class zc1 {
    public static final defpackage.zc1 JhCgjQRTAOCT = new defpackage.zc1(0.0f, defpackage.ok0.WDYagTQQm9ns(4278190080L), 0);
    public final long ZpBGe2uQfcn8;
    public final float fWTAfUmVKrZq;
    public final long giKS3J6vZuNy;

    public zc1(float f, long j, long j2) {
        this.ZpBGe2uQfcn8 = j;
        this.giKS3J6vZuNy = j2;
        this.fWTAfUmVKrZq = f;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.zc1)) {
            return false;
        }
        defpackage.zc1 zc1Var = (defpackage.zc1) obj;
        return defpackage.pf.fWTAfUmVKrZq(this.ZpBGe2uQfcn8, zc1Var.ZpBGe2uQfcn8) && defpackage.ws0.giKS3J6vZuNy(this.giKS3J6vZuNy, zc1Var.giKS3J6vZuNy) && this.fWTAfUmVKrZq == zc1Var.fWTAfUmVKrZq;
    }

    public final int hashCode() {
        int i = defpackage.pf.P05cfTpS5W5L;
        return java.lang.Float.hashCode(this.fWTAfUmVKrZq) + defpackage.pVQOaWB9QMo4.fWTAfUmVKrZq(java.lang.Long.hashCode(this.ZpBGe2uQfcn8) * 31, 31, this.giKS3J6vZuNy);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Shadow(color=");
        defpackage.pVQOaWB9QMo4.WmetiUbpKU9I(this.ZpBGe2uQfcn8, sb, ", offset=");
        sb.append((java.lang.Object) defpackage.ws0.QiMR8OkAhezm(this.giKS3J6vZuNy));
        sb.append(", blurRadius=");
        return defpackage.pVQOaWB9QMo4.GE9mJIPrb8gP(sb, this.fWTAfUmVKrZq, ')');
    }
}
