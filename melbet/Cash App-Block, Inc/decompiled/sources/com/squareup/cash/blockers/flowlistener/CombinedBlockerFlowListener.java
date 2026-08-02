package com.squareup.cash.blockers.flowlistener;

import app.cash.broadway.screen.Screen;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.protos.franklin.api.ClientScenario;
import com.squareup.protos.franklin.common.scenarios.BlockerDescriptor;
import com.squareup.protos.franklin.common.scenarios.ScenarioPlan;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
public final class CombinedBlockerFlowListener implements BlockerFlowListener {
    public final Set listeners;

    public CombinedBlockerFlowListener(Set set) {
        this.listeners = set;
    }

    @Override // com.squareup.cash.blockers.flowlistener.BlockerFlowListener
    public final void onBlockerPresented(BlockersData blockersData, String str, String str2, BlockerDescriptor blockerDescriptor) {
        blockerDescriptor.getClass();
        Iterator it = this.listeners.iterator();
        while (it.hasNext()) {
            ((BlockerFlowListener) it.next()).onBlockerPresented(blockersData, str, str2, blockerDescriptor);
        }
    }

    @Override // com.squareup.cash.blockers.flowlistener.BlockerFlowListener
    public final void onFlowCancelled(BlockersData blockersData) {
        blockersData.getClass();
        Iterator it = this.listeners.iterator();
        while (it.hasNext()) {
            ((BlockerFlowListener) it.next()).onFlowCancelled(blockersData);
        }
    }

    @Override // com.squareup.cash.blockers.flowlistener.BlockerFlowListener
    public final void onFlowCompleted(BlockersData blockersData) {
        blockersData.getClass();
        Iterator it = this.listeners.iterator();
        while (it.hasNext()) {
            ((BlockerFlowListener) it.next()).onFlowCompleted(blockersData);
        }
    }

    @Override // com.squareup.cash.blockers.flowlistener.BlockerFlowListener
    public final void onFlowStarted(BlockersData blockersData, String str, ScenarioPlan scenarioPlan, ClientScenario clientScenario) {
        blockersData.getClass();
        str.getClass();
        Iterator it = this.listeners.iterator();
        while (it.hasNext()) {
            ((BlockerFlowListener) it.next()).onFlowStarted(blockersData, str, scenarioPlan, clientScenario);
        }
    }

    @Override // com.squareup.cash.blockers.flowlistener.BlockerFlowListener
    public final void onNavigation(Screen screen, Screen screen2, boolean z) {
        screen2.getClass();
        Iterator it = this.listeners.iterator();
        while (it.hasNext()) {
            ((BlockerFlowListener) it.next()).onNavigation(screen, screen2, z);
        }
    }
}
