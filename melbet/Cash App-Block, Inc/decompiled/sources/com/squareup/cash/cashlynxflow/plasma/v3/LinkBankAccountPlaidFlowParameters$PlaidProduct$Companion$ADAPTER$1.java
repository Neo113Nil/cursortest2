package com.squareup.cash.cashlynxflow.plasma.v3;

import com.squareup.cash.cashlynxflow.plasma.v3.LinkBankAccountPlaidFlowParameters;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes6.dex */
public final class LinkBankAccountPlaidFlowParameters$PlaidProduct$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        LinkBankAccountPlaidFlowParameters.PlaidProduct.Companion.getClass();
        if (i == 0) {
            return LinkBankAccountPlaidFlowParameters.PlaidProduct.PLAID_PRODUCT_UNSPECIFIED;
        }
        if (i != 1) {
            return null;
        }
        return LinkBankAccountPlaidFlowParameters.PlaidProduct.PLAID_PRODUCT_ASSETS;
    }
}
