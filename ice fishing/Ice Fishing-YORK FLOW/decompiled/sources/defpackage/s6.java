package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public abstract class s6 {
    public static float JhCgjQRTAOCT(android.widget.EdgeEffect edgeEffect, float f, float f2) {
        try {
            return edgeEffect.onPullDistance(f, f2);
        } catch (java.lang.Throwable unused) {
            edgeEffect.onPull(f, f2);
            return 0.0f;
        }
    }

    public static android.widget.EdgeEffect ZpBGe2uQfcn8(android.content.Context context) {
        try {
            return new android.widget.EdgeEffect(context, null);
        } catch (java.lang.Throwable unused) {
            return new android.widget.EdgeEffect(context);
        }
    }

    public static float fWTAfUmVKrZq(android.widget.EdgeEffect edgeEffect) {
        try {
            return edgeEffect.getDistance();
        } catch (java.lang.Throwable unused) {
            return 0.0f;
        }
    }

    public static android.graphics.Path giKS3J6vZuNy(android.view.DisplayCutout displayCutout) {
        return displayCutout.getCutoutPath();
    }
}
