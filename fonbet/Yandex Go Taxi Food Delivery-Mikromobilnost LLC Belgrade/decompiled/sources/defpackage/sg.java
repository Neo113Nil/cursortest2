package defpackage;

import android.app.ActivityOptions;
import android.content.Context;
import android.graphics.Bitmap;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.widget.TextView;

/* loaded from: classes10.dex */
public abstract class sg {
    public static Context a(int i, Context context) {
        return context.createDeviceContext(i);
    }

    public static float b(VelocityTracker velocityTracker, int i) {
        return velocityTracker.getAxisVelocity(i);
    }

    public static int c(Context context) {
        return context.getDeviceId();
    }

    public static int d(Context context) {
        return context.getDeviceId();
    }

    public static int e(ViewConfiguration viewConfiguration, int i, int i2, int i3) {
        return viewConfiguration.getScaledMaximumFlingVelocity(i, i2, i3);
    }

    public static int f(ViewConfiguration viewConfiguration, int i, int i2, int i3) {
        return viewConfiguration.getScaledMinimumFlingVelocity(i, i2, i3);
    }

    public static boolean g(Bitmap bitmap) {
        return bitmap.hasGainmap();
    }

    public static void h(AccessibilityEvent accessibilityEvent, boolean z) {
        accessibilityEvent.setAccessibilityDataSensitive(z);
    }

    public static void i(TextView textView, int i, float f) {
        textView.setLineHeight(i, f);
    }

    public static void j(ActivityOptions activityOptions) {
        activityOptions.setShareIdentityEnabled(false);
    }
}
