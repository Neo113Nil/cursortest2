package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.MultiContentMeasurePolicy;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.tooling.preview.AndroidUiModes;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Ref;
import kotlin.math.MathKt;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;

/* compiled from: ButtonGroup.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ/\u0010\u0014\u001a\u00020\u0015*\u00020\u00162\u0012\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u00180\u00182\u0006\u0010\u001a\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001e"}, d2 = {"Landroidx/compose/material3/ButtonGroupMeasurePolicy;", "Landroidx/compose/ui/layout/MultiContentMeasurePolicy;", "overflowState", "Landroidx/compose/material3/ButtonGroupOverflowState;", "horizontalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "verticalAlignment", "Landroidx/compose/ui/Alignment$Vertical;", "expandedRatio", "", "<init>", "(Landroidx/compose/material3/ButtonGroupOverflowState;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Vertical;F)V", "getOverflowState", "()Landroidx/compose/material3/ButtonGroupOverflowState;", "getHorizontalArrangement", "()Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "getVerticalAlignment", "()Landroidx/compose/ui/Alignment$Vertical;", "getExpandedRatio", "()F", "measure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "measurables", "", "Landroidx/compose/ui/layout/Measurable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Ljava/util/List;J)Landroidx/compose/ui/layout/MeasureResult;", "material3"}, k = 1, mv = {2, 1, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
/* loaded from: classes.dex */
final class ButtonGroupMeasurePolicy implements MultiContentMeasurePolicy {
    private final float expandedRatio;
    private final Arrangement.Horizontal horizontalArrangement;
    private final ButtonGroupOverflowState overflowState;
    private final Alignment.Vertical verticalAlignment;

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

    @Override // androidx.compose.ui.layout.MultiContentMeasurePolicy
    public /* synthetic */ int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i) {
        return MultiContentMeasurePolicy.CC.$default$maxIntrinsicHeight(this, intrinsicMeasureScope, list, i);
    }

    @Override // androidx.compose.ui.layout.MultiContentMeasurePolicy
    public /* synthetic */ int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i) {
        return MultiContentMeasurePolicy.CC.$default$maxIntrinsicWidth(this, intrinsicMeasureScope, list, i);
    }

    @Override // androidx.compose.ui.layout.MultiContentMeasurePolicy
    public /* synthetic */ int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i) {
        return MultiContentMeasurePolicy.CC.$default$minIntrinsicHeight(this, intrinsicMeasureScope, list, i);
    }

    @Override // androidx.compose.ui.layout.MultiContentMeasurePolicy
    public /* synthetic */ int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i) {
        return MultiContentMeasurePolicy.CC.$default$minIntrinsicWidth(this, intrinsicMeasureScope, list, i);
    }

    public ButtonGroupMeasurePolicy(ButtonGroupOverflowState buttonGroupOverflowState, Arrangement.Horizontal horizontal, Alignment.Vertical vertical, float f) {
        this.overflowState = buttonGroupOverflowState;
        this.horizontalArrangement = horizontal;
        this.verticalAlignment = vertical;
        this.expandedRatio = f;
    }

    public final ButtonGroupOverflowState getOverflowState() {
        return this.overflowState;
    }

    public final Arrangement.Horizontal getHorizontalArrangement() {
        return this.horizontalArrangement;
    }

    public /* synthetic */ ButtonGroupMeasurePolicy(ButtonGroupOverflowState buttonGroupOverflowState, Arrangement.Horizontal horizontal, Alignment.Vertical vertical, float f, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(buttonGroupOverflowState, horizontal, (i & 4) != 0 ? Alignment.INSTANCE.getTop() : vertical, f);
    }

    public final Alignment.Vertical getVerticalAlignment() {
        return this.verticalAlignment;
    }

    public final float getExpandedRatio() {
        return this.expandedRatio;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.ui.layout.MultiContentMeasurePolicy
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo1062measure3p2s80s(final MeasureScope measureScope, List<? extends List<? extends Measurable>> list, long j) {
        Object obj;
        List<? extends Measurable> list2;
        long j2;
        long j3;
        List<? extends Measurable> list3;
        Integer valueOf;
        int[] iArr;
        Animatable[] animatableArr;
        final ArrayList arrayList;
        List<? extends Measurable> list4 = list.get(0);
        int i = 1;
        List<? extends Measurable> list5 = list.get(1);
        this.overflowState.setTotalItemCount(list4.size());
        int i2 = measureScope.mo522roundToPx0680j_4(this.horizontalArrangement.getSpacing());
        long j4 = i2;
        int size = list4.size();
        final ArrayList arrayList2 = new ArrayList();
        int[] iArr2 = new int[size];
        Constraints[] constraintsArr = new Constraints[size];
        int size2 = list4.size();
        ButtonGroupParentData[] buttonGroupParentDataArr = new ButtonGroupParentData[size2];
        int i3 = 0;
        while (true) {
            if (i3 >= size2) {
                break;
            }
            int i4 = i;
            Object parentData = list4.get(i3).getParentData();
            obj = parentData instanceof ButtonGroupParentData ? (ButtonGroupParentData) parentData : null;
            if (obj == null) {
                obj = new ButtonGroupParentData(0.0f, null, null, 7, null);
            }
            buttonGroupParentDataArr[i3] = obj;
            i3++;
            i = i4;
        }
        int i5 = i;
        int size3 = list4.size();
        Animatable[] animatableArr2 = new Animatable[size3];
        for (int i6 = 0; i6 < size3; i6++) {
            animatableArr2[i6] = buttonGroupParentDataArr[i6].getPressedAnimatable();
        }
        int m9677getMinWidthimpl = Constraints.m9677getMinWidthimpl(j);
        int m9675getMaxWidthimpl = Constraints.m9675getMaxWidthimpl(j);
        int i7 = 0;
        int i8 = 0;
        float f = 0.0f;
        for (int i9 = 0; i9 < size; i9++) {
            Measurable measurable = list4.get(i9);
            float weight = ButtonGroupKt.getWeight(ButtonGroupKt.getButtonGroupParentData(measurable));
            if (weight > 0.0f) {
                f += weight;
                i7++;
                Integer.valueOf(i7);
            } else {
                int maxIntrinsicWidth = measurable.maxIntrinsicWidth(Constraints.m9674getMaxHeightimpl(j));
                constraintsArr[i9] = Constraints.m9662boximpl(Constraints.m9665copyZbe2FdA$default(j, 0, RangesKt.coerceAtLeast(maxIntrinsicWidth, 0), 0, 0, 12, null));
                iArr2[i9] = maxIntrinsicWidth;
                i8 += maxIntrinsicWidth + Math.min(i2, RangesKt.coerceAtLeast((m9675getMaxWidthimpl - i8) - maxIntrinsicWidth, 0));
                Unit unit = Unit.INSTANCE;
            }
        }
        if (i7 == 0) {
            list2 = list5;
        } else {
            list2 = list5;
            long j5 = j4 * (i7 - 1);
            long coerceAtLeast = RangesKt.coerceAtLeast(((m9675getMaxWidthimpl != Integer.MAX_VALUE ? m9675getMaxWidthimpl : m9677getMinWidthimpl) - i8) - j5, 0L);
            float f2 = coerceAtLeast / f;
            for (int i10 = 0; i10 < size; i10++) {
                coerceAtLeast -= Math.round(ButtonGroupKt.getWeight(ButtonGroupKt.getButtonGroupParentData(list4.get(i10))) * f2);
            }
            int i11 = 0;
            int i12 = 0;
            while (i11 < size) {
                if (constraintsArr[i11] == null) {
                    float weight2 = ButtonGroupKt.getWeight(ButtonGroupKt.getButtonGroupParentData(list4.get(i11)));
                    long j6 = coerceAtLeast;
                    int sign = MathKt.getSign(j6);
                    j3 = j5;
                    long j7 = j6 - sign;
                    int max = Math.max(0, Math.round(weight2 * f2) + sign);
                    constraintsArr[i11] = Constraints.m9662boximpl(Constraints.m9665copyZbe2FdA$default(j, max != Integer.MAX_VALUE ? max : 0, max, 0, 0, 12, null));
                    iArr2[i11] = max;
                    i12 += max;
                    j2 = j7;
                } else {
                    j2 = coerceAtLeast;
                    j3 = j5;
                }
                i12 = RangesKt.coerceIn((int) (i12 + j3), 0, m9675getMaxWidthimpl - i8);
                i11++;
                coerceAtLeast = j2;
                j5 = j3;
            }
        }
        final Ref.IntRef intRef = new Ref.IntRef();
        int size4 = list4.size();
        int[] iArr3 = new int[size4];
        for (int i13 = 0; i13 < size4; i13++) {
            Constraints constraints = constraintsArr[i13];
            iArr3[i13] = Constraints.m9675getMaxWidthimpl(constraints != null ? constraints.getValue() : j);
        }
        int sum = ArraysKt.sum(iArr3) + ((list4.size() - 1) * i2);
        if (sum <= m9675getMaxWidthimpl) {
            iArr = iArr3;
            animatableArr = animatableArr2;
            arrayList = null;
        } else {
            if (list2.isEmpty()) {
                list3 = list2;
                iArr = iArr3;
                animatableArr = animatableArr2;
                valueOf = null;
            } else {
                list3 = list2;
                valueOf = Integer.valueOf(list3.get(0).maxIntrinsicWidth(Constraints.m9674getMaxHeightimpl(j)));
                int lastIndex = CollectionsKt.getLastIndex(list3);
                if (i5 <= lastIndex) {
                    int i14 = 1;
                    while (true) {
                        iArr = iArr3;
                        animatableArr = animatableArr2;
                        Integer valueOf2 = Integer.valueOf(list3.get(i14).maxIntrinsicWidth(Constraints.m9674getMaxHeightimpl(j)));
                        if (valueOf2.compareTo(valueOf) > 0) {
                            valueOf = valueOf2;
                        }
                        if (i14 == lastIndex) {
                            break;
                        }
                        i14++;
                        animatableArr2 = animatableArr;
                        iArr3 = iArr;
                    }
                } else {
                    iArr = iArr3;
                    animatableArr = animatableArr2;
                }
            }
            Integer num = valueOf;
            int intValue = num != null ? num.intValue() : 0;
            int i15 = m9675getMaxWidthimpl - intValue;
            int i16 = intValue;
            int i17 = 0;
            while (i17 < size4) {
                int i18 = iArr[i17];
                if (i18 > i15) {
                    break;
                }
                i16 += i18;
                intRef.element += iArr[i17];
                i15 -= iArr[i17] + i2;
                i17++;
            }
            int i19 = i2 * i17;
            int i20 = i16 + i19;
            intRef.element += i19;
            ArrayList arrayList3 = new ArrayList(list3.size());
            int i21 = 0;
            for (int size5 = list3.size(); i21 < size5; size5 = size5) {
                arrayList3.add(list3.get(i21).mo8285measureBRTryo0(Constraints.m9665copyZbe2FdA$default(j, 0, i15 + intValue, 0, 0, 13, null)));
                i21++;
                i20 = i20;
                list3 = list3;
            }
            sum = i20;
            size4 = i17;
            arrayList = arrayList3;
        }
        this.overflowState.setVisibleItemCount(size4);
        int[] iArr4 = new int[size4];
        for (int i22 = 0; i22 < size4; i22++) {
            iArr4[i22] = 0;
        }
        if (list4.size() > 1) {
            for (int i23 = 0; i23 < size4; i23++) {
                float floatValue = ((Number) animatableArr[i23].getValue()).floatValue() * this.expandedRatio * iArr[i23];
                if (1 <= i23 && i23 < size4 - 1) {
                    float f3 = floatValue / 2.0f;
                    iArr4[i23] = MathKt.roundToInt(f3);
                    int i24 = i23 - 1;
                    iArr[i24] = iArr[i24] - MathKt.roundToInt(f3);
                    int i25 = i23 + 1;
                    iArr[i25] = iArr[i25] - MathKt.roundToInt(floatValue / 2);
                } else {
                    if (i23 == 0) {
                        int i26 = i23 + 1;
                        iArr[i26] = iArr[i26] - MathKt.roundToInt(floatValue);
                    } else {
                        int i27 = i23 - 1;
                        iArr[i27] = iArr[i27] - MathKt.roundToInt(floatValue);
                    }
                    iArr4[i23] = MathKt.roundToInt(floatValue);
                }
                iArr[i23] = iArr[i23] + MathKt.roundToInt(floatValue);
            }
        }
        int i28 = 0;
        while (i28 < size4) {
            Measurable measurable2 = list4.get(i28);
            Constraints constraints2 = constraintsArr[i28];
            long value = constraints2 != null ? constraints2.getValue() : j;
            int i29 = iArr[i28];
            arrayList2.add(measurable2.mo8285measureBRTryo0(Constraints.m9665copyZbe2FdA$default(value, i29, i29, 0, 0, 12, null)));
            i28++;
            list4 = list4;
            iArr4 = iArr4;
        }
        final int[] iArr5 = iArr4;
        final List<? extends Measurable> list6 = list4;
        int max2 = Math.max(RangesKt.coerceAtLeast(sum, 0), m9677getMinWidthimpl);
        final int[] iArr6 = new int[size4];
        this.horizontalArrangement.arrange(measureScope, max2, ArraysKt.sliceArray(iArr2, new IntRange(0, size4 - 1)), measureScope.getLayoutDirection(), iArr6);
        Unit unit2 = Unit.INSTANCE;
        if (!arrayList2.isEmpty()) {
            Object obj2 = arrayList2.get(0);
            int height = ((Placeable) obj2).getHeight();
            int lastIndex2 = CollectionsKt.getLastIndex(arrayList2);
            if (1 <= lastIndex2) {
                int i30 = 1;
                while (true) {
                    Object obj3 = arrayList2.get(i30);
                    int height2 = ((Placeable) obj3).getHeight();
                    if (height < height2) {
                        obj2 = obj3;
                        height = height2;
                    }
                    if (i30 == lastIndex2) {
                        break;
                    }
                    i30++;
                }
            }
            obj = obj2;
        }
        Placeable placeable = (Placeable) obj;
        final int height3 = placeable != null ? placeable.getHeight() : Constraints.m9676getMinHeightimpl(j);
        return MeasureScope.CC.layout$default(measureScope, max2, height3, null, new Function1() { // from class: androidx.compose.material3.ButtonGroupMeasurePolicy$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj4) {
                Unit measure_3p2s80s$lambda$4;
                measure_3p2s80s$lambda$4 = ButtonGroupMeasurePolicy.measure_3p2s80s$lambda$4(arrayList2, measureScope, iArr5, list6, height3, this, iArr6, arrayList, intRef, (Placeable.PlacementScope) obj4);
                return measure_3p2s80s$lambda$4;
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit measure_3p2s80s$lambda$4(List list, MeasureScope measureScope, int[] iArr, List list2, int i, ButtonGroupMeasurePolicy buttonGroupMeasurePolicy, int[] iArr2, List list3, Ref.IntRef intRef, Placeable.PlacementScope placementScope) {
        int i2;
        int i3;
        List list4;
        int i4;
        Alignment.Vertical alignment;
        int size = list.size();
        for (int i5 = 0; i5 < size; i5++) {
            int i6 = WhenMappings.$EnumSwitchMapping$0[measureScope.getLayoutDirection().ordinal()];
            if (i6 == 1) {
                if (i5 > 0) {
                    i2 = iArr[i5 - 1];
                    i3 = iArr[i5];
                    i4 = i2 - i3;
                    list4 = list2;
                }
                list4 = list2;
                i4 = 0;
            } else {
                if (i6 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                if (i5 < CollectionsKt.getLastIndex(list)) {
                    i2 = iArr[i5 + 1];
                    i3 = iArr[i5];
                    i4 = i2 - i3;
                    list4 = list2;
                }
                list4 = list2;
                i4 = 0;
            }
            Object parentData = ((Measurable) list4.get(i5)).getParentData();
            ButtonGroupParentData buttonGroupParentData = parentData instanceof ButtonGroupParentData ? (ButtonGroupParentData) parentData : null;
            Placeable.PlacementScope.place$default(placementScope, (Placeable) list.get(i5), iArr2[i5] + i4, (buttonGroupParentData == null || (alignment = buttonGroupParentData.getAlignment()) == null) ? buttonGroupMeasurePolicy.verticalAlignment.align(((Placeable) list.get(i5)).getHeight(), i) : alignment.align(((Placeable) list.get(i5)).getHeight(), i), 0.0f, 4, null);
        }
        if (list3 != null) {
            int size2 = list3.size();
            for (int i7 = 0; i7 < size2; i7++) {
                Placeable placeable = (Placeable) list3.get(i7);
                Placeable.PlacementScope.placeRelative$default(placementScope, placeable, intRef.element, buttonGroupMeasurePolicy.verticalAlignment.align(placeable.getHeight(), i), 0.0f, 4, null);
            }
        }
        return Unit.INSTANCE;
    }
}
