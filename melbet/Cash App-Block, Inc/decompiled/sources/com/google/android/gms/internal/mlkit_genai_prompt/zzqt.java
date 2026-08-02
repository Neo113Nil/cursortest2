package com.google.android.gms.internal.mlkit_genai_prompt;

import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.shopping.autofill.presenters.ShoppingAutofillAnalyticsHandler;
import kotlin.collections.EmptyList;

/* loaded from: classes4.dex */
public abstract class zzqt {
    public static EmptyList getDeepLinkSpecs() {
        return ClientRoute.NoOperationWithPathParameter.deepLinkSpecs;
    }

    public static ShoppingAutofillAnalyticsHandler provideShoppingAutofillAnalyticsHandler(Analytics analytics) {
        return new ShoppingAutofillAnalyticsHandler(analytics);
    }
}
