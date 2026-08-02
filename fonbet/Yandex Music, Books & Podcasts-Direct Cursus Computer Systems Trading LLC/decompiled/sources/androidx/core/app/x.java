package androidx.core.app;

import android.app.Notification;
import android.app.NotificationChannelGroup;
import android.app.NotificationManager;
import android.app.Person;

/* loaded from: classes.dex */
public abstract class x {
    public static void a(Notification.Builder builder, Person person) {
        builder.addPerson(person);
    }

    public static void b(NotificationChannelGroup notificationChannelGroup) {
        notificationChannelGroup.getDescription();
    }

    public static NotificationChannelGroup c(NotificationManager notificationManager) {
        return notificationManager.getNotificationChannelGroup("passport_channel_group_id");
    }

    public static boolean d(NotificationChannelGroup notificationChannelGroup) {
        return notificationChannelGroup.isBlocked();
    }

    public static void e(Notification.Action.Builder builder) {
        builder.setSemanticAction(0);
    }

    public static Person f(z0 z0Var) {
        return new Person.Builder().setName(z0Var.a).setIcon(z0Var.b.h(null)).setUri(null).setKey(null).setBot(false).setImportant(false).build();
    }
}
