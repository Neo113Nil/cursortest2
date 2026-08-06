package o;

import android.app.Notification;
import android.content.Context;

/* loaded from: classes.dex */
public abstract class h {
    public static Notification.Builder a(Context context, String str) {
        return new Notification.Builder(context, str);
    }

    public static Notification.Builder b(Notification.Builder builder, int i2) {
        return builder.setBadgeIconType(i2);
    }

    public static Notification.Builder c(Notification.Builder builder, boolean z2) {
        return builder.setColorized(z2);
    }

    public static Notification.Builder d(Notification.Builder builder, int i2) {
        return builder.setGroupAlertBehavior(i2);
    }

    public static Notification.Builder e(Notification.Builder builder, CharSequence charSequence) {
        return builder.setSettingsText(charSequence);
    }

    public static Notification.Builder f(Notification.Builder builder, String str) {
        return builder.setShortcutId(str);
    }

    public static Notification.Builder g(Notification.Builder builder, long j2) {
        return builder.setTimeoutAfter(j2);
    }
}
