package com.squareup.cash.blockers.flowlistener;

import app.cash.broadway.screen.Screen;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.protos.franklin.api.ClientScenario;
import com.squareup.protos.franklin.common.scenarios.BlockerDescriptor;
import com.squareup.protos.franklin.common.scenarios.ScenarioPlan;

/* loaded from: classes.dex */
public interface BlockerFlowListener {
    static void onFlowStarted$default(BlockerFlowListener blockerFlowListener, BlockersData blockersData, ScenarioPlan scenarioPlan, ClientScenario clientScenario, int i) {
        String str = blockersData.flowToken;
        if ((i & 4) != 0) {
            scenarioPlan = blockersData.scenarioPlan;
        }
        if ((i & 8) != 0) {
            clientScenario = blockersData.clientScenario;
        }
        blockerFlowListener.onFlowStarted(blockersData, str, scenarioPlan, clientScenario);
    }

    void onBlockerPresented(BlockersData blockersData, String str, String str2, BlockerDescriptor blockerDescriptor);

    void onFlowCancelled(BlockersData blockersData);

    void onFlowCompleted(BlockersData blockersData);

    void onFlowStarted(BlockersData blockersData, String str, ScenarioPlan scenarioPlan, ClientScenario clientScenario);

    void onNavigation(Screen screen, Screen screen2, boolean z);
}
