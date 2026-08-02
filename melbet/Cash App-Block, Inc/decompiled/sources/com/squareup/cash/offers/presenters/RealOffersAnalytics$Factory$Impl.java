package com.squareup.cash.offers.presenters;

import app.cash.broadway.screen.Screen;
import com.squareup.cash.afterpayapplet.backend.real.RealAfterpayAppletAnalytics;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.offers.backend.real.RealOffersAnalyticsHelper;
import com.squareup.cash.work.presenters.RealYouPresenter$MetroFactory;

/* loaded from: classes.dex */
public final class RealOffersAnalytics$Factory$Impl {
    public final RealYouPresenter$MetroFactory delegateFactory;

    public RealOffersAnalytics$Factory$Impl(RealYouPresenter$MetroFactory realYouPresenter$MetroFactory) {
        this.delegateFactory = realYouPresenter$MetroFactory;
    }

    public final RealOffersAnalytics create(Screen screen) {
        screen.getClass();
        RealYouPresenter$MetroFactory realYouPresenter$MetroFactory = this.delegateFactory;
        Analytics analytics = (Analytics) realYouPresenter$MetroFactory.assignedJobProvider.invoke();
        RealOffersAnalyticsHelper realOffersAnalyticsHelper = (RealOffersAnalyticsHelper) realYouPresenter$MetroFactory.assignedLocationProvider.invoke();
        RealAfterpayAppletAnalytics realAfterpayAppletAnalytics = (RealAfterpayAppletAnalytics) realYouPresenter$MetroFactory.passcodeProvider.invoke();
        analytics.getClass();
        realOffersAnalyticsHelper.getClass();
        realAfterpayAppletAnalytics.getClass();
        return new RealOffersAnalytics(analytics, realOffersAnalyticsHelper, realAfterpayAppletAnalytics, screen);
    }
}
