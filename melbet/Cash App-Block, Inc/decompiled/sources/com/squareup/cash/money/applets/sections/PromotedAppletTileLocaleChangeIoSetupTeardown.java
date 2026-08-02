package com.squareup.cash.money.applets.sections;

import com.squareup.cash.boost.backend.RealBoostSelector;
import com.squareup.cash.localization.RealLocaleManager;
import com.squareup.preferences.KeyValue;
import com.squareup.util.coroutines.IoSetupTeardown;
import com.squareup.util.coroutines.StateFlowKt;
import com.squareup.util.coroutines.Teardown;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.JobKt;

/* loaded from: classes.dex */
public final class PromotedAppletTileLocaleChangeIoSetupTeardown implements IoSetupTeardown {
    public final RealLocaleManager localeManager;
    public final KeyValue promotedAppletTileCacheLocale;
    public final RealPromotedAppletTileStore promotedAppletTileStore;

    public PromotedAppletTileLocaleChangeIoSetupTeardown(RealLocaleManager realLocaleManager, RealPromotedAppletTileStore realPromotedAppletTileStore, KeyValue keyValue) {
        this.localeManager = realLocaleManager;
        this.promotedAppletTileStore = realPromotedAppletTileStore;
        this.promotedAppletTileCacheLocale = keyValue;
    }

    @Override // com.squareup.util.coroutines.UnitSetupTeardown
    public final Teardown setup(CoroutineScope coroutineScope) {
        coroutineScope.getClass();
        JobKt.launch$default(coroutineScope, null, CoroutineStart.DEFAULT, new RealBoostSelector.AnonymousClass1((Continuation) null, this, 23), 1);
        return StateFlowKt.noOpTeardown;
    }
}
