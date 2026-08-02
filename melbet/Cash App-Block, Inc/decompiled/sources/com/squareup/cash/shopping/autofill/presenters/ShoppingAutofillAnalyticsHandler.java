package com.squareup.cash.shopping.autofill.presenters;

import app.cash.broadway.screen.Screen;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.squareup.cash.cdf.browser.AutofillOrigin;
import com.squareup.cash.cdf.browser.BrowserCheckoutDismissAutofillError;
import com.squareup.cash.cdf.browser.BrowserCheckoutViewAutofillError;
import com.squareup.cash.cdf.browser.InfoContext;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.shopping.autofill.screens.AutofillAnalyticsParam;
import com.squareup.cash.shopping.autofill.screens.AutofillScreen;

/* loaded from: classes6.dex */
public final class ShoppingAutofillAnalyticsHandler {
    public final Analytics analytics;

    public ShoppingAutofillAnalyticsHandler(Analytics analytics) {
        this.analytics = analytics;
    }

    public static AutofillOrigin originScreenToAnalyticsOrigin(Screen screen) {
        if (screen instanceof AutofillScreen.SaveAutofillScreen) {
            return AutofillOrigin.SaveAutofillSheet;
        }
        if (screen instanceof AutofillScreen.UpdateAutofillScreen) {
            return AutofillOrigin.UpdateAutofillSheet;
        }
        if (screen instanceof AutofillScreen.OfferAutofillScreen) {
            return AutofillOrigin.AutofillSheet;
        }
        OptionalProvider$$ExternalSyntheticLambda0.m$1(screen, "Unhandled Screen for analytics: ");
        return null;
    }

    public final void trackBrowserCheckoutDismissAutofillError(AutofillAnalyticsParam autofillAnalyticsParam, String str) {
        autofillAnalyticsParam.getClass();
        str.getClass();
        this.analytics.track(new BrowserCheckoutDismissAutofillError(autofillAnalyticsParam.origin, autofillAnalyticsParam.infoContext, autofillAnalyticsParam.flowToken, autofillAnalyticsParam.businessToken, autofillAnalyticsParam.businessName, str), null);
    }

    public final void trackBrowserCheckoutViewAutofillError(AutofillAnalyticsParam autofillAnalyticsParam, String str) {
        autofillAnalyticsParam.getClass();
        str.getClass();
        InfoContext infoContext = autofillAnalyticsParam.infoContext;
        String str2 = autofillAnalyticsParam.flowToken;
        this.analytics.track(new BrowserCheckoutViewAutofillError(autofillAnalyticsParam.origin, infoContext, str2, autofillAnalyticsParam.businessToken, autofillAnalyticsParam.businessName, str), null);
    }
}
