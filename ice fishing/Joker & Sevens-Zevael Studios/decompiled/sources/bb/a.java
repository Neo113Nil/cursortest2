package bb;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import pc.j;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public abstract class a implements b {
    private f dataRepository;
    private String directId;
    private JSONArray indirectIds;
    private ab.d influenceType;
    private e9.a timeProvider;

    public a(f fVar, e9.a aVar) {
        j.e(fVar, "dataRepository");
        j.e(aVar, "timeProvider");
        this.dataRepository = fVar;
        this.timeProvider = aVar;
    }

    private final boolean isDirectSessionEnabled() {
        return this.dataRepository.isDirectInfluenceEnabled();
    }

    private final boolean isIndirectSessionEnabled() {
        return this.dataRepository.isIndirectInfluenceEnabled();
    }

    private final boolean isUnattributedSessionEnabled() {
        return this.dataRepository.isUnattributedInfluenceEnabled();
    }

    @Override // bb.b
    public abstract /* synthetic */ void cacheState();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass().equals(obj.getClass())) {
            a aVar = (a) obj;
            if (getInfluenceType() == aVar.getInfluenceType() && j.a(aVar.getIdTag(), getIdTag())) {
                return true;
            }
        }
        return false;
    }

    public abstract int getChannelLimit();

    @Override // bb.b
    public abstract /* synthetic */ ab.c getChannelType();

    @Override // bb.b
    public ab.b getCurrentSessionInfluence() {
        ab.c channelType = getChannelType();
        ab.d dVar = ab.d.DISABLED;
        ab.b bVar = new ab.b(channelType, dVar, null);
        if (getInfluenceType() == null) {
            initInfluencedTypeFromCache();
        }
        ab.d influenceType = getInfluenceType();
        if (influenceType != null) {
            dVar = influenceType;
        }
        if (dVar.isDirect()) {
            if (isDirectSessionEnabled()) {
                bVar.setIds(new JSONArray().put(getDirectId()));
                bVar.setInfluenceType(ab.d.DIRECT);
                return bVar;
            }
        } else if (dVar.isIndirect()) {
            if (isIndirectSessionEnabled()) {
                bVar.setIds(getIndirectIds());
                bVar.setInfluenceType(ab.d.INDIRECT);
                return bVar;
            }
        } else if (isUnattributedSessionEnabled()) {
            bVar.setInfluenceType(ab.d.UNATTRIBUTED);
        }
        return bVar;
    }

    public final f getDataRepository() {
        return this.dataRepository;
    }

    @Override // bb.b
    public String getDirectId() {
        return this.directId;
    }

    @Override // bb.b
    public abstract /* synthetic */ String getIdTag();

    public abstract int getIndirectAttributionWindow();

    @Override // bb.b
    public JSONArray getIndirectIds() {
        return this.indirectIds;
    }

    @Override // bb.b
    public ab.d getInfluenceType() {
        return this.influenceType;
    }

    public abstract JSONArray getLastChannelObjects();

    public abstract JSONArray getLastChannelObjectsReceivedByNewId(String str);

    @Override // bb.b
    public JSONArray getLastReceivedIds() {
        JSONArray jSONArray = new JSONArray();
        try {
            JSONArray lastChannelObjects = getLastChannelObjects();
            com.onesignal.debug.internal.logging.b.debug$default("ChannelTracker.getLastReceivedIds: lastChannelObjectReceived: " + lastChannelObjects, null, 2, null);
            long indirectAttributionWindow = ((long) (getIndirectAttributionWindow() * 60)) * 1000;
            long currentTimeMillis = this.timeProvider.getCurrentTimeMillis();
            int length = lastChannelObjects.length();
            for (int i10 = 0; i10 < length; i10++) {
                JSONObject jSONObject = lastChannelObjects.getJSONObject(i10);
                if (currentTimeMillis - jSONObject.getLong(e.TIME) <= indirectAttributionWindow) {
                    jSONArray.put(jSONObject.getString(getIdTag()));
                }
            }
            return jSONArray;
        } catch (JSONException e10) {
            com.onesignal.debug.internal.logging.b.error("ChannelTracker.getLastReceivedIds: Generating tracker getLastReceivedIds JSONObject ", e10);
            return jSONArray;
        }
    }

    public int hashCode() {
        ab.d influenceType = getInfluenceType();
        return getIdTag().hashCode() + ((influenceType != null ? influenceType.hashCode() : 0) * 31);
    }

    public abstract void initInfluencedTypeFromCache();

    @Override // bb.b
    public void resetAndInitInfluence() {
        setDirectId(null);
        setIndirectIds(getLastReceivedIds());
        JSONArray indirectIds = getIndirectIds();
        setInfluenceType((indirectIds != null ? indirectIds.length() : 0) > 0 ? ab.d.INDIRECT : ab.d.UNATTRIBUTED);
        cacheState();
        com.onesignal.debug.internal.logging.b.debug$default("ChannelTracker.resetAndInitInfluence: " + getIdTag() + " finish with influenceType: " + getInfluenceType(), null, 2, null);
    }

    public abstract void saveChannelObjects(JSONArray jSONArray);

    @Override // bb.b
    public void saveLastId(String str) {
        com.onesignal.debug.internal.logging.b.debug$default("ChannelTracker.saveLastId(id: " + str + "): idTag=" + getIdTag(), null, 2, null);
        if (str == null || str.length() == 0) {
            return;
        }
        JSONArray lastChannelObjectsReceivedByNewId = getLastChannelObjectsReceivedByNewId(str);
        com.onesignal.debug.internal.logging.b.debug$default("ChannelTracker.saveLastId: for " + getIdTag() + " saveLastId with lastChannelObjectsReceived: " + lastChannelObjectsReceivedByNewId, null, 2, null);
        try {
            lastChannelObjectsReceivedByNewId.put(new JSONObject().put(getIdTag(), str).put(e.TIME, this.timeProvider.getCurrentTimeMillis()));
            if (lastChannelObjectsReceivedByNewId.length() > getChannelLimit()) {
                JSONArray jSONArray = new JSONArray();
                int length = lastChannelObjectsReceivedByNewId.length();
                for (int length2 = lastChannelObjectsReceivedByNewId.length() - getChannelLimit(); length2 < length; length2++) {
                    try {
                        jSONArray.put(lastChannelObjectsReceivedByNewId.get(length2));
                    } catch (JSONException e10) {
                        com.onesignal.debug.internal.logging.b.error("ChannelTracker.saveLastId: Generating tracker lastChannelObjectsReceived get JSONObject ", e10);
                    }
                }
                lastChannelObjectsReceivedByNewId = jSONArray;
            }
            com.onesignal.debug.internal.logging.b.debug$default("ChannelTracker.saveLastId: for " + getIdTag() + " with channelObjectToSave: " + lastChannelObjectsReceivedByNewId, null, 2, null);
            saveChannelObjects(lastChannelObjectsReceivedByNewId);
        } catch (JSONException e11) {
            com.onesignal.debug.internal.logging.b.error("ChannelTracker.saveLastId: Generating tracker newInfluenceId JSONObject ", e11);
        }
    }

    public final void setDataRepository(f fVar) {
        j.e(fVar, "<set-?>");
        this.dataRepository = fVar;
    }

    @Override // bb.b
    public void setDirectId(String str) {
        this.directId = str;
    }

    @Override // bb.b
    public void setIndirectIds(JSONArray jSONArray) {
        this.indirectIds = jSONArray;
    }

    @Override // bb.b
    public void setInfluenceType(ab.d dVar) {
        this.influenceType = dVar;
    }

    public String toString() {
        return "ChannelTracker{tag=" + getIdTag() + ", influenceType=" + getInfluenceType() + ", indirectIds=" + getIndirectIds() + ", directId=" + getDirectId() + '}';
    }
}
