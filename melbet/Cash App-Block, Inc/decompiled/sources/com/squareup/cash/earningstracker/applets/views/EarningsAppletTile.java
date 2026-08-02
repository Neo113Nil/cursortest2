package com.squareup.cash.earningstracker.applets.views;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import com.google.android.gms.internal.mlkit_genai_prompt.zzanv;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.db2.recipients.RecipientQueries$$ExternalSyntheticLambda0;
import com.squareup.cash.earningstracker.applets.viewmodels.EarningsAppletTileModel;
import com.squareup.cash.education.stories.db.StoryQueries$$ExternalSyntheticLambda0;
import com.squareup.cash.money.applets.common.viewmodels.PromotedAppletTileViewModel;
import com.squareup.cash.money.applets.common.views.SharedUIKt;
import com.squareup.cash.money.applets.viewmodels.AppletTile;
import com.squareup.cash.money.core.ids.AppletTileInstallationSectionId;
import com.squareup.cash.tax.applet.views.TaxesAppletViewsModule$$ExternalSyntheticLambda1;
import com.squareup.util.coroutines.DerivedStateFlow;
import com.squareup.util.coroutines.StateFlowKt;
import com.squareup.util.coroutines.StateFlowKt$stateFlowOf$1;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.flow.StateFlow;

/* loaded from: classes6.dex */
public final class EarningsAppletTile implements AppletTile {
    public final StateFlowKt$stateFlowOf$1 installationSectionId;
    public final DerivedStateFlow installationState;
    public final StateFlow models;
    public final TaxesAppletViewsModule$$ExternalSyntheticLambda1 onClick;

    public EarningsAppletTile(StateFlow stateFlow, TaxesAppletViewsModule$$ExternalSyntheticLambda1 taxesAppletViewsModule$$ExternalSyntheticLambda1) {
        stateFlow.getClass();
        this.models = stateFlow;
        this.onClick = taxesAppletViewsModule$$ExternalSyntheticLambda1;
        this.installationSectionId = new StateFlowKt$stateFlowOf$1(AppletTileInstallationSectionId.BANKING_GROUPED);
        this.installationState = StateFlowKt.mapState(stateFlow, new StoryQueries$$ExternalSyntheticLambda0(4));
    }

    @Override // com.squareup.cash.money.applets.viewmodels.AppletTile
    public final void PromotedUI(AppletTile.AppletTileAppearance appletTileAppearance, Composer composer, int i) {
        int i2;
        appletTileAppearance.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(753147030);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(appletTileAppearance) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(this) ? 32 : 16;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            EarningsAppletTileModel earningsAppletTileModel = (EarningsAppletTileModel) Updater.collectAsState(this.models, null, gapComposer, 1).getValue();
            EarningsAppletTileModel.Uninstalled uninstalled = earningsAppletTileModel instanceof EarningsAppletTileModel.Uninstalled ? (EarningsAppletTileModel.Uninstalled) earningsAppletTileModel : null;
            PromotedAppletTileViewModel promotedAppletTileViewModel = uninstalled != null ? uninstalled.promotedModel : null;
            PromotedAppletTileViewModel.Loaded loaded = promotedAppletTileViewModel instanceof PromotedAppletTileViewModel.Loaded ? (PromotedAppletTileViewModel.Loaded) promotedAppletTileViewModel : null;
            if (loaded != null) {
                gapComposer.startReplaceGroup(94228220);
                boolean changedInstance = gapComposer.changedInstance(this);
                Object rememberedValue = gapComposer.rememberedValue();
                if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                    rememberedValue = new RecipientQueries$$ExternalSyntheticLambda0(this, 16);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                SharedUIKt.PromotedAppletTile(loaded, (Function1) rememberedValue, null, gapComposer, 0);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(94434928);
                UI(appletTileAppearance, gapComposer, i2 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                gapComposer.end(false);
            }
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new EarningsAppletTile$$ExternalSyntheticLambda3(this, appletTileAppearance, i, 0);
        }
    }

    @Override // com.squareup.cash.money.applets.viewmodels.AppletTile
    public final void UI(AppletTile.AppletTileAppearance appletTileAppearance, Composer composer, int i) {
        int i2;
        appletTileAppearance.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-390905902);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(appletTileAppearance) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(this) ? 32 : 16;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            zzanv.UI((EarningsAppletTileModel) Updater.collectAsState(this.models, null, gapComposer, 1).getValue(), appletTileAppearance, this.onClick, gapComposer, (i2 << 3) & 112);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new EarningsAppletTile$$ExternalSyntheticLambda3(this, appletTileAppearance, i, 1);
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

    @Override // com.squareup.cash.money.applets.viewmodels.AppletTile
    public final StateFlow uninstallationSectionId() {
        return StateFlowKt.mapState(this.models, new StoryQueries$$ExternalSyntheticLambda0(3));
    }
}
