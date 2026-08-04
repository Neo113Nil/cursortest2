package com.gamericefishpro.space.pf;

import android.app.Notification;
import com.gamericefishpro.space.mf.d;
import com.gamericefishpro.space.r3.i;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public interface c {
    void createGenericPendingIntentsForGroup(i iVar, com.gamericefishpro.space.qf.a aVar, JSONObject jSONObject, String str, int i);

    Object createGrouplessSummaryNotification(d dVar, com.gamericefishpro.space.qf.a aVar, int i, int i2, com.gamericefishpro.space.th.a aVar2);

    Notification createSingleNotificationBeforeSummaryBuilder(d dVar, i iVar);

    Object createSummaryNotification(d dVar, com.gamericefishpro.space.qf.b.a aVar, int i, com.gamericefishpro.space.th.a aVar2);

    Object updateSummaryNotification(d dVar, com.gamericefishpro.space.th.a aVar);
}
