package com.squareup.cash.bitcoin.presenters.applet.toolbar;

import com.squareup.cash.bitcoin.navigation.RealBitcoinInboundNavigator;
import com.squareup.cash.bitcoin.navigation.RealBitcoinInboundNavigator$Factory$Impl;
import com.squareup.cash.bitcoin.presenters.investing.RealBitcoinSponsoredStateRepo;
import com.squareup.cash.bitcoin.presenters.map.RealBitcoinMapEligibilityManager;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.family.familyhub.backend.real.RealDependentCustomerTokenRepository;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.recipients.data.RealCustomerStore;
import com.squareup.cash.resource.text.AndroidStringManager;

/* loaded from: classes5.dex */
public final class RealBitcoinHomeToolbarPresenter {
    public final Analytics analytics;
    public final RealBitcoinInboundNavigator bitcoinInboundNavigator;
    public final RealBitcoinMapEligibilityManager bitcoinMapEligibilityManager;
    public final RealCustomerStore customerStore;
    public final String dependentCustomerToken;
    public final BetterNavigator.ScreenNavigator navigator;
    public final RealBitcoinSponsoredStateRepo sponsoredStateRepo;
    public final AndroidStringManager stringManager;

    public RealBitcoinHomeToolbarPresenter(RealBitcoinInboundNavigator$Factory$Impl realBitcoinInboundNavigator$Factory$Impl, AndroidStringManager androidStringManager, RealBitcoinSponsoredStateRepo realBitcoinSponsoredStateRepo, Analytics analytics, RealDependentCustomerTokenRepository realDependentCustomerTokenRepository, RealCustomerStore realCustomerStore, RealBitcoinMapEligibilityManager realBitcoinMapEligibilityManager, BetterNavigator.ScreenNavigator screenNavigator) {
        this.stringManager = androidStringManager;
        this.sponsoredStateRepo = realBitcoinSponsoredStateRepo;
        this.analytics = analytics;
        this.customerStore = realCustomerStore;
        this.bitcoinMapEligibilityManager = realBitcoinMapEligibilityManager;
        this.navigator = screenNavigator;
        this.bitcoinInboundNavigator = realBitcoinInboundNavigator$Factory$Impl.create(screenNavigator);
        this.dependentCustomerToken = realDependentCustomerTokenRepository.getCustomerToken();
    }
}
