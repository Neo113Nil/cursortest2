package L5;

import org.json.JSONArray;
import org.json.JSONException;

/* loaded from: classes2.dex */
public final class h extends a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(f dataRepository, K4.a timeProvider) {
        super(dataRepository, timeProvider);
        kotlin.jvm.internal.h.e(dataRepository, "dataRepository");
        kotlin.jvm.internal.h.e(timeProvider, "timeProvider");
    }

    @Override // L5.a, L5.b
    public void cacheState() {
        f dataRepository = getDataRepository();
        K5.d influenceType = getInfluenceType();
        if (influenceType == null) {
            influenceType = K5.d.UNATTRIBUTED;
        }
        dataRepository.cacheNotificationInfluenceType(influenceType);
        getDataRepository().cacheNotificationOpenId(getDirectId());
    }

    @Override // L5.a
    public int getChannelLimit() {
        return getDataRepository().getNotificationLimit();
    }

    @Override // L5.a, L5.b
    public K5.c getChannelType() {
        return K5.c.NOTIFICATION;
    }

    @Override // L5.a, L5.b
    public String getIdTag() {
        return e.NOTIFICATION_ID_TAG;
    }

    @Override // L5.a
    public int getIndirectAttributionWindow() {
        return getDataRepository().getNotificationIndirectAttributionWindow();
    }

    @Override // L5.a
    public JSONArray getLastChannelObjects() {
        return getDataRepository().getLastNotificationsReceivedData();
    }

    @Override // L5.a
    public JSONArray getLastChannelObjectsReceivedByNewId(String str) {
        try {
            return getLastChannelObjects();
        } catch (JSONException e9) {
            com.onesignal.debug.internal.logging.b.error("Generating Notification tracker getLastChannelObjects JSONObject ", e9);
            return new JSONArray();
        }
    }

    @Override // L5.a
    public void initInfluencedTypeFromCache() {
        K5.d notificationCachedInfluenceType = getDataRepository().getNotificationCachedInfluenceType();
        if (notificationCachedInfluenceType.isIndirect()) {
            setIndirectIds(getLastReceivedIds());
        } else if (notificationCachedInfluenceType.isDirect()) {
            setDirectId(getDataRepository().getCachedNotificationOpenId());
        }
        setInfluenceType(notificationCachedInfluenceType);
        com.onesignal.debug.internal.logging.b.debug$default("NotificationTracker.initInfluencedTypeFromCache: " + this, null, 2, null);
    }

    @Override // L5.a
    public void saveChannelObjects(JSONArray channelObjects) {
        kotlin.jvm.internal.h.e(channelObjects, "channelObjects");
        getDataRepository().saveNotifications(channelObjects);
    }
}
