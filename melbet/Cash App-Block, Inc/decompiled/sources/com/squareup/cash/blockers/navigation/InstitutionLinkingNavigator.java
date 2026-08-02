package com.squareup.cash.blockers.navigation;

import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.protos.franklin.common.scenarios.BankAccountLinkingConfig;
import com.squareup.protos.franklin.common.scenarios.CardBlockerSupplement;

/* loaded from: classes4.dex */
public abstract class InstitutionLinkingNavigator {
    public static BlockersScreens.PlaidLinkScreen linkWithPlaid(BlockersData blockersData, CardBlockerSupplement cardBlockerSupplement) {
        BankAccountLinkingConfig bankAccountLinkingConfig;
        return new BlockersScreens.PlaidLinkScreen(blockersData, (cardBlockerSupplement == null || (bankAccountLinkingConfig = cardBlockerSupplement.bank_account_linking_config) == null) ? null : bankAccountLinkingConfig.plaid_linking_config);
    }

    public static BlockersScreens.StripeLinkScreen linkWithStripe(BlockersData blockersData) {
        return new BlockersScreens.StripeLinkScreen(blockersData);
    }
}
