package com.squareup.cash.activity.presenters;

import app.cash.broadway.navigation.Navigator;
import coil3.ComponentRegistry;
import com.squareup.cash.activity.backend.ActivityFeedProducer;
import com.squareup.cash.activity.backend.loader.ActivitiesManager;
import com.squareup.cash.activity.presenters.ActivityItemPresenter;
import com.squareup.cash.datetimeformatter.real.RealDateTimeFormatterFactory;
import com.squareup.cash.fillr.real.FillrInitializer;
import com.squareup.cash.resource.text.AndroidStringManager;
import dev.zacsweers.metro.Provider;

/* loaded from: classes.dex */
public final class RealActivityEmbeddedPresenter$Factory$Impl {
    public final ComponentRegistry.Builder delegateFactory;

    public RealActivityEmbeddedPresenter$Factory$Impl(ComponentRegistry.Builder builder) {
        this.delegateFactory = builder;
    }

    public final RealActivityEmbeddedPresenter create(Navigator navigator, ActivityEmbeddedPresenter$Configuration activityEmbeddedPresenter$Configuration) {
        navigator.getClass();
        ComponentRegistry.Builder builder = this.delegateFactory;
        ActivitiesManager.Factory factory = (ActivitiesManager.Factory) ((Provider) builder.interceptors).invoke();
        ActivityFeedProducer activityFeedProducer = (ActivityFeedProducer) ((Provider) builder.mappers).invoke();
        AndroidStringManager androidStringManager = (AndroidStringManager) ((Provider) builder.keyers).invoke();
        ActivityItemPresenter.Factory factory2 = (ActivityItemPresenter.Factory) ((Provider) builder.lazyFetcherFactories).invoke();
        RealDateTimeFormatterFactory realDateTimeFormatterFactory = (RealDateTimeFormatterFactory) ((FillrInitializer.MetroFactory) builder.lazyDecoderFactories).invoke();
        factory.getClass();
        activityFeedProducer.getClass();
        androidStringManager.getClass();
        factory2.getClass();
        return new RealActivityEmbeddedPresenter(navigator, activityEmbeddedPresenter$Configuration, factory, activityFeedProducer, androidStringManager, factory2, realDateTimeFormatterFactory);
    }
}
