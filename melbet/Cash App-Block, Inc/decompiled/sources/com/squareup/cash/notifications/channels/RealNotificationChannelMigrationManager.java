package com.squareup.cash.notifications.channels;

import androidx.core.app.NotificationManagerCompat;
import com.squareup.cash.notifications.AndroidNotificationManager;
import java.util.List;
import java.util.Set;
import kotlin.collections.ArraysKt___ArraysKt;

/* loaded from: classes.dex */
public final class RealNotificationChannelMigrationManager {
    public static final Set legacyChannelGroups = ArraysKt___ArraysKt.toSet(new NotificationChannelGroupId[]{NotificationChannelGroupId.Payments, NotificationChannelGroupId.Stock, NotificationChannelGroupId.Bitcoin, NotificationChannelGroupId.Lending, NotificationChannelGroupId.Local, NotificationChannelGroupId.Support, NotificationChannelGroupId.Tax, NotificationChannelGroupId.CashCard, NotificationChannelGroupId.Security});
    public final List contributors;
    public final List notificationChannelsContributors;
    public final AndroidNotificationManager notificationManager;
    public final PushCategoryType pushCategoryType;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class PushCategoryType {
        public static final /* synthetic */ PushCategoryType[] $VALUES;
        public static final PushCategoryType NOTIFICATION_CATEGORY;

        /* JADX INFO: Fake field, exist only in values array */
        PushCategoryType EF0;

        static {
            PushCategoryType pushCategoryType = new PushCategoryType("LEGACY_CATEGORY", 0);
            PushCategoryType pushCategoryType2 = new PushCategoryType("NOTIFICATION_CATEGORY", 1);
            NOTIFICATION_CATEGORY = pushCategoryType2;
            $VALUES = new PushCategoryType[]{pushCategoryType, pushCategoryType2};
        }

        public static PushCategoryType valueOf(String str) {
            return (PushCategoryType) Enum.valueOf(PushCategoryType.class, str);
        }

        public static PushCategoryType[] values() {
            return (PushCategoryType[]) $VALUES.clone();
        }
    }

    public RealNotificationChannelMigrationManager(AndroidNotificationManager androidNotificationManager, List list) {
        androidNotificationManager.getClass();
        list.getClass();
        this.notificationManager = androidNotificationManager;
        this.notificationChannelsContributors = list;
        this.pushCategoryType = PushCategoryType.NOTIFICATION_CATEGORY;
        this.contributors = list;
    }

    public final void removeUnusedChannels() {
        for (NotificationChannelGroupId notificationChannelGroupId : legacyChannelGroups) {
            AndroidNotificationManager androidNotificationManager = this.notificationManager;
            androidNotificationManager.getClass();
            NotificationManagerCompat notificationManagerCompat = androidNotificationManager.notificationManagerCompat;
            notificationChannelGroupId.getClass();
            String str = notificationChannelGroupId.id;
            if (notificationManagerCompat.getNotificationChannelGroup(str) != null) {
                notificationManagerCompat.deleteNotificationChannelGroup(str);
            }
        }
    }
}
