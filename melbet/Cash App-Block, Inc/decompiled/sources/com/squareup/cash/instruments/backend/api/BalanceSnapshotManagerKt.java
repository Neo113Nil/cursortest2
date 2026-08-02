package com.squareup.cash.instruments.backend.api;

import com.squareup.cash.instruments.common.BalanceSnapshot;
import com.squareup.protos.franklin.api.CashInstrumentType;
import com.squareup.protos.franklin.api.Instrument;

/* loaded from: classes6.dex */
public abstract class BalanceSnapshotManagerKt {
    public static final Instrument toInstrumentProto(BalanceSnapshot balanceSnapshot) {
        balanceSnapshot.getClass();
        return new Instrument(balanceSnapshot.token, CashInstrumentType.CASH_BALANCE, null, null, null, null, null, balanceSnapshot.balance, balanceSnapshot.version, null, null, null, null, null, null, null, null, 536849408);
    }
}
