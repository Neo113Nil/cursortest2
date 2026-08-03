package com.onesignal.common;

import android.R;
import android.app.Activity;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.view.DisplayCutout;
import android.view.View;
import android.view.WindowInsets;
import bc.a0;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class n {
    public static final n INSTANCE = new n();

    private n() {
    }

    private final int getDisplaySizeY(Activity activity) {
        Point point = new Point();
        activity.getWindowManager().getDefaultDisplay().getSize(point);
        return point.y;
    }

    private final int getWindowHeightAPI23Plus(Activity activity) {
        View decorView = activity.getWindow().getDecorView();
        pc.j.d(decorView, "activity.window.decorView");
        WindowInsets rootWindowInsets = decorView.getRootWindowInsets();
        return rootWindowInsets == null ? decorView.getHeight() : (decorView.getHeight() - rootWindowInsets.getStableInsetBottom()) - rootWindowInsets.getStableInsetTop();
    }

    private final int getWindowHeightLollipop(Activity activity) {
        return activity.getResources().getConfiguration().orientation == 2 ? getWindowVisibleDisplayFrame(activity).height() : getDisplaySizeY(activity);
    }

    private final Rect getWindowVisibleDisplayFrame(Activity activity) {
        Rect rect = new Rect();
        activity.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
        return rect;
    }

    public final int dpToPx(int i10) {
        return (int) (i10 * Resources.getSystem().getDisplayMetrics().density);
    }

    /* JADX WARN: Code restructure failed: missing block: B:3:0x0040, code lost:
    
        r5 = r5.getWindowManager().getDefaultDisplay().getCutout();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int[] getCutoutAndStatusBarInsets(Activity activity) {
        float f10;
        float f11;
        DisplayCutout cutout;
        int safeInsetRight;
        int safeInsetLeft;
        pc.j.e(activity, "activity");
        Rect windowVisibleDisplayFrame = getWindowVisibleDisplayFrame(activity);
        View findViewById = activity.getWindow().findViewById(R.id.content);
        float top = (windowVisibleDisplayFrame.top - findViewById.getTop()) / Resources.getSystem().getDisplayMetrics().density;
        float bottom = (findViewById.getBottom() - windowVisibleDisplayFrame.bottom) / Resources.getSystem().getDisplayMetrics().density;
        if (Build.VERSION.SDK_INT != 29 || cutout == null) {
            f10 = 0.0f;
            f11 = 0.0f;
        } else {
            safeInsetRight = cutout.getSafeInsetRight();
            f10 = safeInsetRight / Resources.getSystem().getDisplayMetrics().density;
            safeInsetLeft = cutout.getSafeInsetLeft();
            f11 = safeInsetLeft / Resources.getSystem().getDisplayMetrics().density;
        }
        return new int[]{a0.I(top), a0.I(bottom), a0.I(f10), a0.I(f11)};
    }

    public final int getFullbleedWindowWidth(Activity activity) {
        pc.j.e(activity, "activity");
        View decorView = activity.getWindow().getDecorView();
        pc.j.d(decorView, "activity.window.decorView");
        return decorView.getWidth();
    }

    public final int getWindowHeight(Activity activity) {
        pc.j.e(activity, "activity");
        return getWindowHeightAPI23Plus(activity);
    }

    public final int getWindowWidth(Activity activity) {
        pc.j.e(activity, "activity");
        return getWindowVisibleDisplayFrame(activity).width();
    }
}
