package com.squareup.cash.bankingbenefits.api.v1_0.core.ui.elements;

import com.squareup.cash.bankingbenefits.api.v1_0.core.ui.elements.RowAction;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes5.dex */
public final class RowAction$ID$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        RowAction.ID.Companion.getClass();
        if (i == 0) {
            return RowAction.ID.UNSPECIFIED;
        }
        if (i == 1) {
            return RowAction.ID.OVERDRAFT_COVERAGE;
        }
        if (i == 2) {
            return RowAction.ID.SAVINGS;
        }
        if (i != 3) {
            return null;
        }
        return RowAction.ID.SETUP_DIRECT_DEPOSIT;
    }
}
