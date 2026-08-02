package com.datadog.android.rum.internal.utils;

import com.datadog.android.api.context.DatadogContext;
import com.squareup.cash.clientroutes.ClientRoute;
import kotlin.collections.EmptyList;

/* loaded from: classes4.dex */
public abstract class RumTagsUtilsKt {
    public static final String buildDDTagsString(DatadogContext datadogContext) {
        datadogContext.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append("service:" + datadogContext.service);
        sb.append(",");
        sb.append("version:" + datadogContext.version);
        sb.append(",");
        sb.append("sdk_version:" + datadogContext.sdkVersion);
        sb.append(",");
        sb.append("env:" + datadogContext.env);
        String str = datadogContext.variant;
        if (str.length() > 0) {
            sb.append(",");
            sb.append("variant:" + str);
        }
        return sb.toString();
    }

    public static EmptyList getDeepLinkSpecs() {
        return ClientRoute.ViewNeighborhoodsCheckInScanner.deepLinkSpecs;
    }
}
