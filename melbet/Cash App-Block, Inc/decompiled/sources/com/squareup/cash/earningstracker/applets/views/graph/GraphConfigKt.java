package com.squareup.cash.earningstracker.applets.views.graph;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.ParcelableSnapshotMutableFloatState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.ValueInsets;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.molecule.PlatformKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.earningstracker.applets.viewmodels.AxisFreeBarViewModel;
import com.squareup.cash.earningstracker.applets.viewmodels.BarColor;
import com.squareup.cash.wallet.views.HeroCardViewKt$$ExternalSyntheticLambda33;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.enums.EnumEntriesList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.ArrayIterator;
import kotlin.text.StringsKt__IndentKt;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes6.dex */
public abstract class GraphConfigKt {
    public static final GraphConfig DEFAULT_GRAPH_CONFIG = new GraphConfig();

    public static final void AxisFreeGraph(final ArrayList arrayList, final Modifier modifier, GraphConfig graphConfig, Composer composer, final int i) {
        final GraphConfig graphConfig2;
        long j;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-2010533687);
        Applier applier = gapComposer.applier;
        int currentMarker = gapComposer.getCurrentMarker();
        int i2 = i | (gapComposer.changedInstance(arrayList) ? 4 : 2) | MLKEMEngine.KyberPolyBytes;
        boolean z = true;
        boolean z2 = false;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            Iterator it = arrayList.iterator();
            if (!it.hasNext()) {
                a$$ExternalSyntheticBUOutline0.m();
                return;
            }
            Long valueOf = Long.valueOf(((AxisFreeBarViewModel) it.next()).value);
            while (it.hasNext()) {
                Long valueOf2 = Long.valueOf(((AxisFreeBarViewModel) it.next()).value);
                if (valueOf.compareTo(valueOf2) < 0) {
                    valueOf = valueOf2;
                }
            }
            if (valueOf.longValue() <= 0) {
                valueOf = null;
            }
            long longValue = valueOf != null ? valueOf.longValue() : 1L;
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (rememberedValue == neverEqualPolicy) {
                rememberedValue = Recorder$$ExternalSyntheticOutline2.m(RecyclerView.DECELERATION_RATE, gapComposer);
            }
            MutableFloatState mutableFloatState = (MutableFloatState) rememberedValue;
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(SizeKt.m277height3ABfNKs(modifier, 24.0f), 1.0f);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new HeroCardViewKt$$ExternalSyntheticLambda33(mutableFloatState, 17);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            Modifier onGloballyPositioned = ValueInsets.onGloballyPositioned(fillMaxWidth, (Function1) rememberedValue2);
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.SpaceBetween, Alignment.Companion.Bottom, gapComposer, 54);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, onGloballyPositioned);
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
            Updater.m576setimpl(gapComposer, rowMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            gapComposer.startReplaceGroup(-1284248375);
            ParcelableSnapshotMutableFloatState parcelableSnapshotMutableFloatState = (ParcelableSnapshotMutableFloatState) mutableFloatState;
            float floatValue = parcelableSnapshotMutableFloatState.getFloatValue();
            graphConfig2 = DEFAULT_GRAPH_CONFIG;
            if (floatValue <= RecyclerView.DECELERATION_RATE) {
                gapComposer.endToMarker(currentMarker);
                RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                    final int i3 = 0;
                    endRestartGroup.block = new Function2(arrayList, modifier, graphConfig2, i, i3) { // from class: com.squareup.cash.earningstracker.applets.views.graph.AxisFreeGraphKt$$ExternalSyntheticLambda1
                        public final /* synthetic */ int $r8$classId;
                        public final /* synthetic */ ArrayList f$0;
                        public final /* synthetic */ Modifier f$1;
                        public final /* synthetic */ GraphConfig f$2;

                        {
                            this.$r8$classId = i3;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            int i4 = this.$r8$classId;
                            GraphConfig graphConfig3 = this.f$2;
                            Modifier modifier2 = this.f$1;
                            ArrayList arrayList2 = this.f$0;
                            Composer composer2 = (Composer) obj;
                            ((Integer) obj2).getClass();
                            switch (i4) {
                                case 0:
                                    GraphConfigKt.AxisFreeGraph(arrayList2, modifier2, graphConfig3, composer2, Updater.updateChangedFlags(49));
                                    break;
                                default:
                                    GraphConfigKt.AxisFreeGraph(arrayList2, modifier2, graphConfig3, composer2, Updater.updateChangedFlags(49));
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    return;
                }
                return;
            }
            float m3523toPx8Feqmps = m3523toPx8Feqmps(4.0f, gapComposer) * (arrayList.size() - 1);
            if (m3523toPx8Feqmps > parcelableSnapshotMutableFloatState.getFloatValue()) {
                a$$ExternalSyntheticBUOutline0.m$3(StringsKt__IndentKt.replaceIndent("\n            The total spacing (" + m3523toPx8Feqmps + ") between the bars is bigger than \n            the available space (" + parcelableSnapshotMutableFloatState.getFloatValue() + ") for graph (bars + spacing). \n            Tip: Increase the graph width or/and Reduce the barSpacing or/and Reduce the data points. \n        "));
                return;
            }
            float floatValue2 = (parcelableSnapshotMutableFloatState.getFloatValue() - m3523toPx8Feqmps) / arrayList.size();
            gapComposer.startReplaceGroup(1066971321);
            EnumEntriesList enumEntriesList = BarColor.$ENTRIES;
            int mapCapacity = MapsKt__MapsJVMKt.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(enumEntriesList, 10));
            if (mapCapacity < 16) {
                mapCapacity = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(mapCapacity);
            ArrayIterator arrayIterator = new ArrayIterator(enumEntriesList);
            while (arrayIterator.hasNext()) {
                Object next = arrayIterator.next();
                int ordinal = ((BarColor) next).ordinal();
                if (ordinal == 0) {
                    gapComposer.startReplaceGroup(949675011);
                    Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                    if (colors == null) {
                        colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                    } else {
                        gapComposer.startReplaceGroup(-1762997739);
                        gapComposer.end(false);
                    }
                    j = colors.semantic.background.brand;
                    gapComposer.end(false);
                } else if (ordinal == 1) {
                    gapComposer.startReplaceGroup(949677352);
                    Colors colors2 = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                    if (colors2 == null) {
                        colors2 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                    } else {
                        gapComposer.startReplaceGroup(-1762997739);
                        gapComposer.end(false);
                    }
                    j = Color.m675copywmQWz5c$default(0.3f, colors2.semantic.background.brand, 14);
                    gapComposer.end(false);
                } else {
                    if (ordinal != 2) {
                        throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, 949672873, false);
                    }
                    gapComposer.startReplaceGroup(949679590);
                    Colors colors3 = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                    if (colors3 == null) {
                        colors3 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                    } else {
                        gapComposer.startReplaceGroup(-1762997739);
                        gapComposer.end(false);
                    }
                    j = colors3.semantic.background.standard;
                    gapComposer.end(false);
                }
                linkedHashMap.put(next, new Color(j));
            }
            gapComposer.end(false);
            gapComposer.startReplaceGroup(1066981081);
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                AxisFreeBarViewModel axisFreeBarViewModel = (AxisFreeBarViewModel) it2.next();
                float min = Math.min(m3523toPx8Feqmps(3.0f, gapComposer), floatValue2);
                float m3523toPx8Feqmps2 = m3523toPx8Feqmps(6.0f, gapComposer) + ((m3523toPx8Feqmps(graphConfig2.effectiveHeight, gapComposer) * axisFreeBarViewModel.value) / longValue);
                Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                Modifier fillMaxHeight = SizeKt.fillMaxHeight(companion, 1.0f);
                StaticProvidableCompositionLocal staticProvidableCompositionLocal = CompositionLocalsKt.LocalDensity;
                Modifier m290width3ABfNKs = SizeKt.m290width3ABfNKs(fillMaxHeight, ((Density) gapComposer.consume(staticProvidableCompositionLocal)).mo232toDpu2uoSUM(floatValue2));
                MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.BottomCenter, z2);
                int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
                Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, m290width3ABfNKs);
                ComposeUiNode.Companion.getClass();
                Iterator it3 = it2;
                LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
                gapComposer.startReusableNode();
                float f = floatValue2;
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
                Modifier m277height3ABfNKs = SizeKt.m277height3ABfNKs(SizeKt.fillMaxWidth(companion, 1.0f), ((Density) gapComposer.consume(staticProvidableCompositionLocal)).mo232toDpu2uoSUM(m3523toPx8Feqmps2));
                Object obj = linkedHashMap.get(axisFreeBarViewModel.color);
                obj.getClass();
                BoxKt.Box(ImageKt.m177backgroundbw27NRU(m277height3ABfNKs, ((Color) obj).value, RoundedCornerShapeKt.RoundedCornerShape(min)), gapComposer, 0);
                gapComposer.end(true);
                it2 = it3;
                z = true;
                z2 = false;
                floatValue2 = f;
            }
            boolean z3 = z2;
            Boxes$$ExternalSyntheticOutline1.m(gapComposer, z3, z3, z);
        } else {
            gapComposer.skipToGroupEnd();
            graphConfig2 = graphConfig;
        }
        RecomposeScopeImpl endRestartGroup2 = gapComposer.endRestartGroup();
        if (endRestartGroup2 != null) {
            final int i4 = 1;
            endRestartGroup2.block = new Function2(arrayList, modifier, graphConfig2, i, i4) { // from class: com.squareup.cash.earningstracker.applets.views.graph.AxisFreeGraphKt$$ExternalSyntheticLambda1
                public final /* synthetic */ int $r8$classId;
                public final /* synthetic */ ArrayList f$0;
                public final /* synthetic */ Modifier f$1;
                public final /* synthetic */ GraphConfig f$2;

                {
                    this.$r8$classId = i4;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj22) {
                    int i42 = this.$r8$classId;
                    GraphConfig graphConfig3 = this.f$2;
                    Modifier modifier2 = this.f$1;
                    ArrayList arrayList2 = this.f$0;
                    Composer composer2 = (Composer) obj2;
                    ((Integer) obj22).getClass();
                    switch (i42) {
                        case 0:
                            GraphConfigKt.AxisFreeGraph(arrayList2, modifier2, graphConfig3, composer2, Updater.updateChangedFlags(49));
                            break;
                        default:
                            GraphConfigKt.AxisFreeGraph(arrayList2, modifier2, graphConfig3, composer2, Updater.updateChangedFlags(49));
                            break;
                    }
                    return Unit.INSTANCE;
                }
            };
        }
    }

    /* renamed from: toPx-8Feqmps, reason: not valid java name */
    public static final float m3523toPx8Feqmps(float f, Composer composer) {
        return ((Density) ((GapComposer) composer).consume(CompositionLocalsKt.LocalDensity)).mo236toPx0680j_4(f);
    }
}
