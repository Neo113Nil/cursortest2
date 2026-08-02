package com.squareup.cash.moneybot.views.plugins;

import android.content.res.Configuration;
import androidx.camera.core.CameraSelector$$ExternalSyntheticOutline0;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.layout.Arrangement$Top$1;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.ValueInsets;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.unit.Density;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.charting.viewmodels.LineChartViewModel;
import com.squareup.cash.money.views.MoneyTabUIKt$$ExternalSyntheticLambda6;
import com.squareup.cash.moneybot.backend.api.model.chat.clientrenderable.SlotContent;
import com.squareup.cash.moneybot.theme.MoneybotColors;
import com.squareup.cash.moneybot.theme.MoneybotColorsKt;
import com.squareup.cash.moneybot.theme.MoneybotThemeKt;
import com.squareup.cash.moneybot.viewmodels.plugins.SlotContentViewModel;
import com.squareup.cash.moneybot.viewmodels.plugins.SlottedCardViewModel;
import com.squareup.cash.moneybot.views.card.CardUiKt;
import com.squareup.cash.moneybot.views.card.InsightChartKt$$ExternalSyntheticLambda19;
import com.squareup.cash.moneybot.views.shared.LocalMoneybotAnimationsEnabledKt;
import com.squareup.cash.moneybot.views.shared.LocalMoneybotSlotContentAnimationsReadyKt;
import com.squareup.cash.music.views.MusicViewKt$$ExternalSyntheticLambda5;
import com.squareup.cash.music.views.MusicViewKt$$ExternalSyntheticLambda8;
import com.squareup.cash.overlays.FakeOverlayLayerKt$$ExternalSyntheticLambda0;
import com.squareup.cash.p2pblocking.views.P2PListViewKt$$ExternalSyntheticLambda12;
import com.squareup.protos.cash.kgoose.api.v3.Metric;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.franklin.ui.UiAvatar;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public abstract class SlottedCardKt {
    static {
        Metric.TrendDirection.Companion companion = Metric.TrendDirection.INSTANCE;
        SlottedTableKt.THREE_ROWS.getClass();
        Color color = new Color(new Color.ModeVariant("#00C730", null, null, null, null, 30, null), new Color.ModeVariant("#00D632", null, null, null, null, 30, null), 4);
        List<Pair> listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new Pair[]{new Pair(0L, 18L), new Pair(12L, 34L), new Pair(24L, 28L), new Pair(36L, 25L), new Pair(48L, 32L), new Pair(60L, 44L), new Pair(72L, 43L), new Pair(84L, 78L), new Pair(96L, 110L), new Pair(108L, 146L), new Pair(120L, 152L), new Pair(132L, 80L), new Pair(144L, 72L), new Pair(156L, 75L), new Pair(168L, 119L), new Pair(176L, 151L)});
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listOf, 10));
        for (Pair pair : listOf) {
            arrayList.add(new LineChartViewModel.Line.Point(((Number) pair.first).longValue(), ((Number) pair.second).longValue(), null, null, null, null, EnumC0170g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE));
        }
        List listOf2 = CollectionsKt__CollectionsJVMKt.listOf(new LineChartViewModel.Line(arrayList, color));
        EmptyList.INSTANCE.getClass();
        listOf2.getClass();
        SlottedCompositionChartKt.SPENDING_COMPOSITION_CHART.getClass();
        CollectionsKt__CollectionsKt.listOf((Object[]) new SlotContent.StackedImage.Content[]{new SlotContent.StackedImage.Content.Avatar(new UiAvatar(null, "a", null, null, new Image("fake:///nvda.png", "fake:///nvda.png", 4), null, null, 32637)), new SlotContent.StackedImage.Content.Text(null, "-$80")}).getClass();
        new Color(new Color.ModeVariant("#00C730", null, null, null, null, 30, null), new Color.ModeVariant("#00D632", null, null, null, null, 30, null), 4);
        CollectionsKt__CollectionsKt.listOf((Object[]) new SlotContent.ProgressRing.Content[]{new SlotContent.ProgressRing.Content.Avatar(new UiAvatar(null, null, null, null, new Image("fake:///nvda.png", "fake:///nvda.png", 4), null, null, 32639)), new SlotContent.ProgressRing.Content.Text(null, "$60")}).getClass();
    }

    public static final void SlotContent(SlotContentViewModel slotContentViewModel, Modifier modifier, Composer composer, int i) {
        BiasAlignment.Horizontal horizontal = Alignment.Companion.Start;
        Arrangement$Top$1 arrangement$Top$1 = SpacerKt.Top;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1072327105);
        Applier applier = gapComposer.applier;
        int i2 = (gapComposer.changedInstance(slotContentViewModel) ? 4 : 2) | i;
        if (!gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            gapComposer.skipToGroupEnd();
        } else if (slotContentViewModel instanceof SlotContentViewModel.Metric) {
            gapComposer.startReplaceGroup(-285799163);
            SlottedMetricKt.SlottedMetric(((SlotContentViewModel.Metric) slotContentViewModel).model, modifier, gapComposer, 48);
            gapComposer.end(false);
        } else if (slotContentViewModel instanceof SlotContentViewModel.Table) {
            gapComposer.startReplaceGroup(-285797116);
            SlottedTableKt.SlottedTable(((SlotContentViewModel.Table) slotContentViewModel).model, modifier, gapComposer, 48);
            gapComposer.end(false);
        } else if (slotContentViewModel instanceof SlotContentViewModel.LineGraph) {
            gapComposer.startReplaceGroup(-269705911);
            SlotContentViewModel.LineGraph lineGraph = (SlotContentViewModel.LineGraph) slotContentViewModel;
            SlottedLineGraphKt.SlottedLineGraph(lineGraph.model, modifier, lineGraph.accessibilityLabel, gapComposer, 48);
            gapComposer.end(false);
        } else if (slotContentViewModel instanceof SlotContentViewModel.CompositionChart) {
            gapComposer.startReplaceGroup(-285788977);
            SlottedCompositionChartKt.SlottedCompositionChart(((SlotContentViewModel.CompositionChart) slotContentViewModel).model, modifier, gapComposer, 48);
            gapComposer.end(false);
        } else {
            boolean z = slotContentViewModel instanceof SlotContentViewModel.StackedImage;
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            if (z) {
                gapComposer.startReplaceGroup(-285786122);
                ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer, 0);
                int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
                Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, companion);
                ComposeUiNode.Companion.getClass();
                LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                if (applier == null) {
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
                SpacerKt.Spacer(gapComposer, SizeKt.m277height3ABfNKs(companion, 48.0f));
                TextCardKt.SlottedStackedImage(((SlotContentViewModel.StackedImage) slotContentViewModel).model, modifier, gapComposer, 48);
                gapComposer.end(true);
                gapComposer.end(false);
            } else {
                if (!(slotContentViewModel instanceof SlotContentViewModel.ProgressRing)) {
                    throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, -285799852, false);
                }
                gapComposer.startReplaceGroup(-285781194);
                ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer, 0);
                int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
                Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, companion);
                ComposeUiNode.Companion.getClass();
                LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
                if (applier == null) {
                    Updater.invalidApplier();
                    throw null;
                }
                gapComposer.startReusableNode();
                if (gapComposer.inserting) {
                    gapComposer.createNode(layoutNode$Companion$Constructor$12);
                } else {
                    gapComposer.useNode();
                }
                Updater.m576setimpl(gapComposer, columnMeasurePolicy2, ComposeUiNode.Companion.SetMeasurePolicy);
                Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode2), ComposeUiNode.Companion.SetCompositeKeyHash);
                Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                Updater.m576setimpl(gapComposer, materializeModifier2, ComposeUiNode.Companion.SetModifier);
                SpacerKt.Spacer(gapComposer, SizeKt.m277height3ABfNKs(companion, 48.0f));
                TextCardKt.SlottedProgressRing(((SlotContentViewModel.ProgressRing) slotContentViewModel).model, modifier, gapComposer, 48);
                gapComposer.end(true);
                gapComposer.end(false);
            }
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new FakeOverlayLayerKt$$ExternalSyntheticLambda0(slotContentViewModel, modifier, i, 8);
        }
    }

    public static final void SlotContentHost(SlotContentViewModel slotContentViewModel, String str, Modifier modifier, Composer composer, int i) {
        Modifier modifier2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1465888452);
        int i2 = i | (gapComposer.changedInstance(slotContentViewModel) ? 4 : 2) | (gapComposer.changed(str) ? 32 : 16);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            boolean booleanValue = ((Boolean) gapComposer.consume(LocalMoneybotAnimationsEnabledKt.LocalMoneybotAnimationsEnabled)).booleanValue();
            String str2 = (String) gapComposer.consume(LocalMoneybotSlotContentAnimationsReadyKt.LocalMoneybotSlotContentAnimationResetKey);
            float mo236toPx0680j_4 = ((Density) gapComposer.consume(CompositionLocalsKt.LocalDensity)).mo236toPx0680j_4(((Configuration) gapComposer.consume(AndroidCompositionLocals_androidKt.LocalConfiguration)).screenHeightDp) * 0.7f;
            String m = CameraSelector$$ExternalSyntheticOutline0.m("slot-content:", str2, ":", str);
            Object[] objArr = new Object[0];
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (rememberedValue == neverEqualPolicy) {
                rememberedValue = new MoneyTabUIKt$$ExternalSyntheticLambda6(22);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            MutableState mutableState = (MutableState) SaverKt.rememberSaveable(objArr, null, m, (Function0) rememberedValue, gapComposer, 3072, 2);
            boolean changed = ((i2 & 112) == 32) | gapComposer.changed(str2);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (changed || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = Updater.mutableStateOf$default(Boolean.FALSE);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            MutableState mutableState2 = (MutableState) rememberedValue2;
            boolean z = !booleanValue || ((Boolean) mutableState.getValue()).booleanValue() || ((Boolean) mutableState2.getValue()).booleanValue();
            boolean z2 = (slotContentViewModel instanceof SlotContentViewModel.LineGraph) && booleanValue;
            boolean changed2 = gapComposer.changed(booleanValue) | gapComposer.changed(mutableState) | gapComposer.changed(mutableState2) | gapComposer.changed(mo236toPx0680j_4);
            Object rememberedValue3 = gapComposer.rememberedValue();
            if (changed2 || rememberedValue3 == neverEqualPolicy) {
                rememberedValue3 = new SlottedCardKt$$ExternalSyntheticLambda4(booleanValue, mo236toPx0680j_4, mutableState, mutableState2);
                gapComposer.updateRememberedValue(rememberedValue3);
            }
            modifier2 = modifier;
            Modifier onGloballyPositioned = ValueInsets.onGloballyPositioned(modifier2, (Function1) rememberedValue3);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, onGloballyPositioned);
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
            Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            ProvidedValue defaultProvidedValue$runtime = LocalMoneybotSlotContentAnimationsReadyKt.LocalMoneybotSlotContentAnimationsReady.defaultProvidedValue$runtime(Boolean.valueOf(z));
            StaticProvidableCompositionLocal staticProvidableCompositionLocal = LocalMoneybotSlotContentAnimationsReadyKt.LocalMoneybotSlotContentShouldAnimate;
            Boolean bool = (Boolean) mutableState2.getValue();
            bool.getClass();
            Updater.CompositionLocalProvider(new ProvidedValue[]{defaultProvidedValue$runtime, staticProvidableCompositionLocal.defaultProvidedValue$runtime(bool)}, Expect_jvmKt.rememberComposableLambda(1888571582, new SlottedCardKt$$ExternalSyntheticLambda5(z2, z, slotContentViewModel), gapComposer), gapComposer, 56);
            gapComposer.end(true);
        } else {
            modifier2 = modifier;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new MusicViewKt$$ExternalSyntheticLambda5(slotContentViewModel, str, modifier2, i, 21);
        }
    }

    public static final void SlottedCard(SlottedCardViewModel slottedCardViewModel, Modifier modifier, Function1 function1, Composer composer, int i) {
        Modifier modifier2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1515165534);
        int i2 = 4;
        int i3 = (gapComposer.changedInstance(slottedCardViewModel) ? 4 : 2) | i | 48;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 19) != 18)) {
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier m276defaultMinSizeVpY3zN4$default = SizeKt.m276defaultMinSizeVpY3zN4$default(SizeKt.fillMaxWidth(companion, 1.0f), RecyclerView.DECELERATION_RATE, 208.0f, 1);
            Object rememberedValue = gapComposer.rememberedValue();
            if (rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new InsightChartKt$$ExternalSyntheticLambda19(27);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Modifier semantics = SemanticsModifierKt.semantics(m276defaultMinSizeVpY3zN4$default, true, (Function1) rememberedValue);
            PaddingValuesImpl paddingValuesImpl = new PaddingValuesImpl(24.0f, 24.0f, 24.0f, 24.0f);
            MoneybotColors moneybotColors = (MoneybotColors) gapComposer.consume(MoneybotThemeKt.LocalMoneybotColors);
            if (moneybotColors == null) {
                gapComposer.startReplaceGroup(-973090538);
                Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                if (colors == null) {
                    colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                moneybotColors = MoneybotColorsKt.fromArcade(colors);
            } else {
                gapComposer.startReplaceGroup(-973091964);
            }
            gapComposer.end(false);
            CardUiKt.m3624CardContainerhTdSg4(semantics, paddingValuesImpl, RecyclerView.DECELERATION_RATE, moneybotColors.card.background, null, Expect_jvmKt.rememberComposableLambda(-928743822, new P2PListViewKt$$ExternalSyntheticLambda12(slottedCardViewModel, i2), gapComposer), gapComposer, 1572912, 52);
            modifier2 = companion;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new MusicViewKt$$ExternalSyntheticLambda8((Object) slottedCardViewModel, (Object) modifier2, (Object) function1, false, i, 18);
        }
    }
}
