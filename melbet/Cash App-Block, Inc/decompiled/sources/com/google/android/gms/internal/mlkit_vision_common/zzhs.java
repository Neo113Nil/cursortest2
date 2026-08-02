package com.google.android.gms.internal.mlkit_vision_common;

import com.bugsnag.android.Thread$State$EnumUnboxingLocalUtility;
import com.squareup.cash.clientroutes.ClientRoute;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public abstract class zzhs {
    public static final Map enrichWithNonNullAttribute(Map map, int i, Float f) {
        map.getClass();
        if (i == 0) {
            throw null;
        }
        if (f == null) {
            return map;
        }
        if (i == 0) {
            throw null;
        }
        map.put(Thread$State$EnumUnboxingLocalUtility.getString(i), f);
        return map;
    }

    public static List getDeepLinkSpecs() {
        return ClientRoute.ViewLocalMarketingMessage.deepLinkSpecs;
    }
}
