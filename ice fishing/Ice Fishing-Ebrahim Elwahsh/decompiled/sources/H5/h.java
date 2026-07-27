package H5;

import org.json.JSONArray;
import org.json.JSONException;

/* loaded from: classes2.dex */
public final class h extends a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(f dataRepository, G4.a timeProvider) {
        super(dataRepository, timeProvider);
        kotlin.jvm.internal.h.e(dataRepository, "dataRepository");
        kotlin.jvm.internal.h.e(timeProvider, "timeProvider");
    }

    @Override // H5.a, H5.b
    public void cacheState() {
        f dataRepository = getDataRepository();
        G5.d influenceType = getInfluenceType();
        if (influenceType == null) {
            influenceType = G5.d.UNATTRIBUTED;
        }
        dataRepository.cacheNotificationInfluenceType(influenceType);
        getDataRepository().cacheNotificationOpenId(getDirectId());
    }

    @Override // H5.a
    public int getChannelLimit() {
        return getDataRepository().getNotificationLimit();
    }

    @Override // H5.a, H5.b
    public G5.c getChannelType() {
        return G5.c.NOTIFICATION;
    }

    @Override // H5.a, H5.b
    public String getIdTag() {
        return e.NOTIFICATION_ID_TAG;
    }

    @Override // H5.a
    public int getIndirectAttributionWindow() {
        return getDataRepository().getNotificationIndirectAttributionWindow();
    }

    @Override // H5.a
    public JSONArray getLastChannelObjects() {
        return getDataRepository().getLastNotificationsReceivedData();
    }

    @Override // H5.a
    public JSONArray getLastChannelObjectsReceivedByNewId(String str) {
        try {
            return getLastChannelObjects();
        } catch (JSONException e6) {
            com.onesignal.debug.internal.logging.b.error("Generating Notification tracker getLastChannelObjects JSONObject ", e6);
            return new JSONArray();
        }
    }

    @Override // H5.a
    public void initInfluencedTypeFromCache() {
        G5.d notificationCachedInfluenceType = getDataRepository().getNotificationCachedInfluenceType();
        if (notificationCachedInfluenceType.isIndirect()) {
            setIndirectIds(getLastReceivedIds());
        } else if (notificationCachedInfluenceType.isDirect()) {
            setDirectId(getDataRepository().getCachedNotificationOpenId());
        }
        setInfluenceType(notificationCachedInfluenceType);
        com.onesignal.debug.internal.logging.b.debug$default("NotificationTracker.initInfluencedTypeFromCache: " + this, null, 2, null);
    }

    @Override // H5.a
    public void saveChannelObjects(JSONArray channelObjects) {
        kotlin.jvm.internal.h.e(channelObjects, "channelObjects");
        getDataRepository().saveNotifications(channelObjects);
    }
}
