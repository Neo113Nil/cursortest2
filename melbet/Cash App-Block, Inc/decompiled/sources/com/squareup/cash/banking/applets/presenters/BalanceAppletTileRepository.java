package com.squareup.cash.banking.applets.presenters;

import app.cash.badging.backend.RealBadger2$setup$lambda$0$$inlined$mapNotNull$1;
import kotlinx.coroutines.flow.ReadonlyStateFlow;

/* loaded from: classes5.dex */
public interface BalanceAppletTileRepository {
    RealBadger2$setup$lambda$0$$inlined$mapNotNull$1 addMoneyTransferData();

    ReadonlyStateFlow balanceModel();

    RealBadger2$setup$lambda$0$$inlined$mapNotNull$1 withdrawTransferData();
}
