package com.squareup.cash.family.familyhub.backend.real;

import com.squareup.cash.cdf.sponsoredaccount.GraphTimeUnit;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.protos.franklin.investing.common.HistoricalRange;
import defpackage.Drop$$ExternalSyntheticBUOutline0;

/* loaded from: classes6.dex */
public final class RealDependentBalanceDetailLoggingManager {
    public final Analytics analytics;
    public final RealDependentCustomerTokenRepository dependentCustomerTokenRepository;

    public RealDependentBalanceDetailLoggingManager(Analytics analytics, RealDependentCustomerTokenRepository realDependentCustomerTokenRepository) {
        this.analytics = analytics;
        this.dependentCustomerTokenRepository = realDependentCustomerTokenRepository;
    }

    public static GraphTimeUnit mapHistoricalRange(HistoricalRange historicalRange) {
        int ordinal = historicalRange.ordinal();
        if (ordinal == 0) {
            return GraphTimeUnit.OneDay;
        }
        if (ordinal == 1) {
            return GraphTimeUnit.OneWeek;
        }
        if (ordinal == 2) {
            return GraphTimeUnit.OneMonth;
        }
        if (ordinal == 3) {
            return GraphTimeUnit.OneYear;
        }
        if (ordinal == 4) {
            return GraphTimeUnit.All;
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return null;
    }
}
