package com.squareup.cash.savings.presenters;

import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.moneyformatter.real.LocalizedMoneyFormatter;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.savings.screens.TransferInScreen;
import com.squareup.cash.work.presenters.WorkHomePresenter;

/* loaded from: classes.dex */
public final class TransferInPresenter$Factory$Impl {
    public final TransferInPresenter$MetroFactory delegateFactory;

    public TransferInPresenter$Factory$Impl(TransferInPresenter$MetroFactory transferInPresenter$MetroFactory) {
        this.delegateFactory = transferInPresenter$MetroFactory;
    }

    public final WorkHomePresenter create(TransferInScreen transferInScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        TransferInPresenter$MetroFactory transferInPresenter$MetroFactory = this.delegateFactory;
        AndroidStringManager androidStringManager = (AndroidStringManager) transferInPresenter$MetroFactory.stringManager.lambda.invoke();
        Analytics analytics = (Analytics) transferInPresenter$MetroFactory.analytics.getValue();
        LocalizedMoneyFormatter.Factory factory = (LocalizedMoneyFormatter.Factory) transferInPresenter$MetroFactory.moneyFormatterFactory.invoke();
        androidStringManager.getClass();
        analytics.getClass();
        factory.getClass();
        return new WorkHomePresenter(transferInScreen, screenNavigator, androidStringManager, analytics, factory);
    }
}
