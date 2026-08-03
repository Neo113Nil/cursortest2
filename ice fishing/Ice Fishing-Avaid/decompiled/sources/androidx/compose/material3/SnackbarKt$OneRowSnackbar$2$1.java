package androidx.compose.material3;

import androidx.compose.material3.tokens.SnackbarTokens;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.tooling.preview.AndroidUiModes;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.util.ListUtilsKt;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* compiled from: Snackbar.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
/* loaded from: classes.dex */
final class SnackbarKt$OneRowSnackbar$2$1 implements MeasurePolicy {
    final /* synthetic */ String $actionTag;
    final /* synthetic */ String $dismissActionTag;
    final /* synthetic */ String $textTag;

    SnackbarKt$OneRowSnackbar$2$1(String str, String str2, String str3) {
        this.$actionTag = str;
        this.$dismissActionTag = str2;
        this.$textTag = str3;
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
        float f;
        Measurable measurable;
        Measurable measurable2;
        int i;
        float f2;
        MeasureScope measureScope2 = measureScope;
        int i2 = measureScope2.mo522roundToPx0680j_4(SnackbarTokens.INSTANCE.m5595getSingleLineContainerHeightD9Ej5fM());
        int m9675getMaxWidthimpl = Constraints.m9675getMaxWidthimpl(j);
        f = SnackbarKt.ContainerMaxWidth;
        int min = Math.min(m9675getMaxWidthimpl, measureScope2.mo522roundToPx0680j_4(f));
        String str = this.$actionTag;
        List<? extends Measurable> list2 = list;
        int size = list2.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                measurable = null;
                break;
            }
            measurable = list.get(i3);
            if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable), str)) {
                break;
            }
            i3++;
        }
        Measurable measurable3 = measurable;
        final Placeable mo8285measureBRTryo0 = measurable3 != null ? measurable3.mo8285measureBRTryo0(j) : null;
        String str2 = this.$dismissActionTag;
        int size2 = list2.size();
        int i4 = 0;
        while (true) {
            if (i4 >= size2) {
                measurable2 = null;
                break;
            }
            measurable2 = list.get(i4);
            if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable2), str2)) {
                break;
            }
            i4++;
        }
        Measurable measurable4 = measurable2;
        final Placeable mo8285measureBRTryo02 = measurable4 != null ? measurable4.mo8285measureBRTryo0(j) : null;
        int width = mo8285measureBRTryo0 != null ? mo8285measureBRTryo0.getWidth() : 0;
        int width2 = mo8285measureBRTryo02 != null ? mo8285measureBRTryo02.getWidth() : 0;
        if (width2 == 0) {
            f2 = SnackbarKt.TextEndExtraSpacing;
            i = measureScope2.mo522roundToPx0680j_4(f2);
        } else {
            i = 0;
        }
        int coerceAtLeast = RangesKt.coerceAtLeast(((min - width) - width2) - i, Constraints.m9677getMinWidthimpl(j));
        String str3 = this.$textTag;
        int size3 = list2.size();
        int i5 = 0;
        while (i5 < size3) {
            Measurable measurable5 = list.get(i5);
            if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable5), str3)) {
                final Placeable mo8285measureBRTryo03 = measurable5.mo8285measureBRTryo0(Constraints.m9665copyZbe2FdA$default(j, 0, coerceAtLeast, 0, 0, 9, null));
                final int maxOf = ComparisonsKt.maxOf(i2, mo8285measureBRTryo03.getHeight(), mo8285measureBRTryo0 != null ? mo8285measureBRTryo0.getHeight() : 0, mo8285measureBRTryo02 != null ? mo8285measureBRTryo02.getHeight() : 0);
                final int i6 = min - width2;
                final int i7 = i6 - width;
                return MeasureScope.CC.layout$default(measureScope2, min, maxOf, null, new Function1() { // from class: androidx.compose.material3.SnackbarKt$OneRowSnackbar$2$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit measure_3p2s80s$lambda$3;
                        measure_3p2s80s$lambda$3 = SnackbarKt$OneRowSnackbar$2$1.measure_3p2s80s$lambda$3(Placeable.this, maxOf, mo8285measureBRTryo0, i7, mo8285measureBRTryo02, i6, (Placeable.PlacementScope) obj);
                        return measure_3p2s80s$lambda$3;
                    }
                }, 4, null);
            }
            i5++;
            measureScope2 = measureScope;
        }
        ListUtilsKt.throwNoSuchElementException("Collection contains no element matching the predicate.");
        throw new KotlinNothingValueException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit measure_3p2s80s$lambda$3(Placeable placeable, int i, Placeable placeable2, int i2, Placeable placeable3, int i3, Placeable.PlacementScope placementScope) {
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable, 0, (i - placeable.getHeight()) / 2, 0.0f, 4, null);
        if (placeable2 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable2, i2, (i - placeable2.getHeight()) / 2, 0.0f, 4, null);
        }
        if (placeable3 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable3, i3, (i - placeable3.getHeight()) / 2, 0.0f, 4, null);
        }
        return Unit.INSTANCE;
    }
}
