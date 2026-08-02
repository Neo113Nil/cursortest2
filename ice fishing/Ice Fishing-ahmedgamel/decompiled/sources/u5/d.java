package u5;

import java.util.List;
import z7.InterfaceC5240d;

/* loaded from: classes2.dex */
public interface d {
    Object clearOldestOverLimitFallback(int i, int i4, InterfaceC5240d interfaceC5240d);

    Object createNotification(String str, String str2, String str3, boolean z6, boolean z9, int i, String str4, String str5, long j6, String str6, InterfaceC5240d interfaceC5240d);

    Object createSummaryNotification(int i, String str, InterfaceC5240d interfaceC5240d);

    Object deleteExpiredNotifications(InterfaceC5240d interfaceC5240d);

    Object doesNotificationExist(String str, InterfaceC5240d interfaceC5240d);

    Object getAndroidIdForGroup(String str, boolean z6, InterfaceC5240d interfaceC5240d);

    Object getAndroidIdFromCollapseKey(String str, InterfaceC5240d interfaceC5240d);

    Object getGroupId(int i, InterfaceC5240d interfaceC5240d);

    Object listNotificationsForGroup(String str, InterfaceC5240d interfaceC5240d);

    Object listNotificationsForOutstanding(List<Integer> list, InterfaceC5240d interfaceC5240d);

    Object markAsConsumed(int i, boolean z6, String str, boolean z9, InterfaceC5240d interfaceC5240d);

    Object markAsDismissed(int i, InterfaceC5240d interfaceC5240d);

    Object markAsDismissedForGroup(String str, InterfaceC5240d interfaceC5240d);

    Object markAsDismissedForOutstanding(InterfaceC5240d interfaceC5240d);
}
