package v5;

import D.v;
import android.app.Notification;
import com.onesignal.notifications.internal.display.impl.b;
import org.json.JSONObject;
import t5.d;
import z7.InterfaceC5267d;

/* renamed from: v5.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC5117c {
    void createGenericPendingIntentsForGroup(v vVar, com.onesignal.notifications.internal.display.impl.a aVar, JSONObject jSONObject, String str, int i);

    Object createGrouplessSummaryNotification(d dVar, com.onesignal.notifications.internal.display.impl.a aVar, int i, int i6, InterfaceC5267d interfaceC5267d);

    Notification createSingleNotificationBeforeSummaryBuilder(d dVar, v vVar);

    Object createSummaryNotification(d dVar, b.a aVar, int i, InterfaceC5267d interfaceC5267d);

    Object updateSummaryNotification(d dVar, InterfaceC5267d interfaceC5267d);
}
