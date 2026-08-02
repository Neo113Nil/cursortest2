package D;

import android.app.Notification;

/* loaded from: classes.dex */
public abstract class F {
    public static Notification.Action.Builder a(Notification.Action.Builder builder, boolean z6) {
        return builder.setAuthenticationRequired(z6);
    }

    public static Notification.Builder b(Notification.Builder builder, int i) {
        return builder.setForegroundServiceBehavior(i);
    }
}
