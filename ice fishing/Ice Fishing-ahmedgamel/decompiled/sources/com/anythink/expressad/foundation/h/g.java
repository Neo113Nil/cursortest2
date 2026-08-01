package com.anythink.expressad.foundation.h;

import android.content.Context;
import android.content.res.Resources;

/* loaded from: classes.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    private static String f19625a = "DomainSameTool";

    public static boolean a(Context context) {
        if (context == null) {
            return false;
        }
        try {
            Resources resources = context.getResources();
            return resources.getDimensionPixelSize(resources.getIdentifier("navigation_bar_height", "dimen", com.onesignal.core.internal.backend.impl.a.TURBINE_FEATURES_PLATFORM_ANDROID)) > 0;
        } catch (Throwable th) {
            th.getMessage();
            return false;
        }
    }
}
