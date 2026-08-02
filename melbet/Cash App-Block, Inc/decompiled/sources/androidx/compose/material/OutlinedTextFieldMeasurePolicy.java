package androidx.compose.material;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.ui.geometry.Size;
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
import androidx.compose.ui.unit.LayoutDirection;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.TransactorKt;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt__MathJVMKt;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes3.dex */
public final class OutlinedTextFieldMeasurePolicy implements MeasurePolicy {
    public final float animationProgress;
    public final Function1 onLabelMeasured;
    public final PaddingValues paddingValues;
    public final boolean singleLine;

    public OutlinedTextFieldMeasurePolicy(Function1 function1, boolean z, float f, PaddingValues paddingValues) {
        this.onLabelMeasured = function1;
        this.singleLine = z;
        this.animationProgress = f;
        this.paddingValues = paddingValues;
    }

    public final int intrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i, Function2 function2) {
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
        int intValue = obj5 != null ? ((Number) function2.invoke(obj5, Integer.valueOf(TransactorKt.lerp(i2, i, this.animationProgress)))).intValue() : 0;
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
                return OutlinedTextFieldKt.m494access$calculateHeightO3s9Psw(i3, i4, intValue2, intValue, obj8 != null ? ((Number) function2.invoke(obj8, Integer.valueOf(i2))).intValue() : 0, this.animationProgress, ConstraintsKt.Constraints$default(0, 0, 0, 0, 15), intrinsicMeasureScope.getDensity(), this.paddingValues);
            }
        }
        throw Recorder$$ExternalSyntheticOutline1.m("Collection contains no element matching the predicate.");
    }

    public final int intrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i, Function2 function2) {
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
                return OutlinedTextFieldKt.m495access$calculateWidthO3s9Psw(intValue4, intValue3, intValue, intValue2, intrinsicMeasurable4 != null ? ((Number) function2.invoke(intrinsicMeasurable4, Integer.valueOf(i))).intValue() : 0, this.animationProgress, ConstraintsKt.Constraints$default(0, 0, 0, 0, 15), intrinsicMeasureScope.getDensity(), this.paddingValues);
            }
        }
        throw Recorder$$ExternalSyntheticOutline1.m("Collection contains no element matching the predicate.");
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public final int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i) {
        return intrinsicHeight(intrinsicMeasureScope, list, i, new SnackbarHostKt$$ExternalSyntheticLambda2(20));
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public final int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i) {
        return intrinsicWidth(intrinsicMeasureScope, list, i, new SnackbarHostKt$$ExternalSyntheticLambda2(18));
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    /* renamed from: measure-3p2s80s */
    public final MeasureResult mo138measure3p2s80s(final MeasureScope measureScope, List list, long j) {
        Object obj;
        Object obj2;
        Object obj3;
        PaddingValues paddingValues;
        int i;
        long j2;
        List list2;
        String str;
        Object obj4;
        final OutlinedTextFieldMeasurePolicy outlinedTextFieldMeasurePolicy = this;
        PaddingValues paddingValues2 = outlinedTextFieldMeasurePolicy.paddingValues;
        int mo230roundToPx0680j_4 = measureScope.mo230roundToPx0680j_4(paddingValues2.mo264calculateBottomPaddingD9Ej5fM());
        long m1018copyZbe2FdA$default = Constraints.m1018copyZbe2FdA$default(j, 0, 0, 0, 0, 10);
        List list3 = list;
        int size = list3.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                obj = null;
                break;
            }
            obj = list.get(i2);
            if (Intrinsics.areEqual(RulerKt.getLayoutId((Measurable) obj), "Leading")) {
                break;
            }
            i2++;
        }
        Measurable measurable = (Measurable) obj;
        Placeable mo833measureBRTryo0 = measurable != null ? measurable.mo833measureBRTryo0(m1018copyZbe2FdA$default) : null;
        int i3 = mo833measureBRTryo0 != null ? mo833measureBRTryo0.width : 0;
        int size2 = list3.size();
        int i4 = 0;
        while (true) {
            if (i4 >= size2) {
                obj2 = null;
                break;
            }
            obj2 = list.get(i4);
            if (Intrinsics.areEqual(RulerKt.getLayoutId((Measurable) obj2), "Trailing")) {
                break;
            }
            i4++;
        }
        Measurable measurable2 = (Measurable) obj2;
        char c = 2;
        Placeable mo833measureBRTryo02 = measurable2 != null ? measurable2.mo833measureBRTryo0(ConstraintsKt.m1035offsetNN6EwU$default(-i3, 0, 2, m1018copyZbe2FdA$default)) : null;
        int i5 = i3 + (mo833measureBRTryo02 != null ? mo833measureBRTryo02.width : 0);
        int mo230roundToPx0680j_42 = measureScope.mo230roundToPx0680j_4(paddingValues2.mo266calculateRightPaddingu2uoSUM(measureScope.getLayoutDirection())) + measureScope.mo230roundToPx0680j_4(paddingValues2.mo265calculateLeftPaddingu2uoSUM(measureScope.getLayoutDirection()));
        int i6 = -i5;
        int i7 = -mo230roundToPx0680j_4;
        long m1034offsetNN6EwU = ConstraintsKt.m1034offsetNN6EwU(TransactorKt.lerp(i6 - mo230roundToPx0680j_42, -mo230roundToPx0680j_42, outlinedTextFieldMeasurePolicy.animationProgress), i7, m1018copyZbe2FdA$default);
        int size3 = list3.size();
        int i8 = 0;
        while (true) {
            if (i8 >= size3) {
                obj3 = null;
                break;
            }
            obj3 = list.get(i8);
            char c2 = c;
            if (Intrinsics.areEqual(RulerKt.getLayoutId((Measurable) obj3), "Label")) {
                break;
            }
            i8++;
            c = c2;
        }
        Measurable measurable3 = (Measurable) obj3;
        Placeable mo833measureBRTryo03 = measurable3 != null ? measurable3.mo833measureBRTryo0(m1034offsetNN6EwU) : null;
        if (mo833measureBRTryo03 != null) {
            float f = mo833measureBRTryo03.width;
            float f2 = mo833measureBRTryo03.height;
            long floatToRawIntBits = Float.floatToRawIntBits(f);
            int floatToRawIntBits2 = Float.floatToRawIntBits(f2);
            paddingValues = paddingValues2;
            i = i7;
            j2 = (floatToRawIntBits2 & BodyPartID.bodyIdMax) | (floatToRawIntBits << 32);
        } else {
            paddingValues = paddingValues2;
            i = i7;
            j2 = 0;
        }
        outlinedTextFieldMeasurePolicy.onLabelMeasured.invoke(new Size(j2));
        long m1018copyZbe2FdA$default2 = Constraints.m1018copyZbe2FdA$default(ConstraintsKt.m1034offsetNN6EwU(i6, i - Math.max((mo833measureBRTryo03 != null ? mo833measureBRTryo03.height : 0) / 2, measureScope.mo230roundToPx0680j_4(paddingValues.mo267calculateTopPaddingD9Ej5fM())), j), 0, 0, 0, 0, 11);
        int size4 = list3.size();
        int i9 = 0;
        while (true) {
            String str2 = "Collection contains no element matching the predicate.";
            if (i9 >= size4) {
                throw Recorder$$ExternalSyntheticOutline1.m("Collection contains no element matching the predicate.");
            }
            Measurable measurable4 = (Measurable) list.get(i9);
            if (Intrinsics.areEqual(RulerKt.getLayoutId(measurable4), "TextField")) {
                final Placeable mo833measureBRTryo04 = measurable4.mo833measureBRTryo0(m1018copyZbe2FdA$default2);
                long m1018copyZbe2FdA$default3 = Constraints.m1018copyZbe2FdA$default(m1018copyZbe2FdA$default2, 0, 0, 0, 0, 14);
                List list4 = list;
                int size5 = list4.size();
                int i10 = 0;
                while (true) {
                    if (i10 >= size5) {
                        list2 = list4;
                        str = str2;
                        obj4 = null;
                        break;
                    }
                    obj4 = list.get(i10);
                    list2 = list4;
                    str = str2;
                    if (Intrinsics.areEqual(RulerKt.getLayoutId((Measurable) obj4), "Hint")) {
                        break;
                    }
                    i10++;
                    list4 = list2;
                    str2 = str;
                }
                Measurable measurable5 = (Measurable) obj4;
                final Placeable mo833measureBRTryo05 = measurable5 != null ? measurable5.mo833measureBRTryo0(m1018copyZbe2FdA$default3) : null;
                final Placeable placeable = mo833measureBRTryo02;
                final int m495access$calculateWidthO3s9Psw = OutlinedTextFieldKt.m495access$calculateWidthO3s9Psw(mo833measureBRTryo0 != null ? mo833measureBRTryo0.width : 0, mo833measureBRTryo02 != null ? mo833measureBRTryo02.width : 0, mo833measureBRTryo04.width, mo833measureBRTryo03 != null ? mo833measureBRTryo03.width : 0, mo833measureBRTryo05 != null ? mo833measureBRTryo05.width : 0, outlinedTextFieldMeasurePolicy.animationProgress, j, measureScope.getDensity(), outlinedTextFieldMeasurePolicy.paddingValues);
                final int m494access$calculateHeightO3s9Psw = OutlinedTextFieldKt.m494access$calculateHeightO3s9Psw(mo833measureBRTryo0 != null ? mo833measureBRTryo0.height : 0, placeable != null ? placeable.height : 0, mo833measureBRTryo04.height, mo833measureBRTryo03 != null ? mo833measureBRTryo03.height : 0, mo833measureBRTryo05 != null ? mo833measureBRTryo05.height : 0, outlinedTextFieldMeasurePolicy.animationProgress, j, measureScope.getDensity(), outlinedTextFieldMeasurePolicy.paddingValues);
                int size6 = list2.size();
                int i11 = 0;
                while (i11 < size6) {
                    Measurable measurable6 = (Measurable) list.get(i11);
                    if (Intrinsics.areEqual(RulerKt.getLayoutId(measurable6), "border")) {
                        final Placeable mo833measureBRTryo06 = measurable6.mo833measureBRTryo0(ConstraintsKt.Constraints(m495access$calculateWidthO3s9Psw != Integer.MAX_VALUE ? m495access$calculateWidthO3s9Psw : 0, m495access$calculateWidthO3s9Psw, m494access$calculateHeightO3s9Psw != Integer.MAX_VALUE ? m494access$calculateHeightO3s9Psw : 0, m494access$calculateHeightO3s9Psw));
                        final Placeable placeable2 = mo833measureBRTryo0;
                        final Placeable placeable3 = mo833measureBRTryo03;
                        return MeasureScope.layout$default(measureScope, m495access$calculateWidthO3s9Psw, m494access$calculateHeightO3s9Psw, new Function1() { // from class: androidx.compose.material.OutlinedTextFieldMeasurePolicy$$ExternalSyntheticLambda4
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj5) {
                                Placeable.PlacementScope placementScope = (Placeable.PlacementScope) obj5;
                                OutlinedTextFieldMeasurePolicy outlinedTextFieldMeasurePolicy2 = outlinedTextFieldMeasurePolicy;
                                float f3 = outlinedTextFieldMeasurePolicy2.animationProgress;
                                boolean z = outlinedTextFieldMeasurePolicy2.singleLine;
                                MeasureScope measureScope2 = measureScope;
                                float density = measureScope2.getDensity();
                                LayoutDirection layoutDirection = measureScope2.getLayoutDirection();
                                PaddingValues paddingValues3 = outlinedTextFieldMeasurePolicy2.paddingValues;
                                int i12 = OutlinedTextFieldKt.$r8$clinit;
                                int roundToInt = MathKt__MathJVMKt.roundToInt(paddingValues3.mo267calculateTopPaddingD9Ej5fM() * density);
                                int roundToInt2 = MathKt__MathJVMKt.roundToInt(SpacerKt.calculateStartPadding(paddingValues3, layoutDirection) * density);
                                float f4 = 12.0f * density;
                                int i13 = m494access$calculateHeightO3s9Psw;
                                Placeable placeable4 = placeable2;
                                if (placeable4 != null) {
                                    placementScope.placeRelative(placeable4, 0, Recorder$$ExternalSyntheticOutline2.m(i13 - placeable4.height, 2.0f, 1.0f), RecyclerView.DECELERATION_RATE);
                                }
                                Placeable placeable5 = placeable;
                                if (placeable5 != null) {
                                    placementScope.placeRelative(placeable5, m495access$calculateWidthO3s9Psw - placeable5.width, Recorder$$ExternalSyntheticOutline2.m(i13 - placeable5.height, 2.0f, 1.0f), RecyclerView.DECELERATION_RATE);
                                }
                                Placeable placeable6 = placeable3;
                                if (placeable6 != null) {
                                    placementScope.placeRelative(placeable6, MathKt__MathJVMKt.roundToInt(placeable4 == null ? 0.0f : (1.0f - f3) * (placeable4.width - f4)) + roundToInt2, TransactorKt.lerp(z ? Recorder$$ExternalSyntheticOutline2.m(i13 - placeable6.height, 2.0f, 1.0f) : roundToInt, -(placeable6.height / 2), f3), RecyclerView.DECELERATION_RATE);
                                }
                                placementScope.placeRelative(mo833measureBRTryo04, placeable4 != null ? placeable4.width : 0, Math.max(z ? Recorder$$ExternalSyntheticOutline2.m(i13 - r0.height, 2.0f, 1.0f) : roundToInt, (placeable6 != null ? placeable6.height : 0) / 2), RecyclerView.DECELERATION_RATE);
                                Placeable placeable7 = mo833measureBRTryo05;
                                if (placeable7 != null) {
                                    if (z) {
                                        roundToInt = Recorder$$ExternalSyntheticOutline2.m(i13 - placeable7.height, 2.0f, 1.0f);
                                    }
                                    placementScope.placeRelative(placeable7, placeable4 != null ? placeable4.width : 0, Math.max(roundToInt, (placeable6 != null ? placeable6.height : 0) / 2), RecyclerView.DECELERATION_RATE);
                                }
                                Placeable.PlacementScope.m854place70tqf50$default(placementScope, mo833measureBRTryo06, 0L);
                                return Unit.INSTANCE;
                            }
                        });
                    }
                    i11++;
                    mo833measureBRTryo0 = mo833measureBRTryo0;
                    mo833measureBRTryo03 = mo833measureBRTryo03;
                    outlinedTextFieldMeasurePolicy = this;
                    placeable = placeable;
                }
                throw Recorder$$ExternalSyntheticOutline1.m(str);
            }
            i9++;
            mo833measureBRTryo0 = mo833measureBRTryo0;
            mo833measureBRTryo03 = mo833measureBRTryo03;
            outlinedTextFieldMeasurePolicy = this;
            m1018copyZbe2FdA$default2 = m1018copyZbe2FdA$default2;
        }
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public final int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i) {
        return intrinsicHeight(intrinsicMeasureScope, list, i, new SnackbarHostKt$$ExternalSyntheticLambda2(17));
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public final int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i) {
        return intrinsicWidth(intrinsicMeasureScope, list, i, new SnackbarHostKt$$ExternalSyntheticLambda2(19));
    }
}
