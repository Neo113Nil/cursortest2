package bb;

import org.json.JSONArray;
import org.json.JSONException;
import pc.j;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class h extends a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(f fVar, e9.a aVar) {
        super(fVar, aVar);
        j.e(fVar, "dataRepository");
        j.e(aVar, "timeProvider");
    }

    @Override // bb.a, bb.b
    public void cacheState() {
        f dataRepository = getDataRepository();
        ab.d influenceType = getInfluenceType();
        if (influenceType == null) {
            influenceType = ab.d.UNATTRIBUTED;
        }
        dataRepository.cacheNotificationInfluenceType(influenceType);
        getDataRepository().cacheNotificationOpenId(getDirectId());
    }

    @Override // bb.a
    public int getChannelLimit() {
        return getDataRepository().getNotificationLimit();
    }

    @Override // bb.a, bb.b
    public ab.c getChannelType() {
        return ab.c.NOTIFICATION;
    }

    @Override // bb.a, bb.b
    public String getIdTag() {
        return e.NOTIFICATION_ID_TAG;
    }

    @Override // bb.a
    public int getIndirectAttributionWindow() {
        return getDataRepository().getNotificationIndirectAttributionWindow();
    }

    @Override // bb.a
    public JSONArray getLastChannelObjects() {
        return getDataRepository().getLastNotificationsReceivedData();
    }

    @Override // bb.a
    public JSONArray getLastChannelObjectsReceivedByNewId(String str) {
        try {
            return getLastChannelObjects();
        } catch (JSONException e10) {
            com.onesignal.debug.internal.logging.b.error("Generating Notification tracker getLastChannelObjects JSONObject ", e10);
            return new JSONArray();
        }
    }

    @Override // bb.a
    public void initInfluencedTypeFromCache() {
        ab.d notificationCachedInfluenceType = getDataRepository().getNotificationCachedInfluenceType();
        if (notificationCachedInfluenceType.isIndirect()) {
            setIndirectIds(getLastReceivedIds());
        } else if (notificationCachedInfluenceType.isDirect()) {
            setDirectId(getDataRepository().getCachedNotificationOpenId());
        }
        setInfluenceType(notificationCachedInfluenceType);
        com.onesignal.debug.internal.logging.b.debug$default("NotificationTracker.initInfluencedTypeFromCache: " + this, null, 2, null);
    }

    @Override // bb.a
    public void saveChannelObjects(JSONArray jSONArray) {
        j.e(jSONArray, "channelObjects");
        getDataRepository().saveNotifications(jSONArray);
    }
}
