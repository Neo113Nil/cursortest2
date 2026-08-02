package com.squareup.cash.cryptonauts.api;

import com.squareup.cash.cryptonauts.api.SetBtcP2pConversionBpsV2Response;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes6.dex */
public final class SetBtcP2pConversionBpsV2Response$Status$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        SetBtcP2pConversionBpsV2Response.Status.Companion.getClass();
        if (i == 0) {
            return SetBtcP2pConversionBpsV2Response.Status.UNKNOWN;
        }
        if (i == 1) {
            return SetBtcP2pConversionBpsV2Response.Status.SUCCESS;
        }
        if (i != 2) {
            return null;
        }
        return SetBtcP2pConversionBpsV2Response.Status.FAILED;
    }
}
