package androidx.compose.material;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.FlowRowScopeInstance;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.DynamicProvidableCompositionLocal;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.SubcomposeMeasureScope;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import app.cash.local.primitives.LocationMenu$$ExternalSyntheticLambda6;
import app.cash.local.views.internal.LocalCombinedViewsKt$$ExternalSyntheticLambda3;
import app.cash.local.views.internal.LocalMapKt;
import app.cash.local.views.internal.PlacedItem;
import app.cash.local.views.internal.SlotId;
import app.cash.molecule.PlatformKt;
import bo.app.n3$$ExternalSyntheticLambda0;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.components.cell.RealCellActivityAvatarScope;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.moneybot.analytics.AnalyticsMappersKt;
import com.squareup.cash.overlays.OverlaysKt$$ExternalSyntheticLambda1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt___RangesKt;

/* loaded from: classes3.dex */
public final /* synthetic */ class AppBarKt$$ExternalSyntheticLambda4 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ ComposableLambdaImpl f$0;

    public /* synthetic */ AppBarKt$$ExternalSyntheticLambda4(int i, int i2, ComposableLambdaImpl composableLambdaImpl) {
        this.$r8$classId = i2;
        this.f$0 = composableLambdaImpl;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ArrayList arrayList;
        ArrayList arrayList2;
        long j;
        int i = this.$r8$classId;
        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
        int i2 = 29;
        float f = 1.0f;
        Object obj3 = ColumnScopeInstance.INSTANCE;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        int i3 = 2;
        int i4 = 1;
        ComposableLambdaImpl composableLambdaImpl = this.f$0;
        switch (i) {
            case 0:
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    DynamicProvidableCompositionLocal dynamicProvidableCompositionLocal = ContentAlphaKt.LocalContentAlpha;
                    long j2 = ((Color) gapComposer.consume(ContentColorKt.LocalContentColor)).value;
                    if (!((Colors) gapComposer.consume(ColorsKt.LocalColors)).isLight() ? ColorKt.m690luminance8_81llA(j2) >= 0.5d : ColorKt.m690luminance8_81llA(j2) <= 0.5d) {
                        f = 0.87f;
                    }
                    Updater.CompositionLocalProvider(dynamicProvidableCompositionLocal.defaultProvidedValue$runtime(Float.valueOf(f)), composableLambdaImpl, gapComposer, 8);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 1:
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                    composableLambdaImpl.invoke(FlowRowScopeInstance.INSTANCE, (Object) gapComposer2, (Object) 6);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 2:
                ((Integer) obj2).getClass();
                LazyLayoutKt.LazySaveableStateHolderProvider(composableLambdaImpl, (Composer) obj, Updater.updateChangedFlags(7));
                return Unit.INSTANCE;
            case 3:
                Composer composer3 = (Composer) obj;
                int intValue3 = ((Integer) obj2).intValue();
                GapComposer gapComposer3 = (GapComposer) composer3;
                if (gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2)) {
                    Modifier fillMaxHeight = SizeKt.fillMaxHeight(companion, 1.0f);
                    RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.End, Alignment.Companion.CenterVertically, gapComposer3, 54);
                    int currentCompositeKeyHash = Updater.getCurrentCompositeKeyHash(gapComposer3);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer3.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer3, fillMaxHeight);
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
                    Updater.m576setimpl(gapComposer3, rowMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer3, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetCompositeKeyHash;
                    if (gapComposer3.inserting || !Intrinsics.areEqual(gapComposer3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        Recorder$$ExternalSyntheticOutline1.m(currentCompositeKeyHash, gapComposer3, currentCompositeKeyHash, composeUiNode$Companion$SetModifier$1);
                    }
                    Updater.m576setimpl(gapComposer3, materializeModifier, ComposeUiNode.Companion.SetModifier);
                    composableLambdaImpl.invoke((Object) rowScopeInstance, (Object) gapComposer3, (Object) 6);
                    gapComposer3.end(true);
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 4:
                Composer composer4 = (Composer) obj;
                int intValue4 = ((Integer) obj2).intValue();
                GapComposer gapComposer4 = (GapComposer) composer4;
                if (gapComposer4.shouldExecute(intValue4 & 1, (intValue4 & 3) != 2)) {
                    CardKt.PlatformMaterialTheme(composableLambdaImpl, gapComposer4, 0);
                } else {
                    gapComposer4.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 5:
                ((Integer) obj2).getClass();
                CardKt.PlatformMaterialTheme(composableLambdaImpl, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 6:
                SubcomposeMeasureScope subcomposeMeasureScope = (SubcomposeMeasureScope) obj;
                Constraints constraints = (Constraints) obj2;
                subcomposeMeasureScope.getClass();
                int m1025getMaxWidthimpl = Constraints.m1025getMaxWidthimpl(constraints.value);
                long j3 = constraints.value;
                long Constraints$default = ConstraintsKt.Constraints$default(0, m1025getMaxWidthimpl, 0, Constraints.m1024getMaxHeightimpl(j3), 5);
                List subcompose = subcomposeMeasureScope.subcompose(SlotId.Content, composableLambdaImpl);
                ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(subcompose, 10));
                Iterator it = subcompose.iterator();
                while (it.hasNext()) {
                    arrayList3.add(((Measurable) it.next()).mo833measureBRTryo0(Constraints$default));
                }
                if (arrayList3.isEmpty()) {
                    return MeasureScope.layout$default(subcomposeMeasureScope, Constraints.m1027getMinWidthimpl(j3), Constraints.m1026getMinHeightimpl(j3), new LocationMenu$$ExternalSyntheticLambda6(i2));
                }
                List subcompose2 = subcomposeMeasureScope.subcompose(SlotId.Separators, new ComposableLambdaImpl(new LocalCombinedViewsKt$$ExternalSyntheticLambda3(arrayList3.size() - 1, null == true ? 1 : 0), true, -533136275));
                ArrayList arrayList4 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(subcompose2, 10));
                Iterator it2 = subcompose2.iterator();
                while (it2.hasNext()) {
                    arrayList4.add(((Measurable) it2.next()).mo833measureBRTryo0(Constraints$default));
                }
                ArrayList arrayList5 = new ArrayList();
                ArrayList arrayList6 = new ArrayList();
                ArrayList arrayList7 = new ArrayList();
                int size = arrayList3.size();
                int i5 = 0;
                int i6 = 0;
                int i7 = 0;
                int i8 = 0;
                int i9 = 0;
                int i10 = 0;
                while (i5 < size) {
                    Placeable placeable = (Placeable) arrayList3.get(i5);
                    if (i5 > 0) {
                        arrayList = arrayList3;
                        Placeable placeable2 = (Placeable) arrayList4.get(i9);
                        arrayList2 = arrayList4;
                        j = j3;
                        if (placeable2.width + placeable.width + i7 <= Constraints.m1025getMaxWidthimpl(j) || i7 <= 0) {
                            arrayList6.add(new PlacedItem(placeable2, i7, i10));
                            i7 += placeable2.width;
                            i8 = Math.max(i8, placeable2.height);
                        } else {
                            i6 = Math.max(i6, i7);
                            arrayList7.add(Integer.valueOf(i8));
                            i10++;
                            i7 = 0;
                            i8 = 0;
                        }
                        i9++;
                    } else {
                        arrayList = arrayList3;
                        arrayList2 = arrayList4;
                        j = j3;
                    }
                    arrayList5.add(new PlacedItem(placeable, i7, i10));
                    i7 += placeable.width;
                    i8 = Math.max(i8, placeable.height);
                    i5++;
                    arrayList3 = arrayList;
                    arrayList4 = arrayList2;
                    j3 = j;
                }
                long j4 = j3;
                int max = Math.max(i6, i7);
                arrayList7.add(Integer.valueOf(i8));
                int[] iArr = new int[arrayList7.size()];
                int size2 = arrayList7.size();
                int i11 = 0;
                for (int i12 = 0; i12 < size2; i12++) {
                    int intValue5 = ((Number) arrayList7.get(i12)).intValue();
                    iArr[i12] = i11;
                    i11 += intValue5;
                }
                return MeasureScope.layout$default(subcomposeMeasureScope, RangesKt___RangesKt.coerceIn(max, Constraints.m1027getMinWidthimpl(j4), Constraints.m1025getMaxWidthimpl(j4)), RangesKt___RangesKt.coerceIn(i11, Constraints.m1026getMinHeightimpl(j4), Constraints.m1024getMaxHeightimpl(j4)), new n3$$ExternalSyntheticLambda0(arrayList5, arrayList6, arrayList7, iArr, 13));
            case 7:
                Composer composer5 = (Composer) obj;
                int intValue6 = ((Integer) obj2).intValue();
                GapComposer gapComposer5 = (GapComposer) composer5;
                if (gapComposer5.shouldExecute(intValue6 & 1, (intValue6 & 3) != 2)) {
                    composableLambdaImpl.invoke(obj3, (Object) gapComposer5, (Object) 0);
                } else {
                    gapComposer5.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 8:
                Composer composer6 = (Composer) obj;
                int intValue7 = ((Integer) obj2).intValue();
                GapComposer gapComposer6 = (GapComposer) composer6;
                if (gapComposer6.shouldExecute(intValue7 & 1, (intValue7 & 3) != 2)) {
                    Modifier weight = rowScopeInstance.weight(1.0f, companion, true);
                    RowMeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(SpacerKt.Start, Alignment.Companion.CenterVertically, gapComposer6, 48);
                    int hashCode = Long.hashCode(gapComposer6.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer6.currentCompositionLocalScope();
                    Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer6, weight);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer6.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer6.startReusableNode();
                    if (gapComposer6.inserting) {
                        gapComposer6.createNode(layoutNode$Companion$Constructor$12);
                    } else {
                        gapComposer6.useNode();
                    }
                    Updater.m576setimpl(gapComposer6, rowMeasurePolicy2, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer6, currentCompositionLocalScope2, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer6, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer6, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer6, materializeModifier2, ComposeUiNode.Companion.SetModifier);
                    composableLambdaImpl.invoke((Object) rowScopeInstance, (Object) gapComposer6, (Object) 6);
                    gapComposer6.end(true);
                } else {
                    gapComposer6.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 9:
                ((Integer) obj2).getClass();
                LocalMapKt.LocalExpandedHeader(composableLambdaImpl, (Composer) obj, Updater.updateChangedFlags(7));
                return Unit.INSTANCE;
            case 10:
                Composer composer7 = (Composer) obj;
                int intValue8 = ((Integer) obj2).intValue();
                GapComposer gapComposer7 = (GapComposer) composer7;
                if (gapComposer7.shouldExecute(intValue8 & 1, (intValue8 & 3) != 2)) {
                    composableLambdaImpl.invoke((Object) gapComposer7, (Object) 0);
                } else {
                    gapComposer7.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 11:
                Composer composer8 = (Composer) obj;
                int intValue9 = ((Integer) obj2).intValue();
                GapComposer gapComposer8 = (GapComposer) composer8;
                if (gapComposer8.shouldExecute(intValue9 & 1, (intValue9 & 3) != 2)) {
                    StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalTextColor;
                    com.squareup.cash.arcade.Colors colors = (com.squareup.cash.arcade.Colors) gapComposer8.consume(ArcadeThemeKt.LocalColors);
                    if (colors == null) {
                        colors = re$$ExternalSyntheticOutline0.m(gapComposer8, -1762997026, gapComposer8, false);
                    } else {
                        gapComposer8.startReplaceGroup(-1762997739);
                        gapComposer8.end(false);
                    }
                    Updater.CompositionLocalProvider(new ProvidedValue[]{re$$ExternalSyntheticOutline0.m(colors.semantic.text.subtle, staticProvidableCompositionLocal), ArcadeThemeKt.LocalTextStyle.defaultProvidedValue$runtime(TextStyle.m994copyp1EtxEg$default(((com.squareup.cash.arcade.Typography) gapComposer8.consume(ArcadeThemeKt.LocalTypography)).labelMedium, 0L, 0L, null, null, 0L, null, 0L, TextDecoration.LineThrough, null, null, 0, 0L, null, null, 0, 16773119))}, Expect_jvmKt.rememberComposableLambda(276333721, new AppBarKt$$ExternalSyntheticLambda4(composableLambdaImpl, 14), gapComposer8), gapComposer8, 56);
                } else {
                    gapComposer8.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 12:
                Composer composer9 = (Composer) obj;
                int intValue10 = ((Integer) obj2).intValue();
                GapComposer gapComposer9 = (GapComposer) composer9;
                if (gapComposer9.shouldExecute(intValue10 & 1, (intValue10 & 3) != 2)) {
                    StaticProvidableCompositionLocal staticProvidableCompositionLocal2 = ArcadeThemeKt.LocalTextColor;
                    com.squareup.cash.arcade.Colors colors2 = (com.squareup.cash.arcade.Colors) gapComposer9.consume(ArcadeThemeKt.LocalColors);
                    if (colors2 == null) {
                        colors2 = re$$ExternalSyntheticOutline0.m(gapComposer9, -1762997026, gapComposer9, false);
                    } else {
                        gapComposer9.startReplaceGroup(-1762997739);
                        gapComposer9.end(false);
                    }
                    Updater.CompositionLocalProvider(new ProvidedValue[]{re$$ExternalSyntheticOutline0.m(colors2.semantic.text.subtle, staticProvidableCompositionLocal2), ArcadeThemeKt.LocalTextStyle.defaultProvidedValue$runtime(((com.squareup.cash.arcade.Typography) gapComposer9.consume(ArcadeThemeKt.LocalTypography)).labelMedium)}, Expect_jvmKt.rememberComposableLambda(1296372302, new AppBarKt$$ExternalSyntheticLambda4(composableLambdaImpl, 16), gapComposer9), gapComposer9, 56);
                } else {
                    gapComposer9.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 13:
                Composer composer10 = (Composer) obj;
                int intValue11 = ((Integer) obj2).intValue();
                GapComposer gapComposer10 = (GapComposer) composer10;
                if (gapComposer10.shouldExecute(intValue11 & 1, (intValue11 & 3) != 2)) {
                    StaticProvidableCompositionLocal staticProvidableCompositionLocal3 = ArcadeThemeKt.LocalTextColor;
                    com.squareup.cash.arcade.Colors colors3 = (com.squareup.cash.arcade.Colors) gapComposer10.consume(ArcadeThemeKt.LocalColors);
                    if (colors3 == null) {
                        colors3 = re$$ExternalSyntheticOutline0.m(gapComposer10, -1762997026, gapComposer10, false);
                    } else {
                        gapComposer10.startReplaceGroup(-1762997739);
                        gapComposer10.end(false);
                    }
                    Updater.CompositionLocalProvider(new ProvidedValue[]{re$$ExternalSyntheticOutline0.m(colors3.semantic.text.standard, staticProvidableCompositionLocal3), ArcadeThemeKt.LocalTextStyle.defaultProvidedValue$runtime(((com.squareup.cash.arcade.Typography) gapComposer10.consume(ArcadeThemeKt.LocalTypography)).labelMedium)}, Expect_jvmKt.rememberComposableLambda(729847645, new AppBarKt$$ExternalSyntheticLambda4(composableLambdaImpl, 15), gapComposer10), gapComposer10, 56);
                } else {
                    gapComposer10.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 14:
                Composer composer11 = (Composer) obj;
                int intValue12 = ((Integer) obj2).intValue();
                GapComposer gapComposer11 = (GapComposer) composer11;
                if (gapComposer11.shouldExecute(intValue12 & 1, (intValue12 & 3) != 2)) {
                    composableLambdaImpl.invoke((Object) gapComposer11, (Object) 0);
                } else {
                    gapComposer11.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 15:
                Composer composer12 = (Composer) obj;
                int intValue13 = ((Integer) obj2).intValue();
                GapComposer gapComposer12 = (GapComposer) composer12;
                if (gapComposer12.shouldExecute(intValue13 & 1, (intValue13 & 3) != 2)) {
                    composableLambdaImpl.invoke((Object) gapComposer12, (Object) 0);
                } else {
                    gapComposer12.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 16:
                Composer composer13 = (Composer) obj;
                int intValue14 = ((Integer) obj2).intValue();
                GapComposer gapComposer13 = (GapComposer) composer13;
                if (gapComposer13.shouldExecute(intValue14 & 1, (intValue14 & 3) != 2)) {
                    composableLambdaImpl.invoke((Object) gapComposer13, (Object) 0);
                } else {
                    gapComposer13.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 17:
                Composer composer14 = (Composer) obj;
                int intValue15 = ((Integer) obj2).intValue();
                GapComposer gapComposer14 = (GapComposer) composer14;
                if (gapComposer14.shouldExecute(intValue15 & 1, (intValue15 & 3) != 2)) {
                    composableLambdaImpl.invoke((Object) gapComposer14, (Object) 0);
                } else {
                    gapComposer14.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 18:
                ((Integer) obj2).getClass();
                AnalyticsMappersKt.TrailingContentBackground(composableLambdaImpl, (Composer) obj, Updater.updateChangedFlags(7));
                return Unit.INSTANCE;
            case 19:
                Composer composer15 = (Composer) obj;
                int intValue16 = ((Integer) obj2).intValue();
                GapComposer gapComposer15 = (GapComposer) composer15;
                if (gapComposer15.shouldExecute(intValue16 & 1, (intValue16 & 3) != 2)) {
                    composableLambdaImpl.invoke((Object) gapComposer15, (Object) 0);
                } else {
                    gapComposer15.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 20:
                Composer composer16 = (Composer) obj;
                int intValue17 = ((Integer) obj2).intValue();
                GapComposer gapComposer16 = (GapComposer) composer16;
                if (gapComposer16.shouldExecute(intValue17 & 1, (intValue17 & 3) != 2)) {
                    composableLambdaImpl.invoke((Object) gapComposer16, (Object) 0);
                } else {
                    gapComposer16.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 21:
                Composer composer17 = (Composer) obj;
                int intValue18 = ((Integer) obj2).intValue();
                GapComposer gapComposer17 = (GapComposer) composer17;
                if (gapComposer17.shouldExecute(intValue18 & 1, (intValue18 & 3) != 2)) {
                    composableLambdaImpl.invoke(obj3, (Object) gapComposer17, (Object) 0);
                } else {
                    gapComposer17.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 22:
                Composer composer18 = (Composer) obj;
                int intValue19 = ((Integer) obj2).intValue();
                GapComposer gapComposer18 = (GapComposer) composer18;
                if (gapComposer18.shouldExecute(intValue19 & 1, (intValue19 & 3) != 2)) {
                    composableLambdaImpl.invoke(obj3, (Object) gapComposer18, (Object) 0);
                } else {
                    gapComposer18.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 23:
                Composer composer19 = (Composer) obj;
                int intValue20 = ((Integer) obj2).intValue();
                GapComposer gapComposer19 = (GapComposer) composer19;
                if (gapComposer19.shouldExecute(intValue20 & 1, (intValue20 & 3) != 2)) {
                    composableLambdaImpl.invoke((Object) gapComposer19, (Object) 0);
                } else {
                    gapComposer19.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 24:
                Composer composer20 = (Composer) obj;
                int intValue21 = ((Integer) obj2).intValue();
                GapComposer gapComposer20 = (GapComposer) composer20;
                if (gapComposer20.shouldExecute(intValue21 & 1, (intValue21 & 3) != 2)) {
                    ((DefaultSizes) gapComposer20.consume(ArcadeThemeKt.LocalSizes)).getClass();
                    DefaultSizes.spacing.getClass();
                    Modifier m298padding3ABfNKs = SpacerKt.m298padding3ABfNKs(companion, 16.0f);
                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
                    int hashCode2 = Long.hashCode(gapComposer20.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer20.currentCompositionLocalScope();
                    Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer20, m298padding3ABfNKs);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$13 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer20.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer20.startReusableNode();
                    if (gapComposer20.inserting) {
                        gapComposer20.createNode(layoutNode$Companion$Constructor$13);
                    } else {
                        gapComposer20.useNode();
                    }
                    Updater.m576setimpl(gapComposer20, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer20, currentCompositionLocalScope3, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer20, Integer.valueOf(hashCode2), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer20, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer20, materializeModifier3, ComposeUiNode.Companion.SetModifier);
                    composableLambdaImpl.invoke(BoxScopeInstance.INSTANCE, (Object) gapComposer20, (Object) 6);
                    gapComposer20.end(true);
                } else {
                    gapComposer20.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 25:
                Composer composer21 = (Composer) obj;
                int intValue22 = ((Integer) obj2).intValue();
                GapComposer gapComposer21 = (GapComposer) composer21;
                if (gapComposer21.shouldExecute(intValue22 & 1, (intValue22 & 3) != 2)) {
                    MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
                    int hashCode3 = Long.hashCode(gapComposer21.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope4 = gapComposer21.currentCompositionLocalScope();
                    Modifier materializeModifier4 = PlatformKt.materializeModifier(gapComposer21, companion);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$14 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer21.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer21.startReusableNode();
                    if (gapComposer21.inserting) {
                        gapComposer21.createNode(layoutNode$Companion$Constructor$14);
                    } else {
                        gapComposer21.useNode();
                    }
                    Updater.m576setimpl(gapComposer21, maybeCachedBoxMeasurePolicy2, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer21, currentCompositionLocalScope4, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer21, Integer.valueOf(hashCode3), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer21, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer21, materializeModifier4, ComposeUiNode.Companion.SetModifier);
                    composableLambdaImpl.invoke(RealCellActivityAvatarScope.INSTANCE, (Object) gapComposer21, (Object) 6);
                    gapComposer21.end(true);
                } else {
                    gapComposer21.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 26:
                Composer composer22 = (Composer) obj;
                int intValue23 = ((Integer) obj2).intValue();
                GapComposer gapComposer22 = (GapComposer) composer22;
                if (gapComposer22.shouldExecute(intValue23 & 1, (intValue23 & 3) != 2)) {
                    StaticProvidableCompositionLocal staticProvidableCompositionLocal4 = ArcadeThemeKt.LocalTextColor;
                    com.squareup.cash.arcade.Colors colors4 = (com.squareup.cash.arcade.Colors) gapComposer22.consume(ArcadeThemeKt.LocalColors);
                    if (colors4 == null) {
                        colors4 = re$$ExternalSyntheticOutline0.m(gapComposer22, -1762997026, gapComposer22, false);
                    } else {
                        gapComposer22.startReplaceGroup(-1762997739);
                        gapComposer22.end(false);
                    }
                    Updater.CompositionLocalProvider(new ProvidedValue[]{re$$ExternalSyntheticOutline0.m(colors4.semantic.text.subtle, staticProvidableCompositionLocal4), ArcadeThemeKt.LocalTextStyle.defaultProvidedValue$runtime(((com.squareup.cash.arcade.Typography) gapComposer22.consume(ArcadeThemeKt.LocalTypography)).labelMedium)}, Expect_jvmKt.rememberComposableLambda(-1013725363, new OverlaysKt$$ExternalSyntheticLambda1(composableLambdaImpl, i3), gapComposer22), gapComposer22, 56);
                } else {
                    gapComposer22.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 27:
                Composer composer23 = (Composer) obj;
                int intValue24 = ((Integer) obj2).intValue();
                GapComposer gapComposer23 = (GapComposer) composer23;
                if (gapComposer23.shouldExecute(intValue24 & 1, (intValue24 & 3) != 2)) {
                    StaticProvidableCompositionLocal staticProvidableCompositionLocal5 = ArcadeThemeKt.LocalTextColor;
                    com.squareup.cash.arcade.Colors colors5 = (com.squareup.cash.arcade.Colors) gapComposer23.consume(ArcadeThemeKt.LocalColors);
                    if (colors5 == null) {
                        colors5 = re$$ExternalSyntheticOutline0.m(gapComposer23, -1762997026, gapComposer23, false);
                    } else {
                        gapComposer23.startReplaceGroup(-1762997739);
                        gapComposer23.end(false);
                    }
                    Updater.CompositionLocalProvider(new ProvidedValue[]{re$$ExternalSyntheticOutline0.m(colors5.semantic.text.standard, staticProvidableCompositionLocal5), ArcadeThemeKt.LocalTextStyle.defaultProvidedValue$runtime(((com.squareup.cash.arcade.Typography) gapComposer23.consume(ArcadeThemeKt.LocalTypography)).labelMedium)}, Expect_jvmKt.rememberComposableLambda(-1919210788, new AppBarKt$$ExternalSyntheticLambda4(composableLambdaImpl, i2), gapComposer23), gapComposer23, 56);
                } else {
                    gapComposer23.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 28:
                Composer composer24 = (Composer) obj;
                int intValue25 = ((Integer) obj2).intValue();
                GapComposer gapComposer24 = (GapComposer) composer24;
                if (gapComposer24.shouldExecute(intValue25 & 1, (intValue25 & 3) != 2)) {
                    StaticProvidableCompositionLocal staticProvidableCompositionLocal6 = ArcadeThemeKt.LocalTextColor;
                    com.squareup.cash.arcade.Colors colors6 = (com.squareup.cash.arcade.Colors) gapComposer24.consume(ArcadeThemeKt.LocalColors);
                    if (colors6 == null) {
                        colors6 = re$$ExternalSyntheticOutline0.m(gapComposer24, -1762997026, gapComposer24, false);
                    } else {
                        gapComposer24.startReplaceGroup(-1762997739);
                        gapComposer24.end(false);
                    }
                    Updater.CompositionLocalProvider(new ProvidedValue[]{re$$ExternalSyntheticOutline0.m(colors6.semantic.text.subtle, staticProvidableCompositionLocal6), ArcadeThemeKt.LocalTextStyle.defaultProvidedValue$runtime(TextStyle.m994copyp1EtxEg$default(((com.squareup.cash.arcade.Typography) gapComposer24.consume(ArcadeThemeKt.LocalTypography)).labelMedium, 0L, 0L, null, null, 0L, null, 0L, TextDecoration.LineThrough, null, null, 0, 0L, null, null, 0, 16773119))}, Expect_jvmKt.rememberComposableLambda(1191186968, new OverlaysKt$$ExternalSyntheticLambda1(composableLambdaImpl, i4), gapComposer24), gapComposer24, 56);
                } else {
                    gapComposer24.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            default:
                Composer composer25 = (Composer) obj;
                int intValue26 = ((Integer) obj2).intValue();
                GapComposer gapComposer25 = (GapComposer) composer25;
                if (gapComposer25.shouldExecute(intValue26 & 1, (intValue26 & 3) != 2)) {
                    composableLambdaImpl.invoke((Object) gapComposer25, (Object) 0);
                } else {
                    gapComposer25.skipToGroupEnd();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ AppBarKt$$ExternalSyntheticLambda4(ComposableLambdaImpl composableLambdaImpl, int i) {
        this.$r8$classId = i;
        this.f$0 = composableLambdaImpl;
    }
}
