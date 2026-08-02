package com.yandex.metrica.push.core.notification;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.yandex.metrica.push.YandexMetricaPush;
import com.yandex.metrica.push.common.utils.CoreUtils;

/* loaded from: classes3.dex */
public class a {
    public Intent a(Context context, String str) {
        Intent intent;
        if (CoreUtils.isEmpty(str)) {
            try {
                intent = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
                if (intent != null && intent.getComponent() != null) {
                    try {
                        intent = new Intent(context, Class.forName(intent.getComponent().getClassName()));
                    } catch (ClassNotFoundException unused) {
                    }
                    try {
                        intent.setAction(YandexMetricaPush.OPEN_DEFAULT_ACTIVITY_ACTION);
                    } catch (Exception unused2) {
                    }
                }
            } catch (Exception unused3) {
            }
            intent = null;
        } else {
            intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
        }
        if (intent != null) {
            intent.addFlags(268435456);
            intent.addFlags(67108864);
        }
        return intent;
    }
}
