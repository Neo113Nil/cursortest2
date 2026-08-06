package defpackage;

/* loaded from: classes.dex */
public abstract class t5 {
    public static float F7NU4MC0GW(android.widget.EdgeEffect edgeEffect, float f, float f2) {
        try {
            return edgeEffect.onPullDistance(f, f2);
        } catch (java.lang.Throwable unused) {
            edgeEffect.onPull(f, f2);
            return 0.0f;
        }
    }

    public static android.widget.EdgeEffect IHQe1A4L2xu(android.content.Context context) {
        try {
            return new android.widget.EdgeEffect(context, null);
        } catch (java.lang.Throwable unused) {
            return new android.widget.EdgeEffect(context);
        }
    }

    public static android.graphics.Path oh6vYeIP(android.view.DisplayCutout displayCutout) {
        return displayCutout.getCutoutPath();
    }

    public static float r1MBDhnF(android.widget.EdgeEffect edgeEffect) {
        try {
            return edgeEffect.getDistance();
        } catch (java.lang.Throwable unused) {
            return 0.0f;
        }
    }
}
