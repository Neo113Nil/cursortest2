package oa;

import java.util.List;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public interface d {
    Object clearOldestOverLimitFallback(int i10, int i11, fc.d dVar);

    Object createNotification(String str, String str2, String str3, boolean z10, boolean z11, int i10, String str4, String str5, long j3, String str6, fc.d dVar);

    Object createSummaryNotification(int i10, String str, fc.d dVar);

    Object deleteExpiredNotifications(fc.d dVar);

    Object doesNotificationExist(String str, fc.d dVar);

    Object getAndroidIdForGroup(String str, boolean z10, fc.d dVar);

    Object getAndroidIdFromCollapseKey(String str, fc.d dVar);

    Object getGroupId(int i10, fc.d dVar);

    Object listNotificationsForGroup(String str, fc.d dVar);

    Object listNotificationsForOutstanding(List<Integer> list, fc.d dVar);

    Object markAsConsumed(int i10, boolean z10, String str, boolean z11, fc.d dVar);

    Object markAsDismissed(int i10, fc.d dVar);

    Object markAsDismissedForGroup(String str, fc.d dVar);

    Object markAsDismissedForOutstanding(fc.d dVar);
}
