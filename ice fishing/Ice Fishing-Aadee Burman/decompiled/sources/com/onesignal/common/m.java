package com.onesignal.common;

import android.R;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.view.DisplayCutout;
import android.view.View;
import android.view.WindowInsets;

/* loaded from: classes2.dex */
public final class m {
    public static final m INSTANCE = new m();

    private m() {
    }

    private final int getDisplaySizeY(Activity activity) {
        Point point = new Point();
        activity.getWindowManager().getDefaultDisplay().getSize(point);
        return point.y;
    }

    @TargetApi(23)
    private final int getWindowHeightAPI23Plus(Activity activity) {
        View decorView = activity.getWindow().getDecorView();
        kotlin.jvm.internal.h.d(decorView, "getDecorView(...)");
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

    public final int dpToPx(int i) {
        return (int) (i * Resources.getSystem().getDisplayMetrics().density);
    }

    /* JADX WARN: Code restructure failed: missing block: B:3:0x0040, code lost:
    
        r5 = r5.getWindowManager().getDefaultDisplay().getCutout();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int[] getCutoutAndStatusBarInsets(Activity activity) {
        float f3;
        float f9;
        DisplayCutout cutout;
        int safeInsetRight;
        int safeInsetLeft;
        kotlin.jvm.internal.h.e(activity, "activity");
        Rect windowVisibleDisplayFrame = getWindowVisibleDisplayFrame(activity);
        View findViewById = activity.getWindow().findViewById(R.id.content);
        float top = (windowVisibleDisplayFrame.top - findViewById.getTop()) / Resources.getSystem().getDisplayMetrics().density;
        float bottom = (findViewById.getBottom() - windowVisibleDisplayFrame.bottom) / Resources.getSystem().getDisplayMetrics().density;
        if (Build.VERSION.SDK_INT != 29 || cutout == null) {
            f3 = 0.0f;
            f9 = 0.0f;
        } else {
            safeInsetRight = cutout.getSafeInsetRight();
            f3 = safeInsetRight / Resources.getSystem().getDisplayMetrics().density;
            safeInsetLeft = cutout.getSafeInsetLeft();
            f9 = safeInsetLeft / Resources.getSystem().getDisplayMetrics().density;
        }
        return new int[]{com.bumptech.glide.h.k(top), com.bumptech.glide.h.k(bottom), com.bumptech.glide.h.k(f3), com.bumptech.glide.h.k(f9)};
    }

    public final int getFullbleedWindowWidth(Activity activity) {
        kotlin.jvm.internal.h.e(activity, "activity");
        View decorView = activity.getWindow().getDecorView();
        kotlin.jvm.internal.h.d(decorView, "getDecorView(...)");
        return decorView.getWidth();
    }

    public final int getWindowHeight(Activity activity) {
        kotlin.jvm.internal.h.e(activity, "activity");
        return getWindowHeightAPI23Plus(activity);
    }

    public final int getWindowWidth(Activity activity) {
        kotlin.jvm.internal.h.e(activity, "activity");
        return getWindowVisibleDisplayFrame(activity).width();
    }
}
