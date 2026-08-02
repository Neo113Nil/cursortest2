package com.squareup.cash.afterpayapplet.presenters;

import app.cash.broadway.navigation.Navigator;
import com.squareup.cash.activity.presenters.ActivityItemEventHandler;
import com.squareup.cash.afterpayapplet.backend.real.RealAfterpayAppletAnalytics;
import com.squareup.cash.clientrouting.RealRouter$Factory$Impl;
import com.squareup.cash.data.blockers.FlowStarter;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.integration.analytics.RealUuidGenerator;
import com.squareup.cash.localization.LanguageDisclosureSetupTeardown;
import com.squareup.cash.payments.backend.api.PaymentManager;
import com.squareup.cash.resource.AndroidDateFormatManager;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class OrderItemEventHandler$Factory$Impl implements ActivityItemEventHandler.Factory {
    public final LanguageDisclosureSetupTeardown.MetroFactory delegateFactory;

    public OrderItemEventHandler$Factory$Impl(LanguageDisclosureSetupTeardown.MetroFactory metroFactory) {
        this.delegateFactory = metroFactory;
    }

    @Override // com.squareup.cash.activity.presenters.ActivityItemEventHandler.Factory
    public final OrderItemEventHandler create(Navigator navigator, Function1 function1) {
        navigator.getClass();
        LanguageDisclosureSetupTeardown.MetroFactory metroFactory = this.delegateFactory;
        FeatureFlagManager featureFlagManager = (FeatureFlagManager) metroFactory.appService.invoke();
        RealRouter$Factory$Impl realRouter$Factory$Impl = (RealRouter$Factory$Impl) metroFactory.cashAppLiteGate.invoke();
        FlowStarter flowStarter = (FlowStarter) metroFactory.database.invoke();
        RealAfterpayAppletAnalytics realAfterpayAppletAnalytics = (RealAfterpayAppletAnalytics) metroFactory.initialScreenPreludeNavigator.invoke();
        AndroidDateFormatManager androidDateFormatManager = (AndroidDateFormatManager) metroFactory.isLanguageDisclosureAcceptancePending.invoke();
        PaymentManager paymentManager = (PaymentManager) metroFactory.localeManager.invoke();
        RealUuidGenerator realUuidGenerator = (RealUuidGenerator) metroFactory.sessionManager.invoke();
        featureFlagManager.getClass();
        realRouter$Factory$Impl.getClass();
        flowStarter.getClass();
        realAfterpayAppletAnalytics.getClass();
        androidDateFormatManager.getClass();
        paymentManager.getClass();
        realUuidGenerator.getClass();
        return new OrderItemEventHandler(navigator, function1, featureFlagManager, realRouter$Factory$Impl, flowStarter, realAfterpayAppletAnalytics, androidDateFormatManager, paymentManager, realUuidGenerator);
    }
}
