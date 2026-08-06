package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class ih0 {
    public static final float JhCgjQRTAOCT;
    public static final float fWTAfUmVKrZq;
    public static final float giKS3J6vZuNy;
    public final float ZpBGe2uQfcn8;

    static {
        ZpBGe2uQfcn8(0.0f);
        ZpBGe2uQfcn8(0.5f);
        giKS3J6vZuNy = 0.5f;
        ZpBGe2uQfcn8(-1.0f);
        fWTAfUmVKrZq = -1.0f;
        ZpBGe2uQfcn8(1.0f);
        JhCgjQRTAOCT = 1.0f;
    }

    public static void ZpBGe2uQfcn8(float f) {
        if ((0.0f > f || f > 1.0f) && f != -1.0f) {
            defpackage.f80.giKS3J6vZuNy("topRatio should be in [0..1] range or -1");
        }
    }

    public static java.lang.String giKS3J6vZuNy(float f) {
        if (f == 0.0f) {
            return "LineHeightStyle.Alignment.Top";
        }
        if (f == giKS3J6vZuNy) {
            return "LineHeightStyle.Alignment.Center";
        }
        if (f == fWTAfUmVKrZq) {
            return "LineHeightStyle.Alignment.Proportional";
        }
        if (f == JhCgjQRTAOCT) {
            return "LineHeightStyle.Alignment.Bottom";
        }
        return "LineHeightStyle.Alignment(topPercentage = " + f + ')';
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof defpackage.ih0) {
            return java.lang.Float.compare(this.ZpBGe2uQfcn8, ((defpackage.ih0) obj).ZpBGe2uQfcn8) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return java.lang.Float.hashCode(this.ZpBGe2uQfcn8);
    }

    public final java.lang.String toString() {
        return giKS3J6vZuNy(this.ZpBGe2uQfcn8);
    }
}
