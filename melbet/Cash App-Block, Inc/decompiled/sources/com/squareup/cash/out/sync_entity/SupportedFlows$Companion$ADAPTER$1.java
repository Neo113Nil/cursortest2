package com.squareup.cash.out.sync_entity;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes6.dex */
public final class SupportedFlows$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        SupportedFlows.Companion.getClass();
        if (i == 0) {
            return SupportedFlows.INSTANT_CASH_OUT;
        }
        if (i != 1) {
            return null;
        }
        return SupportedFlows.STANDARD_CASH_OUT;
    }
}
