package com.onesignal.common.modeling;

import java.util.List;
import org.json.JSONObject;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public abstract class b {
    public static /* synthetic */ void add$default(c cVar, i iVar, String str, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: add");
        }
        if ((i10 & 2) != 0) {
            str = "NORMAL";
        }
        cVar.add(iVar, str);
    }

    public static /* synthetic */ void clear$default(c cVar, String str, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clear");
        }
        if ((i10 & 1) != 0) {
            str = "NORMAL";
        }
        cVar.clear(str);
    }

    public static /* synthetic */ i create$default(c cVar, JSONObject jSONObject, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: create");
        }
        if ((i10 & 1) != 0) {
            jSONObject = null;
        }
        return cVar.create(jSONObject);
    }

    public static /* synthetic */ void remove$default(c cVar, String str, String str2, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: remove");
        }
        if ((i10 & 2) != 0) {
            str2 = "NORMAL";
        }
        cVar.remove(str, str2);
    }

    public static /* synthetic */ void replaceAll$default(c cVar, List list, String str, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: replaceAll");
        }
        if ((i10 & 2) != 0) {
            str = "NORMAL";
        }
        cVar.replaceAll(list, str);
    }

    public static /* synthetic */ void add$default(c cVar, int i10, i iVar, String str, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: add");
        }
        if ((i11 & 4) != 0) {
            str = "NORMAL";
        }
        cVar.add(i10, iVar, str);
    }
}
