package com.squareup.cash.investing.components.custom.order;

import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.ZIndexModifierKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.ValueInsets;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.text.style.TextGeometricTransformKt;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.local.views.toolbar.LocalToolbarKt$$ExternalSyntheticLambda1;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.size.DimensionKt;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.components.BadgeKt$$ExternalSyntheticLambda4;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.common.composeui.IconAnimationViewKt$$ExternalSyntheticLambda3;
import com.squareup.cash.common.viewmodels.ColorModel;
import com.squareup.cash.fidesmo.views.FidesmoProvisioningViewKt$$ExternalSyntheticLambda71;
import com.squareup.cash.gps.db.GpsConfigQueries$$ExternalSyntheticLambda2;
import com.squareup.cash.gps.db.GpsConfigQueries$$ExternalSyntheticLambda3;
import com.squareup.cash.investing.components.news.NewsArticleAdapter$$ExternalSyntheticLambda1;
import com.squareup.cash.maps.views.CashMapViewKt$$ExternalSyntheticLambda1;
import com.squareup.cash.maps.views.ClusterItemKt$$ExternalSyntheticLambda0;
import com.squareup.cash.multiplatform.investing.PriceValue;
import com.squareup.cash.music.views.TrackRowKt$$ExternalSyntheticLambda5;
import com.squareup.cash.nearby.views.PulsingState$$ExternalSyntheticLambda0;
import com.squareup.cash.pools.views.PoolCreateViewKt$$ExternalSyntheticLambda5;
import com.squareup.cash.portfolio.graphs.viewmodels.InvestingGraphContentModel;
import com.squareup.cash.portfolio.graphs.viewmodels.InvestingGraphContentModel$AccentColorType$UptoDateData;
import com.squareup.cash.support.chat.views.ChatImageDetailViewKt$$ExternalSyntheticLambda2;
import com.squareup.cash.work.views.shift.ShiftListViewKt$$ExternalSyntheticLambda8;
import com.stripe.android.uicore.elements.FormLabelKt$$ExternalSyntheticLambda0;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.ranges.IntProgressionIterator;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt___RangesKt;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes6.dex */
public abstract class CustomOrderGraphKt {
    public static final InvestingGraphContentModel.Loaded GRAPH_MODEL_720;

    static {
        IntRange until = RangesKt___RangesKt.until(500, 1024);
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(until, 10));
        IntProgressionIterator it = until.iterator();
        while (it.hasNext) {
            float nextInt = it.nextInt();
            arrayList.add(new InvestingGraphContentModel.Point(nextInt, nextInt + 100.0f, InvestingGraphContentModel.LineDashEffect.SOLID, InvestingGraphContentModel.PointTreatment.NONE, new InvestingGraphContentModel.NonComparableStringProvider(new ClusterItemKt$$ExternalSyntheticLambda0(13))));
        }
        GRAPH_MODEL_720 = new InvestingGraphContentModel.Loaded(arrayList, arrayList, 1024.0f, new InvestingGraphContentModel$AccentColorType$UptoDateData(ColorModel.Bitcoin.INSTANCE), null, null, null, null, null, 496);
    }

    public static final void ChartLines(Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1915437142);
        if (gapComposer.shouldExecute(i & 1, i != 0)) {
            for (final int i2 = 1; i2 < 10; i2++) {
                Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                if (colors == null) {
                    colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                final long j = colors.semantic.border.subtle;
                Modifier fillMaxSize = SizeKt.fillMaxSize(Modifier.Companion.$$INSTANCE, 1.0f);
                boolean changed = gapComposer.changed(i2) | gapComposer.changed(j);
                Object rememberedValue = gapComposer.rememberedValue();
                if (changed || rememberedValue == Composer.Companion.Empty) {
                    rememberedValue = new Function1() { // from class: com.squareup.cash.investing.components.custom.order.CustomOrderGraphKt$$ExternalSyntheticLambda9
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            DrawScope drawScope = (DrawScope) obj;
                            drawScope.getClass();
                            float intBitsToFloat = (Float.intBitsToFloat((int) (drawScope.mo753getSizeNHjbRc() & BodyPartID.bodyIdMax)) / 10.0f) * i2;
                            long floatToRawIntBits = (Float.floatToRawIntBits(RecyclerView.DECELERATION_RATE) << 32) | (Float.floatToRawIntBits(intBitsToFloat) & BodyPartID.bodyIdMax);
                            long floatToRawIntBits2 = (Float.floatToRawIntBits(drawScope.mo236toPx0680j_4(16.0f)) << 32) | (Float.floatToRawIntBits(intBitsToFloat) & BodyPartID.bodyIdMax);
                            float mo236toPx0680j_4 = drawScope.mo236toPx0680j_4(2.0f);
                            long j2 = j;
                            drawScope.mo729drawLineNGM6Ib0(j2, floatToRawIntBits, floatToRawIntBits2, (r23 & 8) != 0 ? 0.0f : mo236toPx0680j_4, (r23 & 16) != 0 ? 0 : 0, (r23 & 32) != 0 ? null : null, (r23 & 64) != 0 ? 1.0f : RecyclerView.DECELERATION_RATE);
                            drawScope.mo729drawLineNGM6Ib0(j2, (Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawScope.mo753getSizeNHjbRc() >> 32)) - drawScope.mo236toPx0680j_4(16.0f)) << 32) | (Float.floatToRawIntBits(intBitsToFloat) & BodyPartID.bodyIdMax), (Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawScope.mo753getSizeNHjbRc() >> 32))) << 32) | (Float.floatToRawIntBits(intBitsToFloat) & BodyPartID.bodyIdMax), (r23 & 8) != 0 ? 0.0f : drawScope.mo236toPx0680j_4(2.0f), (r23 & 16) != 0 ? 0 : 0, (r23 & 32) != 0 ? null : null, (r23 & 64) != 0 ? 1.0f : RecyclerView.DECELERATION_RATE);
                            return Unit.INSTANCE;
                        }
                    };
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                CanvasKt.Canvas(6, gapComposer, fillMaxSize, (Function1) rememberedValue);
            }
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new CashMapViewKt$$ExternalSyntheticLambda1(i, 15);
        }
    }

    public static final void CurrentPriceLine(TextGeometricTransformKt textGeometricTransformKt, float f, Function0 function0, Modifier modifier, Composer composer, int i) {
        Color m;
        long j;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(340815003);
        int i2 = i | (gapComposer.changed(textGeometricTransformKt) ? 4 : 2) | (gapComposer.changed(f) ? 32 : 16) | (gapComposer.changedInstance(function0) ? 256 : 128);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 1171) != 1170)) {
            InvestingGraphContentModel$AccentColorType$UptoDateData investingGraphContentModel$AccentColorType$UptoDateData = textGeometricTransformKt instanceof InvestingGraphContentModel$AccentColorType$UptoDateData ? (InvestingGraphContentModel$AccentColorType$UptoDateData) textGeometricTransformKt : null;
            ColorModel colorModel = investingGraphContentModel$AccentColorType$UptoDateData != null ? investingGraphContentModel$AccentColorType$UptoDateData.accentColor : null;
            if (colorModel == null) {
                gapComposer.startReplaceGroup(-82739620);
                gapComposer.end(false);
                m = null;
            } else {
                m = BalanceFeedKt$$ExternalSyntheticOutline0.m(gapComposer, 1105709637, colorModel, gapComposer, false);
            }
            if (m == null) {
                gapComposer.startReplaceGroup(1105711334);
                Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                if (colors == null) {
                    colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                j = colors.semantic.text.placeholder;
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(1105708296);
                gapComposer.end(false);
                j = m.value;
            }
            Modifier m273offsetVpY3zN4$default = OffsetKt.m273offsetVpY3zN4$default(SizeKt.fillMaxWidth(modifier, 1.0f), RecyclerView.DECELERATION_RATE, -18.0f, 1);
            boolean z = (i2 & 112) == 32;
            Object rememberedValue = gapComposer.rememberedValue();
            if (z || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new PulsingState$$ExternalSyntheticLambda0(f, 7);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Modifier offset = OffsetKt.offset(m273offsetVpY3zN4$default, (Function1) rememberedValue);
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Start, Alignment.Companion.CenterVertically, gapComposer, 48);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, offset);
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
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            m3580DashedLineiJQMabo(0, j, gapComposer, rowScopeInstance.weight(1.0f, fillMaxWidth, true));
            Colors colors2 = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors2 == null) {
                colors2 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            ArcadeThemeKt.ArcadeTheme(DimensionKt.m1468withTint4WTKRHQ(colors2, j), null, null, Expect_jvmKt.rememberComposableLambda(219561226, new ShiftListViewKt$$ExternalSyntheticLambda8(4, function0), gapComposer), gapComposer, 3072, 6);
            m3580DashedLineiJQMabo(0, j, gapComposer, rowScopeInstance.weight(1.0f, SizeKt.fillMaxWidth(companion, 1.0f), true));
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new TrackRowKt$$ExternalSyntheticLambda5(textGeometricTransformKt, f, function0, modifier, i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v5, types: [int] */
    /* JADX WARN: Type inference failed for: r14v9 */
    public static final void CustomOrderGraph(GraphState graphState, InvestingGraphContentModel investingGraphContentModel, float f, String str, String str2, Modifier modifier, Composer composer, int i, int i2) {
        Modifier modifier2;
        int i3;
        Modifier modifier3;
        GapComposer gapComposer;
        int i4;
        Modifier.Companion companion;
        ?? r14;
        NeverEqualPolicy neverEqualPolicy;
        GapComposer gapComposer2;
        NeverEqualPolicy neverEqualPolicy2;
        boolean z;
        graphState.getClass();
        investingGraphContentModel.getClass();
        str.getClass();
        str2.getClass();
        GapComposer gapComposer3 = (GapComposer) composer;
        gapComposer3.startRestartGroup(-542852941);
        int i5 = (gapComposer3.changedInstance(graphState) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i5 |= gapComposer3.changed(investingGraphContentModel) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i5 |= gapComposer3.changed(f) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i5 |= gapComposer3.changed(str) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i5 |= gapComposer3.changed(str2) ? 16384 : PKIFailureInfo.certRevoked;
        }
        int i6 = i2 & 32;
        if (i6 != 0) {
            i3 = i5 | 196608;
            modifier2 = modifier;
        } else {
            modifier2 = modifier;
            i3 = i5 | (gapComposer3.changed(modifier2) ? PKIFailureInfo.unsupportedVersion : 65536);
        }
        if (gapComposer3.shouldExecute(i3 & 1, (74899 & i3) != 74898)) {
            Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
            modifier3 = i6 != 0 ? companion2 : modifier2;
            boolean changedInstance = gapComposer3.changedInstance(graphState);
            Object rememberedValue = gapComposer3.rememberedValue();
            NeverEqualPolicy neverEqualPolicy3 = Composer.Companion.Empty;
            if (changedInstance || rememberedValue == neverEqualPolicy3) {
                rememberedValue = new GpsConfigQueries$$ExternalSyntheticLambda2(graphState, 27);
                gapComposer3.updateRememberedValue(rememberedValue);
            }
            Modifier onGloballyPositioned = ValueInsets.onGloballyPositioned(modifier3, (Function1) rememberedValue);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
            int hashCode = Long.hashCode(gapComposer3.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer3.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer3, onGloballyPositioned);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (gapComposer3.applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer3.startReusableNode();
            if (gapComposer3.inserting) {
                gapComposer3.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer3.useNode();
            }
            Updater.m576setimpl(gapComposer3, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer3, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer3, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer3, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer3, materializeModifier, ComposeUiNode.Companion.SetModifier);
            PriceLine(((i3 >> 9) & 14) | 48, gapComposer3, OffsetKt.m273offsetVpY3zN4$default(companion2, RecyclerView.DECELERATION_RATE, -18.0f, 1), str);
            SelectedPriceLine(f, ((i3 >> 3) & 112) | 6, gapComposer3, ZIndexModifierKt.zIndex(companion2, 2.0f));
            if (PriceValue.m3663equalsimpl0(graphState.currentPrice, ((PriceValue) graphState.selectedPrice$delegate.getValue()).value)) {
                i4 = i3;
                companion = companion2;
                r14 = 0;
                neverEqualPolicy = neverEqualPolicy3;
                gapComposer3.startReplaceGroup(-1106747799);
                gapComposer3.end(false);
                gapComposer2 = gapComposer3;
            } else {
                gapComposer3.startReplaceGroup(-1107000542);
                TextGeometricTransformKt accentColor = investingGraphContentModel.getAccentColor();
                float m3582pointForPricenM2_iWI = graphState.m3582pointForPricenM2_iWI(graphState.currentPrice);
                boolean changedInstance2 = gapComposer3.changedInstance(graphState);
                Object rememberedValue2 = gapComposer3.rememberedValue();
                if (changedInstance2) {
                    neverEqualPolicy2 = neverEqualPolicy3;
                } else {
                    neverEqualPolicy2 = neverEqualPolicy3;
                    if (rememberedValue2 != neverEqualPolicy2) {
                        z = false;
                        i4 = i3;
                        neverEqualPolicy = neverEqualPolicy2;
                        companion = companion2;
                        CurrentPriceLine(accentColor, m3582pointForPricenM2_iWI, (Function0) rememberedValue2, ZIndexModifierKt.zIndex(companion2, 1.0f), gapComposer3, 3072);
                        GapComposer gapComposer4 = gapComposer3;
                        gapComposer4.end(z);
                        gapComposer2 = gapComposer4;
                        r14 = z;
                    }
                }
                z = false;
                rememberedValue2 = new CustomOrderGraphKt$$ExternalSyntheticLambda1(graphState, 0);
                gapComposer3.updateRememberedValue(rememberedValue2);
                i4 = i3;
                neverEqualPolicy = neverEqualPolicy2;
                companion = companion2;
                CurrentPriceLine(accentColor, m3582pointForPricenM2_iWI, (Function0) rememberedValue2, ZIndexModifierKt.zIndex(companion2, 1.0f), gapComposer3, 3072);
                GapComposer gapComposer42 = gapComposer3;
                gapComposer42.end(z);
                gapComposer2 = gapComposer42;
                r14 = z;
            }
            ChartLines(gapComposer2, r14);
            Object rememberedValue3 = gapComposer2.rememberedValue();
            if (rememberedValue3 == neverEqualPolicy) {
                rememberedValue3 = Boxes$$ExternalSyntheticOutline1.m((int) r14, gapComposer2);
            }
            ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState = (ParcelableSnapshotMutableIntState) rememberedValue3;
            Modifier m277height3ABfNKs = SizeKt.m277height3ABfNKs(companion, parcelableSnapshotMutableIntState.getIntValue());
            Object rememberedValue4 = gapComposer2.rememberedValue();
            if (rememberedValue4 == neverEqualPolicy) {
                rememberedValue4 = new NewsArticleAdapter$$ExternalSyntheticLambda1(13);
                gapComposer2.updateRememberedValue(rememberedValue4);
            }
            Function1 function1 = (Function1) rememberedValue4;
            boolean changedInstance3 = ((i4 & 112) == 32 ? true : r14) | gapComposer2.changedInstance(graphState);
            Object rememberedValue5 = gapComposer2.rememberedValue();
            if (changedInstance3 || rememberedValue5 == neverEqualPolicy) {
                rememberedValue5 = new GpsConfigQueries$$ExternalSyntheticLambda3(20, investingGraphContentModel, graphState, parcelableSnapshotMutableIntState);
                gapComposer2.updateRememberedValue(rememberedValue5);
            }
            AndroidView_androidKt.AndroidView(function1, m277height3ABfNKs, (Function1) rememberedValue5, gapComposer2, 6, 0);
            PriceLine((i4 >> 12) & 14, gapComposer2, OffsetKt.m273offsetVpY3zN4$default(BoxScopeInstance.INSTANCE.align(companion, Alignment.Companion.BottomStart), RecyclerView.DECELERATION_RATE, 18.0f, 1), str2);
            gapComposer2.end(true);
            gapComposer = gapComposer2;
        } else {
            gapComposer3.skipToGroupEnd();
            modifier3 = modifier2;
            gapComposer = gapComposer3;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new LocalToolbarKt$$ExternalSyntheticLambda1(graphState, investingGraphContentModel, f, str, str2, modifier3, i, i2);
        }
    }

    /* renamed from: DashedLine-iJQMabo, reason: not valid java name */
    public static final void m3580DashedLineiJQMabo(int i, long j, Composer composer, Modifier modifier) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-163774796);
        int i2 = (gapComposer.changed(modifier) ? 4 : 2) | i | (gapComposer.changed(j) ? 32 : 16);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            gapComposer.startDefaults();
            if ((i & 1) != 0 && !gapComposer.getDefaultsInvalid()) {
                gapComposer.skipToGroupEnd();
            }
            gapComposer.endDefaults();
            Object rememberedValue = gapComposer.rememberedValue();
            if (rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new NewsArticleAdapter$$ExternalSyntheticLambda1(12);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            m3581Line3IgeMak(modifier, j, (Function1) rememberedValue, gapComposer, (i2 & 14) | MLKEMEngine.KyberPolyBytes | (i2 & 112), 0);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new IconAnimationViewKt$$ExternalSyntheticLambda3(i, j, modifier, 2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0057  */
    /* renamed from: Line-3IgeMak, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m3581Line3IgeMak(Modifier modifier, long j, Function1 function1, Composer composer, int i, int i2) {
        int i3;
        Function1 function12;
        long j2;
        RecomposeScopeImpl endRestartGroup;
        long j3;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1750179662);
        if ((i & 6) == 0) {
            i3 = (gapComposer.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= ((i2 & 2) == 0 && gapComposer.changed(j)) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= MLKEMEngine.KyberPolyBytes;
        } else if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            function12 = function1;
            i3 |= gapComposer.changedInstance(function12) ? 256 : 128;
            if (gapComposer.shouldExecute(i3 & 1, (i3 & 147) == 146)) {
                gapComposer.skipToGroupEnd();
                j2 = j;
            } else {
                gapComposer.startDefaults();
                int i5 = i & 1;
                NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                if (i5 == 0 || gapComposer.getDefaultsInvalid()) {
                    if ((i2 & 2) != 0) {
                        Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                        if (colors == null) {
                            colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                        } else {
                            gapComposer.startReplaceGroup(-1762997739);
                            gapComposer.end(false);
                        }
                        j3 = colors.semantic.border.subtle;
                        i3 &= -113;
                    } else {
                        j3 = j;
                    }
                    if (i4 != 0) {
                        Object rememberedValue = gapComposer.rememberedValue();
                        if (rememberedValue == neverEqualPolicy) {
                            rememberedValue = new NewsArticleAdapter$$ExternalSyntheticLambda1(11);
                            gapComposer.updateRememberedValue(rememberedValue);
                        }
                        function12 = (Function1) rememberedValue;
                    }
                } else {
                    gapComposer.skipToGroupEnd();
                    if ((i2 & 2) != 0) {
                        i3 &= -113;
                    }
                    j3 = j;
                }
                gapComposer.endDefaults();
                boolean z = ((((i3 & 112) ^ 48) > 32 && gapComposer.changed(j3)) || (i3 & 48) == 32) | ((i3 & 896) == 256);
                Object rememberedValue2 = gapComposer.rememberedValue();
                if (z || rememberedValue2 == neverEqualPolicy) {
                    rememberedValue2 = new ChatImageDetailViewKt$$ExternalSyntheticLambda2(1, j3, function12);
                    gapComposer.updateRememberedValue(rememberedValue2);
                }
                CanvasKt.Canvas(i3 & 14, gapComposer, modifier, (Function1) rememberedValue2);
                j2 = j3;
            }
            Function1 function13 = function12;
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.block = new FidesmoProvisioningViewKt$$ExternalSyntheticLambda71(modifier, j2, function13, i, i2);
                return;
            }
            return;
        }
        function12 = function1;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 147) == 146)) {
        }
        Function1 function132 = function12;
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static final void PriceLine(int i, Composer composer, Modifier modifier, String str) {
        int i2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(828293482);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changed(modifier) ? 32 : 16;
        }
        int i3 = 1;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(modifier, 1.0f);
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Start, Alignment.Companion.CenterVertically, gapComposer, 48);
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
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxWidth2 = SizeKt.fillMaxWidth(companion, 1.0f);
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            m3581Line3IgeMak(rowScopeInstance.weight(1.0f, fillMaxWidth2, true), 0L, null, gapComposer, 0, 6);
            StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalColors;
            Colors colors = (Colors) gapComposer.consume(staticProvidableCompositionLocal);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            Colors colors2 = (Colors) gapComposer.consume(staticProvidableCompositionLocal);
            if (colors2 == null) {
                colors2 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            ArcadeThemeKt.ArcadeTheme(DimensionKt.m1468withTint4WTKRHQ(colors, colors2.semantic.text.placeholder), null, null, Expect_jvmKt.rememberComposableLambda(-104198695, new PoolCreateViewKt$$ExternalSyntheticLambda5(str, i3), gapComposer), gapComposer, 3072, 6);
            m3581Line3IgeMak(rowScopeInstance.weight(1.0f, SizeKt.fillMaxWidth(companion, 1.0f), true), 0L, null, gapComposer, 0, 6);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new FormLabelKt$$ExternalSyntheticLambda0(str, modifier, i, 5, (byte) 0);
        }
    }

    public static final void SelectedPriceLine(float f, int i, Composer composer, Modifier modifier) {
        int i2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1981577836);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changed(f) ? 32 : 16;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(modifier, 1.0f);
            boolean z = (i2 & 112) == 32;
            Object rememberedValue = gapComposer.rememberedValue();
            if (z || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new PulsingState$$ExternalSyntheticLambda0(f, 6);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Modifier offset = OffsetKt.offset(fillMaxWidth, (Function1) rememberedValue);
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            m3580DashedLineiJQMabo(0, colors.semantic.border.prominent, gapComposer, offset);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BadgeKt$$ExternalSyntheticLambda4(modifier, f, i);
        }
    }
}
