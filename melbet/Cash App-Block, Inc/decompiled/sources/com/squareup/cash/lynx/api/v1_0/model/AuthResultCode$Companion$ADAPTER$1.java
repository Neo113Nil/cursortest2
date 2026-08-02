package com.squareup.cash.lynx.api.v1_0.model;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes6.dex */
public final class AuthResultCode$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        AuthResultCode.Companion.getClass();
        if (i == 0) {
            return AuthResultCode.UNKNOWN_AUTH_RESULT;
        }
        if (i == 1) {
            return AuthResultCode.SUCCESSFUL_AUTH;
        }
        if (i == 2) {
            return AuthResultCode.DECLINED_AUTH;
        }
        if (i != 3) {
            return null;
        }
        return AuthResultCode.AUTH_ERROR;
    }
}
