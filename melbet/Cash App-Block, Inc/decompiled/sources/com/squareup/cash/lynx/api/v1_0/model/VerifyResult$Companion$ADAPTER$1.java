package com.squareup.cash.lynx.api.v1_0.model;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes6.dex */
public final class VerifyResult$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        VerifyResult.Companion.getClass();
        switch (i) {
            case 0:
                return VerifyResult.UNSPECIFIED;
            case 1:
                return VerifyResult.VERIFY_SUCCESSFUL;
            case 2:
                return VerifyResult.VERIFY_FAILED;
            case 3:
                return VerifyResult.THREEDS_AUTHENTICATION_REQUIRED;
            case 4:
                return VerifyResult.NOT_VERIFIABLE;
            case 5:
                return VerifyResult.INVALID_ARGUMENT;
            case 6:
                return VerifyResult.INVALID_POSTAL_CODE_FOR_COUNTRY;
            default:
                return null;
        }
    }
}
