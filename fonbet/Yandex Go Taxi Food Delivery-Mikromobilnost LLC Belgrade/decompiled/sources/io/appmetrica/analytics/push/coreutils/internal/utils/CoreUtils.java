package io.appmetrica.analytics.push.coreutils.internal.utils;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import io.appmetrica.analytics.push.coreutils.internal.model.BasePushMessage;
import java.util.Map;

/* loaded from: classes9.dex */
public class CoreUtils {
    public static <T> void accessSystemServiceSafely(ConsumerWithThrowable<T> consumerWithThrowable, T t, String str, String str2) {
        if (t == null) {
            TrackersHub.getInstance().reportEvent(str2 + " is null.");
            return;
        }
        try {
            consumerWithThrowable.consume(t);
        } catch (Throwable th) {
            TrackersHub.getInstance().reportError("Exception while " + str, th);
        }
    }

    @Deprecated
    public static String extractRootElement(Bundle bundle) {
        return new BasePushMessage(bundle).getRootString();
    }

    public static Bundle fromMapToBundle(Map<String, String> map) {
        Bundle bundle = new Bundle();
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                bundle.putString(entry.getKey(), entry.getValue());
            }
        }
        return bundle;
    }

    public static int getIdentifierForType(Context context, String str, String str2) {
        return context.getResources().getIdentifier(str, str2, context.getPackageName());
    }

    public static Bundle getMetaData(Context context) {
        try {
            return context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
        } catch (Exception unused) {
            return null;
        }
    }

    public static String getStringFromMetaData(Context context, String str) {
        Bundle metaData = getMetaData(context);
        String string = metaData == null ? null : metaData.getString(str);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        return string;
    }

    public static String getStringFromResources(Context context, String str) {
        try {
            return context.getString(getIdentifierForType(context, str, "string"));
        } catch (Resources.NotFoundException unused) {
            return null;
        }
    }

    public static String getStringOrOtherFromMetaData(Context context, String str) {
        Bundle metaData = getMetaData(context);
        Object obj = (metaData != null && metaData.containsKey(str)) ? metaData.get(str) : null;
        if (obj != null) {
            return obj.toString();
        }
        return null;
    }

    public static boolean isEmpty(String str) {
        return str == null || str.length() == 0;
    }

    public static boolean isNotEmpty(String str) {
        return !isEmpty(str);
    }

    public static boolean isNotificationRelatedToSDK(Bundle bundle) {
        return new BasePushMessage(bundle).getIsOwnPush();
    }
}
