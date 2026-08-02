package com.squareup.cash.remittances.syncvalue.v1;

import com.squareup.cash.remittances.syncvalue.v1.InternationalPaymentsCountrySelectionSyncValue;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class InternationalPaymentsCountrySelectionSyncValue$SupportedDestinationCountry$TapAction$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        InternationalPaymentsCountrySelectionSyncValue.SupportedDestinationCountry.TapAction.Companion.getClass();
        if (i == 0) {
            return InternationalPaymentsCountrySelectionSyncValue.SupportedDestinationCountry.TapAction.CLIENT_ROUTE;
        }
        if (i != 1) {
            return null;
        }
        return InternationalPaymentsCountrySelectionSyncValue.SupportedDestinationCountry.TapAction.INITIATE_REMITTANCE;
    }
}
