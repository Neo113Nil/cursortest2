package com.squareup.cash.reactions.real;

import androidx.room.util.DBUtil;
import app.cash.badging.backend.FinishSetupTileBadgeCounter;
import com.squareup.cash.data.db.AppConfigManager;
import com.squareup.cash.data.db.RealAppConfigManager;
import com.squareup.cash.db2.ReactionConfig;
import com.squareup.util.coroutines.StateFlowKt;
import com.squareup.util.coroutines.Teardown;
import com.squareup.util.coroutines.UiSetupTeardown;
import kotlin.collections.EmptyList;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.ReadonlyStateFlow;
import kotlinx.coroutines.flow.SharingStarted;

/* loaded from: classes.dex */
public final class RealSharedReactionState implements UiSetupTeardown {
    public final AppConfigManager configManager;
    public ReadonlyStateFlow reactionConfig;

    public RealSharedReactionState(AppConfigManager appConfigManager) {
        this.configManager = appConfigManager;
    }

    @Override // com.squareup.util.coroutines.UnitSetupTeardown
    public final Teardown setup(CoroutineScope coroutineScope) {
        coroutineScope.getClass();
        RealAppConfigManager realAppConfigManager = (RealAppConfigManager) this.configManager;
        this.reactionConfig = FlowKt.stateIn(new FinishSetupTileBadgeCounter(4, DBUtil.toFlow(realAppConfigManager.reactionConfigQueries.select$2()), realAppConfigManager.ioDispatcher), coroutineScope, SharingStarted.Companion.Eagerly, new ReactionConfig(0L, EmptyList.INSTANCE));
        return StateFlowKt.noOpTeardown;
    }
}
