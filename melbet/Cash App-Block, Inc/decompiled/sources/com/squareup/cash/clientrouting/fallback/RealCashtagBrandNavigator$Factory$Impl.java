package com.squareup.cash.clientrouting.fallback;

import app.cash.broadway.navigation.Navigator;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.graphics.backend.gl.core.EglCore;
import com.squareup.cash.history.analytics.LoadTimeClock;
import com.squareup.cash.launcher.IntentLauncher;

/* loaded from: classes.dex */
public final class RealCashtagBrandNavigator$Factory$Impl {
    public final LoadTimeClock.MetroFactory delegateFactory;

    public RealCashtagBrandNavigator$Factory$Impl(LoadTimeClock.MetroFactory metroFactory) {
        this.delegateFactory = metroFactory;
    }

    public final EglCore create(Navigator navigator) {
        navigator.getClass();
        LoadTimeClock.MetroFactory metroFactory = this.delegateFactory;
        FeatureFlagManager featureFlagManager = (FeatureFlagManager) metroFactory.clock.invoke();
        IntentLauncher intentLauncher = (IntentLauncher) metroFactory.observabilityManager.invoke();
        featureFlagManager.getClass();
        intentLauncher.getClass();
        return new EglCore(featureFlagManager, intentLauncher, navigator);
    }
}
