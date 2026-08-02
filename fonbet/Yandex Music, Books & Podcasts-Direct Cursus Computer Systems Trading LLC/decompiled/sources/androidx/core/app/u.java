package androidx.core.app;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.app.NotificationManager;
import android.app.RemoteInput;
import android.content.Context;
import java.util.List;

/* loaded from: classes.dex */
public abstract class u {
    public static void A(Notification.Builder builder, long j) {
        builder.setTimeoutAfter(j);
    }

    public static void B(NotificationChannel notificationChannel) {
        notificationChannel.shouldShowLights();
    }

    public static void C(NotificationChannel notificationChannel) {
        notificationChannel.shouldVibrate();
    }

    public static void a(NotificationChannel notificationChannel) {
        notificationChannel.canBypassDnd();
    }

    public static void b(NotificationChannel notificationChannel) {
        notificationChannel.canShowBadge();
    }

    public static Notification.Builder c(Context context, String str) {
        return new Notification.Builder(context, str);
    }

    public static void d(NotificationManager notificationManager, NotificationChannel notificationChannel) {
        notificationManager.createNotificationChannel(notificationChannel);
    }

    public static void e(NotificationManager notificationManager, NotificationChannelGroup notificationChannelGroup) {
        notificationManager.createNotificationChannelGroup(notificationChannelGroup);
    }

    public static void f(NotificationChannel notificationChannel) {
        notificationChannel.getAudioAttributes();
    }

    public static List g(NotificationChannelGroup notificationChannelGroup) {
        return notificationChannelGroup.getChannels();
    }

    public static void h(NotificationChannel notificationChannel) {
        notificationChannel.getDescription();
    }

    public static void i(NotificationChannel notificationChannel) {
        notificationChannel.getGroup();
    }

    public static String j(NotificationChannel notificationChannel) {
        return notificationChannel.getId();
    }

    public static String k(NotificationChannelGroup notificationChannelGroup) {
        return notificationChannelGroup.getId();
    }

    public static int l(NotificationChannel notificationChannel) {
        return notificationChannel.getImportance();
    }

    public static void m(NotificationChannel notificationChannel) {
        notificationChannel.getLightColor();
    }

    public static void n(NotificationChannel notificationChannel) {
        notificationChannel.getLockscreenVisibility();
    }

    public static CharSequence o(NotificationChannelGroup notificationChannelGroup) {
        return notificationChannelGroup.getName();
    }

    public static void p(NotificationChannel notificationChannel) {
        notificationChannel.getName();
    }

    public static NotificationChannel q(NotificationManager notificationManager, String str) {
        return notificationManager.getNotificationChannel(str);
    }

    public static List r(NotificationManager notificationManager) {
        return notificationManager.getNotificationChannels();
    }

    public static void s(NotificationChannel notificationChannel) {
        notificationChannel.getSound();
    }

    public static void t(NotificationChannel notificationChannel) {
        notificationChannel.getVibrationPattern();
    }

    public static void u(RemoteInput.Builder builder, String str) {
        builder.setAllowDataType(str, true);
    }

    public static void v(Notification.Builder builder) {
        builder.setBadgeIconType(0);
    }

    public static void w(Notification.Builder builder, boolean z) {
        builder.setColorized(z);
    }

    public static void x(Notification.Builder builder, int i) {
        builder.setGroupAlertBehavior(i);
    }

    public static void y(Notification.Builder builder) {
        builder.setSettingsText(null);
    }

    public static void z(Notification.Builder builder, String str) {
        builder.setShortcutId(str);
    }
}
