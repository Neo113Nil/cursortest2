package com.squareup.cash.cashsubscriptions.phoneplans.api.v1_0.app;

import com.squareup.cash.cashsubscriptions.phoneplans.api.v1_0.app.GetNewLineActivationStatusResponse;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes6.dex */
public final class GetNewLineActivationStatusResponse$ActivationStatus$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        GetNewLineActivationStatusResponse.ActivationStatus.Companion.getClass();
        if (i == 0) {
            return GetNewLineActivationStatusResponse.ActivationStatus.ACTIVATION_STATUS_UNSPECIFIED;
        }
        if (i == 1) {
            return GetNewLineActivationStatusResponse.ActivationStatus.PENDING;
        }
        if (i == 2) {
            return GetNewLineActivationStatusResponse.ActivationStatus.ACTIVATED;
        }
        if (i != 3) {
            return null;
        }
        return GetNewLineActivationStatusResponse.ActivationStatus.FAILED;
    }
}
