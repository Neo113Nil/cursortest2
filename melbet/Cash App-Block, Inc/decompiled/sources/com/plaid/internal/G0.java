package com.plaid.internal;

import android.app.Application;
import android.provider.Settings;

/* loaded from: classes5.dex */
public final class G0 {
    public static String a(Application application) {
        application.getClass();
        return Settings.Secure.getString(application.getApplicationContext().getContentResolver(), "android_id");
    }
}
