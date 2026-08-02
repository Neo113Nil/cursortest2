package com.squareup.cash.borrow.presenters;

import androidx.datastore.core.SimpleActor;
import com.miteksystems.misnap.camera.a.n;
import com.squareup.cash.borrow.presenters.LoanAmountPickerPresenter;
import com.squareup.cash.borrow.presenters.util.RealLoanFlowStarter$MetroFactory;
import com.squareup.cash.borrow.screens.LoanAmountPicker;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.moneyformatter.real.LocalizedMoneyFormatter;
import com.squareup.cash.resource.text.AndroidStringManager;
import dev.zacsweers.metro.LambdaProvider;
import dev.zacsweers.metro.Provider;
import dev.zacsweers.metro.internal.DoubleCheck;

/* loaded from: classes.dex */
public final class LoanAmountPickerPresenter$Factory$Impl {
    public final SimpleActor delegateFactory;

    public LoanAmountPickerPresenter$Factory$Impl(SimpleActor simpleActor) {
        this.delegateFactory = simpleActor;
    }

    public final LoanAmountPickerPresenter create(LoanAmountPickerPresenter.Mode mode, LoanAmountPicker loanAmountPicker, BetterNavigator.ScreenNavigator screenNavigator) {
        loanAmountPicker.getClass();
        SimpleActor simpleActor = this.delegateFactory;
        AndroidStringManager androidStringManager = (AndroidStringManager) ((LambdaProvider) simpleActor.scope).lambda.invoke();
        n nVar = (n) ((RealLoanFlowStarter$MetroFactory) simpleActor.consumeMessage).invoke();
        Analytics analytics = (Analytics) ((DoubleCheck) simpleActor.messageQueue).getValue();
        LocalizedMoneyFormatter.Factory factory = (LocalizedMoneyFormatter.Factory) ((Provider) simpleActor.remainingMessages).invoke();
        androidStringManager.getClass();
        analytics.getClass();
        factory.getClass();
        return new LoanAmountPickerPresenter(androidStringManager, nVar, analytics, factory, mode, loanAmountPicker, screenNavigator);
    }
}
