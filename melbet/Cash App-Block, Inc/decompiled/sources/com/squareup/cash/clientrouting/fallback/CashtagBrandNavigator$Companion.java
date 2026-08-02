package com.squareup.cash.clientrouting.fallback;

import com.squareup.cash.clientrouting.data.RoutingParams;
import okhttp3.HttpUrl;

/* loaded from: classes6.dex */
public final class CashtagBrandNavigator$Companion {
    public static String extractAttributionKey(RoutingParams routingParams) {
        String str;
        HttpUrl httpUrl;
        routingParams.getClass();
        RoutingParams.DeepLinkMetadata deepLinkMetadata = routingParams.deepLinkMetadata;
        if (deepLinkMetadata == null || (str = deepLinkMetadata.originalUrl) == null) {
            return null;
        }
        try {
            HttpUrl.Builder builder = new HttpUrl.Builder();
            builder.parse$okhttp(null, str);
            httpUrl = builder.build();
        } catch (IllegalArgumentException unused) {
            httpUrl = null;
        }
        if (httpUrl != null) {
            return httpUrl.queryParameter("a");
        }
        return null;
    }

    public static String extractCouponCode(RoutingParams routingParams) {
        String str;
        HttpUrl httpUrl;
        routingParams.getClass();
        RoutingParams.DeepLinkMetadata deepLinkMetadata = routingParams.deepLinkMetadata;
        if (deepLinkMetadata == null || (str = deepLinkMetadata.originalUrl) == null) {
            return null;
        }
        try {
            HttpUrl.Builder builder = new HttpUrl.Builder();
            builder.parse$okhttp(null, str);
            httpUrl = builder.build();
        } catch (IllegalArgumentException unused) {
            httpUrl = null;
        }
        if (httpUrl != null) {
            return httpUrl.queryParameter("coupon_code");
        }
        return null;
    }
}
