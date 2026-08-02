package androidx.compose.material3;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material.SnackbarHostKt$$ExternalSyntheticLambda2;
import androidx.compose.material3.internal.Icons$Filled;
import androidx.compose.material3.internal.TextFieldImplKt$sam$androidx_compose_material3_internal_FloatProducer$0;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.RulerKt;
import androidx.compose.ui.text.Savers_androidKt$$ExternalSyntheticLambda0;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.TransactorKt;
import java.util.List;
import kotlin.Unit;
import kotlin.comparisons.ComparisonsKt___ComparisonsJvmKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.math.MathKt__MathJVMKt;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes3.dex */
public final class OutlinedTextFieldMeasurePolicy implements MeasurePolicy {
    public final float horizontalIconPadding;
    public final TextFieldLabelPosition$Attached labelPosition;
    public final TextFieldImplKt$sam$androidx_compose_material3_internal_FloatProducer$0 labelProgress;
    public final Function1 onLabelMeasured;
    public final PaddingValues paddingValues;
    public final boolean singleLine;

    public OutlinedTextFieldMeasurePolicy(Function1 function1, boolean z, TextFieldLabelPosition$Attached textFieldLabelPosition$Attached, TextFieldImplKt$sam$androidx_compose_material3_internal_FloatProducer$0 textFieldImplKt$sam$androidx_compose_material3_internal_FloatProducer$0, PaddingValues paddingValues, float f) {
        this.onLabelMeasured = function1;
        this.singleLine = z;
        this.labelPosition = textFieldLabelPosition$Attached;
        this.labelProgress = textFieldImplKt$sam$androidx_compose_material3_internal_FloatProducer$0;
        this.paddingValues = paddingValues;
        this.horizontalIconPadding = f;
    }

    public static final int place$calculateVerticalPosition(int i, OutlinedTextFieldMeasurePolicy outlinedTextFieldMeasurePolicy, int i2, int i3, Placeable placeable, Placeable placeable2) {
        if (outlinedTextFieldMeasurePolicy.singleLine) {
            i3 = Recorder$$ExternalSyntheticOutline2.m(i2 - placeable2.height, 2.0f, 1.0f);
        }
        return Math.max(i + i3, (placeable != null ? placeable.height : 0) / 2);
    }

    /* renamed from: calculateHeight-mKXJcVc, reason: not valid java name */
    public final int m540calculateHeightmKXJcVc(IntrinsicMeasureScope intrinsicMeasureScope, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, long j, float f) {
        int maxOf = ComparisonsKt___ComparisonsJvmKt.maxOf(i5, i7, i3, i4, TransactorKt.lerp(i6, 0, f));
        PaddingValues paddingValues = this.paddingValues;
        float mo236toPx0680j_4 = intrinsicMeasureScope.mo236toPx0680j_4(paddingValues.mo267calculateTopPaddingD9Ej5fM());
        return ConstraintsKt.m1032constrainHeightK40F9xA(Math.max(i, Math.max(i2, MathKt__MathJVMKt.roundToInt(TransactorKt.lerp(mo236toPx0680j_4, Math.max(mo236toPx0680j_4, i6 / 2.0f), f) + maxOf + intrinsicMeasureScope.mo236toPx0680j_4(paddingValues.mo264calculateBottomPaddingD9Ej5fM())))) + i8, j);
    }

    /* renamed from: calculateWidth-IzADHW4, reason: not valid java name */
    public final int m541calculateWidthIzADHW4(IntrinsicMeasureScope intrinsicMeasureScope, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, float f) {
        int i8 = i3 + i4;
        int max = Math.max(i5 + i8, Math.max(i7 + i8, TransactorKt.lerp(i6, 0, f))) + i + i2;
        LayoutDirection layoutDirection = LayoutDirection.Ltr;
        PaddingValues paddingValues = this.paddingValues;
        return ConstraintsKt.m1033constrainWidthK40F9xA(Math.max(max, MathKt__MathJVMKt.roundToInt((i6 + intrinsicMeasureScope.mo236toPx0680j_4(paddingValues.mo266calculateRightPaddingu2uoSUM(layoutDirection) + paddingValues.mo265calculateLeftPaddingu2uoSUM(layoutDirection))) * f)), j);
    }

    public final int intrinsicHeight$2(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i, Function2 function2) {
        Object obj;
        int i2;
        int i3;
        Object obj2;
        int i4;
        Object obj3;
        Object obj4;
        int i5;
        Object obj5;
        int i6;
        int i7;
        Object obj6;
        Object obj7;
        OutlinedTextFieldMeasurePolicy outlinedTextFieldMeasurePolicy = this;
        float invoke = outlinedTextFieldMeasurePolicy.labelProgress.invoke();
        List list2 = list;
        int size = list2.size();
        int i8 = 0;
        while (true) {
            if (i8 >= size) {
                obj = null;
                break;
            }
            obj = list.get(i8);
            if (Intrinsics.areEqual(Icons$Filled.getLayoutId((IntrinsicMeasurable) obj), "Leading")) {
                break;
            }
            i8++;
        }
        IntrinsicMeasurable intrinsicMeasurable = (IntrinsicMeasurable) obj;
        if (intrinsicMeasurable != null) {
            i2 = Icons$Filled.subtractConstraintSafely(i, intrinsicMeasurable.maxIntrinsicWidth(Integer.MAX_VALUE));
            i3 = ((Number) function2.invoke(intrinsicMeasurable, Integer.valueOf(i))).intValue();
        } else {
            i2 = i;
            i3 = 0;
        }
        int size2 = list2.size();
        int i9 = 0;
        while (true) {
            if (i9 >= size2) {
                obj2 = null;
                break;
            }
            obj2 = list.get(i9);
            if (Intrinsics.areEqual(Icons$Filled.getLayoutId((IntrinsicMeasurable) obj2), "Trailing")) {
                break;
            }
            i9++;
        }
        IntrinsicMeasurable intrinsicMeasurable2 = (IntrinsicMeasurable) obj2;
        if (intrinsicMeasurable2 != null) {
            i2 = Icons$Filled.subtractConstraintSafely(i2, intrinsicMeasurable2.maxIntrinsicWidth(Integer.MAX_VALUE));
            i4 = ((Number) function2.invoke(intrinsicMeasurable2, Integer.valueOf(i))).intValue();
        } else {
            i4 = 0;
        }
        int size3 = list2.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size3) {
                obj3 = null;
                break;
            }
            obj3 = list.get(i10);
            if (Intrinsics.areEqual(Icons$Filled.getLayoutId((IntrinsicMeasurable) obj3), "Label")) {
                break;
            }
            i10++;
        }
        Object obj8 = (IntrinsicMeasurable) obj3;
        int intValue = obj8 != null ? ((Number) function2.invoke(obj8, Integer.valueOf(TransactorKt.lerp(i2, i, invoke)))).intValue() : 0;
        int size4 = list2.size();
        int i11 = 0;
        while (true) {
            if (i11 >= size4) {
                obj4 = null;
                break;
            }
            obj4 = list.get(i11);
            if (Intrinsics.areEqual(Icons$Filled.getLayoutId((IntrinsicMeasurable) obj4), "Prefix")) {
                break;
            }
            i11++;
        }
        IntrinsicMeasurable intrinsicMeasurable3 = (IntrinsicMeasurable) obj4;
        if (intrinsicMeasurable3 != null) {
            i5 = ((Number) function2.invoke(intrinsicMeasurable3, Integer.valueOf(i2))).intValue();
            i2 = Icons$Filled.subtractConstraintSafely(i2, intrinsicMeasurable3.maxIntrinsicWidth(Integer.MAX_VALUE));
        } else {
            i5 = 0;
        }
        int size5 = list2.size();
        int i12 = 0;
        while (true) {
            if (i12 >= size5) {
                obj5 = null;
                break;
            }
            obj5 = list.get(i12);
            if (Intrinsics.areEqual(Icons$Filled.getLayoutId((IntrinsicMeasurable) obj5), "Suffix")) {
                break;
            }
            i12++;
        }
        IntrinsicMeasurable intrinsicMeasurable4 = (IntrinsicMeasurable) obj5;
        if (intrinsicMeasurable4 != null) {
            i6 = ((Number) function2.invoke(intrinsicMeasurable4, Integer.valueOf(i2))).intValue();
            i2 = Icons$Filled.subtractConstraintSafely(i2, intrinsicMeasurable4.maxIntrinsicWidth(Integer.MAX_VALUE));
        } else {
            i6 = 0;
        }
        int size6 = list2.size();
        int i13 = 0;
        while (i13 < size6) {
            Object obj9 = list.get(i13);
            if (Intrinsics.areEqual(Icons$Filled.getLayoutId((IntrinsicMeasurable) obj9), "TextField")) {
                int intValue2 = ((Number) function2.invoke(obj9, Integer.valueOf(i2))).intValue();
                int size7 = list2.size();
                int i14 = 0;
                while (true) {
                    if (i14 >= size7) {
                        i7 = intValue2;
                        obj6 = null;
                        break;
                    }
                    obj6 = list.get(i14);
                    i7 = intValue2;
                    if (Intrinsics.areEqual(Icons$Filled.getLayoutId((IntrinsicMeasurable) obj6), "Hint")) {
                        break;
                    }
                    i14++;
                    intValue2 = i7;
                }
                Object obj10 = (IntrinsicMeasurable) obj6;
                int intValue3 = obj10 != null ? ((Number) function2.invoke(obj10, Integer.valueOf(i2))).intValue() : 0;
                int size8 = list2.size();
                int i15 = 0;
                while (true) {
                    if (i15 >= size8) {
                        obj7 = null;
                        break;
                    }
                    obj7 = list.get(i15);
                    if (Intrinsics.areEqual(Icons$Filled.getLayoutId((IntrinsicMeasurable) obj7), "Supporting")) {
                        break;
                    }
                    i15++;
                }
                Object obj11 = (IntrinsicMeasurable) obj7;
                return outlinedTextFieldMeasurePolicy.m540calculateHeightmKXJcVc(intrinsicMeasureScope, i3, i4, i5, i6, i7, intValue, intValue3, obj11 != null ? ((Number) function2.invoke(obj11, Integer.valueOf(i))).intValue() : 0, ConstraintsKt.Constraints$default(0, 0, 0, 0, 15), invoke);
            }
            i13++;
            i5 = i5;
            outlinedTextFieldMeasurePolicy = this;
        }
        throw Recorder$$ExternalSyntheticOutline1.m("Collection contains no element matching the predicate.");
    }

    public final int intrinsicWidth$1(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i, Function2 function2) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        List list2 = list;
        int size = list2.size();
        for (int i2 = 0; i2 < size; i2++) {
            Object obj7 = list.get(i2);
            if (Intrinsics.areEqual(Icons$Filled.getLayoutId((IntrinsicMeasurable) obj7), "TextField")) {
                int intValue = ((Number) function2.invoke(obj7, Integer.valueOf(i))).intValue();
                int size2 = list2.size();
                int i3 = 0;
                while (true) {
                    obj = null;
                    if (i3 >= size2) {
                        obj2 = null;
                        break;
                    }
                    obj2 = list.get(i3);
                    if (Intrinsics.areEqual(Icons$Filled.getLayoutId((IntrinsicMeasurable) obj2), "Label")) {
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
                    if (Intrinsics.areEqual(Icons$Filled.getLayoutId((IntrinsicMeasurable) obj3), "Trailing")) {
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
                    if (Intrinsics.areEqual(Icons$Filled.getLayoutId((IntrinsicMeasurable) obj4), "Leading")) {
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
                        obj5 = null;
                        break;
                    }
                    obj5 = list.get(i6);
                    if (Intrinsics.areEqual(Icons$Filled.getLayoutId((IntrinsicMeasurable) obj5), "Prefix")) {
                        break;
                    }
                    i6++;
                }
                IntrinsicMeasurable intrinsicMeasurable4 = (IntrinsicMeasurable) obj5;
                int intValue5 = intrinsicMeasurable4 != null ? ((Number) function2.invoke(intrinsicMeasurable4, Integer.valueOf(i))).intValue() : 0;
                int size6 = list2.size();
                int i7 = 0;
                while (true) {
                    if (i7 >= size6) {
                        obj6 = null;
                        break;
                    }
                    obj6 = list.get(i7);
                    if (Intrinsics.areEqual(Icons$Filled.getLayoutId((IntrinsicMeasurable) obj6), "Suffix")) {
                        break;
                    }
                    i7++;
                }
                IntrinsicMeasurable intrinsicMeasurable5 = (IntrinsicMeasurable) obj6;
                int intValue6 = intrinsicMeasurable5 != null ? ((Number) function2.invoke(intrinsicMeasurable5, Integer.valueOf(i))).intValue() : 0;
                int size7 = list2.size();
                int i8 = 0;
                while (true) {
                    if (i8 >= size7) {
                        break;
                    }
                    Object obj8 = list.get(i8);
                    if (Intrinsics.areEqual(Icons$Filled.getLayoutId((IntrinsicMeasurable) obj8), "Hint")) {
                        obj = obj8;
                        break;
                    }
                    i8++;
                }
                IntrinsicMeasurable intrinsicMeasurable6 = (IntrinsicMeasurable) obj;
                return m541calculateWidthIzADHW4(intrinsicMeasureScope, intValue4, intValue3, intValue5, intValue6, intValue, intValue2, intrinsicMeasurable6 != null ? ((Number) function2.invoke(intrinsicMeasurable6, Integer.valueOf(i))).intValue() : 0, ConstraintsKt.Constraints$default(0, 0, 0, 0, 15), this.labelProgress.invoke());
            }
        }
        throw Recorder$$ExternalSyntheticOutline1.m("Collection contains no element matching the predicate.");
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public final int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i) {
        return intrinsicHeight$2(intrinsicMeasureScope, list, i, new SnackbarHostKt$$ExternalSyntheticLambda2(29));
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public final int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i) {
        return intrinsicWidth$1(intrinsicMeasureScope, list, i, new SnackbarHostKt$$ExternalSyntheticLambda2(28));
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    /* renamed from: measure-3p2s80s */
    public final MeasureResult mo138measure3p2s80s(final MeasureScope measureScope, List list, long j) {
        Object obj;
        List list2;
        Object obj2;
        Placeable placeable;
        int i;
        Placeable placeable2;
        Object obj3;
        Placeable placeable3;
        Placeable placeable4;
        Object obj4;
        int i2;
        Placeable placeable5;
        Object obj5;
        Object obj6;
        int i3;
        Object obj7;
        Placeable placeable6;
        int i4;
        Placeable placeable7;
        int i5;
        Placeable placeable8;
        int i6;
        Placeable placeable9;
        Ref$ObjectRef ref$ObjectRef;
        int i7;
        Placeable placeable10;
        Placeable placeable11;
        Measurable measurable;
        Placeable placeable12;
        OutlinedTextFieldMeasurePolicy outlinedTextFieldMeasurePolicy;
        MeasureScope measureScope2;
        Placeable placeable13;
        Placeable placeable14;
        int i8;
        int i9;
        int i10;
        Placeable placeable15;
        int i11;
        int i12;
        OutlinedTextFieldMeasurePolicy outlinedTextFieldMeasurePolicy2;
        Placeable placeable16;
        Ref$ObjectRef ref$ObjectRef2;
        Placeable placeable17;
        int i13;
        MeasureScope measureScope3;
        float f;
        List list3 = list;
        float invoke = this.labelProgress.invoke();
        PaddingValues paddingValues = this.paddingValues;
        int mo230roundToPx0680j_4 = measureScope.mo230roundToPx0680j_4(paddingValues.mo264calculateBottomPaddingD9Ej5fM());
        long m1018copyZbe2FdA$default = Constraints.m1018copyZbe2FdA$default(j, 0, 0, 0, 0, 10);
        List list4 = list3;
        int size = list4.size();
        int i14 = 0;
        while (true) {
            if (i14 >= size) {
                obj = null;
                break;
            }
            obj = list3.get(i14);
            if (Intrinsics.areEqual(RulerKt.getLayoutId((Measurable) obj), "Leading")) {
                break;
            }
            i14++;
        }
        Measurable measurable2 = (Measurable) obj;
        Placeable mo833measureBRTryo0 = measurable2 != null ? measurable2.mo833measureBRTryo0(m1018copyZbe2FdA$default) : null;
        int i15 = mo833measureBRTryo0 != null ? mo833measureBRTryo0.width : 0;
        int max = Math.max(0, mo833measureBRTryo0 != null ? mo833measureBRTryo0.height : 0);
        int size2 = list4.size();
        int i16 = 0;
        while (true) {
            if (i16 >= size2) {
                list2 = list4;
                obj2 = null;
                break;
            }
            obj2 = list3.get(i16);
            list2 = list4;
            if (Intrinsics.areEqual(RulerKt.getLayoutId((Measurable) obj2), "Trailing")) {
                break;
            }
            i16++;
            list4 = list2;
        }
        Measurable measurable3 = (Measurable) obj2;
        if (measurable3 != null) {
            placeable = mo833measureBRTryo0;
            i = i15;
            placeable2 = measurable3.mo833measureBRTryo0(ConstraintsKt.m1035offsetNN6EwU$default(-i15, 0, 2, m1018copyZbe2FdA$default));
        } else {
            placeable = mo833measureBRTryo0;
            i = i15;
            placeable2 = null;
        }
        int i17 = i + (placeable2 != null ? placeable2.width : 0);
        int max2 = Math.max(max, placeable2 != null ? placeable2.height : 0);
        int size3 = list2.size();
        int i18 = 0;
        while (true) {
            if (i18 >= size3) {
                obj3 = null;
                break;
            }
            obj3 = list3.get(i18);
            int i19 = size3;
            if (Intrinsics.areEqual(RulerKt.getLayoutId((Measurable) obj3), "Prefix")) {
                break;
            }
            i18++;
            size3 = i19;
        }
        Measurable measurable4 = (Measurable) obj3;
        if (measurable4 != null) {
            placeable3 = placeable2;
            placeable4 = measurable4.mo833measureBRTryo0(ConstraintsKt.m1035offsetNN6EwU$default(-i17, 0, 2, m1018copyZbe2FdA$default));
        } else {
            placeable3 = placeable2;
            placeable4 = null;
        }
        int i20 = i17 + (placeable4 != null ? placeable4.width : 0);
        int max3 = Math.max(max2, placeable4 != null ? placeable4.height : 0);
        int size4 = list2.size();
        int i21 = 0;
        while (true) {
            if (i21 >= size4) {
                obj4 = null;
                break;
            }
            obj4 = list3.get(i21);
            int i22 = size4;
            if (Intrinsics.areEqual(RulerKt.getLayoutId((Measurable) obj4), "Suffix")) {
                break;
            }
            i21++;
            size4 = i22;
        }
        Measurable measurable5 = (Measurable) obj4;
        if (measurable5 != null) {
            i2 = i20;
            placeable5 = measurable5.mo833measureBRTryo0(ConstraintsKt.m1035offsetNN6EwU$default(-i20, 0, 2, m1018copyZbe2FdA$default));
        } else {
            i2 = i20;
            placeable5 = null;
        }
        int i23 = i2 + (placeable5 != null ? placeable5.width : 0);
        int max4 = Math.max(max3, placeable5 != null ? placeable5.height : 0);
        int size5 = list2.size();
        int i24 = 0;
        while (true) {
            if (i24 >= size5) {
                obj5 = null;
                break;
            }
            obj5 = list3.get(i24);
            int i25 = size5;
            int i26 = i24;
            if (Intrinsics.areEqual(RulerKt.getLayoutId((Measurable) obj5), "Label")) {
                break;
            }
            i24 = i26 + 1;
            size5 = i25;
        }
        Measurable measurable6 = (Measurable) obj5;
        Ref$ObjectRef ref$ObjectRef3 = new Ref$ObjectRef();
        int mo230roundToPx0680j_42 = measureScope.mo230roundToPx0680j_4(paddingValues.mo266calculateRightPaddingu2uoSUM(measureScope.getLayoutDirection())) + measureScope.mo230roundToPx0680j_4(paddingValues.mo265calculateLeftPaddingu2uoSUM(measureScope.getLayoutDirection()));
        int i27 = -TransactorKt.lerp(i23 + mo230roundToPx0680j_42, mo230roundToPx0680j_42, invoke);
        int i28 = -mo230roundToPx0680j_4;
        Placeable mo833measureBRTryo02 = measurable6 != null ? measurable6.mo833measureBRTryo0(ConstraintsKt.m1034offsetNN6EwU(i27, i28, m1018copyZbe2FdA$default)) : null;
        ref$ObjectRef3.element = mo833measureBRTryo02;
        this.onLabelMeasured.invoke(new Size(mo833measureBRTryo02 != null ? (Float.floatToRawIntBits(mo833measureBRTryo02.width) << 32) | (Float.floatToRawIntBits(mo833measureBRTryo02.height) & BodyPartID.bodyIdMax) : 0L));
        int size6 = list2.size();
        int i29 = 0;
        while (true) {
            if (i29 >= size6) {
                obj6 = null;
                break;
            }
            obj6 = list3.get(i29);
            int i30 = size6;
            if (Intrinsics.areEqual(RulerKt.getLayoutId((Measurable) obj6), "Supporting")) {
                break;
            }
            i29++;
            size6 = i30;
        }
        Measurable measurable7 = (Measurable) obj6;
        int minIntrinsicHeight = measurable7 != null ? measurable7.minIntrinsicHeight(Constraints.m1027getMinWidthimpl(j)) : 0;
        Placeable placeable18 = (Placeable) ref$ObjectRef3.element;
        int max5 = Math.max((placeable18 != null ? placeable18.height : 0) / 2, measureScope.mo230roundToPx0680j_4(paddingValues.mo267calculateTopPaddingD9Ej5fM()));
        int i31 = (i28 - max5) - minIntrinsicHeight;
        Measurable measurable8 = measurable7;
        long m1018copyZbe2FdA$default2 = Constraints.m1018copyZbe2FdA$default(ConstraintsKt.m1034offsetNN6EwU(-i23, i31, j), 0, 0, 0, 0, 11);
        int size7 = list2.size();
        int i32 = 0;
        while (i32 < size7) {
            Measurable measurable9 = (Measurable) list3.get(i32);
            int i33 = i32;
            Measurable measurable10 = measurable8;
            if (Intrinsics.areEqual(RulerKt.getLayoutId(measurable9), "TextField")) {
                Placeable mo833measureBRTryo03 = measurable9.mo833measureBRTryo0(m1018copyZbe2FdA$default2);
                long m1018copyZbe2FdA$default3 = Constraints.m1018copyZbe2FdA$default(m1018copyZbe2FdA$default2, 0, 0, 0, 0, 14);
                List list5 = list3;
                int size8 = list5.size();
                int i34 = 0;
                while (true) {
                    if (i34 >= size8) {
                        i3 = max5;
                        obj7 = null;
                        break;
                    }
                    obj7 = list3.get(i34);
                    i3 = max5;
                    int i35 = size8;
                    if (Intrinsics.areEqual(RulerKt.getLayoutId((Measurable) obj7), "Hint")) {
                        break;
                    }
                    i34++;
                    size8 = i35;
                    max5 = i3;
                }
                Measurable measurable11 = (Measurable) obj7;
                Placeable mo833measureBRTryo04 = measurable11 != null ? measurable11.mo833measureBRTryo0(m1018copyZbe2FdA$default3) : null;
                int max6 = Math.max(max4, Math.max(mo833measureBRTryo03.height, mo833measureBRTryo04 != null ? mo833measureBRTryo04.height : 0) + i3 + mo230roundToPx0680j_4);
                int i36 = placeable != null ? placeable.width : 0;
                Placeable placeable19 = placeable3;
                int i37 = placeable3 != null ? placeable19.width : 0;
                if (placeable4 != null) {
                    placeable6 = placeable4;
                    i4 = placeable4.width;
                } else {
                    placeable6 = placeable4;
                    i4 = 0;
                }
                if (placeable5 != null) {
                    placeable7 = placeable19;
                    i5 = placeable5.width;
                } else {
                    placeable7 = placeable19;
                    i5 = 0;
                }
                Placeable placeable20 = placeable5;
                int i38 = mo833measureBRTryo03.width;
                Placeable placeable21 = (Placeable) ref$ObjectRef3.element;
                if (placeable21 != null) {
                    Placeable placeable22 = placeable6;
                    i6 = placeable21.width;
                    placeable8 = placeable22;
                } else {
                    placeable8 = placeable6;
                    i6 = 0;
                }
                if (mo833measureBRTryo04 != null) {
                    ref$ObjectRef = ref$ObjectRef3;
                    placeable9 = placeable8;
                    i7 = mo833measureBRTryo04.width;
                    placeable10 = mo833measureBRTryo04;
                    placeable11 = placeable20;
                    measurable = measurable10;
                    placeable12 = mo833measureBRTryo03;
                    measureScope2 = measureScope;
                    placeable13 = placeable;
                    outlinedTextFieldMeasurePolicy = this;
                } else {
                    placeable9 = placeable8;
                    ref$ObjectRef = ref$ObjectRef3;
                    i7 = 0;
                    placeable10 = mo833measureBRTryo04;
                    placeable11 = placeable20;
                    measurable = measurable10;
                    placeable12 = mo833measureBRTryo03;
                    outlinedTextFieldMeasurePolicy = this;
                    measureScope2 = measureScope;
                    placeable13 = placeable;
                }
                final int m541calculateWidthIzADHW4 = outlinedTextFieldMeasurePolicy.m541calculateWidthIzADHW4(measureScope2, i36, i37, i4, i5, i38, i6, i7, j, invoke);
                final Placeable mo833measureBRTryo05 = measurable != null ? measurable.mo833measureBRTryo0(Constraints.m1018copyZbe2FdA$default(ConstraintsKt.m1035offsetNN6EwU$default(0, -max6, 1, m1018copyZbe2FdA$default), 0, m541calculateWidthIzADHW4, 0, 0, 9)) : null;
                int i39 = mo833measureBRTryo05 != null ? mo833measureBRTryo05.height : 0;
                Placeable placeable23 = placeable13;
                int i40 = placeable13 != null ? placeable23.height : 0;
                final Placeable placeable24 = placeable7;
                int i41 = placeable7 != null ? placeable24.height : 0;
                Placeable placeable25 = placeable9;
                int i42 = placeable25 != null ? placeable25.height : 0;
                Placeable placeable26 = placeable11;
                int i43 = placeable26 != null ? placeable26.height : 0;
                Placeable placeable27 = placeable12;
                int i44 = placeable27.height;
                Ref$ObjectRef ref$ObjectRef4 = ref$ObjectRef;
                Placeable placeable28 = (Placeable) ref$ObjectRef4.element;
                int i45 = placeable28 != null ? placeable28.height : 0;
                int i46 = i39;
                final Placeable placeable29 = placeable10;
                if (placeable29 != null) {
                    placeable14 = placeable26;
                    i8 = i43;
                    i9 = i44;
                    i10 = placeable29.height;
                } else {
                    placeable14 = placeable26;
                    i8 = i43;
                    i9 = i44;
                    i10 = 0;
                }
                if (mo833measureBRTryo05 != null) {
                    placeable15 = placeable27;
                    i11 = i45;
                    i12 = mo833measureBRTryo05.height;
                    placeable16 = placeable25;
                    ref$ObjectRef2 = ref$ObjectRef4;
                    placeable17 = placeable23;
                    i13 = 0;
                    measureScope3 = measureScope;
                    f = invoke;
                    outlinedTextFieldMeasurePolicy2 = this;
                } else {
                    placeable15 = placeable27;
                    i11 = i45;
                    i12 = 0;
                    outlinedTextFieldMeasurePolicy2 = this;
                    placeable16 = placeable25;
                    ref$ObjectRef2 = ref$ObjectRef4;
                    placeable17 = placeable23;
                    i13 = 0;
                    measureScope3 = measureScope;
                    f = invoke;
                }
                final int m540calculateHeightmKXJcVc = outlinedTextFieldMeasurePolicy2.m540calculateHeightmKXJcVc(measureScope3, i40, i41, i42, i8, i9, i11, i10, i12, j, f);
                final float f2 = f;
                int i47 = m540calculateHeightmKXJcVc - i46;
                int size9 = list5.size();
                int i48 = i13;
                while (i48 < size9) {
                    Measurable measurable12 = (Measurable) list.get(i48);
                    if (Intrinsics.areEqual(RulerKt.getLayoutId(measurable12), "Container")) {
                        final Placeable mo833measureBRTryo06 = measurable12.mo833measureBRTryo0(ConstraintsKt.Constraints(m541calculateWidthIzADHW4 != Integer.MAX_VALUE ? m541calculateWidthIzADHW4 : i13, m541calculateWidthIzADHW4, i47 != Integer.MAX_VALUE ? i47 : i13, i47));
                        final Placeable placeable30 = placeable17;
                        final Placeable placeable31 = placeable15;
                        final Placeable placeable32 = placeable16;
                        final Placeable placeable33 = placeable14;
                        final Ref$ObjectRef ref$ObjectRef5 = ref$ObjectRef2;
                        return MeasureScope.layout$default(measureScope, m541calculateWidthIzADHW4, m540calculateHeightmKXJcVc, new Function1() { // from class: androidx.compose.material3.OutlinedTextFieldMeasurePolicy$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj8) {
                                OutlinedTextFieldMeasurePolicy outlinedTextFieldMeasurePolicy3;
                                float f3;
                                int i49;
                                int i50;
                                OutlinedTextFieldMeasurePolicy outlinedTextFieldMeasurePolicy4;
                                int i51;
                                float f4;
                                float f5;
                                float f6;
                                int i52;
                                float f7;
                                float f8;
                                float f9;
                                float f10;
                                Placeable.PlacementScope placementScope = (Placeable.PlacementScope) obj8;
                                Placeable placeable34 = (Placeable) ref$ObjectRef5.element;
                                MeasureScope measureScope4 = measureScope;
                                float density = measureScope4.getDensity();
                                LayoutDirection layoutDirection = measureScope4.getLayoutDirection();
                                OutlinedTextFieldMeasurePolicy outlinedTextFieldMeasurePolicy5 = OutlinedTextFieldMeasurePolicy.this;
                                float mo236toPx0680j_4 = measureScope4.mo236toPx0680j_4(outlinedTextFieldMeasurePolicy5.horizontalIconPadding);
                                TextFieldLabelPosition$Attached textFieldLabelPosition$Attached = outlinedTextFieldMeasurePolicy5.labelPosition;
                                PaddingValues paddingValues2 = outlinedTextFieldMeasurePolicy5.paddingValues;
                                placementScope.place(mo833measureBRTryo06, 0, 0, RecyclerView.DECELERATION_RATE);
                                Placeable placeable35 = mo833measureBRTryo05;
                                int i53 = m540calculateHeightmKXJcVc - (placeable35 != null ? placeable35.height : 0);
                                int roundToInt = MathKt__MathJVMKt.roundToInt(paddingValues2.mo267calculateTopPaddingD9Ej5fM() * density);
                                Placeable placeable36 = placeable30;
                                if (placeable36 != null) {
                                    placementScope.placeRelative(placeable36, 0, Recorder$$ExternalSyntheticOutline2.m(i53 - placeable36.height, 2.0f, 1.0f), RecyclerView.DECELERATION_RATE);
                                }
                                int i54 = m541calculateWidthIzADHW4;
                                Placeable placeable37 = placeable24;
                                if (placeable34 != null) {
                                    if (outlinedTextFieldMeasurePolicy5.singleLine) {
                                        f6 = mo236toPx0680j_4;
                                        outlinedTextFieldMeasurePolicy3 = outlinedTextFieldMeasurePolicy5;
                                        i52 = Recorder$$ExternalSyntheticOutline2.m(i53 - placeable34.height, 2.0f, 1.0f);
                                    } else {
                                        f6 = mo236toPx0680j_4;
                                        outlinedTextFieldMeasurePolicy3 = outlinedTextFieldMeasurePolicy5;
                                        i52 = roundToInt;
                                    }
                                    int i55 = -(placeable34.height / 2);
                                    float f11 = f2;
                                    int lerp = TransactorKt.lerp(i52, i55, f11);
                                    float calculateStartPadding = SpacerKt.calculateStartPadding(paddingValues2, layoutDirection) * density;
                                    float calculateEndPadding = SpacerKt.calculateEndPadding(paddingValues2, layoutDirection) * density;
                                    if (placeable36 == null) {
                                        f8 = calculateStartPadding;
                                        f7 = RecyclerView.DECELERATION_RATE;
                                    } else {
                                        float f12 = placeable36.width;
                                        float f13 = calculateStartPadding - f6;
                                        f7 = RecyclerView.DECELERATION_RATE;
                                        if (f13 < RecyclerView.DECELERATION_RATE) {
                                            f13 = 0.0f;
                                        }
                                        f8 = f12 + f13;
                                    }
                                    if (placeable37 == null) {
                                        f9 = calculateStartPadding;
                                        f10 = calculateEndPadding;
                                    } else {
                                        f9 = calculateStartPadding;
                                        float f14 = placeable37.width;
                                        float f15 = calculateEndPadding - f6;
                                        if (f15 < f7) {
                                            f15 = RecyclerView.DECELERATION_RATE;
                                        }
                                        f10 = f14 + f15;
                                    }
                                    LayoutDirection layoutDirection2 = LayoutDirection.Ltr;
                                    int roundToInt2 = MathKt__MathJVMKt.roundToInt(TransactorKt.lerp(textFieldLabelPosition$Attached.expandedAlignment.align(placeable34.width, i54 - MathKt__MathJVMKt.roundToInt(f8 + f10), layoutDirection) + (layoutDirection == layoutDirection2 ? f8 : f10), ((BiasAlignment.Horizontal) Icons$Filled.getMinimizedAlignment(textFieldLabelPosition$Attached)).align(placeable34.width, i54 - MathKt__MathJVMKt.roundToInt(f9 + calculateEndPadding), layoutDirection) + (layoutDirection == layoutDirection2 ? f9 : calculateEndPadding), f11));
                                    f3 = RecyclerView.DECELERATION_RATE;
                                    placementScope.place(placeable34, roundToInt2, lerp, RecyclerView.DECELERATION_RATE);
                                } else {
                                    outlinedTextFieldMeasurePolicy3 = outlinedTextFieldMeasurePolicy5;
                                    f3 = RecyclerView.DECELERATION_RATE;
                                }
                                Placeable placeable38 = placeable32;
                                if (placeable38 != null) {
                                    i49 = roundToInt;
                                    i50 = i53;
                                    outlinedTextFieldMeasurePolicy4 = outlinedTextFieldMeasurePolicy3;
                                    i51 = 0;
                                    f4 = 2.0f;
                                    placementScope.placeRelative(placeable38, placeable36 != null ? placeable36.width : 0, OutlinedTextFieldMeasurePolicy.place$calculateVerticalPosition(0, outlinedTextFieldMeasurePolicy4, i50, i49, placeable34, placeable38), f3);
                                } else {
                                    i49 = roundToInt;
                                    i50 = i53;
                                    outlinedTextFieldMeasurePolicy4 = outlinedTextFieldMeasurePolicy3;
                                    i51 = 0;
                                    f4 = 2.0f;
                                }
                                int i56 = (placeable36 != null ? placeable36.width : 0) + (placeable38 != null ? placeable38.width : 0);
                                Placeable placeable39 = placeable31;
                                placementScope.placeRelative(placeable39, i56, OutlinedTextFieldMeasurePolicy.place$calculateVerticalPosition(i51, outlinedTextFieldMeasurePolicy4, i50, i49, placeable34, placeable39), RecyclerView.DECELERATION_RATE);
                                Placeable placeable40 = placeable29;
                                if (placeable40 != null) {
                                    placementScope.placeRelative(placeable40, i56, OutlinedTextFieldMeasurePolicy.place$calculateVerticalPosition(i51, outlinedTextFieldMeasurePolicy4, i50, i49, placeable34, placeable40), RecyclerView.DECELERATION_RATE);
                                }
                                Placeable placeable41 = placeable33;
                                if (placeable41 != null) {
                                    int i57 = (i54 - (placeable37 != null ? placeable37.width : 0)) - placeable41.width;
                                    int place$calculateVerticalPosition = OutlinedTextFieldMeasurePolicy.place$calculateVerticalPosition(i51, outlinedTextFieldMeasurePolicy4, i50, i49, placeable34, placeable41);
                                    f5 = RecyclerView.DECELERATION_RATE;
                                    placementScope.placeRelative(placeable41, i57, place$calculateVerticalPosition, RecyclerView.DECELERATION_RATE);
                                } else {
                                    f5 = RecyclerView.DECELERATION_RATE;
                                }
                                if (placeable37 != null) {
                                    placementScope.placeRelative(placeable37, i54 - placeable37.width, Recorder$$ExternalSyntheticOutline2.m(i50 - placeable37.height, f4, 1.0f), f5);
                                }
                                if (placeable35 != null) {
                                    placementScope.placeRelative(placeable35, 0, i50, f5);
                                }
                                return Unit.INSTANCE;
                            }
                        });
                    }
                    i48++;
                    m540calculateHeightmKXJcVc = m540calculateHeightmKXJcVc;
                }
                throw Recorder$$ExternalSyntheticOutline1.m("Collection contains no element matching the predicate.");
            }
            i32 = i33 + 1;
            measurable8 = measurable10;
            list3 = list3;
            max5 = max5;
        }
        throw Recorder$$ExternalSyntheticOutline1.m("Collection contains no element matching the predicate.");
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public final int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i) {
        return intrinsicHeight$2(intrinsicMeasureScope, list, i, new SnackbarHostKt$$ExternalSyntheticLambda2(27));
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public final int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i) {
        return intrinsicWidth$1(intrinsicMeasureScope, list, i, new Savers_androidKt$$ExternalSyntheticLambda0((byte) 0, 1));
    }
}
