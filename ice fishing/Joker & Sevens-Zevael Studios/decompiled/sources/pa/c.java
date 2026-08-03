package pa;

import android.app.Notification;
import com.onesignal.notifications.internal.display.impl.b;
import na.d;
import org.json.JSONObject;
import x2.i;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public interface c {
    void createGenericPendingIntentsForGroup(i iVar, com.onesignal.notifications.internal.display.impl.a aVar, JSONObject jSONObject, String str, int i10);

    Object createGrouplessSummaryNotification(d dVar, com.onesignal.notifications.internal.display.impl.a aVar, int i10, int i11, fc.d dVar2);

    Notification createSingleNotificationBeforeSummaryBuilder(d dVar, i iVar);

    Object createSummaryNotification(d dVar, b.a aVar, int i10, fc.d dVar2);

    Object updateSummaryNotification(d dVar, fc.d dVar2);
}
