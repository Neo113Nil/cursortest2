package D;

import android.app.Notification;

/* loaded from: classes.dex */
public abstract class G {
    public static Notification.Action.Builder a(Notification.Action.Builder builder, boolean z8) {
        return builder.setAuthenticationRequired(z8);
    }

    public static Notification.Builder b(Notification.Builder builder, int i) {
        return builder.setForegroundServiceBehavior(i);
    }
}
