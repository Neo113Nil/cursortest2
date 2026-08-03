package androidx.compose.material3;

import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.tooling.preview.AndroidUiModes;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.DpKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.ranges.RangesKt;

/* compiled from: FloatingToolbar.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
/* loaded from: classes.dex */
final class FloatingToolbarKt$VerticalFloatingToolbarWithFabLayout$3$1 implements MeasurePolicy {
    final /* synthetic */ float $collapsedShadowElevation;
    final /* synthetic */ State<Float> $expandedProgress;
    final /* synthetic */ float $expandedShadowElevation;
    final /* synthetic */ int $fabPosition;
    final /* synthetic */ Shape $toolbarShape;
    final /* synthetic */ float $toolbarToFabGap;

    FloatingToolbarKt$VerticalFloatingToolbarWithFabLayout$3$1(State<Float> state, float f, int i, float f2, float f3, Shape shape) {
        this.$expandedProgress = state;
        this.$toolbarToFabGap = f;
        this.$fabPosition = i;
        this.$collapsedShadowElevation = f2;
        this.$expandedShadowElevation = f3;
        this.$toolbarShape = shape;
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
        float lerp;
        Measurable measurable = list.get(0);
        Measurable measurable2 = list.get(1);
        lerp = FloatingToolbarKt.lerp(FloatingToolbarDefaults.INSTANCE.getFabSizeRange$material3(), 1.0f - this.$expandedProgress.getValue().floatValue());
        int i = measureScope.mo522roundToPx0680j_4(lerp);
        final Placeable mo8285measureBRTryo0 = measurable2.mo8285measureBRTryo0(Constraints.m9664copyZbe2FdA(j, i, i, i, i));
        int maxIntrinsicHeight = measurable.maxIntrinsicHeight(measureScope.mo522roundToPx0680j_4(FloatingToolbarDefaults.INSTANCE.m3203getContainerSizeD9Ej5fM()));
        final Placeable mo8285measureBRTryo02 = measurable.mo8285measureBRTryo0(Constraints.m9665copyZbe2FdA$default(j, RangesKt.coerceIn(measureScope.mo522roundToPx0680j_4(FloatingToolbarDefaults.INSTANCE.m3203getContainerSizeD9Ej5fM()), 0, Constraints.m9677getMinWidthimpl(j)), 0, 0, RangesKt.coerceIn((int) RangesKt.coerceAtLeast(maxIntrinsicHeight * this.$expandedProgress.getValue().floatValue(), 0.0f), 0, Constraints.m9674getMaxHeightimpl(j)), 6, null));
        int m9677getMinWidthimpl = Constraints.m9677getMinWidthimpl(j);
        int i2 = measureScope.mo522roundToPx0680j_4(this.$toolbarToFabGap) + maxIntrinsicHeight + measureScope.mo522roundToPx0680j_4(FloatingToolbarDefaults.INSTANCE.getFabSizeRange$material3().getStart().m9746unboximpl());
        final int width = (m9677getMinWidthimpl - mo8285measureBRTryo02.getWidth()) / 2;
        final int width2 = (m9677getMinWidthimpl - mo8285measureBRTryo0.getWidth()) / 2;
        final int height = FloatingToolbarVerticalFabPosition.m3268equalsimpl0(this.$fabPosition, FloatingToolbarVerticalFabPosition.INSTANCE.m3272getBottomdDJPGzU()) ? i2 - mo8285measureBRTryo0.getHeight() : 0;
        final int height2 = FloatingToolbarVerticalFabPosition.m3268equalsimpl0(this.$fabPosition, FloatingToolbarVerticalFabPosition.INSTANCE.m3272getBottomdDJPGzU()) ? maxIntrinsicHeight - mo8285measureBRTryo02.getHeight() : i2 - maxIntrinsicHeight;
        final float f = this.$collapsedShadowElevation;
        final float f2 = this.$expandedShadowElevation;
        final State<Float> state = this.$expandedProgress;
        final Shape shape = this.$toolbarShape;
        return MeasureScope.CC.layout$default(measureScope, m9677getMinWidthimpl, i2, null, new Function1() { // from class: androidx.compose.material3.FloatingToolbarKt$VerticalFloatingToolbarWithFabLayout$3$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit measure_3p2s80s$lambda$0;
                measure_3p2s80s$lambda$0 = FloatingToolbarKt$VerticalFloatingToolbarWithFabLayout$3$1.measure_3p2s80s$lambda$0(f, f2, state, mo8285measureBRTryo02, width, height2, mo8285measureBRTryo0, width2, height, shape, (Placeable.PlacementScope) obj);
                return measure_3p2s80s$lambda$0;
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit measure_3p2s80s$lambda$0(float f, float f2, State state, Placeable placeable, int i, int i2, Placeable placeable2, int i3, int i4, final Shape shape, Placeable.PlacementScope placementScope) {
        final float m9775lerpMdfbLM = DpKt.m9775lerpMdfbLM(f, f2, RangesKt.coerceAtMost(((Number) state.getValue()).floatValue(), 1.0f));
        Placeable.PlacementScope.placeRelativeWithLayer$default(placementScope, placeable, i, i2, 0.0f, new Function1() { // from class: androidx.compose.material3.FloatingToolbarKt$VerticalFloatingToolbarWithFabLayout$3$1$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit measure_3p2s80s$lambda$0$0;
                measure_3p2s80s$lambda$0$0 = FloatingToolbarKt$VerticalFloatingToolbarWithFabLayout$3$1.measure_3p2s80s$lambda$0$0(m9775lerpMdfbLM, shape, (GraphicsLayerScope) obj);
                return measure_3p2s80s$lambda$0$0;
            }
        }, 4, (Object) null);
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable2, i3, i4, 0.0f, 4, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit measure_3p2s80s$lambda$0$0(float f, Shape shape, GraphicsLayerScope graphicsLayerScope) {
        graphicsLayerScope.setShadowElevation(graphicsLayerScope.mo528toPx0680j_4(f));
        graphicsLayerScope.setShape(shape);
        graphicsLayerScope.setClip(true);
        return Unit.INSTANCE;
    }
}
