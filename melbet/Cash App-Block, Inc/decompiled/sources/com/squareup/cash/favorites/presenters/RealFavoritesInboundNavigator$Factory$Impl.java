package com.squareup.cash.favorites.presenters;

import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.graphics.backend.gl.core.EglCore;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.integration.analytics.RealUuidGenerator;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.work.presenters.RealYouPresenter$MetroFactory;

/* loaded from: classes.dex */
public final class RealFavoritesInboundNavigator$Factory$Impl {
    public final RealYouPresenter$MetroFactory delegateFactory;

    public RealFavoritesInboundNavigator$Factory$Impl(RealYouPresenter$MetroFactory realYouPresenter$MetroFactory) {
        this.delegateFactory = realYouPresenter$MetroFactory;
    }

    public final EglCore create(BetterNavigator.ScreenNavigator screenNavigator) {
        RealYouPresenter$MetroFactory realYouPresenter$MetroFactory = this.delegateFactory;
        RealUuidGenerator realUuidGenerator = (RealUuidGenerator) realYouPresenter$MetroFactory.assignedJobProvider.invoke();
        AndroidStringManager androidStringManager = (AndroidStringManager) realYouPresenter$MetroFactory.assignedLocationProvider.invoke();
        Analytics analytics = (Analytics) realYouPresenter$MetroFactory.passcodeProvider.invoke();
        realUuidGenerator.getClass();
        androidStringManager.getClass();
        analytics.getClass();
        return new EglCore(screenNavigator, realUuidGenerator, androidStringManager, analytics);
    }
}
