package com.squareup.cash.family.familyhub.views;

import androidx.compose.animation.core.TransitionKt$$ExternalSyntheticLambda9;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.room.util.DBUtil;
import app.cash.broadway.presenter.molecule.viewmodels.UiCallbackModel;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.RealImageLoader;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.activity.views.AvatarsKt;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.dialog.ArcadeModal2Kt$$ExternalSyntheticLambda0;
import com.squareup.cash.family.familyhub.viewmodels.BadgeName;
import com.squareup.cash.family.familyhub.viewmodels.DependentAccessControlsViewModel;
import com.squareup.cash.family.familyhub.viewmodels.DependentActivityEmbeddedSectionViewModel;
import com.squareup.cash.family.familyhub.viewmodels.DependentBalancesViewModel;
import com.squareup.cash.family.familyhub.viewmodels.DependentDetailViewEvent;
import com.squareup.cash.family.familyhub.viewmodels.DependentDetailViewModel;
import com.squareup.cash.family.fixtures.FamilyActivityFixtures;
import com.squareup.cash.family.fixtures.FamilyAvatarFixtures;
import com.squareup.cash.family.fixtures.FamilyBalanceFixtures;
import com.squareup.cash.family.fixtures.FamilyControlsFixtures;
import com.squareup.cash.family.safetyhub.views.SafetyHubViewKt$$ExternalSyntheticLambda0;
import com.squareup.cash.money.views.MoneyUiFactory$$ExternalSyntheticLambda1;
import com.squareup.cash.observability.backend.real.RealObservabilityManager;
import com.squareup.cash.ui.widget.StackedAvatarViewModel;
import kotlin.jvm.functions.Function1;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes6.dex */
public abstract class DependentDetailViewKt {
    static {
        BadgeName badgeName = FamilyAvatarFixtures.TEEN_A_BADGE;
        StackedAvatarViewModel.Avatar avatar = FamilyAvatarFixtures.AVATAR_A;
        DependentBalancesViewModel dependentBalancesViewModel = FamilyBalanceFixtures.LOADED_DEPENDENT_BALANCES_VIEW_MODEL;
        DependentAccessControlsViewModel dependentAccessControlsViewModel = FamilyControlsFixtures.FULL_DEPENDENT_ACCESS_CONTROLS;
        DependentActivityEmbeddedSectionViewModel dependentActivityEmbeddedSectionViewModel = FamilyActivityFixtures.DEPENDENT_ACTIVITY_EMBEDDED_SECTION;
        DependentDetailViewModel dependentDetailViewModel = new DependentDetailViewModel(avatar, badgeName, "$joshallen", dependentBalancesViewModel, dependentAccessControlsViewModel, dependentActivityEmbeddedSectionViewModel, false);
        DependentBalancesViewModel dependentBalancesViewModel2 = FamilyBalanceFixtures.INITIAL_DEPENDENT_BALANCES_VIEW_MODEL;
        DependentAccessControlsViewModel dependentAccessControlsViewModel2 = FamilyControlsFixtures.LOADING_DEPENDENT_ACCESS_CONTROLS;
        String str = dependentActivityEmbeddedSectionViewModel.sectionTitle;
        DependentDetailViewEvent dependentDetailViewEvent = dependentActivityEmbeddedSectionViewModel.action;
        str.getClass();
        dependentDetailViewEvent.getClass();
        DependentDetailViewModel.copy$default(dependentDetailViewModel, null, dependentBalancesViewModel2, dependentAccessControlsViewModel2, new DependentActivityEmbeddedSectionViewModel(str, null, dependentDetailViewEvent), 64);
        DependentDetailViewModel.copy$default(dependentDetailViewModel, new BadgeName(badgeName.firstName, "Josh The HumanWreckingBall Allen", badgeName.isBusiness, badgeName.isVerified), null, null, null, 125);
    }

    public static final void DependentDetail(int i, Composer composer, Modifier modifier, DependentDetailViewModel dependentDetailViewModel, Function1 function1) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(785134192);
        int i2 = (gapComposer.changed(modifier) ? 4 : 2) | i | (gapComposer.changed(dependentDetailViewModel) ? 32 : 16) | (gapComposer.changedInstance(function1) ? 256 : 128);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            Modifier fillMaxSize = SizeKt.fillMaxSize(SpacerKt.systemBarsPadding(Modifier.Companion.$$INSTANCE), 1.0f);
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(fillMaxSize, colors.semantic.background.f1047app, ColorKt.RectangleShape);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m177backgroundbw27NRU);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (gapComposer.applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            Toolbar(dependentDetailViewModel, function1, gapComposer, (i2 >> 3) & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
            DependentDetailsContent(i2 & IptcConstants.IMAGE_RESOURCE_BLOCK_QUICK_MASK_INFO, gapComposer, modifier, dependentDetailViewModel, function1);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new DependentDetailViewKt$$ExternalSyntheticLambda3(modifier, dependentDetailViewModel, function1, i, 0);
        }
    }

    public static final void DependentDetailView(RealImageLoader realImageLoader, RealObservabilityManager realObservabilityManager, DependentDetailViewModel dependentDetailViewModel, Function1 function1, Modifier modifier, Composer composer, int i) {
        int i2;
        Modifier modifier2;
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1336428095);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(realImageLoader) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(realObservabilityManager) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changed(dependentDetailViewModel) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 2048 : 1024;
        }
        int i3 = i2 | 24576;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 9363) != 9362)) {
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(1101322262, new MoneyUiFactory$$ExternalSyntheticLambda1(realImageLoader, realObservabilityManager, dependentDetailViewModel, function1), gapComposer), gapComposer, 3072, 7);
            modifier2 = Modifier.Companion.$$INSTANCE;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new TransitionKt$$ExternalSyntheticLambda9(realImageLoader, realObservabilityManager, dependentDetailViewModel, function1, modifier2, i, 24);
        }
    }

    public static final void DependentDetailsContent(int i, Composer composer, Modifier modifier, DependentDetailViewModel dependentDetailViewModel, Function1 function1) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1297628810);
        int i2 = (gapComposer.changed(modifier) ? 4 : 2) | i | (gapComposer.changed(dependentDetailViewModel) ? 32 : 16) | (gapComposer.changedInstance(function1) ? 256 : 128);
        if (!gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            gapComposer.skipToGroupEnd();
        } else if (dependentDetailViewModel == null) {
            gapComposer.startReplaceGroup(1340923676);
            gapComposer.end(false);
        } else {
            gapComposer.startReplaceGroup(1340923677);
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(modifier, 1.0f);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, fillMaxWidth);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (gapComposer.applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            int i3 = i2 & 896;
            AllowanceViewKt.DependentDetailBalanceHeader(i3, gapComposer, null, dependentDetailViewModel, function1);
            AllowanceViewKt.DependentDetailsBalanceSection(null, dependentDetailViewModel.balances, function1, gapComposer, i3);
            gapComposer.startReplaceGroup(-1184375279);
            DependentActivityEmbeddedSectionViewModel dependentActivityEmbeddedSectionViewModel = dependentDetailViewModel.recentActivityModel;
            UiCallbackModel uiCallbackModel = dependentActivityEmbeddedSectionViewModel.activitySectionViewModel;
            if (uiCallbackModel == null) {
                gapComposer.startReplaceGroup(-685007764);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-685007763);
                AvatarsKt.ActivityEmbeddedView(uiCallbackModel, null, Expect_jvmKt.rememberComposableLambda(-1127383679, new ArcadeModal2Kt$$ExternalSyntheticLambda0(10, dependentActivityEmbeddedSectionViewModel, function1), gapComposer), null, null, gapComposer, MLKEMEngine.KyberPolyBytes, EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ROUTING_NUMBER_SEARCH_VALUE);
                DBUtil.SpacerBetweenSectionXLargeBelowCell(0, 1, gapComposer, null);
                gapComposer.end(false);
            }
            gapComposer.end(false);
            AllowanceViewKt.DependentDetailSettingsSection(dependentDetailViewModel.accessControls, function1, gapComposer, (i2 >> 3) & 112);
            gapComposer.end(true);
            gapComposer.end(false);
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new DependentDetailViewKt$$ExternalSyntheticLambda3(modifier, dependentDetailViewModel, function1, i, 2);
        }
    }

    public static final void Toolbar(DependentDetailViewModel dependentDetailViewModel, Function1 function1, Composer composer, int i) {
        int i2;
        String str;
        StackedAvatarViewModel.Avatar avatar;
        BadgeName badgeName;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-766922500);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(dependentDetailViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            if (dependentDetailViewModel == null || (badgeName = dependentDetailViewModel.badgeName) == null || (str = badgeName.fullName) == null) {
                str = "";
            }
            AllowanceViewKt.DependentDetailToolbar(new DependentDetailToolbarModel(str, (dependentDetailViewModel == null || (avatar = dependentDetailViewModel.stackedAvatarViewModel) == null) ? null : new StackedAvatarViewModel.Single(avatar), dependentDetailViewModel != null ? dependentDetailViewModel.showQrCodeButton : false), function1, gapComposer, i2 & 112);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SafetyHubViewKt$$ExternalSyntheticLambda0(dependentDetailViewModel, function1, i, 2);
        }
    }
}
