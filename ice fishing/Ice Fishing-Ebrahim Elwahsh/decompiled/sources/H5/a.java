package H5;

import com.google.android.gms.internal.ads.CL;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public abstract class a implements b {
    private f dataRepository;
    private String directId;
    private JSONArray indirectIds;
    private G5.d influenceType;
    private G4.a timeProvider;

    public a(f dataRepository, G4.a timeProvider) {
        kotlin.jvm.internal.h.e(dataRepository, "dataRepository");
        kotlin.jvm.internal.h.e(timeProvider, "timeProvider");
        this.dataRepository = dataRepository;
        this.timeProvider = timeProvider;
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

    @Override // H5.b
    public abstract /* synthetic */ void cacheState();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass().equals(obj.getClass())) {
            a aVar = (a) obj;
            if (getInfluenceType() == aVar.getInfluenceType() && kotlin.jvm.internal.h.a(aVar.getIdTag(), getIdTag())) {
                return true;
            }
        }
        return false;
    }

    public abstract int getChannelLimit();

    @Override // H5.b
    public abstract /* synthetic */ G5.c getChannelType();

    @Override // H5.b
    public G5.b getCurrentSessionInfluence() {
        G5.c channelType = getChannelType();
        G5.d dVar = G5.d.DISABLED;
        G5.b bVar = new G5.b(channelType, dVar, null);
        if (getInfluenceType() == null) {
            initInfluencedTypeFromCache();
        }
        G5.d influenceType = getInfluenceType();
        if (influenceType != null) {
            dVar = influenceType;
        }
        if (dVar.isDirect()) {
            if (isDirectSessionEnabled()) {
                bVar.setIds(new JSONArray().put(getDirectId()));
                bVar.setInfluenceType(G5.d.DIRECT);
                return bVar;
            }
        } else if (dVar.isIndirect()) {
            if (isIndirectSessionEnabled()) {
                bVar.setIds(getIndirectIds());
                bVar.setInfluenceType(G5.d.INDIRECT);
                return bVar;
            }
        } else if (isUnattributedSessionEnabled()) {
            bVar.setInfluenceType(G5.d.UNATTRIBUTED);
        }
        return bVar;
    }

    public final f getDataRepository() {
        return this.dataRepository;
    }

    @Override // H5.b
    public String getDirectId() {
        return this.directId;
    }

    @Override // H5.b
    public abstract /* synthetic */ String getIdTag();

    public abstract int getIndirectAttributionWindow();

    @Override // H5.b
    public JSONArray getIndirectIds() {
        return this.indirectIds;
    }

    @Override // H5.b
    public G5.d getInfluenceType() {
        return this.influenceType;
    }

    public abstract JSONArray getLastChannelObjects();

    public abstract JSONArray getLastChannelObjectsReceivedByNewId(String str);

    @Override // H5.b
    public JSONArray getLastReceivedIds() {
        JSONArray jSONArray = new JSONArray();
        try {
            JSONArray lastChannelObjects = getLastChannelObjects();
            com.onesignal.debug.internal.logging.b.debug$default("ChannelTracker.getLastReceivedIds: lastChannelObjectReceived: " + lastChannelObjects, null, 2, null);
            long indirectAttributionWindow = ((long) (getIndirectAttributionWindow() * 60)) * 1000;
            long currentTimeMillis = this.timeProvider.getCurrentTimeMillis();
            int length = lastChannelObjects.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObject = lastChannelObjects.getJSONObject(i);
                if (currentTimeMillis - jSONObject.getLong("time") <= indirectAttributionWindow) {
                    jSONArray.put(jSONObject.getString(getIdTag()));
                }
            }
        } catch (JSONException e6) {
            com.onesignal.debug.internal.logging.b.error("ChannelTracker.getLastReceivedIds: Generating tracker getLastReceivedIds JSONObject ", e6);
        }
        return jSONArray;
    }

    public int hashCode() {
        G5.d influenceType = getInfluenceType();
        return getIdTag().hashCode() + ((influenceType != null ? influenceType.hashCode() : 0) * 31);
    }

    public abstract void initInfluencedTypeFromCache();

    @Override // H5.b
    public void resetAndInitInfluence() {
        setDirectId(null);
        setIndirectIds(getLastReceivedIds());
        JSONArray indirectIds = getIndirectIds();
        setInfluenceType((indirectIds != null ? indirectIds.length() : 0) > 0 ? G5.d.INDIRECT : G5.d.UNATTRIBUTED);
        cacheState();
        com.onesignal.debug.internal.logging.b.debug$default("ChannelTracker.resetAndInitInfluence: " + getIdTag() + " finish with influenceType: " + getInfluenceType(), null, 2, null);
    }

    public abstract void saveChannelObjects(JSONArray jSONArray);

    @Override // H5.b
    public void saveLastId(String str) {
        StringBuilder m8 = CL.m("ChannelTracker.saveLastId(id: ", str, "): idTag=");
        m8.append(getIdTag());
        com.onesignal.debug.internal.logging.b.debug$default(m8.toString(), null, 2, null);
        if (str == null || str.length() == 0) {
            return;
        }
        JSONArray lastChannelObjectsReceivedByNewId = getLastChannelObjectsReceivedByNewId(str);
        com.onesignal.debug.internal.logging.b.debug$default("ChannelTracker.saveLastId: for " + getIdTag() + " saveLastId with lastChannelObjectsReceived: " + lastChannelObjectsReceivedByNewId, null, 2, null);
        try {
            lastChannelObjectsReceivedByNewId.put(new JSONObject().put(getIdTag(), str).put("time", this.timeProvider.getCurrentTimeMillis()));
            if (lastChannelObjectsReceivedByNewId.length() > getChannelLimit()) {
                JSONArray jSONArray = new JSONArray();
                int length = lastChannelObjectsReceivedByNewId.length();
                for (int length2 = lastChannelObjectsReceivedByNewId.length() - getChannelLimit(); length2 < length; length2++) {
                    try {
                        jSONArray.put(lastChannelObjectsReceivedByNewId.get(length2));
                    } catch (JSONException e6) {
                        com.onesignal.debug.internal.logging.b.error("ChannelTracker.saveLastId: Generating tracker lastChannelObjectsReceived get JSONObject ", e6);
                    }
                }
                lastChannelObjectsReceivedByNewId = jSONArray;
            }
            com.onesignal.debug.internal.logging.b.debug$default("ChannelTracker.saveLastId: for " + getIdTag() + " with channelObjectToSave: " + lastChannelObjectsReceivedByNewId, null, 2, null);
            saveChannelObjects(lastChannelObjectsReceivedByNewId);
        } catch (JSONException e9) {
            com.onesignal.debug.internal.logging.b.error("ChannelTracker.saveLastId: Generating tracker newInfluenceId JSONObject ", e9);
        }
    }

    public final void setDataRepository(f fVar) {
        kotlin.jvm.internal.h.e(fVar, "<set-?>");
        this.dataRepository = fVar;
    }

    @Override // H5.b
    public void setDirectId(String str) {
        this.directId = str;
    }

    @Override // H5.b
    public void setIndirectIds(JSONArray jSONArray) {
        this.indirectIds = jSONArray;
    }

    @Override // H5.b
    public void setInfluenceType(G5.d dVar) {
        this.influenceType = dVar;
    }

    public String toString() {
        return "ChannelTracker{tag=" + getIdTag() + ", influenceType=" + getInfluenceType() + ", indirectIds=" + getIndirectIds() + ", directId=" + getDirectId() + '}';
    }
}
