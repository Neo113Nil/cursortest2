package com.google.mlkit.common.sdkinternal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
import com.squareup.cash.clientroutes.PatternRedaction;

/* loaded from: classes4.dex */
public abstract class CommonUtils {
    public static final PatternRedaction zza = new PatternRedaction("CommonUtils", "");

    public static String getAppVersion(Context context) {
        try {
            return String.valueOf(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode);
        } catch (PackageManager.NameNotFoundException e) {
            String concat = "Exception thrown when trying to get app version ".concat(e.toString());
            PatternRedaction patternRedaction = zza;
            if (!Log.isLoggable(patternRedaction.pattern, 6)) {
                return "";
            }
            Log.e("CommonUtils", patternRedaction.zza(concat));
            return "";
        }
    }
}
