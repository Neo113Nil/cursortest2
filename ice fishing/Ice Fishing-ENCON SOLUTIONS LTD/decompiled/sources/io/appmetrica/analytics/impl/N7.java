package io.appmetrica.analytics.impl;

import android.app.UiModeManager;
import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
import io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils;

/* loaded from: classes.dex */
public abstract class N7 {

    /* renamed from: a, reason: collision with root package name */
    public static final SafePackageManager f4801a = new SafePackageManager();

    public static boolean a(Context context) {
        Object systemService = context.getSystemService("uimode");
        Integer num = (Integer) SystemServiceUtils.accessSystemServiceSafelyOrDefault(systemService instanceof UiModeManager ? (UiModeManager) systemService : null, "getting current mode type", "UiModeManager", null, new H0.b(14));
        boolean z2 = num != null && num.intValue() == 4;
        SafePackageManager safePackageManager = f4801a;
        return z2 || safePackageManager.hasSystemFeature(context, "android.software.leanback") || (AndroidUtils.isApiAchieved(26) ? safePackageManager.hasSystemFeature(context, "android.software.leanback_only") : false);
    }

    public static final Integer a(UiModeManager uiModeManager) {
        return Integer.valueOf(uiModeManager.getCurrentModeType());
    }
}
