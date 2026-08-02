package com.squareup.cash.history.presenters;

import dev.zacsweers.metro.LambdaProvider;
import dev.zacsweers.metro.internal.DoubleCheck;

/* loaded from: classes.dex */
public final class SkipPaymentPresenter$MetroFactory {
    public final DoubleCheck activityEntityManager;
    public final DoubleCheck paymentManager;
    public final LambdaProvider stringManager;

    public /* synthetic */ SkipPaymentPresenter$MetroFactory(LambdaProvider lambdaProvider, DoubleCheck doubleCheck, DoubleCheck doubleCheck2) {
        this.stringManager = lambdaProvider;
        this.activityEntityManager = doubleCheck;
        this.paymentManager = doubleCheck2;
    }

    public /* synthetic */ SkipPaymentPresenter$MetroFactory(DoubleCheck doubleCheck, LambdaProvider lambdaProvider, DoubleCheck doubleCheck2) {
        this.activityEntityManager = doubleCheck;
        this.stringManager = lambdaProvider;
        this.paymentManager = doubleCheck2;
    }

    public /* synthetic */ SkipPaymentPresenter$MetroFactory(DoubleCheck doubleCheck, DoubleCheck doubleCheck2, LambdaProvider lambdaProvider) {
        this.activityEntityManager = doubleCheck;
        this.paymentManager = doubleCheck2;
        this.stringManager = lambdaProvider;
    }
}
