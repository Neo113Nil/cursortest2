package com.squareup.cash.onboarding.presenters;

import dev.zacsweers.metro.LambdaProvider;
import dev.zacsweers.metro.internal.DoubleCheck;

/* loaded from: classes.dex */
public final class OnboardingLandingPresenter$MetroFactory {
    public final DoubleCheck analytics;
    public final LambdaProvider observabilityManager;
    public final LambdaProvider stringManager;

    public OnboardingLandingPresenter$MetroFactory(LambdaProvider lambdaProvider, LambdaProvider lambdaProvider2, DoubleCheck doubleCheck) {
        this.observabilityManager = lambdaProvider;
        this.stringManager = lambdaProvider2;
        this.analytics = doubleCheck;
    }

    public /* synthetic */ OnboardingLandingPresenter$MetroFactory(LambdaProvider lambdaProvider, DoubleCheck doubleCheck, LambdaProvider lambdaProvider2) {
        this.observabilityManager = lambdaProvider;
        this.analytics = doubleCheck;
        this.stringManager = lambdaProvider2;
    }

    public /* synthetic */ OnboardingLandingPresenter$MetroFactory(DoubleCheck doubleCheck, LambdaProvider lambdaProvider, LambdaProvider lambdaProvider2) {
        this.analytics = doubleCheck;
        this.observabilityManager = lambdaProvider;
        this.stringManager = lambdaProvider2;
    }
}
