package androidx.compose.material3;

import androidx.compose.runtime.MutableIntState;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.tooling.preview.AndroidUiModes;
import androidx.compose.ui.unit.Constraints;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref;

/* compiled from: FloatingActionButtonMenu.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
/* loaded from: classes.dex */
final class FloatingActionButtonMenuKt$FloatingActionButtonMenu$1$1 implements MeasurePolicy {
    final /* synthetic */ MutableIntState $buttonHeight$delegate;
    final /* synthetic */ Alignment.Horizontal $horizontalAlignment;

    FloatingActionButtonMenuKt$FloatingActionButtonMenu$1$1(MutableIntState mutableIntState, Alignment.Horizontal horizontal) {
        this.$buttonHeight$delegate = mutableIntState;
        this.$horizontalAlignment = horizontal;
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v7, types: [T, androidx.compose.ui.layout.Placeable] */
    @Override // androidx.compose.ui.layout.MeasurePolicy
    /* renamed from: measure-3p2s80s */
    public final MeasureResult mo81measure3p2s80s(final MeasureScope measureScope, List<? extends Measurable> list, long j) {
        float f;
        int width;
        int height;
        final Placeable mo8285measureBRTryo0 = list.get(0).mo8285measureBRTryo0(j);
        f = FloatingActionButtonMenuKt.FabMenuButtonPaddingBottom;
        final int i = measureScope.mo522roundToPx0680j_4(f);
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        if (list.size() > 1) {
            objectRef.element = list.get(1).mo8285measureBRTryo0(j);
            this.$buttonHeight$delegate.setIntValue(((Placeable) objectRef.element).getHeight());
            width = Math.max(((Placeable) objectRef.element).getWidth(), mo8285measureBRTryo0.getWidth());
            height = Math.max(((Placeable) objectRef.element).getHeight() + i, mo8285measureBRTryo0.getHeight());
        } else {
            width = mo8285measureBRTryo0.getWidth();
            height = mo8285measureBRTryo0.getHeight();
        }
        final int min = Math.min(width, Constraints.m9675getMaxWidthimpl(j));
        final int min2 = Math.min(height, Constraints.m9674getMaxHeightimpl(j));
        final Alignment.Horizontal horizontal = this.$horizontalAlignment;
        return MeasureScope.CC.layout$default(measureScope, min, min2, null, new Function1() { // from class: androidx.compose.material3.FloatingActionButtonMenuKt$FloatingActionButtonMenu$1$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit measure_3p2s80s$lambda$0;
                measure_3p2s80s$lambda$0 = FloatingActionButtonMenuKt$FloatingActionButtonMenu$1$1.measure_3p2s80s$lambda$0(Alignment.Horizontal.this, mo8285measureBRTryo0, min, measureScope, objectRef, min2, i, (Placeable.PlacementScope) obj);
                return measure_3p2s80s$lambda$0;
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit measure_3p2s80s$lambda$0(Alignment.Horizontal horizontal, Placeable placeable, int i, MeasureScope measureScope, Ref.ObjectRef objectRef, int i2, int i3, Placeable.PlacementScope placementScope) {
        Placeable.PlacementScope.place$default(placementScope, placeable, horizontal.align(placeable.getWidth(), i, measureScope.getLayoutDirection()), 0, 0.0f, 4, null);
        if (objectRef.element != 0) {
            Placeable.PlacementScope.place$default(placementScope, (Placeable) objectRef.element, horizontal.align(((Placeable) objectRef.element).getWidth(), i, measureScope.getLayoutDirection()), (i2 - ((Placeable) objectRef.element).getHeight()) - i3, 0.0f, 4, null);
        }
        return Unit.INSTANCE;
    }
}
