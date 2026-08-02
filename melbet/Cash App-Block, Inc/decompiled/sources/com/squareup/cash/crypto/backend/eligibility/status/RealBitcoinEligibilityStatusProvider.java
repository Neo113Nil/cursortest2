package com.squareup.cash.crypto.backend.eligibility.status;

import com.squareup.cash.db2.profile.BalanceData;
import squareup.cash.cryptocurrency.CryptoEligibilities;

/* loaded from: classes6.dex */
public final class RealBitcoinEligibilityStatusProvider {
    public final /* synthetic */ int $r8$classId = 1;
    public final Object eligibilities;

    public RealBitcoinEligibilityStatusProvider(CryptoEligibilities cryptoEligibilities) {
        cryptoEligibilities.getClass();
        this.eligibilities = cryptoEligibilities;
    }

    public RealBitcoinEligibilityStatusProvider(BalanceData balanceData) {
        balanceData.getClass();
        this.eligibilities = balanceData;
    }
}
