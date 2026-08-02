package com.squareup.cash.banking.applets.views;

import androidx.compose.foundation.pager.PagerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import coil3.network.NetworkFetcher$fetch$2;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.arcade.util.AvatarsKt$$ExternalSyntheticLambda2;
import com.squareup.cash.banking.applets.viewmodels.BalanceAppletTileViewModel;
import com.squareup.cash.banking.views.BankingDialogKt$$ExternalSyntheticLambda2;
import com.squareup.cash.elementboundsregistry.core.ElementBoundsRegistry;
import com.squareup.cash.money.applets.common.views.SharedUIKt;
import com.squareup.cash.money.applets.viewmodels.AppletTile;
import com.squareup.cash.money.core.ids.AppletTileInstallationSectionId;
import com.squareup.util.Strings;
import com.squareup.util.coroutines.DerivedStateFlow;
import com.squareup.util.coroutines.StateFlowKt;
import com.squareup.util.coroutines.StateFlowKt$stateFlowOf$1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.StateFlow;

/* loaded from: classes5.dex */
public final class BalanceAppletTile implements AppletTile {
    public final ElementBoundsRegistry elementBoundsRegistry;
    public final StateFlowKt$stateFlowOf$1 installationSectionId;
    public final DerivedStateFlow installationState;
    public final StateFlow models;
    public final NetworkFetcher$fetch$2 onEvent;

    public BalanceAppletTile(StateFlow stateFlow, NetworkFetcher$fetch$2 networkFetcher$fetch$2, ElementBoundsRegistry elementBoundsRegistry) {
        stateFlow.getClass();
        this.models = stateFlow;
        this.onEvent = networkFetcher$fetch$2;
        this.elementBoundsRegistry = elementBoundsRegistry;
        this.installationSectionId = new StateFlowKt$stateFlowOf$1(AppletTileInstallationSectionId.BANKING_GROUPED);
        this.installationState = StateFlowKt.mapState(stateFlow, new AvatarsKt$$ExternalSyntheticLambda2(17));
    }

    @Override // com.squareup.cash.money.applets.viewmodels.AppletTile
    public final void UI(AppletTile.AppletTileAppearance appletTileAppearance, Composer composer, int i) {
        int i2;
        AppletTile.AppletTileAppearance appletTileAppearance2;
        appletTileAppearance.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-635367457);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(appletTileAppearance) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changed(this) ? 32 : 16;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            appletTileAppearance2 = appletTileAppearance;
            PagerKt.BalanceAppletTileUI((BalanceAppletTileViewModel) Strings.receiveValueAsState(this.models, gapComposer).getValue(), appletTileAppearance2, this.onEvent, this.elementBoundsRegistry, gapComposer, (i2 << 3) & 112);
        } else {
            appletTileAppearance2 = appletTileAppearance;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BalanceAppletTile$$ExternalSyntheticLambda1(this, appletTileAppearance2, i, 2);
        }
    }

    @Override // com.squareup.cash.money.applets.viewmodels.AppletTile
    public final void UninstalledRowUI(AppletTile.AppletTileAppearance appletTileAppearance, Composer composer, int i) {
        int i2;
        RecomposeScopeImpl recomposeScopeImpl;
        BalanceAppletTile$$ExternalSyntheticLambda1 balanceAppletTile$$ExternalSyntheticLambda1;
        appletTileAppearance.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(378735448);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(appletTileAppearance) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changed(this) ? 32 : 16;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            BalanceAppletTileViewModel balanceAppletTileViewModel = (BalanceAppletTileViewModel) Strings.receiveValueAsState(this.models, gapComposer).getValue();
            if (!(balanceAppletTileViewModel instanceof BalanceAppletTileViewModel.Loaded.Lite.Uninstalled)) {
                gapComposer.startReplaceGroup(28888469);
                UI(appletTileAppearance, gapComposer, i2 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                gapComposer.end(false);
                recomposeScopeImpl = gapComposer.endRestartGroup();
                if (recomposeScopeImpl != null) {
                    balanceAppletTile$$ExternalSyntheticLambda1 = new BalanceAppletTile$$ExternalSyntheticLambda1(this, appletTileAppearance, i, 0);
                    recomposeScopeImpl.block = balanceAppletTile$$ExternalSyntheticLambda1;
                }
                return;
            }
            gapComposer.startReplaceGroup(-1107447925);
            gapComposer.end(false);
            SharedUIKt.AppletTileRow(null, Expect_jvmKt.rememberComposableLambda(408520162, new BankingDialogKt$$ExternalSyntheticLambda2(6, ((BalanceAppletTileViewModel.Loaded.Lite.Uninstalled) balanceAppletTileViewModel).uninstalledRowModel, this), gapComposer), gapComposer, 48, 1);
        } else {
            gapComposer.skipToGroupEnd();
        }
        recomposeScopeImpl = gapComposer.endRestartGroup();
        if (recomposeScopeImpl != null) {
            balanceAppletTile$$ExternalSyntheticLambda1 = new BalanceAppletTile$$ExternalSyntheticLambda1(this, appletTileAppearance, i, 1);
            recomposeScopeImpl.block = balanceAppletTile$$ExternalSyntheticLambda1;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BalanceAppletTile) {
            BalanceAppletTile balanceAppletTile = (BalanceAppletTile) obj;
            return Intrinsics.areEqual(this.models, balanceAppletTile.models) && this.onEvent.equals(balanceAppletTile.onEvent) && this.elementBoundsRegistry == balanceAppletTile.elementBoundsRegistry;
        }
        return false;
    }

    @Override // com.squareup.cash.money.applets.viewmodels.AppletTile
    public final StateFlow getInstallationSectionId() {
        return this.installationSectionId;
    }

    @Override // com.squareup.cash.money.applets.viewmodels.AppletTile
    public final StateFlow getInstallationState() {
        return this.installationState;
    }

    public final int hashCode() {
        return this.elementBoundsRegistry.hashCode() + ((this.onEvent.hashCode() + (this.models.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "BalanceAppletTile(models=" + this.models + ", onEvent=" + this.onEvent + ", elementBoundsRegistry=" + this.elementBoundsRegistry + ")";
    }
}
