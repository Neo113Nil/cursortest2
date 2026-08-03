package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.tooling.preview.AndroidUiModes;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;

/* compiled from: ButtonGroup.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J)\u0010\f\u001a\u00020\r*\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0012\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Landroidx/compose/material3/NonAdaptiveButtonGroupMeasurePolicy;", "Landroidx/compose/ui/layout/MeasurePolicy;", "horizontalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "expandedRatio", "", "<init>", "(Landroidx/compose/foundation/layout/Arrangement$Horizontal;F)V", "getHorizontalArrangement", "()Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "getExpandedRatio", "()F", "measure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "measurables", "", "Landroidx/compose/ui/layout/Measurable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Ljava/util/List;J)Landroidx/compose/ui/layout/MeasureResult;", "material3"}, k = 1, mv = {2, 1, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
/* loaded from: classes.dex */
final class NonAdaptiveButtonGroupMeasurePolicy implements MeasurePolicy {
    private final float expandedRatio;
    private final Arrangement.Horizontal horizontalArrangement;

    /* compiled from: ButtonGroup.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LayoutDirection.values().length];
            try {
                iArr[LayoutDirection.Ltr.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LayoutDirection.Rtl.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
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

    public NonAdaptiveButtonGroupMeasurePolicy(Arrangement.Horizontal horizontal, float f) {
        this.horizontalArrangement = horizontal;
        this.expandedRatio = f;
    }

    public final Arrangement.Horizontal getHorizontalArrangement() {
        return this.horizontalArrangement;
    }

    public final float getExpandedRatio() {
        return this.expandedRatio;
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo81measure3p2s80s(final MeasureScope measureScope, List<? extends Measurable> list, long j) {
        int i;
        int i2;
        Object obj;
        List<? extends Measurable> list2 = list;
        int i3 = measureScope.mo522roundToPx0680j_4(this.horizontalArrangement.getSpacing());
        long j2 = i3;
        int size = list2.size();
        int[] iArr = new int[size];
        Constraints[] constraintsArr = new Constraints[size];
        int size2 = list2.size();
        ButtonGroupParentData[] buttonGroupParentDataArr = new ButtonGroupParentData[size2];
        for (int i4 = 0; i4 < size2; i4++) {
            Object parentData = list2.get(i4).getParentData();
            ButtonGroupParentData buttonGroupParentData = parentData instanceof ButtonGroupParentData ? (ButtonGroupParentData) parentData : null;
            if (buttonGroupParentData == null) {
                buttonGroupParentData = new ButtonGroupParentData(0.0f, null, null, 7, null);
            }
            buttonGroupParentDataArr[i4] = buttonGroupParentData;
        }
        int size3 = list2.size();
        Animatable[] animatableArr = new Animatable[size3];
        for (int i5 = 0; i5 < size3; i5++) {
            animatableArr[i5] = buttonGroupParentDataArr[i5].getPressedAnimatable();
        }
        int m9677getMinWidthimpl = Constraints.m9677getMinWidthimpl(j);
        int m9675getMaxWidthimpl = Constraints.m9675getMaxWidthimpl(j);
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        float f = 0.0f;
        for (int i9 = 0; i9 < size; i9++) {
            Measurable measurable = list2.get(i9);
            float weight = ButtonGroupKt.getWeight(ButtonGroupKt.getButtonGroupParentData(measurable));
            if (weight > 0.0f) {
                f += weight;
                i6++;
            } else {
                int maxIntrinsicWidth = measurable.maxIntrinsicWidth(Constraints.m9674getMaxHeightimpl(j));
                constraintsArr[i9] = Constraints.m9662boximpl(Constraints.m9665copyZbe2FdA$default(j, 0, RangesKt.coerceAtLeast(maxIntrinsicWidth, 0), 0, 0, 12, null));
                iArr[i9] = maxIntrinsicWidth;
                i8 = Math.min(i3, RangesKt.coerceAtLeast((m9675getMaxWidthimpl - i7) - maxIntrinsicWidth, 0));
                i7 += maxIntrinsicWidth + i8;
            }
        }
        if (i6 == 0) {
            i7 -= i8;
            i = 0;
        } else {
            long j3 = j2 * (i6 - 1);
            long coerceAtLeast = RangesKt.coerceAtLeast(((m9675getMaxWidthimpl != Integer.MAX_VALUE ? m9675getMaxWidthimpl : m9677getMinWidthimpl) - i7) - j3, 0L);
            float f2 = coerceAtLeast / f;
            long j4 = coerceAtLeast;
            int i10 = 0;
            while (i10 < size) {
                j4 -= Math.round(ButtonGroupKt.getWeight(ButtonGroupKt.getButtonGroupParentData(list2.get(i10))) * f2);
                i10++;
                j3 = j3;
            }
            long j5 = j3;
            int i11 = 0;
            int i12 = 0;
            while (i11 < size) {
                if (constraintsArr[i11] == null) {
                    float weight2 = ButtonGroupKt.getWeight(ButtonGroupKt.getButtonGroupParentData(list2.get(i11)));
                    int sign = MathKt.getSign(j4);
                    i2 = size;
                    j4 -= sign;
                    int max = Math.max(0, Math.round(weight2 * f2) + sign);
                    constraintsArr[i11] = Constraints.m9662boximpl(Constraints.m9665copyZbe2FdA$default(j, max != Integer.MAX_VALUE ? max : 0, max, 0, 0, 12, null));
                    iArr[i11] = max;
                    i12 += max;
                } else {
                    i2 = size;
                }
                i12 = RangesKt.coerceIn((int) (i12 + j5), 0, m9675getMaxWidthimpl - i7);
                i11++;
                size = i2;
            }
            i = i12;
        }
        int i13 = size;
        int size4 = list2.size();
        int[] iArr2 = new int[size4];
        for (int i14 = 0; i14 < size4; i14++) {
            Constraints constraints = constraintsArr[i14];
            iArr2[i14] = Constraints.m9675getMaxWidthimpl(constraints != null ? constraints.getValue() : j);
        }
        int size5 = list2.size();
        final int[] iArr3 = new int[size5];
        for (int i15 = 0; i15 < size5; i15++) {
            iArr3[i15] = 0;
        }
        if (list2.size() > 1) {
            int size6 = list2.size();
            for (int i16 = 0; i16 < size6; i16++) {
                float floatValue = ((Number) animatableArr[i16].getValue()).floatValue() * this.expandedRatio * iArr2[i16];
                if (1 <= i16 && i16 < CollectionsKt.getLastIndex(list2)) {
                    float f3 = floatValue / 2.0f;
                    iArr3[i16] = MathKt.roundToInt(f3);
                    int i17 = i16 - 1;
                    iArr2[i17] = iArr2[i17] - MathKt.roundToInt(f3);
                    int i18 = i16 + 1;
                    iArr2[i18] = iArr2[i18] - MathKt.roundToInt(floatValue / 2);
                } else {
                    if (i16 == 0) {
                        int i19 = i16 + 1;
                        iArr2[i19] = iArr2[i19] - MathKt.roundToInt(floatValue);
                    } else {
                        int i20 = i16 - 1;
                        iArr2[i20] = iArr2[i20] - MathKt.roundToInt(floatValue);
                    }
                    iArr3[i16] = MathKt.roundToInt(floatValue);
                }
                iArr2[i16] = iArr2[i16] + MathKt.roundToInt(floatValue);
            }
        }
        ArrayList arrayList = new ArrayList(list2.size());
        int size7 = list2.size();
        int i21 = 0;
        while (i21 < size7) {
            ArrayList arrayList2 = arrayList;
            Measurable measurable2 = list2.get(i21);
            Constraints constraints2 = constraintsArr[i21];
            long value = constraints2 != null ? constraints2.getValue() : j;
            int i22 = iArr2[i21];
            arrayList2.add(measurable2.mo8285measureBRTryo0(Constraints.m9665copyZbe2FdA$default(value, i22, i22, 0, 0, 12, null)));
            i21++;
            list2 = list;
            arrayList = arrayList;
        }
        final ArrayList arrayList3 = arrayList;
        int max2 = Math.max(RangesKt.coerceAtLeast(i7 + i, 0), m9677getMinWidthimpl);
        final int[] iArr4 = new int[i13];
        this.horizontalArrangement.arrange(measureScope, max2, iArr, measureScope.getLayoutDirection(), iArr4);
        if (arrayList3.isEmpty()) {
            obj = null;
        } else {
            Object obj2 = arrayList3.get(0);
            int height = ((Placeable) obj2).getHeight();
            int lastIndex = CollectionsKt.getLastIndex(arrayList3);
            int i23 = 1;
            if (1 <= lastIndex) {
                while (true) {
                    Object obj3 = arrayList3.get(i23);
                    int height2 = ((Placeable) obj3).getHeight();
                    if (height < height2) {
                        obj2 = obj3;
                        height = height2;
                    }
                    if (i23 == lastIndex) {
                        break;
                    }
                    i23++;
                }
            }
            obj = obj2;
        }
        Placeable placeable = (Placeable) obj;
        return MeasureScope.CC.layout$default(measureScope, max2, placeable != null ? placeable.getHeight() : Constraints.m9676getMinHeightimpl(j), null, new Function1() { // from class: androidx.compose.material3.NonAdaptiveButtonGroupMeasurePolicy$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj4) {
                Unit measure_3p2s80s$lambda$3;
                measure_3p2s80s$lambda$3 = NonAdaptiveButtonGroupMeasurePolicy.measure_3p2s80s$lambda$3(arrayList3, measureScope, iArr3, iArr4, (Placeable.PlacementScope) obj4);
                return measure_3p2s80s$lambda$3;
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit measure_3p2s80s$lambda$3(List list, MeasureScope measureScope, int[] iArr, int[] iArr2, Placeable.PlacementScope placementScope) {
        int i;
        int i2;
        int i3;
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            int i5 = WhenMappings.$EnumSwitchMapping$0[measureScope.getLayoutDirection().ordinal()];
            if (i5 == 1) {
                if (i4 > 0) {
                    i = iArr[i4 - 1];
                    i2 = iArr[i4];
                    i3 = i - i2;
                }
                i3 = 0;
            } else {
                if (i5 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                if (i4 < CollectionsKt.getLastIndex(list)) {
                    i = iArr[i4 + 1];
                    i2 = iArr[i4];
                    i3 = i - i2;
                }
                i3 = 0;
            }
            Placeable.PlacementScope.place$default(placementScope, (Placeable) list.get(i4), iArr2[i4] + i3, 0, 0.0f, 4, null);
        }
        return Unit.INSTANCE;
    }
}
