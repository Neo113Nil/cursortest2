package com.squareup.cash.cashapplite.views;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.Alignment;
import androidx.core.view.ViewPropertyAnimatorListenerAdapter;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import app.cash.local.views.LocalViewFactory$$ExternalSyntheticLambda6;
import bo.app.re$$ExternalSyntheticOutline0;
import com.google.android.gms.internal.location.zzes;
import com.squareup.cash.R;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticLambda9;
import com.squareup.cash.activity.views.SectionHeaderScope$$ExternalSyntheticLambda1;
import com.squareup.cash.agents.applets.viewmodels.AgentsAppletTileViewModel;
import com.squareup.cash.agents.applets.views.AgentsAppletTile$$ExternalSyntheticLambda5;
import com.squareup.cash.amountchooser.views.AtmPickerGridKt$$ExternalSyntheticLambda4;
import com.squareup.cash.appmessages.db.CardMessageQueries$$ExternalSyntheticLambda1;
import com.squareup.cash.appmessages.views.InlineAppMessageKt$$ExternalSyntheticLambda8;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.components.CopyCodeKt$$ExternalSyntheticLambda10;
import com.squareup.cash.arcade.components.avatar.AvatarSize;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.cashapplite.viewmodels.KycAppletTileModel;
import com.squareup.cash.checks.CheckDepositAmountKt$$ExternalSyntheticLambda1;
import com.squareup.cash.dialog.ArcadeModal2Kt$$ExternalSyntheticLambda1;
import com.squareup.cash.dialog.ComposeDialogKt$$ExternalSyntheticLambda14;
import com.squareup.cash.earnings.applets.viewmodels.EarnerAppletTileModel;
import com.squareup.cash.education.stories.db.StoryQueries$$ExternalSyntheticLambda0;
import com.squareup.cash.family.applets.viewmodels.AllowanceAppletTileViewModel;
import com.squareup.cash.family.applets.viewmodels.ApprovedContactsAppletTileViewModel$Uninstalled;
import com.squareup.cash.family.applets.views.FamilyAppletTileKt;
import com.squareup.cash.google.pay.GooglePayPresenter$$ExternalSyntheticLambda0;
import com.squareup.cash.history.views.ActivityItemLayout$$ExternalSyntheticLambda4;
import com.squareup.cash.incentives.finishsetup.applets.viewmodels.FinishSetupAppletTileViewModel;
import com.squareup.cash.incentives.finishsetup.applets.views.FinishSetupAppletTileKt;
import com.squareup.cash.money.applets.common.views.InstalledServiceAppletTileLayoutConfig;
import com.squareup.cash.money.applets.common.views.SharedUIKt;
import com.squareup.cash.money.applets.viewmodels.AppletTile;
import com.squareup.cash.money.core.ids.AppletTileInstallationSectionId;
import com.squareup.cash.money.core.states.AppletTileInstallationState;
import com.squareup.cash.money.viewmodels.InstalledAppletTileHeaderModel;
import com.squareup.cash.money.viewmodels.InstalledServiceAppletTileContentModel;
import com.squareup.cash.pdf.view.PdfPreviewView$$ExternalSyntheticLambda1;
import com.squareup.cash.pools.views.PoolDetailsViewKt$$ExternalSyntheticLambda3;
import com.squareup.cash.profile.views.OpenSourceKt$$ExternalSyntheticLambda1;
import com.squareup.cash.score.applets.viewmodels.ScoreAppletTileViewModel;
import com.squareup.cash.score.applets.views.ScoreAppletViewsModule$$ExternalSyntheticLambda1;
import com.squareup.cash.score.views.CalloutKt$$ExternalSyntheticLambda1;
import com.squareup.cash.sharesheet.ShareSheetViewKt$$ExternalSyntheticLambda2;
import com.squareup.cash.tax.applet.views.TaxesAppletViewsModule$$ExternalSyntheticLambda1;
import com.squareup.util.coroutines.DerivedStateFlow;
import com.squareup.util.coroutines.StateFlowKt;
import com.squareup.util.coroutines.StateFlowKt$stateFlowOf$1;
import java.util.List;
import kotlin.Function;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.StateFlow;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes6.dex */
public final class KycAppletTile implements AppletTile {
    public final /* synthetic */ int $r8$classId = 7;
    public final StateFlowKt$stateFlowOf$1 installationSectionId;
    public final StateFlow installationState;
    public final StateFlow models;
    public final Function onClick;

    public KycAppletTile(StateFlow stateFlow, TaxesAppletViewsModule$$ExternalSyntheticLambda1 taxesAppletViewsModule$$ExternalSyntheticLambda1, char c) {
        stateFlow.getClass();
        this.models = stateFlow;
        this.onClick = taxesAppletViewsModule$$ExternalSyntheticLambda1;
        this.installationSectionId = new StateFlowKt$stateFlowOf$1(AppletTileInstallationSectionId.SERVICE);
        this.installationState = StateFlowKt.mapState(stateFlow, new ComposeDialogKt$$ExternalSyntheticLambda14(21));
    }

    public void InstalledUI(AgentsAppletTileViewModel.Installed installed, AppletTile.AppletTileAppearance appletTileAppearance, Composer composer, int i) {
        Pair pair;
        ComposableLambdaImpl rememberComposableLambda;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(670108791);
        int i2 = i | (gapComposer.changedInstance(installed) ? 4 : 2) | (gapComposer.changed(appletTileAppearance) ? 32 : 16) | (gapComposer.changedInstance(this) ? 256 : 128);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            boolean z = appletTileAppearance.useRedesignedTiles;
            if (z) {
                gapComposer.startReplaceGroup(1066872826);
                ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
                DefaultSizes.spacing.getClass();
                pair = new Pair(new InstalledServiceAppletTileLayoutConfig(16.0f, RecyclerView.DECELERATION_RATE, ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).labelSmall, InstalledServiceAppletTileLayoutConfig.VisualPosition.END, Alignment.Companion.Bottom), AvatarSize.Size64);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(1067234999);
                StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalSizes;
                ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
                DefaultSizes.spacing.getClass();
                ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
                Pair pair2 = new Pair(new InstalledServiceAppletTileLayoutConfig(8.0f, ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).labelMedium, 24), AvatarSize.Size32);
                gapComposer.end(false);
                pair = pair2;
            }
            InstalledServiceAppletTileLayoutConfig installedServiceAppletTileLayoutConfig = (InstalledServiceAppletTileLayoutConfig) pair.first;
            AvatarSize avatarSize = (AvatarSize) pair.second;
            boolean z2 = z && installed.avatars.size() > 2;
            List take = z2 ? CollectionsKt.take(installed.avatars, 1) : installed.avatars;
            int size = z2 ? installed.avatars.size() - 1 : 0;
            if (installed.avatars.isEmpty()) {
                gapComposer.startReplaceGroup(203532277);
                rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(-1917998080, new BalanceFeedKt$$ExternalSyntheticLambda9(avatarSize, 25), gapComposer);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(203623479);
                rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(-465158519, new AgentsAppletTile$$ExternalSyntheticLambda5(take, avatarSize, size, 0), gapComposer);
                gapComposer.end(false);
            }
            ComposableLambdaImpl composableLambdaImpl = null;
            InstalledAppletTileHeaderModel installedAppletTileHeaderModel = new InstalledAppletTileHeaderModel(installed.title, null, null, 14);
            List listOf = CollectionsKt__CollectionsJVMKt.listOf(new InstalledServiceAppletTileContentModel(null, null, new InstalledServiceAppletTileContentModel.BriefState.Loaded(installed.body), z ? null : rememberComposableLambda, 3));
            TaxesAppletViewsModule$$ExternalSyntheticLambda1 taxesAppletViewsModule$$ExternalSyntheticLambda1 = (TaxesAppletViewsModule$$ExternalSyntheticLambda1) this.onClick;
            if (z) {
                gapComposer.startReplaceGroup(204138265);
                composableLambdaImpl = Expect_jvmKt.rememberComposableLambda(-1254180154, new CopyCodeKt$$ExternalSyntheticLambda10(installed, avatarSize, take, size, 10), gapComposer);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(204500593);
                gapComposer.end(false);
            }
            SharedUIKt.InstalledServiceAppletTile(installedAppletTileHeaderModel, listOf, taxesAppletViewsModule$$ExternalSyntheticLambda1, false, null, installedServiceAppletTileLayoutConfig, composableLambdaImpl, gapComposer, 64, 24);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new InlineAppMessageKt$$ExternalSyntheticLambda8(this, installed, appletTileAppearance, i, 19);
        }
    }

    @Override // com.squareup.cash.money.applets.viewmodels.AppletTile
    public final void UI(AppletTile.AppletTileAppearance appletTileAppearance, Composer composer, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        GapComposer gapComposer;
        int i9;
        int i10 = this.$r8$classId;
        Function function = this.onClick;
        StateFlow stateFlow = this.models;
        switch (i10) {
            case 0:
                appletTileAppearance.getClass();
                GapComposer gapComposer2 = (GapComposer) composer;
                gapComposer2.startRestartGroup(-2096363222);
                if ((i & 48) == 0) {
                    i2 = i | (gapComposer2.changedInstance(this) ? 32 : 16);
                } else {
                    i2 = i;
                }
                if (gapComposer2.shouldExecute(i2 & 1, (i2 & 17) != 16)) {
                    KycAppletTileKt.KycAppletTileUI((KycAppletTileModel) Updater.collectAsState(stateFlow, null, gapComposer2, 1).getValue(), (TaxesAppletViewsModule$$ExternalSyntheticLambda1) function, gapComposer2, 0);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                RecomposeScopeImpl endRestartGroup = gapComposer2.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.block = new CheckDepositAmountKt$$ExternalSyntheticLambda1(this, appletTileAppearance, i, 20);
                    return;
                }
                return;
            case 1:
                appletTileAppearance.getClass();
                GapComposer gapComposer3 = (GapComposer) composer;
                gapComposer3.startRestartGroup(61996835);
                if ((i & 6) == 0) {
                    i3 = i | (gapComposer3.changed(appletTileAppearance) ? 4 : 2);
                } else {
                    i3 = i;
                }
                if ((i & 48) == 0) {
                    i3 |= gapComposer3.changedInstance(this) ? 32 : 16;
                }
                if (gapComposer3.shouldExecute(i3 & 1, (i3 & 19) != 18)) {
                    UI((AgentsAppletTileViewModel) Updater.collectAsState(stateFlow, null, gapComposer3, 1).getValue(), appletTileAppearance, gapComposer3, (i3 << 3) & IptcConstants.IMAGE_RESOURCE_BLOCK_PSTRING_CAPTION);
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                RecomposeScopeImpl endRestartGroup2 = gapComposer3.endRestartGroup();
                if (endRestartGroup2 != null) {
                    endRestartGroup2.block = new SectionHeaderScope$$ExternalSyntheticLambda1(this, appletTileAppearance, i, 16);
                    return;
                }
                return;
            case 2:
                TaxesAppletViewsModule$$ExternalSyntheticLambda1 taxesAppletViewsModule$$ExternalSyntheticLambda1 = (TaxesAppletViewsModule$$ExternalSyntheticLambda1) function;
                appletTileAppearance.getClass();
                GapComposer gapComposer4 = (GapComposer) composer;
                gapComposer4.startRestartGroup(1642348616);
                if ((i & 6) == 0) {
                    i4 = i | (gapComposer4.changed(appletTileAppearance) ? 4 : 2);
                } else {
                    i4 = i;
                }
                if ((i & 48) == 0) {
                    i4 |= gapComposer4.changedInstance(this) ? 32 : 16;
                }
                if (gapComposer4.shouldExecute(i4 & 1, (i4 & 19) != 18)) {
                    EarnerAppletTileModel earnerAppletTileModel = (EarnerAppletTileModel) Updater.collectAsState(stateFlow, null, gapComposer4, 1).getValue();
                    if (Intrinsics.areEqual(earnerAppletTileModel, EarnerAppletTileModel.Loading.INSTANCE) || Intrinsics.areEqual(earnerAppletTileModel, EarnerAppletTileModel.Hidden.INSTANCE)) {
                        gapComposer4.startReplaceGroup(-1059655016);
                        SharedUIKt.m3606LoadingServiceAppletTile942rkJo(Room.stringResource(gapComposer4, R.string.earnings_applets_earner_tile_title), null, RecyclerView.DECELERATION_RATE, appletTileAppearance.useRedesignedTiles, gapComposer4, 48, 4);
                        gapComposer4.end(false);
                    } else if (earnerAppletTileModel instanceof EarnerAppletTileModel.Uninstalled) {
                        gapComposer4.startReplaceGroup(-1059393283);
                        EarnerAppletTileModel.Uninstalled uninstalled = (EarnerAppletTileModel.Uninstalled) earnerAppletTileModel;
                        String str = uninstalled.title;
                        if (str == null) {
                            str = re$$ExternalSyntheticOutline0.m(gapComposer4, 2044039043, R.string.earnings_applets_earner_tile_title, gapComposer4, false);
                        } else {
                            gapComposer4.startReplaceGroup(2044038578);
                            gapComposer4.end(false);
                        }
                        String str2 = str;
                        String str3 = uninstalled.subtitle;
                        if (str3 == null) {
                            str3 = re$$ExternalSyntheticOutline0.m(gapComposer4, 2044042630, R.string.earnings_applets_earner_tile_subtitle, gapComposer4, false);
                        } else {
                            gapComposer4.startReplaceGroup(2044042072);
                            gapComposer4.end(false);
                        }
                        SharedUIKt.AppletTileRowUninstalledContent(2131231336, 0, gapComposer4, str2, str3, taxesAppletViewsModule$$ExternalSyntheticLambda1);
                        gapComposer4.end(false);
                    } else {
                        if (!(earnerAppletTileModel instanceof EarnerAppletTileModel.Installed)) {
                            throw Recorder$$ExternalSyntheticOutline2.m(gapComposer4, 2044026058, false);
                        }
                        gapComposer4.startReplaceGroup(2044046884);
                        zzes.InstalledEarnerAppletTileContent((EarnerAppletTileModel.Installed) earnerAppletTileModel, appletTileAppearance, taxesAppletViewsModule$$ExternalSyntheticLambda1, gapComposer4, (i4 << 3) & 112);
                        gapComposer4.end(false);
                    }
                } else {
                    gapComposer4.skipToGroupEnd();
                }
                RecomposeScopeImpl endRestartGroup3 = gapComposer4.endRestartGroup();
                if (endRestartGroup3 != null) {
                    endRestartGroup3.block = new ArcadeModal2Kt$$ExternalSyntheticLambda1(this, appletTileAppearance, i, 12);
                    return;
                }
                return;
            case 3:
                appletTileAppearance.getClass();
                GapComposer gapComposer5 = (GapComposer) composer;
                gapComposer5.startRestartGroup(1522268563);
                if ((i & 6) == 0) {
                    i5 = i | (gapComposer5.changed(appletTileAppearance) ? 4 : 2);
                } else {
                    i5 = i;
                }
                if ((i & 48) == 0) {
                    i5 |= gapComposer5.changedInstance(this) ? 32 : 16;
                }
                if (gapComposer5.shouldExecute(i5 & 1, (i5 & 19) != 18)) {
                    FamilyAppletTileKt.UI((AllowanceAppletTileViewModel) Updater.collectAsState(stateFlow, null, gapComposer5, 1).getValue(), appletTileAppearance, (ScoreAppletViewsModule$$ExternalSyntheticLambda1) function, gapComposer5, (i5 << 3) & 112);
                } else {
                    gapComposer5.skipToGroupEnd();
                }
                RecomposeScopeImpl endRestartGroup4 = gapComposer5.endRestartGroup();
                if (endRestartGroup4 != null) {
                    endRestartGroup4.block = new ArcadeModal2Kt$$ExternalSyntheticLambda1(this, appletTileAppearance, i, 19);
                    return;
                }
                return;
            case 4:
                appletTileAppearance.getClass();
                GapComposer gapComposer6 = (GapComposer) composer;
                gapComposer6.startRestartGroup(-80222131);
                if ((i & 48) == 0) {
                    i6 = i | (gapComposer6.changedInstance(this) ? 32 : 16);
                } else {
                    i6 = i;
                }
                if (gapComposer6.shouldExecute(i6 & 1, (i6 & 17) != 16)) {
                    FamilyAppletTileKt.UI((ApprovedContactsAppletTileViewModel$Uninstalled) Updater.collectAsState(stateFlow, null, gapComposer6, 1).getValue(), (TaxesAppletViewsModule$$ExternalSyntheticLambda1) function, gapComposer6, 0);
                } else {
                    gapComposer6.skipToGroupEnd();
                }
                RecomposeScopeImpl endRestartGroup5 = gapComposer6.endRestartGroup();
                if (endRestartGroup5 != null) {
                    endRestartGroup5.block = new ArcadeModal2Kt$$ExternalSyntheticLambda1(this, appletTileAppearance, i, 22);
                    return;
                }
                return;
            case 5:
                appletTileAppearance.getClass();
                GapComposer gapComposer7 = (GapComposer) composer;
                gapComposer7.startRestartGroup(-1894295281);
                if ((i & 48) == 0) {
                    i7 = i | (gapComposer7.changedInstance(this) ? 32 : 16);
                } else {
                    i7 = i;
                }
                if (gapComposer7.shouldExecute(i7 & 1, (i7 & 17) != 16)) {
                    FinishSetupAppletTileViewModel finishSetupAppletTileViewModel = (FinishSetupAppletTileViewModel) Updater.collectAsState(stateFlow, null, gapComposer7, 1).getValue();
                    if (finishSetupAppletTileViewModel instanceof FinishSetupAppletTileViewModel.Loading) {
                        gapComposer7.startReplaceGroup(648373427);
                        gapComposer7.end(false);
                    } else {
                        if (!(finishSetupAppletTileViewModel instanceof FinishSetupAppletTileViewModel.Installed)) {
                            throw Recorder$$ExternalSyntheticOutline2.m(gapComposer7, 648371443, false);
                        }
                        gapComposer7.startReplaceGroup(648374351);
                        FinishSetupAppletTileKt.InstalledFinishSetupTile((FinishSetupAppletTileViewModel.Installed) finishSetupAppletTileViewModel, (TaxesAppletViewsModule$$ExternalSyntheticLambda1) function, gapComposer7, 0);
                        gapComposer7.end(false);
                    }
                } else {
                    gapComposer7.skipToGroupEnd();
                }
                RecomposeScopeImpl endRestartGroup6 = gapComposer7.endRestartGroup();
                if (endRestartGroup6 != null) {
                    endRestartGroup6.block = new GooglePayPresenter$$ExternalSyntheticLambda0(this, appletTileAppearance, i, 13);
                    return;
                }
                return;
            case 6:
                int i11 = 2;
                appletTileAppearance.getClass();
                GapComposer gapComposer8 = (GapComposer) composer;
                gapComposer8.startRestartGroup(574545200);
                if ((i & 6) == 0) {
                    if (gapComposer8.changed(appletTileAppearance)) {
                        i11 = 4;
                    }
                    i8 = i11 | i;
                } else {
                    i8 = i;
                }
                if ((i & 48) == 0) {
                    i8 |= gapComposer8.changedInstance(this) ? 32 : 16;
                }
                if (gapComposer8.shouldExecute(i8 & 1, (i8 & 19) != 18)) {
                    gapComposer = gapComposer8;
                    ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(-984723515, new PdfPreviewView$$ExternalSyntheticLambda1(25, this, appletTileAppearance, Updater.collectAsState(stateFlow, null, gapComposer8, 1)), gapComposer8), gapComposer, 3072, 7);
                } else {
                    gapComposer = gapComposer8;
                    gapComposer.skipToGroupEnd();
                }
                RecomposeScopeImpl endRestartGroup7 = gapComposer.endRestartGroup();
                if (endRestartGroup7 != null) {
                    endRestartGroup7.block = new OpenSourceKt$$ExternalSyntheticLambda1(this, appletTileAppearance, i, 13);
                    return;
                }
                return;
            default:
                appletTileAppearance.getClass();
                int i12 = 2;
                GapComposer gapComposer9 = (GapComposer) composer;
                gapComposer9.startRestartGroup(-1855079669);
                if ((i & 6) == 0) {
                    if (gapComposer9.changed(appletTileAppearance)) {
                        i12 = 4;
                    }
                    i9 = i12 | i;
                } else {
                    i9 = i;
                }
                if ((i & 48) == 0) {
                    i9 |= gapComposer9.changedInstance(this) ? 32 : 16;
                }
                if (gapComposer9.shouldExecute(i9 & 1, (i9 & 19) != 18)) {
                    ViewPropertyAnimatorListenerAdapter.ScoreAppletTile((ScoreAppletTileViewModel) Updater.collectAsState(stateFlow, null, gapComposer9, 1).getValue(), (ScoreAppletViewsModule$$ExternalSyntheticLambda1) function, appletTileAppearance, null, gapComposer9, (i9 << 6) & 896);
                } else {
                    gapComposer9.skipToGroupEnd();
                }
                RecomposeScopeImpl endRestartGroup8 = gapComposer9.endRestartGroup();
                if (endRestartGroup8 != null) {
                    endRestartGroup8.block = new ShareSheetViewKt$$ExternalSyntheticLambda2(this, appletTileAppearance, i, 5);
                    return;
                }
                return;
        }
    }

    public void UninstalledUI(AgentsAppletTileViewModel.Uninstalled uninstalled, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-390795471);
        int i2 = (gapComposer.changedInstance(uninstalled) ? 4 : 2) | i | (gapComposer.changedInstance(this) ? 32 : 16);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            SharedUIKt.AppletTileRowUninstalledContent(R.drawable.agents_uninstalled_applet, 0, gapComposer, uninstalled.title, uninstalled.subtitle, (TaxesAppletViewsModule$$ExternalSyntheticLambda1) this.onClick);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new AtmPickerGridKt$$ExternalSyntheticLambda4(this, uninstalled, i, 26);
        }
    }

    @Override // com.squareup.cash.money.applets.viewmodels.AppletTile
    public final StateFlow getInstallationSectionId() {
        switch (this.$r8$classId) {
        }
        return this.installationSectionId;
    }

    @Override // com.squareup.cash.money.applets.viewmodels.AppletTile
    public final StateFlow getInstallationState() {
        switch (this.$r8$classId) {
        }
        return (DerivedStateFlow) this.installationState;
    }

    public KycAppletTile(StateFlow stateFlow, TaxesAppletViewsModule$$ExternalSyntheticLambda1 taxesAppletViewsModule$$ExternalSyntheticLambda1, byte b) {
        stateFlow.getClass();
        this.models = stateFlow;
        this.onClick = taxesAppletViewsModule$$ExternalSyntheticLambda1;
        this.installationSectionId = new StateFlowKt$stateFlowOf$1(AppletTileInstallationSectionId.SERVICE);
        this.installationState = new StateFlowKt$stateFlowOf$1(AppletTileInstallationState.Installed.INSTANCE);
    }

    public KycAppletTile(StateFlow stateFlow, TaxesAppletViewsModule$$ExternalSyntheticLambda1 taxesAppletViewsModule$$ExternalSyntheticLambda1, int i) {
        stateFlow.getClass();
        this.models = stateFlow;
        this.onClick = taxesAppletViewsModule$$ExternalSyntheticLambda1;
        this.installationSectionId = new StateFlowKt$stateFlowOf$1(AppletTileInstallationSectionId.SERVICE);
        this.installationState = new StateFlowKt$stateFlowOf$1(AppletTileInstallationState.Uninstalled.INSTANCE);
    }

    public KycAppletTile(StateFlow stateFlow, ScoreAppletViewsModule$$ExternalSyntheticLambda1 scoreAppletViewsModule$$ExternalSyntheticLambda1, byte b) {
        stateFlow.getClass();
        this.models = stateFlow;
        this.onClick = scoreAppletViewsModule$$ExternalSyntheticLambda1;
        this.installationSectionId = new StateFlowKt$stateFlowOf$1(AppletTileInstallationSectionId.SERVICE);
        this.installationState = StateFlowKt.mapState(stateFlow, new StoryQueries$$ExternalSyntheticLambda0(22));
    }

    public KycAppletTile(StateFlow stateFlow, TaxesAppletViewsModule$$ExternalSyntheticLambda1 taxesAppletViewsModule$$ExternalSyntheticLambda1) {
        stateFlow.getClass();
        this.models = stateFlow;
        this.onClick = taxesAppletViewsModule$$ExternalSyntheticLambda1;
        this.installationSectionId = new StateFlowKt$stateFlowOf$1(AppletTileInstallationSectionId.SERVICE);
        this.installationState = StateFlowKt.mapState(stateFlow, new CardMessageQueries$$ExternalSyntheticLambda1(20));
    }

    public KycAppletTile(StateFlow stateFlow, ScoreAppletViewsModule$$ExternalSyntheticLambda1 scoreAppletViewsModule$$ExternalSyntheticLambda1) {
        stateFlow.getClass();
        this.models = stateFlow;
        this.onClick = scoreAppletViewsModule$$ExternalSyntheticLambda1;
        this.installationSectionId = new StateFlowKt$stateFlowOf$1(AppletTileInstallationSectionId.SERVICE);
        this.installationState = StateFlowKt.mapState(stateFlow, new CalloutKt$$ExternalSyntheticLambda1(3));
    }

    public KycAppletTile(StateFlow stateFlow, TaxesAppletViewsModule$$ExternalSyntheticLambda1 taxesAppletViewsModule$$ExternalSyntheticLambda1, short s) {
        stateFlow.getClass();
        this.models = stateFlow;
        this.onClick = taxesAppletViewsModule$$ExternalSyntheticLambda1;
        this.installationSectionId = new StateFlowKt$stateFlowOf$1(AppletTileInstallationSectionId.BALANCE);
        this.installationState = StateFlowKt.mapState(stateFlow, new ActivityItemLayout$$ExternalSyntheticLambda4(13));
    }

    public KycAppletTile(StateFlow stateFlow, TaxesAppletViewsModule$$ExternalSyntheticLambda1 taxesAppletViewsModule$$ExternalSyntheticLambda1, byte b, boolean z) {
        stateFlow.getClass();
        this.models = stateFlow;
        this.onClick = taxesAppletViewsModule$$ExternalSyntheticLambda1;
        this.installationSectionId = new StateFlowKt$stateFlowOf$1(AppletTileInstallationSectionId.BALANCE);
        this.installationState = StateFlowKt.mapState(stateFlow, new PoolDetailsViewKt$$ExternalSyntheticLambda3(25));
    }

    public void UI(AgentsAppletTileViewModel agentsAppletTileViewModel, AppletTile.AppletTileAppearance appletTileAppearance, Composer composer, int i) {
        int i2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-982591135);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(agentsAppletTileViewModel) ? 4 : 2) | i;
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
            SharedUIKt.AppletTileRow(null, Expect_jvmKt.rememberComposableLambda(300456471, new LocalViewFactory$$ExternalSyntheticLambda6(25, agentsAppletTileViewModel, this, appletTileAppearance), gapComposer), gapComposer, 48, 1);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new CopyCodeKt$$ExternalSyntheticLambda10(this, agentsAppletTileViewModel, appletTileAppearance, i, 9);
        }
    }
}
