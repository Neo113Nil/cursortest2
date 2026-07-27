package L5;

import org.json.JSONArray;

/* loaded from: classes2.dex */
public interface b {
    void cacheState();

    K5.c getChannelType();

    K5.b getCurrentSessionInfluence();

    String getDirectId();

    String getIdTag();

    JSONArray getIndirectIds();

    K5.d getInfluenceType();

    JSONArray getLastReceivedIds();

    void resetAndInitInfluence();

    void saveLastId(String str);

    void setDirectId(String str);

    void setIndirectIds(JSONArray jSONArray);

    void setInfluenceType(K5.d dVar);
}
