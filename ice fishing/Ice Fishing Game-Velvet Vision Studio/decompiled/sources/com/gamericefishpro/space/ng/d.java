package com.gamericefishpro.space.ng;

import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(f dataRepository, com.gamericefishpro.space.kd.a timeProvider) {
        super(dataRepository, timeProvider);
        Intrinsics.checkNotNullParameter(dataRepository, "dataRepository");
        Intrinsics.checkNotNullParameter(timeProvider, "timeProvider");
    }

    @Override // com.gamericefishpro.space.ng.a, com.gamericefishpro.space.ng.b
    public void cacheState() {
        com.gamericefishpro.space.mg.d influenceType = getInfluenceType();
        if (influenceType == null) {
            influenceType = com.gamericefishpro.space.mg.d.UNATTRIBUTED;
        }
        f dataRepository = getDataRepository();
        if (influenceType == com.gamericefishpro.space.mg.d.DIRECT) {
            influenceType = com.gamericefishpro.space.mg.d.INDIRECT;
        }
        dataRepository.cacheIAMInfluenceType(influenceType);
    }

    @Override // com.gamericefishpro.space.ng.a
    public int getChannelLimit() {
        return getDataRepository().getIamLimit();
    }

    @Override // com.gamericefishpro.space.ng.a, com.gamericefishpro.space.ng.b
    public com.gamericefishpro.space.mg.c getChannelType() {
        return com.gamericefishpro.space.mg.c.IAM;
    }

    @Override // com.gamericefishpro.space.ng.a, com.gamericefishpro.space.ng.b
    public String getIdTag() {
        return e.IAM_ID_TAG;
    }

    @Override // com.gamericefishpro.space.ng.a
    public int getIndirectAttributionWindow() {
        return getDataRepository().getIamIndirectAttributionWindow();
    }

    @Override // com.gamericefishpro.space.ng.a
    public JSONArray getLastChannelObjects() {
        return getDataRepository().getLastIAMsReceivedData();
    }

    @Override // com.gamericefishpro.space.ng.a
    public JSONArray getLastChannelObjectsReceivedByNewId(String str) {
        try {
            JSONArray lastChannelObjects = getLastChannelObjects();
            try {
                JSONArray jSONArray = new JSONArray();
                int length = lastChannelObjects.length();
                for (int i = 0; i < length; i++) {
                    if (!Intrinsics.a(str, lastChannelObjects.getJSONObject(i).getString(getIdTag()))) {
                        jSONArray.put(lastChannelObjects.getJSONObject(i));
                    }
                }
                return jSONArray;
            } catch (JSONException e) {
                com.gamericefishpro.space.od.b.error("Generating tracker lastChannelObjectReceived get JSONObject ", e);
                return lastChannelObjects;
            }
        } catch (JSONException e2) {
            com.gamericefishpro.space.od.b.error("Generating IAM tracker getLastChannelObjects JSONObject ", e2);
            return new JSONArray();
        }
    }

    @Override // com.gamericefishpro.space.ng.a
    public void initInfluencedTypeFromCache() {
        com.gamericefishpro.space.mg.d iamCachedInfluenceType = getDataRepository().getIamCachedInfluenceType();
        if (iamCachedInfluenceType.isIndirect()) {
            setIndirectIds(getLastReceivedIds());
        }
        setInfluenceType(iamCachedInfluenceType);
        com.gamericefishpro.space.od.b.debug$default("InAppMessageTracker.initInfluencedTypeFromCache: " + this, null, 2, null);
    }

    @Override // com.gamericefishpro.space.ng.a
    public void saveChannelObjects(JSONArray channelObjects) {
        Intrinsics.checkNotNullParameter(channelObjects, "channelObjects");
        getDataRepository().saveIAMs(channelObjects);
    }
}
