package pa;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.Bitmap;
import com.onesignal.notifications.internal.display.impl.b;
import na.d;
import org.json.JSONObject;
import x2.i;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public interface a {
    void addNotificationActionButtons(JSONObject jSONObject, com.onesignal.notifications.internal.display.impl.a aVar, i iVar, int i10, String str);

    void addXiaomiSettings(b.a aVar, Notification notification);

    b.a getBaseOneSignalNotificationBuilder(d dVar);

    Bitmap getDefaultLargeIcon();

    int getDefaultSmallIconId();

    int getGroupAlertBehavior();

    Intent getNewBaseDismissIntent(int i10);

    PendingIntent getNewDismissActionPendingIntent(int i10, Intent intent);

    CharSequence getTitle(JSONObject jSONObject);

    void removeNotifyOptions(i iVar);
}
