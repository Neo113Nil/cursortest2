package com.squareup.cash.payments.presenters;

import android.graphics.Matrix;
import android.os.Build;
import android.view.inputmethod.CursorAnchorInfo;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.RectangleShapeKt$RectangleShape$1;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import androidx.compose.ui.window.Api33Impl;
import androidx.media3.ui.PlayerView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.TransactorKt;
import androidx.room.util.DBUtil;
import app.cash.broadway.presenter.molecule.viewmodels.UiCallbackModel;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.google.android.gms.internal.mlkit_genai_prompt.zzacg;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.activity.views.AvatarsKt;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.components.DynamicColorConfiguration;
import com.squareup.cash.arcade.components.cell.CellDefaultAccessory;
import com.squareup.cash.arcade.components.cell.CellDefaultKt;
import com.squareup.cash.arcade.components.titlebar.NavigationType;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.blockers.views.SetPinViewKt$$ExternalSyntheticLambda4;
import com.squareup.cash.borrow.views.BulletinTileKt$$ExternalSyntheticLambda6;
import com.squareup.cash.card.onboarding.db.CardStudioQueries$$ExternalSyntheticLambda3;
import com.squareup.cash.card.spendinginsights.viewmodels.SpendingInsightsHomeViewModel;
import com.squareup.cash.card.ui.CashCardKt$$ExternalSyntheticLambda1;
import com.squareup.cash.cashapppay.views.GrantSheetKt$$ExternalSyntheticLambda4;
import com.squareup.cash.charting.components.ChartConfig;
import com.squareup.cash.charting.components.SegmentedBarChartKt;
import com.squareup.cash.charting.components.SelectionBehavior;
import com.squareup.cash.charting.viewmodels.SegmentedBarChartViewModel;
import com.squareup.cash.checks.CaptureCheckFaceKt$$ExternalSyntheticLambda15;
import com.squareup.cash.checks.CaptureCheckFaceKt$$ExternalSyntheticLambda6;
import com.squareup.cash.checks.CheckDepositAmountKt$$ExternalSyntheticLambda6;
import com.squareup.cash.checks.ConfirmBackOfCheckKt$$ExternalSyntheticLambda6;
import com.squareup.cash.data.contacts.ContactsStatus;
import com.squareup.cash.dialog.ArcadeModal2Kt$$ExternalSyntheticLambda3;
import com.squareup.cash.mooncake.compose_ui.components.LoadingIndicatorPosition;
import com.squareup.cash.nfc.views.NfcNotAvailableKt$$ExternalSyntheticLambda1;
import com.squareup.cash.payments.presenters.UtilsKt;
import com.squareup.cash.recipients.data.Recipient;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.franklin.api.Region;
import com.squareup.protos.franklin.ui.BlockState;
import com.squareup.protos.franklin.ui.MerchantData;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.ranges.RangesKt___RangesKt;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes6.dex */
public abstract class RecipientMapper {
    public static final void ActivitySection(SpendingInsightsHomeViewModel.Content.ActivitySection activitySection, Modifier modifier, Composer composer, int i) {
        UiCallbackModel uiCallbackModel = activitySection.embedded;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-225165417);
        int i2 = (gapComposer.changedInstance(activitySection) ? 4 : 2) | i | 48;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            String stringResource = Room.stringResource(gapComposer, R.string.spending_insights_show_more);
            String str = activitySection.title;
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            if (str == null) {
                gapComposer.startReplaceGroup(836163050);
                AvatarsKt.ActivityEmbeddedView(uiCallbackModel, companion, null, null, null, gapComposer, 48, EnumC0170g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(836268853);
                AvatarsKt.ActivityEmbeddedView(uiCallbackModel, companion, Expect_jvmKt.rememberComposableLambda(1773851095, new CheckDepositAmountKt$$ExternalSyntheticLambda6(15, activitySection, stringResource), gapComposer), null, null, gapComposer, 432, EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE);
                gapComposer.end(false);
            }
            modifier = companion;
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new CaptureCheckFaceKt$$ExternalSyntheticLambda6(activitySection, modifier, i, 7);
        }
    }

    public static final void ArcadeSpendingInsightsContent(SpendingInsightsHomeViewModel.Content content, Function1 function1, Modifier modifier, Composer composer, int i) {
        int i2;
        Modifier modifier2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1543091725);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(content) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        int i3 = i2 | MLKEMEngine.KyberPolyBytes;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 147) != 146)) {
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier verticalScroll$default = ImageKt.verticalScroll$default(SizeKt.fillMaxWidth(companion, 1.0f), ImageKt.rememberScrollState(gapComposer), false, 14);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.CenterHorizontally, gapComposer, 48);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, verticalScroll$default);
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
            OverviewSection(content.overviewSection, null, gapComposer, 0);
            SpendingInsightsHomeViewModel.Content.InsightsSection insightsSection = content.insightsSection;
            if (insightsSection == null) {
                gapComposer.startReplaceGroup(-813599);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-813598);
                DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer, null);
                InsightsSection(insightsSection, function1, null, gapComposer, i3 & 112);
                gapComposer.end(false);
            }
            ActivitySection(content.activitySection, null, gapComposer, 0);
            DisclosureSection(function1, gapComposer, i3 & 112);
            gapComposer.end(true);
            modifier2 = companion;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ArcadeModal2Kt$$ExternalSyntheticLambda3(content, function1, modifier2, i, 17);
        }
    }

    public static final void DisclosureSection(Function1 function1, Composer composer, int i) {
        int i2;
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-183320301);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(null) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            gapComposer.startReplaceGroup(1903434508);
            gapComposer.end(false);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new NfcNotAvailableKt$$ExternalSyntheticLambda1(function1, i, 9, false);
        }
    }

    public static final void InsightsSection(SpendingInsightsHomeViewModel.Content.InsightsSection insightsSection, Function1 function1, Modifier modifier, Composer composer, int i) {
        GapComposer gapComposer;
        Modifier modifier2;
        Icons icons;
        ComposableLambdaImpl composableLambdaImpl;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-86361150);
        int i2 = 2;
        int i3 = (i & 6) == 0 ? i | (gapComposer2.changedInstance(insightsSection) ? 4 : 2) : i;
        if ((i & 48) == 0) {
            i3 |= gapComposer2.changedInstance(function1) ? 32 : 16;
        }
        int i4 = i3 | MLKEMEngine.KyberPolyBytes;
        boolean z = true;
        boolean z2 = false;
        if (gapComposer2.shouldExecute(i4 & 1, (i4 & 147) != 146)) {
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer2, 0);
            int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, companion);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (gapComposer2.applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer2.startReusableNode();
            if (gapComposer2.inserting) {
                gapComposer2.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer2.useNode();
            }
            Updater.m576setimpl(gapComposer2, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer2, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer2, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer2, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer2, materializeModifier, ComposeUiNode.Companion.SetModifier);
            gapComposer2.startReplaceGroup(17883725);
            for (SpendingInsightsHomeViewModel.Content.InsightsSection.InsightsRow insightsRow : insightsSection.insights) {
                int ordinal = insightsRow.icon.ordinal();
                if (ordinal == 0) {
                    icons = Icons.RecurringAutomatic24;
                } else if (ordinal == z) {
                    icons = Icons.LocationDuo24;
                } else {
                    if (ordinal != i2) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return;
                    }
                    icons = Icons.Recenter24;
                }
                StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalColors;
                Colors colors = (Colors) gapComposer2.consume(staticProvidableCompositionLocal);
                if (colors == null) {
                    colors = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, z2);
                } else {
                    gapComposer2.startReplaceGroup(-1762997739);
                    gapComposer2.end(z2);
                }
                Icons icons2 = icons;
                long j = colors.semantic.background.subtle;
                Colors colors2 = (Colors) gapComposer2.consume(staticProvidableCompositionLocal);
                if (colors2 == null) {
                    colors2 = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, z2);
                } else {
                    gapComposer2.startReplaceGroup(-1762997739);
                    gapComposer2.end(z2);
                }
                long j2 = colors2.semantic.icon.subtle;
                String str = insightsRow.subtitle;
                if (str == null) {
                    gapComposer2.startReplaceGroup(-1930125118);
                    gapComposer2.end(z2);
                    composableLambdaImpl = null;
                } else {
                    gapComposer2.startReplaceGroup(-1930125117);
                    ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(733985636, new ConfirmBackOfCheckKt$$ExternalSyntheticLambda6(str, 19), gapComposer2);
                    gapComposer2.end(z2);
                    composableLambdaImpl = rememberComposableLambda;
                }
                CellDefaultAccessory.Push push = CellDefaultAccessory.Push.INSTANCE;
                ComposableLambdaImpl rememberComposableLambda2 = Expect_jvmKt.rememberComposableLambda(-475458849, new BulletinTileKt$$ExternalSyntheticLambda6(insightsRow, 23), gapComposer2);
                boolean changedInstance = ((i4 & 112) == 32 ? z : z2) | gapComposer2.changedInstance(insightsRow);
                Object rememberedValue = gapComposer2.rememberedValue();
                if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                    rememberedValue = new CaptureCheckFaceKt$$ExternalSyntheticLambda15(22, (Object) insightsRow, function1);
                    gapComposer2.updateRememberedValue(rememberedValue);
                }
                GapComposer gapComposer3 = gapComposer2;
                CellDefaultKt.m3391CellDefaultLargeIconaIPZJ5k(icons2, null, j, rememberComposableLambda2, null, j2, (Function0) rememberedValue, null, false, true, composableLambdaImpl, null, push, 0L, null, gapComposer3, 805309488, MLKEMEngine.KyberPolyBytes, 27024);
                i4 = i4;
                z2 = z2;
                gapComposer2 = gapComposer3;
                i2 = 2;
                companion = companion;
                z = true;
            }
            gapComposer = gapComposer2;
            modifier2 = companion;
            gapComposer.end(z2);
            gapComposer.end(true);
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ArcadeModal2Kt$$ExternalSyntheticLambda3(insightsSection, function1, modifier2, i, 18);
        }
    }

    public static final void OverviewSection(SpendingInsightsHomeViewModel.Content.OverviewSection overviewSection, Modifier modifier, Composer composer, int i) {
        GapComposer gapComposer;
        Modifier modifier2;
        SegmentedBarChartViewModel segmentedBarChartViewModel = overviewSection.chart;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-733799317);
        int i2 = (gapComposer2.changedInstance(overviewSection) ? 4 : 2) | i | 48;
        if (gapComposer2.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer2, 0);
            int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, fillMaxWidth);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (gapComposer2.applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer2.startReusableNode();
            if (gapComposer2.inserting) {
                gapComposer2.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer2.useNode();
            }
            Updater.m576setimpl(gapComposer2, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer2, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer2, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer2, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer2, materializeModifier, ComposeUiNode.Companion.SetModifier);
            DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer2, null);
            Object rememberedValue = gapComposer2.rememberedValue();
            if (rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new CardStudioQueries$$ExternalSyntheticLambda3(17);
                gapComposer2.updateRememberedValue(rememberedValue);
            }
            gapComposer = gapComposer2;
            modifier2 = companion;
            zzacg.m2010HeroNumericsHeadertv5qRRQ(segmentedBarChartViewModel.title, SemanticsModifierKt.semantics(companion, true, (Function1) rememberedValue), 3, (String) null, (String) null, segmentedBarChartViewModel.subtitle, (String) null, gapComposer, 0, 88);
            DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer, null);
            ChartConfig.StaticChartConfig staticChartConfig = new ChartConfig.StaticChartConfig(129.0f, 12.0f, SegmentedBarChartKt.DEFAULT_CAP_CONFIG, 2.0f, null, null, SegmentedBarChartKt.defaultChartConfig(gapComposer).axisLineColor, SelectionBehavior.EmphasizeLabel);
            Modifier fillMaxWidth2 = SizeKt.fillMaxWidth(modifier2, 1.0f);
            ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
            DefaultSizes.spacing.getClass();
            SegmentedBarChartKt.SegmentedBarChart(segmentedBarChartViewModel, SpacerKt.m300paddingVpY3zN4$default(fillMaxWidth2, 16.0f, RecyclerView.DECELERATION_RATE, 2), staticChartConfig, false, null, gapComposer, 512, 56);
            DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer, null);
            gapComposer.end(true);
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new CaptureCheckFaceKt$$ExternalSyntheticLambda6(overviewSection, modifier2, i, 6);
        }
    }

    public static final void SpendingInsightsHome(SpendingInsightsHomeViewModel spendingInsightsHomeViewModel, Function1 function1, Modifier modifier, Composer composer, int i) {
        Modifier modifier2;
        spendingInsightsHomeViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-742589674);
        int i2 = i | (gapComposer.changedInstance(spendingInsightsHomeViewModel) ? 4 : 2) | (gapComposer.changedInstance(function1) ? 32 : 16) | MLKEMEngine.KyberPolyBytes;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            long j = colors.semantic.background.f1047app;
            RectangleShapeKt$RectangleShape$1 rectangleShapeKt$RectangleShape$1 = ColorKt.RectangleShape;
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier systemBarsPadding = SpacerKt.systemBarsPadding(ImageKt.m177backgroundbw27NRU(companion, j, rectangleShapeKt$RectangleShape$1));
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, systemBarsPadding);
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
            String title = spendingInsightsHomeViewModel.getTitle();
            NavigationType navigationType = NavigationType.BACK;
            boolean z = (i2 & 112) == 32;
            Object rememberedValue = gapComposer.rememberedValue();
            if (z || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new GrantSheetKt$$ExternalSyntheticLambda4(9, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            DBUtil.TitleBarSub(title, navigationType, (Modifier) null, (DynamicColorConfiguration) null, (Function0) rememberedValue, (Modifier) null, (Function3) null, gapComposer, 48, 108);
            TransactorKt.LoadableContent(spendingInsightsHomeViewModel, spendingInsightsHomeViewModel instanceof SpendingInsightsHomeViewModel.Loading, null, LoadingIndicatorPosition.CENTER, null, null, Expect_jvmKt.rememberComposableLambda(759492309, new SetPinViewKt$$ExternalSyntheticLambda4(27, function1), gapComposer), gapComposer, 1575936 | (i2 & 14), 52);
            gapComposer.end(true);
            modifier2 = companion;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new CashCardKt$$ExternalSyntheticLambda1(i, 18, modifier2, spendingInsightsHomeViewModel, function1);
        }
    }

    public static final CursorAnchorInfo build(CursorAnchorInfo.Builder builder, TextFieldValue textFieldValue, OffsetMapping offsetMapping, TextLayoutResult textLayoutResult, Matrix matrix, Rect rect, Rect rect2, boolean z, boolean z2, boolean z3, boolean z4) {
        builder.reset();
        builder.setMatrix(matrix);
        long j = textFieldValue.selection;
        TextRange textRange = textFieldValue.composition;
        int m990getMinimpl = TextRange.m990getMinimpl(j);
        builder.setSelectionRange(m990getMinimpl, TextRange.m989getMaximpl(textFieldValue.selection));
        if (z && m990getMinimpl >= 0) {
            int originalToTransformed = offsetMapping.originalToTransformed(m990getMinimpl);
            Rect cursorRect = textLayoutResult.getCursorRect(originalToTransformed);
            float coerceIn = RangesKt___RangesKt.coerceIn(cursorRect.left, RecyclerView.DECELERATION_RATE, (int) (textLayoutResult.size >> 32));
            boolean containsInclusive = containsInclusive(rect, coerceIn, cursorRect.top);
            boolean containsInclusive2 = containsInclusive(rect, coerceIn, cursorRect.bottom);
            boolean z5 = textLayoutResult.getBidiRunDirection(originalToTransformed) == ResolvedTextDirection.Rtl;
            int i = (containsInclusive || containsInclusive2) ? 1 : 0;
            if (!containsInclusive || !containsInclusive2) {
                i |= 2;
            }
            if (z5) {
                i |= 4;
            }
            float f = cursorRect.top;
            float f2 = cursorRect.bottom;
            builder.setInsertionMarkerLocation(coerceIn, f, f2, f2, i);
        }
        if (z2) {
            int m990getMinimpl2 = textRange != null ? TextRange.m990getMinimpl(textRange.packedValue) : -1;
            int m989getMaximpl = textRange != null ? TextRange.m989getMaximpl(textRange.packedValue) : -1;
            if (m990getMinimpl2 >= 0 && m990getMinimpl2 < m989getMaximpl) {
                builder.setComposingText(m990getMinimpl2, textFieldValue.annotatedString.text.subSequence(m990getMinimpl2, m989getMaximpl));
                int originalToTransformed2 = offsetMapping.originalToTransformed(m990getMinimpl2);
                int originalToTransformed3 = offsetMapping.originalToTransformed(m989getMaximpl);
                float[] fArr = new float[(originalToTransformed3 - originalToTransformed2) * 4];
                textLayoutResult.multiParagraph.m965fillBoundingBoxes8ffj60Q(coil3.size.SizeKt.TextRange(originalToTransformed2, originalToTransformed3), fArr);
                for (int i2 = m990getMinimpl2; i2 < m989getMaximpl; i2++) {
                    int originalToTransformed4 = offsetMapping.originalToTransformed(i2);
                    int i3 = (originalToTransformed4 - originalToTransformed2) * 4;
                    float f3 = fArr[i3];
                    float f4 = fArr[i3 + 1];
                    float f5 = fArr[i3 + 2];
                    float f6 = fArr[i3 + 3];
                    int i4 = (f3 < rect.right ? 1 : 0) & (rect.left < f5 ? 1 : 0) & (rect.top < f6 ? 1 : 0) & (f4 < rect.bottom ? 1 : 0);
                    if (!containsInclusive(rect, f3, f4) || !containsInclusive(rect, f5, f6)) {
                        i4 |= 2;
                    }
                    if (textLayoutResult.getBidiRunDirection(originalToTransformed4) == ResolvedTextDirection.Rtl) {
                        i4 |= 4;
                    }
                    builder.addCharacterBounds(i2, f3, f4, f5, f6, i4);
                }
            }
        }
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 33 && z3) {
            Api33Impl.setEditorBoundsInfo(builder, rect2);
        }
        if (i5 >= 34 && z4) {
            PlayerView.Api34.addVisibleLineBounds(builder, textLayoutResult, rect);
        }
        return builder.build();
    }

    public static final boolean containsInclusive(Rect rect, float f, float f2) {
        float f3 = rect.left;
        if (f > rect.right || f3 > f) {
            return false;
        }
        return f2 <= rect.bottom && rect.top <= f2;
    }

    public static Recipient transform(com.squareup.cash.db.contacts.Recipient recipient) {
        MerchantData merchantData;
        ContactsStatus contactsStatus;
        recipient.getClass();
        String str = recipient.lookupKey;
        boolean z = recipient.alreadyInvited;
        boolean z2 = recipient.hasMultipleCustomers;
        String str2 = recipient.customerId;
        String str3 = recipient.threadedCustomerId;
        String str4 = recipient.cashtag;
        boolean z3 = recipient.isCashCustomer;
        boolean z4 = recipient.isVerified;
        boolean z5 = recipient.isBusiness;
        String str5 = recipient.email;
        String str6 = recipient.sms;
        Image image = recipient.photo;
        String str7 = recipient.emailAddresses;
        String str8 = recipient.smsNumbers;
        boolean z6 = recipient.canAcceptPayments;
        long j = recipient.creditCardFee;
        BlockState blockState = recipient.blockState;
        MerchantData merchantData2 = recipient.merchantData;
        boolean z7 = recipient.isRecent;
        String str9 = recipient.rawAccentColor;
        Color color = recipient.themedAccentColor;
        Region region = recipient.region;
        String str10 = recipient.category;
        Long l = recipient.joined_on;
        String str11 = recipient.fullName;
        String str12 = recipient.contactName;
        String str13 = recipient.investmentEntityToken;
        boolean z8 = recipient.isInContacts;
        com.squareup.protos.franklin.ui.ContactsStatus contactsStatus2 = recipient.contactsStatus;
        ContactsStatus contactsStatus3 = null;
        if (contactsStatus2 != null) {
            int i = UtilsKt.WhenMappings.$EnumSwitchMapping$1[contactsStatus2.ordinal()];
            merchantData = merchantData2;
            if (i == 1) {
                contactsStatus = ContactsStatus.IN_CONTACTS;
            } else if (i == 2) {
                contactsStatus = ContactsStatus.NOT_IN_CONTACTS;
            } else {
                if (i != 3) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                contactsStatus = ContactsStatus.CONTACTS_DISABLED;
            }
            contactsStatus3 = contactsStatus;
        } else {
            merchantData = merchantData2;
        }
        return new Recipient(str, z, z2, str2, str3, str4, z3, z4, z5, str5, str6, null, image, str7, str8, z6, j, blockState, merchantData, z7, str9, color, region, str10, l, str11, str12, str13, z8, contactsStatus3, null, recipient.isFavorite, false, null, 1073743872, 3);
    }

    public static com.squareup.cash.db.contacts.Recipient transform(Recipient recipient) {
        recipient.getClass();
        String str = recipient.lookupKey;
        boolean z = recipient.alreadyInvited;
        boolean z2 = recipient.hasMultipleCustomers;
        String str2 = recipient.customerId;
        String str3 = recipient.threadedCustomerId;
        String str4 = recipient.cashtag;
        boolean z3 = recipient.isCashCustomer;
        boolean z4 = recipient.isVerified;
        boolean z5 = recipient.isBusiness;
        String str5 = recipient.email;
        String str6 = recipient.sms;
        Image image = recipient.photo;
        String str7 = recipient.emailAddresses;
        String str8 = recipient.smsNumbers;
        boolean z6 = recipient.canAcceptPayments;
        long j = recipient.creditCardFee;
        BlockState blockState = recipient.blockState;
        MerchantData merchantData = recipient.merchantData;
        boolean z7 = recipient.isRecent;
        String str9 = recipient.rawAccentColor;
        Color color = recipient.themedAccentColor;
        Region region = recipient.region;
        String str10 = recipient.category;
        Long l = recipient.joined_on;
        String str11 = recipient.fullName;
        String str12 = recipient.contactName;
        String str13 = recipient.investmentEntityToken;
        boolean z8 = recipient.isInContacts;
        ContactsStatus contactsStatus = recipient.contactsStatus;
        return new com.squareup.cash.db.contacts.Recipient(str, z, z2, str2, str3, str4, z3, z4, z5, str5, str6, image, str7, str8, z6, j, blockState, merchantData, z7, str9, color, region, str10, l, str11, str12, str13, null, z8, contactsStatus != null ? UtilsKt.toProto(contactsStatus) : null, recipient.isFavorited, false, null, null, -2013265920, 63);
    }
}
