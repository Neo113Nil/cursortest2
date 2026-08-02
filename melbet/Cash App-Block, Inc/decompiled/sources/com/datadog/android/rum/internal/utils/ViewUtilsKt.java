package com.datadog.android.rum.internal.utils;

import android.app.Activity;
import com.squareup.cash.clientroutes.ClientRoute;
import kotlin.collections.EmptyList;

/* loaded from: classes4.dex */
public abstract class ViewUtilsKt {
    public static EmptyList getDeepLinkSpecs() {
        return ClientRoute.ViewNewPaymentRequestToCustomerid.deepLinkSpecs;
    }

    public static final String resolveViewUrl(Activity activity) {
        activity.getClass();
        String canonicalName = activity.getClass().getCanonicalName();
        return canonicalName == null ? activity.getClass().getSimpleName() : canonicalName;
    }
}
