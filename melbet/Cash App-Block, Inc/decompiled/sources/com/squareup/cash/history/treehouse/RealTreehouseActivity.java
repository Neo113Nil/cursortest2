package com.squareup.cash.history.treehouse;

import app.cash.badging.backend.Badger$collect$3;
import app.cash.redwood.treehouse.RealTreehouseApp;
import com.squareup.cash.treehouse.android.RegisteredTreehouseApp;
import com.squareup.cash.treehouse.android.TreehouseModule$provideCashTreehouseAppFactory$1;
import com.squareup.cash.treehouse.android.configuration.RealTreehouseConfigurationStore;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import papa.InteractionRuleClient$$ExternalSyntheticLambda0;

/* loaded from: classes.dex */
public final class RealTreehouseActivity implements RegisteredTreehouseApp {
    public final Lazy treehouseApp$delegate;

    public RealTreehouseActivity(TreehouseModule$provideCashTreehouseAppFactory$1 treehouseModule$provideCashTreehouseAppFactory$1, RealTreehouseConfigurationStore realTreehouseConfigurationStore) {
        new Badger$collect$3(2, null, 3);
        this.treehouseApp$delegate = LazyKt.lazy(new InteractionRuleClient$$ExternalSyntheticLambda0(6, realTreehouseConfigurationStore, treehouseModule$provideCashTreehouseAppFactory$1));
        CollectionsKt__CollectionsJVMKt.listOf(RegisteredTreehouseApp.FeatureFlagState.ENABLED);
    }

    @Override // com.squareup.cash.treehouse.android.RegisteredTreehouseApp
    public final RealTreehouseApp getTreehouseApp() {
        return (RealTreehouseApp) this.treehouseApp$delegate.getValue();
    }
}
