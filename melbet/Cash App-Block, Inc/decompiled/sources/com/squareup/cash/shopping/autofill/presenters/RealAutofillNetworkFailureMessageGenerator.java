package com.squareup.cash.shopping.autofill.presenters;

import app.cash.api.ApiResult;
import app.cash.broadway.screen.Screen;
import com.squareup.cash.R;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.shopping.autofill.screens.AutofillScreen;
import kotlin.Pair;

/* loaded from: classes7.dex */
public final class RealAutofillNetworkFailureMessageGenerator {
    public final AndroidStringManager stringManager;

    public RealAutofillNetworkFailureMessageGenerator(AndroidStringManager androidStringManager) {
        this.stringManager = androidStringManager;
    }

    public final Pair getSubmitErrorMessaging(Screen screen, ApiResult.Failure failure) {
        screen.getClass();
        failure.getClass();
        boolean z = failure instanceof ApiResult.Failure.NetworkFailure;
        AndroidStringManager androidStringManager = this.stringManager;
        if (z) {
            return new Pair(androidStringManager.get(R.string.connection_error), androidStringManager.get(R.string.try_again));
        }
        return new Pair(((screen instanceof AutofillScreen.UpdateAutofillScreen) || (screen instanceof AutofillScreen.OfferAutofillScreen)) ? androidStringManager.get(R.string.common_updating_error) : androidStringManager.get(R.string.common_saving_error), androidStringManager.get(R.string.try_again));
    }
}
