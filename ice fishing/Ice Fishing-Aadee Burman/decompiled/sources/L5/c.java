package L5;

import org.json.JSONArray;

/* loaded from: classes2.dex */
public interface c {
    void cacheIAMInfluenceType(K5.d dVar);

    void cacheNotificationInfluenceType(K5.d dVar);

    void cacheNotificationOpenId(String str);

    String getCachedNotificationOpenId();

    K5.d getIamCachedInfluenceType();

    int getIamIndirectAttributionWindow();

    int getIamLimit();

    JSONArray getLastIAMsReceivedData();

    JSONArray getLastNotificationsReceivedData();

    K5.d getNotificationCachedInfluenceType();

    int getNotificationIndirectAttributionWindow();

    int getNotificationLimit();

    boolean isDirectInfluenceEnabled();

    boolean isIndirectInfluenceEnabled();

    boolean isUnattributedInfluenceEnabled();

    void saveIAMs(JSONArray jSONArray);

    void saveNotifications(JSONArray jSONArray);
}
