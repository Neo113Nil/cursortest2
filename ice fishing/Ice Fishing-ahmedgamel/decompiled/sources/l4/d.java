package l4;

import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.graphics.drawable.Drawable;
import android.media.AudioFocusRequest;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class d {
    public static /* synthetic */ NotificationChannel b() {
        return new NotificationChannel("restored_OS_notifications", "Restored", 2);
    }

    public static /* bridge */ /* synthetic */ NotificationChannel d(Object obj) {
        return (NotificationChannel) obj;
    }

    public static /* synthetic */ NotificationChannelGroup e(String str, String str2) {
        return new NotificationChannelGroup(str, str2);
    }

    public static /* synthetic */ AudioFocusRequest.Builder f() {
        return new AudioFocusRequest.Builder(2);
    }

    public static /* bridge */ /* synthetic */ boolean v(Drawable drawable) {
        return drawable instanceof AdaptiveIconDrawable;
    }

    public static /* synthetic */ NotificationChannel w() {
        return new NotificationChannel("fcm_fallback_notification_channel", "Miscellaneous", 3);
    }
}
