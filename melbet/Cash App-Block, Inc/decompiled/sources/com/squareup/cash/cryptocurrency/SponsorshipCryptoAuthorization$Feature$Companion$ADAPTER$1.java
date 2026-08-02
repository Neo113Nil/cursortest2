package com.squareup.cash.cryptocurrency;

import com.squareup.cash.cryptocurrency.SponsorshipCryptoAuthorization;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes6.dex */
public final class SponsorshipCryptoAuthorization$Feature$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        SponsorshipCryptoAuthorization.Feature.Companion.getClass();
        if (i == 1) {
            return SponsorshipCryptoAuthorization.Feature.BTC_EXCHANGE;
        }
        return null;
    }
}
