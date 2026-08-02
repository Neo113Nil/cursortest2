package com.squareup.cash.out.sync_entity;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes6.dex */
public final class BankAccountQualifier$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        BankAccountQualifier.Companion.getClass();
        if (i == 0) {
            return BankAccountQualifier.NO_BANK_QUALIFIER;
        }
        return null;
    }
}
