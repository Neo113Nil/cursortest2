package com.squareup.cash.bitcoin.presenters.limits.util;

import kotlinx.coroutines.flow.Flow;

/* loaded from: classes5.dex */
public interface BitcoinLimitsProvider {
    Flow getBuyLimit();

    Flow getLightningWeeklyDepositLimitUsd();

    Flow getMinimumWithdrawalLimit();

    Flow getSellLimit();
}
