package H5;

import org.json.JSONArray;

/* loaded from: classes2.dex */
public interface c {
    void cacheIAMInfluenceType(G5.d dVar);

    void cacheNotificationInfluenceType(G5.d dVar);

    void cacheNotificationOpenId(String str);

    String getCachedNotificationOpenId();

    G5.d getIamCachedInfluenceType();

    int getIamIndirectAttributionWindow();

    int getIamLimit();

    JSONArray getLastIAMsReceivedData();

    JSONArray getLastNotificationsReceivedData();

    G5.d getNotificationCachedInfluenceType();

    int getNotificationIndirectAttributionWindow();

    int getNotificationLimit();

    boolean isDirectInfluenceEnabled();

    boolean isIndirectInfluenceEnabled();

    boolean isUnattributedInfluenceEnabled();

    void saveIAMs(JSONArray jSONArray);

    void saveNotifications(JSONArray jSONArray);
}
