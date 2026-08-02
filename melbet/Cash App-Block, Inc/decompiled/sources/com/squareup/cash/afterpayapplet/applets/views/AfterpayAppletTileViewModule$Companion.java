package com.squareup.cash.afterpayapplet.applets.views;

import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.lifecycle.LifecycleOwner;
import com.squareup.cash.afterpayapplet.applets.presenters.AfterpayAppletTilePresenter$Factory$Impl;
import com.squareup.cash.afterpayapplet.applets.presenters.RealAfterpayAppletAvailabilityStateManager;
import com.squareup.cash.afterpayapplet.views.AfterpaySearchViewKt$$ExternalSyntheticLambda16;
import com.squareup.cash.amountchooser.views.AtmPickerGridKt$$ExternalSyntheticLambda4;
import com.squareup.cash.money.applets.viewmodels.Applet;
import com.squareup.cash.money.core.ids.AppletId;

/* loaded from: classes5.dex */
public abstract class AfterpayAppletTileViewModule$Companion {
    public static final ComposableLambdaImpl lambda$50006064 = new ComposableLambdaImpl(new AfterpaySearchViewKt$$ExternalSyntheticLambda16(10), false, 50006064);

    public static Applet afterpayAppletTile(AfterpayAppletTilePresenter$Factory$Impl afterpayAppletTilePresenter$Factory$Impl, LifecycleOwner lifecycleOwner, RealAfterpayAppletAvailabilityStateManager realAfterpayAppletAvailabilityStateManager) {
        return new Applet(AppletId.AFTERPAY, realAfterpayAppletAvailabilityStateManager.availabilityState, new AtmPickerGridKt$$ExternalSyntheticLambda4(3, afterpayAppletTilePresenter$Factory$Impl, lifecycleOwner));
    }
}
