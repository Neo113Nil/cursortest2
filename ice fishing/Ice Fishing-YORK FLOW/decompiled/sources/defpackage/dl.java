package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class dl {
    public final long JhCgjQRTAOCT;
    public final long WDYagTQQm9ns;
    public final long ZpBGe2uQfcn8;
    public final long fWTAfUmVKrZq;
    public final long giKS3J6vZuNy;

    public dl(long j, long j2, long j3, long j4, long j5) {
        this.ZpBGe2uQfcn8 = j;
        this.giKS3J6vZuNy = j2;
        this.fWTAfUmVKrZq = j3;
        this.JhCgjQRTAOCT = j4;
        this.WDYagTQQm9ns = j5;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof defpackage.dl)) {
            return false;
        }
        defpackage.dl dlVar = (defpackage.dl) obj;
        return defpackage.pf.fWTAfUmVKrZq(this.ZpBGe2uQfcn8, dlVar.ZpBGe2uQfcn8) && defpackage.pf.fWTAfUmVKrZq(this.giKS3J6vZuNy, dlVar.giKS3J6vZuNy) && defpackage.pf.fWTAfUmVKrZq(this.fWTAfUmVKrZq, dlVar.fWTAfUmVKrZq) && defpackage.pf.fWTAfUmVKrZq(this.JhCgjQRTAOCT, dlVar.JhCgjQRTAOCT) && defpackage.pf.fWTAfUmVKrZq(this.WDYagTQQm9ns, dlVar.WDYagTQQm9ns);
    }

    public final int hashCode() {
        int i = defpackage.pf.P05cfTpS5W5L;
        return java.lang.Long.hashCode(this.WDYagTQQm9ns) + defpackage.pVQOaWB9QMo4.fWTAfUmVKrZq(defpackage.pVQOaWB9QMo4.fWTAfUmVKrZq(defpackage.pVQOaWB9QMo4.fWTAfUmVKrZq(java.lang.Long.hashCode(this.ZpBGe2uQfcn8) * 31, 31, this.giKS3J6vZuNy), 31, this.fWTAfUmVKrZq), 31, this.JhCgjQRTAOCT);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ContextMenuColors(backgroundColor=");
        defpackage.pVQOaWB9QMo4.WmetiUbpKU9I(this.ZpBGe2uQfcn8, sb, ", textColor=");
        defpackage.pVQOaWB9QMo4.WmetiUbpKU9I(this.giKS3J6vZuNy, sb, ", iconColor=");
        defpackage.pVQOaWB9QMo4.WmetiUbpKU9I(this.fWTAfUmVKrZq, sb, ", disabledTextColor=");
        defpackage.pVQOaWB9QMo4.WmetiUbpKU9I(this.JhCgjQRTAOCT, sb, ", disabledIconColor=");
        sb.append((java.lang.Object) defpackage.pf.e6mdH7fiFuta(this.WDYagTQQm9ns));
        sb.append(')');
        return sb.toString();
    }
}
