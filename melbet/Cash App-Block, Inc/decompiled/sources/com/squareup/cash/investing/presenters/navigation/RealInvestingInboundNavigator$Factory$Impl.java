package com.squareup.cash.investing.presenters.navigation;

import androidx.emoji2.text.MetadataRepo;
import app.cash.broadway.navigation.Navigator;
import com.squareup.cash.investing.backend.real.RealInvestingStateManager;
import com.squareup.cash.work.presenters.RealYouPresenter$MetroFactory;
import com.squareup.preferences.KeyValue;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes.dex */
public final class RealInvestingInboundNavigator$Factory$Impl {
    public final RealYouPresenter$MetroFactory delegateFactory;

    public RealInvestingInboundNavigator$Factory$Impl(RealYouPresenter$MetroFactory realYouPresenter$MetroFactory) {
        this.delegateFactory = realYouPresenter$MetroFactory;
    }

    public final MetadataRepo create$1(Navigator navigator) {
        navigator.getClass();
        RealYouPresenter$MetroFactory realYouPresenter$MetroFactory = this.delegateFactory;
        RealInvestingStateManager realInvestingStateManager = (RealInvestingStateManager) realYouPresenter$MetroFactory.assignedJobProvider.invoke();
        CoroutineContext coroutineContext = (CoroutineContext) realYouPresenter$MetroFactory.assignedLocationProvider.invoke();
        KeyValue keyValue = (KeyValue) realYouPresenter$MetroFactory.passcodeProvider.invoke();
        realInvestingStateManager.getClass();
        coroutineContext.getClass();
        keyValue.getClass();
        return new MetadataRepo(realInvestingStateManager, coroutineContext, keyValue, navigator);
    }
}
