package w8;

import com.onesignal.core.internal.http.impl.d;
import org.json.JSONObject;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public abstract class b {
    public static /* synthetic */ Object delete$default(c cVar, String str, d dVar, fc.d dVar2, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: delete");
        }
        if ((i10 & 2) != 0) {
            dVar = null;
        }
        return cVar.delete(str, dVar, dVar2);
    }

    public static /* synthetic */ Object get$default(c cVar, String str, d dVar, fc.d dVar2, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: get");
        }
        if ((i10 & 2) != 0) {
            dVar = null;
        }
        return cVar.get(str, dVar, dVar2);
    }

    public static /* synthetic */ Object patch$default(c cVar, String str, JSONObject jSONObject, d dVar, fc.d dVar2, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: patch");
        }
        if ((i10 & 4) != 0) {
            dVar = null;
        }
        return cVar.patch(str, jSONObject, dVar, dVar2);
    }

    public static /* synthetic */ Object post$default(c cVar, String str, JSONObject jSONObject, d dVar, fc.d dVar2, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: post");
        }
        if ((i10 & 4) != 0) {
            dVar = null;
        }
        return cVar.post(str, jSONObject, dVar, dVar2);
    }

    public static /* synthetic */ Object put$default(c cVar, String str, JSONObject jSONObject, d dVar, fc.d dVar2, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: put");
        }
        if ((i10 & 4) != 0) {
            dVar = null;
        }
        return cVar.put(str, jSONObject, dVar, dVar2);
    }
}
