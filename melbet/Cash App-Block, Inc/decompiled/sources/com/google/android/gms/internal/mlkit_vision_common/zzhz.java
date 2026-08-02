package com.google.android.gms.internal.mlkit_vision_common;

import com.datadog.android.rum.internal.domain.scope.RumScope;
import com.squareup.cash.clientroutes.ClientRoute;
import java.util.List;
import java.util.Map;
import kotlin.collections.EmptyMap;

/* loaded from: classes4.dex */
public abstract class zzhz {
    public static Map getCustomAttributes(RumScope rumScope) {
        Map customAttributes;
        RumScope parentScope = rumScope.getParentScope();
        if (parentScope != null && (customAttributes = parentScope.getCustomAttributes()) != null) {
            return customAttributes;
        }
        EmptyMap emptyMap = EmptyMap.INSTANCE;
        emptyMap.getClass();
        return emptyMap;
    }

    public static List getDeepLinkSpecs() {
        return ClientRoute.ViewMerchantProfileOpenBottomSheet.deepLinkSpecs;
    }
}
