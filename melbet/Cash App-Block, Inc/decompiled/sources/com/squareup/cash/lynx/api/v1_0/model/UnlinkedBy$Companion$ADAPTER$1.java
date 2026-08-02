package com.squareup.cash.lynx.api.v1_0.model;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes6.dex */
public final class UnlinkedBy$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        UnlinkedBy.Companion.getClass();
        if (i == 0) {
            return UnlinkedBy.UNKNOWN_BY;
        }
        if (i == 1) {
            return UnlinkedBy.CUSTOMER;
        }
        if (i == 2) {
            return UnlinkedBy.SYSTEM;
        }
        if (i != 3) {
            return null;
        }
        return UnlinkedBy.CUSTOMER_SUPPORT;
    }
}
