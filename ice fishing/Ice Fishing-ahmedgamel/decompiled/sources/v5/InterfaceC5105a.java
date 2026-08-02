package v5;

import D.u;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.Bitmap;
import com.onesignal.notifications.internal.display.impl.b;
import org.json.JSONObject;
import t5.d;

/* renamed from: v5.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC5105a {
    void addNotificationActionButtons(JSONObject jSONObject, com.onesignal.notifications.internal.display.impl.a aVar, u uVar, int i, String str);

    void addXiaomiSettings(b.a aVar, Notification notification);

    b.a getBaseOneSignalNotificationBuilder(d dVar);

    Bitmap getDefaultLargeIcon();

    int getDefaultSmallIconId();

    int getGroupAlertBehavior();

    Intent getNewBaseDismissIntent(int i);

    PendingIntent getNewDismissActionPendingIntent(int i, Intent intent);

    CharSequence getTitle(JSONObject jSONObject);

    void removeNotifyOptions(u uVar);
}
