package com.squareup.cash.cashapplite.views;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import com.squareup.cash.cashapplite.viewmodels.ActivityAppletTileViewModel;
import com.squareup.cash.checks.CheckDepositAmountKt$$ExternalSyntheticLambda1;
import com.squareup.cash.money.applets.viewmodels.AppletTile;
import com.squareup.cash.money.core.ids.AppletTileInstallationSectionId;
import com.squareup.cash.money.core.states.AppletTileInstallationState;
import com.squareup.util.coroutines.StateFlowKt$stateFlowOf$1;
import kotlinx.coroutines.flow.StateFlow;

/* loaded from: classes6.dex */
public final class ActivityAppletTile implements AppletTile {
    public final StateFlowKt$stateFlowOf$1 installationSectionId;
    public final StateFlowKt$stateFlowOf$1 installationState;
    public final StateFlow models;

    public ActivityAppletTile(StateFlow stateFlow) {
        stateFlow.getClass();
        this.models = stateFlow;
        this.installationSectionId = new StateFlowKt$stateFlowOf$1(AppletTileInstallationSectionId.SERVICE);
        this.installationState = new StateFlowKt$stateFlowOf$1(AppletTileInstallationState.Installed.INSTANCE);
    }

    @Override // com.squareup.cash.money.applets.viewmodels.AppletTile
    public final void UI(AppletTile.AppletTileAppearance appletTileAppearance, Composer composer, int i) {
        int i2;
        appletTileAppearance.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1253009948);
        if ((i & 48) == 0) {
            i2 = (gapComposer.changedInstance(this) ? 32 : 16) | i;
        } else {
            i2 = i;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 17) != 16)) {
            KycAppletTileKt.ActivityAppletTileUI((ActivityAppletTileViewModel) Updater.collectAsState(this.models, null, gapComposer, 1).getValue(), gapComposer, 0);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new CheckDepositAmountKt$$ExternalSyntheticLambda1(this, appletTileAppearance, i, 19);
        }
    }

    @Override // com.squareup.cash.money.applets.viewmodels.AppletTile
    public final StateFlow getInstallationSectionId() {
        return this.installationSectionId;
    }

    @Override // com.squareup.cash.money.applets.viewmodels.AppletTile
    public final StateFlow getInstallationState() {
        return this.installationState;
    }
}
