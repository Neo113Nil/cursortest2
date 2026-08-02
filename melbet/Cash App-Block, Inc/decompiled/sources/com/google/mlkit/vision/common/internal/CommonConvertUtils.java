package com.google.mlkit.vision.common.internal;

import androidx.lifecycle.LifecycleOwner;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.history.views.SkipPaymentView$$ExternalSyntheticLambda1;
import com.squareup.cash.investing.applets.presenters.RealStocksAppletTileRepository;
import com.squareup.cash.investing.applets.presenters.StocksAppletTilePresenter$Factory$Impl;
import com.squareup.cash.money.applets.viewmodels.Applet;
import com.squareup.cash.money.core.ids.AppletId;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes6.dex */
public abstract class CommonConvertUtils {
    public static int convertToMVRotation(int i) {
        if (i == 0) {
            return 0;
        }
        if (i == 90) {
            return 1;
        }
        if (i == 180) {
            return 2;
        }
        if (i == 270) {
            return 3;
        }
        a$$ExternalSyntheticBUOutline0.m$3(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i, "Invalid rotation: "));
        return 0;
    }

    public static Applet stocksApplet(StocksAppletTilePresenter$Factory$Impl stocksAppletTilePresenter$Factory$Impl, RealStocksAppletTileRepository realStocksAppletTileRepository, LifecycleOwner lifecycleOwner) {
        return new Applet(AppletId.STOCKS, realStocksAppletTileRepository.availabilityState, new SkipPaymentView$$ExternalSyntheticLambda1(10, stocksAppletTilePresenter$Factory$Impl, lifecycleOwner));
    }
}
