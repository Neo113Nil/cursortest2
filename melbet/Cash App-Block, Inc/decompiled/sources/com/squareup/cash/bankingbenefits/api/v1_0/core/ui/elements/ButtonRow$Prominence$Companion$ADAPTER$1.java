package com.squareup.cash.bankingbenefits.api.v1_0.core.ui.elements;

import com.squareup.cash.bankingbenefits.api.v1_0.core.ui.elements.ButtonRow;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes5.dex */
public final class ButtonRow$Prominence$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        ButtonRow.Prominence.Companion.getClass();
        if (i == 0) {
            return ButtonRow.Prominence.UNSPECIFIED;
        }
        if (i == 1) {
            return ButtonRow.Prominence.PROMINENT;
        }
        if (i == 2) {
            return ButtonRow.Prominence.STANDARD;
        }
        if (i != 3) {
            return null;
        }
        return ButtonRow.Prominence.SUBTLE;
    }
}
