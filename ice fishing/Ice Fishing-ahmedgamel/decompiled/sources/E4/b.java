package E4;

import com.onesignal.core.internal.http.impl.e;
import org.json.JSONObject;
import z7.InterfaceC5267d;

/* loaded from: classes2.dex */
public abstract class b {
    public static /* synthetic */ Object delete$default(c cVar, String str, e eVar, InterfaceC5267d interfaceC5267d, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: delete");
        }
        if ((i & 2) != 0) {
            eVar = null;
        }
        return cVar.delete(str, eVar, interfaceC5267d);
    }

    public static /* synthetic */ Object get$default(c cVar, String str, e eVar, InterfaceC5267d interfaceC5267d, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: get");
        }
        if ((i & 2) != 0) {
            eVar = null;
        }
        return cVar.get(str, eVar, interfaceC5267d);
    }

    public static /* synthetic */ Object patch$default(c cVar, String str, JSONObject jSONObject, e eVar, InterfaceC5267d interfaceC5267d, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: patch");
        }
        if ((i & 4) != 0) {
            eVar = null;
        }
        return cVar.patch(str, jSONObject, eVar, interfaceC5267d);
    }

    public static /* synthetic */ Object post$default(c cVar, String str, JSONObject jSONObject, e eVar, InterfaceC5267d interfaceC5267d, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: post");
        }
        if ((i & 4) != 0) {
            eVar = null;
        }
        return cVar.post(str, jSONObject, eVar, interfaceC5267d);
    }

    public static /* synthetic */ Object put$default(c cVar, String str, JSONObject jSONObject, e eVar, InterfaceC5267d interfaceC5267d, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: put");
        }
        if ((i & 4) != 0) {
            eVar = null;
        }
        return cVar.put(str, jSONObject, eVar, interfaceC5267d);
    }
}
