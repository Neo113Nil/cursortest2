package androidx.compose.material3;

import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.InlineClassHelperKt;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.math.MathKt__MathJVMKt;

/* loaded from: classes3.dex */
public final class AlertDialogKt$AlertDialogFlowRow$1$1 implements MeasurePolicy {
    public final /* synthetic */ float $crossAxisSpacing;
    public final /* synthetic */ float $mainAxisSpacing;
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ AlertDialogKt$AlertDialogFlowRow$1$1(float f, float f2, int i) {
        this.$r8$classId = i;
        this.$mainAxisSpacing = f;
        this.$crossAxisSpacing = f2;
    }

    public static final void measure_3p2s80s$startNewSequence(ArrayList arrayList, Ref$IntRef ref$IntRef, MeasureScope measureScope, float f, ArrayList arrayList2, ArrayList arrayList3, Ref$IntRef ref$IntRef2, ArrayList arrayList4, Ref$IntRef ref$IntRef3, Ref$IntRef ref$IntRef4) {
        if (!arrayList.isEmpty()) {
            ref$IntRef.element = measureScope.mo230roundToPx0680j_4(f) + ref$IntRef.element;
        }
        arrayList.add(0, CollectionsKt.toList(arrayList2));
        arrayList3.add(Integer.valueOf(ref$IntRef2.element));
        arrayList4.add(Integer.valueOf(ref$IntRef.element));
        ref$IntRef.element += ref$IntRef2.element;
        ref$IntRef3.element = Math.max(ref$IntRef3.element, ref$IntRef4.element);
        arrayList2.clear();
        ref$IntRef4.element = 0;
        ref$IntRef2.element = 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00f8 A[SYNTHETIC] */
    @Override // androidx.compose.ui.layout.MeasurePolicy
    /* renamed from: measure-3p2s80s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final MeasureResult mo138measure3p2s80s(final MeasureScope measureScope, List list, final long j) {
        int i;
        Placeable placeable;
        List list2 = list;
        switch (this.$r8$classId) {
            case 0:
                final ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                final ArrayList arrayList3 = new ArrayList();
                Ref$IntRef ref$IntRef = new Ref$IntRef();
                Ref$IntRef ref$IntRef2 = new Ref$IntRef();
                ArrayList arrayList4 = new ArrayList();
                Ref$IntRef ref$IntRef3 = new Ref$IntRef();
                Ref$IntRef ref$IntRef4 = new Ref$IntRef();
                int i2 = 0;
                for (int size = list2.size(); i2 < size; size = i) {
                    Placeable mo833measureBRTryo0 = ((Measurable) list2.get(i2)).mo833measureBRTryo0(j);
                    boolean isEmpty = arrayList4.isEmpty();
                    float f = this.$mainAxisSpacing;
                    if (!isEmpty) {
                        ArrayList arrayList5 = arrayList;
                        Ref$IntRef ref$IntRef5 = ref$IntRef2;
                        if (measureScope.mo230roundToPx0680j_4(f) + ref$IntRef3.element + mo833measureBRTryo0.width <= Constraints.m1025getMaxWidthimpl(j)) {
                            arrayList = arrayList5;
                            ref$IntRef2 = ref$IntRef5;
                        } else {
                            i = size;
                            ref$IntRef2 = ref$IntRef5;
                            placeable = mo833measureBRTryo0;
                            arrayList = arrayList5;
                            measure_3p2s80s$startNewSequence(arrayList, ref$IntRef2, measureScope, this.$crossAxisSpacing, arrayList4, arrayList2, ref$IntRef4, arrayList3, ref$IntRef, ref$IntRef3);
                            if (arrayList4.isEmpty()) {
                                ref$IntRef3.element = measureScope.mo230roundToPx0680j_4(f) + ref$IntRef3.element;
                            }
                            arrayList4.add(placeable);
                            ref$IntRef3.element += placeable.width;
                            ref$IntRef4.element = Math.max(ref$IntRef4.element, placeable.height);
                            i2++;
                            list2 = list;
                        }
                    }
                    i = size;
                    placeable = mo833measureBRTryo0;
                    if (arrayList4.isEmpty()) {
                    }
                    arrayList4.add(placeable);
                    ref$IntRef3.element += placeable.width;
                    ref$IntRef4.element = Math.max(ref$IntRef4.element, placeable.height);
                    i2++;
                    list2 = list;
                }
                if (!arrayList4.isEmpty()) {
                    measure_3p2s80s$startNewSequence(arrayList, ref$IntRef2, measureScope, this.$crossAxisSpacing, arrayList4, arrayList2, ref$IntRef4, arrayList3, ref$IntRef, ref$IntRef3);
                }
                final int max = Math.max(ref$IntRef.element, Constraints.m1027getMinWidthimpl(j));
                int max2 = Math.max(ref$IntRef2.element, Constraints.m1026getMinHeightimpl(j));
                final float f2 = this.$mainAxisSpacing;
                return MeasureScope.layout$default(measureScope, max, max2, new Function1() { // from class: androidx.compose.material3.AlertDialogKt$AlertDialogFlowRow$1$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        MeasureScope measureScope2;
                        Placeable.PlacementScope placementScope = (Placeable.PlacementScope) obj;
                        ArrayList arrayList6 = arrayList;
                        int size2 = arrayList6.size();
                        for (int i3 = 0; i3 < size2; i3++) {
                            List list3 = (List) arrayList6.get(i3);
                            int size3 = list3.size();
                            int[] iArr = new int[size3];
                            int i4 = 0;
                            while (true) {
                                measureScope2 = measureScope;
                                if (i4 >= size3) {
                                    break;
                                }
                                iArr[i4] = ((Placeable) list3.get(i4)).width + (i4 < list3.size() + (-1) ? measureScope2.mo230roundToPx0680j_4(f2) : 0);
                                i4++;
                            }
                            int[] iArr2 = new int[size3];
                            if (measureScope2.getLayoutDirection() == LayoutDirection.Ltr) {
                                int i5 = 0;
                                for (int i6 = 0; i6 < size3; i6++) {
                                    i5 += iArr[i6];
                                }
                                int i7 = max - i5;
                                int i8 = 0;
                                int i9 = 0;
                                while (i8 < size3) {
                                    int i10 = iArr[i8];
                                    iArr2[i9] = i7;
                                    i7 += i10;
                                    i8++;
                                    i9++;
                                }
                            } else {
                                int i11 = 0;
                                for (int i12 = size3 - 1; -1 < i12; i12--) {
                                    int i13 = iArr[i12];
                                    iArr2[i12] = i11;
                                    i11 += i13;
                                }
                            }
                            int size4 = list3.size();
                            for (int i14 = 0; i14 < size4; i14++) {
                                placementScope.place((Placeable) list3.get(i14), iArr2[i14], ((Number) arrayList3.get(i3)).intValue(), RecyclerView.DECELERATION_RATE);
                            }
                        }
                        return Unit.INSTANCE;
                    }
                });
            default:
                measureScope.getClass();
                list2.getClass();
                List<Measurable> list3 = list2;
                final ArrayList arrayList6 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list3, 10));
                for (Measurable measurable : list3) {
                    int minIntrinsicWidth = measurable.minIntrinsicWidth(Constraints.m1024getMaxHeightimpl(j));
                    int minIntrinsicHeight = measurable.minIntrinsicHeight(Constraints.m1025getMaxWidthimpl(j));
                    if (!((minIntrinsicHeight >= 0) & (minIntrinsicWidth >= 0))) {
                        InlineClassHelperKt.throwIllegalArgumentException("width and height must be >= 0");
                    }
                    arrayList6.add(measurable.mo833measureBRTryo0(ConstraintsKt.createConstraints(minIntrinsicWidth, minIntrinsicWidth, minIntrinsicHeight, minIntrinsicHeight)));
                }
                int m1025getMaxWidthimpl = Constraints.m1025getMaxWidthimpl(j);
                int m1024getMaxHeightimpl = Constraints.m1024getMaxHeightimpl(j);
                final float f3 = this.$mainAxisSpacing;
                final float f4 = this.$crossAxisSpacing;
                return MeasureScope.layout$default(measureScope, m1025getMaxWidthimpl, m1024getMaxHeightimpl, new Function1() { // from class: com.squareup.cash.common.composeui.ClusteredAvatarsKt$ClusteredAvatars$2$1$1$1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Placeable.PlacementScope placementScope = (Placeable.PlacementScope) obj;
                        placementScope.getClass();
                        int i3 = 0;
                        for (Object obj2 : arrayList6) {
                            int i4 = i3 + 1;
                            if (i3 < 0) {
                                CollectionsKt__CollectionsKt.throwIndexOverflow();
                                throw null;
                            }
                            long j2 = j;
                            double radians = Math.toRadians(f3 - (f4 * ((r2.size() - i3) - 1)));
                            double m1025getMaxWidthimpl2 = (Constraints.m1025getMaxWidthimpl(j2) - r5.width) / 2.0f;
                            placementScope.placeRelative((Placeable) obj2, MathKt__MathJVMKt.roundToInt(((Constraints.m1025getMaxWidthimpl(j2) / 2.0f) + (Math.cos(radians) * m1025getMaxWidthimpl2)) - (r5.width / 2.0f)), MathKt__MathJVMKt.roundToInt(((Constraints.m1024getMaxHeightimpl(j2) / 2.0f) + (Math.sin(radians) * m1025getMaxWidthimpl2)) - (r5.height / 2.0f)), RecyclerView.DECELERATION_RATE);
                            i3 = i4;
                        }
                        return Unit.INSTANCE;
                    }
                });
        }
    }
}
