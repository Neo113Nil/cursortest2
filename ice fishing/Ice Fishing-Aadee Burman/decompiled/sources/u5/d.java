package u5;

import java.util.List;
import z7.InterfaceC5267d;

/* loaded from: classes2.dex */
public interface d {
    Object clearOldestOverLimitFallback(int i, int i6, InterfaceC5267d interfaceC5267d);

    Object createNotification(String str, String str2, String str3, boolean z3, boolean z6, int i, String str4, String str5, long j6, String str6, InterfaceC5267d interfaceC5267d);

    Object createSummaryNotification(int i, String str, InterfaceC5267d interfaceC5267d);

    Object deleteExpiredNotifications(InterfaceC5267d interfaceC5267d);

    Object doesNotificationExist(String str, InterfaceC5267d interfaceC5267d);

    Object getAndroidIdForGroup(String str, boolean z3, InterfaceC5267d interfaceC5267d);

    Object getAndroidIdFromCollapseKey(String str, InterfaceC5267d interfaceC5267d);

    Object getGroupId(int i, InterfaceC5267d interfaceC5267d);

    Object listNotificationsForGroup(String str, InterfaceC5267d interfaceC5267d);

    Object listNotificationsForOutstanding(List<Integer> list, InterfaceC5267d interfaceC5267d);

    Object markAsConsumed(int i, boolean z3, String str, boolean z6, InterfaceC5267d interfaceC5267d);

    Object markAsDismissed(int i, InterfaceC5267d interfaceC5267d);

    Object markAsDismissedForGroup(String str, InterfaceC5267d interfaceC5267d);

    Object markAsDismissedForOutstanding(InterfaceC5267d interfaceC5267d);
}
