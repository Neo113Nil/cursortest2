package com.gamericefishpro.space.pf;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.Bitmap;
import com.gamericefishpro.space.mf.d;
import com.gamericefishpro.space.r3.i;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public interface a {
    void addNotificationActionButtons(JSONObject jSONObject, com.gamericefishpro.space.qf.a aVar, i iVar, int i, String str);

    void addXiaomiSettings(com.gamericefishpro.space.qf.b.a aVar, Notification notification);

    com.gamericefishpro.space.qf.b.a getBaseOneSignalNotificationBuilder(d dVar);

    Bitmap getDefaultLargeIcon();

    int getDefaultSmallIconId();

    int getGroupAlertBehavior();

    Intent getNewBaseDismissIntent(int i);

    PendingIntent getNewDismissActionPendingIntent(int i, Intent intent);

    CharSequence getTitle(JSONObject jSONObject);

    void removeNotifyOptions(i iVar);
}
