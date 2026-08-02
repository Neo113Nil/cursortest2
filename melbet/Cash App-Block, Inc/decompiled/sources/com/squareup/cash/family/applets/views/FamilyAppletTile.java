package com.squareup.cash.family.applets.views;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.animation.core.TransitionKt$$ExternalSyntheticLambda9;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.unit.Dp;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import app.cash.local.views.internal.DismissableToastKt$$ExternalSyntheticLambda4;
import app.cash.local.views.map.BrandSheetViewKt$$ExternalSyntheticLambda1;
import app.cash.local.views.wallet.TabContentViewKt$$ExternalSyntheticLambda38;
import bo.app.re$$ExternalSyntheticOutline0;
import bo.app.xg$$ExternalSyntheticLambda9;
import coil3.RealImageLoader;
import coil3.compose.LocalImageLoaderKt;
import com.google.android.gms.internal.mlkit_genai_prompt.zzadn;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.account.components.PinkThemeSparklesKt$$ExternalSyntheticLambda1;
import com.squareup.cash.activity.views.ActivityTabViewKt$$ExternalSyntheticLambda17;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticLambda9;
import com.squareup.cash.afterpayapplet.applets.viewmodels.AfterpayAppletTileViewModel;
import com.squareup.cash.afterpayapplet.applets.viewmodels.CreditStateType;
import com.squareup.cash.afterpayapplet.applets.views.AfterpayAppletTile$$ExternalSyntheticLambda1;
import com.squareup.cash.afterpayapplet.applets.views.AfterpayAppletTile$$ExternalSyntheticLambda11;
import com.squareup.cash.afterpayapplet.applets.views.AfterpayAppletTile$$ExternalSyntheticLambda2;
import com.squareup.cash.afterpayapplet.applets.views.AfterpayAppletTile$$ExternalSyntheticLambda7;
import com.squareup.cash.afterpayapplet.applets.views.AfterpayAppletTile$WhenMappings;
import com.squareup.cash.afterpayapplet.applets.views.AfterpayAppletTileViewModule$Companion;
import com.squareup.cash.appmessages.views.InlineAppMessageKt$$ExternalSyntheticLambda8;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.arcade.treehouse.ButtonBinding$$ExternalSyntheticLambda2;
import com.squareup.cash.arcade.treehouse.SearchBarBinding$Content$1$1;
import com.squareup.cash.badging.db.BadgeQueries$$ExternalSyntheticLambda5;
import com.squareup.cash.benefits.applets.viewmodels.BankingBenefitsAppletTileModel;
import com.squareup.cash.benefits.applets.views.BankingBenefitsAppletTile$$ExternalSyntheticLambda3;
import com.squareup.cash.benefits.views.BenefitsHubViewKt$$ExternalSyntheticLambda2;
import com.squareup.cash.common.composeui.DensityUtilsKt;
import com.squareup.cash.common.composeui.SegmentedCircleConfig;
import com.squareup.cash.common.composeui.VisibleKt;
import com.squareup.cash.common.viewmodels.CircleSegment;
import com.squareup.cash.core.views.ArcadeBottomNavigationKt$$ExternalSyntheticLambda3;
import com.squareup.cash.dialog.ComposeDialogKt$$ExternalSyntheticLambda12;
import com.squareup.cash.directory_ui.views.SectionKt$$ExternalSyntheticLambda2;
import com.squareup.cash.earnings.views.home.EarningsHomeKt$$ExternalSyntheticLambda2;
import com.squareup.cash.education.stories.db.StoryQueries$$ExternalSyntheticLambda0;
import com.squareup.cash.family.applets.viewmodels.FamilyAppletTileViewModel;
import com.squareup.cash.money.applets.common.viewmodels.PromotedAppletTileViewModel;
import com.squareup.cash.money.applets.common.views.InstalledServiceAppletTileLayoutConfig;
import com.squareup.cash.money.applets.common.views.SharedUIKt;
import com.squareup.cash.money.applets.viewmodels.AppletTile;
import com.squareup.cash.money.core.ids.AppletTileInstallationSectionId;
import com.squareup.cash.money.viewmodels.InstalledAppletTileHeaderModel;
import com.squareup.cash.money.viewmodels.InstalledServiceAppletTileContentModel;
import com.squareup.cash.music.views.TrackRowKt$$ExternalSyntheticLambda0;
import com.squareup.cash.tax.applet.views.TaxesAppletViewsModule$$ExternalSyntheticLambda1;
import com.squareup.util.Strings;
import com.squareup.util.coroutines.DerivedStateFlow;
import com.squareup.util.coroutines.StateFlowKt;
import com.squareup.util.coroutines.StateFlowKt$stateFlowOf$1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.builders.ListBuilder;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.StateFlow;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes5.dex */
public final class FamilyAppletTile implements AppletTile {
    public final /* synthetic */ int $r8$classId = 0;
    public final Object imageLoader;
    public final StateFlow installationSectionId;
    public final DerivedStateFlow installationState;
    public final StateFlow models;
    public final Function0 onClick;

    public FamilyAppletTile(StateFlow stateFlow, TaxesAppletViewsModule$$ExternalSyntheticLambda1 taxesAppletViewsModule$$ExternalSyntheticLambda1, TaxesAppletViewsModule$$ExternalSyntheticLambda1 taxesAppletViewsModule$$ExternalSyntheticLambda12, byte b) {
        stateFlow.getClass();
        this.models = stateFlow;
        this.imageLoader = taxesAppletViewsModule$$ExternalSyntheticLambda1;
        this.onClick = taxesAppletViewsModule$$ExternalSyntheticLambda12;
        this.installationState = StateFlowKt.mapState(stateFlow, new BenefitsHubViewKt$$ExternalSyntheticLambda2(4));
        this.installationSectionId = StateFlowKt.mapState(stateFlow, new BenefitsHubViewKt$$ExternalSyntheticLambda2(5));
    }

    public static Pair getLayoutConfigAndIconSize(boolean z, Composer composer) {
        if (z) {
            GapComposer gapComposer = (GapComposer) composer;
            gapComposer.startReplaceGroup(700203153);
            ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
            DefaultSizes.spacing.getClass();
            Pair pair = new Pair(new InstalledServiceAppletTileLayoutConfig(16.0f, RecyclerView.DECELERATION_RATE, ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).labelSmall, InstalledServiceAppletTileLayoutConfig.VisualPosition.END, Alignment.Companion.Bottom), new Dp(64.0f));
            gapComposer.end(false);
            return pair;
        }
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startReplaceGroup(700566256);
        StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalSizes;
        ((DefaultSizes) gapComposer2.consume(staticProvidableCompositionLocal)).getClass();
        DefaultSizes.spacing.getClass();
        ((DefaultSizes) gapComposer2.consume(staticProvidableCompositionLocal)).getClass();
        Pair pair2 = new Pair(new InstalledServiceAppletTileLayoutConfig(8.0f, ((Typography) gapComposer2.consume(ArcadeThemeKt.LocalTypography)).labelMedium, 24), new Dp(28.0f));
        gapComposer2.end(false);
        return pair2;
    }

    /* renamed from: AllocationSegmentedCircle-uFdPcIQ, reason: not valid java name */
    public void m3526AllocationSegmentedCircleuFdPcIQ(AfterpayAppletTileViewModel.Installed.CreditBreakdown.AllocationRow allocationRow, float f, boolean z, Composer composer, int i, int i2) {
        float f2;
        int i3;
        boolean z2;
        FamilyAppletTile familyAppletTile;
        float f3;
        boolean z3;
        ArrayList arrayList;
        ArrayList arrayList2;
        int i4;
        long j;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(2054569799);
        int i5 = (gapComposer.changedInstance(allocationRow) ? 4 : 2) | i;
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 = i5 | 48;
            f2 = f;
        } else {
            f2 = f;
            i3 = i5 | (gapComposer.changed(f2) ? 32 : 16);
        }
        int i7 = i2 & 4;
        if (i7 != 0) {
            i3 |= MLKEMEngine.KyberPolyBytes;
            familyAppletTile = this;
            z2 = z;
        } else {
            if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
                z2 = z;
                i3 |= gapComposer.changed(z2) ? 256 : 128;
            } else {
                z2 = z;
            }
            familyAppletTile = this;
        }
        int i8 = i3 | (gapComposer.changedInstance(familyAppletTile) ? 2048 : 1024);
        boolean z4 = false;
        int i9 = 1;
        if (gapComposer.shouldExecute(i8 & 1, (i8 & 1171) != 1170)) {
            float f4 = i6 != 0 ? 28.0f : f2;
            z3 = i7 != 0 ? false : z2;
            Modifier m285size3ABfNKs = SizeKt.m285size3ABfNKs(Modifier.Companion.$$INSTANCE, f4);
            if (allocationRow instanceof AfterpayAppletTileViewModel.Installed.CreditBreakdown.AllocationRow.CreditRingAllocation) {
                gapComposer.startReplaceGroup(1229180612);
                List<Pair> list = ((AfterpayAppletTileViewModel.Installed.CreditBreakdown.AllocationRow.CreditRingAllocation) allocationRow).allocations;
                ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
                for (Pair pair : list) {
                    float floatValue = ((Number) pair.first).floatValue();
                    AfterpayAppletTileViewModel.Installed.CreditBreakdown.AllocationRow.RingCreditLineType ringCreditLineType = (AfterpayAppletTileViewModel.Installed.CreditBreakdown.AllocationRow.RingCreditLineType) pair.second;
                    if (z3) {
                        gapComposer.startReplaceGroup(-888434931);
                        if (AfterpayAppletTile$WhenMappings.$EnumSwitchMapping$1[ringCreditLineType.ordinal()] == i9) {
                            gapComposer.startReplaceGroup(386985811);
                            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                            if (colors == null) {
                                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                            } else {
                                gapComposer.startReplaceGroup(-1762997739);
                                gapComposer.end(false);
                            }
                            arrayList2 = arrayList3;
                            j = colors.surface.money.applet.data.inactive.border;
                            gapComposer.end(false);
                        } else {
                            arrayList2 = arrayList3;
                            gapComposer.startReplaceGroup(386987602);
                            Colors colors2 = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                            if (colors2 == null) {
                                colors2 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                            } else {
                                gapComposer.startReplaceGroup(-1762997739);
                                gapComposer.end(false);
                            }
                            j = colors2.semantic.text.brand;
                            gapComposer.end(false);
                        }
                        gapComposer.end(false);
                        i4 = 1;
                    } else {
                        arrayList2 = arrayList3;
                        gapComposer.startReplaceGroup(-888240375);
                        int ordinal = ringCreditLineType.ordinal();
                        if (ordinal != 0) {
                            i4 = 1;
                            if (ordinal == 1) {
                                gapComposer.startReplaceGroup(386992407);
                                Colors colors3 = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                                if (colors3 == null) {
                                    colors3 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                                } else {
                                    gapComposer.startReplaceGroup(-1762997739);
                                    gapComposer.end(false);
                                }
                                j = colors3.base.brandOcean;
                                gapComposer.end(false);
                            } else if (ordinal == 2) {
                                gapComposer.startReplaceGroup(386994578);
                                Colors colors4 = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                                if (colors4 == null) {
                                    colors4 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                                } else {
                                    gapComposer.startReplaceGroup(-1762997739);
                                    gapComposer.end(false);
                                }
                                j = colors4.semantic.text.brand;
                                gapComposer.end(false);
                            } else if (ordinal == 3) {
                                gapComposer.startReplaceGroup(386996530);
                                Colors colors5 = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                                if (colors5 == null) {
                                    colors5 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                                } else {
                                    gapComposer.startReplaceGroup(-1762997739);
                                    gapComposer.end(false);
                                }
                                j = colors5.semantic.text.brand;
                                gapComposer.end(false);
                            } else if (ordinal != 4) {
                                gapComposer.startReplaceGroup(387001907);
                                Colors colors6 = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                                if (colors6 == null) {
                                    colors6 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                                } else {
                                    gapComposer.startReplaceGroup(-1762997739);
                                    gapComposer.end(false);
                                }
                                j = colors6.surface.money.applet.data.inactive.border;
                                gapComposer.end(false);
                            } else {
                                gapComposer.startReplaceGroup(386999443);
                                Colors colors7 = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                                if (colors7 == null) {
                                    colors7 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                                } else {
                                    gapComposer.startReplaceGroup(-1762997739);
                                    gapComposer.end(false);
                                }
                                j = colors7.surface.money.applet.data.inactive.border;
                                gapComposer.end(false);
                            }
                        } else {
                            i4 = 1;
                            gapComposer.startReplaceGroup(386990583);
                            Colors colors8 = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                            if (colors8 == null) {
                                colors8 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                            } else {
                                gapComposer.startReplaceGroup(-1762997739);
                                gapComposer.end(false);
                            }
                            j = colors8.base.brandOcean;
                            gapComposer.end(false);
                        }
                        gapComposer.end(false);
                    }
                    CircleSegment circleSegment = new CircleSegment(j, floatValue);
                    ArrayList arrayList4 = arrayList2;
                    arrayList4.add(circleSegment);
                    arrayList3 = arrayList4;
                    i9 = i4;
                }
                gapComposer.end(false);
                arrayList = arrayList3;
            } else {
                if (!(allocationRow instanceof AfterpayAppletTileViewModel.Installed.CreditBreakdown.AllocationRow.OwedRingAllocation)) {
                    throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, -1484371387, false);
                }
                gapComposer.startReplaceGroup(1229332729);
                StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalColors;
                Colors colors9 = (Colors) gapComposer.consume(staticProvidableCompositionLocal);
                if (colors9 == null) {
                    colors9 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                Color color = new Color(colors9.surface.money.applet.data.inactive.border);
                Colors colors10 = (Colors) gapComposer.consume(staticProvidableCompositionLocal);
                if (colors10 == null) {
                    colors10 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                List listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new Color[]{color, new Color(colors10.semantic.icon.subtle)});
                List list2 = ((AfterpayAppletTileViewModel.Installed.CreditBreakdown.AllocationRow.OwedRingAllocation) allocationRow).allocations;
                List list3 = listOf;
                Iterator it = list2.iterator();
                Iterator it2 = list3.iterator();
                ArrayList arrayList5 = new ArrayList(Math.min(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10), CollectionsKt__IterablesKt.collectionSizeOrDefault(list3, 10)));
                while (it.hasNext() && it2.hasNext()) {
                    arrayList5.add(new CircleSegment(((Color) it2.next()).value, ((Number) it.next()).floatValue()));
                    z4 = false;
                }
                gapComposer.end(z4);
                arrayList = arrayList5;
            }
            VisibleKt.SegmentedCircle(arrayList, new SegmentedCircleConfig(new SegmentedCircleConfig.SizingConfig.Fixed(DensityUtilsKt.m3477toPx8Feqmps(4.0f, gapComposer)), null, new SegmentedCircleConfig.SizingConfig.Fixed(DensityUtilsKt.m3477toPx8Feqmps(1.0f, gapComposer)), null, 0L, 0L, null, null, null, IptcConstants.IMAGE_RESOURCE_BLOCK_BACKGROUND_COLOR), m285size3ABfNKs, null, gapComposer, 0, 8);
            f3 = f4;
        } else {
            gapComposer.skipToGroupEnd();
            f3 = f2;
            z3 = z2;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new AfterpayAppletTile$$ExternalSyntheticLambda7(this, allocationRow, f3, z3, i, i2, 0);
        }
    }

    public void CreditBreakdownTile(AfterpayAppletTileViewModel.Installed.CreditBreakdown creditBreakdown, AppletTile.AppletTileAppearance appletTileAppearance, TaxesAppletViewsModule$$ExternalSyntheticLambda1 taxesAppletViewsModule$$ExternalSyntheticLambda1, Composer composer, int i) {
        ComposableLambdaImpl composableLambdaImpl;
        boolean z;
        ComposableLambdaImpl rememberComposableLambda;
        ComposableLambdaImpl composableLambdaImpl2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(804001045);
        int i2 = i | (gapComposer.changedInstance(creditBreakdown) ? 4 : 2) | (gapComposer.changed(appletTileAppearance) ? 32 : 16) | (gapComposer.changedInstance(taxesAppletViewsModule$$ExternalSyntheticLambda1) ? 256 : 128) | (gapComposer.changedInstance(this) ? 2048 : 1024);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 1171) != 1170)) {
            boolean z2 = appletTileAppearance.useRedesignedTiles;
            Pair layoutConfigAndIconSize = getLayoutConfigAndIconSize(z2, gapComposer);
            InstalledServiceAppletTileLayoutConfig installedServiceAppletTileLayoutConfig = (InstalledServiceAppletTileLayoutConfig) layoutConfigAndIconSize.first;
            float f = ((Dp) layoutConfigAndIconSize.second).value;
            gapComposer.startReplaceGroup(-449099436);
            List<AfterpayAppletTileViewModel.Installed.CreditBreakdown.AllocationRow> list = creditBreakdown.rows;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
            for (AfterpayAppletTileViewModel.Installed.CreditBreakdown.AllocationRow allocationRow : list) {
                String emphasisMoneyText = allocationRow.getEmphasisMoneyText();
                Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                if (colors == null) {
                    colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                InstalledServiceAppletTileContentModel.Emphasis emphasis = new InstalledServiceAppletTileContentModel.Emphasis(emphasisMoneyText, colors.semantic.text.standard, null);
                String briefText = allocationRow.getBriefText();
                if (z2) {
                    gapComposer.startReplaceGroup(-2054570372);
                    gapComposer.end(false);
                    composableLambdaImpl2 = null;
                } else {
                    gapComposer.startReplaceGroup(-2054529762);
                    ComposableLambdaImpl rememberComposableLambda2 = Expect_jvmKt.rememberComposableLambda(617387472, new BrandSheetViewKt$$ExternalSyntheticLambda1(19, this, allocationRow), gapComposer);
                    gapComposer.end(false);
                    composableLambdaImpl2 = rememberComposableLambda2;
                }
                arrayList.add(new InstalledServiceAppletTileContentModel(emphasis, briefText, null, composableLambdaImpl2, 4));
            }
            gapComposer.end(false);
            InstalledAppletTileHeaderModel installedAppletTileHeaderModel = new InstalledAppletTileHeaderModel(creditBreakdown.appletTitleText, null, null, 14);
            if (z2) {
                gapComposer.startReplaceGroup(-1036468184);
                AfterpayAppletTileViewModel.Installed.CreditBreakdown.AllocationRow allocationRow2 = (AfterpayAppletTileViewModel.Installed.CreditBreakdown.AllocationRow) CollectionsKt.firstOrNull(creditBreakdown.rows);
                if (allocationRow2 == null) {
                    gapComposer.startReplaceGroup(-1036468185);
                    z = false;
                    gapComposer.end(false);
                    rememberComposableLambda = null;
                } else {
                    z = false;
                    gapComposer.startReplaceGroup(-1036468184);
                    rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(515849192, new TabContentViewKt$$ExternalSyntheticLambda38(this, allocationRow2, f, 2), gapComposer);
                    gapComposer.end(false);
                }
                gapComposer.end(z);
                composableLambdaImpl = rememberComposableLambda;
            } else {
                gapComposer.startReplaceGroup(-1036354445);
                gapComposer.end(false);
                composableLambdaImpl = null;
            }
            SharedUIKt.InstalledServiceAppletTile(installedAppletTileHeaderModel, arrayList, taxesAppletViewsModule$$ExternalSyntheticLambda1, false, null, installedServiceAppletTileLayoutConfig, composableLambdaImpl, gapComposer, i2 & 896, 24);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new DismissableToastKt$$ExternalSyntheticLambda4(this, i, creditBreakdown, appletTileAppearance, taxesAppletViewsModule$$ExternalSyntheticLambda1, 14);
        }
    }

    /* renamed from: CreditDetailsSharedVisual-ziNgDLE, reason: not valid java name */
    public void m3527CreditDetailsSharedVisualziNgDLE(boolean z, float f, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(663607089);
        int i2 = i | (gapComposer.changed(z) ? 4 : 2) | (gapComposer.changed(f) ? 32 : 16);
        if (!gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            gapComposer.skipToGroupEnd();
        } else if (z) {
            gapComposer.startReplaceGroup(-215580165);
            StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalColors;
            Colors colors = (Colors) gapComposer.consume(staticProvidableCompositionLocal);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            long j = colors.semantic.background.warning;
            Icons icons = Icons.Alert24;
            Colors colors2 = (Colors) gapComposer.consume(staticProvidableCompositionLocal);
            if (colors2 == null) {
                colors2 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            SharedUIKt.m3604FilledCircleWithIconJqkWdHE(j, icons, colors2.semantic.icon.inverse, f, gapComposer, ((i2 << 6) & 7168) | 48, 0);
            gapComposer = gapComposer;
            gapComposer.end(false);
        } else {
            gapComposer.startReplaceGroup(-215357802);
            Icons icons2 = Icons.LogoAfterpay24;
            Colors colors3 = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors3 == null) {
                colors3 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            SharedUIKt.m3607ZeroBalanceIconaMcp0Q(icons2, colors3.semantic.background.brand, f, gapComposer, ((i2 << 3) & 896) | 6, 0);
            gapComposer.end(false);
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new PinkThemeSparklesKt$$ExternalSyntheticLambda1(this, z, f, i, 1);
        }
    }

    public void CreditDetailsTile(AfterpayAppletTileViewModel.Installed.CreditDetails creditDetails, AppletTile.AppletTileAppearance appletTileAppearance, TaxesAppletViewsModule$$ExternalSyntheticLambda1 taxesAppletViewsModule$$ExternalSyntheticLambda1, Composer composer, int i) {
        ComposableLambdaImpl composableLambdaImpl;
        boolean z;
        ComposableLambdaImpl composableLambdaImpl2;
        AfterpayAppletTileViewModel.Installed.CreditDetails creditDetails2 = creditDetails;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(295757267);
        int i2 = i | (gapComposer.changedInstance(creditDetails2) ? 4 : 2) | (gapComposer.changed(appletTileAppearance) ? 32 : 16) | (gapComposer.changedInstance(taxesAppletViewsModule$$ExternalSyntheticLambda1) ? 256 : 128) | (gapComposer.changedInstance(this) ? 2048 : 1024);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 1171) != 1170)) {
            boolean z2 = appletTileAppearance.useRedesignedTiles;
            Pair layoutConfigAndIconSize = getLayoutConfigAndIconSize(z2, gapComposer);
            InstalledServiceAppletTileLayoutConfig installedServiceAppletTileLayoutConfig = (InstalledServiceAppletTileLayoutConfig) layoutConfigAndIconSize.first;
            float f = ((Dp) layoutConfigAndIconSize.second).value;
            gapComposer.startReplaceGroup(754901944);
            ArrayList<AfterpayAppletTileViewModel.Installed.CreditDetails.CreditDetail> arrayList = creditDetails2.details;
            ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
            for (AfterpayAppletTileViewModel.Installed.CreditDetails.CreditDetail creditDetail : arrayList) {
                String str = creditDetail.emphasisMoneyText;
                Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                if (colors == null) {
                    z = z2;
                    colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    z = z2;
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                InstalledServiceAppletTileContentModel.Emphasis emphasis = new InstalledServiceAppletTileContentModel.Emphasis(str, colors.semantic.text.standard, null);
                String str2 = creditDetail.briefText;
                if (z) {
                    gapComposer.startReplaceGroup(471158040);
                    gapComposer.end(false);
                    composableLambdaImpl2 = null;
                } else {
                    gapComposer.startReplaceGroup(471208942);
                    ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(-15389540, new BalanceFeedKt$$ExternalSyntheticLambda9(creditDetail, 11), gapComposer);
                    gapComposer.end(false);
                    composableLambdaImpl2 = rememberComposableLambda;
                }
                arrayList2.add(new InstalledServiceAppletTileContentModel(emphasis, str2, null, composableLambdaImpl2, 4));
                z2 = z;
            }
            boolean z3 = z2;
            gapComposer.end(false);
            creditDetails2 = creditDetails;
            InstalledAppletTileHeaderModel installedAppletTileHeaderModel = new InstalledAppletTileHeaderModel(creditDetails2.appletTitleText, null, null, 14);
            if (z3) {
                gapComposer.startReplaceGroup(1928114732);
                ComposableLambdaImpl rememberComposableLambda2 = Expect_jvmKt.rememberComposableLambda(-1572235230, new TabContentViewKt$$ExternalSyntheticLambda38(this, creditDetails2, f, 3), gapComposer);
                gapComposer.end(false);
                composableLambdaImpl = rememberComposableLambda2;
            } else {
                gapComposer.startReplaceGroup(1928308885);
                gapComposer.end(false);
                composableLambdaImpl = null;
            }
            SharedUIKt.InstalledServiceAppletTile(installedAppletTileHeaderModel, arrayList2, taxesAppletViewsModule$$ExternalSyntheticLambda1, false, null, installedServiceAppletTileLayoutConfig, composableLambdaImpl, gapComposer, i2 & 896, 24);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new DismissableToastKt$$ExternalSyntheticLambda4(this, i, creditDetails2, appletTileAppearance, taxesAppletViewsModule$$ExternalSyntheticLambda1, 15);
        }
    }

    /* renamed from: CreditStateSharedVisual-ziNgDLE, reason: not valid java name */
    public void m3528CreditStateSharedVisualziNgDLE(CreditStateType creditStateType, float f, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(2066259384);
        int i2 = i | (gapComposer.changed(creditStateType.ordinal()) ? 4 : 2) | (gapComposer.changed(f) ? 32 : 16);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            int ordinal = creditStateType.ordinal();
            if (ordinal == 0 || ordinal == 1) {
                gapComposer.startReplaceGroup(1400382701);
                Icons icons = Icons.LogoAfterpay24;
                Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                if (colors == null) {
                    colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                SharedUIKt.m3607ZeroBalanceIconaMcp0Q(icons, colors.semantic.background.brand, f, gapComposer, ((i2 << 3) & 896) | 6, 0);
                gapComposer.end(false);
            } else {
                if (ordinal != 2) {
                    throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, 1400380143, false);
                }
                gapComposer.startReplaceGroup(462373642);
                StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalColors;
                Colors colors2 = (Colors) gapComposer.consume(staticProvidableCompositionLocal);
                if (colors2 == null) {
                    colors2 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                long j = colors2.semantic.background.warning;
                Icons icons2 = Icons.Alert24;
                Colors colors3 = (Colors) gapComposer.consume(staticProvidableCompositionLocal);
                if (colors3 == null) {
                    colors3 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                SharedUIKt.m3604FilledCircleWithIconJqkWdHE(j, icons2, colors3.semantic.icon.inverse, f, gapComposer, ((i2 << 6) & 7168) | 48, 0);
                gapComposer = gapComposer;
                gapComposer.end(false);
            }
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new TabContentViewKt$$ExternalSyntheticLambda38(this, creditStateType, f, i, 4);
        }
    }

    public void CreditStateTile(AfterpayAppletTileViewModel.Installed.CreditState creditState, AppletTile.AppletTileAppearance appletTileAppearance, TaxesAppletViewsModule$$ExternalSyntheticLambda1 taxesAppletViewsModule$$ExternalSyntheticLambda1, Composer composer, int i) {
        ComposableLambdaImpl composableLambdaImpl;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-642778059);
        int i2 = i | (gapComposer.changedInstance(creditState) ? 4 : 2) | (gapComposer.changed(appletTileAppearance) ? 32 : 16) | (gapComposer.changedInstance(taxesAppletViewsModule$$ExternalSyntheticLambda1) ? 256 : 128) | (gapComposer.changedInstance(this) ? 2048 : 1024);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 1171) != 1170)) {
            boolean z = appletTileAppearance.useRedesignedTiles;
            Pair layoutConfigAndIconSize = getLayoutConfigAndIconSize(z, gapComposer);
            InstalledServiceAppletTileLayoutConfig installedServiceAppletTileLayoutConfig = (InstalledServiceAppletTileLayoutConfig) layoutConfigAndIconSize.first;
            float f = ((Dp) layoutConfigAndIconSize.second).value;
            String str = creditState.emphasisMoneyText;
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            long j = colors.semantic.text.standard;
            ComposableLambdaImpl composableLambdaImpl2 = null;
            InstalledServiceAppletTileContentModel.Emphasis emphasis = new InstalledServiceAppletTileContentModel.Emphasis(str, j, null);
            String str2 = creditState.briefText;
            if (z) {
                gapComposer.startReplaceGroup(-2036406545);
                gapComposer.end(false);
                composableLambdaImpl = null;
            } else {
                gapComposer.startReplaceGroup(-2036361967);
                ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(142936436, new BrandSheetViewKt$$ExternalSyntheticLambda1(18, this, creditState), gapComposer);
                gapComposer.end(false);
                composableLambdaImpl = rememberComposableLambda;
            }
            InstalledServiceAppletTileContentModel installedServiceAppletTileContentModel = new InstalledServiceAppletTileContentModel(emphasis, str2, null, composableLambdaImpl, 4);
            InstalledAppletTileHeaderModel installedAppletTileHeaderModel = new InstalledAppletTileHeaderModel(creditState.appletTitleText, null, null, 14);
            List listOf = CollectionsKt__CollectionsJVMKt.listOf(installedServiceAppletTileContentModel);
            if (z) {
                gapComposer.startReplaceGroup(-2035792001);
                composableLambdaImpl2 = Expect_jvmKt.rememberComposableLambda(-1368117756, new TabContentViewKt$$ExternalSyntheticLambda38(this, creditState, f, 1), gapComposer);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-2035710285);
                gapComposer.end(false);
            }
            SharedUIKt.InstalledServiceAppletTile(installedAppletTileHeaderModel, listOf, taxesAppletViewsModule$$ExternalSyntheticLambda1, false, null, installedServiceAppletTileLayoutConfig, composableLambdaImpl2, gapComposer, 64 | (i2 & 896), 24);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new DismissableToastKt$$ExternalSyntheticLambda4(this, i, creditState, appletTileAppearance, taxesAppletViewsModule$$ExternalSyntheticLambda1, 12);
        }
    }

    public void DefaultStateTile(AfterpayAppletTileViewModel.Installed.DefaultState defaultState, AppletTile.AppletTileAppearance appletTileAppearance, TaxesAppletViewsModule$$ExternalSyntheticLambda1 taxesAppletViewsModule$$ExternalSyntheticLambda1, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(892620465);
        int i2 = i | (gapComposer.changedInstance(defaultState) ? 4 : 2) | (gapComposer.changed(appletTileAppearance) ? 32 : 16) | (gapComposer.changedInstance(taxesAppletViewsModule$$ExternalSyntheticLambda1) ? 256 : 128) | (gapComposer.changedInstance(this) ? 2048 : 1024);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 1171) != 1170)) {
            boolean z = appletTileAppearance.useRedesignedTiles;
            Pair layoutConfigAndIconSize = getLayoutConfigAndIconSize(z, gapComposer);
            InstalledServiceAppletTileLayoutConfig installedServiceAppletTileLayoutConfig = (InstalledServiceAppletTileLayoutConfig) layoutConfigAndIconSize.first;
            float f = ((Dp) layoutConfigAndIconSize.second).value;
            String str = defaultState.emphasisMoneyText;
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            long j = colors.semantic.text.standard;
            ComposableLambdaImpl composableLambdaImpl = null;
            InstalledServiceAppletTileContentModel installedServiceAppletTileContentModel = new InstalledServiceAppletTileContentModel(new InstalledServiceAppletTileContentModel.Emphasis(str, j, null), "available", null, z ? null : AfterpayAppletTileViewModule$Companion.lambda$50006064, 4);
            InstalledAppletTileHeaderModel installedAppletTileHeaderModel = new InstalledAppletTileHeaderModel(defaultState.appletTitleText, null, null, 14);
            List listOf = CollectionsKt__CollectionsJVMKt.listOf(installedServiceAppletTileContentModel);
            if (z) {
                gapComposer.startReplaceGroup(1914843192);
                composableLambdaImpl = Expect_jvmKt.rememberComposableLambda(-374126400, new TrackRowKt$$ExternalSyntheticLambda0(f, 1), gapComposer);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(1915058487);
                gapComposer.end(false);
            }
            SharedUIKt.InstalledServiceAppletTile(installedAppletTileHeaderModel, listOf, taxesAppletViewsModule$$ExternalSyntheticLambda1, false, null, installedServiceAppletTileLayoutConfig, composableLambdaImpl, gapComposer, 64 | (i2 & 896), 24);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new DismissableToastKt$$ExternalSyntheticLambda4(this, i, defaultState, appletTileAppearance, taxesAppletViewsModule$$ExternalSyntheticLambda1, 16);
        }
    }

    @Override // com.squareup.cash.money.applets.viewmodels.AppletTile
    public final void PromotedUI(AppletTile.AppletTileAppearance appletTileAppearance, Composer composer, int i) {
        int i2;
        RecomposeScopeImpl endRestartGroup;
        FamilyAppletTile$$ExternalSyntheticLambda1 familyAppletTile$$ExternalSyntheticLambda1;
        int i3;
        int i4;
        PromotedAppletTileViewModel.Loaded loaded;
        int i5 = this.$r8$classId;
        int i6 = 29;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        StateFlow stateFlow = this.models;
        appletTileAppearance.getClass();
        switch (i5) {
            case 0:
                GapComposer gapComposer = (GapComposer) composer;
                gapComposer.startRestartGroup(-1179328759);
                if ((i & 6) == 0) {
                    i2 = i | (gapComposer.changed(appletTileAppearance) ? 4 : 2);
                } else {
                    i2 = i;
                }
                if ((i & 48) == 0) {
                    i2 |= gapComposer.changedInstance(this) ? 32 : 16;
                }
                if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
                    FamilyAppletTileViewModel familyAppletTileViewModel = (FamilyAppletTileViewModel) Updater.collectAsState(stateFlow, null, gapComposer, 1).getValue();
                    FamilyAppletTileViewModel.Uninstalled uninstalled = familyAppletTileViewModel instanceof FamilyAppletTileViewModel.Uninstalled ? (FamilyAppletTileViewModel.Uninstalled) familyAppletTileViewModel : null;
                    PromotedAppletTileViewModel.Loaded loaded2 = uninstalled != null ? uninstalled.promotedModel : null;
                    if (loaded2 == null) {
                        gapComposer.startReplaceGroup(-550350640);
                        UI(appletTileAppearance, gapComposer, i2 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                        gapComposer.end(false);
                        endRestartGroup = gapComposer.endRestartGroup();
                        if (endRestartGroup != null) {
                            familyAppletTile$$ExternalSyntheticLambda1 = new FamilyAppletTile$$ExternalSyntheticLambda1(this, appletTileAppearance, i, 0);
                            endRestartGroup.block = familyAppletTile$$ExternalSyntheticLambda1;
                            break;
                        }
                    } else {
                        gapComposer.startReplaceGroup(-550311239);
                        gapComposer.end(false);
                        Updater.CompositionLocalProvider(LocalImageLoaderKt.LocalImageLoader.defaultProvidedValue$runtime((RealImageLoader) this.imageLoader), Expect_jvmKt.rememberComposableLambda(-1060445239, new ArcadeBottomNavigationKt$$ExternalSyntheticLambda3(i6, loaded2, this), gapComposer), gapComposer, 56);
                    }
                } else {
                    gapComposer.skipToGroupEnd();
                }
                endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                    familyAppletTile$$ExternalSyntheticLambda1 = new FamilyAppletTile$$ExternalSyntheticLambda1(this, appletTileAppearance, i, 1);
                    endRestartGroup.block = familyAppletTile$$ExternalSyntheticLambda1;
                }
                break;
            case 1:
                GapComposer gapComposer2 = (GapComposer) composer;
                gapComposer2.startRestartGroup(-1919644345);
                if ((i & 6) == 0) {
                    i3 = i | (gapComposer2.changed(appletTileAppearance) ? 4 : 2);
                } else {
                    i3 = i;
                }
                if ((i & 48) == 0) {
                    i3 |= gapComposer2.changedInstance(this) ? 32 : 16;
                }
                if (gapComposer2.shouldExecute(i3 & 1, (i3 & 19) != 18)) {
                    AfterpayAppletTileViewModel afterpayAppletTileViewModel = (AfterpayAppletTileViewModel) Updater.collectAsState(stateFlow, null, gapComposer2, 1).getValue();
                    AfterpayAppletTileViewModel.Uninstalled uninstalled2 = afterpayAppletTileViewModel instanceof AfterpayAppletTileViewModel.Uninstalled ? (AfterpayAppletTileViewModel.Uninstalled) afterpayAppletTileViewModel : null;
                    PromotedAppletTileViewModel promotedAppletTileViewModel = uninstalled2 != null ? uninstalled2.promotedModel : null;
                    if (promotedAppletTileViewModel instanceof PromotedAppletTileViewModel.Loaded) {
                        gapComposer2.startReplaceGroup(-634918901);
                        PromotedAppletTileViewModel.Loaded loaded3 = (PromotedAppletTileViewModel.Loaded) promotedAppletTileViewModel;
                        boolean changedInstance = gapComposer2.changedInstance(this);
                        Object rememberedValue = gapComposer2.rememberedValue();
                        if (changedInstance || rememberedValue == neverEqualPolicy) {
                            rememberedValue = new xg$$ExternalSyntheticLambda9(this, 29);
                            gapComposer2.updateRememberedValue(rememberedValue);
                        }
                        SharedUIKt.PromotedAppletTile(loaded3, (Function1) rememberedValue, null, gapComposer2, 0);
                        gapComposer2.end(false);
                    } else {
                        gapComposer2.startReplaceGroup(-634835201);
                        UI(appletTileAppearance, gapComposer2, i3 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                        gapComposer2.end(false);
                    }
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                RecomposeScopeImpl endRestartGroup2 = gapComposer2.endRestartGroup();
                if (endRestartGroup2 != null) {
                    endRestartGroup2.block = new AfterpayAppletTile$$ExternalSyntheticLambda11(this, appletTileAppearance, i, 0);
                    break;
                }
                break;
            default:
                GapComposer gapComposer3 = (GapComposer) composer;
                gapComposer3.startRestartGroup(1951070931);
                if ((i & 48) == 0) {
                    i4 = i | (gapComposer3.changedInstance(this) ? 32 : 16);
                } else {
                    i4 = i;
                }
                if (gapComposer3.shouldExecute(i4 & 1, (i4 & 17) != 16)) {
                    BankingBenefitsAppletTileModel bankingBenefitsAppletTileModel = (BankingBenefitsAppletTileModel) Updater.collectAsState(stateFlow, null, gapComposer3, 1).getValue();
                    BankingBenefitsAppletTileModel.Uninstalled uninstalled3 = bankingBenefitsAppletTileModel instanceof BankingBenefitsAppletTileModel.Uninstalled ? (BankingBenefitsAppletTileModel.Uninstalled) bankingBenefitsAppletTileModel : null;
                    PromotedAppletTileViewModel promotedAppletTileViewModel2 = uninstalled3 != null ? uninstalled3.promotedModel : null;
                    if (promotedAppletTileViewModel2 instanceof PromotedAppletTileViewModel.Loaded) {
                        gapComposer3.startReplaceGroup(561903888);
                        gapComposer3.end(false);
                        loaded = (PromotedAppletTileViewModel.Loaded) promotedAppletTileViewModel2;
                    } else {
                        gapComposer3.startReplaceGroup(561948280);
                        loaded = new PromotedAppletTileViewModel.Loaded(Room.stringResource(gapComposer3, R.string.benefits_promoted_applet_title), Room.stringResource(gapComposer3, R.string.benefits_promoted_applet_subtitle), 2131233366, null);
                        gapComposer3.end(false);
                    }
                    boolean changedInstance2 = gapComposer3.changedInstance(this);
                    Object rememberedValue2 = gapComposer3.rememberedValue();
                    if (changedInstance2 || rememberedValue2 == neverEqualPolicy) {
                        rememberedValue2 = new BadgeQueries$$ExternalSyntheticLambda5(this, 7);
                        gapComposer3.updateRememberedValue(rememberedValue2);
                    }
                    SharedUIKt.PromotedAppletTile(loaded, (Function1) rememberedValue2, null, gapComposer3, 0);
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                RecomposeScopeImpl endRestartGroup3 = gapComposer3.endRestartGroup();
                if (endRestartGroup3 != null) {
                    endRestartGroup3.block = new BankingBenefitsAppletTile$$ExternalSyntheticLambda3(this, appletTileAppearance, i, 0);
                    break;
                }
                break;
        }
    }

    @Override // com.squareup.cash.money.applets.viewmodels.AppletTile
    public final void UI(AppletTile.AppletTileAppearance appletTileAppearance, Composer composer, int i) {
        int i2;
        int i3;
        GapComposer gapComposer;
        int i4;
        int i5 = this.$r8$classId;
        Object obj = this.imageLoader;
        StateFlow stateFlow = this.models;
        int i6 = 16;
        appletTileAppearance.getClass();
        switch (i5) {
            case 0:
                GapComposer gapComposer2 = (GapComposer) composer;
                gapComposer2.startRestartGroup(-295622067);
                if ((i & 6) == 0) {
                    i2 = i | (gapComposer2.changed(appletTileAppearance) ? 4 : 2);
                } else {
                    i2 = i;
                }
                if ((i & 48) == 0) {
                    i2 |= gapComposer2.changedInstance(this) ? 32 : 16;
                }
                if (gapComposer2.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
                    Updater.CompositionLocalProvider(LocalImageLoaderKt.LocalImageLoader.defaultProvidedValue$runtime((RealImageLoader) obj), Expect_jvmKt.rememberComposableLambda(-2094534899, new EarningsHomeKt$$ExternalSyntheticLambda2(i6, this, appletTileAppearance, Updater.collectAsState(stateFlow, null, gapComposer2, 1)), gapComposer2), gapComposer2, 56);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                RecomposeScopeImpl endRestartGroup = gapComposer2.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.block = new FamilyAppletTile$$ExternalSyntheticLambda1(this, appletTileAppearance, i, 2);
                    break;
                }
                break;
            case 1:
                GapComposer gapComposer3 = (GapComposer) composer;
                gapComposer3.startRestartGroup(-571075957);
                if ((i & 6) == 0) {
                    i3 = i | (gapComposer3.changed(appletTileAppearance) ? 4 : 2);
                } else {
                    i3 = i;
                }
                if ((i & 48) == 0) {
                    i3 |= gapComposer3.changedInstance(this) ? 32 : 16;
                }
                if (gapComposer3.shouldExecute(i3 & 1, (i3 & 19) != 18)) {
                    gapComposer = gapComposer3;
                    UI((AfterpayAppletTileViewModel) Updater.collectAsState(stateFlow, null, gapComposer3, 1).getValue(), appletTileAppearance, (TaxesAppletViewsModule$$ExternalSyntheticLambda1) obj, (TaxesAppletViewsModule$$ExternalSyntheticLambda1) this.onClick, gapComposer, ((i3 << 3) & 112) | ((i3 << 9) & 57344));
                } else {
                    gapComposer = gapComposer3;
                    gapComposer.skipToGroupEnd();
                }
                RecomposeScopeImpl endRestartGroup2 = gapComposer.endRestartGroup();
                if (endRestartGroup2 != null) {
                    endRestartGroup2.block = new AfterpayAppletTile$$ExternalSyntheticLambda11(this, appletTileAppearance, i, 1);
                    break;
                }
                break;
            default:
                GapComposer gapComposer4 = (GapComposer) composer;
                gapComposer4.startRestartGroup(-1014694889);
                if ((i & 6) == 0) {
                    i4 = i | (gapComposer4.changed(appletTileAppearance) ? 4 : 2);
                } else {
                    i4 = i;
                }
                if ((i & 48) == 0) {
                    i4 |= gapComposer4.changedInstance(this) ? 32 : 16;
                }
                if (gapComposer4.shouldExecute(i4 & 1, (i4 & 19) != 18)) {
                    zzadn.Applet((BankingBenefitsAppletTileModel) Updater.collectAsState(stateFlow, null, gapComposer4, 1).getValue(), appletTileAppearance, (TaxesAppletViewsModule$$ExternalSyntheticLambda1) obj, gapComposer4, (i4 << 3) & 112);
                } else {
                    gapComposer4.skipToGroupEnd();
                }
                RecomposeScopeImpl endRestartGroup3 = gapComposer4.endRestartGroup();
                if (endRestartGroup3 != null) {
                    endRestartGroup3.block = new BankingBenefitsAppletTile$$ExternalSyntheticLambda3(this, appletTileAppearance, i, 1);
                    break;
                }
                break;
        }
    }

    public void UninstalledUI(AfterpayAppletTileViewModel.Uninstalled uninstalled, AppletTile.AppletTileAppearance appletTileAppearance, TaxesAppletViewsModule$$ExternalSyntheticLambda1 taxesAppletViewsModule$$ExternalSyntheticLambda1, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1166296029);
        int i2 = (gapComposer.changedInstance(uninstalled) ? 4 : 2) | i | (gapComposer.changedInstance(taxesAppletViewsModule$$ExternalSyntheticLambda1) ? 256 : 128);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 131) != 130)) {
            SharedUIKt.AppletTileRowUninstalledContent(2131231087, (i2 << 3) & 7168, gapComposer, uninstalled.title, uninstalled.subtitle, taxesAppletViewsModule$$ExternalSyntheticLambda1);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new DismissableToastKt$$ExternalSyntheticLambda4(this, i, uninstalled, appletTileAppearance, taxesAppletViewsModule$$ExternalSyntheticLambda1, 17);
        }
    }

    public void V3InstalledContent(AfterpayAppletTileViewModel.Installed.V3Installed v3Installed, AppletTile.AppletTileAppearance appletTileAppearance, TaxesAppletViewsModule$$ExternalSyntheticLambda1 taxesAppletViewsModule$$ExternalSyntheticLambda1, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-991606146);
        int i2 = (gapComposer.changedInstance(v3Installed) ? 4 : 2) | i | (gapComposer.changed(appletTileAppearance) ? 32 : 16) | (gapComposer.changedInstance(taxesAppletViewsModule$$ExternalSyntheticLambda1) ? 256 : 128) | (gapComposer.changedInstance(this) ? 2048 : 1024);
        if (!gapComposer.shouldExecute(i2 & 1, (i2 & 1171) != 1170)) {
            gapComposer.skipToGroupEnd();
        } else if (appletTileAppearance.useRedesignedTiles) {
            gapComposer.startReplaceGroup(-153476488);
            int i3 = i2 & 14;
            int i4 = i2 >> 3;
            V3InstalledRedesignedContent(v3Installed, taxesAppletViewsModule$$ExternalSyntheticLambda1, gapComposer, (i4 & 896) | i3 | (i4 & 112));
            gapComposer.end(false);
        } else {
            gapComposer.startReplaceGroup(-153395268);
            int i5 = i2 & 14;
            int i6 = i2 >> 3;
            V3InstalledLegacyContent(v3Installed, taxesAppletViewsModule$$ExternalSyntheticLambda1, gapComposer, (i6 & 896) | i5 | (i6 & 112));
            gapComposer.end(false);
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new DismissableToastKt$$ExternalSyntheticLambda4(this, i, v3Installed, appletTileAppearance, taxesAppletViewsModule$$ExternalSyntheticLambda1, 13);
        }
    }

    public void V3InstalledLegacyContent(AfterpayAppletTileViewModel.Installed.V3Installed v3Installed, TaxesAppletViewsModule$$ExternalSyntheticLambda1 taxesAppletViewsModule$$ExternalSyntheticLambda1, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-2064644005);
        int i2 = i | (gapComposer.changedInstance(v3Installed) ? 4 : 2);
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(taxesAppletViewsModule$$ExternalSyntheticLambda1) ? 32 : 16;
        }
        int i3 = 0;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            SharedUIKt.InstalledServiceAppletTile(null, CollectionsKt__CollectionsJVMKt.listOf(new InstalledServiceAppletTileContentModel(null, null, null, Expect_jvmKt.rememberComposableLambda(1381736838, new AfterpayAppletTile$$ExternalSyntheticLambda1(v3Installed, i3), gapComposer), 7)), taxesAppletViewsModule$$ExternalSyntheticLambda1, false, null, null, null, gapComposer, 70 | ((i2 << 3) & 896), 120);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new AfterpayAppletTile$$ExternalSyntheticLambda2(this, v3Installed, taxesAppletViewsModule$$ExternalSyntheticLambda1, i, 0);
        }
    }

    public void V3InstalledRedesignedContent(AfterpayAppletTileViewModel.Installed.V3Installed v3Installed, TaxesAppletViewsModule$$ExternalSyntheticLambda1 taxesAppletViewsModule$$ExternalSyntheticLambda1, Composer composer, int i) {
        TaxesAppletViewsModule$$ExternalSyntheticLambda1 taxesAppletViewsModule$$ExternalSyntheticLambda12;
        boolean z;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(329099636);
        int i2 = (gapComposer.changedInstance(v3Installed) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            taxesAppletViewsModule$$ExternalSyntheticLambda12 = taxesAppletViewsModule$$ExternalSyntheticLambda1;
            i2 |= gapComposer.changedInstance(taxesAppletViewsModule$$ExternalSyntheticLambda12) ? 32 : 16;
        } else {
            taxesAppletViewsModule$$ExternalSyntheticLambda12 = taxesAppletViewsModule$$ExternalSyntheticLambda1;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(this) ? 256 : 128;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            InstalledServiceAppletTileLayoutConfig installedServiceAppletTileLayoutConfig = (InstalledServiceAppletTileLayoutConfig) getLayoutConfigAndIconSize(true, gapComposer).first;
            gapComposer.startReplaceGroup(-1562823558);
            ListBuilder createListBuilder = CollectionsKt__CollectionsJVMKt.createListBuilder();
            InstalledServiceAppletTileContentModel.Emphasis emphasis = new InstalledServiceAppletTileContentModel.Emphasis(v3Installed.prefixMainLabel, Strings.getColors(gapComposer).semantic.text.standard, null);
            String str = v3Installed.suffixMainLabel;
            if (str == null) {
                str = "";
            }
            createListBuilder.add(new InstalledServiceAppletTileContentModel(emphasis, str, null, null, 12));
            String str2 = v3Installed.hint;
            if (str2 == null || str2.length() == 0) {
                z = false;
                gapComposer.startReplaceGroup(-1810725158);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-1811021146);
                createListBuilder.add(new InstalledServiceAppletTileContentModel(new InstalledServiceAppletTileContentModel.Emphasis(str2, Strings.getColors(gapComposer).semantic.text.subtle, Strings.getTypography(gapComposer).helpText), null, null, null, 14));
                z = false;
                gapComposer.end(false);
            }
            ListBuilder build = CollectionsKt__CollectionsJVMKt.build(createListBuilder);
            gapComposer.end(z);
            SharedUIKt.InstalledServiceAppletTile(new InstalledAppletTileHeaderModel(v3Installed.title, null, null, 14), build, taxesAppletViewsModule$$ExternalSyntheticLambda12, false, null, installedServiceAppletTileLayoutConfig, Expect_jvmKt.rememberComposableLambda(-973627714, new ButtonBinding$$ExternalSyntheticLambda2(v3Installed, this), gapComposer), gapComposer, 1572864 | ((i2 << 3) & 896), 24);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new AfterpayAppletTile$$ExternalSyntheticLambda2(this, v3Installed, taxesAppletViewsModule$$ExternalSyntheticLambda1, i, 1);
        }
    }

    public void V3UninstalledContent(AfterpayAppletTileViewModel.V3Uninstalled v3Uninstalled, TaxesAppletViewsModule$$ExternalSyntheticLambda1 taxesAppletViewsModule$$ExternalSyntheticLambda1, Composer composer, int i) {
        TaxesAppletViewsModule$$ExternalSyntheticLambda1 taxesAppletViewsModule$$ExternalSyntheticLambda12;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1622931780);
        int i2 = (gapComposer.changedInstance(v3Uninstalled) ? 4 : 2) | i | (gapComposer.changedInstance(taxesAppletViewsModule$$ExternalSyntheticLambda1) ? 32 : 16);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            taxesAppletViewsModule$$ExternalSyntheticLambda12 = taxesAppletViewsModule$$ExternalSyntheticLambda1;
            SharedUIKt.AppletTileRowUninstalledContent(2131231087, (i2 << 6) & 7168, gapComposer, v3Uninstalled.title, v3Uninstalled.subtitle, taxesAppletViewsModule$$ExternalSyntheticLambda12);
        } else {
            taxesAppletViewsModule$$ExternalSyntheticLambda12 = taxesAppletViewsModule$$ExternalSyntheticLambda1;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new InlineAppMessageKt$$ExternalSyntheticLambda8(this, v3Uninstalled, taxesAppletViewsModule$$ExternalSyntheticLambda12, i, 4);
        }
    }

    @Override // com.squareup.cash.money.applets.viewmodels.AppletTile
    public final StateFlow getInstallationSectionId() {
        switch (this.$r8$classId) {
            case 0:
                return (StateFlowKt$stateFlowOf$1) this.installationSectionId;
            case 1:
                return (StateFlowKt$stateFlowOf$1) this.installationSectionId;
            default:
                return this.installationState;
        }
    }

    @Override // com.squareup.cash.money.applets.viewmodels.AppletTile
    public final StateFlow getInstallationState() {
        switch (this.$r8$classId) {
            case 0:
                return this.installationState;
            case 1:
                return this.installationState;
            default:
                return (DerivedStateFlow) this.installationSectionId;
        }
    }

    public FamilyAppletTile(RealImageLoader realImageLoader, TaxesAppletViewsModule$$ExternalSyntheticLambda1 taxesAppletViewsModule$$ExternalSyntheticLambda1, StateFlow stateFlow) {
        stateFlow.getClass();
        this.models = stateFlow;
        this.imageLoader = realImageLoader;
        this.onClick = taxesAppletViewsModule$$ExternalSyntheticLambda1;
        this.installationSectionId = new StateFlowKt$stateFlowOf$1(AppletTileInstallationSectionId.SERVICE);
        this.installationState = StateFlowKt.mapState(stateFlow, new StoryQueries$$ExternalSyntheticLambda0(23));
    }

    public FamilyAppletTile(StateFlow stateFlow, TaxesAppletViewsModule$$ExternalSyntheticLambda1 taxesAppletViewsModule$$ExternalSyntheticLambda1, TaxesAppletViewsModule$$ExternalSyntheticLambda1 taxesAppletViewsModule$$ExternalSyntheticLambda12) {
        stateFlow.getClass();
        this.models = stateFlow;
        this.imageLoader = taxesAppletViewsModule$$ExternalSyntheticLambda1;
        this.onClick = taxesAppletViewsModule$$ExternalSyntheticLambda12;
        this.installationSectionId = new StateFlowKt$stateFlowOf$1(AppletTileInstallationSectionId.SERVICE);
        this.installationState = StateFlowKt.mapState(stateFlow, new ActivityTabViewKt$$ExternalSyntheticLambda17(14));
    }

    public void UI(FamilyAppletTileViewModel familyAppletTileViewModel, AppletTile.AppletTileAppearance appletTileAppearance, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1903832033);
        int i2 = (gapComposer.changedInstance(familyAppletTileViewModel) ? 4 : 2) | i | (gapComposer.changed(appletTileAppearance) ? 32 : 16) | (gapComposer.changedInstance(this) ? 256 : 128);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            SharedUIKt.AppletTileRow(null, Expect_jvmKt.rememberComposableLambda(-1108087657, new SectionKt$$ExternalSyntheticLambda2(26, familyAppletTileViewModel, this, appletTileAppearance), gapComposer), gapComposer, 48, 1);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new EarningsHomeKt$$ExternalSyntheticLambda2(this, familyAppletTileViewModel, appletTileAppearance, i, 17);
        }
    }

    public void UI(AfterpayAppletTileViewModel afterpayAppletTileViewModel, AppletTile.AppletTileAppearance appletTileAppearance, TaxesAppletViewsModule$$ExternalSyntheticLambda1 taxesAppletViewsModule$$ExternalSyntheticLambda1, TaxesAppletViewsModule$$ExternalSyntheticLambda1 taxesAppletViewsModule$$ExternalSyntheticLambda12, Composer composer, int i) {
        int i2;
        TaxesAppletViewsModule$$ExternalSyntheticLambda1 taxesAppletViewsModule$$ExternalSyntheticLambda13;
        afterpayAppletTileViewModel.getClass();
        appletTileAppearance.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1183654497);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(afterpayAppletTileViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changed(appletTileAppearance) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            taxesAppletViewsModule$$ExternalSyntheticLambda13 = taxesAppletViewsModule$$ExternalSyntheticLambda1;
            i2 |= gapComposer.changedInstance(taxesAppletViewsModule$$ExternalSyntheticLambda13) ? 256 : 128;
        } else {
            taxesAppletViewsModule$$ExternalSyntheticLambda13 = taxesAppletViewsModule$$ExternalSyntheticLambda1;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer.changedInstance(taxesAppletViewsModule$$ExternalSyntheticLambda12) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= gapComposer.changedInstance(this) ? 16384 : PKIFailureInfo.certRevoked;
        }
        int i3 = i2;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 9363) != 9362)) {
            ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(1435824341, new ComposeDialogKt$$ExternalSyntheticLambda12(afterpayAppletTileViewModel, taxesAppletViewsModule$$ExternalSyntheticLambda13, this, appletTileAppearance, 10), gapComposer);
            Continuation continuation = null;
            SharedUIKt.AppletTileRow(null, rememberComposableLambda, gapComposer, 48, 1);
            boolean changedInstance = gapComposer.changedInstance(afterpayAppletTileViewModel) | ((i3 & 7168) == 2048);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new SearchBarBinding$Content$1$1(afterpayAppletTileViewModel, taxesAppletViewsModule$$ExternalSyntheticLambda12, continuation, 9);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Updater.LaunchedEffect(gapComposer, afterpayAppletTileViewModel, (Function2) rememberedValue);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new TransitionKt$$ExternalSyntheticLambda9(this, afterpayAppletTileViewModel, appletTileAppearance, taxesAppletViewsModule$$ExternalSyntheticLambda1, taxesAppletViewsModule$$ExternalSyntheticLambda12, i, 9);
        }
    }
}
