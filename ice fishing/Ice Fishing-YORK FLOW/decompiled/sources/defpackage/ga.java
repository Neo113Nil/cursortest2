package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class ga {
    public final android.graphics.ColorFilter ZpBGe2uQfcn8;
    public final int fWTAfUmVKrZq;
    public final long giKS3J6vZuNy;

    public ga(int i, long j) {
        android.graphics.ColorFilter porterDuffColorFilter;
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            defpackage.sGDr7tcBtHOt.oh71FJcDz6S2();
            porterDuffColorFilter = defpackage.sGDr7tcBtHOt.JhCgjQRTAOCT(defpackage.ok0.PS16moFv2oLu(j), defpackage.h0.FhgBoOud6zyW(i));
        } else {
            porterDuffColorFilter = new android.graphics.PorterDuffColorFilter(defpackage.ok0.PS16moFv2oLu(j), defpackage.h0.Rl68HURFBtL3(i));
        }
        this.ZpBGe2uQfcn8 = porterDuffColorFilter;
        this.giKS3J6vZuNy = j;
        this.fWTAfUmVKrZq = i;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.ga)) {
            return false;
        }
        defpackage.ga gaVar = (defpackage.ga) obj;
        return defpackage.pf.fWTAfUmVKrZq(this.giKS3J6vZuNy, gaVar.giKS3J6vZuNy) && this.fWTAfUmVKrZq == gaVar.fWTAfUmVKrZq;
    }

    public final int hashCode() {
        int i = defpackage.pf.P05cfTpS5W5L;
        return java.lang.Integer.hashCode(this.fWTAfUmVKrZq) + (java.lang.Long.hashCode(this.giKS3J6vZuNy) * 31);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("BlendModeColorFilter(color=");
        defpackage.pVQOaWB9QMo4.WmetiUbpKU9I(this.giKS3J6vZuNy, sb, ", blendMode=");
        sb.append((java.lang.Object) defpackage.nq1.GoIRkIe1iwj6(this.fWTAfUmVKrZq));
        sb.append(')');
        return sb.toString();
    }
}
