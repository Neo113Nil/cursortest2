package com.gamericefishpro.space.xc;

import com.gamericefishpro.space.yc.d;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    public static /* synthetic */ Object delete$default(c cVar, String str, d dVar, com.gamericefishpro.space.th.a aVar, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: delete");
        }
        if ((i & 2) != 0) {
            dVar = null;
        }
        return cVar.delete(str, dVar, aVar);
    }

    public static /* synthetic */ Object get$default(c cVar, String str, d dVar, com.gamericefishpro.space.th.a aVar, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: get");
        }
        if ((i & 2) != 0) {
            dVar = null;
        }
        return cVar.get(str, dVar, aVar);
    }

    public static /* synthetic */ Object patch$default(c cVar, String str, JSONObject jSONObject, d dVar, com.gamericefishpro.space.th.a aVar, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: patch");
        }
        if ((i & 4) != 0) {
            dVar = null;
        }
        return cVar.patch(str, jSONObject, dVar, aVar);
    }

    public static /* synthetic */ Object post$default(c cVar, String str, JSONObject jSONObject, d dVar, com.gamericefishpro.space.th.a aVar, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: post");
        }
        if ((i & 4) != 0) {
            dVar = null;
        }
        return cVar.post(str, jSONObject, dVar, aVar);
    }

    public static /* synthetic */ Object put$default(c cVar, String str, JSONObject jSONObject, d dVar, com.gamericefishpro.space.th.a aVar, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: put");
        }
        if ((i & 4) != 0) {
            dVar = null;
        }
        return cVar.put(str, jSONObject, dVar, aVar);
    }
}
