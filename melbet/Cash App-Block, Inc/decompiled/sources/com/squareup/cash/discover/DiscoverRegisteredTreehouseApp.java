package com.squareup.cash.discover;

import app.cash.redwood.treehouse.RealTreehouseApp;
import com.squareup.cash.blockers.treehouse.TreehouseFlows$$ExternalSyntheticLambda0;
import com.squareup.cash.treehouse.android.RegisteredTreehouseApp;
import com.squareup.cash.treehouse.android.TreehouseModule$provideCashTreehouseAppFactory$1;
import com.squareup.cash.treehouse.android.broadway.TreehouseScreenFactory;
import com.squareup.cash.treehouse.android.configuration.RealTreehouseConfigurationStore;
import kotlinx.coroutines.flow.FlowKt;

/* loaded from: classes.dex */
public final class DiscoverRegisteredTreehouseApp implements RegisteredTreehouseApp {
    public final /* synthetic */ int $r8$classId;
    public final RealTreehouseApp treehouseApp;

    public DiscoverRegisteredTreehouseApp(TreehouseModule$provideCashTreehouseAppFactory$1 treehouseModule$provideCashTreehouseAppFactory$1, RealTreehouseConfigurationStore realTreehouseConfigurationStore, TreehouseScreenFactory treehouseScreenFactory, int i) {
        this.$r8$classId = i;
        switch (i) {
            case 1:
                this.treehouseApp = treehouseModule$provideCashTreehouseAppFactory$1.create(realTreehouseConfigurationStore.manifestUrlFlow("bitcoin"), "bitcoin", new TreehouseFlows$$ExternalSyntheticLambda0(realTreehouseConfigurationStore, 3));
                FlowKt.MutableStateFlow(RegisteredTreehouseApp.FeatureFlagState.NONE);
                break;
            case 2:
                this.treehouseApp = treehouseModule$provideCashTreehouseAppFactory$1.create(realTreehouseConfigurationStore.manifestUrlFlow("cash-app-pay"), "cash-app-pay", new TreehouseFlows$$ExternalSyntheticLambda0(realTreehouseConfigurationStore, 4));
                FlowKt.MutableStateFlow(RegisteredTreehouseApp.FeatureFlagState.NONE);
                break;
            case 3:
                this.treehouseApp = treehouseModule$provideCashTreehouseAppFactory$1.create(realTreehouseConfigurationStore.manifestUrlFlow("financial-services"), "financial-services", new TreehouseFlows$$ExternalSyntheticLambda0(realTreehouseConfigurationStore, 5));
                FlowKt.MutableStateFlow(RegisteredTreehouseApp.FeatureFlagState.NONE);
                break;
            case 4:
                this.treehouseApp = treehouseModule$provideCashTreehouseAppFactory$1.create(realTreehouseConfigurationStore.manifestUrlFlow("marketing"), "marketing", new TreehouseFlows$$ExternalSyntheticLambda0(realTreehouseConfigurationStore, 6));
                FlowKt.MutableStateFlow(RegisteredTreehouseApp.FeatureFlagState.NONE);
                break;
            default:
                this.treehouseApp = treehouseModule$provideCashTreehouseAppFactory$1.create(realTreehouseConfigurationStore.manifestUrlFlow("discover"), "discover", new TreehouseFlows$$ExternalSyntheticLambda0(realTreehouseConfigurationStore, 1));
                FlowKt.MutableStateFlow(RegisteredTreehouseApp.FeatureFlagState.NONE);
                break;
        }
    }

    @Override // com.squareup.cash.treehouse.android.RegisteredTreehouseApp
    public final RealTreehouseApp getTreehouseApp() {
        switch (this.$r8$classId) {
        }
        return this.treehouseApp;
    }
}
