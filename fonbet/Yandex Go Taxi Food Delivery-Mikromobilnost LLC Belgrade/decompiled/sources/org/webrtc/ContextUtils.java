package org.webrtc;

import android.content.Context;
import defpackage.ny61;

/* loaded from: classes4.dex */
public class ContextUtils {
    private static final String TAG = "ContextUtils";
    private static Context applicationContext;

    @Deprecated
    public static Context getApplicationContext() {
        return applicationContext;
    }

    public static void initialize(Context context) {
        if (context != null) {
            applicationContext = context;
        } else {
            ny61.g("Application context cannot be null for ContextUtils.initialize.");
        }
    }
}
