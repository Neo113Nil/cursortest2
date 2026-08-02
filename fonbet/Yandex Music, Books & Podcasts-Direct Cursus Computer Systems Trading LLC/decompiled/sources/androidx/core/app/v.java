package androidx.core.app;

import android.app.NotificationChannel;

/* loaded from: classes.dex */
public abstract class v {
    public static void a(NotificationChannel notificationChannel) {
        notificationChannel.getConversationId();
    }

    public static void b(NotificationChannel notificationChannel) {
        notificationChannel.getParentChannelId();
    }

    public static void c(NotificationChannel notificationChannel) {
        notificationChannel.isImportantConversation();
    }
}
