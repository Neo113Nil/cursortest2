package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class gn1 {
    public final int ZpBGe2uQfcn8;
    public final boolean giKS3J6vZuNy;
    public static final defpackage.gn1 fWTAfUmVKrZq = new defpackage.gn1(2, false);
    public static final defpackage.gn1 JhCgjQRTAOCT = new defpackage.gn1(1, true);

    public gn1(int i, boolean z) {
        this.ZpBGe2uQfcn8 = i;
        this.giKS3J6vZuNy = z;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.gn1)) {
            return false;
        }
        defpackage.gn1 gn1Var = (defpackage.gn1) obj;
        return this.ZpBGe2uQfcn8 == gn1Var.ZpBGe2uQfcn8 && this.giKS3J6vZuNy == gn1Var.giKS3J6vZuNy;
    }

    public final int hashCode() {
        return java.lang.Boolean.hashCode(this.giKS3J6vZuNy) + (java.lang.Integer.hashCode(this.ZpBGe2uQfcn8) * 31);
    }

    public final java.lang.String toString() {
        return equals(fWTAfUmVKrZq) ? "TextMotion.Static" : equals(JhCgjQRTAOCT) ? "TextMotion.Animated" : "Invalid";
    }
}
