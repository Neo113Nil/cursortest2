package com.gamericefishpro.space.ng;

import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a implements b {
    private f dataRepository;
    private String directId;
    private JSONArray indirectIds;
    private com.gamericefishpro.space.mg.d influenceType;
    private com.gamericefishpro.space.kd.a timeProvider;

    public a(f dataRepository, com.gamericefishpro.space.kd.a timeProvider) {
        Intrinsics.checkNotNullParameter(dataRepository, "dataRepository");
        Intrinsics.checkNotNullParameter(timeProvider, "timeProvider");
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

    @Override // com.gamericefishpro.space.ng.b
    public abstract /* synthetic */ void cacheState();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass().equals(obj.getClass())) {
            a aVar = (a) obj;
            if (getInfluenceType() == aVar.getInfluenceType() && Intrinsics.a(aVar.getIdTag(), getIdTag())) {
                return true;
            }
        }
        return false;
    }

    public abstract int getChannelLimit();

    @Override // com.gamericefishpro.space.ng.b
    public abstract /* synthetic */ com.gamericefishpro.space.mg.c getChannelType();

    @Override // com.gamericefishpro.space.ng.b
    public com.gamericefishpro.space.mg.b getCurrentSessionInfluence() {
        com.gamericefishpro.space.mg.c channelType = getChannelType();
        com.gamericefishpro.space.mg.d dVar = com.gamericefishpro.space.mg.d.DISABLED;
        com.gamericefishpro.space.mg.b bVar = new com.gamericefishpro.space.mg.b(channelType, dVar, null);
        if (getInfluenceType() == null) {
            initInfluencedTypeFromCache();
        }
        com.gamericefishpro.space.mg.d influenceType = getInfluenceType();
        if (influenceType != null) {
            dVar = influenceType;
        }
        if (dVar.isDirect()) {
            if (isDirectSessionEnabled()) {
                bVar.setIds(new JSONArray().put(getDirectId()));
                bVar.setInfluenceType(com.gamericefishpro.space.mg.d.DIRECT);
                return bVar;
            }
        } else if (dVar.isIndirect()) {
            if (isIndirectSessionEnabled()) {
                bVar.setIds(getIndirectIds());
                bVar.setInfluenceType(com.gamericefishpro.space.mg.d.INDIRECT);
                return bVar;
            }
        } else if (isUnattributedSessionEnabled()) {
            bVar.setInfluenceType(com.gamericefishpro.space.mg.d.UNATTRIBUTED);
        }
        return bVar;
    }

    public final f getDataRepository() {
        return this.dataRepository;
    }

    @Override // com.gamericefishpro.space.ng.b
    public String getDirectId() {
        return this.directId;
    }

    @Override // com.gamericefishpro.space.ng.b
    public abstract /* synthetic */ String getIdTag();

    public abstract int getIndirectAttributionWindow();

    @Override // com.gamericefishpro.space.ng.b
    public JSONArray getIndirectIds() {
        return this.indirectIds;
    }

    @Override // com.gamericefishpro.space.ng.b
    public com.gamericefishpro.space.mg.d getInfluenceType() {
        return this.influenceType;
    }

    public abstract JSONArray getLastChannelObjects();

    public abstract JSONArray getLastChannelObjectsReceivedByNewId(String str);

    @Override // com.gamericefishpro.space.ng.b
    public JSONArray getLastReceivedIds() {
        JSONArray jSONArray = new JSONArray();
        try {
            JSONArray lastChannelObjects = getLastChannelObjects();
            com.gamericefishpro.space.od.b.debug$default("ChannelTracker.getLastReceivedIds: lastChannelObjectReceived: " + lastChannelObjects, null, 2, null);
            long indirectAttributionWindow = ((long) (getIndirectAttributionWindow() * 60)) * 1000;
            long currentTimeMillis = this.timeProvider.getCurrentTimeMillis();
            int length = lastChannelObjects.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObject = lastChannelObjects.getJSONObject(i);
                if (currentTimeMillis - jSONObject.getLong(e.TIME) <= indirectAttributionWindow) {
                    jSONArray.put(jSONObject.getString(getIdTag()));
                }
            }
            return jSONArray;
        } catch (JSONException e) {
            com.gamericefishpro.space.od.b.error("ChannelTracker.getLastReceivedIds: Generating tracker getLastReceivedIds JSONObject ", e);
            return jSONArray;
        }
    }

    public int hashCode() {
        com.gamericefishpro.space.mg.d influenceType = getInfluenceType();
        return getIdTag().hashCode() + ((influenceType != null ? influenceType.hashCode() : 0) * 31);
    }

    public abstract void initInfluencedTypeFromCache();

    @Override // com.gamericefishpro.space.ng.b
    public void resetAndInitInfluence() {
        setDirectId(null);
        setIndirectIds(getLastReceivedIds());
        JSONArray indirectIds = getIndirectIds();
        setInfluenceType((indirectIds != null ? indirectIds.length() : 0) > 0 ? com.gamericefishpro.space.mg.d.INDIRECT : com.gamericefishpro.space.mg.d.UNATTRIBUTED);
        cacheState();
        com.gamericefishpro.space.od.b.debug$default("ChannelTracker.resetAndInitInfluence: " + getIdTag() + " finish with influenceType: " + getInfluenceType(), null, 2, null);
    }

    public abstract void saveChannelObjects(JSONArray jSONArray);

    @Override // com.gamericefishpro.space.ng.b
    public void saveLastId(String str) {
        StringBuilder sbL = com.gamericefishpro.space.m5.a.l("ChannelTracker.saveLastId(id: ", str, "): idTag=");
        sbL.append(getIdTag());
        com.gamericefishpro.space.od.b.debug$default(sbL.toString(), null, 2, null);
        if (str == null || str.length() == 0) {
            return;
        }
        JSONArray lastChannelObjectsReceivedByNewId = getLastChannelObjectsReceivedByNewId(str);
        com.gamericefishpro.space.od.b.debug$default("ChannelTracker.saveLastId: for " + getIdTag() + " saveLastId with lastChannelObjectsReceived: " + lastChannelObjectsReceivedByNewId, null, 2, null);
        try {
            lastChannelObjectsReceivedByNewId.put(new JSONObject().put(getIdTag(), str).put(e.TIME, this.timeProvider.getCurrentTimeMillis()));
            if (lastChannelObjectsReceivedByNewId.length() > getChannelLimit()) {
                JSONArray jSONArray = new JSONArray();
                int length = lastChannelObjectsReceivedByNewId.length();
                for (int length2 = lastChannelObjectsReceivedByNewId.length() - getChannelLimit(); length2 < length; length2++) {
                    try {
                        jSONArray.put(lastChannelObjectsReceivedByNewId.get(length2));
                    } catch (JSONException e) {
                        com.gamericefishpro.space.od.b.error("ChannelTracker.saveLastId: Generating tracker lastChannelObjectsReceived get JSONObject ", e);
                    }
                }
                lastChannelObjectsReceivedByNewId = jSONArray;
            }
            com.gamericefishpro.space.od.b.debug$default("ChannelTracker.saveLastId: for " + getIdTag() + " with channelObjectToSave: " + lastChannelObjectsReceivedByNewId, null, 2, null);
            saveChannelObjects(lastChannelObjectsReceivedByNewId);
        } catch (JSONException e2) {
            com.gamericefishpro.space.od.b.error("ChannelTracker.saveLastId: Generating tracker newInfluenceId JSONObject ", e2);
        }
    }

    public final void setDataRepository(f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "<set-?>");
        this.dataRepository = fVar;
    }

    @Override // com.gamericefishpro.space.ng.b
    public void setDirectId(String str) {
        this.directId = str;
    }

    @Override // com.gamericefishpro.space.ng.b
    public void setIndirectIds(JSONArray jSONArray) {
        this.indirectIds = jSONArray;
    }

    @Override // com.gamericefishpro.space.ng.b
    public void setInfluenceType(com.gamericefishpro.space.mg.d dVar) {
        this.influenceType = dVar;
    }

    public String toString() {
        return "ChannelTracker{tag=" + getIdTag() + ", influenceType=" + getInfluenceType() + ", indirectIds=" + getIndirectIds() + ", directId=" + getDirectId() + '}';
    }
}
