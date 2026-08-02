package androidx.compose.material;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.ui.layout.AlignmentLineKt;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.RulerKt;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt__MathJVMKt;

/* loaded from: classes3.dex */
public final class TextFieldMeasurePolicy implements MeasurePolicy {
    public final float animationProgress;
    public final PaddingValues paddingValues;
    public final boolean singleLine;

    public TextFieldMeasurePolicy(boolean z, float f, PaddingValues paddingValues) {
        this.singleLine = z;
        this.animationProgress = f;
        this.paddingValues = paddingValues;
    }

    public static int intrinsicWidth(List list, int i, Function2 function2) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        List list2 = list;
        int size = list2.size();
        for (int i2 = 0; i2 < size; i2++) {
            Object obj5 = list.get(i2);
            if (Intrinsics.areEqual(CardKt.getLayoutId((IntrinsicMeasurable) obj5), "TextField")) {
                int intValue = ((Number) function2.invoke(obj5, Integer.valueOf(i))).intValue();
                int size2 = list2.size();
                int i3 = 0;
                while (true) {
                    obj = null;
                    if (i3 >= size2) {
                        obj2 = null;
                        break;
                    }
                    obj2 = list.get(i3);
                    if (Intrinsics.areEqual(CardKt.getLayoutId((IntrinsicMeasurable) obj2), "Label")) {
                        break;
                    }
                    i3++;
                }
                IntrinsicMeasurable intrinsicMeasurable = (IntrinsicMeasurable) obj2;
                int intValue2 = intrinsicMeasurable != null ? ((Number) function2.invoke(intrinsicMeasurable, Integer.valueOf(i))).intValue() : 0;
                int size3 = list2.size();
                int i4 = 0;
                while (true) {
                    if (i4 >= size3) {
                        obj3 = null;
                        break;
                    }
                    obj3 = list.get(i4);
                    if (Intrinsics.areEqual(CardKt.getLayoutId((IntrinsicMeasurable) obj3), "Trailing")) {
                        break;
                    }
                    i4++;
                }
                IntrinsicMeasurable intrinsicMeasurable2 = (IntrinsicMeasurable) obj3;
                int intValue3 = intrinsicMeasurable2 != null ? ((Number) function2.invoke(intrinsicMeasurable2, Integer.valueOf(i))).intValue() : 0;
                int size4 = list2.size();
                int i5 = 0;
                while (true) {
                    if (i5 >= size4) {
                        obj4 = null;
                        break;
                    }
                    obj4 = list.get(i5);
                    if (Intrinsics.areEqual(CardKt.getLayoutId((IntrinsicMeasurable) obj4), "Leading")) {
                        break;
                    }
                    i5++;
                }
                IntrinsicMeasurable intrinsicMeasurable3 = (IntrinsicMeasurable) obj4;
                int intValue4 = intrinsicMeasurable3 != null ? ((Number) function2.invoke(intrinsicMeasurable3, Integer.valueOf(i))).intValue() : 0;
                int size5 = list2.size();
                int i6 = 0;
                while (true) {
                    if (i6 >= size5) {
                        break;
                    }
                    Object obj6 = list.get(i6);
                    if (Intrinsics.areEqual(CardKt.getLayoutId((IntrinsicMeasurable) obj6), "Hint")) {
                        obj = obj6;
                        break;
                    }
                    i6++;
                }
                IntrinsicMeasurable intrinsicMeasurable4 = (IntrinsicMeasurable) obj;
                return ConstraintsKt.m1033constrainWidthK40F9xA(Math.max(intValue, Math.max(intValue2, intrinsicMeasurable4 != null ? ((Number) function2.invoke(intrinsicMeasurable4, Integer.valueOf(i))).intValue() : 0)) + intValue4 + intValue3, ConstraintsKt.Constraints$default(0, 0, 0, 0, 15));
            }
        }
        throw Recorder$$ExternalSyntheticOutline1.m("Collection contains no element matching the predicate.");
    }

    public final int intrinsicHeight$1(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i, Function2 function2) {
        Object obj;
        Object obj2;
        int i2;
        int i3;
        Object obj3;
        int i4;
        Object obj4;
        List list2 = list;
        int size = list2.size();
        int i5 = 0;
        while (true) {
            obj = null;
            if (i5 >= size) {
                obj2 = null;
                break;
            }
            obj2 = list.get(i5);
            if (Intrinsics.areEqual(CardKt.getLayoutId((IntrinsicMeasurable) obj2), "Leading")) {
                break;
            }
            i5++;
        }
        IntrinsicMeasurable intrinsicMeasurable = (IntrinsicMeasurable) obj2;
        if (intrinsicMeasurable != null) {
            int maxIntrinsicWidth = intrinsicMeasurable.maxIntrinsicWidth(Integer.MAX_VALUE);
            if (i == Integer.MAX_VALUE) {
                i2 = i;
            } else {
                i2 = i - maxIntrinsicWidth;
                if (i2 < 0) {
                    i2 = 0;
                }
            }
            i3 = ((Number) function2.invoke(intrinsicMeasurable, Integer.valueOf(i))).intValue();
        } else {
            i2 = i;
            i3 = 0;
        }
        int size2 = list2.size();
        int i6 = 0;
        while (true) {
            if (i6 >= size2) {
                obj3 = null;
                break;
            }
            obj3 = list.get(i6);
            if (Intrinsics.areEqual(CardKt.getLayoutId((IntrinsicMeasurable) obj3), "Trailing")) {
                break;
            }
            i6++;
        }
        IntrinsicMeasurable intrinsicMeasurable2 = (IntrinsicMeasurable) obj3;
        if (intrinsicMeasurable2 != null) {
            int maxIntrinsicWidth2 = intrinsicMeasurable2.maxIntrinsicWidth(Integer.MAX_VALUE);
            if (i2 != Integer.MAX_VALUE && (i2 = i2 - maxIntrinsicWidth2) < 0) {
                i2 = 0;
            }
            i4 = ((Number) function2.invoke(intrinsicMeasurable2, Integer.valueOf(i))).intValue();
        } else {
            i4 = 0;
        }
        int size3 = list2.size();
        int i7 = 0;
        while (true) {
            if (i7 >= size3) {
                obj4 = null;
                break;
            }
            obj4 = list.get(i7);
            if (Intrinsics.areEqual(CardKt.getLayoutId((IntrinsicMeasurable) obj4), "Label")) {
                break;
            }
            i7++;
        }
        Object obj5 = (IntrinsicMeasurable) obj4;
        int intValue = obj5 != null ? ((Number) function2.invoke(obj5, Integer.valueOf(i2))).intValue() : 0;
        int size4 = list2.size();
        for (int i8 = 0; i8 < size4; i8++) {
            Object obj6 = list.get(i8);
            if (Intrinsics.areEqual(CardKt.getLayoutId((IntrinsicMeasurable) obj6), "TextField")) {
                int intValue2 = ((Number) function2.invoke(obj6, Integer.valueOf(i2))).intValue();
                int size5 = list2.size();
                int i9 = 0;
                while (true) {
                    if (i9 >= size5) {
                        break;
                    }
                    Object obj7 = list.get(i9);
                    if (Intrinsics.areEqual(CardKt.getLayoutId((IntrinsicMeasurable) obj7), "Hint")) {
                        obj = obj7;
                        break;
                    }
                    i9++;
                }
                Object obj8 = (IntrinsicMeasurable) obj;
                return CardKt.m475access$calculateHeightO3s9Psw(intValue2, intValue > 0, intValue, i3, i4, obj8 != null ? ((Number) function2.invoke(obj8, Integer.valueOf(i2))).intValue() : 0, ConstraintsKt.Constraints$default(0, 0, 0, 0, 15), intrinsicMeasureScope.getDensity(), this.paddingValues);
            }
        }
        throw Recorder$$ExternalSyntheticOutline1.m("Collection contains no element matching the predicate.");
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public final int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i) {
        return intrinsicHeight$1(intrinsicMeasureScope, list, i, new SnackbarHostKt$$ExternalSyntheticLambda2(24));
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public final int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i) {
        return intrinsicWidth(list, i, new SnackbarHostKt$$ExternalSyntheticLambda2(22));
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    /* renamed from: measure-3p2s80s */
    public final MeasureResult mo138measure3p2s80s(final MeasureScope measureScope, List list, long j) {
        Object obj;
        Object obj2;
        List list2;
        int i;
        int i2;
        final Placeable placeable;
        int i3;
        Object obj3;
        int i4;
        Object obj4;
        final TextFieldMeasurePolicy textFieldMeasurePolicy = this;
        List list3 = list;
        PaddingValues paddingValues = textFieldMeasurePolicy.paddingValues;
        int mo230roundToPx0680j_4 = measureScope.mo230roundToPx0680j_4(paddingValues.mo267calculateTopPaddingD9Ej5fM());
        int mo230roundToPx0680j_42 = measureScope.mo230roundToPx0680j_4(paddingValues.mo264calculateBottomPaddingD9Ej5fM());
        final int mo230roundToPx0680j_43 = measureScope.mo230roundToPx0680j_4(2.0f);
        long m1018copyZbe2FdA$default = Constraints.m1018copyZbe2FdA$default(j, 0, 0, 0, 0, 10);
        List list4 = list3;
        int size = list4.size();
        int i5 = 0;
        while (true) {
            if (i5 >= size) {
                obj = null;
                break;
            }
            obj = list3.get(i5);
            if (Intrinsics.areEqual(RulerKt.getLayoutId((Measurable) obj), "Leading")) {
                break;
            }
            i5++;
        }
        Measurable measurable = (Measurable) obj;
        final Placeable mo833measureBRTryo0 = measurable != null ? measurable.mo833measureBRTryo0(m1018copyZbe2FdA$default) : null;
        int i6 = mo833measureBRTryo0 != null ? mo833measureBRTryo0.width : 0;
        int size2 = list4.size();
        int i7 = 0;
        while (true) {
            if (i7 >= size2) {
                obj2 = null;
                break;
            }
            obj2 = list3.get(i7);
            if (Intrinsics.areEqual(RulerKt.getLayoutId((Measurable) obj2), "Trailing")) {
                break;
            }
            i7++;
        }
        Measurable measurable2 = (Measurable) obj2;
        if (measurable2 != null) {
            list2 = list4;
            i = i6;
            i2 = 0;
            placeable = measurable2.mo833measureBRTryo0(ConstraintsKt.m1035offsetNN6EwU$default(-i6, 0, 2, m1018copyZbe2FdA$default));
        } else {
            list2 = list4;
            i = i6;
            i2 = 0;
            placeable = null;
        }
        int i8 = -mo230roundToPx0680j_42;
        int i9 = -(i + (placeable != null ? placeable.width : i2));
        long m1034offsetNN6EwU = ConstraintsKt.m1034offsetNN6EwU(i9, i8, m1018copyZbe2FdA$default);
        int size3 = list2.size();
        int i10 = i2;
        while (true) {
            if (i10 >= size3) {
                i3 = mo230roundToPx0680j_42;
                obj3 = null;
                break;
            }
            obj3 = list3.get(i10);
            i3 = mo230roundToPx0680j_42;
            if (Intrinsics.areEqual(RulerKt.getLayoutId((Measurable) obj3), "Label")) {
                break;
            }
            i10++;
            mo230roundToPx0680j_42 = i3;
        }
        Measurable measurable3 = (Measurable) obj3;
        final Placeable mo833measureBRTryo02 = measurable3 != null ? measurable3.mo833measureBRTryo0(m1034offsetNN6EwU) : null;
        if (mo833measureBRTryo02 != null) {
            i4 = mo833measureBRTryo02.get(AlignmentLineKt.LastBaseline);
            if (i4 == Integer.MIN_VALUE) {
                i4 = mo833measureBRTryo02.height;
            }
        } else {
            i4 = 0;
        }
        final int max = Math.max(i4, mo230roundToPx0680j_4);
        long m1034offsetNN6EwU2 = ConstraintsKt.m1034offsetNN6EwU(i9, mo833measureBRTryo02 != null ? (i8 - mo230roundToPx0680j_43) - max : (-mo230roundToPx0680j_4) - i3, Constraints.m1018copyZbe2FdA$default(j, 0, 0, 0, 0, 11));
        int size4 = list2.size();
        int i11 = 0;
        while (i11 < size4) {
            Measurable measurable4 = (Measurable) list3.get(i11);
            final int i12 = mo230roundToPx0680j_4;
            if (Intrinsics.areEqual(RulerKt.getLayoutId(measurable4), "TextField")) {
                final Placeable mo833measureBRTryo03 = measurable4.mo833measureBRTryo0(m1034offsetNN6EwU2);
                long m1018copyZbe2FdA$default2 = Constraints.m1018copyZbe2FdA$default(m1034offsetNN6EwU2, 0, 0, 0, 0, 14);
                int size5 = list3.size();
                int i13 = 0;
                while (true) {
                    if (i13 >= size5) {
                        obj4 = null;
                        break;
                    }
                    obj4 = list3.get(i13);
                    if (Intrinsics.areEqual(RulerKt.getLayoutId((Measurable) obj4), "Hint")) {
                        break;
                    }
                    i13++;
                    list3 = list;
                }
                Measurable measurable5 = (Measurable) obj4;
                final Placeable mo833measureBRTryo04 = measurable5 != null ? measurable5.mo833measureBRTryo0(m1018copyZbe2FdA$default2) : null;
                final int m1033constrainWidthK40F9xA = ConstraintsKt.m1033constrainWidthK40F9xA(Math.max(mo833measureBRTryo03.width, Math.max(mo833measureBRTryo02 != null ? mo833measureBRTryo02.width : 0, mo833measureBRTryo04 != null ? mo833measureBRTryo04.width : 0)) + (mo833measureBRTryo0 != null ? mo833measureBRTryo0.width : 0) + (placeable != null ? placeable.width : 0), j);
                final int m475access$calculateHeightO3s9Psw = CardKt.m475access$calculateHeightO3s9Psw(mo833measureBRTryo03.height, mo833measureBRTryo02 != null, max, mo833measureBRTryo0 != null ? mo833measureBRTryo0.height : 0, placeable != null ? placeable.height : 0, mo833measureBRTryo04 != null ? mo833measureBRTryo04.height : 0, j, measureScope.getDensity(), textFieldMeasurePolicy.paddingValues);
                final int i14 = i4;
                return MeasureScope.layout$default(measureScope, m1033constrainWidthK40F9xA, m475access$calculateHeightO3s9Psw, new Function1() { // from class: androidx.compose.material.TextFieldMeasurePolicy$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj5) {
                        int i15;
                        float f;
                        float f2;
                        TextFieldMeasurePolicy textFieldMeasurePolicy2 = textFieldMeasurePolicy;
                        boolean z = textFieldMeasurePolicy2.singleLine;
                        Placeable.PlacementScope placementScope = (Placeable.PlacementScope) obj5;
                        Placeable placeable2 = Placeable.this;
                        int i16 = m1033constrainWidthK40F9xA;
                        int i17 = m475access$calculateHeightO3s9Psw;
                        Placeable placeable3 = mo833measureBRTryo03;
                        Placeable placeable4 = mo833measureBRTryo04;
                        Placeable placeable5 = mo833measureBRTryo0;
                        Placeable placeable6 = placeable;
                        MeasureScope measureScope2 = measureScope;
                        if (placeable2 != null) {
                            int i18 = i12 - i14;
                            if (i18 < 0) {
                                i18 = 0;
                            }
                            int i19 = max + mo230roundToPx0680j_43;
                            float f3 = textFieldMeasurePolicy2.animationProgress;
                            float density = measureScope2.getDensity();
                            if (placeable5 != null) {
                                placementScope.placeRelative(placeable5, 0, Recorder$$ExternalSyntheticOutline2.m(i17 - placeable5.height, 2.0f, 1.0f), RecyclerView.DECELERATION_RATE);
                            }
                            if (placeable6 != null) {
                                f2 = 2.0f;
                                placementScope.placeRelative(placeable6, i16 - placeable6.width, Recorder$$ExternalSyntheticOutline2.m(i17 - placeable6.height, 2.0f, 1.0f), RecyclerView.DECELERATION_RATE);
                            } else {
                                f2 = 2.0f;
                            }
                            placementScope.placeRelative(placeable2, placeable5 != null ? placeable5.width : 0, (z ? Recorder$$ExternalSyntheticOutline2.m(i17 - placeable2.height, f2, 1.0f) : MathKt__MathJVMKt.roundToInt(16.0f * density)) - MathKt__MathJVMKt.roundToInt((r1 - i18) * f3), RecyclerView.DECELERATION_RATE);
                            placementScope.placeRelative(placeable3, placeable5 != null ? placeable5.width : 0, i19, RecyclerView.DECELERATION_RATE);
                            if (placeable4 != null) {
                                placementScope.placeRelative(placeable4, placeable5 != null ? placeable5.width : 0, i19, RecyclerView.DECELERATION_RATE);
                            }
                        } else {
                            int roundToInt = MathKt__MathJVMKt.roundToInt(textFieldMeasurePolicy2.paddingValues.mo267calculateTopPaddingD9Ej5fM() * measureScope2.getDensity());
                            if (placeable5 != null) {
                                f = 2.0f;
                                i15 = 0;
                                placementScope.placeRelative(placeable5, 0, Recorder$$ExternalSyntheticOutline2.m(i17 - placeable5.height, 2.0f, 1.0f), RecyclerView.DECELERATION_RATE);
                            } else {
                                i15 = 0;
                                f = 2.0f;
                            }
                            if (placeable6 != null) {
                                placementScope.placeRelative(placeable6, i16 - placeable6.width, Recorder$$ExternalSyntheticOutline2.m(i17 - placeable6.height, f, 1.0f), RecyclerView.DECELERATION_RATE);
                            }
                            placementScope.placeRelative(placeable3, placeable5 != null ? placeable5.width : i15, z ? Recorder$$ExternalSyntheticOutline2.m(i17 - placeable3.height, f, 1.0f) : roundToInt, RecyclerView.DECELERATION_RATE);
                            if (placeable4 != null) {
                                if (z) {
                                    roundToInt = Recorder$$ExternalSyntheticOutline2.m(i17 - placeable4.height, 2.0f, 1.0f);
                                }
                                placementScope.placeRelative(placeable4, placeable5 != null ? placeable5.width : i15, roundToInt, RecyclerView.DECELERATION_RATE);
                            }
                        }
                        return Unit.INSTANCE;
                    }
                });
            }
            mo230roundToPx0680j_4 = i12;
            i11++;
            textFieldMeasurePolicy = this;
            list3 = list;
        }
        throw Recorder$$ExternalSyntheticOutline1.m("Collection contains no element matching the predicate.");
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public final int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i) {
        return intrinsicHeight$1(intrinsicMeasureScope, list, i, new SnackbarHostKt$$ExternalSyntheticLambda2(23));
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public final int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i) {
        return intrinsicWidth(list, i, new SnackbarHostKt$$ExternalSyntheticLambda2(25));
    }
}
