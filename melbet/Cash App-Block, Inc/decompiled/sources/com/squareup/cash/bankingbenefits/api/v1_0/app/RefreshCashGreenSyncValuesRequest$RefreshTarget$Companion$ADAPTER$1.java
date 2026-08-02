package com.squareup.cash.bankingbenefits.api.v1_0.app;

import com.squareup.cash.bankingbenefits.api.v1_0.app.RefreshCashGreenSyncValuesRequest;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes5.dex */
public final class RefreshCashGreenSyncValuesRequest$RefreshTarget$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        RefreshCashGreenSyncValuesRequest.RefreshTarget.Companion.getClass();
        if (i == 0) {
            return RefreshCashGreenSyncValuesRequest.RefreshTarget.UNSPECIFIED;
        }
        if (i == 1) {
            return RefreshCashGreenSyncValuesRequest.RefreshTarget.CASH_GREEN;
        }
        if (i == 2) {
            return RefreshCashGreenSyncValuesRequest.RefreshTarget.GREEN_BENEFITS;
        }
        if (i != 3) {
            return null;
        }
        return RefreshCashGreenSyncValuesRequest.RefreshTarget.GREEN_BOOKLET;
    }
}
