package com.squareup.cash.merchant.presenters;

import com.squareup.cash.retro.views.RetroUiFactory;
import dev.zacsweers.metro.LambdaProvider;
import dev.zacsweers.metro.Provider;
import dev.zacsweers.metro.internal.DoubleCheck;

/* loaded from: classes.dex */
public final class MerchantInfoFeedbackPresenter$MetroFactory {
    public final DoubleCheck analytics;
    public final Provider customerStore;
    public final LambdaProvider sessionManager;
    public final LambdaProvider stringManager;

    public MerchantInfoFeedbackPresenter$MetroFactory(RetroUiFactory.MetroFactory metroFactory, LambdaProvider lambdaProvider, DoubleCheck doubleCheck, LambdaProvider lambdaProvider2) {
        this.customerStore = metroFactory;
        this.stringManager = lambdaProvider;
        this.analytics = doubleCheck;
        this.sessionManager = lambdaProvider2;
    }

    public /* synthetic */ MerchantInfoFeedbackPresenter$MetroFactory(Provider provider, DoubleCheck doubleCheck, LambdaProvider lambdaProvider, LambdaProvider lambdaProvider2) {
        this.customerStore = provider;
        this.analytics = doubleCheck;
        this.stringManager = lambdaProvider;
        this.sessionManager = lambdaProvider2;
    }
}
