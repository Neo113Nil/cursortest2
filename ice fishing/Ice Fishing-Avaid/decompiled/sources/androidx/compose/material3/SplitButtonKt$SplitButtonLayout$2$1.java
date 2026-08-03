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
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SplitButton.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
/* loaded from: classes.dex */
final class SplitButtonKt$SplitButtonLayout$2$1 implements MeasurePolicy {
    final /* synthetic */ float $spacing;

    SplitButtonKt$SplitButtonLayout$2$1(float f) {
        this.$spacing = f;
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
        Integer num;
        MeasureScope measureScope2 = measureScope;
        long m9665copyZbe2FdA$default = Constraints.m9665copyZbe2FdA$default(j, 0, 0, 0, 0, 10, null);
        List<? extends Measurable> list2 = list;
        int size = list2.size();
        int i = 0;
        while (i < size) {
            Measurable measurable = list.get(i);
            if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable), "LeadingButton")) {
                final Placeable mo8285measureBRTryo0 = measurable.mo8285measureBRTryo0(m9665copyZbe2FdA$default);
                int size2 = list2.size();
                int i2 = 0;
                while (i2 < size2) {
                    Measurable measurable2 = list.get(i2);
                    if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable2), "TrailingButton")) {
                        final Placeable mo8285measureBRTryo02 = measurable2.mo8285measureBRTryo0(Constraints.m9665copyZbe2FdA$default(ConstraintsKt.m9695offsetNN6EwU$default(m9665copyZbe2FdA$default, -(mo8285measureBRTryo0.getWidth() + measureScope2.mo522roundToPx0680j_4(this.$spacing)), 0, 2, null), 0, 0, mo8285measureBRTryo0.getHeight(), mo8285measureBRTryo0.getHeight(), 3, null));
                        int i3 = 1;
                        List listOf = CollectionsKt.listOf((Object[]) new Placeable[]{mo8285measureBRTryo0, mo8285measureBRTryo02});
                        int size3 = listOf.size();
                        int i4 = 0;
                        for (int i5 = 0; i5 < size3; i5++) {
                            i4 += ((Placeable) listOf.get(i5)).getWidth();
                        }
                        int i6 = i4 + measureScope2.mo522roundToPx0680j_4(this.$spacing);
                        if (listOf.isEmpty()) {
                            num = null;
                        } else {
                            Integer valueOf = Integer.valueOf(((Placeable) listOf.get(0)).getHeight());
                            int lastIndex = CollectionsKt.getLastIndex(listOf);
                            if (1 <= lastIndex) {
                                while (true) {
                                    Integer valueOf2 = Integer.valueOf(((Placeable) listOf.get(i3)).getHeight());
                                    if (valueOf2.compareTo(valueOf) > 0) {
                                        valueOf = valueOf2;
                                    }
                                    if (i3 == lastIndex) {
                                        break;
                                    }
                                    i3++;
                                }
                            }
                            num = valueOf;
                        }
                        Integer num2 = num;
                        int intValue = num2 != null ? num2.intValue() : 0;
                        int m9692constrainWidthK40F9xA = ConstraintsKt.m9692constrainWidthK40F9xA(j, i6);
                        int m9691constrainHeightK40F9xA = ConstraintsKt.m9691constrainHeightK40F9xA(j, intValue);
                        final float f = this.$spacing;
                        return MeasureScope.CC.layout$default(measureScope2, m9692constrainWidthK40F9xA, m9691constrainHeightK40F9xA, null, new Function1() { // from class: androidx.compose.material3.SplitButtonKt$SplitButtonLayout$2$1$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                Unit measure_3p2s80s$lambda$4;
                                measure_3p2s80s$lambda$4 = SplitButtonKt$SplitButtonLayout$2$1.measure_3p2s80s$lambda$4(Placeable.this, mo8285measureBRTryo02, f, (Placeable.PlacementScope) obj);
                                return measure_3p2s80s$lambda$4;
                            }
                        }, 4, null);
                    }
                    i2++;
                    measureScope2 = measureScope;
                }
                ListUtilsKt.throwNoSuchElementException("Collection contains no element matching the predicate.");
                throw new KotlinNothingValueException();
            }
            i++;
            measureScope2 = measureScope;
        }
        ListUtilsKt.throwNoSuchElementException("Collection contains no element matching the predicate.");
        throw new KotlinNothingValueException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit measure_3p2s80s$lambda$4(Placeable placeable, Placeable placeable2, float f, Placeable.PlacementScope placementScope) {
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable, 0, 0, 0.0f, 4, null);
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable2, placeable.getWidth() + placementScope.mo522roundToPx0680j_4(f), 0, 0.0f, 4, null);
        return Unit.INSTANCE;
    }
}
