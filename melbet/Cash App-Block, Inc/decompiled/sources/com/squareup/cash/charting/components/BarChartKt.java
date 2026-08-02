package com.squareup.cash.charting.components;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.gestures.DefaultDraggableState;
import androidx.compose.foundation.gestures.DraggableKt;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.SliderKt$$ExternalSyntheticLambda11;
import androidx.compose.material.TextFieldKt$$ExternalSyntheticLambda0;
import androidx.compose.material3.DividerKt$$ExternalSyntheticLambda0;
import androidx.compose.material3.SliderKt$sliderTapModifier$1;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.ParcelableSnapshotMutableFloatState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.hapticfeedback.PlatformHapticFeedback;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.RulerKt;
import androidx.compose.ui.layout.SubcomposeMeasureScope;
import androidx.compose.ui.layout.ValueInsets;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.TextMeasurer;
import androidx.compose.ui.text.TextPainterKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.paging.CachedPagingDataKt$cachedIn$5;
import androidx.paging.MulticastedPagingData$asPagingData$2;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import app.cash.local.views.wallet.TabContentViewKt$$ExternalSyntheticLambda10;
import app.cash.local.views.wallet.TabContentViewKt$$ExternalSyntheticLambda38;
import app.cash.molecule.PlatformKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.compose.SubcomposeAsyncImageKt$$ExternalSyntheticLambda1;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.components.BadgeKt$$ExternalSyntheticLambda3;
import com.squareup.cash.arcade.components.BadgeKt$$ExternalSyntheticLambda4;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.card.onboarding.core.CardScene$$ExternalSyntheticLambda1;
import com.squareup.cash.card.onboarding.db.CardStudioQueries$$ExternalSyntheticLambda3;
import com.squareup.cash.charting.viewmodels.EarningsBarViewModel;
import com.squareup.cash.checks.CaptureCheckFaceKt$$ExternalSyntheticLambda12;
import com.squareup.cash.checks.CheckDepositAmountKt$$ExternalSyntheticLambda8;
import com.squareup.cash.checks.ConfirmBackOfCheckKt$$ExternalSyntheticLambda6;
import com.squareup.cash.common.composeui.DrawerViewKt$$ExternalSyntheticLambda2;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.wallet.views.HeroCardViewKt$$ExternalSyntheticLambda33;
import com.stripe.android.uicore.elements.FormLabelKt$$ExternalSyntheticLambda0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.coroutines.Continuation;
import kotlin.enums.EnumEntriesList;
import kotlin.io.TextStreamsKt$$ExternalSyntheticLambda0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.ArrayIterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt__MathJVMKt;
import kotlin.ranges.IntProgressionIterator;
import kotlin.ranges.IntRange;
import kotlin.text.StringsKt__IndentKt;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes6.dex */
public abstract class BarChartKt {
    public static final EarningsBarChartConfig DEFAULT_EARNINGS_BAR_CHART_CONFIG = new EarningsBarChartConfig(new CardStudioQueries$$ExternalSyntheticLambda3(21), new CardStudioQueries$$ExternalSyntheticLambda3(22), false, true);

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BarChart$Direction.values().length];
            try {
                BarChart$Direction barChart$Direction = BarChart$Direction.HORIZONTAL;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void BasicBarChart(Modifier modifier, float f, BarChart$Configuration barChart$Configuration, Composer composer, int i) {
        Modifier modifier2;
        float f2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-2086252595);
        int i2 = i | (gapComposer.changed(f) ? 32 : 16) | (gapComposer.changed(barChart$Configuration) ? 256 : 128);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            gapComposer.startDefaults();
            if ((i & 1) != 0 && !gapComposer.getDefaultsInvalid()) {
                gapComposer.skipToGroupEnd();
            }
            gapComposer.endDefaults();
            if (RecyclerView.DECELERATION_RATE <= f && f <= 1.0f) {
                f2 = f;
            } else {
                if (RecyclerView.DECELERATION_RATE > f || f > 100.0f) {
                    a$$ExternalSyntheticBUOutline0.m$3("percentFilled must be in range 1 to 100 or 0.0 to 1.0");
                    return;
                }
                f2 = f / 100.0f;
            }
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            modifier2 = modifier;
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, modifier2);
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
            Modifier fillMaxSize = SizeKt.fillMaxSize(Modifier.Companion.$$INSTANCE, 1.0f);
            boolean changed = gapComposer.changed(f2) | ((((i2 & 896) ^ MLKEMEngine.KyberPolyBytes) > 256 && gapComposer.changed(barChart$Configuration)) || (i2 & MLKEMEngine.KyberPolyBytes) == 256);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new TextFieldKt$$ExternalSyntheticLambda0(barChart$Configuration, f2, 3);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            CanvasKt.Canvas(6, gapComposer, fillMaxSize, (Function1) rememberedValue);
            gapComposer.end(true);
        } else {
            modifier2 = modifier;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new TabContentViewKt$$ExternalSyntheticLambda38(modifier2, f, barChart$Configuration, i, 6);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:132:0x03d5, code lost:
    
        if (r5 == r2) goto L165;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x047e  */
    /* JADX WARN: Type inference failed for: r0v30, types: [kotlin.collections.EmptyList] */
    /* renamed from: ChartBars-nYkSgmE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m3446ChartBarsnYkSgmE(final EarningsBarChartConfig earningsBarChartConfig, final List list, final long j, final float f, final Modifier modifier, final Function0 function0, final float f2, Composer composer, final int i) {
        int i2;
        ArrayList arrayList;
        NeverEqualPolicy neverEqualPolicy;
        Object obj;
        Object earningsBarChartKt$ChartBars$1$1;
        LinkedHashMap linkedHashMap;
        long j2;
        NeverEqualPolicy neverEqualPolicy2;
        NeverEqualPolicy neverEqualPolicy3;
        long j3;
        ArrayIterator arrayIterator;
        char c;
        long j4;
        long j5 = j;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(876628731);
        Applier applier = gapComposer.applier;
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(earningsBarChartConfig) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(list) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changed(j5) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer.changed(f) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= gapComposer.changed(modifier) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if ((196608 & i) == 0) {
            i2 |= gapComposer.changedInstance(function0) ? PKIFailureInfo.unsupportedVersion : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= gapComposer.changed(f2) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
        }
        int i3 = i2;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 599187) != 599186)) {
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            long j6 = colors.semantic.background.brand;
            gapComposer.startReplaceGroup(626632899);
            EnumEntriesList enumEntriesList = EarningsBarViewModel.Color.$ENTRIES;
            int mapCapacity = MapsKt__MapsJVMKt.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(enumEntriesList, 10));
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(mapCapacity >= 16 ? mapCapacity : 16);
            ArrayIterator arrayIterator2 = new ArrayIterator(enumEntriesList);
            while (arrayIterator2.hasNext()) {
                Object next = arrayIterator2.next();
                int ordinal = ((EarningsBarViewModel.Color) next).ordinal();
                if (ordinal != 0) {
                    if (ordinal == 1) {
                        gapComposer.startReplaceGroup(-2054799583);
                        Colors colors2 = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                        if (colors2 == null) {
                            colors2 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                        } else {
                            gapComposer.startReplaceGroup(-1762997739);
                            gapComposer.end(false);
                        }
                        arrayIterator = arrayIterator2;
                        j4 = Color.m675copywmQWz5c$default(0.3f, colors2.semantic.background.brand, 14);
                        gapComposer.end(false);
                    } else {
                        if (ordinal != 2) {
                            throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, -2054803942, false);
                        }
                        gapComposer.startReplaceGroup(-2054797409);
                        Colors colors3 = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                        if (colors3 == null) {
                            colors3 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                        } else {
                            gapComposer.startReplaceGroup(-1762997739);
                            gapComposer.end(false);
                        }
                        j4 = colors3.semantic.background.standard;
                        gapComposer.end(false);
                        arrayIterator = arrayIterator2;
                    }
                    c = 52446;
                } else {
                    arrayIterator = arrayIterator2;
                    gapComposer.startReplaceGroup(-2054801860);
                    Colors colors4 = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                    if (colors4 == null) {
                        c = 52446;
                        colors4 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                    } else {
                        c = 52446;
                        gapComposer.startReplaceGroup(-1762997739);
                        gapComposer.end(false);
                    }
                    long j7 = colors4.semantic.background.brand;
                    gapComposer.end(false);
                    j4 = j7;
                }
                linkedHashMap2.put(next, new Color(j4));
                arrayIterator2 = arrayIterator;
            }
            gapComposer.end(false);
            boolean changed = gapComposer.changed(list);
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy4 = Composer.Companion.Empty;
            if (changed || rememberedValue == neverEqualPolicy4) {
                if (earningsBarChartConfig.animationEnabled) {
                    List list2 = list;
                    arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        NeverEqualPolicy neverEqualPolicy5 = neverEqualPolicy4;
                        arrayList.add(((EarningsBarViewModel) it.next()).value > 0 ? AnimatableKt.Animatable(RecyclerView.DECELERATION_RATE, 0.01f) : AnimatableKt.Animatable(1.0f, 0.01f));
                        neverEqualPolicy4 = neverEqualPolicy5;
                    }
                } else {
                    arrayList = EmptyList.INSTANCE;
                }
                neverEqualPolicy = neverEqualPolicy4;
                gapComposer.updateRememberedValue(arrayList);
                obj = arrayList;
            } else {
                neverEqualPolicy = neverEqualPolicy4;
                obj = rememberedValue;
            }
            List list3 = (List) obj;
            long j8 = list.size() <= 15 ? 50L : 33L;
            boolean changedInstance = ((i3 & 14) == 4) | gapComposer.changedInstance(list3) | gapComposer.changed(j8);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (!changedInstance) {
                NeverEqualPolicy neverEqualPolicy6 = neverEqualPolicy;
                if (rememberedValue2 == neverEqualPolicy6) {
                    neverEqualPolicy = neverEqualPolicy6;
                } else {
                    neverEqualPolicy2 = neverEqualPolicy6;
                    linkedHashMap = linkedHashMap2;
                    earningsBarChartKt$ChartBars$1$1 = rememberedValue2;
                    j2 = j6;
                    Updater.LaunchedEffect(gapComposer, list, (Function2) earningsBarChartKt$ChartBars$1$1);
                    Modifier m277height3ABfNKs = SizeKt.m277height3ABfNKs(modifier, f2);
                    RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.SpaceBetween, Alignment.Companion.Bottom, gapComposer, 54);
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
                    float m3452toPx8Feqmps = m3452toPx8Feqmps(6.0f, gapComposer);
                    gapComposer.startReplaceGroup(1033236905);
                    Iterator it2 = list.iterator();
                    int i4 = 0;
                    while (it2.hasNext()) {
                        Object next2 = it2.next();
                        int i5 = i4 + 1;
                        if (i4 < 0) {
                            CollectionsKt__CollectionsKt.throwIndexOverflow();
                            throw null;
                        }
                        EarningsBarViewModel earningsBarViewModel = (EarningsBarViewModel) next2;
                        float m3452toPx8Feqmps2 = m3452toPx8Feqmps(f2, gapComposer) - m3452toPx8Feqmps;
                        float min = Math.min(m3452toPx8Feqmps(3.0f, gapComposer), f);
                        Animatable animatable = (Animatable) CollectionsKt.getOrNull(i4, list3);
                        float floatValue = animatable != null ? ((Number) animatable.getValue()).floatValue() : 1.0f;
                        float f3 = m3452toPx8Feqmps;
                        Iterator it3 = it2;
                        long j9 = earningsBarViewModel.value;
                        List list4 = list3;
                        EarningsBarViewModel.Color color = earningsBarViewModel.color;
                        float f4 = (((m3452toPx8Feqmps2 * j9) / j5) * floatValue) + f3;
                        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                        Modifier fillMaxHeight = SizeKt.fillMaxHeight(companion, 1.0f);
                        StaticProvidableCompositionLocal staticProvidableCompositionLocal = CompositionLocalsKt.LocalDensity;
                        Modifier m290width3ABfNKs = SizeKt.m290width3ABfNKs(fillMaxHeight, ((Density) gapComposer.consume(staticProvidableCompositionLocal)).mo232toDpu2uoSUM(f));
                        MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.BottomCenter, false);
                        int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
                        PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
                        Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, m290width3ABfNKs);
                        ComposeUiNode.Companion.getClass();
                        LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
                        gapComposer.startReusableNode();
                        if (gapComposer.inserting) {
                            gapComposer.createNode(layoutNode$Companion$Constructor$12);
                        } else {
                            gapComposer.useNode();
                        }
                        Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                        Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                        Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode2), ComposeUiNode.Companion.SetCompositeKeyHash);
                        Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                        Updater.m576setimpl(gapComposer, materializeModifier2, ComposeUiNode.Companion.SetModifier);
                        Modifier m277height3ABfNKs2 = SizeKt.m277height3ABfNKs(SizeKt.fillMaxWidth(companion, 1.0f), ((Density) gapComposer.consume(staticProvidableCompositionLocal)).mo232toDpu2uoSUM(f4));
                        if (function0.invoke() != null) {
                            if (Intrinsics.areEqual(function0.invoke(), earningsBarViewModel)) {
                                color = EarningsBarViewModel.Color.ACTIVE;
                            } else {
                                EarningsBarViewModel.Color color2 = EarningsBarViewModel.Color.FUTURE;
                                color = color == color2 ? color2 : EarningsBarViewModel.Color.DISABLED;
                            }
                        }
                        LinkedHashMap linkedHashMap3 = linkedHashMap;
                        Object obj2 = linkedHashMap3.get(color);
                        obj2.getClass();
                        Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(m277height3ABfNKs2, ((Color) obj2).value, RoundedCornerShapeKt.RoundedCornerShape(min));
                        boolean changedInstance2 = gapComposer.changedInstance(earningsBarViewModel);
                        Object rememberedValue3 = gapComposer.rememberedValue();
                        if (changedInstance2) {
                            neverEqualPolicy3 = neverEqualPolicy2;
                        } else {
                            neverEqualPolicy3 = neverEqualPolicy2;
                        }
                        rememberedValue3 = new CaptureCheckFaceKt$$ExternalSyntheticLambda12(earningsBarViewModel, 13);
                        gapComposer.updateRememberedValue(rememberedValue3);
                        BoxKt.Box(SemanticsModifierKt.semantics(m177backgroundbw27NRU, true, (Function1) rememberedValue3), gapComposer, 0);
                        if (function0.invoke() != null) {
                            Object invoke = function0.invoke();
                            invoke.getClass();
                            if (invoke.equals(earningsBarViewModel)) {
                                gapComposer.startReplaceGroup(1210912012);
                                Modifier fillMaxHeight2 = SizeKt.fillMaxHeight(SizeKt.wrapContentWidth$default(companion, null, 3), 1.0f);
                                j3 = j2;
                                boolean changed2 = ((i3 & 3670016) == 1048576) | gapComposer.changed(j3);
                                Object rememberedValue4 = gapComposer.rememberedValue();
                                if (changed2 || rememberedValue4 == neverEqualPolicy3) {
                                    rememberedValue4 = new DividerKt$$ExternalSyntheticLambda0(f2, j3, 2);
                                    gapComposer.updateRememberedValue(rememberedValue4);
                                }
                                CanvasKt.Canvas(6, gapComposer, fillMaxHeight2, (Function1) rememberedValue4);
                                gapComposer.end(false);
                                gapComposer.end(true);
                                j5 = j;
                                neverEqualPolicy2 = neverEqualPolicy3;
                                linkedHashMap = linkedHashMap3;
                                j2 = j3;
                                m3452toPx8Feqmps = f3;
                                it2 = it3;
                                list3 = list4;
                                i4 = i5;
                            }
                        }
                        j3 = j2;
                        gapComposer.startReplaceGroup(1211282958);
                        gapComposer.end(false);
                        gapComposer.end(true);
                        j5 = j;
                        neverEqualPolicy2 = neverEqualPolicy3;
                        linkedHashMap = linkedHashMap3;
                        j2 = j3;
                        m3452toPx8Feqmps = f3;
                        it2 = it3;
                        list3 = list4;
                        i4 = i5;
                    }
                    gapComposer.end(false);
                    gapComposer.end(true);
                }
            }
            linkedHashMap = linkedHashMap2;
            j2 = j6;
            neverEqualPolicy2 = neverEqualPolicy;
            earningsBarChartKt$ChartBars$1$1 = new EarningsBarChartKt$ChartBars$1$1(earningsBarChartConfig, list3, j8, null);
            gapComposer.updateRememberedValue(earningsBarChartKt$ChartBars$1$1);
            Updater.LaunchedEffect(gapComposer, list, (Function2) earningsBarChartKt$ChartBars$1$1);
            Modifier m277height3ABfNKs3 = SizeKt.m277height3ABfNKs(modifier, f2);
            RowMeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(SpacerKt.SpaceBetween, Alignment.Companion.Bottom, gapComposer, 54);
            int hashCode3 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer, m277height3ABfNKs3);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$13 = ComposeUiNode.Companion.Constructor;
            if (applier != null) {
            }
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new Function2() { // from class: com.squareup.cash.charting.components.EarningsBarChartKt$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj3, Object obj4) {
                    ((Integer) obj4).getClass();
                    BarChartKt.m3446ChartBarsnYkSgmE(EarningsBarChartConfig.this, list, j, f, modifier, function0, f2, (Composer) obj3, Updater.updateChangedFlags(i | 1));
                    return Unit.INSTANCE;
                }
            };
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x009f, code lost:
    
        if ((r24 & 8) != 0) goto L56;
     */
    /* renamed from: ChartWithYAxis-LyZNIlQ, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m3447ChartWithYAxisLyZNIlQ(Modifier modifier, float f, final List list, long j, ComposableLambdaImpl composableLambdaImpl, Composer composer, int i, int i2) {
        int i3;
        final float f2;
        long j2;
        ComposableLambdaImpl composableLambdaImpl2;
        long j3;
        Object obj;
        final long j4;
        list.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-610105704);
        if ((i & 6) == 0) {
            i3 = (gapComposer.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            f2 = f;
            i3 |= gapComposer.changed(f2) ? 32 : 16;
        } else {
            f2 = f;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i3 |= gapComposer.changedInstance(list) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            j2 = j;
            i3 |= ((i2 & 8) == 0 && gapComposer.changed(j2)) ? 2048 : 1024;
        } else {
            j2 = j;
        }
        if ((i & 24576) == 0) {
            composableLambdaImpl2 = composableLambdaImpl;
            i3 |= gapComposer.changedInstance(composableLambdaImpl2) ? 16384 : PKIFailureInfo.certRevoked;
        } else {
            composableLambdaImpl2 = composableLambdaImpl;
        }
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 9363) != 9362)) {
            gapComposer.startDefaults();
            if ((i & 1) == 0 || gapComposer.getDefaultsInvalid()) {
                if ((i2 & 8) != 0) {
                    Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                    if (colors == null) {
                        colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                    } else {
                        gapComposer.startReplaceGroup(-1762997739);
                        gapComposer.end(false);
                    }
                    j2 = colors.semantic.background.f1047app;
                    i3 &= -7169;
                }
                int i4 = i3;
                gapComposer.endDefaults();
                boolean changedInstance = gapComposer.changedInstance(list) | ((i4 & 112) == 32) | ((((i4 & 7168) ^ 3072) > 2048 && gapComposer.changed(j2)) || (i4 & 3072) == 2048) | ((57344 & i4) == 16384);
                Object rememberedValue = gapComposer.rememberedValue();
                if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                    final ComposableLambdaImpl composableLambdaImpl3 = composableLambdaImpl2;
                    j4 = j2;
                    obj = new Function2() { // from class: com.squareup.cash.charting.components.ChartWithYAxisKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj2, Object obj3) {
                            Pair pair;
                            SubcomposeMeasureScope subcomposeMeasureScope = (SubcomposeMeasureScope) obj2;
                            Constraints constraints = (Constraints) obj3;
                            subcomposeMeasureScope.getClass();
                            List list2 = list;
                            boolean isEmpty = list2.isEmpty();
                            float f3 = f2;
                            if (isEmpty) {
                                pair = new Pair(0, 0);
                            } else {
                                List sortedWith = CollectionsKt.sortedWith(list2, new ChartWithYAxisKt$calculateVerticalPaddingwH6b6FI$$inlined$sortedBy$1());
                                AxisPlacement axisPlacement = (AxisPlacement) CollectionsKt.first(sortedWith);
                                AxisPlacement axisPlacement2 = (AxisPlacement) CollectionsKt.last(sortedWith);
                                int roundToInt = MathKt__MathJVMKt.roundToInt(BarChartKt.measureLabel(subcomposeMeasureScope, axisPlacement.label, "min") / 2.0f);
                                int i5 = -(((int) axisPlacement.yOffset) - roundToInt);
                                if (i5 < 0) {
                                    i5 = 0;
                                }
                                if (!axisPlacement.equals(axisPlacement2)) {
                                    roundToInt = MathKt__MathJVMKt.roundToInt(BarChartKt.measureLabel(subcomposeMeasureScope, axisPlacement2.label, "max") / 2.0f);
                                }
                                int mo236toPx0680j_4 = (((int) axisPlacement2.yOffset) + roundToInt) - ((int) subcomposeMeasureScope.mo236toPx0680j_4(f3));
                                pair = new Pair(Integer.valueOf(i5), Integer.valueOf(mo236toPx0680j_4 >= 0 ? mo236toPx0680j_4 : 0));
                            }
                            List subcompose = subcomposeMeasureScope.subcompose("content", new ComposableLambdaImpl(new TabContentViewKt$$ExternalSyntheticLambda10(subcomposeMeasureScope, j4, ((Number) pair.first).intValue(), ((Number) pair.second).intValue(), composableLambdaImpl3, list2, f3), true, 1563516852));
                            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(subcompose, 10));
                            Iterator it = subcompose.iterator();
                            while (it.hasNext()) {
                                arrayList.add(((Measurable) it.next()).mo833measureBRTryo0(constraints.value));
                            }
                            Iterator it2 = arrayList.iterator();
                            if (!it2.hasNext()) {
                                a$$ExternalSyntheticBUOutline0.m();
                                return null;
                            }
                            int i6 = ((Placeable) it2.next()).width;
                            while (it2.hasNext()) {
                                int i7 = ((Placeable) it2.next()).width;
                                if (i6 < i7) {
                                    i6 = i7;
                                }
                            }
                            Iterator it3 = arrayList.iterator();
                            if (!it3.hasNext()) {
                                a$$ExternalSyntheticBUOutline0.m();
                                return null;
                            }
                            int i8 = ((Placeable) it3.next()).height;
                            while (it3.hasNext()) {
                                int i9 = ((Placeable) it3.next()).height;
                                if (i8 < i9) {
                                    i8 = i9;
                                }
                            }
                            return MeasureScope.layout$default(subcomposeMeasureScope, i6, i8, new TextStreamsKt$$ExternalSyntheticLambda0(4, arrayList));
                        }
                    };
                    gapComposer.updateRememberedValue(obj);
                } else {
                    obj = rememberedValue;
                    j4 = j2;
                }
                RulerKt.SubcomposeLayout(modifier, (Function2) obj, gapComposer, i4 & 14, 0);
                j3 = j4;
            } else {
                gapComposer.skipToGroupEnd();
            }
        } else {
            gapComposer.skipToGroupEnd();
            j3 = j2;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new TabContentViewKt$$ExternalSyntheticLambda10(modifier, f, list, j3, composableLambdaImpl, i, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x04df  */
    /* JADX WARN: Removed duplicated region for block: B:104:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:160:0x04d2  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ad  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void EarningsBarChart(List list, String str, Modifier modifier, EarningsBarChartConfig earningsBarChartConfig, Function1 function1, Function0 function0, Composer composer, int i, int i2) {
        int i3;
        Function1 function12;
        int i4;
        Function0 function02;
        int i5;
        EarningsBarChartConfig earningsBarChartConfig2;
        GapComposer gapComposer;
        Function1 function13;
        Function0 function03;
        RecomposeScopeImpl endRestartGroup;
        int i6;
        Function1 function14;
        float f;
        float f2;
        int i7;
        boolean z;
        boolean z2;
        float f3;
        Object obj;
        MutableFloatState mutableFloatState;
        Function0 function04;
        Continuation continuation;
        Object obj2;
        GapComposer gapComposer2;
        TextStyle textStyle;
        List list2 = list;
        list2.getClass();
        str.getClass();
        GapComposer gapComposer3 = (GapComposer) composer;
        gapComposer3.startRestartGroup(-445063641);
        Applier applier = gapComposer3.applier;
        if ((i & 6) == 0) {
            i3 = (gapComposer3.changedInstance(list2) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= gapComposer3.changed(str) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i3 |= gapComposer3.changed(modifier) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= gapComposer3.changed(earningsBarChartConfig) ? 2048 : 1024;
        }
        int i8 = i2 & 16;
        if (i8 != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            function12 = function1;
            i3 |= gapComposer3.changedInstance(function12) ? 16384 : PKIFailureInfo.certRevoked;
            i4 = i2 & 32;
            if (i4 == 0) {
                i3 |= 196608;
                function02 = function0;
            } else {
                function02 = function0;
                if ((i & 196608) == 0) {
                    i3 |= gapComposer3.changedInstance(function02) ? PKIFailureInfo.unsupportedVersion : 65536;
                }
            }
            i5 = i3;
            if (gapComposer3.shouldExecute(i5 & 1, (i5 & 74899) == 74898)) {
                earningsBarChartConfig2 = earningsBarChartConfig;
                gapComposer = gapComposer3;
                gapComposer.skipToGroupEnd();
                function13 = function12;
                function03 = function02;
            } else {
                Object obj3 = Composer.Companion.Empty;
                if (i8 != 0) {
                    Object rememberedValue = gapComposer3.rememberedValue();
                    Object obj4 = rememberedValue;
                    if (rememberedValue == obj3) {
                        Object cardStudioQueries$$ExternalSyntheticLambda3 = new CardStudioQueries$$ExternalSyntheticLambda3(23);
                        gapComposer3.updateRememberedValue(cardStudioQueries$$ExternalSyntheticLambda3);
                        obj4 = cardStudioQueries$$ExternalSyntheticLambda3;
                    }
                    function14 = (Function1) obj4;
                    i6 = i4;
                } else {
                    i6 = i4;
                    function14 = function12;
                }
                if (i6 != 0) {
                    Object rememberedValue2 = gapComposer3.rememberedValue();
                    Object obj5 = rememberedValue2;
                    if (rememberedValue2 == obj3) {
                        Object cardScene$$ExternalSyntheticLambda1 = new CardScene$$ExternalSyntheticLambda1(20);
                        gapComposer3.updateRememberedValue(cardScene$$ExternalSyntheticLambda1);
                        obj5 = cardScene$$ExternalSyntheticLambda1;
                    }
                    function02 = (Function0) obj5;
                }
                TextStyle textStyle2 = ((Typography) gapComposer3.consume(ArcadeThemeKt.LocalTypography)).bodyXSmall;
                Function1 function15 = earningsBarChartConfig.yAxisMaxValueGetter;
                float f4 = earningsBarChartConfig.effectiveHeight;
                List list3 = list2;
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list3, 10));
                Iterator it = list3.iterator();
                while (it.hasNext()) {
                    arrayList.add(Long.valueOf(((EarningsBarViewModel) it.next()).value));
                    f4 = f4;
                }
                float f5 = f4;
                long longValue = ((Number) function15.invoke(arrayList)).longValue();
                Function1 function16 = earningsBarChartConfig.yAxisValueFormatter;
                long j = longValue / 2;
                IntRange intRange = new IntRange(0, 2, 1);
                ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(intRange, 10));
                IntProgressionIterator it2 = intRange.iterator();
                while (it2.hasNext) {
                    long j2 = j;
                    arrayList2.add((String) function16.invoke(Long.valueOf(it2.nextInt() * j2)));
                    j = j2;
                }
                float size = arrayList2.size() > 1 ? f5 / (arrayList2.size() - 1) : RecyclerView.DECELERATION_RATE;
                if (arrayList2.isEmpty()) {
                    gapComposer3.startReplaceGroup(1790603945);
                    gapComposer3.end(false);
                    f = RecyclerView.DECELERATION_RATE;
                } else {
                    gapComposer3.startReplaceGroup(1790603098);
                    float mo231toDpGaN1DYA = ((Density) gapComposer3.consume(CompositionLocalsKt.LocalDensity)).mo231toDpGaN1DYA(Room.getSp(8));
                    gapComposer3.end(false);
                    f = mo231toDpGaN1DYA;
                }
                Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(SizeKt.fillMaxWidth(modifier, 1.0f), RecyclerView.DECELERATION_RATE, f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 13);
                boolean z3 = (i5 & 112) == 32;
                Object rememberedValue3 = gapComposer3.rememberedValue();
                Object obj6 = rememberedValue3;
                if (z3 || rememberedValue3 == obj3) {
                    Object badgeKt$$ExternalSyntheticLambda3 = new BadgeKt$$ExternalSyntheticLambda3(str, 20);
                    gapComposer3.updateRememberedValue(badgeKt$$ExternalSyntheticLambda3);
                    obj6 = badgeKt$$ExternalSyntheticLambda3;
                }
                Modifier semantics = SemanticsModifierKt.semantics(m302paddingqDBjuR0$default, true, (Function1) obj6);
                RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Start, Alignment.Companion.Top, gapComposer3, 0);
                int hashCode = Long.hashCode(gapComposer3.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer3.currentCompositionLocalScope();
                Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer3, semantics);
                ComposeUiNode.Companion.getClass();
                LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                if (applier == null) {
                    Updater.invalidApplier();
                    throw null;
                }
                gapComposer3.startReusableNode();
                if (gapComposer3.inserting) {
                    gapComposer3.createNode(layoutNode$Companion$Constructor$1);
                } else {
                    gapComposer3.useNode();
                }
                ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetMeasurePolicy;
                Updater.m576setimpl(gapComposer3, rowMeasurePolicy, composeUiNode$Companion$SetModifier$1);
                ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
                Updater.m576setimpl(gapComposer3, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
                Integer valueOf = Integer.valueOf(hashCode);
                ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
                Updater.m576setimpl(gapComposer3, valueOf, composeUiNode$Companion$SetModifier$13);
                OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
                Updater.m575reconcileimpl(gapComposer3, ownerSnapshotObserver$onCommitAffectingLayout$1);
                ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
                Updater.m576setimpl(gapComposer3, materializeModifier, composeUiNode$Companion$SetModifier$14);
                Object rememberedValue4 = gapComposer3.rememberedValue();
                MutableFloatState mutableFloatState2 = (MutableFloatState) (rememberedValue4 == obj3 ? Recorder$$ExternalSyntheticOutline2.m(RecyclerView.DECELERATION_RATE, gapComposer3) : rememberedValue4);
                Function1 function17 = function14;
                LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, true);
                Object rememberedValue5 = gapComposer3.rememberedValue();
                Object obj7 = rememberedValue5;
                if (rememberedValue5 == obj3) {
                    Object heroCardViewKt$$ExternalSyntheticLambda33 = new HeroCardViewKt$$ExternalSyntheticLambda33(mutableFloatState2, 15);
                    gapComposer3.updateRememberedValue(heroCardViewKt$$ExternalSyntheticLambda33);
                    obj7 = heroCardViewKt$$ExternalSyntheticLambda33;
                }
                Modifier onGloballyPositioned = ValueInsets.onGloballyPositioned(layoutWeightElement, (Function1) obj7);
                MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
                int hashCode2 = Long.hashCode(gapComposer3.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer3.currentCompositionLocalScope();
                Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer3, onGloballyPositioned);
                gapComposer3.startReusableNode();
                if (gapComposer3.inserting) {
                    gapComposer3.createNode(layoutNode$Companion$Constructor$1);
                } else {
                    gapComposer3.useNode();
                }
                Updater.m576setimpl(gapComposer3, maybeCachedBoxMeasurePolicy, composeUiNode$Companion$SetModifier$1);
                Updater.m576setimpl(gapComposer3, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
                Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer3, composeUiNode$Companion$SetModifier$13, gapComposer3, ownerSnapshotObserver$onCommitAffectingLayout$1);
                Updater.m576setimpl(gapComposer3, materializeModifier2, composeUiNode$Companion$SetModifier$14);
                boolean isEmpty = arrayList2.isEmpty();
                Modifier modifier2 = Modifier.Companion.$$INSTANCE;
                if (isEmpty) {
                    f2 = 1.0f;
                    i7 = 0;
                    gapComposer3.startReplaceGroup(818212965);
                    gapComposer3.end(false);
                } else {
                    gapComposer3.startReplaceGroup(818007311);
                    f2 = 1.0f;
                    i7 = 0;
                    m3448HorizontalLinesrAjV9yQ(arrayList2.size(), size, SizeKt.m277height3ABfNKs(SizeKt.fillMaxWidth(modifier2, 1.0f), f5), gapComposer3, 0);
                    gapComposer3.end(false);
                }
                Modifier fillMaxWidth = SizeKt.fillMaxWidth(modifier2, f2);
                ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer3, i7);
                int hashCode3 = Long.hashCode(gapComposer3.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer3.currentCompositionLocalScope();
                Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer3, fillMaxWidth);
                gapComposer3.startReusableNode();
                float f6 = size;
                if (gapComposer3.inserting) {
                    gapComposer3.createNode(layoutNode$Companion$Constructor$1);
                } else {
                    gapComposer3.useNode();
                }
                Updater.m576setimpl(gapComposer3, columnMeasurePolicy, composeUiNode$Companion$SetModifier$1);
                Updater.m576setimpl(gapComposer3, currentCompositionLocalScope3, composeUiNode$Companion$SetModifier$12);
                Recorder$$ExternalSyntheticOutline2.m(hashCode3, gapComposer3, composeUiNode$Companion$SetModifier$13, gapComposer3, ownerSnapshotObserver$onCommitAffectingLayout$1);
                Updater.m576setimpl(gapComposer3, materializeModifier3, composeUiNode$Companion$SetModifier$14);
                gapComposer3.startReplaceGroup(381740150);
                ParcelableSnapshotMutableFloatState parcelableSnapshotMutableFloatState = (ParcelableSnapshotMutableFloatState) mutableFloatState2;
                if (parcelableSnapshotMutableFloatState.getFloatValue() <= RecyclerView.DECELERATION_RATE) {
                    gapComposer3.end(false);
                    earningsBarChartConfig2 = earningsBarChartConfig;
                    gapComposer2 = gapComposer3;
                    function04 = function02;
                    textStyle = textStyle2;
                    f3 = f6;
                    z2 = true;
                } else {
                    float m3452toPx8Feqmps = m3452toPx8Feqmps(4.0f, gapComposer3);
                    float size2 = (list2.size() - 1) * m3452toPx8Feqmps;
                    if (size2 > parcelableSnapshotMutableFloatState.getFloatValue()) {
                        a$$ExternalSyntheticBUOutline0.m$3(StringsKt__IndentKt.replaceIndent("\n            The total spacing (" + size2 + ") between the bars is bigger than \n            the available space (" + parcelableSnapshotMutableFloatState.getFloatValue() + ") for chart (bars + spacing). \n            Tip: Increase the chart width or/and Reduce the barSpacing or/and Reduce the data points. \n            "));
                        return;
                    }
                    float floatValue = (parcelableSnapshotMutableFloatState.getFloatValue() - size2) / list2.size();
                    Object rememberedValue6 = gapComposer3.rememberedValue();
                    Object obj8 = rememberedValue6;
                    if (rememberedValue6 == obj3) {
                        obj8 = Recorder$$ExternalSyntheticOutline2.m(-1.0f, gapComposer3);
                    }
                    MutableFloatState mutableFloatState3 = (MutableFloatState) obj8;
                    Object rememberedValue7 = gapComposer3.rememberedValue();
                    Object obj9 = rememberedValue7;
                    if (rememberedValue7 == obj3) {
                        Object mutableStateOf$default = Updater.mutableStateOf$default(null);
                        gapComposer3.updateRememberedValue(mutableStateOf$default);
                        obj9 = mutableStateOf$default;
                    }
                    MutableState mutableState = (MutableState) obj9;
                    PlatformHapticFeedback platformHapticFeedback = (PlatformHapticFeedback) gapComposer3.consume(CompositionLocalsKt.LocalHapticFeedback);
                    boolean changedInstance = gapComposer3.changedInstance(list2) | gapComposer3.changed(floatValue) | gapComposer3.changed(m3452toPx8Feqmps) | gapComposer3.changedInstance(platformHapticFeedback) | ((i5 & 57344) == 16384) | ((i5 & 458752) == 131072);
                    Object rememberedValue8 = gapComposer3.rememberedValue();
                    if (changedInstance || rememberedValue8 == obj3) {
                        z = false;
                        Function0 function05 = function02;
                        z2 = true;
                        f3 = f6;
                        obj = obj3;
                        Object earningsBarChartKt$EarningsBarChart$5$2$1$1$1 = new EarningsBarChartKt$EarningsBarChart$5$2$1$1$1(mutableFloatState3, list, floatValue, m3452toPx8Feqmps, platformHapticFeedback, function05, mutableState, function17, null);
                        mutableFloatState = mutableFloatState3;
                        list2 = list;
                        function04 = function05;
                        gapComposer3.updateRememberedValue(earningsBarChartKt$EarningsBarChart$5$2$1$1$1);
                        rememberedValue8 = earningsBarChartKt$EarningsBarChart$5$2$1$1$1;
                    } else {
                        z = false;
                        function04 = function02;
                        z2 = true;
                        f3 = f6;
                        obj = obj3;
                        mutableFloatState = mutableFloatState3;
                    }
                    int i9 = i5 & 14;
                    Updater.LaunchedEffect(gapComposer3, list2, (Function2) rememberedValue8);
                    if (earningsBarChartConfig.isPlaceholder) {
                        gapComposer3.startReplaceGroup(383253817);
                        gapComposer3.end(z);
                    } else {
                        gapComposer3.startReplaceGroup(383324931);
                        Orientation orientation = Orientation.Horizontal;
                        Object rememberedValue9 = gapComposer3.rememberedValue();
                        Object obj10 = rememberedValue9;
                        if (rememberedValue9 == obj) {
                            Object heroCardViewKt$$ExternalSyntheticLambda332 = new HeroCardViewKt$$ExternalSyntheticLambda33(mutableFloatState, 16);
                            gapComposer3.updateRememberedValue(heroCardViewKt$$ExternalSyntheticLambda332);
                            obj10 = heroCardViewKt$$ExternalSyntheticLambda332;
                        }
                        CachedPagingDataKt$cachedIn$5 cachedPagingDataKt$cachedIn$5 = DraggableKt.NoOpOnDragStarted;
                        DefaultDraggableState defaultDraggableState = new DefaultDraggableState((Function1) obj10);
                        Object rememberedValue10 = gapComposer3.rememberedValue();
                        if (rememberedValue10 == obj) {
                            continuation = null;
                            Object anonymousClass1 = new SliderKt$sliderTapModifier$1.AnonymousClass1(mutableFloatState, null, z2 ? 1 : 0);
                            gapComposer3.updateRememberedValue(anonymousClass1);
                            obj2 = anonymousClass1;
                        } else {
                            continuation = null;
                            obj2 = rememberedValue10;
                        }
                        Function3 function3 = (Function3) obj2;
                        Object rememberedValue11 = gapComposer3.rememberedValue();
                        Object obj11 = rememberedValue11;
                        if (rememberedValue11 == obj) {
                            Object multicastedPagingData$asPagingData$2 = new MulticastedPagingData$asPagingData$2(mutableFloatState, continuation, 5);
                            gapComposer3.updateRememberedValue(multicastedPagingData$asPagingData$2);
                            obj11 = multicastedPagingData$asPagingData$2;
                        }
                        modifier2 = DraggableKt.draggable$default(modifier2, defaultDraggableState, orientation, false, null, true, function3, (Function3) obj11, false, 140);
                        gapComposer3.end(z);
                    }
                    Modifier fillMaxWidth2 = SizeKt.fillMaxWidth(modifier2, 1.0f);
                    Object rememberedValue12 = gapComposer3.rememberedValue();
                    Object obj12 = rememberedValue12;
                    if (rememberedValue12 == obj) {
                        Object drawerViewKt$$ExternalSyntheticLambda2 = new DrawerViewKt$$ExternalSyntheticLambda2(8, mutableState);
                        gapComposer3.updateRememberedValue(drawerViewKt$$ExternalSyntheticLambda2);
                        obj12 = drawerViewKt$$ExternalSyntheticLambda2;
                    }
                    m3446ChartBarsnYkSgmE(earningsBarChartConfig, list2, longValue, floatValue, fillMaxWidth2, (Function0) obj12, 160.0f, gapComposer3, ((i5 >> 9) & 14) | 196608 | ((i5 << 3) & 112));
                    gapComposer2 = gapComposer3;
                    earningsBarChartConfig2 = earningsBarChartConfig;
                    textStyle = textStyle2;
                    m3449XAxisLabelsUuyPYSY(list, textStyle, ((Density) gapComposer2.consume(CompositionLocalsKt.LocalDensity)).mo232toDpu2uoSUM(floatValue), earningsBarChartConfig2.isPlaceholder, gapComposer2, i9);
                    gapComposer2.end(z);
                }
                gapComposer2.end(z2);
                gapComposer2.end(z2);
                GapComposer gapComposer4 = gapComposer2;
                m3451YAxisLabelsUuyPYSY(arrayList2, textStyle, earningsBarChartConfig2.effectiveHeight, f3, earningsBarChartConfig2.isPlaceholder, gapComposer4, 0);
                gapComposer = gapComposer4;
                gapComposer.end(z2);
                function03 = function04;
                function13 = function17;
            }
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.block = new SubcomposeAsyncImageKt$$ExternalSyntheticLambda1(list, str, modifier, earningsBarChartConfig2, function13, function03, i, i2, 17);
                return;
            }
            return;
        }
        function12 = function1;
        i4 = i2 & 32;
        if (i4 == 0) {
        }
        i5 = i3;
        if (gapComposer3.shouldExecute(i5 & 1, (i5 & 74899) == 74898)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* renamed from: HorizontalLines-rAjV9yQ, reason: not valid java name */
    public static final void m3448HorizontalLinesrAjV9yQ(final int i, final float f, Modifier modifier, Composer composer, int i2) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(489200469);
        int i3 = (gapComposer.changed(i) ? 4 : 2) | i2 | (gapComposer.changed(f) ? 32 : 16) | (gapComposer.changed(modifier) ? 256 : 128);
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 147) != 146)) {
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            final long j = colors.semantic.border.subtle;
            boolean changed = ((i3 & 14) == 4) | ((i3 & 112) == 32) | gapComposer.changed(j);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new Function1() { // from class: com.squareup.cash.charting.components.EarningsBarChartKt$$ExternalSyntheticLambda12
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        DrawScope drawScope = (DrawScope) obj;
                        drawScope.getClass();
                        for (int i4 = 1; i4 < i; i4++) {
                            float intBitsToFloat = Float.intBitsToFloat((int) (drawScope.mo753getSizeNHjbRc() & BodyPartID.bodyIdMax)) - (drawScope.mo236toPx0680j_4(f) * i4);
                            drawScope.mo729drawLineNGM6Ib0(j, (Float.floatToRawIntBits(RecyclerView.DECELERATION_RATE) << 32) | (Float.floatToRawIntBits(intBitsToFloat) & BodyPartID.bodyIdMax), (Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawScope.mo753getSizeNHjbRc() >> 32))) << 32) | (BodyPartID.bodyIdMax & Float.floatToRawIntBits(intBitsToFloat)), (r23 & 8) != 0 ? 0.0f : drawScope.mo236toPx0680j_4(1.0f), (r23 & 16) != 0 ? 0 : 0, (r23 & 32) != 0 ? null : null, (r23 & 64) != 0 ? 1.0f : RecyclerView.DECELERATION_RATE);
                        }
                        return Unit.INSTANCE;
                    }
                };
                gapComposer.updateRememberedValue(rememberedValue);
            }
            CanvasKt.Canvas((i3 >> 6) & 14, gapComposer, modifier, (Function1) rememberedValue);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BadgeKt$$ExternalSyntheticLambda4(i, f, modifier, i2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* renamed from: XAxisLabels-UuyPYSY, reason: not valid java name */
    public static final void m3449XAxisLabelsUuyPYSY(List list, TextStyle textStyle, float f, boolean z, Composer composer, int i) {
        int i2;
        TextStyle textStyle2;
        int i3;
        float f2;
        float f3;
        Modifier.Companion companion;
        boolean z2;
        float f4;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(983297830);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(list) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            textStyle2 = textStyle;
            i2 |= gapComposer.changed(textStyle2) ? 32 : 16;
        } else {
            textStyle2 = textStyle;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changed(f) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer.changed(4.0f) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= gapComposer.changed(z) ? 16384 : PKIFailureInfo.certRevoked;
        }
        boolean z3 = true;
        boolean z4 = 0;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 9363) != 9362)) {
            Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
            Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(SizeKt.fillMaxWidth(companion2, 1.0f), RecyclerView.DECELERATION_RATE, 4.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 13);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m302paddingqDBjuR0$default);
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
            gapComposer.startReplaceGroup(-912822759);
            Iterator it = list.iterator();
            float f5 = RecyclerView.DECELERATION_RATE;
            float f6 = 0.0f;
            while (it.hasNext()) {
                EarningsBarViewModel earningsBarViewModel = (EarningsBarViewModel) it.next();
                if (earningsBarViewModel.isLabelVisible) {
                    gapComposer.startReplaceGroup(-1748344465);
                    if (z) {
                        gapComposer.startReplaceGroup(-1748324315);
                        Density density = (Density) gapComposer.consume(CompositionLocalsKt.LocalDensity);
                        float f7 = f6;
                        Modifier m287sizeVpY3zN4 = SizeKt.m287sizeVpY3zN4(OffsetKt.m272offsetVpY3zN4(companion2, f6, f5), density.mo231toDpGaN1DYA(Room.getSp(20)), density.mo231toDpGaN1DYA(Room.getSp(11)));
                        Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                        if (colors == null) {
                            colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, z4);
                        } else {
                            gapComposer.startReplaceGroup(-1762997739);
                            gapComposer.end(z4);
                        }
                        BoxKt.Box(ImageKt.m177backgroundbw27NRU(m287sizeVpY3zN4, colors.semantic.background.subtle, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(32.0f)), gapComposer, z4);
                        gapComposer.end(z4);
                        i3 = i2;
                        companion = companion2;
                        z2 = z4;
                        f3 = f7;
                        f4 = 4.0f;
                        f2 = RecyclerView.DECELERATION_RATE;
                    } else {
                        gapComposer.startReplaceGroup(-1747940442);
                        String str = earningsBarViewModel.label;
                        Modifier m272offsetVpY3zN4 = OffsetKt.m272offsetVpY3zN4(companion2, f6, RecyclerView.DECELERATION_RATE);
                        Object rememberedValue = gapComposer.rememberedValue();
                        if (rememberedValue == Composer.Companion.Empty) {
                            rememberedValue = new CardStudioQueries$$ExternalSyntheticLambda3(24);
                            gapComposer.updateRememberedValue(rememberedValue);
                        }
                        Modifier clearAndSetSemantics = SemanticsModifierKt.clearAndSetSemantics(m272offsetVpY3zN4, (Function1) rememberedValue);
                        int i4 = (i2 << 3) & 896;
                        companion = companion2;
                        f2 = 0.0f;
                        i3 = i2;
                        z2 = z4;
                        TextStyle textStyle3 = textStyle2;
                        f3 = f6;
                        f4 = 4.0f;
                        Room.m1165Text25TpFw(0, 0, 0, 3, i4, 0, 3832, 0L, (Composer) gapComposer, clearAndSetSemantics, textStyle3, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                        gapComposer.end(z2);
                    }
                    gapComposer.end(z2);
                } else {
                    i3 = i2;
                    f2 = f5;
                    f3 = f6;
                    companion = companion2;
                    z2 = z4;
                    f4 = 4.0f;
                    gapComposer.startReplaceGroup(-1747717893);
                    gapComposer.end(z2);
                }
                f6 = f + f4 + f3;
                textStyle2 = textStyle;
                z4 = z2;
                companion2 = companion;
                f5 = f2;
                i2 = i3;
                z3 = true;
            }
            gapComposer.end(z4);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SliderKt$$ExternalSyntheticLambda11(list, textStyle, f, z, i, 2);
        }
    }

    /* renamed from: YAxis-ziNgDLE, reason: not valid java name */
    public static final void m3450YAxisziNgDLE(List list, float f, Composer composer, int i) {
        list.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(339733010);
        int i2 = (gapComposer.changedInstance(list) ? 4 : 2) | i | (gapComposer.changed(f) ? 32 : 16);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier m277height3ABfNKs = SizeKt.m277height3ABfNKs(companion, f);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m277height3ABfNKs);
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
            gapComposer.startReplaceGroup(-699650253);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                AxisPlacement axisPlacement = (AxisPlacement) it.next();
                String str = axisPlacement.label;
                boolean changed = gapComposer.changed(axisPlacement);
                Object rememberedValue = gapComposer.rememberedValue();
                if (changed || rememberedValue == Composer.Companion.Empty) {
                    rememberedValue = new CheckDepositAmountKt$$ExternalSyntheticLambda8(axisPlacement, 21);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                YAxisLabel(0, gapComposer, ValueInsets.layout(companion, (Function3) rememberedValue), str);
            }
            gapComposer.end(false);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ChartWithYAxisKt$$ExternalSyntheticLambda6(list, f, i, 0);
        }
    }

    public static final void YAxisLabel(int i, Composer composer, Modifier modifier, String str) {
        str.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(2124081030);
        int i2 = i | (gapComposer.changed(str) ? 4 : 2);
        if ((i & 48) == 0) {
            i2 |= gapComposer.changed(modifier) ? 32 : 16;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            TextStyle textStyle = ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).labelXSmall;
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            Room.m1165Text25TpFw(0, 0, 0, 0, i2 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, 0, 4080, colors.semantic.text.subtle, (Composer) gapComposer, modifier, textStyle, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new FormLabelKt$$ExternalSyntheticLambda0(str, modifier, i, 4, (byte) 0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v1, types: [androidx.compose.runtime.Composer, androidx.compose.runtime.GapComposer] */
    /* JADX WARN: Type inference failed for: r7v10, types: [int] */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r9v10, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v9 */
    /* renamed from: YAxisLabels-UuyPYSY, reason: not valid java name */
    public static final void m3451YAxisLabelsUuyPYSY(final ArrayList arrayList, final TextStyle textStyle, final float f, final float f2, final boolean z, Composer composer, final int i) {
        Modifier.Companion companion;
        int i2;
        boolean z2;
        ?? r9;
        ?? r15 = (GapComposer) composer;
        r15.startRestartGroup(1218976005);
        TextStyle textStyle2 = textStyle;
        int i3 = i | (r15.changedInstance(arrayList) ? 4 : 2) | (r15.changed(textStyle2) ? 32 : 16) | (r15.changed(f) ? 256 : 128) | (r15.changed(f2) ? 2048 : 1024) | (r15.changed(z) ? 16384 : PKIFailureInfo.certRevoked);
        boolean z3 = false;
        if (r15.shouldExecute(i3 & 1, (i3 & 9363) != 9362)) {
            r15.startReplaceGroup(-1090125651);
            ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(Integer.valueOf((int) (TextMeasurer.m979measurewNUYSr0$default(TextPainterKt.rememberTextMeasurer(r15), (String) it.next(), textStyle2, 0, 0L, IptcConstants.IMAGE_RESOURCE_BLOCK_OBSOLETE_PHOTOSHOP_TAG1).size >> 32)));
                textStyle2 = textStyle;
                z3 = z3;
            }
            boolean z4 = z3;
            r15.end(z4);
            Iterator it2 = arrayList2.iterator();
            if (!it2.hasNext()) {
                a$$ExternalSyntheticBUOutline0.m();
                return;
            }
            Object next = it2.next();
            if (it2.hasNext()) {
                int intValue = ((Number) next).intValue();
                do {
                    Object next2 = it2.next();
                    int intValue2 = ((Number) next2).intValue();
                    if (intValue < intValue2) {
                        next = next2;
                        intValue = intValue2;
                    }
                } while (it2.hasNext());
            }
            int intValue3 = ((Number) next).intValue();
            Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
            Modifier m277height3ABfNKs = SizeKt.m277height3ABfNKs(SpacerKt.m302paddingqDBjuR0$default(companion2, 4.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 14), f);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, z4);
            int hashCode = Long.hashCode(r15.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = r15.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(r15, m277height3ABfNKs);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (r15.applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            r15.startReusableNode();
            if (r15.inserting) {
                r15.createNode(layoutNode$Companion$Constructor$1);
            } else {
                r15.useNode();
            }
            Updater.m576setimpl(r15, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(r15, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(r15, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(r15, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(r15, materializeModifier, ComposeUiNode.Companion.SetModifier);
            r15.startReplaceGroup(-2059363658);
            ?? r7 = z4;
            for (Object obj : arrayList) {
                int i4 = r7 + 1;
                if (r7 < 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                    throw null;
                }
                String str = (String) obj;
                Modifier.Companion companion3 = companion2;
                int i5 = r7;
                int i6 = (int) (TextMeasurer.m979measurewNUYSr0$default(TextPainterKt.rememberTextMeasurer(r15), str, textStyle, 0, 0L, IptcConstants.IMAGE_RESOURCE_BLOCK_OBSOLETE_PHOTOSHOP_TAG1).size & BodyPartID.bodyIdMax);
                StaticProvidableCompositionLocal staticProvidableCompositionLocal = CompositionLocalsKt.LocalDensity;
                float mo233toDpu2uoSUM = ((f - (i5 * f2)) - (((Density) r15.consume(staticProvidableCompositionLocal)).mo233toDpu2uoSUM(i6) / 2.0f)) - 1.0f;
                if (z) {
                    r15.startReplaceGroup(-1345303899);
                    Modifier m287sizeVpY3zN4 = SizeKt.m287sizeVpY3zN4(OffsetKt.m272offsetVpY3zN4(companion3, RecyclerView.DECELERATION_RATE, mo233toDpu2uoSUM), 35.0f, ((Density) r15.consume(staticProvidableCompositionLocal)).mo231toDpGaN1DYA(Room.getSp(16)));
                    Colors colors = (Colors) r15.consume(ArcadeThemeKt.LocalColors);
                    if (colors == null) {
                        r9 = 0;
                        colors = re$$ExternalSyntheticOutline0.m((GapComposer) r15, -1762997026, (GapComposer) r15, false);
                    } else {
                        r9 = 0;
                        r15.startReplaceGroup(-1762997739);
                        r15.end(false);
                    }
                    BoxKt.Box(ImageKt.m177backgroundbw27NRU(m287sizeVpY3zN4, colors.semantic.background.subtle, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(32.0f)), r15, r9);
                    r15.end(r9);
                    i2 = i3;
                    z2 = r9;
                    companion = companion3;
                } else {
                    r15.startReplaceGroup(-1344999417);
                    Modifier m290width3ABfNKs = SizeKt.m290width3ABfNKs(OffsetKt.m272offsetVpY3zN4(companion3, RecyclerView.DECELERATION_RATE, mo233toDpu2uoSUM), ((Density) r15.consume(staticProvidableCompositionLocal)).mo233toDpu2uoSUM(intValue3));
                    Object rememberedValue = r15.rememberedValue();
                    if (rememberedValue == Composer.Companion.Empty) {
                        rememberedValue = new CardStudioQueries$$ExternalSyntheticLambda3(25);
                        r15.updateRememberedValue(rememberedValue);
                    }
                    int i7 = (i3 << 3) & 896;
                    companion = companion3;
                    i2 = i3;
                    z2 = false;
                    Room.m1165Text25TpFw(0, 0, 0, 6, i7, 0, 3832, 0L, (Composer) r15, SemanticsModifierKt.clearAndSetSemantics(m290width3ABfNKs, (Function1) rememberedValue), textStyle, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                    r15.end(false);
                }
                z4 = z2;
                r7 = i4;
                companion2 = companion;
                i3 = i2;
            }
            r15.end(z4);
            r15.end(true);
        } else {
            r15.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = r15.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new Function2(arrayList, textStyle, f, f2, z, i) { // from class: com.squareup.cash.charting.components.EarningsBarChartKt$$ExternalSyntheticLambda15
                public final /* synthetic */ ArrayList f$0;
                public final /* synthetic */ TextStyle f$1;
                public final /* synthetic */ float f$2;
                public final /* synthetic */ float f$3;
                public final /* synthetic */ boolean f$4;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int updateChangedFlags = Updater.updateChangedFlags(1);
                    BarChartKt.m3451YAxisLabelsUuyPYSY(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, (Composer) obj2, updateChangedFlags);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final int measureLabel(SubcomposeMeasureScope subcomposeMeasureScope, String str, String str2) {
        subcomposeMeasureScope.getClass();
        str.getClass();
        return ((Measurable) CollectionsKt.first(subcomposeMeasureScope.subcompose("measure-".concat(str2), new ComposableLambdaImpl(new ConfirmBackOfCheckKt$$ExternalSyntheticLambda6(str, 22), true, -1186566951)))).mo833measureBRTryo0(ConstraintsKt.Constraints$default(0, 0, 0, 0, 15)).height;
    }

    public static final LineChartSelectionState rememberLineChartSelectionState(LineChartSelectionState$SelectionBehavior$None lineChartSelectionState$SelectionBehavior$None, Composer composer, int i) {
        if ((i & 1) != 0) {
            lineChartSelectionState$SelectionBehavior$None = LineChartSelectionState$SelectionBehavior$None.INSTANCE;
        }
        GapComposer gapComposer = (GapComposer) composer;
        Object rememberedValue = gapComposer.rememberedValue();
        if (rememberedValue == Composer.Companion.Empty) {
            rememberedValue = new LineChartSelectionState(lineChartSelectionState$SelectionBehavior$None, null);
            gapComposer.updateRememberedValue(rememberedValue);
        }
        return (LineChartSelectionState) rememberedValue;
    }

    /* renamed from: toPx-8Feqmps, reason: not valid java name */
    public static final float m3452toPx8Feqmps(float f, Composer composer) {
        return ((Density) ((GapComposer) composer).consume(CompositionLocalsKt.LocalDensity)).mo236toPx0680j_4(f);
    }
}
