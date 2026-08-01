package com.onesignal.common;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public final class c {
    public static final c INSTANCE = new c();
    private static final int MARGIN_ERROR_PX_SIZE = m.INSTANCE.dpToPx(24);

    private c() {
    }

    public final String getCarrierName(Context appContext) {
        kotlin.jvm.internal.h.e(appContext, "appContext");
        try {
            Object systemService = appContext.getSystemService("phone");
            kotlin.jvm.internal.h.c(systemService, "null cannot be cast to non-null type android.telephony.TelephonyManager");
            String networkOperatorName = ((TelephonyManager) systemService).getNetworkOperatorName();
            if ("".equals(networkOperatorName)) {
                return null;
            }
            return networkOperatorName;
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    public final Integer getNetType(Context appContext) {
        kotlin.jvm.internal.h.e(appContext, "appContext");
        Object systemService = appContext.getSystemService("connectivity");
        kotlin.jvm.internal.h.c(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) systemService).getActiveNetworkInfo();
        if (activeNetworkInfo == null) {
            return null;
        }
        int type = activeNetworkInfo.getType();
        return (type == 1 || type == 9) ? 0 : 1;
    }

    public final boolean isKeyboardUp(WeakReference<Activity> activityWeakReference) {
        View view;
        boolean isVisible;
        kotlin.jvm.internal.h.e(activityWeakReference, "activityWeakReference");
        DisplayMetrics displayMetrics = new DisplayMetrics();
        Rect rect = new Rect();
        if (activityWeakReference.get() != null) {
            Activity activity = activityWeakReference.get();
            kotlin.jvm.internal.h.b(activity);
            Window window = activity.getWindow();
            view = window.getDecorView();
            view.getWindowVisibleDisplayFrame(rect);
            window.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        } else {
            view = null;
        }
        if (view == null) {
            return false;
        }
        if (Build.VERSION.SDK_INT < 30) {
            return displayMetrics.heightPixels - rect.bottom > MARGIN_ERROR_PX_SIZE;
        }
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return false;
        }
        isVisible = rootWindowInsets.isVisible(8);
        return isVisible;
    }
}
