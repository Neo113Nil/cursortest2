package com.squareup.cash.boost.backend;

import app.cash.local.db.LocalTabContentQueries;
import com.squareup.cash.db.db.CashAccountDatabaseImpl;
import com.squareup.cash.util.clock.AndroidClock;
import com.squareup.protos.rewardly.app.RewardlyExternalAppService;
import com.squareup.util.coroutines.Signal;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes.dex */
public final class RealBoostConfigManager implements BoostConfigManager {
    public final LocalTabContentQueries boostConfigQueries;
    public final AndroidClock clock;
    public final CoroutineContext ioDispatcher;
    public long lastUpdated;
    public final RewardlyExternalAppService service;
    public final Signal signOutSignal;

    public RealBoostConfigManager(RewardlyExternalAppService rewardlyExternalAppService, Signal signal, CashAccountDatabaseImpl cashAccountDatabaseImpl, AndroidClock androidClock, CoroutineContext coroutineContext) {
        this.service = rewardlyExternalAppService;
        this.signOutSignal = signal;
        this.clock = androidClock;
        this.ioDispatcher = coroutineContext;
        this.boostConfigQueries = cashAccountDatabaseImpl.boostConfigQueries;
    }
}
