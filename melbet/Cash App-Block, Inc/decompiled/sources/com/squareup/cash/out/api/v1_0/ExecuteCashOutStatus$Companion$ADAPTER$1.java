package com.squareup.cash.out.api.v1_0;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes6.dex */
public final class ExecuteCashOutStatus$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        ExecuteCashOutStatus.Companion.getClass();
        if (i == 0) {
            return ExecuteCashOutStatus.SUCCEEDED;
        }
        if (i == 1) {
            return ExecuteCashOutStatus.WORKING;
        }
        if (i == 2) {
            return ExecuteCashOutStatus.FAILED;
        }
        if (i != 3) {
            return null;
        }
        return ExecuteCashOutStatus.REVERSED;
    }
}
