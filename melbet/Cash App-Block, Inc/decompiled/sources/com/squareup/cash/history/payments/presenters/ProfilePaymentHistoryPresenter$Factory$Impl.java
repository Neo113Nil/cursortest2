package com.squareup.cash.history.payments.presenters;

import app.cash.broadway.screen.Screen;
import coil3.ImageLoader$Builder;
import com.squareup.cash.activity.backend.loader.RealActivitiesCacheManager;
import com.squareup.cash.activity.backend.loader.RealActivityTokenFactory;
import com.squareup.cash.activity.presenters.DefaultActivityItemEventHandler$Factory$Impl;
import com.squareup.cash.activity.presenters.RealActivityEmbeddedPresenter$Factory$Impl;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.gcl.RealMarketAttributesProvider;
import com.squareup.cash.history.payments.screens.PaymentHistoryScreens$ProfilePaymentHistory;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.protos.cash.cashface.ui.GenericProfileElement;
import dev.zacsweers.metro.Provider;

/* loaded from: classes.dex */
public final class ProfilePaymentHistoryPresenter$Factory$Impl {
    public final ImageLoader$Builder delegateFactory;

    public ProfilePaymentHistoryPresenter$Factory$Impl(ImageLoader$Builder imageLoader$Builder) {
        this.delegateFactory = imageLoader$Builder;
    }

    public final ProfilePaymentHistoryPresenter create(PaymentHistoryScreens$ProfilePaymentHistory paymentHistoryScreens$ProfilePaymentHistory, Screen screen, BetterNavigator.ScreenNavigator screenNavigator, GenericProfileElement.ActivityStatsElement activityStatsElement) {
        screen.getClass();
        ImageLoader$Builder imageLoader$Builder = this.delegateFactory;
        Analytics analytics = (Analytics) ((Provider) imageLoader$Builder.application).invoke();
        AndroidStringManager androidStringManager = (AndroidStringManager) ((Provider) imageLoader$Builder.defaults).invoke();
        RealActivityEmbeddedPresenter$Factory$Impl realActivityEmbeddedPresenter$Factory$Impl = (RealActivityEmbeddedPresenter$Factory$Impl) ((Provider) imageLoader$Builder.mainCoroutineContextLazy).invoke();
        RealActivitiesCacheManager realActivitiesCacheManager = (RealActivitiesCacheManager) ((Provider) imageLoader$Builder.memoryCacheLazy).invoke();
        CounterpartyPageRequestHandler$Factory$Impl counterpartyPageRequestHandler$Factory$Impl = (CounterpartyPageRequestHandler$Factory$Impl) ((Provider) imageLoader$Builder.diskCacheLazy).invoke();
        RealActivityTokenFactory realActivityTokenFactory = (RealActivityTokenFactory) ((Provider) imageLoader$Builder.eventListenerFactory).invoke();
        DefaultActivityItemEventHandler$Factory$Impl defaultActivityItemEventHandler$Factory$Impl = (DefaultActivityItemEventHandler$Factory$Impl) ((Provider) imageLoader$Builder.componentRegistry).invoke();
        ProfileActivityItemEventDecorator profileActivityItemEventDecorator = (ProfileActivityItemEventDecorator) ((RealMarketAttributesProvider.MetroFactory) imageLoader$Builder.extras).invoke();
        analytics.getClass();
        androidStringManager.getClass();
        realActivityEmbeddedPresenter$Factory$Impl.getClass();
        realActivitiesCacheManager.getClass();
        counterpartyPageRequestHandler$Factory$Impl.getClass();
        realActivityTokenFactory.getClass();
        defaultActivityItemEventHandler$Factory$Impl.getClass();
        return new ProfilePaymentHistoryPresenter(screenNavigator, screen, paymentHistoryScreens$ProfilePaymentHistory, activityStatsElement, analytics, androidStringManager, realActivityEmbeddedPresenter$Factory$Impl, realActivitiesCacheManager, counterpartyPageRequestHandler$Factory$Impl, realActivityTokenFactory, defaultActivityItemEventHandler$Factory$Impl, profileActivityItemEventDecorator);
    }
}
