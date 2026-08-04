package com.gamericefishpro.space.xc;

import com.gamericefishpro.space.yc.d;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public interface c {
    Object delete(String str, d dVar, com.gamericefishpro.space.th.a aVar);

    Object get(String str, d dVar, com.gamericefishpro.space.th.a aVar);

    Object patch(String str, JSONObject jSONObject, d dVar, com.gamericefishpro.space.th.a aVar);

    Object post(String str, JSONObject jSONObject, d dVar, com.gamericefishpro.space.th.a aVar);

    Object put(String str, JSONObject jSONObject, d dVar, com.gamericefishpro.space.th.a aVar);
}
