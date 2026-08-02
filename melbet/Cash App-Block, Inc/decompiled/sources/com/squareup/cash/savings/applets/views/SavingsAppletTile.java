package com.squareup.cash.savings.applets.views;

import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.room.Room;
import app.cash.paraphrase.FormattedResource;
import com.bugsnag.android.Thread$State$EnumUnboxingLocalUtility;
import com.squareup.cash.R;
import com.squareup.cash.money.applets.common.viewmodels.PromotedAppletTileViewModel;
import com.squareup.cash.money.applets.common.views.SharedUIKt;
import com.squareup.cash.money.applets.viewmodels.AppletTile;
import com.squareup.cash.money.core.ids.AppletTileInstallationSectionId;
import com.squareup.cash.profile.views.OpenSourceKt$$ExternalSyntheticLambda11;
import com.squareup.cash.savings.applets.viewmodels.SavingsAppletTileViewModel;
import com.squareup.cash.savings.views.CelebrationKt$$ExternalSyntheticLambda1;
import com.squareup.cash.score.applets.views.ScoreAppletViewsModule$$ExternalSyntheticLambda1;
import com.squareup.cash.score.views.ScoreHomeKt$$ExternalSyntheticLambda9;
import com.squareup.cash.sharesheet.ShareSheetViewKt$$ExternalSyntheticLambda5;
import com.squareup.cash.sheet.SheetKt$$ExternalSyntheticLambda5;
import com.squareup.util.cash.Countries;
import com.squareup.util.coroutines.DerivedStateFlow;
import com.squareup.util.coroutines.StateFlowKt;
import com.squareup.util.coroutines.StateFlowKt$stateFlowOf$1;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.flow.StateFlow;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes7.dex */
public final class SavingsAppletTile implements AppletTile {
    public final StateFlowKt$stateFlowOf$1 installationSectionId;
    public final DerivedStateFlow installationState;
    public final StateFlow models;
    public final ScoreAppletViewsModule$$ExternalSyntheticLambda1 onClickTile;
    public final StateFlow uninstallationSectionId;

    public SavingsAppletTile(StateFlow stateFlow, DerivedStateFlow derivedStateFlow, ScoreAppletViewsModule$$ExternalSyntheticLambda1 scoreAppletViewsModule$$ExternalSyntheticLambda1) {
        stateFlow.getClass();
        derivedStateFlow.getClass();
        this.models = stateFlow;
        this.uninstallationSectionId = derivedStateFlow;
        this.onClickTile = scoreAppletViewsModule$$ExternalSyntheticLambda1;
        this.installationSectionId = new StateFlowKt$stateFlowOf$1(AppletTileInstallationSectionId.BALANCE);
        this.installationState = StateFlowKt.mapState(stateFlow, new CelebrationKt$$ExternalSyntheticLambda1(14));
    }

    @Override // com.squareup.cash.money.applets.viewmodels.AppletTile
    public final void PromotedUI(AppletTile.AppletTileAppearance appletTileAppearance, Composer composer, int i) {
        int i2;
        RecomposeScopeImpl endRestartGroup;
        SavingsAppletTile$$ExternalSyntheticLambda1 savingsAppletTile$$ExternalSyntheticLambda1;
        appletTileAppearance.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1414284374);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(appletTileAppearance) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(this) ? 32 : 16;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            MutableState collectAsState = Updater.collectAsState(this.models, null, gapComposer, 1);
            if (!(((SavingsAppletTileViewModel) collectAsState.getValue()) instanceof SavingsAppletTileViewModel.Uninstalled)) {
                gapComposer.startReplaceGroup(-683264420);
                UI((SavingsAppletTileViewModel) collectAsState.getValue(), appletTileAppearance, gapComposer, (i2 << 3) & IptcConstants.IMAGE_RESOURCE_BLOCK_PSTRING_CAPTION);
                gapComposer.end(false);
                endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                    savingsAppletTile$$ExternalSyntheticLambda1 = new SavingsAppletTile$$ExternalSyntheticLambda1(this, appletTileAppearance, i, 1);
                    endRestartGroup.block = savingsAppletTile$$ExternalSyntheticLambda1;
                }
                return;
            }
            gapComposer.startReplaceGroup(-683218292);
            gapComposer.end(false);
            SavingsAppletTileViewModel savingsAppletTileViewModel = (SavingsAppletTileViewModel) collectAsState.getValue();
            savingsAppletTileViewModel.getClass();
            SavingsAppletTileViewModel.Uninstalled uninstalled = (SavingsAppletTileViewModel.Uninstalled) savingsAppletTileViewModel;
            PromotedAppletTileViewModel.Loaded loaded = uninstalled.promotedTileModel;
            String str = uninstalled.managedAccountFirstName;
            if (str == null) {
                str = "";
            }
            if (str.length() > 0) {
                gapComposer.startReplaceGroup(-682832590);
                loaded = new PromotedAppletTileViewModel.Loaded(Room.stringResource(gapComposer, R.string.promoted_savings_title), Countries.getString((Context) gapComposer.consume(AndroidCompositionLocals_androidKt.LocalContext), new FormattedResource(R.string.promoted_savings_subtitle, Thread$State$EnumUnboxingLocalUtility.m("firstName", str))), 2131233414, null);
                gapComposer.end(false);
            } else if (loaded != null) {
                gapComposer.startReplaceGroup(1917646825);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-682455321);
                gapComposer.end(false);
                loaded = null;
            }
            if (loaded != null) {
                gapComposer.startReplaceGroup(-682399272);
                boolean changedInstance = gapComposer.changedInstance(this) | gapComposer.changedInstance(uninstalled);
                Object rememberedValue = gapComposer.rememberedValue();
                if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                    rememberedValue = new OpenSourceKt$$ExternalSyntheticLambda11(25, this, uninstalled);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                SharedUIKt.PromotedAppletTile(loaded, (Function1) rememberedValue, null, gapComposer, 0);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-682157751);
                UI((SavingsAppletTileViewModel) collectAsState.getValue(), appletTileAppearance, gapComposer, (i2 << 3) & IptcConstants.IMAGE_RESOURCE_BLOCK_PSTRING_CAPTION);
                gapComposer.end(false);
            }
        } else {
            gapComposer.skipToGroupEnd();
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            savingsAppletTile$$ExternalSyntheticLambda1 = new SavingsAppletTile$$ExternalSyntheticLambda1(this, appletTileAppearance, i, 2);
            endRestartGroup.block = savingsAppletTile$$ExternalSyntheticLambda1;
        }
    }

    public final void UI(SavingsAppletTileViewModel savingsAppletTileViewModel, AppletTile.AppletTileAppearance appletTileAppearance, Composer composer, int i) {
        int i2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1887549547);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(savingsAppletTileViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changed(appletTileAppearance) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(this) ? 256 : 128;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            boolean changedInstance = gapComposer.changedInstance(this) | gapComposer.changedInstance(savingsAppletTileViewModel);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new ShareSheetViewKt$$ExternalSyntheticLambda5(5, this, savingsAppletTileViewModel);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            SharedUIKt.AppletTileRow(null, Expect_jvmKt.rememberComposableLambda(-1826833077, new SheetKt$$ExternalSyntheticLambda5(9, savingsAppletTileViewModel, (Function0) rememberedValue, appletTileAppearance), gapComposer), gapComposer, 48, 1);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ScoreHomeKt$$ExternalSyntheticLambda9(this, savingsAppletTileViewModel, appletTileAppearance, i, 22);
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
        return this.uninstallationSectionId;
    }

    @Override // com.squareup.cash.money.applets.viewmodels.AppletTile
    public final void UI(AppletTile.AppletTileAppearance appletTileAppearance, Composer composer, int i) {
        int i2;
        appletTileAppearance.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-229178734);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(appletTileAppearance) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(this) ? 32 : 16;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            UI((SavingsAppletTileViewModel) Updater.collectAsState(this.models, null, gapComposer, 1).getValue(), appletTileAppearance, gapComposer, (i2 << 3) & IptcConstants.IMAGE_RESOURCE_BLOCK_PSTRING_CAPTION);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SavingsAppletTile$$ExternalSyntheticLambda1(this, appletTileAppearance, i, 0);
        }
    }
}
