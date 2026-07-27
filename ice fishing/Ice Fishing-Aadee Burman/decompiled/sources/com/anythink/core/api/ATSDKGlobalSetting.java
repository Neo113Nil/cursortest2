package com.anythink.core.api;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.anythink.core.common.a;
import com.anythink.core.common.d.t;
import com.anythink.core.common.q;
import com.anythink.core.common.v.r;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public class ATSDKGlobalSetting {
    public static long mDelayInspectTime = 0;
    private static boolean mDenyApi_getRunningAppProcesses = false;
    private static volatile Drawable mDirectlySplashAdCTAButtongBgDrawable = null;
    private static volatile String mDirectlySplashAdShakeIconString = null;
    private static WeakReference<View> mDirectlySplashCTAButton = null;
    private static Boolean mDirectlySplashMuteIconVisible = null;
    private static WeakReference<View> mDirectlySplashShakeButton = null;
    public static long mInspectInterval = 10000;
    private static final List<String> sensorNetworkList = new CopyOnWriteArrayList();
    public static SHAKE_TYPE shakeControlType = SHAKE_TYPE.DEFAULT_NETWORK;
    public static boolean isHideNavAndStatusBar = false;
    public static boolean enableGetDeviceInfoInBg = false;

    public enum SHAKE_TYPE {
        DEFAULT_NETWORK,
        FORBID_ALL,
        ALLOW_ALL,
        ALLOW_NETWORK
    }

    public static void clearCache(String str, int i) {
        a.a().a(str, i, true, 7);
    }

    public static ATCustomContentResult customContentResultReviewByInfos(List<ATCustomContentInfo> list) {
        return r.b(list);
    }

    public static ATCustomContentInfo customContentReviewResult(List<ATCustomContentInfo> list) {
        return r.a(list);
    }

    public static Drawable getDirectlySplashAdCTAButtongBgDrawable() {
        return mDirectlySplashAdCTAButtongBgDrawable;
    }

    public static String getDirectlySplashAdShakeIconString() {
        return mDirectlySplashAdShakeIconString;
    }

    public static View getDirectlySplashCTAButton() {
        View view;
        WeakReference<View> weakReference = mDirectlySplashCTAButton;
        if (weakReference == null || (view = weakReference.get()) == null) {
            return null;
        }
        return view;
    }

    public static Boolean getDirectlySplashMuteIconVisible() {
        return mDirectlySplashMuteIconVisible;
    }

    public static View getDirectlySplashShakeButton() {
        View view;
        WeakReference<View> weakReference = mDirectlySplashShakeButton;
        if (weakReference == null || (view = weakReference.get()) == null) {
            return null;
        }
        return view;
    }

    public static boolean isDenyApi_getRunningAppProcesses() {
        return mDenyApi_getRunningAppProcesses;
    }

    public static Boolean isShakeEnabled(int i) {
        SHAKE_TYPE shake_type = shakeControlType;
        if (shake_type == SHAKE_TYPE.ALLOW_ALL) {
            return Boolean.TRUE;
        }
        if (shake_type == SHAKE_TYPE.FORBID_ALL) {
            return Boolean.FALSE;
        }
        if (shake_type == SHAKE_TYPE.ALLOW_NETWORK) {
            return Boolean.valueOf(sensorNetworkList.contains(String.valueOf(i)));
        }
        return null;
    }

    public static void needTraminiInfo(Context context, boolean z3) {
        q.a(context).a(z3);
    }

    public static void setDenyApi_getRunningAppProcesses(boolean z3) {
        mDenyApi_getRunningAppProcesses = z3;
    }

    public static void setDirectlySplashAdCTAButtongBgDrawable(Drawable drawable) {
        mDirectlySplashAdCTAButtongBgDrawable = drawable;
    }

    public static void setDirectlySplashAdShakeIconString(String str) {
        mDirectlySplashAdShakeIconString = str;
    }

    public static void setDirectlySplashCTAButton(View view) {
        if (view != null) {
            mDirectlySplashCTAButton = new WeakReference<>(view);
        }
    }

    public static void setDirectlySplashMuteIconVisible(boolean z3) {
        mDirectlySplashMuteIconVisible = Boolean.valueOf(z3);
    }

    public static void setDirectlySplashShakeButton(View view) {
        if (view != null) {
            mDirectlySplashShakeButton = new WeakReference<>(view);
        }
    }

    public static void setEnableGetDeviceInfoInBg(boolean z3) {
        enableGetDeviceInfoInBg = z3;
    }

    public static void setHideNavAndStatusBar(boolean z3) {
        isHideNavAndStatusBar = z3;
    }

    public static void setShakeControl(SHAKE_TYPE shake_type, List<String> list) {
        try {
            if (shakeControlType != shake_type) {
                t.b();
                t.a(String.valueOf(shake_type.ordinal()), list != null ? list.toString() : new ArrayList().toString());
            }
            shakeControlType = shake_type;
            if (shake_type == SHAKE_TYPE.ALLOW_NETWORK && list != null && !list.isEmpty()) {
                List<String> list2 = sensorNetworkList;
                list2.clear();
                list2.addAll(list);
            }
            t.b().a(isShakeEnabled(66));
        } catch (Throwable unused) {
        }
    }

    public static void clearCache(String str, List<ATAdInfo> list) {
        a.a().a(str, list, true, 7);
    }
}
