package com.squareup.cash.profile.presenters;

import dev.zacsweers.metro.LambdaProvider;
import dev.zacsweers.metro.internal.DoubleCheck;

/* loaded from: classes.dex */
public final class OpenSourcePresenter$MetroFactory {
    public final DoubleCheck context;
    public final DoubleCheck intentFactory;
    public final LambdaProvider ioDispatcher;
    public final LambdaProvider moshi;

    public OpenSourcePresenter$MetroFactory(LambdaProvider lambdaProvider, LambdaProvider lambdaProvider2, DoubleCheck doubleCheck, DoubleCheck doubleCheck2) {
        this.moshi = lambdaProvider;
        this.ioDispatcher = lambdaProvider2;
        this.context = doubleCheck;
        this.intentFactory = doubleCheck2;
    }

    public /* synthetic */ OpenSourcePresenter$MetroFactory(DoubleCheck doubleCheck, LambdaProvider lambdaProvider, LambdaProvider lambdaProvider2, DoubleCheck doubleCheck2) {
        this.context = doubleCheck;
        this.moshi = lambdaProvider;
        this.ioDispatcher = lambdaProvider2;
        this.intentFactory = doubleCheck2;
    }
}
