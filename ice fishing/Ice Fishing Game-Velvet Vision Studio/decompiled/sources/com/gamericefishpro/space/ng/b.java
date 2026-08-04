package com.gamericefishpro.space.ng;

import org.json.JSONArray;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public interface b {
    void cacheState();

    com.gamericefishpro.space.mg.c getChannelType();

    com.gamericefishpro.space.mg.b getCurrentSessionInfluence();

    String getDirectId();

    String getIdTag();

    JSONArray getIndirectIds();

    com.gamericefishpro.space.mg.d getInfluenceType();

    JSONArray getLastReceivedIds();

    void resetAndInitInfluence();

    void saveLastId(String str);

    void setDirectId(String str);

    void setIndirectIds(JSONArray jSONArray);

    void setInfluenceType(com.gamericefishpro.space.mg.d dVar);
}
