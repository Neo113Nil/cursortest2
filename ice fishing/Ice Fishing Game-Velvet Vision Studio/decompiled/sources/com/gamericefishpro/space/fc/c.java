package com.gamericefishpro.space.fc;

import java.util.Collection;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public interface c extends com.gamericefishpro.space.dc.d {
    void add(int i, i iVar, String str);

    void add(i iVar, String str);

    void clear(String str);

    i create(JSONObject jSONObject);

    i get(String str);

    @Override // com.gamericefishpro.space.dc.d
    /* synthetic */ boolean getHasSubscribers();

    Collection<i> list();

    void remove(String str, String str2);

    void replaceAll(List<i> list, String str);

    @Override // com.gamericefishpro.space.dc.d
    /* synthetic */ void subscribe(Object obj);

    @Override // com.gamericefishpro.space.dc.d
    /* synthetic */ void unsubscribe(Object obj);
}
