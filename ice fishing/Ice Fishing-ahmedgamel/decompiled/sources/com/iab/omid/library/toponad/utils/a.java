package com.iab.omid.library.toponad.utils;

import android.app.UiModeManager;
import android.content.Context;
import com.iab.omid.library.toponad.adsession.DeviceCategory;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static UiModeManager f36289a;

    public static DeviceCategory a() {
        UiModeManager uiModeManager = f36289a;
        if (uiModeManager == null) {
            return DeviceCategory.OTHER;
        }
        int currentModeType = uiModeManager.getCurrentModeType();
        return currentModeType != 1 ? currentModeType != 4 ? DeviceCategory.OTHER : DeviceCategory.CTV : DeviceCategory.MOBILE;
    }

    public static void a(Context context) {
        if (context != null) {
            f36289a = (UiModeManager) context.getSystemService("uimode");
        }
    }
}
