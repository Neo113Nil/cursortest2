package com.gamericefishpro.space.fc;

import java.util.List;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    public static /* synthetic */ void add$default(c cVar, i iVar, String str, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: add");
        }
        if ((i & 2) != 0) {
            str = "NORMAL";
        }
        cVar.add(iVar, str);
    }

    public static /* synthetic */ void clear$default(c cVar, String str, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clear");
        }
        if ((i & 1) != 0) {
            str = "NORMAL";
        }
        cVar.clear(str);
    }

    public static /* synthetic */ i create$default(c cVar, JSONObject jSONObject, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: create");
        }
        if ((i & 1) != 0) {
            jSONObject = null;
        }
        return cVar.create(jSONObject);
    }

    public static /* synthetic */ void remove$default(c cVar, String str, String str2, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: remove");
        }
        if ((i & 2) != 0) {
            str2 = "NORMAL";
        }
        cVar.remove(str, str2);
    }

    public static /* synthetic */ void replaceAll$default(c cVar, List list, String str, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: replaceAll");
        }
        if ((i & 2) != 0) {
            str = "NORMAL";
        }
        cVar.replaceAll(list, str);
    }

    public static /* synthetic */ void add$default(c cVar, int i, i iVar, String str, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: add");
        }
        if ((i2 & 4) != 0) {
            str = "NORMAL";
        }
        cVar.add(i, iVar, str);
    }
}
