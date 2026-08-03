package bb;

import org.json.JSONArray;
import org.json.JSONException;
import pc.j;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class d extends a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(f fVar, e9.a aVar) {
        super(fVar, aVar);
        j.e(fVar, "dataRepository");
        j.e(aVar, "timeProvider");
    }

    @Override // bb.a, bb.b
    public void cacheState() {
        ab.d influenceType = getInfluenceType();
        if (influenceType == null) {
            influenceType = ab.d.UNATTRIBUTED;
        }
        f dataRepository = getDataRepository();
        if (influenceType == ab.d.DIRECT) {
            influenceType = ab.d.INDIRECT;
        }
        dataRepository.cacheIAMInfluenceType(influenceType);
    }

    @Override // bb.a
    public int getChannelLimit() {
        return getDataRepository().getIamLimit();
    }

    @Override // bb.a, bb.b
    public ab.c getChannelType() {
        return ab.c.IAM;
    }

    @Override // bb.a, bb.b
    public String getIdTag() {
        return e.IAM_ID_TAG;
    }

    @Override // bb.a
    public int getIndirectAttributionWindow() {
        return getDataRepository().getIamIndirectAttributionWindow();
    }

    @Override // bb.a
    public JSONArray getLastChannelObjects() {
        return getDataRepository().getLastIAMsReceivedData();
    }

    @Override // bb.a
    public JSONArray getLastChannelObjectsReceivedByNewId(String str) {
        try {
            JSONArray lastChannelObjects = getLastChannelObjects();
            try {
                JSONArray jSONArray = new JSONArray();
                int length = lastChannelObjects.length();
                for (int i10 = 0; i10 < length; i10++) {
                    if (!j.a(str, lastChannelObjects.getJSONObject(i10).getString(getIdTag()))) {
                        jSONArray.put(lastChannelObjects.getJSONObject(i10));
                    }
                }
                return jSONArray;
            } catch (JSONException e10) {
                com.onesignal.debug.internal.logging.b.error("Generating tracker lastChannelObjectReceived get JSONObject ", e10);
                return lastChannelObjects;
            }
        } catch (JSONException e11) {
            com.onesignal.debug.internal.logging.b.error("Generating IAM tracker getLastChannelObjects JSONObject ", e11);
            return new JSONArray();
        }
    }

    @Override // bb.a
    public void initInfluencedTypeFromCache() {
        ab.d iamCachedInfluenceType = getDataRepository().getIamCachedInfluenceType();
        if (iamCachedInfluenceType.isIndirect()) {
            setIndirectIds(getLastReceivedIds());
        }
        setInfluenceType(iamCachedInfluenceType);
        com.onesignal.debug.internal.logging.b.debug$default("InAppMessageTracker.initInfluencedTypeFromCache: " + this, null, 2, null);
    }

    @Override // bb.a
    public void saveChannelObjects(JSONArray jSONArray) {
        j.e(jSONArray, "channelObjects");
        getDataRepository().saveIAMs(jSONArray);
    }
}
