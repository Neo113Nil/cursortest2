package com.datadog.android.rum.internal.utils;

import com.datadog.android.api.context.UserInfo;
import com.squareup.cash.clientroutes.ClientRoute;
import kotlin.collections.EmptyList;

/* loaded from: classes4.dex */
public abstract class RuntimeUtilsKt {
    public static EmptyList getDeepLinkSpecs() {
        return ClientRoute.ViewNeighborhoodsLocalEarningCards.deepLinkSpecs;
    }

    public static final boolean hasUserData(UserInfo userInfo) {
        userInfo.getClass();
        return (userInfo.id == null && userInfo.anonymousId == null && userInfo.name == null && userInfo.email == null && userInfo.additionalProperties.isEmpty()) ? false : true;
    }
}
