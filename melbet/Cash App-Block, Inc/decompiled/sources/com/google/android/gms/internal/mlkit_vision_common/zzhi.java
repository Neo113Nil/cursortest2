package com.google.android.gms.internal.mlkit_vision_common;

import com.datadog.android.core.constraints.DatadogDataConstraints;
import com.squareup.cash.clientroutes.ClientRoute;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.EmptySet;

/* loaded from: classes4.dex */
public abstract class zzhi {
    public static List getDeepLinkSpecs() {
        return ClientRoute.ViewLocalBrandCheckoutWithCashtag.deepLinkSpecs;
    }

    public static LinkedHashMap validateAttributes$default(DatadogDataConstraints datadogDataConstraints, Map map, String str, Set set, int i) {
        if ((i & 8) != 0) {
            set = EmptySet.INSTANCE;
        }
        return datadogDataConstraints.validateAttributes(map, str, null, set);
    }
}
