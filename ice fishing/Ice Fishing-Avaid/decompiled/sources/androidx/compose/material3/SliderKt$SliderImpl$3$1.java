package androidx.compose.material3;

import androidx.compose.foundation.gestures.Orientation;
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
import kotlin.jvm.internal.Ref;
import kotlin.math.MathKt;

/* compiled from: Slider.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
/* loaded from: classes.dex */
final class SliderKt$SliderImpl$3$1 implements MeasurePolicy {
    final /* synthetic */ SliderState $state;

    SliderKt$SliderImpl$3$1(SliderState sliderState) {
        this.$state = sliderState;
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
    public static final Unit measure_3p2s80s$lambda$3(Placeable placeable, int i, int i2, Placeable placeable2, int i3, Ref.IntRef intRef, Placeable.PlacementScope placementScope) {
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable, i, i2, 0.0f, 4, null);
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable2, i3, intRef.element, 0.0f, 4, null);
        return Unit.INSTANCE;
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    /* renamed from: measure-3p2s80s */
    public final MeasureResult mo81measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j) {
        Placeable mo8285measureBRTryo0;
        int width;
        int max;
        int width2;
        int height;
        int roundToInt;
        int i;
        int roundToInt2;
        List<? extends Measurable> list2 = list;
        int size = list2.size();
        for (int i2 = 0; i2 < size; i2++) {
            Measurable measurable = list.get(i2);
            if (LayoutIdKt.getLayoutId(measurable) == SliderComponents.THUMB) {
                long j2 = j;
                final Placeable mo8285measureBRTryo02 = measurable.mo8285measureBRTryo0(j2);
                int size2 = list2.size();
                int i3 = 0;
                while (i3 < size2) {
                    Measurable measurable2 = list.get(i3);
                    if (LayoutIdKt.getLayoutId(measurable2) == SliderComponents.TRACK) {
                        if (this.$state.getOrientation() == Orientation.Vertical) {
                            mo8285measureBRTryo0 = measurable2.mo8285measureBRTryo0(Constraints.m9665copyZbe2FdA$default(ConstraintsKt.m9695offsetNN6EwU$default(j2, 0, -mo8285measureBRTryo02.getHeight(), 1, null), 0, 0, 0, 0, 14, null));
                        } else {
                            mo8285measureBRTryo0 = measurable2.mo8285measureBRTryo0(Constraints.m9665copyZbe2FdA$default(ConstraintsKt.m9695offsetNN6EwU$default(j, -mo8285measureBRTryo02.getWidth(), 0, 2, null), 0, 0, 0, 0, 11, null));
                        }
                        final Placeable placeable = mo8285measureBRTryo0;
                        final Ref.IntRef intRef = new Ref.IntRef();
                        float coercedValueAsFraction = this.$state.getCoercedValueAsFraction();
                        boolean z = Intrinsics.areEqual(coercedValueAsFraction, ArraysKt.firstOrNull(this.$state.getTickFractions())) || Intrinsics.areEqual(coercedValueAsFraction, ArraysKt.lastOrNull(this.$state.getTickFractions()));
                        int i4 = placeable.get(SliderKt.getCornerSizeAlignmentLine());
                        int i5 = i4 != Integer.MIN_VALUE ? i4 : 0;
                        if (this.$state.getOrientation() == Orientation.Vertical) {
                            width = Math.max(placeable.getWidth(), mo8285measureBRTryo02.getWidth());
                            max = mo8285measureBRTryo02.getHeight() + placeable.getHeight();
                            width2 = (width - placeable.getWidth()) / 2;
                            height = mo8285measureBRTryo02.getHeight() / 2;
                            i = (width - mo8285measureBRTryo02.getWidth()) / 2;
                            if (this.$state.getSteps() > 0 && !z) {
                                roundToInt2 = MathKt.roundToInt((placeable.getHeight() - (i5 * 2)) * coercedValueAsFraction) + i5;
                            } else {
                                roundToInt2 = MathKt.roundToInt(placeable.getHeight() * coercedValueAsFraction);
                            }
                            intRef.element = roundToInt2;
                            if (this.$state.getReverseVerticalDirection()) {
                                intRef.element = placeable.getHeight() - intRef.element;
                            }
                        } else {
                            width = mo8285measureBRTryo02.getWidth() + placeable.getWidth();
                            max = Math.max(placeable.getHeight(), mo8285measureBRTryo02.getHeight());
                            width2 = mo8285measureBRTryo02.getWidth() / 2;
                            height = (max - placeable.getHeight()) / 2;
                            if (this.$state.getSteps() > 0 && !z) {
                                roundToInt = MathKt.roundToInt((placeable.getWidth() - (i5 * 2)) * coercedValueAsFraction) + i5;
                            } else {
                                roundToInt = MathKt.roundToInt(placeable.getWidth() * coercedValueAsFraction);
                            }
                            i = roundToInt;
                            intRef.element = (max - mo8285measureBRTryo02.getHeight()) / 2;
                        }
                        final int i6 = height;
                        final int i7 = i;
                        final int i8 = width2;
                        this.$state.updateDimensions$material3(width, max);
                        return MeasureScope.CC.layout$default(measureScope, width, max, null, new Function1() { // from class: androidx.compose.material3.SliderKt$SliderImpl$3$1$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                Unit measure_3p2s80s$lambda$3;
                                measure_3p2s80s$lambda$3 = SliderKt$SliderImpl$3$1.measure_3p2s80s$lambda$3(Placeable.this, i8, i6, mo8285measureBRTryo02, i7, intRef, (Placeable.PlacementScope) obj);
                                return measure_3p2s80s$lambda$3;
                            }
                        }, 4, null);
                    }
                    i3++;
                    j2 = j;
                }
                ListUtilsKt.throwNoSuchElementException("Collection contains no element matching the predicate.");
                throw new KotlinNothingValueException();
            }
        }
        ListUtilsKt.throwNoSuchElementException("Collection contains no element matching the predicate.");
        throw new KotlinNothingValueException();
    }
}
