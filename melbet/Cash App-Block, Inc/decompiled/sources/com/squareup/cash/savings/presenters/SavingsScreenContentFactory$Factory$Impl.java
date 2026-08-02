package com.squareup.cash.savings.presenters;

import coil3.ImageLoader$Builder;
import com.squareup.cash.activity.presenters.DefaultActivityItemEventHandler$Factory$Impl;
import com.squareup.cash.activity.presenters.RealActivityEmbeddedPresenter$Factory$Impl;
import com.squareup.cash.banking.real.RealDisclosureProvider;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.moneyformatter.real.LocalizedMoneyFormatter;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.savings.backend.api.model.SavingsScreen;
import dev.zacsweers.metro.Provider;
import dev.zacsweers.metro.internal.InstanceFactory;

/* loaded from: classes.dex */
public final class SavingsScreenContentFactory$Factory$Impl {
    public final ImageLoader$Builder delegateFactory;

    public SavingsScreenContentFactory$Factory$Impl(ImageLoader$Builder imageLoader$Builder) {
        this.delegateFactory = imageLoader$Builder;
    }

    public final SavingsScreenContentFactory create(BetterNavigator.ScreenNavigator screenNavigator, SavingsScreen.ScreenType screenType) {
        screenType.getClass();
        ImageLoader$Builder imageLoader$Builder = this.delegateFactory;
        AndroidStringManager androidStringManager = (AndroidStringManager) ((Provider) imageLoader$Builder.application).invoke();
        ErrorReporter errorReporter = (ErrorReporter) ((Provider) imageLoader$Builder.defaults).invoke();
        RealDisclosureProvider realDisclosureProvider = (RealDisclosureProvider) ((Provider) imageLoader$Builder.mainCoroutineContextLazy).invoke();
        SavingsUpsellCardPresenter$Factory$Impl savingsUpsellCardPresenter$Factory$Impl = (SavingsUpsellCardPresenter$Factory$Impl) ((InstanceFactory) imageLoader$Builder.memoryCacheLazy).value;
        RealActivityEmbeddedPresenter$Factory$Impl realActivityEmbeddedPresenter$Factory$Impl = (RealActivityEmbeddedPresenter$Factory$Impl) ((Provider) imageLoader$Builder.diskCacheLazy).invoke();
        DefaultActivityItemEventHandler$Factory$Impl defaultActivityItemEventHandler$Factory$Impl = (DefaultActivityItemEventHandler$Factory$Impl) ((Provider) imageLoader$Builder.eventListenerFactory).invoke();
        SavingsActivityItemEventDecorator savingsActivityItemEventDecorator = (SavingsActivityItemEventDecorator) ((Provider) imageLoader$Builder.componentRegistry).invoke();
        LocalizedMoneyFormatter.Factory factory = (LocalizedMoneyFormatter.Factory) ((Provider) imageLoader$Builder.extras).invoke();
        androidStringManager.getClass();
        errorReporter.getClass();
        realDisclosureProvider.getClass();
        savingsUpsellCardPresenter$Factory$Impl.getClass();
        realActivityEmbeddedPresenter$Factory$Impl.getClass();
        defaultActivityItemEventHandler$Factory$Impl.getClass();
        savingsActivityItemEventDecorator.getClass();
        factory.getClass();
        return new SavingsScreenContentFactory(androidStringManager, errorReporter, realDisclosureProvider, savingsUpsellCardPresenter$Factory$Impl, realActivityEmbeddedPresenter$Factory$Impl, defaultActivityItemEventHandler$Factory$Impl, savingsActivityItemEventDecorator, screenNavigator, screenType, factory);
    }
}
