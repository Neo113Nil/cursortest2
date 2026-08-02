package com.squareup.cash.education.stories.presenters;

import com.squareup.cash.clientroutes.RealDeepLinkParser;
import com.squareup.cash.clientrouting.RealRouter$Factory$Impl;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.education.stories.backend.real.RealEducationStoryRepository;
import com.squareup.cash.education.stories.screens.EducationStoryScreen;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.localization.LanguageDisclosureSetupTeardown;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.util.clock.AndroidClock;

/* loaded from: classes.dex */
public final class EducationStoryPresenter$Factory$Impl {
    public final LanguageDisclosureSetupTeardown.MetroFactory delegateFactory;

    public EducationStoryPresenter$Factory$Impl(LanguageDisclosureSetupTeardown.MetroFactory metroFactory) {
        this.delegateFactory = metroFactory;
    }

    public final EducationStoryPresenter create(EducationStoryScreen educationStoryScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        educationStoryScreen.getClass();
        LanguageDisclosureSetupTeardown.MetroFactory metroFactory = this.delegateFactory;
        Analytics analytics = (Analytics) metroFactory.appService.invoke();
        AndroidStringManager androidStringManager = (AndroidStringManager) metroFactory.cashAppLiteGate.invoke();
        RealDeepLinkParser realDeepLinkParser = (RealDeepLinkParser) metroFactory.database.invoke();
        RealEducationStoryRepository realEducationStoryRepository = (RealEducationStoryRepository) metroFactory.initialScreenPreludeNavigator.invoke();
        AndroidClock androidClock = (AndroidClock) metroFactory.isLanguageDisclosureAcceptancePending.invoke();
        ErrorReporter errorReporter = (ErrorReporter) metroFactory.localeManager.invoke();
        RealRouter$Factory$Impl realRouter$Factory$Impl = (RealRouter$Factory$Impl) metroFactory.sessionManager.invoke();
        analytics.getClass();
        androidStringManager.getClass();
        realDeepLinkParser.getClass();
        realEducationStoryRepository.getClass();
        androidClock.getClass();
        errorReporter.getClass();
        realRouter$Factory$Impl.getClass();
        return new EducationStoryPresenter(analytics, androidStringManager, realDeepLinkParser, realEducationStoryRepository, androidClock, errorReporter, realRouter$Factory$Impl, educationStoryScreen, screenNavigator);
    }
}
