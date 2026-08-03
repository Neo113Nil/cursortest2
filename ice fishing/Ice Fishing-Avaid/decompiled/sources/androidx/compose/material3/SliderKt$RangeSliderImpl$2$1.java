package androidx.compose.material3;

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
import androidx.compose.ui.util.ListUtilsKt;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;

/* compiled from: Slider.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
/* loaded from: classes.dex */
final class SliderKt$RangeSliderImpl$2$1 implements MeasurePolicy {
    final /* synthetic */ RangeSliderState $state;

    SliderKt$RangeSliderImpl$2$1(RangeSliderState rangeSliderState) {
        this.$state = rangeSliderState;
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit measure_3p2s80s$lambda$4(Placeable placeable, int i, int i2, Placeable placeable2, int i3, int i4, Placeable placeable3, int i5, int i6, Placeable.PlacementScope placementScope) {
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable, i, i2, 0.0f, 4, null);
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable2, i3, i4, 0.0f, 4, null);
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable3, i5, i6, 0.0f, 4, null);
        return Unit.INSTANCE;
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    /* renamed from: measure-3p2s80s */
    public final MeasureResult mo81measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j) {
        int roundToInt;
        int roundToInt2;
        long j2 = j;
        List<? extends Measurable> list2 = list;
        int size = list2.size();
        int i = 0;
        while (i < size) {
            Measurable measurable = list.get(i);
            if (LayoutIdKt.getLayoutId(measurable) == RangeSliderComponents.STARTTHUMB) {
                final Placeable mo8285measureBRTryo0 = measurable.mo8285measureBRTryo0(j2);
                int size2 = list2.size();
                int i2 = 0;
                while (i2 < size2) {
                    Measurable measurable2 = list.get(i2);
                    if (LayoutIdKt.getLayoutId(measurable2) == RangeSliderComponents.ENDTHUMB) {
                        final Placeable mo8285measureBRTryo02 = measurable2.mo8285measureBRTryo0(j2);
                        int size3 = list2.size();
                        int i3 = 0;
                        while (i3 < size3) {
                            Measurable measurable3 = list.get(i3);
                            if (LayoutIdKt.getLayoutId(measurable3) == RangeSliderComponents.TRACK) {
                                final Placeable mo8285measureBRTryo03 = measurable3.mo8285measureBRTryo0(Constraints.m9665copyZbe2FdA$default(ConstraintsKt.m9695offsetNN6EwU$default(j2, (-(mo8285measureBRTryo0.getWidth() + mo8285measureBRTryo02.getWidth())) / 2, 0, 2, null), 0, 0, 0, 0, 11, null));
                                int width = mo8285measureBRTryo03.getWidth() + ((mo8285measureBRTryo0.getWidth() + mo8285measureBRTryo02.getWidth()) / 2);
                                int max = Math.max(mo8285measureBRTryo03.getHeight(), Math.max(mo8285measureBRTryo0.getHeight(), mo8285measureBRTryo02.getHeight()));
                                this.$state.setTotalWidth$material3(width);
                                this.$state.updateMinMaxPx$material3();
                                float coercedActiveRangeStartAsFraction$material3 = this.$state.getCoercedActiveRangeStartAsFraction$material3();
                                boolean z = true;
                                boolean z2 = Intrinsics.areEqual(coercedActiveRangeStartAsFraction$material3, ArraysKt.firstOrNull(this.$state.getTickFractions())) || Intrinsics.areEqual(coercedActiveRangeStartAsFraction$material3, ArraysKt.lastOrNull(this.$state.getTickFractions()));
                                float coercedActiveRangeEndAsFraction$material3 = this.$state.getCoercedActiveRangeEndAsFraction$material3();
                                if (!Intrinsics.areEqual(coercedActiveRangeEndAsFraction$material3, ArraysKt.firstOrNull(this.$state.getTickFractions())) && !Intrinsics.areEqual(coercedActiveRangeEndAsFraction$material3, ArraysKt.lastOrNull(this.$state.getTickFractions()))) {
                                    z = false;
                                }
                                final int width2 = mo8285measureBRTryo0.getWidth() / 2;
                                int i4 = mo8285measureBRTryo03.get(SliderKt.getCornerSizeAlignmentLine());
                                int i5 = i4 != Integer.MIN_VALUE ? i4 : 0;
                                if (this.$state.getSteps() > 0 && !z2) {
                                    roundToInt = MathKt.roundToInt((mo8285measureBRTryo03.getWidth() - (i5 * 2)) * coercedActiveRangeStartAsFraction$material3) + i5;
                                } else {
                                    roundToInt = MathKt.roundToInt(mo8285measureBRTryo03.getWidth() * coercedActiveRangeStartAsFraction$material3);
                                }
                                final int i6 = roundToInt;
                                int width3 = (mo8285measureBRTryo0.getWidth() - mo8285measureBRTryo02.getWidth()) / 2;
                                if (this.$state.getSteps() > 0 && !z) {
                                    roundToInt2 = MathKt.roundToInt(((mo8285measureBRTryo03.getWidth() - (i5 * 2)) * coercedActiveRangeEndAsFraction$material3) + width3) + i5;
                                } else {
                                    roundToInt2 = MathKt.roundToInt((mo8285measureBRTryo03.getWidth() * coercedActiveRangeEndAsFraction$material3) + width3);
                                }
                                final int i7 = roundToInt2;
                                final int height = (max - mo8285measureBRTryo03.getHeight()) / 2;
                                final int height2 = (max - mo8285measureBRTryo0.getHeight()) / 2;
                                final int height3 = (max - mo8285measureBRTryo02.getHeight()) / 2;
                                return MeasureScope.CC.layout$default(measureScope, width, max, null, new Function1() { // from class: androidx.compose.material3.SliderKt$RangeSliderImpl$2$1$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        Unit measure_3p2s80s$lambda$4;
                                        measure_3p2s80s$lambda$4 = SliderKt$RangeSliderImpl$2$1.measure_3p2s80s$lambda$4(Placeable.this, width2, height, mo8285measureBRTryo0, i6, height2, mo8285measureBRTryo02, i7, height3, (Placeable.PlacementScope) obj);
                                        return measure_3p2s80s$lambda$4;
                                    }
                                }, 4, null);
                            }
                            i3++;
                            j2 = j;
                        }
                        ListUtilsKt.throwNoSuchElementException("Collection contains no element matching the predicate.");
                        throw new KotlinNothingValueException();
                    }
                    i2++;
                    j2 = j;
                }
                ListUtilsKt.throwNoSuchElementException("Collection contains no element matching the predicate.");
                throw new KotlinNothingValueException();
            }
            i++;
            j2 = j;
        }
        ListUtilsKt.throwNoSuchElementException("Collection contains no element matching the predicate.");
        throw new KotlinNothingValueException();
    }
}
