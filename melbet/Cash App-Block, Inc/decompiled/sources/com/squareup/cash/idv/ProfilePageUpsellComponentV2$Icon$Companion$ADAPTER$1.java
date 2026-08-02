package com.squareup.cash.idv;

import com.squareup.cash.idv.ProfilePageUpsellComponentV2;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes6.dex */
public final class ProfilePageUpsellComponentV2$Icon$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        ProfilePageUpsellComponentV2.Icon.Companion.getClass();
        if (i == 1) {
            return ProfilePageUpsellComponentV2.Icon.VERIFYING;
        }
        if (i == 2) {
            return ProfilePageUpsellComponentV2.Icon.VERIFICATION_FAILED;
        }
        if (i == 3) {
            return ProfilePageUpsellComponentV2.Icon.FAILURE;
        }
        if (i != 4) {
            return null;
        }
        return ProfilePageUpsellComponentV2.Icon.ACTION_REQUIRED;
    }
}
