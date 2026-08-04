package com.gamericefishpro.space.nf;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public interface d {
    Object clearOldestOverLimitFallback(int i, int i2, com.gamericefishpro.space.th.a aVar);

    Object createNotification(String str, String str2, String str3, boolean z, boolean z2, int i, String str4, String str5, long j, String str6, com.gamericefishpro.space.th.a aVar);

    Object createSummaryNotification(int i, String str, com.gamericefishpro.space.th.a aVar);

    Object deleteExpiredNotifications(com.gamericefishpro.space.th.a aVar);

    Object doesNotificationExist(String str, com.gamericefishpro.space.th.a aVar);

    Object getAndroidIdForGroup(String str, boolean z, com.gamericefishpro.space.th.a aVar);

    Object getAndroidIdFromCollapseKey(String str, com.gamericefishpro.space.th.a aVar);

    Object getGroupId(int i, com.gamericefishpro.space.th.a aVar);

    Object listNotificationsForGroup(String str, com.gamericefishpro.space.th.a aVar);

    Object listNotificationsForOutstanding(List<Integer> list, com.gamericefishpro.space.th.a aVar);

    Object markAsConsumed(int i, boolean z, String str, boolean z2, com.gamericefishpro.space.th.a aVar);

    Object markAsDismissed(int i, com.gamericefishpro.space.th.a aVar);

    Object markAsDismissedForGroup(String str, com.gamericefishpro.space.th.a aVar);

    Object markAsDismissedForOutstanding(com.gamericefishpro.space.th.a aVar);
}
