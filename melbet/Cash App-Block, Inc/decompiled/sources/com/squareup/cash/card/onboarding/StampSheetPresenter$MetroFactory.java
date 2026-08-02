package com.squareup.cash.card.onboarding;

import dev.zacsweers.metro.LambdaProvider;
import dev.zacsweers.metro.internal.DoubleCheck;

/* loaded from: classes.dex */
public final class StampSheetPresenter$MetroFactory {
    public final DoubleCheck appConfig;
    public final LambdaProvider ioContext;

    public /* synthetic */ StampSheetPresenter$MetroFactory(LambdaProvider lambdaProvider, DoubleCheck doubleCheck) {
        this.ioContext = lambdaProvider;
        this.appConfig = doubleCheck;
    }

    public /* synthetic */ StampSheetPresenter$MetroFactory(DoubleCheck doubleCheck, LambdaProvider lambdaProvider) {
        this.appConfig = doubleCheck;
        this.ioContext = lambdaProvider;
    }
}
