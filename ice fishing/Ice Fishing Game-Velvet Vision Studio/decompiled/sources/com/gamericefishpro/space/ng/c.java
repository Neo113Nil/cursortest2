package com.gamericefishpro.space.ng;

import org.json.JSONArray;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public interface c {
    void cacheIAMInfluenceType(com.gamericefishpro.space.mg.d dVar);

    void cacheNotificationInfluenceType(com.gamericefishpro.space.mg.d dVar);

    void cacheNotificationOpenId(String str);

    String getCachedNotificationOpenId();

    com.gamericefishpro.space.mg.d getIamCachedInfluenceType();

    int getIamIndirectAttributionWindow();

    int getIamLimit();

    JSONArray getLastIAMsReceivedData();

    JSONArray getLastNotificationsReceivedData();

    com.gamericefishpro.space.mg.d getNotificationCachedInfluenceType();

    int getNotificationIndirectAttributionWindow();

    int getNotificationLimit();

    boolean isDirectInfluenceEnabled();

    boolean isIndirectInfluenceEnabled();

    boolean isUnattributedInfluenceEnabled();

    void saveIAMs(JSONArray jSONArray);

    void saveNotifications(JSONArray jSONArray);
}
