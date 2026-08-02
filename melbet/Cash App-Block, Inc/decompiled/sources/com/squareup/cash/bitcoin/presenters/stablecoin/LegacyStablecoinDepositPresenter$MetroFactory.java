package com.squareup.cash.bitcoin.presenters.stablecoin;

import com.squareup.cash.keystore.RealMessageSigner;
import com.squareup.cash.storage.RealFileDownloader;
import dev.zacsweers.metro.LambdaProvider;
import dev.zacsweers.metro.Provider;
import dev.zacsweers.metro.internal.DelegateFactory;
import dev.zacsweers.metro.internal.DoubleCheck;

/* loaded from: classes.dex */
public final class LegacyStablecoinDepositPresenter$MetroFactory {
    public final DoubleCheck blockStableService;
    public final DelegateFactory profileManager;
    public final Provider qrCodesPresenter;
    public final LambdaProvider stringManager;

    public LegacyStablecoinDepositPresenter$MetroFactory(LambdaProvider lambdaProvider, RealMessageSigner.MetroFactory metroFactory, DelegateFactory delegateFactory, DoubleCheck doubleCheck) {
        this.stringManager = lambdaProvider;
        this.qrCodesPresenter = metroFactory;
        this.profileManager = delegateFactory;
        this.blockStableService = doubleCheck;
    }

    public LegacyStablecoinDepositPresenter$MetroFactory(DoubleCheck doubleCheck, RealFileDownloader.MetroFactory metroFactory, DelegateFactory delegateFactory, LambdaProvider lambdaProvider) {
        this.blockStableService = doubleCheck;
        this.qrCodesPresenter = metroFactory;
        this.profileManager = delegateFactory;
        this.stringManager = lambdaProvider;
    }
}
