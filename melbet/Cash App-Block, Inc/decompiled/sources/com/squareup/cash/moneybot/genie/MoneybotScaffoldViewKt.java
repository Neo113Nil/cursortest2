package com.squareup.cash.moneybot.genie;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement$SpacedAligned;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.RectangleShapeKt$RectangleShape$1;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.maps.views.CashMapViewKt$$ExternalSyntheticLambda5;
import com.squareup.cash.money.views.HypeWelcomeUIKt$$ExternalSyntheticLambda5;
import com.squareup.cash.moneybot.genie.protos.MoneybotScaffold;
import com.squareup.cash.moneybot.views.chat.SuggestionUiKt$$ExternalSyntheticLambda8;
import com.squareup.cash.overlays.FakeOverlayLayerKt$$ExternalSyntheticLambda0;
import com.squareup.cash.overlays.OverlaysKt$$ExternalSyntheticLambda1;
import com.squareup.util.Strings;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.ranges.RangesKt___RangesKt;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsJVMKt;
import org.slf4j.Marker;
import xyz.block.genie.expressions.EvalHelpersKt;
import xyz.block.genie.expressions.ExpressionEvaluator;
import xyz.block.genie.state.GenieCompositionLocalsKt;
import xyz.block.genie.state.GenieViewState;
import xyz.block.protos.genie.Expression;

/* loaded from: classes6.dex */
public abstract class MoneybotScaffoldViewKt {
    public static final long MoneybotGreen = ColorKt.Color(4278231916L);
    public static final long MoneybotRed = ColorKt.Color(4293217602L);

    /* JADX WARN: Removed duplicated region for block: B:26:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x028d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void BreakdownChart(MoneybotScaffold.Evidence.Breakdown.BarChart barChart, Composer composer, int i) {
        List<MoneybotScaffold.Evidence.Breakdown.BarChart.Bar> list;
        Double valueOf;
        double d;
        int i2;
        long j;
        float f;
        GenieViewState genieViewState;
        float f2;
        ExpressionEvaluator expressionEvaluator;
        double d2;
        Modifier.Companion companion;
        int i3;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1682409199);
        Applier applier = gapComposer.applier;
        int i4 = (gapComposer.changedInstance(barChart) ? 4 : 2) | i;
        if (gapComposer.shouldExecute(i4 & 1, (i4 & 3) != 2)) {
            ExpressionEvaluator expressionEvaluator2 = (ExpressionEvaluator) gapComposer.consume(GenieCompositionLocalsKt.LocalGenieExpressionEvaluator);
            GenieViewState genieViewState2 = (GenieViewState) gapComposer.consume(GenieCompositionLocalsKt.LocalGenieViewState);
            List list2 = barChart != null ? barChart.bars : null;
            if (list2 == null) {
                list2 = EmptyList.INSTANCE;
            }
            List list3 = list2;
            Iterator it = list3.iterator();
            double d3 = 0.0d;
            if (it.hasNext()) {
                double evalDouble = EvalHelpersKt.evalDouble(expressionEvaluator2, ((MoneybotScaffold.Evidence.Breakdown.BarChart.Bar) it.next()).value_, genieViewState2, 0.0d);
                while (it.hasNext()) {
                    evalDouble = Math.max(evalDouble, EvalHelpersKt.evalDouble(expressionEvaluator2, ((MoneybotScaffold.Evidence.Breakdown.BarChart.Bar) it.next()).value_, genieViewState2, 0.0d));
                    list3 = list3;
                }
                list = list3;
                valueOf = Double.valueOf(evalDouble);
            } else {
                list = list3;
                valueOf = null;
            }
            if (valueOf != null) {
                if (valueOf.doubleValue() <= 0.0d) {
                    valueOf = null;
                }
                if (valueOf != null) {
                    d = valueOf.doubleValue();
                    double d4 = d;
                    Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
                    float f3 = 1.0f;
                    Modifier m277height3ABfNKs = SizeKt.m277height3ABfNKs(SizeKt.fillMaxWidth(companion2, 1.0f), 72.0f);
                    float f4 = 6.0f;
                    int i5 = 54;
                    RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(new Arrangement$SpacedAligned(6.0f, true, new Drop$$ExternalSyntheticBUOutline0(3)), Alignment.Companion.Bottom, gapComposer, 54);
                    Modifier.Companion companion3 = companion2;
                    int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m277height3ABfNKs);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                    if (applier != null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer.startReusableNode();
                    if (gapComposer.inserting) {
                        gapComposer.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer.useNode();
                    }
                    Updater.m576setimpl(gapComposer, rowMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
                    gapComposer.startReplaceGroup(1651773240);
                    for (MoneybotScaffold.Evidence.Breakdown.BarChart.Bar bar : list) {
                        double evalDouble2 = EvalHelpersKt.evalDouble(expressionEvaluator2, bar.value_, genieViewState2, d3);
                        boolean evalBool = EvalHelpersKt.evalBool(expressionEvaluator2, bar.emphasized, genieViewState2, false);
                        float coerceIn = ((float) RangesKt___RangesKt.coerceIn(evalDouble2 / d4, 0.05d, 1.0d)) * 56.0f;
                        LayoutWeightElement layoutWeightElement = new LayoutWeightElement(f3, true);
                        ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Bottom, Alignment.Companion.CenterHorizontally, gapComposer, i5);
                        int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
                        PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
                        Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, layoutWeightElement);
                        ComposeUiNode.Companion.getClass();
                        LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
                        gapComposer.startReusableNode();
                        if (gapComposer.inserting) {
                            gapComposer.createNode(layoutNode$Companion$Constructor$12);
                        } else {
                            gapComposer.useNode();
                        }
                        Updater.m576setimpl(gapComposer, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                        Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                        Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode2), ComposeUiNode.Companion.SetCompositeKeyHash);
                        Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                        Updater.m576setimpl(gapComposer, materializeModifier2, ComposeUiNode.Companion.SetModifier);
                        Modifier.Companion companion4 = companion3;
                        Modifier clip = ClipKt.clip(SizeKt.m277height3ABfNKs(SizeKt.fillMaxWidth(companion4, f3), coerceIn), RoundedCornerShapeKt.m342RoundedCornerShapea9UjIt4$default(f4, f4, 12));
                        if (evalBool) {
                            gapComposer.startReplaceGroup(1452446056);
                            i2 = 0;
                            gapComposer.end(false);
                            j = MoneybotGreen;
                        } else {
                            i2 = 0;
                            gapComposer.startReplaceGroup(1452447905);
                            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                            if (colors == null) {
                                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                            } else {
                                gapComposer.startReplaceGroup(-1762997739);
                                gapComposer.end(false);
                            }
                            j = colors.semantic.background.subtle;
                            gapComposer.end(false);
                        }
                        BoxKt.Box(ImageKt.m177backgroundbw27NRU(clip, j, ColorKt.RectangleShape), gapComposer, i2);
                        String evalString = EvalHelpersKt.evalString(expressionEvaluator2, genieViewState2, bar.label);
                        if (evalString == null || StringsKt.isBlank(evalString)) {
                            evalString = null;
                        }
                        if (evalString == null) {
                            gapComposer.startReplaceGroup(2076325680);
                            gapComposer.end(false);
                            companion = companion4;
                            expressionEvaluator = expressionEvaluator2;
                            genieViewState = genieViewState2;
                            f2 = f3;
                            f = f4;
                            i3 = 54;
                            d2 = 0.0d;
                        } else {
                            gapComposer.startReplaceGroup(2076325681);
                            TextStyle textStyle = ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).labelSmall;
                            Colors colors2 = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                            if (colors2 == null) {
                                colors2 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                            } else {
                                gapComposer.startReplaceGroup(-1762997739);
                                gapComposer.end(false);
                            }
                            f = f4;
                            genieViewState = genieViewState2;
                            f2 = f3;
                            expressionEvaluator = expressionEvaluator2;
                            d2 = 0.0d;
                            companion = companion4;
                            i3 = 54;
                            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, colors2.semantic.text.subtle, (Composer) gapComposer, (Modifier) null, textStyle, (TextLineBalancing) null, evalString, (Map) null, (Function1) null, false);
                            gapComposer.end(false);
                        }
                        gapComposer.end(true);
                        i5 = i3;
                        f4 = f;
                        genieViewState2 = genieViewState;
                        f3 = f2;
                        expressionEvaluator2 = expressionEvaluator;
                        d3 = d2;
                        companion3 = companion;
                    }
                    gapComposer.end(false);
                    gapComposer.end(true);
                }
            }
            d = 1.0d;
            double d42 = d;
            Modifier.Companion companion22 = Modifier.Companion.$$INSTANCE;
            float f32 = 1.0f;
            Modifier m277height3ABfNKs2 = SizeKt.m277height3ABfNKs(SizeKt.fillMaxWidth(companion22, 1.0f), 72.0f);
            float f42 = 6.0f;
            int i52 = 54;
            RowMeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(new Arrangement$SpacedAligned(6.0f, true, new Drop$$ExternalSyntheticBUOutline0(3)), Alignment.Companion.Bottom, gapComposer, 54);
            Modifier.Companion companion32 = companion22;
            int hashCode3 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer, m277height3ABfNKs2);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$13 = ComposeUiNode.Companion.Constructor;
            if (applier != null) {
            }
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SuggestionUiKt$$ExternalSyntheticLambda8(barChart, i, 3);
        }
    }

    public static final void BreakdownView(MoneybotScaffold.Evidence.Breakdown breakdown, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1927667560);
        int i2 = (gapComposer.changedInstance(breakdown) ? 4 : 2) | i;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            ScaffoldCard(Expect_jvmKt.rememberComposableLambda(1392057157, new HypeWelcomeUIKt$$ExternalSyntheticLambda5(breakdown, 21), gapComposer), gapComposer, 6);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SuggestionUiKt$$ExternalSyntheticLambda8(breakdown, i, 5);
        }
    }

    public static final void CategoryRow(MoneybotScaffold.Evidence.Breakdown.CategoryRow categoryRow, Composer composer, int i) {
        int i2;
        long j;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1209413289);
        int i3 = i | (gapComposer.changedInstance(categoryRow) ? 4 : 2);
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 3) != 2)) {
            ExpressionEvaluator expressionEvaluator = (ExpressionEvaluator) gapComposer.consume(GenieCompositionLocalsKt.LocalGenieExpressionEvaluator);
            GenieViewState genieViewState = (GenieViewState) gapComposer.consume(GenieCompositionLocalsKt.LocalGenieViewState);
            boolean evalBool = EvalHelpersKt.evalBool(expressionEvaluator, categoryRow.emphasized, genieViewState, false);
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(new Arrangement$SpacedAligned(12.0f, true, new Drop$$ExternalSyntheticBUOutline0(3)), Alignment.Companion.CenterVertically, gapComposer, 54);
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
            Updater.m576setimpl(gapComposer, rowMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            Modifier clip = ClipKt.clip(SizeKt.m290width3ABfNKs(SizeKt.m277height3ABfNKs(companion, 8.0f), 8.0f), RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(4.0f));
            if (evalBool) {
                gapComposer.startReplaceGroup(934313600);
                gapComposer.end(false);
                j = MoneybotGreen;
            } else {
                gapComposer.startReplaceGroup(934315449);
                Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                if (colors == null) {
                    colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                j = colors.semantic.background.subtle;
                gapComposer.end(false);
            }
            BoxKt.Box(ImageKt.m177backgroundbw27NRU(clip, j, ColorKt.RectangleShape), gapComposer, 0);
            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4080, Strings.getColors(gapComposer).semantic.text.standard, (Composer) gapComposer, (Modifier) new LayoutWeightElement(1.0f, true), Strings.getTypography(gapComposer).bodyMedium, (TextLineBalancing) null, EvalHelpersKt.evalString(expressionEvaluator, categoryRow.category, genieViewState, "Category"), (Map) null, (Function1) null, false);
            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, Strings.getColors(gapComposer).semantic.text.standard, (Composer) gapComposer, (Modifier) null, TextStyle.m994copyp1EtxEg$default(Strings.getTypography(gapComposer).bodyMedium, 0L, 0L, FontWeight.SemiBold, null, 0L, null, 0L, null, null, null, 0, 0L, null, null, 0, 16777211), (TextLineBalancing) null, EvalHelpersKt.evalString(expressionEvaluator, categoryRow.amount, genieViewState, ""), (Map) null, (Function1) null, false);
            i2 = 1;
            gapComposer.end(true);
        } else {
            i2 = 1;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SuggestionUiKt$$ExternalSyntheticLambda8(categoryRow, i, i2);
        }
    }

    public static final void MerchantCardView(MoneybotScaffold.Evidence.MerchantCard merchantCard, Composer composer, int i) {
        final MoneybotScaffold.Evidence.MerchantCard merchantCard2;
        MoneybotScaffold.Evidence.MerchantCard.Summary.Flow flow;
        MoneybotScaffold.Evidence.MerchantCard.Summary.Flow flow2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1601600636);
        int i2 = (gapComposer.changedInstance(merchantCard) ? 4 : 2) | i;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            final ExpressionEvaluator expressionEvaluator = (ExpressionEvaluator) gapComposer.consume(GenieCompositionLocalsKt.LocalGenieExpressionEvaluator);
            final GenieViewState genieViewState = (GenieViewState) gapComposer.consume(GenieCompositionLocalsKt.LocalGenieViewState);
            MoneybotScaffold.Evidence.MerchantCard.Summary summary = merchantCard.summary;
            final double evalDouble = EvalHelpersKt.evalDouble(expressionEvaluator, (summary == null || (flow2 = summary.received) == null) ? null : flow2.value_, genieViewState, 0.0d);
            MoneybotScaffold.Evidence.MerchantCard.Summary summary2 = merchantCard.summary;
            final double evalDouble2 = EvalHelpersKt.evalDouble(expressionEvaluator, (summary2 == null || (flow = summary2.sent) == null) ? null : flow.value_, genieViewState, 0.0d);
            double d = evalDouble + evalDouble2;
            Double valueOf = d > 0.0d ? Double.valueOf(d) : null;
            final double doubleValue = valueOf != null ? valueOf.doubleValue() : 1.0d;
            merchantCard2 = merchantCard;
            ScaffoldCard(Expect_jvmKt.rememberComposableLambda(-1597659743, new Function3() { // from class: com.squareup.cash.moneybot.genie.MoneybotScaffoldViewKt$$ExternalSyntheticLambda10
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    Composer composer2 = (Composer) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    ((ColumnScope) obj).getClass();
                    GapComposer gapComposer2 = (GapComposer) composer2;
                    boolean shouldExecute = gapComposer2.shouldExecute(intValue & 1, (intValue & 17) != 16);
                    Applier applier = gapComposer2.applier;
                    if (shouldExecute) {
                        ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(new Arrangement$SpacedAligned(12.0f, true, new Drop$$ExternalSyntheticBUOutline0(3)), Alignment.Companion.Start, gapComposer2, 6);
                        int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
                        PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
                        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                        Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, companion);
                        ComposeUiNode.Companion.getClass();
                        LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                        if (applier == null) {
                            Updater.invalidApplier();
                            throw null;
                        }
                        gapComposer2.startReusableNode();
                        if (gapComposer2.inserting) {
                            gapComposer2.createNode(layoutNode$Companion$Constructor$1);
                        } else {
                            gapComposer2.useNode();
                        }
                        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetMeasurePolicy;
                        Updater.m576setimpl(gapComposer2, columnMeasurePolicy, composeUiNode$Companion$SetModifier$1);
                        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
                        Updater.m576setimpl(gapComposer2, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
                        Integer valueOf2 = Integer.valueOf(hashCode);
                        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
                        Updater.m576setimpl(gapComposer2, valueOf2, composeUiNode$Companion$SetModifier$13);
                        OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
                        Updater.m575reconcileimpl(gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$1);
                        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
                        Updater.m576setimpl(gapComposer2, materializeModifier, composeUiNode$Companion$SetModifier$14);
                        MoneybotScaffold.Evidence.MerchantCard merchantCard3 = merchantCard2;
                        MoneybotScaffold.Evidence.MerchantCard.Summary summary3 = merchantCard3.summary;
                        List list = merchantCard3.transactions;
                        Expression expression = summary3 != null ? summary3.total_label : null;
                        ExpressionEvaluator expressionEvaluator2 = ExpressionEvaluator.this;
                        GenieViewState genieViewState2 = genieViewState;
                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, Strings.getColors(gapComposer2).semantic.text.subtle, (Composer) gapComposer2, (Modifier) null, Strings.getTypography(gapComposer2).labelSmall, (TextLineBalancing) null, EvalHelpersKt.evalString(expressionEvaluator2, expression, genieViewState2, "Transactions"), (Map) null, (Function1) null, false);
                        MoneybotScaffold.Evidence.MerchantCard.Summary summary4 = merchantCard3.summary;
                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, Strings.getColors(gapComposer2).semantic.text.standard, (Composer) gapComposer2, (Modifier) null, Strings.getTypography(gapComposer2).sectionTitle, (TextLineBalancing) null, EvalHelpersKt.evalString(expressionEvaluator2, summary4 != null ? summary4.total : null, genieViewState2, String.valueOf(list.size())), (Map) null, (Function1) null, false);
                        Modifier clip = ClipKt.clip(SizeKt.m277height3ABfNKs(SizeKt.fillMaxWidth(companion, 1.0f), 8.0f), RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(4.0f));
                        RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Start, Alignment.Companion.Top, gapComposer2, 0);
                        int hashCode2 = Long.hashCode(gapComposer2.compositeKeyHashCode);
                        PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer2.currentCompositionLocalScope();
                        Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer2, clip);
                        gapComposer2.startReusableNode();
                        if (gapComposer2.inserting) {
                            gapComposer2.createNode(layoutNode$Companion$Constructor$1);
                        } else {
                            gapComposer2.useNode();
                        }
                        Updater.m576setimpl(gapComposer2, rowMeasurePolicy, composeUiNode$Companion$SetModifier$1);
                        Updater.m576setimpl(gapComposer2, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
                        Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer2, composeUiNode$Companion$SetModifier$13, gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$1);
                        Updater.m576setimpl(gapComposer2, materializeModifier2, composeUiNode$Companion$SetModifier$14);
                        double d2 = evalDouble;
                        double d3 = doubleValue;
                        float f = (float) (d2 / d3);
                        if (f < 0.01f) {
                            f = 0.01f;
                        }
                        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                        Modifier weight = rowScopeInstance.weight(f, companion, true);
                        long j = MoneybotScaffoldViewKt.MoneybotGreen;
                        RectangleShapeKt$RectangleShape$1 rectangleShapeKt$RectangleShape$1 = ColorKt.RectangleShape;
                        BoxKt.Box(ImageKt.m177backgroundbw27NRU(weight, j, rectangleShapeKt$RectangleShape$1), gapComposer2, 0);
                        float f2 = (float) (evalDouble2 / d3);
                        BoxKt.Box(ImageKt.m177backgroundbw27NRU(rowScopeInstance.weight(f2 >= 0.01f ? f2 : 0.01f, companion, true), MoneybotScaffoldViewKt.MoneybotRed, rectangleShapeKt$RectangleShape$1), gapComposer2, 0);
                        gapComposer2.end(true);
                        gapComposer2.startReplaceGroup(1591537761);
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            MoneybotScaffoldViewKt.TransactionRow((MoneybotScaffold.Evidence.MerchantCard.Transaction) it.next(), gapComposer2, 0);
                        }
                        gapComposer2.end(false);
                        gapComposer2.end(true);
                    } else {
                        gapComposer2.skipToGroupEnd();
                    }
                    return Unit.INSTANCE;
                }
            }, gapComposer), gapComposer, 6);
        } else {
            merchantCard2 = merchantCard;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new CashMapViewKt$$ExternalSyntheticLambda5(merchantCard2, i, 29);
        }
    }

    public static final void MoneybotAnswerView(final MoneybotScaffold.Answer answer, Composer composer, final int i) {
        Function2 function2;
        RecomposeScopeImpl recomposeScopeImpl;
        String joinToString$default;
        String evalString;
        String evalString2;
        String evalString3;
        String str;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1815552555);
        int i2 = (gapComposer.changedInstance(answer) ? 4 : 2) | i;
        final int i3 = 0;
        final int i4 = 1;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            ExpressionEvaluator expressionEvaluator = (ExpressionEvaluator) gapComposer.consume(GenieCompositionLocalsKt.LocalGenieExpressionEvaluator);
            GenieViewState genieViewState = (GenieViewState) gapComposer.consume(GenieCompositionLocalsKt.LocalGenieViewState);
            String str2 = null;
            if ((answer != null ? answer.direct_answer : null) != null) {
                MoneybotScaffold.Answer.DirectAnswer directAnswer = answer.direct_answer;
                directAnswer.getClass();
                joinToString$default = EvalHelpersKt.evalString(expressionEvaluator, genieViewState, directAnswer.label);
                MoneybotScaffold.Answer.DirectAnswer directAnswer2 = answer.direct_answer;
                directAnswer2.getClass();
                evalString = EvalHelpersKt.evalString(expressionEvaluator, directAnswer2.value_, genieViewState, "");
            } else {
                if ((answer != null ? answer.fallback_title : null) != null) {
                    MoneybotScaffold.Answer.FallbackTitle fallbackTitle = answer.fallback_title;
                    fallbackTitle.getClass();
                    evalString = EvalHelpersKt.evalString(expressionEvaluator, fallbackTitle.title, genieViewState, "");
                    str = null;
                } else {
                    if ((answer != null ? answer.status_explanation : null) != null) {
                        MoneybotScaffold.Answer.StatusExplanation statusExplanation = answer.status_explanation;
                        statusExplanation.getClass();
                        evalString2 = EvalHelpersKt.evalString(expressionEvaluator, statusExplanation.heading, genieViewState, "");
                        MoneybotScaffold.Answer.StatusExplanation statusExplanation2 = answer.status_explanation;
                        statusExplanation2.getClass();
                        evalString3 = EvalHelpersKt.evalString(expressionEvaluator, genieViewState, statusExplanation2.explanation);
                    } else {
                        if ((answer != null ? answer.decision : null) != null) {
                            MoneybotScaffold.Answer.Decision decision = answer.decision;
                            decision.getClass();
                            evalString2 = EvalHelpersKt.evalString(expressionEvaluator, decision.verdict, genieViewState, "");
                            MoneybotScaffold.Answer.Decision decision2 = answer.decision;
                            decision2.getClass();
                            evalString3 = EvalHelpersKt.evalString(expressionEvaluator, genieViewState, decision2.elaboration);
                        } else {
                            if ((answer != null ? answer.scenario : null) == null) {
                                recomposeScopeImpl = gapComposer.endRestartGroup();
                                if (recomposeScopeImpl != null) {
                                    function2 = new Function2(answer, i, i3) { // from class: com.squareup.cash.moneybot.genie.MoneybotScaffoldViewKt$$ExternalSyntheticLambda1
                                        public final /* synthetic */ int $r8$classId;
                                        public final /* synthetic */ MoneybotScaffold.Answer f$0;

                                        {
                                            this.$r8$classId = i3;
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj, Object obj2) {
                                            int i5 = this.$r8$classId;
                                            Composer composer2 = (Composer) obj;
                                            ((Integer) obj2).getClass();
                                            switch (i5) {
                                                case 0:
                                                    MoneybotScaffoldViewKt.MoneybotAnswerView(this.f$0, composer2, Updater.updateChangedFlags(1));
                                                    break;
                                                default:
                                                    MoneybotScaffoldViewKt.MoneybotAnswerView(this.f$0, composer2, Updater.updateChangedFlags(1));
                                                    break;
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    };
                                    recomposeScopeImpl.block = function2;
                                }
                                return;
                            }
                            MoneybotScaffold.Answer.Scenario scenario = answer.scenario;
                            scenario.getClass();
                            List list = scenario.parameters;
                            ArrayList arrayList = new ArrayList();
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                String evalString4 = EvalHelpersKt.evalString(expressionEvaluator, genieViewState, ((MoneybotScaffold.Answer.Scenario.Parameter) it.next()).label);
                                if (evalString4 == null || StringsKt.isBlank(evalString4)) {
                                    evalString4 = null;
                                }
                                if (evalString4 != null) {
                                    arrayList.add(evalString4);
                                }
                            }
                            joinToString$default = CollectionsKt.joinToString$default(arrayList, "  ", null, null, 0, null, null, 62);
                            if (StringsKt.isBlank(joinToString$default)) {
                                joinToString$default = null;
                            }
                            MoneybotScaffold.Answer.Scenario scenario2 = answer.scenario;
                            scenario2.getClass();
                            evalString = EvalHelpersKt.evalString(expressionEvaluator, scenario2.heading, genieViewState, "");
                        }
                    }
                    str = evalString3;
                    evalString = evalString2;
                }
                ScaffoldCard(Expect_jvmKt.rememberComposableLambda(-1804936504, new MoneybotScaffoldViewKt$$ExternalSyntheticLambda2(str2, evalString, str, i3), gapComposer), gapComposer, 6);
            }
            str = null;
            str2 = joinToString$default;
            ScaffoldCard(Expect_jvmKt.rememberComposableLambda(-1804936504, new MoneybotScaffoldViewKt$$ExternalSyntheticLambda2(str2, evalString, str, i3), gapComposer), gapComposer, 6);
        } else {
            gapComposer.skipToGroupEnd();
        }
        recomposeScopeImpl = gapComposer.endRestartGroup();
        if (recomposeScopeImpl != null) {
            function2 = new Function2(answer, i, i4) { // from class: com.squareup.cash.moneybot.genie.MoneybotScaffoldViewKt$$ExternalSyntheticLambda1
                public final /* synthetic */ int $r8$classId;
                public final /* synthetic */ MoneybotScaffold.Answer f$0;

                {
                    this.$r8$classId = i4;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i5 = this.$r8$classId;
                    Composer composer2 = (Composer) obj;
                    ((Integer) obj2).getClass();
                    switch (i5) {
                        case 0:
                            MoneybotScaffoldViewKt.MoneybotAnswerView(this.f$0, composer2, Updater.updateChangedFlags(1));
                            break;
                        default:
                            MoneybotScaffoldViewKt.MoneybotAnswerView(this.f$0, composer2, Updater.updateChangedFlags(1));
                            break;
                    }
                    return Unit.INSTANCE;
                }
            };
            recomposeScopeImpl.block = function2;
        }
    }

    public static final void MoneybotEvidenceView(MoneybotScaffold.Evidence evidence, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(683976779);
        int i2 = 4;
        int i3 = (gapComposer.changedInstance(evidence) ? 4 : 2) | i;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 3) != 2)) {
            if ((evidence != null ? evidence.breakdown : null) != null) {
                gapComposer.startReplaceGroup(171691854);
                MoneybotScaffold.Evidence.Breakdown breakdown = evidence.breakdown;
                breakdown.getClass();
                BreakdownView(breakdown, gapComposer, 0);
                gapComposer.end(false);
            } else {
                if ((evidence != null ? evidence.merchant_card : null) != null) {
                    gapComposer.startReplaceGroup(171694261);
                    MoneybotScaffold.Evidence.MerchantCard merchantCard = evidence.merchant_card;
                    merchantCard.getClass();
                    MerchantCardView(merchantCard, gapComposer, 0);
                    gapComposer.end(false);
                } else {
                    gapComposer.startReplaceGroup(1027599127);
                    gapComposer.end(false);
                }
            }
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SuggestionUiKt$$ExternalSyntheticLambda8(evidence, i, i2);
        }
    }

    public static final void MoneybotMeaningView(final MoneybotScaffold.Meaning meaning, Composer composer, final int i) {
        RecomposeScopeImpl endRestartGroup;
        Function2 function2;
        Expression expression;
        MoneybotScaffold.Meaning.RiskPattern riskPattern;
        Expression expression2;
        MoneybotScaffold.Meaning.RiskPattern riskPattern2;
        MoneybotScaffold.Meaning.RiskPattern riskPattern3;
        MoneybotScaffold.Meaning.Opportunity opportunity;
        Expression expression3;
        MoneybotScaffold.Meaning.Opportunity opportunity2;
        MoneybotScaffold.Meaning.Opportunity opportunity3;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(905923223);
        int i2 = (gapComposer.changedInstance(meaning) ? 4 : 2) | i;
        final int i3 = 0;
        final int i4 = 1;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            ExpressionEvaluator expressionEvaluator = (ExpressionEvaluator) gapComposer.consume(GenieCompositionLocalsKt.LocalGenieExpressionEvaluator);
            GenieViewState genieViewState = (GenieViewState) gapComposer.consume(GenieCompositionLocalsKt.LocalGenieViewState);
            Expression expression4 = null;
            if (meaning == null || (opportunity3 = meaning.opportunity) == null || (expression = opportunity3.eyebrow) == null) {
                expression = (meaning == null || (riskPattern = meaning.risk_pattern) == null) ? null : riskPattern.eyebrow;
            }
            String evalString = EvalHelpersKt.evalString(expressionEvaluator, expression, genieViewState, "Takeaway");
            if (meaning == null || (opportunity2 = meaning.opportunity) == null || (expression2 = opportunity2.heading) == null) {
                expression2 = (meaning == null || (riskPattern2 = meaning.risk_pattern) == null) ? null : riskPattern2.heading;
            }
            String evalString2 = EvalHelpersKt.evalString(expressionEvaluator, expression2, genieViewState, "");
            if (meaning != null && (opportunity = meaning.opportunity) != null && (expression3 = opportunity.body) != null) {
                expression4 = expression3;
            } else if (meaning != null && (riskPattern3 = meaning.risk_pattern) != null) {
                expression4 = riskPattern3.body;
            }
            String evalString3 = EvalHelpersKt.evalString(expressionEvaluator, genieViewState, expression4);
            if (StringsKt.isBlank(evalString2) && (evalString3 == null || StringsKt.isBlank(evalString3))) {
                endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                    function2 = new Function2(meaning, i, i3) { // from class: com.squareup.cash.moneybot.genie.MoneybotScaffoldViewKt$$ExternalSyntheticLambda5
                        public final /* synthetic */ int $r8$classId;
                        public final /* synthetic */ MoneybotScaffold.Meaning f$0;

                        {
                            this.$r8$classId = i3;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            int i5 = this.$r8$classId;
                            Composer composer2 = (Composer) obj;
                            ((Integer) obj2).getClass();
                            switch (i5) {
                                case 0:
                                    MoneybotScaffoldViewKt.MoneybotMeaningView(this.f$0, composer2, Updater.updateChangedFlags(1));
                                    break;
                                default:
                                    MoneybotScaffoldViewKt.MoneybotMeaningView(this.f$0, composer2, Updater.updateChangedFlags(1));
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    endRestartGroup.block = function2;
                }
                return;
            }
            ScaffoldCard(Expect_jvmKt.rememberComposableLambda(539447284, new MoneybotScaffoldViewKt$$ExternalSyntheticLambda2(evalString, evalString2, evalString3, i4), gapComposer), gapComposer, 6);
        } else {
            gapComposer.skipToGroupEnd();
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            function2 = new Function2(meaning, i, i4) { // from class: com.squareup.cash.moneybot.genie.MoneybotScaffoldViewKt$$ExternalSyntheticLambda5
                public final /* synthetic */ int $r8$classId;
                public final /* synthetic */ MoneybotScaffold.Meaning f$0;

                {
                    this.$r8$classId = i4;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i5 = this.$r8$classId;
                    Composer composer2 = (Composer) obj;
                    ((Integer) obj2).getClass();
                    switch (i5) {
                        case 0:
                            MoneybotScaffoldViewKt.MoneybotMeaningView(this.f$0, composer2, Updater.updateChangedFlags(1));
                            break;
                        default:
                            MoneybotScaffoldViewKt.MoneybotMeaningView(this.f$0, composer2, Updater.updateChangedFlags(1));
                            break;
                    }
                    return Unit.INSTANCE;
                }
            };
            endRestartGroup.block = function2;
        }
    }

    public static final void MoneybotScaffoldView(MoneybotScaffold moneybotScaffold, Modifier modifier, Composer composer, int i) {
        moneybotScaffold.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-320869973);
        int i2 = (gapComposer.changedInstance(moneybotScaffold) ? 4 : 2) | i | (gapComposer.changed(modifier) ? 32 : 16);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(modifier, 1.0f);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(new Arrangement$SpacedAligned(16.0f, true, new Drop$$ExternalSyntheticBUOutline0(3)), Alignment.Companion.Start, gapComposer, 6);
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
            MoneybotAnswerView(moneybotScaffold.answer, gapComposer, 0);
            MoneybotEvidenceView(moneybotScaffold.evidence, gapComposer, 0);
            MoneybotMeaningView(moneybotScaffold.meaning, gapComposer, 0);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new FakeOverlayLayerKt$$ExternalSyntheticLambda0(moneybotScaffold, modifier, i, 1);
        }
    }

    public static final void ScaffoldCard(ComposableLambdaImpl composableLambdaImpl, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1336805249);
        if (gapComposer.shouldExecute(i & 1, (i & 3) != 2)) {
            Modifier m298padding3ABfNKs = SpacerKt.m298padding3ABfNKs(SizeKt.fillMaxWidth(Modifier.Companion.$$INSTANCE, 1.0f), 24.0f);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m298padding3ABfNKs);
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
            Recorder$$ExternalSyntheticOutline1.m(54, composableLambdaImpl, ColumnScopeInstance.INSTANCE, gapComposer, true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new OverlaysKt$$ExternalSyntheticLambda1(i, 18, composableLambdaImpl);
        }
    }

    public static final void TransactionRow(MoneybotScaffold.Evidence.MerchantCard.Transaction transaction, Composer composer, int i) {
        boolean z;
        long j;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-872948999);
        Applier applier = gapComposer.applier;
        int i2 = i | (gapComposer.changedInstance(transaction) ? 4 : 2);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            ExpressionEvaluator expressionEvaluator = (ExpressionEvaluator) gapComposer.consume(GenieCompositionLocalsKt.LocalGenieExpressionEvaluator);
            GenieViewState genieViewState = (GenieViewState) gapComposer.consume(GenieCompositionLocalsKt.LocalGenieViewState);
            String evalString = EvalHelpersKt.evalString(expressionEvaluator, transaction.amount, genieViewState, "");
            Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(SizeKt.fillMaxWidth(Modifier.Companion.$$INSTANCE, 1.0f), RecyclerView.DECELERATION_RATE, 4.0f, 1);
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(new Arrangement$SpacedAligned(12.0f, true, new Drop$$ExternalSyntheticBUOutline0(3)), Alignment.Companion.CenterVertically, gapComposer, 54);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m300paddingVpY3zN4$default);
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
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetMeasurePolicy;
            Updater.m576setimpl(gapComposer, rowMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
            Integer valueOf = Integer.valueOf(hashCode);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
            Updater.m576setimpl(gapComposer, valueOf, composeUiNode$Companion$SetModifier$13);
            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
            Updater.m575reconcileimpl(gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
            LayoutWeightElement m = Request$Priority$EnumUnboxingLocalUtility.m(gapComposer, materializeModifier, composeUiNode$Companion$SetModifier$14, 1.0f, true);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(new Arrangement$SpacedAligned(2.0f, true, new Drop$$ExternalSyntheticBUOutline0(3)), Alignment.Companion.Start, gapComposer, 6);
            int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, m);
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, columnMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer, materializeModifier2, composeUiNode$Companion$SetModifier$14);
            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, Strings.getColors(gapComposer).semantic.text.standard, (Composer) gapComposer, (Modifier) null, Strings.getTypography(gapComposer).bodyMedium, (TextLineBalancing) null, EvalHelpersKt.evalString(expressionEvaluator, transaction.title, genieViewState, ""), (Map) null, (Function1) null, false);
            String evalString2 = EvalHelpersKt.evalString(expressionEvaluator, genieViewState, transaction.subtitle);
            String str = (evalString2 == null || StringsKt.isBlank(evalString2)) ? null : evalString2;
            if (str == null) {
                gapComposer.startReplaceGroup(-599939868);
                z = false;
                gapComposer.end(false);
            } else {
                z = false;
                gapComposer.startReplaceGroup(-599939867);
                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, Strings.getColors(gapComposer).semantic.text.subtle, (Composer) gapComposer, (Modifier) null, Strings.getTypography(gapComposer).labelSmall, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                gapComposer.end(false);
            }
            gapComposer.end(true);
            TextStyle m994copyp1EtxEg$default = TextStyle.m994copyp1EtxEg$default(Strings.getTypography(gapComposer).bodyMedium, 0L, 0L, FontWeight.SemiBold, null, 0L, null, 0L, null, null, null, 0, 0L, null, null, 0, 16777211);
            if (StringsKt__StringsJVMKt.startsWith(StringsKt.trim(evalString).toString(), Marker.ANY_NON_NULL_MARKER, z)) {
                gapComposer.startReplaceGroup(1011803562);
                gapComposer.end(z);
                j = MoneybotGreen;
            } else {
                gapComposer.startReplaceGroup(1011805477);
                j = Strings.getColors(gapComposer).semantic.text.standard;
                gapComposer.end(z);
            }
            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, j, (Composer) gapComposer, (Modifier) null, m994copyp1EtxEg$default, (TextLineBalancing) null, evalString, (Map) null, (Function1) null, false);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SuggestionUiKt$$ExternalSyntheticLambda8(transaction, i, 2);
        }
    }
}
