package com.squareup.cash.moneybot.views.plugins;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.molecule.PlatformKt;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.charting.components.BarChartKt;
import com.squareup.cash.charting.components.LineChartKt;
import com.squareup.cash.charting.components.LineChartSelectionState;
import com.squareup.cash.charting.components.LineChartSelectionState$SelectionBehavior$None;
import com.squareup.cash.charting.viewmodels.LineChartViewModel;
import com.squareup.cash.charting.viewmodels.LineChartViewModel$Line$StrokeEffect$Solid;
import com.squareup.cash.maps.views.ClusterItemKt$$ExternalSyntheticLambda3;
import com.squareup.cash.moneybot.views.shared.LocalMoneybotSlotContentAnimationsReadyKt;
import com.squareup.cash.music.views.MusicViewKt$$ExternalSyntheticLambda8;
import com.squareup.protos.cash.ui.Color;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function1;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes6.dex */
public abstract class SlottedLineGraphKt {
    static {
        Color color = new Color(new Color.ModeVariant("#00C730", null, null, null, null, 30, null), new Color.ModeVariant("#00D632", null, null, null, null, 30, null), 4);
        List<Pair> listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new Pair[]{new Pair(0L, 18L), new Pair(4L, 26L), new Pair(8L, 24L), new Pair(12L, 34L), new Pair(16L, 42L), new Pair(20L, 39L), new Pair(24L, 28L), new Pair(28L, 34L), new Pair(32L, 27L), new Pair(36L, 25L), new Pair(40L, 31L), new Pair(44L, 35L), new Pair(48L, 32L), new Pair(52L, 38L), new Pair(56L, 35L), new Pair(60L, 44L), new Pair(64L, 37L), new Pair(68L, 45L), new Pair(72L, 43L), new Pair(76L, 50L), new Pair(80L, 70L), new Pair(84L, 78L), new Pair(88L, 82L), new Pair(92L, 79L), new Pair(96L, 110L), new Pair(100L, 142L), new Pair(104L, 139L), new Pair(108L, 146L), new Pair(112L, 143L), new Pair(116L, 149L), new Pair(120L, 152L), new Pair(124L, 132L), new Pair(128L, 116L), new Pair(132L, 80L), new Pair(136L, 60L), new Pair(140L, 55L), new Pair(144L, 72L), new Pair(148L, 92L), new Pair(152L, 91L), new Pair(156L, 75L), new Pair(160L, 104L), new Pair(164L, 121L), new Pair(168L, 119L), new Pair(172L, 133L), new Pair(176L, 151L)});
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listOf, 10));
        for (Pair pair : listOf) {
            arrayList.add(new LineChartViewModel.Line.Point(((Number) pair.first).longValue(), ((Number) pair.second).longValue(), null, null, null, null, EnumC0170g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE));
        }
        List listOf2 = CollectionsKt__CollectionsJVMKt.listOf(new LineChartViewModel.Line(arrayList, color));
        EmptyList.INSTANCE.getClass();
        listOf2.getClass();
        Color color2 = new Color(new Color.ModeVariant("#595959", null, null, null, null, 30, null), new Color.ModeVariant("#595959", null, null, null, null, 30, null), 4);
        List<Pair> listOf3 = CollectionsKt__CollectionsKt.listOf((Object[]) new Pair[]{new Pair(0L, 142L), new Pair(12L, 138L), new Pair(24L, 126L), new Pair(36L, 132L), new Pair(48L, 110L), new Pair(60L, 96L), new Pair(72L, 104L), new Pair(84L, 82L), new Pair(96L, 74L), new Pair(108L, 88L), new Pair(120L, 69L), new Pair(132L, 52L), new Pair(144L, 58L), new Pair(156L, 42L), new Pair(168L, 36L), new Pair(176L, 32L)});
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listOf3, 10));
        for (Pair pair2 : listOf3) {
            arrayList2.add(new LineChartViewModel.Line.Point(((Number) pair2.first).longValue(), ((Number) pair2.second).longValue(), null, null, null, null, EnumC0170g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE));
        }
        List listOf4 = CollectionsKt__CollectionsJVMKt.listOf(new LineChartViewModel.Line(arrayList2, color2));
        EmptyList.INSTANCE.getClass();
        listOf4.getClass();
    }

    public static final void SlottedLineGraph(LineChartViewModel lineChartViewModel, Modifier modifier, String str, Composer composer, int i) {
        Modifier clearAndSetSemantics;
        Modifier.Companion companion;
        boolean z;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1410572135);
        Applier applier = gapComposer.applier;
        int i2 = (i & 6) == 0 ? (gapComposer.changedInstance(lineChartViewModel) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= gapComposer.changed(modifier) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changed(str) ? 256 : 128;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            boolean changed = gapComposer.changed(lineChartViewModel);
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (changed || rememberedValue == neverEqualPolicy) {
                List list = lineChartViewModel.lines;
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    if (!((LineChartViewModel.Line) obj).points.isEmpty()) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    LineChartViewModel.Line line = (LineChartViewModel.Line) it.next();
                    List list2 = line.points;
                    Color color = line.color;
                    LineChartViewModel.SelectionConfig selectionConfig = line.selectionConfig;
                    float f = line.strokeWidth;
                    LineChartViewModel$Line$StrokeEffect$Solid lineChartViewModel$Line$StrokeEffect$Solid = line.strokeEffect;
                    LineChartViewModel.Line.InterpolationMethod interpolationMethod = line.interpolationMethod;
                    list2.getClass();
                    color.getClass();
                    selectionConfig.getClass();
                    lineChartViewModel$Line$StrokeEffect$Solid.getClass();
                    interpolationMethod.getClass();
                    arrayList2.add(new LineChartViewModel.Line(list2, color, selectionConfig, f, lineChartViewModel$Line$StrokeEffect$Solid, 40.0f, interpolationMethod));
                }
                rememberedValue = new LineChartViewModel(arrayList2, lineChartViewModel.xAxisConfig, lineChartViewModel.yAxisConfig);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            LineChartViewModel lineChartViewModel2 = (LineChartViewModel) rememberedValue;
            if (str == null) {
                gapComposer.startReplaceGroup(-394019501);
                gapComposer.end(false);
                clearAndSetSemantics = modifier;
            } else {
                gapComposer.startReplaceGroup(-393989710);
                boolean z2 = (i2 & 896) == 256;
                Object rememberedValue2 = gapComposer.rememberedValue();
                if (z2 || rememberedValue2 == neverEqualPolicy) {
                    rememberedValue2 = new ClusterItemKt$$ExternalSyntheticLambda3(str, 17);
                    gapComposer.updateRememberedValue(rememberedValue2);
                }
                clearAndSetSemantics = SemanticsModifierKt.clearAndSetSemantics(modifier, (Function1) rememberedValue2);
                gapComposer.end(false);
            }
            LineChartSelectionState rememberLineChartSelectionState = BarChartKt.rememberLineChartSelectionState(LineChartSelectionState$SelectionBehavior$None.INSTANCE, gapComposer, 2);
            boolean moneybotSlotContentAnimationsReady = LocalMoneybotSlotContentAnimationsReadyKt.moneybotSlotContentAnimationsReady(gapComposer);
            boolean moneybotSlotContentShouldAnimate = LocalMoneybotSlotContentAnimationsReadyKt.moneybotSlotContentShouldAnimate(gapComposer);
            Modifier m279heightInVpY3zN4$default = SizeKt.m279heightInVpY3zN4$default(SizeKt.fillMaxWidth(clearAndSetSemantics, 1.0f), 252.0f, RecyclerView.DECELERATION_RATE, 2);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m279heightInVpY3zN4$default);
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
            Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
            Integer valueOf = Integer.valueOf(hashCode);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
            Updater.m576setimpl(gapComposer, valueOf, composeUiNode$Companion$SetModifier$13);
            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
            Updater.m575reconcileimpl(gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
            Updater.m576setimpl(gapComposer, materializeModifier, composeUiNode$Companion$SetModifier$14);
            BiasAlignment biasAlignment = Alignment.Companion.BottomStart;
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
            Modifier m277height3ABfNKs = SizeKt.m277height3ABfNKs(SizeKt.fillMaxWidth(boxScopeInstance.align(companion2, biasAlignment), 1.0f), 252.0f);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, m277height3ABfNKs);
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
            SpacerKt.Spacer(gapComposer, SizeKt.m277height3ABfNKs(companion2, 88.0f));
            if (!moneybotSlotContentAnimationsReady || lineChartViewModel2.lines.isEmpty()) {
                companion = companion2;
                z = true;
                gapComposer.startReplaceGroup(-1072278811);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-1072554618);
                companion = companion2;
                z = true;
                LineChartKt.m3459LineChartg1gPWk(lineChartViewModel2, 140.0f, SizeKt.fillMaxWidth(companion2, 1.0f), moneybotSlotContentShouldAnimate, androidx.compose.ui.graphics.Color.Transparent, rememberLineChartSelectionState, gapComposer, 25008, 0);
                gapComposer.end(false);
            }
            SpacerKt.Spacer(gapComposer, SizeKt.m277height3ABfNKs(companion, 24.0f));
            gapComposer.end(z);
            gapComposer.end(z);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new MusicViewKt$$ExternalSyntheticLambda8((Object) lineChartViewModel, (Object) modifier, (Object) str, false, i, 19);
        }
    }
}
