package com.gamericefishpro.space.ng;

import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(f dataRepository, com.gamericefishpro.space.kd.a timeProvider) {
        super(dataRepository, timeProvider);
        Intrinsics.checkNotNullParameter(dataRepository, "dataRepository");
        Intrinsics.checkNotNullParameter(timeProvider, "timeProvider");
    }

    @Override // com.gamericefishpro.space.ng.a, com.gamericefishpro.space.ng.b
    public void cacheState() {
        f dataRepository = getDataRepository();
        com.gamericefishpro.space.mg.d influenceType = getInfluenceType();
        if (influenceType == null) {
            influenceType = com.gamericefishpro.space.mg.d.UNATTRIBUTED;
        }
        dataRepository.cacheNotificationInfluenceType(influenceType);
        getDataRepository().cacheNotificationOpenId(getDirectId());
    }

    @Override // com.gamericefishpro.space.ng.a
    public int getChannelLimit() {
        return getDataRepository().getNotificationLimit();
    }

    @Override // com.gamericefishpro.space.ng.a, com.gamericefishpro.space.ng.b
    public com.gamericefishpro.space.mg.c getChannelType() {
        return com.gamericefishpro.space.mg.c.NOTIFICATION;
    }

    @Override // com.gamericefishpro.space.ng.a, com.gamericefishpro.space.ng.b
    public String getIdTag() {
        return e.NOTIFICATION_ID_TAG;
    }

    @Override // com.gamericefishpro.space.ng.a
    public int getIndirectAttributionWindow() {
        return getDataRepository().getNotificationIndirectAttributionWindow();
    }

    @Override // com.gamericefishpro.space.ng.a
    public JSONArray getLastChannelObjects() {
        return getDataRepository().getLastNotificationsReceivedData();
    }

    @Override // com.gamericefishpro.space.ng.a
    public JSONArray getLastChannelObjectsReceivedByNewId(String str) {
        try {
            return getLastChannelObjects();
        } catch (JSONException e) {
            com.gamericefishpro.space.od.b.error("Generating Notification tracker getLastChannelObjects JSONObject ", e);
            return new JSONArray();
        }
    }

    @Override // com.gamericefishpro.space.ng.a
    public void initInfluencedTypeFromCache() {
        com.gamericefishpro.space.mg.d notificationCachedInfluenceType = getDataRepository().getNotificationCachedInfluenceType();
        if (notificationCachedInfluenceType.isIndirect()) {
            setIndirectIds(getLastReceivedIds());
        } else if (notificationCachedInfluenceType.isDirect()) {
            setDirectId(getDataRepository().getCachedNotificationOpenId());
        }
        setInfluenceType(notificationCachedInfluenceType);
        com.gamericefishpro.space.od.b.debug$default("NotificationTracker.initInfluencedTypeFromCache: " + this, null, 2, null);
    }

    @Override // com.gamericefishpro.space.ng.a
    public void saveChannelObjects(JSONArray channelObjects) {
        Intrinsics.checkNotNullParameter(channelObjects, "channelObjects");
        getDataRepository().saveNotifications(channelObjects);
    }
}
