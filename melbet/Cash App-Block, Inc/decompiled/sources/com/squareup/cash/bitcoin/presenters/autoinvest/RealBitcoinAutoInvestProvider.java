package com.squareup.cash.bitcoin.presenters.autoinvest;

import com.squareup.cash.crypto.backend.autoinvest.CryptoAutoInvestRepo;
import com.squareup.cash.family.familyhub.backend.api.DependentRecurringPreferenceStore;
import com.squareup.cash.family.familyhub.backend.real.RealDependentCustomerTokenRepository;

/* loaded from: classes4.dex */
public final class RealBitcoinAutoInvestProvider implements BitcoinAutoInvestProvider {
    public final CryptoAutoInvestRepo cryptoAutoInvestRepo;
    public final RealDependentCustomerTokenRepository dependentCustomerTokenRepository;
    public final DependentRecurringPreferenceStore dependentRecurringPreferenceStore;

    public RealBitcoinAutoInvestProvider(CryptoAutoInvestRepo cryptoAutoInvestRepo, DependentRecurringPreferenceStore dependentRecurringPreferenceStore, RealDependentCustomerTokenRepository realDependentCustomerTokenRepository) {
        this.cryptoAutoInvestRepo = cryptoAutoInvestRepo;
        this.dependentRecurringPreferenceStore = dependentRecurringPreferenceStore;
        this.dependentCustomerTokenRepository = realDependentCustomerTokenRepository;
    }
}
