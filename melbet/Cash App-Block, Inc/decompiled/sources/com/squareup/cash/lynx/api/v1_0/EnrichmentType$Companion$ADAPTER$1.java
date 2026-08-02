package com.squareup.cash.lynx.api.v1_0;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes6.dex */
public final class EnrichmentType$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        EnrichmentType.Companion.getClass();
        switch (i) {
            case 1:
                return EnrichmentType.BINFO_DETAILS;
            case 2:
                return EnrichmentType.BANKINFO_DETAILS;
            case 3:
                return EnrichmentType.BROWSER_INTERACTION_DETAILS;
            case 4:
                return EnrichmentType.MICROAUTH_VERIFICATION_DETAILS;
            case 5:
                return EnrichmentType.SVB_BALANCE_DETAILS;
            case 6:
                return EnrichmentType.INSTRUMENT_LINK_METADATA;
            case 7:
                return EnrichmentType.INSTRUMENT_LINK_OWNER_DETAILS;
            default:
                return null;
        }
    }
}
