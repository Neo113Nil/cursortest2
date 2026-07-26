package com.adjust.sdk;

import android.content.Context;
import android.provider.Settings;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public class AndroidIdUtil {
    public static String getAndroidId(Context context) {
        return Settings.Secure.getString(context.getContentResolver(), "android_id");
    }
}
