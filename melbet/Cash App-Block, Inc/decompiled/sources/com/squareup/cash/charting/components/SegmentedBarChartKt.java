package com.squareup.cash.charting.components;

import android.graphics.Path;
import android.graphics.RectF;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material.ModalBottomSheetKt$Scrim$dismissModifier$1$1;
import androidx.compose.material.SliderKt$$ExternalSyntheticLambda2;
import androidx.compose.material3.SliderDefaults$$ExternalSyntheticLambda0;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.AndroidPath;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.BlendModeColorFilter;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Fill;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.ValueInsets;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.MultiParagraph$$ExternalSyntheticLambda1;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import app.cash.local.views.map.LocalBrandLocationMarkerKt$$ExternalSyntheticLambda0;
import app.cash.local.views.map.LocalMapPinKt$$ExternalSyntheticLambda5;
import app.cash.local.views.sheet.LocalShortlinkSheetKt$$ExternalSyntheticLambda8;
import app.cash.local.views.wallet.TabContentViewKt$$ExternalSyntheticLambda18;
import app.cash.local.views.wallet.TabContentViewKt$$ExternalSyntheticLambda26;
import app.cash.molecule.PlatformKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cardcustomizations.signature.SignaturesKt$$ExternalSyntheticLambda0;
import com.squareup.cash.R;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.arcade.util.ThemablesKt;
import com.squareup.cash.borrow.views.BulletinTileKt$$ExternalSyntheticLambda6;
import com.squareup.cash.card.onboarding.db.CardStudioQueries$$ExternalSyntheticLambda3;
import com.squareup.cash.charting.components.ChartConfig;
import com.squareup.cash.charting.viewmodels.SegmentedBarChartViewModel;
import com.squareup.cash.charting.viewmodels.SegmentedBarChartViewModel$ChartLabel$DefaultLabel;
import com.squareup.cash.checks.CaptureCheckFaceKt$$ExternalSyntheticLambda6;
import com.squareup.cash.checks.CheckDepositAmountKt$$ExternalSyntheticLambda8;
import com.squareup.cash.composeUi.foundation.layout.AdaptiveStackKt$spacedBetween$1;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.dialog.ArcadeModal2Kt$$ExternalSyntheticLambda3;
import com.squareup.protos.cash.ui.Color;
import com.squareup.util.cash.ColorsKt;
import com.squareup.util.cash.Countries;
import com.stripe.android.core.model.StripeJsonUtils;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.ListBuilder;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes6.dex */
public abstract class SegmentedBarChartKt {
    public static final ChartConfig.CapConfig.RoundedCapConfig DEFAULT_CAP_CONFIG = new ChartConfig.CapConfig.RoundedCapConfig();
    public static final Color RECURRING_PAYMENTS_COLOR;
    public static final Color REGULAR_SPENDING_COLOR;

    static {
        Color color = ColorsKt.toColor("#00D64F");
        REGULAR_SPENDING_COLOR = color;
        Color color2 = ColorsKt.toColor("#007517");
        RECURRING_PAYMENTS_COLOR = color2;
        SegmentedBarChartViewModel.Category buildCategory$default = buildCategory$default(null, Float.valueOf(50000.0f), "Feb", "$500");
        SegmentedBarChartViewModel.Category buildCategory$default2 = buildCategory$default(null, null, "Mar", "$0");
        Float valueOf = Float.valueOf(25050.0f);
        SegmentedBarChartViewModel.Category buildCategory$default3 = buildCategory$default(valueOf, Float.valueOf(75000.0f), "Apr", "$1,000");
        Float valueOf2 = Float.valueOf(100.0f);
        List listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new SegmentedBarChartViewModel.Category[]{buildCategory$default, buildCategory$default2, buildCategory$default3, buildCategory$default(valueOf2, null, "May", "$1"), buildCategory$default(valueOf2, Float.valueOf(9900.0f), "Jun", "$100"), buildCategory$default(valueOf, valueOf, "Jul", "$500")});
        CollectionsKt__CollectionsKt.listOf((Object[]) new SegmentedBarChartViewModel.Legend.Label[]{new SegmentedBarChartViewModel.Legend.Label(color2, "Recurring payments"), new SegmentedBarChartViewModel.Legend.Label(color, "Other spending")}).getClass();
        listOf.getClass();
    }

    public static final void Axis(ChartConfig chartConfig, Composer composer, int i) {
        int i2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(2040884576);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? gapComposer.changed(chartConfig) : gapComposer.changedInstance(chartConfig) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(Modifier.Companion.$$INSTANCE, chartConfig.mo3453getAxisLineColor0d7_KjU(), ColorKt.RectangleShape);
            ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
            Object obj = DefaultSizes.border.annotationsMap;
            BoxKt.Box(SizeKt.fillMaxWidth(SizeKt.m277height3ABfNKs(m177backgroundbw27NRU, 1.0f), 1.0f), gapComposer, 0);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new LocalShortlinkSheetKt$$ExternalSyntheticLambda8(chartConfig, i, 12);
        }
    }

    public static final void CategoryLabel(SegmentedBarChartViewModel.Category category, boolean z, Modifier modifier, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1985041026);
        int i2 = (gapComposer.changedInstance(category) ? 4 : 2) | i | (gapComposer.changed(z) ? 32 : 16) | MLKEMEngine.KyberPolyBytes;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            Updater.CompositionLocalProvider(CompositionLocalsKt.LocalDensity.defaultProvidedValue$runtime(StripeJsonUtils.nonLinearScalingDensity(gapComposer, 0)), Expect_jvmKt.rememberComposableLambda(828883134, new SliderDefaults$$ExternalSyntheticLambda0(category, z), gapComposer), gapComposer, 56);
            modifier = Modifier.Companion.$$INSTANCE;
        } else {
            gapComposer.skipToGroupEnd();
        }
        Modifier modifier2 = modifier;
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new TabContentViewKt$$ExternalSyntheticLambda26(category, z, modifier2, i, 15);
        }
    }

    /* renamed from: Chart-UR9CgXA, reason: not valid java name */
    public static final void m3461ChartUR9CgXA(SegmentedBarChartViewModel segmentedBarChartViewModel, ChartConfig chartConfig, float f, List list, Modifier modifier, boolean z, Function1 function1, Composer composer, int i) {
        SegmentedBarChartViewModel segmentedBarChartViewModel2;
        float f2;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1;
        List list2;
        ChartConfig chartConfig2 = chartConfig;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-486472800);
        Applier applier = gapComposer.applier;
        int i2 = i | (gapComposer.changedInstance(segmentedBarChartViewModel) ? 4 : 2) | (gapComposer.changed(chartConfig2) ? 32 : 16) | (gapComposer.changed(f) ? 256 : 128) | (gapComposer.changedInstance(list) ? 2048 : 1024) | (gapComposer.changed(modifier) ? 16384 : PKIFailureInfo.certRevoked) | (gapComposer.changedInstance(null) ? PKIFailureInfo.unsupportedVersion : 65536) | (gapComposer.changed(z) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted) | (gapComposer.changedInstance(function1) ? 8388608 : 4194304);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 4793491) != 4793490)) {
            List list3 = segmentedBarChartViewModel.yAxisLabels;
            List list4 = list3;
            if (list4 == null || list4.isEmpty()) {
                gapComposer.startReplaceGroup(651086786);
                gapComposer.end(false);
                f2 = RecyclerView.DECELERATION_RATE;
            } else {
                gapComposer.startReplaceGroup(651087877);
                ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
                DefaultSizes.spacing.getClass();
                gapComposer.end(false);
                f2 = 8.0f;
            }
            Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(modifier, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, f2, RecyclerView.DECELERATION_RATE, 11);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m302paddingqDBjuR0$default);
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
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetMeasurePolicy;
            Updater.m576setimpl(gapComposer, columnMeasurePolicy, composeUiNode$Companion$SetModifier$12);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$13);
            Integer valueOf = Integer.valueOf(hashCode);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetCompositeKeyHash;
            Updater.m576setimpl(gapComposer, valueOf, composeUiNode$Companion$SetModifier$14);
            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
            Updater.m575reconcileimpl(gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$15 = ComposeUiNode.Companion.SetModifier;
            Updater.m576setimpl(gapComposer, materializeModifier, composeUiNode$Companion$SetModifier$15);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
            int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, companion);
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, composeUiNode$Companion$SetModifier$12);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$13);
            Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer, composeUiNode$Companion$SetModifier$14, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer, materializeModifier2, composeUiNode$Companion$SetModifier$15);
            if (list3 == null) {
                gapComposer.startReplaceGroup(-88943757);
                gapComposer.end(false);
                list2 = list3;
                composeUiNode$Companion$SetModifier$1 = composeUiNode$Companion$SetModifier$15;
            } else {
                gapComposer.startReplaceGroup(-88943756);
                composeUiNode$Companion$SetModifier$1 = composeUiNode$Companion$SetModifier$15;
                list2 = list3;
                m3464GridLinesJKjFIXU(list, chartConfig.mo3454getChartHeightD9Ej5fM(), chartConfig.mo3453getAxisLineColor0d7_KjU(), gapComposer, (i2 >> 9) & 14);
                gapComposer.end(false);
            }
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
            Object rememberedValue = gapComposer.rememberedValue();
            if (rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new CardStudioQueries$$ExternalSyntheticLambda3(28);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Modifier semantics = SemanticsModifierKt.semantics(fillMaxWidth, false, (Function1) rememberedValue);
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Start, Alignment.Companion.Top, gapComposer, 0);
            int hashCode3 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer, semantics);
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, rowMeasurePolicy, composeUiNode$Companion$SetModifier$12);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope3, composeUiNode$Companion$SetModifier$13);
            Recorder$$ExternalSyntheticOutline2.m(hashCode3, gapComposer, composeUiNode$Companion$SetModifier$14, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer, materializeModifier3, composeUiNode$Companion$SetModifier$1);
            segmentedBarChartViewModel2 = segmentedBarChartViewModel;
            List list5 = segmentedBarChartViewModel2.categories;
            boolean z2 = list2 == null;
            int i3 = i2 << 3;
            int i4 = i2 >> 6;
            m3462ChartCategoriesaA_HZ9I(list5, chartConfig, f, z, z2, chartConfig.getSelectionBehavior() == SelectionBehavior.Focus, function1, gapComposer, (i3 & 7168) | (i3 & 896) | 6 | (57344 & i4) | (i2 & 29360128));
            chartConfig2 = chartConfig;
            gapComposer = gapComposer;
            gapComposer.end(true);
            gapComposer.end(true);
            ChartLabels(segmentedBarChartViewModel2.categories, chartConfig2, SizeKt.fillMaxWidth(companion, 1.0f), gapComposer, (i2 & 112) | MLKEMEngine.KyberPolyBytes | (i4 & 7168));
            gapComposer.end(true);
        } else {
            segmentedBarChartViewModel2 = segmentedBarChartViewModel;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SliderKt$$ExternalSyntheticLambda2(segmentedBarChartViewModel2, chartConfig2, f, list, modifier, z, function1, i);
        }
    }

    /* renamed from: ChartCategories-aA_HZ9I, reason: not valid java name */
    public static final void m3462ChartCategoriesaA_HZ9I(final List list, final ChartConfig chartConfig, final float f, final boolean z, final boolean z2, final boolean z3, final Function1 function1, Composer composer, final int i) {
        BarDisplay barDisplay;
        boolean z4 = z3;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1231079308);
        int i2 = i & 6;
        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
        int i3 = i2 == 0 ? (gapComposer.changed(rowScopeInstance) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i3 |= gapComposer.changedInstance(list) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i3 |= (i & 512) == 0 ? gapComposer.changed(chartConfig) : gapComposer.changedInstance(chartConfig) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= gapComposer.changed(f) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= gapComposer.changed(z) ? 16384 : PKIFailureInfo.certRevoked;
        }
        boolean z5 = z2;
        if ((196608 & i) == 0) {
            i3 |= gapComposer.changed(z5) ? PKIFailureInfo.unsupportedVersion : 65536;
        }
        if ((1572864 & i) == 0) {
            i3 |= gapComposer.changed(z4) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
        }
        if ((12582912 & i) == 0) {
            i3 |= gapComposer.changedInstance(function1) ? 8388608 : 4194304;
        }
        if (gapComposer.shouldExecute(i3 & 1, (4793491 & i3) != 4793490)) {
            int size = list.size();
            List list2 = list;
            int i4 = 0;
            for (Object obj : list2) {
                int i5 = i4 + 1;
                if (i4 < 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                    throw null;
                }
                SegmentedBarChartViewModel.Category category = (SegmentedBarChartViewModel.Category) obj;
                if (z4 && category.selected) {
                    barDisplay = BarDisplay.Focused;
                } else {
                    if (z4 && (!(list2 instanceof Collection) || !list2.isEmpty())) {
                        Iterator it = list2.iterator();
                        while (it.hasNext()) {
                            if (((SegmentedBarChartViewModel.Category) it.next()).selected) {
                                barDisplay = BarDisplay.Unfocused;
                                break;
                            }
                        }
                    }
                    barDisplay = BarDisplay.Default;
                }
                int size2 = list.size();
                Modifier weight = rowScopeInstance.weight(1.0f, Modifier.Companion.$$INSTANCE, true);
                boolean changedInstance = gapComposer.changedInstance(category) | gapComposer.changed(size) | gapComposer.changed(i4);
                Object rememberedValue = gapComposer.rememberedValue();
                NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                if (changedInstance || rememberedValue == neverEqualPolicy) {
                    rememberedValue = new MultiParagraph$$ExternalSyntheticLambda1(category, size, i4, 1);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                Modifier clearAndSetSemantics = SemanticsModifierKt.clearAndSetSemantics(weight, (Function1) rememberedValue);
                boolean changed = ((29360128 & i3) == 8388608) | gapComposer.changed(i4);
                Object rememberedValue2 = gapComposer.rememberedValue();
                if (changed || rememberedValue2 == neverEqualPolicy) {
                    rememberedValue2 = new TabContentViewKt$$ExternalSyntheticLambda18(i4, 7, function1);
                    gapComposer.updateRememberedValue(rememberedValue2);
                }
                int i6 = i3 << 3;
                m3463ChartCategory7vwJh_E(category, chartConfig, size2, f, clearAndSetSemantics, z, z5, barDisplay, z4, (Function0) rememberedValue2, gapComposer, ((i3 >> 3) & 112) | (i3 & 7168) | (458752 & i6) | (i6 & 3670016) | (234881024 & (i3 << 6)));
                z5 = z2;
                z4 = z3;
                i3 = i3;
                size = size;
                i4 = i5;
                list2 = list2;
            }
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new Function2() { // from class: com.squareup.cash.charting.components.SegmentedBarChartKt$$ExternalSyntheticLambda12
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    SegmentedBarChartKt.m3462ChartCategoriesaA_HZ9I(list, chartConfig, f, z, z2, z3, function1, (Composer) obj2, Updater.updateChangedFlags(i | 1));
                    return Unit.INSTANCE;
                }
            };
        }
    }

    /* renamed from: ChartCategory-7vwJh_E, reason: not valid java name */
    public static final void m3463ChartCategory7vwJh_E(final SegmentedBarChartViewModel.Category category, ChartConfig chartConfig, final int i, final float f, final Modifier modifier, final boolean z, final boolean z2, final BarDisplay barDisplay, final boolean z3, final Function0 function0, Composer composer, final int i2) {
        int i3;
        float f2;
        boolean z4;
        boolean z5;
        boolean z6;
        ChartConfig chartConfig2 = chartConfig;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-29100650);
        if ((i2 & 6) == 0) {
            i3 = (gapComposer.changedInstance(category) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= (i2 & 64) == 0 ? gapComposer.changed(chartConfig2) : gapComposer.changedInstance(chartConfig2) ? 32 : 16;
        }
        if ((i2 & MLKEMEngine.KyberPolyBytes) == 0) {
            i3 |= gapComposer.changed(i) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            f2 = f;
            i3 |= gapComposer.changed(f2) ? 2048 : 1024;
        } else {
            f2 = f;
        }
        if ((i2 & 24576) == 0) {
            i3 |= gapComposer.changed(modifier) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if ((196608 & i2) == 0) {
            z4 = z;
            i3 |= gapComposer.changed(z4) ? PKIFailureInfo.unsupportedVersion : 65536;
        } else {
            z4 = z;
        }
        if ((1572864 & i2) == 0) {
            z5 = z2;
            i3 |= gapComposer.changed(z5) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
        } else {
            z5 = z2;
        }
        if ((12582912 & i2) == 0) {
            i3 |= gapComposer.changed(barDisplay.ordinal()) ? 8388608 : 4194304;
        }
        if ((100663296 & i2) == 0) {
            i3 |= gapComposer.changed(z3) ? 67108864 : 33554432;
        }
        if ((805306368 & i2) == 0) {
            i3 |= gapComposer.changedInstance(function0) ? PKIFailureInfo.duplicateCertReq : 268435456;
        }
        if (gapComposer.shouldExecute(i3 & 1, (306783379 & i3) != 306783378)) {
            List list = category.segments;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (((SegmentedBarChartViewModel.Category.Segment) it.next()).value != RecyclerView.DECELERATION_RATE) {
                        z6 = false;
                        break;
                    }
                }
            }
            z6 = true;
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.CenterHorizontally, gapComposer, 48);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, modifier);
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
            gapComposer.startReplaceGroup(155958197);
            Modifier modifier2 = Modifier.Companion.$$INSTANCE;
            if (z3 && !z6) {
                Unit unit = Unit.INSTANCE;
                boolean z7 = (1879048192 & i3) == 536870912;
                Object rememberedValue = gapComposer.rememberedValue();
                if (z7 || rememberedValue == Composer.Companion.Empty) {
                    rememberedValue = new ModalBottomSheetKt$Scrim$dismissModifier$1$1(1, function0);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                modifier2 = SuspendingPointerInputFilterKt.pointerInput(modifier2, unit, (PointerInputEventHandler) rememberedValue);
            }
            gapComposer.end(false);
            int i4 = i3 >> 3;
            chartConfig2 = chartConfig;
            boolean z8 = z5;
            m3465SegmentedBaraA_HZ9I(category.segments, i, chartConfig2, f2, modifier2, z4, z8, barDisplay, gapComposer, (i4 & 112) | ((i3 << 3) & 896) | (i3 & 7168) | (458752 & i3) | (3670016 & i3) | (i3 & 29360128));
            Axis(chartConfig2, gapComposer, i4 & 14);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            final ChartConfig chartConfig3 = chartConfig2;
            endRestartGroup.block = new Function2() { // from class: com.squareup.cash.charting.components.SegmentedBarChartKt$$ExternalSyntheticLambda20
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    SegmentedBarChartKt.m3463ChartCategory7vwJh_E(SegmentedBarChartViewModel.Category.this, chartConfig3, i, f, modifier, z, z2, barDisplay, z3, function0, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final void ChartLabels(final List list, ChartConfig chartConfig, Modifier modifier, Composer composer, int i) {
        final Number number;
        SegmentedBarChartViewModel.Category category;
        Throwable th;
        List list2 = list;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(197417711);
        Applier applier = gapComposer.applier;
        int i2 = (i & 6) == 0 ? (gapComposer.changedInstance(list2) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? gapComposer.changed(chartConfig) : gapComposer.changedInstance(chartConfig) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changed(modifier) ? 256 : 128;
        }
        Throwable th2 = null;
        if ((i & 3072) == 0) {
            i2 |= gapComposer.changedInstance(null) ? 2048 : 1024;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 1171) != 1170)) {
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (rememberedValue == neverEqualPolicy) {
                rememberedValue = new CardStudioQueries$$ExternalSyntheticLambda3(27);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Modifier clearAndSetSemantics = SemanticsModifierKt.clearAndSetSemantics(modifier, (Function1) rememberedValue);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, clearAndSetSemantics);
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
            Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            Integer crowdedLabelThreshold = chartConfig.getCrowdedLabelThreshold();
            final boolean z = crowdedLabelThreshold != null ? list2.size() > crowdedLabelThreshold.intValue() : false;
            Number valueOf = z ? Float.valueOf((float) Math.ceil(r0 / 2.0f)) : Integer.valueOf(list2.size());
            gapComposer.startReplaceGroup(-708497889);
            final int i3 = 0;
            for (Object obj : list2) {
                int i4 = i3 + 1;
                if (i3 < 0) {
                    Throwable th3 = th2;
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                    throw th3;
                }
                SegmentedBarChartViewModel.Category category2 = (SegmentedBarChartViewModel.Category) obj;
                if (z) {
                    int i5 = i3 % 2;
                    if (i5 + ((((i5 ^ 2) & ((-i5) | i5)) >> 31) & 2) != 0) {
                        gapComposer.startReplaceGroup(-1555269390);
                        gapComposer.end(false);
                        number = valueOf;
                        th = th2;
                        valueOf = number;
                        th2 = th;
                        i3 = i4;
                        list2 = list;
                    }
                }
                gapComposer.startReplaceGroup(-1557744926);
                final float size = (i3 + 0.5f) / list2.size();
                boolean changedInstance = gapComposer.changedInstance(valueOf) | gapComposer.changed(z) | gapComposer.changed(i3) | gapComposer.changedInstance(list2) | gapComposer.changed(size);
                Object rememberedValue2 = gapComposer.rememberedValue();
                if (changedInstance || rememberedValue2 == neverEqualPolicy) {
                    number = valueOf;
                    category = category2;
                    Function3 function3 = new Function3() { // from class: com.squareup.cash.charting.components.SegmentedBarChartKt$$ExternalSyntheticLambda14
                        @Override // kotlin.jvm.functions.Function3
                        public final Object invoke(Object obj2, Object obj3, Object obj4) {
                            MeasureScope measureScope = (MeasureScope) obj2;
                            Measurable measurable = (Measurable) obj3;
                            Constraints constraints = (Constraints) obj4;
                            measureScope.getClass();
                            measurable.getClass();
                            float m1025getMaxWidthimpl = Constraints.m1025getMaxWidthimpl(constraints.value) / number.floatValue();
                            boolean z2 = z;
                            int i6 = i3;
                            List list3 = list;
                            Placeable mo833measureBRTryo0 = measurable.mo833measureBRTryo0(Constraints.m1018copyZbe2FdA$default(constraints.value, 0, (int) ((z2 && (i6 == 0 || i6 == CollectionsKt__CollectionsKt.getLastIndex(list3))) ? 0.75f * m1025getMaxWidthimpl : m1025getMaxWidthimpl), 0, 0, 13));
                            return MeasureScope.layout$default(measureScope, Constraints.m1025getMaxWidthimpl(constraints.value), mo833measureBRTryo0.height, new SignaturesKt$$ExternalSyntheticLambda0(constraints, size, mo833measureBRTryo0, z2, m1025getMaxWidthimpl, i6, list3));
                        }
                    };
                    gapComposer.updateRememberedValue(function3);
                    rememberedValue2 = function3;
                } else {
                    number = valueOf;
                    category = category2;
                }
                Modifier layout = ValueInsets.layout(Modifier.Companion.$$INSTANCE, (Function3) rememberedValue2);
                MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopCenter, false);
                int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
                Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, layout);
                ComposeUiNode.Companion.getClass();
                LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
                gapComposer.startReusableNode();
                if (gapComposer.inserting) {
                    gapComposer.createNode(layoutNode$Companion$Constructor$12);
                } else {
                    gapComposer.useNode();
                }
                Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy2, ComposeUiNode.Companion.SetMeasurePolicy);
                Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode2), ComposeUiNode.Companion.SetCompositeKeyHash);
                Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                Updater.m576setimpl(gapComposer, materializeModifier2, ComposeUiNode.Companion.SetModifier);
                if (category.label == null) {
                    gapComposer.startReplaceGroup(-1453837509);
                    gapComposer.end(false);
                    a$$ExternalSyntheticBUOutline0.m$3("Unsupported label type. Please provide label composable.");
                    return;
                }
                gapComposer.startReplaceGroup(-1454078348);
                th = null;
                CategoryLabel(category, chartConfig.getSelectionBehavior() == SelectionBehavior.EmphasizeLabel, null, gapComposer, 0);
                Boxes$$ExternalSyntheticOutline1.m(gapComposer, false, true, false);
                valueOf = number;
                th2 = th;
                i3 = i4;
                list2 = list;
            }
            gapComposer.end(false);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ArcadeModal2Kt$$ExternalSyntheticLambda3(list, chartConfig, modifier, i, 22);
        }
    }

    /* renamed from: GridLines-JKjFIXU, reason: not valid java name */
    public static final void m3464GridLinesJKjFIXU(List list, float f, long j, Composer composer, int i) {
        int i2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-746571053);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(list) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changed(f) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changed(j) ? 256 : 128;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
            Object obj = DefaultSizes.border.annotationsMap;
            Modifier m277height3ABfNKs = SizeKt.m277height3ABfNKs(SizeKt.fillMaxWidth(Modifier.Companion.$$INSTANCE, 1.0f), f);
            boolean changed = gapComposer.changed(1.0f) | gapComposer.changedInstance(list) | ((i2 & 896) == 256);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new LocalMapPinKt$$ExternalSyntheticLambda5(list, j, 7);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            CanvasKt.Canvas(0, gapComposer, m277height3ABfNKs, (Function1) rememberedValue);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SegmentedBarChartKt$$ExternalSyntheticLambda9(list, f, j, i);
        }
    }

    public static final void Legend(SegmentedBarChartViewModel.Legend legend, Modifier modifier, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(974145854);
        int i2 = (gapComposer.changedInstance(legend) ? 4 : 2) | i | (gapComposer.changed(modifier) ? 32 : 16);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            Object rememberedValue = gapComposer.rememberedValue();
            if (rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new CardStudioQueries$$ExternalSyntheticLambda3(29);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            OffsetKt.FlowRow(SemanticsModifierKt.clearAndSetSemantics(modifier, (Function1) rememberedValue), new AdaptiveStackKt$spacedBetween$1(24.0f), null, null, 0, 0, Expect_jvmKt.rememberComposableLambda(-258068253, new CheckDepositAmountKt$$ExternalSyntheticLambda8(legend, 22), gapComposer), gapComposer, 1572912, 60);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new CaptureCheckFaceKt$$ExternalSyntheticLambda6(legend, modifier, i, 19);
        }
    }

    public static final void LegendItem(SegmentedBarChartViewModel.Legend.Label label, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1147726829);
        int i2 = (gapComposer.changedInstance(label) ? 4 : 2) | i;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            androidx.compose.ui.graphics.Color forTheme = ThemablesKt.forTheme(label.color, gapComposer);
            forTheme.getClass();
            long j = forTheme.value;
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Start, Alignment.Companion.CenterVertically, gapComposer, 48);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, companion);
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
            ImageKt.Image(Countries.painterResource(R.drawable.icon_dot, 0, gapComposer), null, null, null, null, RecyclerView.DECELERATION_RATE, new BlendModeColorFilter(j, 5, new android.graphics.BlendModeColorFilter(ColorKt.m694toArgb8_81llA(j), ColorKt.m693toAndroidBlendModes9anfk8(5))), gapComposer, Painter.$stable | 48, 60);
            Room.m1165Text25TpFw(0, 0, 0, 0, 48, 0, 4080, j, (Composer) gapComposer, SpacerKt.m302paddingqDBjuR0$default(companion, 8.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 14), ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).buttonCompact, (TextLineBalancing) null, label.label, (Map) null, (Function1) null, false);
            gapComposer = gapComposer;
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BulletinTileKt$$ExternalSyntheticLambda6(label, i, 27);
        }
    }

    /* renamed from: SegmentedBar-aA_HZ9I, reason: not valid java name */
    public static final void m3465SegmentedBaraA_HZ9I(final List list, final int i, final ChartConfig chartConfig, final float f, final Modifier modifier, final boolean z, final boolean z2, final BarDisplay barDisplay, Composer composer, final int i2) {
        float f2;
        boolean z3;
        int i3;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(201548989);
        int i4 = (i2 & 6) == 0 ? (gapComposer.changedInstance(list) ? 4 : 2) | i2 : i2;
        if ((i2 & 48) == 0) {
            i4 |= gapComposer.changed(i) ? 32 : 16;
        }
        if ((i2 & MLKEMEngine.KyberPolyBytes) == 0) {
            i4 |= (i2 & 512) == 0 ? gapComposer.changed(chartConfig) : gapComposer.changedInstance(chartConfig) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            f2 = f;
            i4 |= gapComposer.changed(f2) ? 2048 : 1024;
        } else {
            f2 = f;
        }
        if ((i2 & 24576) == 0) {
            i4 |= gapComposer.changed(modifier) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if ((196608 & i2) == 0) {
            i4 |= gapComposer.changed(z) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            z3 = z2;
            i4 |= gapComposer.changed(z3) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
        } else {
            z3 = z2;
        }
        if ((12582912 & i2) == 0) {
            i4 |= gapComposer.changed(barDisplay.ordinal()) ? 8388608 : 4194304;
        }
        if (gapComposer.shouldExecute(i4 & 1, (4793491 & i4) != 4793490)) {
            int i5 = 458752 & i4;
            boolean z4 = i5 == 131072;
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (z4 || rememberedValue == neverEqualPolicy) {
                rememberedValue = AnimatableKt.Animatable(z ? RecyclerView.DECELERATION_RATE : 1.0f, 0.01f);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            final Animatable animatable = (Animatable) rememberedValue;
            Unit unit = Unit.INSTANCE;
            boolean changedInstance = (i5 == 131072) | gapComposer.changedInstance(animatable);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new LineChartKt$Chart$1$1(z, animatable, (Continuation) null, 1);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            Updater.LaunchedEffect(gapComposer, unit, (Function2) rememberedValue2);
            gapComposer.startReplaceGroup(415069926);
            List<SegmentedBarChartViewModel.Category.Segment> list2 = list;
            final ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
            for (SegmentedBarChartViewModel.Category.Segment segment : list2) {
                Float valueOf = Float.valueOf(segment.value);
                androidx.compose.ui.graphics.Color forTheme = ThemablesKt.forTheme(segment.color, gapComposer);
                forTheme.getClass();
                arrayList.add(new Pair(valueOf, forTheme));
            }
            gapComposer.end(false);
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(SizeKt.m277height3ABfNKs(modifier, chartConfig.mo3454getChartHeightD9Ej5fM()), 1.0f);
            boolean changedInstance2 = ((i4 & 112) == 32) | ((i4 & 896) == 256 || ((i4 & 512) != 0 && gapComposer.changedInstance(chartConfig))) | ((i4 & 7168) == 2048) | ((3670016 & i4) == 1048576) | gapComposer.changedInstance(list) | gapComposer.changedInstance(arrayList) | ((i4 & 29360128) == 8388608) | gapComposer.changedInstance(animatable);
            Object rememberedValue3 = gapComposer.rememberedValue();
            if (changedInstance2 || rememberedValue3 == neverEqualPolicy) {
                final float f3 = f2;
                final boolean z5 = z3;
                i3 = 0;
                Function1 function1 = new Function1() { // from class: com.squareup.cash.charting.components.SegmentedBarChartKt$$ExternalSyntheticLambda21
                    /* JADX WARN: Code restructure failed: missing block: B:20:0x00a4, code lost:
                    
                        if (r7 == com.squareup.cash.charting.components.BarDisplay.Unfocused) goto L26;
                     */
                    @Override // kotlin.jvm.functions.Function1
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final Object invoke(Object obj) {
                        float f4;
                        float f5;
                        DrawScope drawScope;
                        float f6;
                        float f7;
                        long j;
                        float f8;
                        float f9;
                        SegmentedBarChartKt$$ExternalSyntheticLambda21 segmentedBarChartKt$$ExternalSyntheticLambda21 = this;
                        DrawScope drawScope2 = (DrawScope) obj;
                        drawScope2.getClass();
                        char c = ' ';
                        float intBitsToFloat = Float.intBitsToFloat((int) (drawScope2.mo753getSizeNHjbRc() >> 32));
                        ChartConfig chartConfig2 = ChartConfig.this;
                        float f10 = 2.0f;
                        if (chartConfig2 instanceof ChartConfig.StaticChartConfig) {
                            f4 = drawScope2.mo236toPx0680j_4(((ChartConfig.StaticChartConfig) chartConfig2).barWidth);
                        } else {
                            if (!(chartConfig2 instanceof ChartConfig.FlexChartConfig)) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return null;
                            }
                            f4 = ((intBitsToFloat * i) * 2.0f) / (r3 * 3);
                        }
                        float f11 = f4;
                        float mo236toPx0680j_4 = drawScope2.mo236toPx0680j_4(f3);
                        boolean z6 = z5;
                        float f12 = RecyclerView.DECELERATION_RATE;
                        float mo236toPx0680j_42 = z6 ? drawScope2.mo236toPx0680j_4(chartConfig2.mo3455getSegmentSpacingD9Ej5fM()) : 0.0f;
                        long mo753getSizeNHjbRc = drawScope2.mo753getSizeNHjbRc();
                        long j2 = BodyPartID.bodyIdMax;
                        float intBitsToFloat2 = (Float.intBitsToFloat((int) (mo753getSizeNHjbRc & BodyPartID.bodyIdMax)) - mo236toPx0680j_4) - ((list.size() - 1) * mo236toPx0680j_42);
                        float f13 = 0.0f;
                        for (Pair pair : arrayList) {
                            float floatValue = ((Number) pair.first).floatValue();
                            long j3 = ((androidx.compose.ui.graphics.Color) pair.second).value;
                            if (floatValue == f12 && chartConfig2.mo3456getZeroBarColorQN2ZGVo() == null) {
                                drawScope = drawScope2;
                                f5 = f10;
                                f9 = f12;
                            } else {
                                if (floatValue != f12) {
                                }
                                androidx.compose.ui.graphics.Color mo3456getZeroBarColorQN2ZGVo = chartConfig2.mo3456getZeroBarColorQN2ZGVo();
                                mo3456getZeroBarColorQN2ZGVo.getClass();
                                j3 = mo3456getZeroBarColorQN2ZGVo.value;
                                float floatValue2 = ((Number) animatable.getValue()).floatValue() * floatValue * intBitsToFloat2;
                                float intBitsToFloat3 = (Float.intBitsToFloat((int) (drawScope2.mo753getSizeNHjbRc() >> c)) - f11) / f10;
                                float intBitsToFloat4 = Float.intBitsToFloat((int) (drawScope2.mo753getSizeNHjbRc() & j2)) - f13;
                                AndroidPath Path = AndroidPath_androidKt.Path();
                                Path path = Path.internalPath;
                                Path.moveTo(intBitsToFloat3, intBitsToFloat4);
                                if (f13 == f12) {
                                    f5 = f10;
                                    Path.lineTo(intBitsToFloat3 + f11, intBitsToFloat4);
                                    drawScope = drawScope2;
                                    f6 = intBitsToFloat3;
                                } else {
                                    f5 = f10;
                                    ChartConfig.CapConfig capConfig = chartConfig2.getCapConfig();
                                    if (capConfig instanceof ChartConfig.CapConfig.RoundedCapConfig) {
                                        SegmentedBarChartKt.drawArcCap(Path, intBitsToFloat3, intBitsToFloat4 - mo236toPx0680j_4, intBitsToFloat3 + f11, (mo236toPx0680j_4 / 4.0f) + intBitsToFloat4, 180.0f, 180.0f);
                                        drawScope = drawScope2;
                                        f6 = intBitsToFloat3;
                                    } else if (capConfig instanceof ChartConfig.CapConfig.SquareCapConfig) {
                                        float f14 = intBitsToFloat4 - mo236toPx0680j_4;
                                        float f15 = mo236toPx0680j_4 * f5;
                                        float f16 = intBitsToFloat3 + f15;
                                        float f17 = (mo236toPx0680j_4 / f5) + intBitsToFloat4;
                                        if (Path.rectF == null) {
                                            Path.rectF = new RectF();
                                        }
                                        RectF rectF = Path.rectF;
                                        rectF.getClass();
                                        rectF.set(intBitsToFloat3, f14, f16, f17);
                                        RectF rectF2 = Path.rectF;
                                        rectF2.getClass();
                                        drawScope = drawScope2;
                                        f6 = intBitsToFloat3;
                                        path.arcTo(rectF2, 180.0f, 90.0f, false);
                                        float f18 = f6 + f11;
                                        float f19 = f18 - f15;
                                        if (Path.rectF == null) {
                                            Path.rectF = new RectF();
                                        }
                                        RectF rectF3 = Path.rectF;
                                        rectF3.getClass();
                                        rectF3.set(f19, f14, f18, f17);
                                        RectF rectF4 = Path.rectF;
                                        rectF4.getClass();
                                        path.arcTo(rectF4, 270.0f, 90.0f, false);
                                    } else {
                                        drawScope = drawScope2;
                                        f6 = intBitsToFloat3;
                                        Path.lineTo(f6 + f11, intBitsToFloat4);
                                    }
                                }
                                float f20 = f6 + f11;
                                float f21 = intBitsToFloat4 - floatValue2;
                                Path.lineTo(f20, f21);
                                ChartConfig.CapConfig capConfig2 = chartConfig2.getCapConfig();
                                if (capConfig2 instanceof ChartConfig.CapConfig.RoundedCapConfig) {
                                    float f22 = f6;
                                    SegmentedBarChartKt.drawArcCap(Path, f22, f21 - mo236toPx0680j_4, f20, f21 + mo236toPx0680j_4, RecyclerView.DECELERATION_RATE, -180.0f);
                                    f7 = f22;
                                    j = j3;
                                    f8 = RecyclerView.DECELERATION_RATE;
                                } else {
                                    f7 = f6;
                                    if (capConfig2 instanceof ChartConfig.CapConfig.SquareCapConfig) {
                                        float f23 = mo236toPx0680j_4 * f5;
                                        float f24 = f20 - f23;
                                        float f25 = f21 - mo236toPx0680j_4;
                                        float f26 = f21 + mo236toPx0680j_4;
                                        if (Path.rectF == null) {
                                            Path.rectF = new RectF();
                                        }
                                        RectF rectF5 = Path.rectF;
                                        rectF5.getClass();
                                        rectF5.set(f24, f25, f20, f26);
                                        RectF rectF6 = Path.rectF;
                                        rectF6.getClass();
                                        j = j3;
                                        f8 = RecyclerView.DECELERATION_RATE;
                                        path.arcTo(rectF6, RecyclerView.DECELERATION_RATE, -90.0f, false);
                                        float f27 = f7 + f23;
                                        if (Path.rectF == null) {
                                            Path.rectF = new RectF();
                                        }
                                        RectF rectF7 = Path.rectF;
                                        rectF7.getClass();
                                        rectF7.set(f7, f25, f27, f26);
                                        RectF rectF8 = Path.rectF;
                                        rectF8.getClass();
                                        path.arcTo(rectF8, -90.0f, -90.0f, false);
                                    } else {
                                        j = j3;
                                        f8 = RecyclerView.DECELERATION_RATE;
                                        Path.lineTo(f7, f21);
                                    }
                                }
                                Path.lineTo(f7, intBitsToFloat4);
                                f9 = f8;
                                DrawScope.m745drawPathLG529CI$default(drawScope, Path, j, RecyclerView.DECELERATION_RATE, Fill.INSTANCE, 52);
                                f13 = floatValue2 + mo236toPx0680j_42 + f13;
                            }
                            segmentedBarChartKt$$ExternalSyntheticLambda21 = this;
                            f12 = f9;
                            f10 = f5;
                            drawScope2 = drawScope;
                            c = ' ';
                            j2 = BodyPartID.bodyIdMax;
                        }
                        return Unit.INSTANCE;
                    }
                };
                gapComposer.updateRememberedValue(function1);
                rememberedValue3 = function1;
            } else {
                i3 = 0;
            }
            CanvasKt.Canvas(i3, gapComposer, fillMaxWidth, (Function1) rememberedValue3);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new Function2() { // from class: com.squareup.cash.charting.components.SegmentedBarChartKt$$ExternalSyntheticLambda22
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    SegmentedBarChartKt.m3465SegmentedBaraA_HZ9I(list, i, chartConfig, f, modifier, z, z2, barDisplay, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                    return Unit.INSTANCE;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00fb A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0106  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SegmentedBarChart(final SegmentedBarChartViewModel segmentedBarChartViewModel, Modifier modifier, final ChartConfig chartConfig, boolean z, Function1 function1, Composer composer, int i, int i2) {
        boolean z2;
        int i3;
        final Function1 function12;
        boolean z3;
        RecomposeScopeImpl endRestartGroup;
        final boolean z4;
        ChartConfig.CapConfig capConfig;
        final float f;
        float f2;
        boolean changed;
        Object rememberedValue;
        List list;
        Throwable th;
        float f3;
        AxisPlacement axisPlacement;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1536421607);
        int i4 = (i & 6) == 0 ? (gapComposer.changedInstance(segmentedBarChartViewModel) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i4 |= gapComposer.changed(modifier) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i4 |= (i & 512) == 0 ? gapComposer.changed(chartConfig) : gapComposer.changedInstance(chartConfig) ? 256 : 128;
        }
        int i5 = i4 | 3072;
        int i6 = i2 & 16;
        if (i6 != 0) {
            i5 = i4 | 27648;
        } else if ((i & 24576) == 0) {
            z2 = z;
            i5 |= gapComposer.changed(z2) ? 16384 : PKIFailureInfo.certRevoked;
            i3 = i2 & 32;
            if (i3 == 0) {
                i5 |= 196608;
            } else if ((196608 & i) == 0) {
                function12 = function1;
                i5 |= gapComposer.changedInstance(function12) ? PKIFailureInfo.unsupportedVersion : 65536;
                if (gapComposer.shouldExecute(i5 & 1, (74899 & i5) != 74898)) {
                    gapComposer.startDefaults();
                    int i7 = i & 1;
                    NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                    if (i7 == 0 || gapComposer.getDefaultsInvalid()) {
                        if (i6 != 0) {
                            z2 = false;
                        }
                        if (i3 != 0) {
                            Object rememberedValue2 = gapComposer.rememberedValue();
                            if (rememberedValue2 == neverEqualPolicy) {
                                rememberedValue2 = new CardStudioQueries$$ExternalSyntheticLambda3(26);
                                gapComposer.updateRememberedValue(rememberedValue2);
                            }
                            z4 = z2;
                            function12 = (Function1) rememberedValue2;
                            gapComposer.endDefaults();
                            capConfig = chartConfig.getCapConfig();
                            if (!(capConfig instanceof ChartConfig.CapConfig.RoundedCapConfig)) {
                                f2 = 6.0f;
                            } else if (capConfig instanceof ChartConfig.CapConfig.SquareCapConfig) {
                                f2 = segmentedBarChartViewModel.categories.size() < 8 ? 8.0f : 4.0f;
                            } else {
                                f = RecyclerView.DECELERATION_RATE;
                                Density density = (Density) gapComposer.consume(CompositionLocalsKt.LocalDensity);
                                changed = gapComposer.changed(segmentedBarChartViewModel);
                                rememberedValue = gapComposer.rememberedValue();
                                if (!changed || rememberedValue == neverEqualPolicy) {
                                    list = segmentedBarChartViewModel.yAxisLabels;
                                    if (list != null) {
                                        float mo3454getChartHeightD9Ej5fM = chartConfig.mo3454getChartHeightD9Ej5fM();
                                        float mo236toPx0680j_4 = density.mo236toPx0680j_4(f);
                                        float mo236toPx0680j_42 = density.mo236toPx0680j_4(mo3454getChartHeightD9Ej5fM);
                                        float f4 = mo236toPx0680j_42 - mo236toPx0680j_4;
                                        List<SegmentedBarChartViewModel$ChartLabel$DefaultLabel> list2 = list;
                                        ArrayList arrayList = new ArrayList();
                                        for (SegmentedBarChartViewModel$ChartLabel$DefaultLabel segmentedBarChartViewModel$ChartLabel$DefaultLabel : list2) {
                                            ArrayList arrayList2 = new ArrayList();
                                            Iterator it = list2.iterator();
                                            while (it.hasNext()) {
                                                Float f5 = ((SegmentedBarChartViewModel$ChartLabel$DefaultLabel) it.next()).value;
                                                if (f5 != null) {
                                                    arrayList2.add(f5);
                                                }
                                            }
                                            Float m4123maxOrNull = CollectionsKt.m4123maxOrNull((Iterable) arrayList2);
                                            if (m4123maxOrNull == null) {
                                                axisPlacement = null;
                                                f3 = mo236toPx0680j_42;
                                            } else {
                                                Float f6 = segmentedBarChartViewModel$ChartLabel$DefaultLabel.value;
                                                if (f6 != null) {
                                                    f3 = mo236toPx0680j_42;
                                                    float floatValue = Intrinsics.areEqual(m4123maxOrNull, RecyclerView.DECELERATION_RATE) ? 0.0f : (f6.floatValue() / m4123maxOrNull.floatValue()) * f4;
                                                    float f7 = floatValue > mo236toPx0680j_4 ? f4 - floatValue : f3;
                                                    String str = segmentedBarChartViewModel$ChartLabel$DefaultLabel.valueText;
                                                    if (str != null) {
                                                        axisPlacement = new AxisPlacement(str, f7);
                                                    }
                                                } else {
                                                    f3 = mo236toPx0680j_42;
                                                }
                                                axisPlacement = null;
                                            }
                                            if (axisPlacement != null) {
                                                arrayList.add(axisPlacement);
                                            }
                                            mo236toPx0680j_42 = f3;
                                        }
                                        th = null;
                                        rememberedValue = arrayList;
                                    } else {
                                        th = null;
                                        rememberedValue = EmptyList.INSTANCE;
                                    }
                                    gapComposer.updateRememberedValue(rememberedValue);
                                } else {
                                    th = null;
                                }
                                final List list3 = (List) rememberedValue;
                                ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.CenterHorizontally, gapComposer, 48);
                                int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
                                PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
                                Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, modifier);
                                ComposeUiNode.Companion.getClass();
                                LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                                if (gapComposer.applier == null) {
                                    Updater.invalidApplier();
                                    throw th;
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
                                Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                                BarChartKt.m3447ChartWithYAxisLyZNIlQ(SizeKt.fillMaxWidth(companion, 1.0f), chartConfig.mo3454getChartHeightD9Ej5fM(), list3, 0L, Expect_jvmKt.rememberComposableLambda(-601241598, new Function3() { // from class: com.squareup.cash.charting.components.SegmentedBarChartKt$$ExternalSyntheticLambda1
                                    @Override // kotlin.jvm.functions.Function3
                                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                                        RowScope rowScope = (RowScope) obj;
                                        Composer composer2 = (Composer) obj2;
                                        int intValue = ((Integer) obj3).intValue();
                                        rowScope.getClass();
                                        if ((intValue & 6) == 0) {
                                            intValue |= ((GapComposer) composer2).changed(rowScope) ? 4 : 2;
                                        }
                                        GapComposer gapComposer2 = (GapComposer) composer2;
                                        if (gapComposer2.shouldExecute(intValue & 1, (intValue & 19) != 18)) {
                                            SegmentedBarChartKt.m3461ChartUR9CgXA(SegmentedBarChartViewModel.this, chartConfig, f, list3, rowScope.weight(1.0f, Modifier.Companion.$$INSTANCE, true), z4, function12, gapComposer2, 0);
                                        } else {
                                            gapComposer2.skipToGroupEnd();
                                        }
                                        return Unit.INSTANCE;
                                    }
                                }, gapComposer), gapComposer, 24582, 8);
                                SegmentedBarChartViewModel.Legend legend = segmentedBarChartViewModel.legend;
                                if (legend == null) {
                                    gapComposer.startReplaceGroup(1864341688);
                                    gapComposer.end(false);
                                } else {
                                    gapComposer.startReplaceGroup(1864341689);
                                    ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
                                    DefaultSizes.spacing.getClass();
                                    Legend(legend, SpacerKt.m302paddingqDBjuR0$default(companion, RecyclerView.DECELERATION_RATE, 16.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 13), gapComposer, 0);
                                    gapComposer.end(false);
                                }
                                gapComposer.end(true);
                                z3 = z4;
                            }
                            f = f2;
                            Density density2 = (Density) gapComposer.consume(CompositionLocalsKt.LocalDensity);
                            changed = gapComposer.changed(segmentedBarChartViewModel);
                            rememberedValue = gapComposer.rememberedValue();
                            if (changed) {
                            }
                            list = segmentedBarChartViewModel.yAxisLabels;
                            if (list != null) {
                            }
                            gapComposer.updateRememberedValue(rememberedValue);
                            final List list32 = (List) rememberedValue;
                            ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.CenterHorizontally, gapComposer, 48);
                            int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
                            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
                            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, modifier);
                            ComposeUiNode.Companion.getClass();
                            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
                            if (gapComposer.applier == null) {
                            }
                        }
                    } else {
                        gapComposer.skipToGroupEnd();
                    }
                    z4 = z2;
                    gapComposer.endDefaults();
                    capConfig = chartConfig.getCapConfig();
                    if (!(capConfig instanceof ChartConfig.CapConfig.RoundedCapConfig)) {
                    }
                    f = f2;
                    Density density22 = (Density) gapComposer.consume(CompositionLocalsKt.LocalDensity);
                    changed = gapComposer.changed(segmentedBarChartViewModel);
                    rememberedValue = gapComposer.rememberedValue();
                    if (changed) {
                    }
                    list = segmentedBarChartViewModel.yAxisLabels;
                    if (list != null) {
                    }
                    gapComposer.updateRememberedValue(rememberedValue);
                    final List list322 = (List) rememberedValue;
                    ColumnMeasurePolicy columnMeasurePolicy22 = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.CenterHorizontally, gapComposer, 48);
                    int hashCode22 = Long.hashCode(gapComposer.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope22 = gapComposer.currentCompositionLocalScope();
                    Modifier materializeModifier22 = PlatformKt.materializeModifier(gapComposer, modifier);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$122 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer.applier == null) {
                    }
                } else {
                    gapComposer.skipToGroupEnd();
                    z3 = z2;
                }
                Function1 function13 = function12;
                endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.block = new LocalBrandLocationMarkerKt$$ExternalSyntheticLambda0(segmentedBarChartViewModel, modifier, chartConfig, z3, function13, i, i2);
                    return;
                }
                return;
            }
            function12 = function1;
            if (gapComposer.shouldExecute(i5 & 1, (74899 & i5) != 74898)) {
            }
            Function1 function132 = function12;
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        z2 = z;
        i3 = i2 & 32;
        if (i3 == 0) {
        }
        function12 = function1;
        if (gapComposer.shouldExecute(i5 & 1, (74899 & i5) != 74898)) {
        }
        Function1 function1322 = function12;
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    public static SegmentedBarChartViewModel.Category buildCategory$default(Float f, Float f2, String str, String str2) {
        ListBuilder createListBuilder = CollectionsKt__CollectionsJVMKt.createListBuilder();
        if (f != null) {
            createListBuilder.add(new SegmentedBarChartViewModel.Category.Segment(f.floatValue() / 100000.0f, RECURRING_PAYMENTS_COLOR));
        }
        if (f2 != null) {
            createListBuilder.add(new SegmentedBarChartViewModel.Category.Segment(f2.floatValue() / 100000.0f, REGULAR_SPENDING_COLOR));
        }
        ListBuilder build = CollectionsKt__CollectionsJVMKt.build(createListBuilder);
        return new SegmentedBarChartViewModel.Category((List) build, new SegmentedBarChartViewModel$ChartLabel$DefaultLabel(str, str2, null, 4), (String) null, (String) null, false, str2 + " spent in " + str + ", " + f + " in recurring payments, " + f2 + " in other spending.", 76);
    }

    public static final ChartConfig.StaticChartConfig defaultChartConfig(Composer composer) {
        GapComposer gapComposer = (GapComposer) composer;
        Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
        if (colors == null) {
            colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
        } else {
            gapComposer.startReplaceGroup(-1762997739);
            gapComposer.end(false);
        }
        return new ChartConfig.StaticChartConfig(129.0f, 12.0f, DEFAULT_CAP_CONFIG, 2.0f, null, null, colors.semantic.border.standard, SelectionBehavior.None);
    }

    public static final void drawArcCap(AndroidPath androidPath, float f, float f2, float f3, float f4, float f5, float f6) {
        if (androidPath.rectF == null) {
            androidPath.rectF = new RectF();
        }
        RectF rectF = androidPath.rectF;
        rectF.getClass();
        rectF.set(f, f2, f3, f4);
        Path path = androidPath.internalPath;
        RectF rectF2 = androidPath.rectF;
        rectF2.getClass();
        path.arcTo(rectF2, f5, f6, false);
    }
}
