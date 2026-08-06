package defpackage;

import android.content.Context;
import android.graphics.Path;
import android.view.DisplayCutout;
import android.widget.EdgeEffect;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public abstract class d4 {
    public static EdgeEffect GWasM1elztuh(Context context) {
        try {
            return new EdgeEffect(context, null);
        } catch (Throwable unused) {
            return new EdgeEffect(context);
        }
    }

    public static float X1lG3V04pd(EdgeEffect edgeEffect) {
        try {
            return edgeEffect.getDistance();
        } catch (Throwable unused) {
            return 0.0f;
        }
    }

    public static Path Yi7zF1RB1(DisplayCutout displayCutout) {
        return displayCutout.getCutoutPath();
    }

    public static float xqGvceK5x(EdgeEffect edgeEffect, float f, float f2) {
        try {
            return edgeEffect.onPullDistance(f, f2);
        } catch (Throwable unused) {
            edgeEffect.onPull(f, f2);
            return 0.0f;
        }
    }
}
