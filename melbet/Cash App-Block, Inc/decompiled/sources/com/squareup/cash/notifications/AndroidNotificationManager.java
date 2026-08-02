package com.squareup.cash.notifications;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.app.NotificationManager;
import android.content.Context;
import android.service.notification.StatusBarNotification;
import androidx.compose.runtime.saveable.ListSaverKt;
import androidx.core.app.NotificationManagerCompat;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.gms.dynamite.zzo;
import com.squareup.cash.R;
import com.squareup.cash.notifications.channels.NewNotificationChannel;
import com.squareup.cash.notifications.channels.NewNotificationChannel$SoundType$DeviceDefault;
import com.squareup.cash.notifications.channels.NewNotificationChannel$SoundType$Silent;
import com.squareup.cash.notifications.channels.NotificationChannelGroupId;
import com.squareup.cash.notifications.channels.NotificationChannelId;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import timber.log.Timber;

/* loaded from: classes.dex */
public final class AndroidNotificationManager {
    public final Context context;
    public final NotificationManager notificationManager;
    public final NotificationManagerCompat notificationManagerCompat;

    public AndroidNotificationManager(Context context) {
        this.context = context;
        Object systemService = context.getSystemService((Class<Object>) NotificationManager.class);
        systemService.getClass();
        this.notificationManager = (NotificationManager) systemService;
        NotificationManagerCompat from = NotificationManagerCompat.from(context);
        from.getClass();
        this.notificationManagerCompat = from;
    }

    public final void cancelAll(int i) {
        NotificationManager notificationManager = this.notificationManager;
        StatusBarNotification[] activeNotifications = notificationManager.getActiveNotifications();
        activeNotifications.getClass();
        ArrayList arrayList = new ArrayList();
        for (StatusBarNotification statusBarNotification : activeNotifications) {
            if (statusBarNotification.getId() == i) {
                arrayList.add(statusBarNotification);
            }
        }
        StatusBarNotification statusBarNotification2 = (StatusBarNotification) CollectionsKt.firstOrNull((List) arrayList);
        String groupKey = statusBarNotification2 != null ? statusBarNotification2.getGroupKey() : null;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            StatusBarNotification statusBarNotification3 = (StatusBarNotification) it.next();
            notificationManager.cancel(statusBarNotification3.getTag(), statusBarNotification3.getId());
        }
        if (groupKey == null) {
            return;
        }
        StatusBarNotification[] activeNotifications2 = notificationManager.getActiveNotifications();
        activeNotifications2.getClass();
        ArrayList arrayList2 = new ArrayList();
        for (StatusBarNotification statusBarNotification4 : activeNotifications2) {
            if (Intrinsics.areEqual(statusBarNotification4.getGroupKey(), groupKey)) {
                arrayList2.add(statusBarNotification4);
            }
        }
        if (arrayList2.size() != 1) {
            return;
        }
        StatusBarNotification statusBarNotification5 = (StatusBarNotification) CollectionsKt.first((List) arrayList2);
        if ((statusBarNotification5.getNotification().flags & 512) != 0) {
            notificationManager.cancel(statusBarNotification5.getTag(), statusBarNotification5.getId());
        }
    }

    public final void createOrUpdateChannel(NewNotificationChannel newNotificationChannel) {
        NotificationChannelGroup notificationChannelGroup;
        String string2;
        if (newNotificationChannel.getId().getGroup() != NotificationChannelGroupId.Other) {
            String str = newNotificationChannel.getId().getGroup().id;
            int ordinal = newNotificationChannel.getId().getGroup().ordinal();
            Context context = this.context;
            switch (ordinal) {
                case 0:
                    string2 = context.getString(R.string.notificationchannelgroup_stocks_owned);
                    break;
                case 1:
                    string2 = context.getString(R.string.notificationchannelgroup_stocks_followed);
                    break;
                case 2:
                    string2 = context.getString(R.string.notificationchannelgroup_news_and_exclusives);
                    break;
                case 3:
                    string2 = context.getString(R.string.notificationchannelgroup_payments);
                    break;
                case 4:
                    string2 = context.getString(R.string.notificationchannelgroup_stock);
                    break;
                case 5:
                    string2 = context.getString(R.string.notificationchannelgroup_bitcoin);
                    break;
                case 6:
                    string2 = context.getString(R.string.notificationchannelgroup_lending);
                    break;
                case 7:
                    string2 = context.getString(R.string.notificationchannelgroup_local);
                    break;
                case 8:
                    string2 = context.getString(R.string.notificationchannelgroup_support);
                    break;
                case 9:
                    string2 = context.getString(R.string.notificationchannelgroup_tax);
                    break;
                case 10:
                    string2 = context.getString(R.string.notificationchannelgroup_cash_card);
                    break;
                case 11:
                    string2 = context.getString(R.string.notificationchannelgroup_account_security);
                    break;
                case 12:
                    a$$ExternalSyntheticBUOutline0.m$1("unreachable code");
                    return;
                default:
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return;
            }
            notificationChannelGroup = new NotificationChannelGroup(str, string2);
        } else {
            notificationChannelGroup = null;
        }
        NotificationManager notificationManager = this.notificationManager;
        if (notificationChannelGroup != null) {
            notificationManager.createNotificationChannelGroup(notificationChannelGroup);
        }
        NotificationChannel notificationChannel = new NotificationChannel(newNotificationChannel.getId().getId(), newNotificationChannel.getLabel(), 3);
        notificationChannel.enableLights(true);
        notificationChannel.enableVibration(true);
        ListSaverKt soundType = newNotificationChannel.getSoundType();
        if (!(soundType instanceof NewNotificationChannel$SoundType$DeviceDefault)) {
            if (!(soundType instanceof NewNotificationChannel$SoundType$Silent)) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return;
            }
            notificationChannel.setSound(null, null);
        }
        notificationChannel.setGroup(notificationChannelGroup != null ? notificationChannelGroup.getId() : null);
        notificationManager.createNotificationChannel(notificationChannel);
    }

    public final zzo getNotificationChannel(NotificationChannelId notificationChannelId) {
        notificationChannelId.getClass();
        NotificationChannel notificationChannel = this.notificationManagerCompat.getNotificationChannel(notificationChannelId.getId());
        if (notificationChannel == null) {
            return null;
        }
        String id = notificationChannel.getId();
        id.getClass();
        CharSequence name = notificationChannel.getName();
        name.getClass();
        int importance = notificationChannel.getImportance();
        notificationChannel.canShowBadge();
        notificationChannel.shouldVibrate();
        return new zzo(id, name, importance);
    }

    public final void notify(String str, int i, Notification notification) {
        notification.getClass();
        if (this.notificationManagerCompat.getNotificationChannel(notification.getChannelId()) == null) {
            Timber.Forest.e(new IllegalStateException(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Posting a notification with a non-existent channel: ", notification.getChannelId(), ". Android will silently discard this notification.")));
        }
        this.notificationManager.notify(str, i, notification);
    }
}
