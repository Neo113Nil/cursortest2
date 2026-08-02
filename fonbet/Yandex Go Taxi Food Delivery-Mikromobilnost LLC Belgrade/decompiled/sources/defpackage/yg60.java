package defpackage;

import android.content.Context;
import android.content.Intent;
import ru.yandex.taxi.order.NotificationBroadcastReceiver;

/* loaded from: classes6.dex */
public final class yg60 {
    public static Intent a(Context context, String str, String str2) {
        return new Intent(context, (Class<?>) NotificationBroadcastReceiver.class).setAction(str + str2);
    }

    public static Intent b(Context context, String str, String str2, String str3, String str4, String str5) {
        return a(context, str, str3).putExtra("PARAM_ORDER_ID", str).putExtra("PARAM_NOTIFICATION_TYPE", str3).putExtra("PARAM_TITLE", str4).putExtra("PARAM_MESSAGE", str5).putExtra("PARAM_NOTIFICATION_GROUP", str2);
    }
}
