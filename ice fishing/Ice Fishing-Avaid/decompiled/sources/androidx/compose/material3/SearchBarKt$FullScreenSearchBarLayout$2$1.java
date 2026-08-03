package androidx.compose.material3;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.material3.internal.BackEventProgress;
import androidx.compose.material3.internal.MutableWindowInsets;
import androidx.compose.material3.internal.SwipeEdge;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.tooling.preview.AndroidUiModes;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntRect;
import androidx.compose.ui.util.ListUtilsKt;
import androidx.compose.ui.util.MathHelpersKt;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;

/* compiled from: SearchBar.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
/* loaded from: classes.dex */
final class SearchBarKt$FullScreenSearchBarLayout$2$1 implements MeasurePolicy {
    final /* synthetic */ MutableState<BackEventProgress.InProgress> $firstInProgressValue;
    final /* synthetic */ PaddingValues $inputFieldPadding;
    final /* synthetic */ boolean $isContained;
    final /* synthetic */ MutableState<BackEventProgress.InProgress> $lastInProgressValue;
    final /* synthetic */ SearchBarState $state;
    final /* synthetic */ MutableWindowInsets $unconsumedInsets;

    SearchBarKt$FullScreenSearchBarLayout$2$1(MutableState<BackEventProgress.InProgress> mutableState, SearchBarState searchBarState, boolean z, PaddingValues paddingValues, MutableWindowInsets mutableWindowInsets, MutableState<BackEventProgress.InProgress> mutableState2) {
        this.$lastInProgressValue = mutableState;
        this.$state = searchBarState;
        this.$isContained = z;
        this.$inputFieldPadding = paddingValues;
        this.$unconsumedInsets = mutableWindowInsets;
        this.$firstInProgressValue = mutableState2;
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public /* synthetic */ int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i) {
        return MeasurePolicy.CC.$default$maxIntrinsicHeight(this, intrinsicMeasureScope, list, i);
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public /* synthetic */ int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i) {
        return MeasurePolicy.CC.$default$maxIntrinsicWidth(this, intrinsicMeasureScope, list, i);
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public /* synthetic */ int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i) {
        return MeasurePolicy.CC.$default$minIntrinsicHeight(this, intrinsicMeasureScope, list, i);
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public /* synthetic */ int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i) {
        return MeasurePolicy.CC.$default$minIntrinsicWidth(this, intrinsicMeasureScope, list, i);
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    /* renamed from: measure-3p2s80s */
    public final MeasureResult mo81measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j) {
        float transform;
        IntRect collapsedBounds;
        IntRect collapsedBounds2;
        int i;
        int lerp;
        MeasureScope measureScope2 = measureScope;
        List<? extends Measurable> list2 = list;
        final long j2 = j;
        transform = SearchBarKt.transform(this.$lastInProgressValue.getValue());
        collapsedBounds = SearchBarKt.getCollapsedBounds(this.$state);
        Integer valueOf = Integer.valueOf(collapsedBounds.getWidth());
        if (valueOf.intValue() == 0) {
            valueOf = null;
        }
        int intValue = valueOf != null ? valueOf.intValue() : measureScope2.mo522roundToPx0680j_4(SearchBarKt.getSearchBarMinWidth());
        collapsedBounds2 = SearchBarKt.getCollapsedBounds(this.$state);
        Integer valueOf2 = Integer.valueOf(collapsedBounds2.getHeight());
        Integer num = valueOf2.intValue() != 0 ? valueOf2 : null;
        int intValue2 = num != null ? num.intValue() : measureScope2.mo522roundToPx0680j_4(SearchBarDefaults.INSTANCE.m3825getInputFieldHeightD9Ej5fM());
        final int coerceAtLeast = RangesKt.coerceAtLeast(MathKt.roundToInt(Constraints.m9675getMaxWidthimpl(j2) * 0.9f), intValue);
        int coerceAtLeast2 = RangesKt.coerceAtLeast(MathKt.roundToInt(Constraints.m9674getMaxHeightimpl(j2) * 0.9f), intValue2);
        final int lerp2 = MathHelpersKt.lerp(Constraints.m9675getMaxWidthimpl(j2), coerceAtLeast, transform);
        int lerp3 = MathHelpersKt.lerp(Constraints.m9674getMaxHeightimpl(j2), coerceAtLeast2, transform);
        if (!this.$isContained) {
            lerp2 = ConstraintsKt.m9692constrainWidthK40F9xA(j2, MathHelpersKt.lerp(intValue, lerp2, this.$state.getProgress()));
            lerp3 = ConstraintsKt.m9691constrainHeightK40F9xA(j2, MathHelpersKt.lerp(intValue2, lerp3, this.$state.getProgress()));
        }
        List<? extends Measurable> list3 = list2;
        int size = list3.size();
        int i2 = 0;
        while (i2 < size) {
            Measurable measurable = list2.get(i2);
            final float f = transform;
            final int i3 = coerceAtLeast2;
            if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable), "Surface")) {
                Placeable mo8285measureBRTryo0 = measurable.mo8285measureBRTryo0(Constraints.INSTANCE.m9685fixedJhjzzOo(lerp2, lerp3));
                int lerp4 = MathHelpersKt.lerp(intValue, (lerp2 - measureScope2.mo522roundToPx0680j_4(PaddingKt.calculateStartPadding(this.$inputFieldPadding, measureScope2.getLayoutDirection()))) - measureScope2.mo522roundToPx0680j_4(PaddingKt.calculateEndPadding(this.$inputFieldPadding, measureScope2.getLayoutDirection())), this.$state.getAnimatable$material3().getValue().floatValue());
                int size2 = list3.size();
                int i4 = 0;
                while (i4 < size2) {
                    Measurable measurable2 = list2.get(i4);
                    final Placeable placeable = mo8285measureBRTryo0;
                    if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable2), "InputField")) {
                        final Placeable mo8285measureBRTryo02 = measurable2.mo8285measureBRTryo0(Constraints.INSTANCE.m9685fixedJhjzzOo(lerp4, intValue2));
                        int top = this.$unconsumedInsets.getTop(measureScope2);
                        if (this.$isContained) {
                            i = measureScope2.mo522roundToPx0680j_4(SearchBarKt.getAppBarWithSearchVerticalPadding());
                        } else {
                            i = measureScope2.mo522roundToPx0680j_4(SearchBarKt.getSearchBarVerticalPadding());
                        }
                        final int i5 = top + i;
                        final int lerp5 = MathHelpersKt.lerp(0, i5, Math.min(this.$state.getProgress(), 1 - f));
                        if (this.$isContained) {
                            lerp = measureScope2.mo522roundToPx0680j_4(SearchBarKt.getSearchBarVerticalPadding());
                        } else {
                            lerp = MathHelpersKt.lerp(0, measureScope2.mo522roundToPx0680j_4(SearchBarKt.getSearchBarVerticalPadding()), this.$state.getProgress());
                        }
                        final int i6 = lerp;
                        int height = mo8285measureBRTryo02.getHeight() + lerp5 + i6;
                        int size3 = list3.size();
                        int i7 = 0;
                        while (i7 < size3) {
                            Measurable measurable3 = list2.get(i7);
                            if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable3), "Content")) {
                                final Placeable mo8285measureBRTryo03 = measurable3.mo8285measureBRTryo0(ConstraintsKt.Constraints(lerp2, lerp2, 0, RangesKt.coerceAtLeast(lerp3 - height, 0)));
                                int m9675getMaxWidthimpl = Constraints.m9675getMaxWidthimpl(j2);
                                int m9674getMaxHeightimpl = Constraints.m9674getMaxHeightimpl(j2);
                                final MutableState<BackEventProgress.InProgress> mutableState = this.$lastInProgressValue;
                                final boolean z = this.$isContained;
                                final SearchBarState searchBarState = this.$state;
                                final MutableState<BackEventProgress.InProgress> mutableState2 = this.$firstInProgressValue;
                                return MeasureScope.CC.layout$default(measureScope, m9675getMaxWidthimpl, m9674getMaxHeightimpl, null, new Function1() { // from class: androidx.compose.material3.SearchBarKt$FullScreenSearchBarLayout$2$1$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        Unit measure_3p2s80s$lambda$5;
                                        measure_3p2s80s$lambda$5 = SearchBarKt$FullScreenSearchBarLayout$2$1.measure_3p2s80s$lambda$5(MutableState.this, f, z, searchBarState, lerp2, placeable, mo8285measureBRTryo02, lerp5, mo8285measureBRTryo03, i6, j2, coerceAtLeast, mutableState2, i3, i5, (Placeable.PlacementScope) obj);
                                        return measure_3p2s80s$lambda$5;
                                    }
                                }, 4, null);
                            }
                            i7++;
                            list2 = list;
                            j2 = j;
                        }
                        ListUtilsKt.throwNoSuchElementException("Collection contains no element matching the predicate.");
                        throw new KotlinNothingValueException();
                    }
                    i4++;
                    measureScope2 = measureScope;
                    list2 = list;
                    j2 = j;
                    mo8285measureBRTryo0 = placeable;
                }
                ListUtilsKt.throwNoSuchElementException("Collection contains no element matching the predicate.");
                throw new KotlinNothingValueException();
            }
            i2++;
            measureScope2 = measureScope;
            list2 = list;
            j2 = j;
            transform = f;
            coerceAtLeast2 = i3;
        }
        ListUtilsKt.throwNoSuchElementException("Collection contains no element matching the predicate.");
        throw new KotlinNothingValueException();
    }

    private static final int measure_3p2s80s$lambda$5$endOffsetX(BackEventProgress.InProgress inProgress, long j, Placeable.PlacementScope placementScope, int i, SearchBarState searchBarState) {
        float f;
        int mo522roundToPx0680j_4;
        IntRect collapsedBounds;
        IntRect collapsedBounds2;
        float f2;
        if (inProgress.getSwipeEdge() != SwipeEdge.Left) {
            f = SearchBarKt.SearchBarPredictiveBackMinMargin;
            mo522roundToPx0680j_4 = placementScope.mo522roundToPx0680j_4(f);
        } else {
            int m9675getMaxWidthimpl = Constraints.m9675getMaxWidthimpl(j);
            f2 = SearchBarKt.SearchBarPredictiveBackMinMargin;
            mo522roundToPx0680j_4 = (m9675getMaxWidthimpl - placementScope.mo522roundToPx0680j_4(f2)) - i;
        }
        collapsedBounds = SearchBarKt.getCollapsedBounds(searchBarState);
        int coerceAtLeast = RangesKt.coerceAtLeast(mo522roundToPx0680j_4, collapsedBounds.getRight() - i);
        collapsedBounds2 = SearchBarKt.getCollapsedBounds(searchBarState);
        return RangesKt.coerceAtMost(coerceAtLeast, collapsedBounds2.getLeft());
    }

    private static final int measure_3p2s80s$lambda$5$endOffsetY(BackEventProgress.InProgress inProgress, MutableState<BackEventProgress.InProgress> mutableState, long j, int i, Placeable.PlacementScope placementScope, int i2, SearchBarState searchBarState) {
        float f;
        float f2;
        IntRect collapsedBounds;
        float touchY = inProgress.getTouchY();
        BackEventProgress.InProgress value = mutableState.getValue();
        if (value == null) {
            return 0;
        }
        float touchY2 = touchY - value.getTouchY();
        float abs = Math.abs(touchY2) / Constraints.m9674getMaxHeightimpl(j);
        int m9674getMaxHeightimpl = (Constraints.m9674getMaxHeightimpl(j) - i) / 2;
        f = SearchBarKt.SearchBarPredictiveBackMinMargin;
        int coerceAtLeast = RangesKt.coerceAtLeast(m9674getMaxHeightimpl - placementScope.mo522roundToPx0680j_4(f), 0);
        f2 = SearchBarKt.SearchBarPredictiveBackMaxOffsetY;
        int lerp = (MathHelpersKt.lerp(0, Math.min(coerceAtLeast, placementScope.mo522roundToPx0680j_4(f2)), abs) * ((int) Math.signum(touchY2))) + i2;
        collapsedBounds = SearchBarKt.getCollapsedBounds(searchBarState);
        return RangesKt.coerceAtMost(lerp, collapsedBounds.getTop());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit measure_3p2s80s$lambda$5(MutableState mutableState, float f, final boolean z, SearchBarState searchBarState, int i, Placeable placeable, Placeable placeable2, int i2, Placeable placeable3, int i3, long j, int i4, MutableState mutableState2, int i5, int i6, Placeable.PlacementScope placementScope) {
        IntRect collapsedBounds;
        final SearchBarState searchBarState2;
        int i7;
        IntRect collapsedBounds2;
        IntRect collapsedBounds3;
        BackEventProgress.InProgress inProgress = (BackEventProgress.InProgress) mutableState.getValue();
        int lerp = MathHelpersKt.lerp(0, inProgress != null ? measure_3p2s80s$lambda$5$endOffsetX(inProgress, j, placementScope, i4, searchBarState) : 0, f);
        if (!z) {
            collapsedBounds3 = SearchBarKt.getCollapsedBounds(searchBarState);
            lerp = MathHelpersKt.lerp(collapsedBounds3.getLeft(), lerp, searchBarState.getProgress());
        }
        int i8 = lerp;
        collapsedBounds = SearchBarKt.getCollapsedBounds(searchBarState);
        float lerp2 = MathHelpersKt.lerp(IntOffset.m9864getXimpl(collapsedBounds.m9888getCenternOccac()), i8 + (i / 2.0f), searchBarState.getAnimatable$material3().getValue().floatValue());
        BackEventProgress.InProgress inProgress2 = (BackEventProgress.InProgress) mutableState.getValue();
        if (inProgress2 != null) {
            i7 = measure_3p2s80s$lambda$5$endOffsetY(inProgress2, mutableState2, j, i5, placementScope, i6, searchBarState);
            searchBarState2 = searchBarState;
        } else {
            searchBarState2 = searchBarState;
            i7 = 0;
        }
        int lerp3 = MathHelpersKt.lerp(0, i7, f);
        collapsedBounds2 = SearchBarKt.getCollapsedBounds(searchBarState2);
        int lerp4 = MathHelpersKt.lerp(collapsedBounds2.getTop(), lerp3, searchBarState2.getProgress());
        Placeable.PlacementScope.placeWithLayer$default(placementScope, placeable, i8, z ? lerp3 : lerp4, 0.0f, new Function1() { // from class: androidx.compose.material3.SearchBarKt$FullScreenSearchBarLayout$2$1$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit measure_3p2s80s$lambda$5$0;
                measure_3p2s80s$lambda$5$0 = SearchBarKt$FullScreenSearchBarLayout$2$1.measure_3p2s80s$lambda$5$0(z, searchBarState2, (GraphicsLayerScope) obj);
                return measure_3p2s80s$lambda$5$0;
            }
        }, 4, (Object) null);
        int i9 = lerp4 + i2;
        final SearchBarState searchBarState3 = searchBarState2;
        Placeable.PlacementScope.place$default(placementScope, placeable2, MathKt.roundToInt(lerp2 - (placeable2.getWidth() / 2.0f)), i9, 0.0f, 4, null);
        Placeable.PlacementScope.placeWithLayer$default(placementScope, placeable3, i8, i9 + placeable2.getHeight() + i3, 0.0f, new Function1() { // from class: androidx.compose.material3.SearchBarKt$FullScreenSearchBarLayout$2$1$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit measure_3p2s80s$lambda$5$1;
                measure_3p2s80s$lambda$5$1 = SearchBarKt$FullScreenSearchBarLayout$2$1.measure_3p2s80s$lambda$5$1(z, searchBarState3, (GraphicsLayerScope) obj);
                return measure_3p2s80s$lambda$5$1;
            }
        }, 4, (Object) null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit measure_3p2s80s$lambda$5$0(boolean z, SearchBarState searchBarState, GraphicsLayerScope graphicsLayerScope) {
        if (z) {
            graphicsLayerScope.setAlpha(searchBarState.getProgress());
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit measure_3p2s80s$lambda$5$1(boolean z, SearchBarState searchBarState, GraphicsLayerScope graphicsLayerScope) {
        float progress;
        if (z) {
            progress = searchBarState.getContentProgress$material3();
        } else {
            progress = searchBarState.getProgress();
        }
        graphicsLayerScope.setAlpha(progress);
        return Unit.INSTANCE;
    }
}
