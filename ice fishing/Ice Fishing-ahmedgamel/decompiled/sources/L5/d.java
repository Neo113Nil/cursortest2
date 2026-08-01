package L5;

import org.json.JSONArray;
import org.json.JSONException;

/* loaded from: classes2.dex */
public final class d extends a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(f dataRepository, K4.a timeProvider) {
        super(dataRepository, timeProvider);
        kotlin.jvm.internal.h.e(dataRepository, "dataRepository");
        kotlin.jvm.internal.h.e(timeProvider, "timeProvider");
    }

    @Override // L5.a, L5.b
    public void cacheState() {
        K5.d influenceType = getInfluenceType();
        if (influenceType == null) {
            influenceType = K5.d.UNATTRIBUTED;
        }
        f dataRepository = getDataRepository();
        if (influenceType == K5.d.DIRECT) {
            influenceType = K5.d.INDIRECT;
        }
        dataRepository.cacheIAMInfluenceType(influenceType);
    }

    @Override // L5.a
    public int getChannelLimit() {
        return getDataRepository().getIamLimit();
    }

    @Override // L5.a, L5.b
    public K5.c getChannelType() {
        return K5.c.IAM;
    }

    @Override // L5.a, L5.b
    public String getIdTag() {
        return e.IAM_ID_TAG;
    }

    @Override // L5.a
    public int getIndirectAttributionWindow() {
        return getDataRepository().getIamIndirectAttributionWindow();
    }

    @Override // L5.a
    public JSONArray getLastChannelObjects() {
        return getDataRepository().getLastIAMsReceivedData();
    }

    @Override // L5.a
    public JSONArray getLastChannelObjectsReceivedByNewId(String str) {
        try {
            JSONArray lastChannelObjects = getLastChannelObjects();
            try {
                JSONArray jSONArray = new JSONArray();
                int length = lastChannelObjects.length();
                for (int i = 0; i < length; i++) {
                    if (!kotlin.jvm.internal.h.a(str, lastChannelObjects.getJSONObject(i).getString(getIdTag()))) {
                        jSONArray.put(lastChannelObjects.getJSONObject(i));
                    }
                }
                return jSONArray;
            } catch (JSONException e9) {
                com.onesignal.debug.internal.logging.b.error("Generating tracker lastChannelObjectReceived get JSONObject ", e9);
                return lastChannelObjects;
            }
        } catch (JSONException e10) {
            com.onesignal.debug.internal.logging.b.error("Generating IAM tracker getLastChannelObjects JSONObject ", e10);
            return new JSONArray();
        }
    }

    @Override // L5.a
    public void initInfluencedTypeFromCache() {
        K5.d iamCachedInfluenceType = getDataRepository().getIamCachedInfluenceType();
        if (iamCachedInfluenceType.isIndirect()) {
            setIndirectIds(getLastReceivedIds());
        }
        setInfluenceType(iamCachedInfluenceType);
        com.onesignal.debug.internal.logging.b.debug$default("InAppMessageTracker.initInfluencedTypeFromCache: " + this, null, 2, null);
    }

    @Override // L5.a
    public void saveChannelObjects(JSONArray channelObjects) {
        kotlin.jvm.internal.h.e(channelObjects, "channelObjects");
        getDataRepository().saveIAMs(channelObjects);
    }
}
