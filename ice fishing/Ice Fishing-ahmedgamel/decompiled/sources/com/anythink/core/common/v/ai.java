package com.anythink.core.common.v;

import com.anythink.core.api.ATAdConst;
import com.anythink.core.d.h;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class ai {
    public static JSONObject a(Map<String, Object> map) {
        Object obj = map.get(ATAdConst.KEY.M_S);
        if (obj instanceof JSONObject) {
            return ((JSONObject) obj).optJSONObject(h.b.f18085a);
        }
        return null;
    }
}
