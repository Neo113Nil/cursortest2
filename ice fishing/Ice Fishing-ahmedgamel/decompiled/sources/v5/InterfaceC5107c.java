package v5;

import D.u;
import android.app.Notification;
import com.onesignal.notifications.internal.display.impl.b;
import org.json.JSONObject;
import t5.d;
import z7.InterfaceC5240d;

/* renamed from: v5.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC5107c {
    void createGenericPendingIntentsForGroup(u uVar, com.onesignal.notifications.internal.display.impl.a aVar, JSONObject jSONObject, String str, int i);

    Object createGrouplessSummaryNotification(d dVar, com.onesignal.notifications.internal.display.impl.a aVar, int i, int i4, InterfaceC5240d interfaceC5240d);

    Notification createSingleNotificationBeforeSummaryBuilder(d dVar, u uVar);

    Object createSummaryNotification(d dVar, b.a aVar, int i, InterfaceC5240d interfaceC5240d);

    Object updateSummaryNotification(d dVar, InterfaceC5240d interfaceC5240d);
}
