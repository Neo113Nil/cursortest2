package com.gamericefishpro.space.tf;

import android.app.Activity;
import com.gamericefishpro.space.mf.d;
import com.gamericefishpro.space.ve.h;
import com.gamericefishpro.space.ve.j;
import com.gamericefishpro.space.ve.k;
import com.gamericefishpro.space.ve.m;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public interface b {
    void addExternalClickListener(h hVar);

    void addExternalForegroundLifecycleListener(j jVar);

    Object canOpenNotification(Activity activity, JSONObject jSONObject, com.gamericefishpro.space.th.a aVar);

    Object canReceiveNotification(JSONObject jSONObject, com.gamericefishpro.space.th.a aVar);

    void externalNotificationWillShowInForeground(m mVar);

    void externalRemoteNotificationReceived(k kVar);

    Object notificationOpened(Activity activity, JSONArray jSONArray, com.gamericefishpro.space.th.a aVar);

    Object notificationReceived(d dVar, com.gamericefishpro.space.th.a aVar);

    void removeExternalClickListener(h hVar);

    void removeExternalForegroundLifecycleListener(j jVar);

    void setInternalNotificationLifecycleCallback(a aVar);
}
