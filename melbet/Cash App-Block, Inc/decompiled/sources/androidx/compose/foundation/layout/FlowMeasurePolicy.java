package androidx.compose.foundation.layout;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.collection.IntIntPair;
import androidx.collection.IntObjectMapKt;
import androidx.collection.MutableIntObjectMap;
import androidx.collection.MutableIntSet;
import androidx.collection.ObjectList$$ExternalSyntheticLambda0;
import androidx.collection.internal.RuntimeHelpersKt;
import androidx.compose.foundation.text.BasicTextKt$$ExternalSyntheticLambda14;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.MultiContentMeasurePolicy;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.recyclerview.widget.RecyclerView;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.size.DimensionKt;
import com.withpersona.sdk2.inquiry.shared.SharedModule;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes3.dex */
public final class FlowMeasurePolicy implements MultiContentMeasurePolicy, RowColumnMeasurePolicy {
    public final CrossAxisAlignment$VerticalCrossAxisAlignment crossAxisAlignment;
    public final float crossAxisArrangementSpacing;
    public final Arrangement$Horizontal horizontalArrangement;
    public final float mainAxisSpacing;
    public final int maxItemsInMainAxis;
    public final FlowLayoutOverflowState overflow;
    public final Arrangement$Vertical verticalArrangement;

    public FlowMeasurePolicy(Arrangement$Horizontal arrangement$Horizontal, Arrangement$Vertical arrangement$Vertical, float f, CrossAxisAlignment$VerticalCrossAxisAlignment crossAxisAlignment$VerticalCrossAxisAlignment, float f2, int i, FlowLayoutOverflowState flowLayoutOverflowState) {
        this.horizontalArrangement = arrangement$Horizontal;
        this.verticalArrangement = arrangement$Vertical;
        this.mainAxisSpacing = f;
        this.crossAxisAlignment = crossAxisAlignment$VerticalCrossAxisAlignment;
        this.crossAxisArrangementSpacing = f2;
        this.maxItemsInMainAxis = i;
        this.overflow = flowLayoutOverflowState;
    }

    public static int intrinsicCrossAxisSize(List list, int i, int i2, int i3, int i4, FlowLayoutOverflowState flowLayoutOverflowState) {
        boolean z;
        long m128constructorimpl = IntIntPair.m128constructorimpl(0, 0);
        if (!list.isEmpty()) {
            int i5 = Integer.MAX_VALUE;
            FlowLayoutBuildingBlocks flowLayoutBuildingBlocks = new FlowLayoutBuildingBlocks(i4, flowLayoutOverflowState, ConstraintsKt.Constraints(0, i, 0, Integer.MAX_VALUE), i2, i3);
            IntrinsicMeasurable intrinsicMeasurable = (IntrinsicMeasurable) CollectionsKt.getOrNull(0, list);
            int minIntrinsicHeight = intrinsicMeasurable != null ? intrinsicMeasurable.minIntrinsicHeight(i) : 0;
            int minIntrinsicWidth = intrinsicMeasurable != null ? intrinsicMeasurable.minIntrinsicWidth(minIntrinsicHeight) : 0;
            int i6 = 0;
            if (flowLayoutBuildingBlocks.m261getWrapInfoOpUlnko(list.size() > 1, 0, IntIntPair.m128constructorimpl(i, Integer.MAX_VALUE), intrinsicMeasurable == null ? null : new IntIntPair(IntIntPair.m128constructorimpl(minIntrinsicWidth, minIntrinsicHeight)), 0, 0, 0, false, false).controlStatusBar) {
                flowLayoutOverflowState.getClass();
                FlowLayoutOverflow$OverflowType flowLayoutOverflow$OverflowType = FlowLayoutOverflow$OverflowType.Clip;
                m128constructorimpl = m128constructorimpl;
            } else {
                int size = list.size();
                int i7 = i;
                int i8 = 0;
                int i9 = 0;
                int i10 = 0;
                int i11 = 0;
                int i12 = 0;
                while (true) {
                    if (i10 >= size) {
                        break;
                    }
                    int i13 = i7 - minIntrinsicWidth;
                    int i14 = i10 + 1;
                    int max = Math.max(i9, minIntrinsicHeight);
                    IntrinsicMeasurable intrinsicMeasurable2 = (IntrinsicMeasurable) CollectionsKt.getOrNull(i14, list);
                    minIntrinsicHeight = intrinsicMeasurable2 != null ? intrinsicMeasurable2.minIntrinsicHeight(i) : 0;
                    int minIntrinsicWidth2 = intrinsicMeasurable2 != null ? intrinsicMeasurable2.minIntrinsicWidth(minIntrinsicHeight) + i2 : 0;
                    if (i10 + 2 < list.size()) {
                        i10 = i14;
                        z = true;
                    } else {
                        i10 = i14;
                        z = false;
                    }
                    int i15 = i10 - i12;
                    int i16 = i8;
                    int i17 = minIntrinsicWidth2;
                    SharedModule m261getWrapInfoOpUlnko = flowLayoutBuildingBlocks.m261getWrapInfoOpUlnko(z, i15, IntIntPair.m128constructorimpl(i13, i5), intrinsicMeasurable2 == null ? null : new IntIntPair(IntIntPair.m128constructorimpl(minIntrinsicWidth2, minIntrinsicHeight)), i16, i6, max, false, false);
                    if (m261getWrapInfoOpUlnko.controlNavigationBar) {
                        int i18 = max + i3 + i6;
                        flowLayoutBuildingBlocks.getWrapEllipsisInfo(m261getWrapInfoOpUlnko, intrinsicMeasurable2 != null, i16, i18, i13, i15);
                        int i19 = i17 - i2;
                        i8 = i16 + 1;
                        if (m261getWrapInfoOpUlnko.controlStatusBar) {
                            i11 = i10;
                            i6 = i18;
                            break;
                        }
                        i7 = i;
                        i12 = i10;
                        minIntrinsicWidth = i19;
                        i6 = i18;
                        i9 = 0;
                    } else {
                        minIntrinsicWidth = i17;
                        i7 = i13;
                        i8 = i16;
                        i9 = max;
                    }
                    i11 = i10;
                    i5 = Integer.MAX_VALUE;
                }
                m128constructorimpl = IntIntPair.m128constructorimpl(i6 - i3, i11);
            }
        }
        return (int) (m128constructorimpl >> 32);
    }

    @Override // androidx.compose.foundation.layout.RowColumnMeasurePolicy
    /* renamed from: createConstraints-xF2OJ5Q */
    public final long mo260createConstraintsxF2OJ5Q(int i, int i2, boolean z, int i3) {
        RowMeasurePolicy rowMeasurePolicy = RowKt.DefaultRowMeasurePolicy;
        return !z ? ConstraintsKt.Constraints(i, i2, 0, i3) : DimensionKt.m1465fitPrioritizingWidthZbe2FdA(i, i2, 0, i3);
    }

    @Override // androidx.compose.foundation.layout.RowColumnMeasurePolicy
    public final int crossAxisSize(Placeable placeable) {
        return placeable.getMeasuredHeight();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FlowMeasurePolicy)) {
            return false;
        }
        FlowMeasurePolicy flowMeasurePolicy = (FlowMeasurePolicy) obj;
        return this.horizontalArrangement.equals(flowMeasurePolicy.horizontalArrangement) && this.verticalArrangement.equals(flowMeasurePolicy.verticalArrangement) && Dp.m1037equalsimpl0(this.mainAxisSpacing, flowMeasurePolicy.mainAxisSpacing) && this.crossAxisAlignment.equals(flowMeasurePolicy.crossAxisAlignment) && Dp.m1037equalsimpl0(this.crossAxisArrangementSpacing, flowMeasurePolicy.crossAxisArrangementSpacing) && this.maxItemsInMainAxis == flowMeasurePolicy.maxItemsInMainAxis && Intrinsics.areEqual(this.overflow, flowMeasurePolicy.overflow);
    }

    public final int hashCode() {
        return this.overflow.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Integer.MAX_VALUE, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.maxItemsInMainAxis, CameraState$Type$EnumUnboxingLocalUtility.m(this.crossAxisArrangementSpacing, (this.crossAxisAlignment.hashCode() + CameraState$Type$EnumUnboxingLocalUtility.m(this.mainAxisSpacing, (this.verticalArrangement.hashCode() + ((this.horizontalArrangement.hashCode() + (Boolean.hashCode(true) * 31)) * 31)) * 31, 31)) * 31, 31), 31), 31);
    }

    @Override // androidx.compose.foundation.layout.RowColumnMeasurePolicy
    public final int mainAxisSize(Placeable placeable) {
        return placeable.getMeasuredWidth();
    }

    @Override // androidx.compose.ui.layout.MultiContentMeasurePolicy
    public final int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i) {
        List list2 = (List) CollectionsKt.getOrNull(1, list);
        IntrinsicMeasurable intrinsicMeasurable = list2 != null ? (IntrinsicMeasurable) CollectionsKt.firstOrNull(list2) : null;
        List list3 = (List) CollectionsKt.getOrNull(2, list);
        this.overflow.m262setOverflowMeasurableshBUhpc$foundation_layout(intrinsicMeasurable, list3 != null ? (IntrinsicMeasurable) CollectionsKt.firstOrNull(list3) : null, ConstraintsKt.Constraints$default(0, i, 0, 0, 13));
        List list4 = (List) CollectionsKt.firstOrNull(list);
        if (list4 == null) {
            list4 = EmptyList.INSTANCE;
        }
        return intrinsicCrossAxisSize(list4, i, intrinsicMeasureScope.mo230roundToPx0680j_4(this.mainAxisSpacing), intrinsicMeasureScope.mo230roundToPx0680j_4(this.crossAxisArrangementSpacing), this.maxItemsInMainAxis, this.overflow);
    }

    @Override // androidx.compose.ui.layout.MultiContentMeasurePolicy
    public final int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i) {
        List list2 = (List) CollectionsKt.getOrNull(1, list);
        IntrinsicMeasurable intrinsicMeasurable = list2 != null ? (IntrinsicMeasurable) CollectionsKt.firstOrNull(list2) : null;
        List list3 = (List) CollectionsKt.getOrNull(2, list);
        this.overflow.m262setOverflowMeasurableshBUhpc$foundation_layout(intrinsicMeasurable, list3 != null ? (IntrinsicMeasurable) CollectionsKt.firstOrNull(list3) : null, ConstraintsKt.Constraints$default(0, 0, 0, i, 7));
        List list4 = (List) CollectionsKt.firstOrNull(list);
        if (list4 == null) {
            list4 = EmptyList.INSTANCE;
        }
        int mo230roundToPx0680j_4 = intrinsicMeasureScope.mo230roundToPx0680j_4(this.mainAxisSpacing);
        int size = list4.size();
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (i2 < size) {
            int maxIntrinsicWidth = ((IntrinsicMeasurable) list4.get(i2)).maxIntrinsicWidth(i) + mo230roundToPx0680j_4;
            int i6 = i2 + 1;
            if (i6 - i4 == this.maxItemsInMainAxis || i6 == list4.size()) {
                i3 = Math.max(i3, (i5 + maxIntrinsicWidth) - mo230roundToPx0680j_4);
                i4 = i2;
                i5 = 0;
            } else {
                i5 += maxIntrinsicWidth;
            }
            i2 = i6;
        }
        return i3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x03c8  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x031c  */
    @Override // androidx.compose.ui.layout.MultiContentMeasurePolicy
    /* renamed from: measure-3p2s80s, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final MeasureResult mo263measure3p2s80s(MeasureScope measureScope, List list, long j) {
        long Constraints;
        float f;
        boolean z;
        long Constraints2;
        Measurable measurable;
        Measurable measurable2;
        Iterator it;
        int i;
        int i2;
        int i3;
        Ref$ObjectRef ref$ObjectRef;
        IntIntPair intIntPair;
        SharedModule sharedModule;
        int i4;
        int i5;
        int i6;
        char c;
        MutableIntSet mutableIntSet;
        Measurable measurable3;
        Ref$ObjectRef ref$ObjectRef2;
        Measurable measurable4;
        long j2;
        int[] iArr;
        int[] iArr2;
        ArrayList arrayList;
        IntIntPair intIntPair2;
        int i7;
        int i8;
        IntIntPair intIntPair3;
        SharedModule m261getWrapInfoOpUlnko;
        SharedModule sharedModule2;
        int i9;
        long m128constructorimpl;
        long m128constructorimpl2;
        if (this.maxItemsInMainAxis != 0 && !((ArrayList) list).isEmpty()) {
            int m1024getMaxHeightimpl = Constraints.m1024getMaxHeightimpl(j);
            FlowLayoutOverflowState flowLayoutOverflowState = this.overflow;
            if (m1024getMaxHeightimpl != 0) {
                List list2 = (List) CollectionsKt.first(list);
                if (list2.isEmpty()) {
                    return MeasureScope.layout$default(measureScope, 0, 0, new BasicTextKt$$ExternalSyntheticLambda14(2));
                }
                List list3 = (List) CollectionsKt.getOrNull(1, list);
                Measurable measurable5 = list3 != null ? (Measurable) CollectionsKt.firstOrNull(list3) : null;
                List list4 = (List) CollectionsKt.getOrNull(2, list);
                Measurable measurable6 = list4 != null ? (Measurable) CollectionsKt.firstOrNull(list4) : null;
                list2.size();
                flowLayoutOverflowState.getClass();
                LayoutOrientation layoutOrientation = LayoutOrientation.Horizontal;
                Constraints = ConstraintsKt.Constraints(0, Constraints.m1025getMaxWidthimpl(r9), (r2 & 4) != 0 ? Constraints.m1026getMinHeightimpl(r9) : 0, Constraints.m1024getMaxHeightimpl(OffsetKt.m269constructorimpl(j, layoutOrientation)));
                long m274toBoxConstraintsOenEA2s = OffsetKt.m274toBoxConstraintsOenEA2s(Constraints);
                if (measurable5 == null) {
                    f = 0.0f;
                    z = true;
                } else if (SpacerKt.getWeight(SpacerKt.getRowColumnParentData(measurable5)) == RecyclerView.DECELERATION_RATE) {
                    SpacerKt.getRowColumnParentData(measurable5);
                    Placeable mo833measureBRTryo0 = measurable5.mo833measureBRTryo0(m274toBoxConstraintsOenEA2s);
                    f = 0.0f;
                    z = true;
                    new IntIntPair(IntIntPair.m128constructorimpl(mo833measureBRTryo0.getMeasuredWidth(), mo833measureBRTryo0.getMeasuredHeight()));
                    mo833measureBRTryo0.getMeasuredWidth();
                    mo833measureBRTryo0.getMeasuredHeight();
                } else {
                    f = 0.0f;
                    z = true;
                    measurable5.minIntrinsicHeight(measurable5.minIntrinsicWidth(Integer.MAX_VALUE));
                }
                if (measurable6 != null) {
                    if (SpacerKt.getWeight(SpacerKt.getRowColumnParentData(measurable6)) == f) {
                        SpacerKt.getRowColumnParentData(measurable6);
                        Placeable mo833measureBRTryo02 = measurable6.mo833measureBRTryo0(m274toBoxConstraintsOenEA2s);
                        new IntIntPair(IntIntPair.m128constructorimpl(mo833measureBRTryo02.getMeasuredWidth(), mo833measureBRTryo02.getMeasuredHeight()));
                        mo833measureBRTryo02.getMeasuredWidth();
                        mo833measureBRTryo02.getMeasuredHeight();
                    } else {
                        measurable6.minIntrinsicHeight(measurable6.minIntrinsicWidth(Integer.MAX_VALUE));
                    }
                }
                Iterator it2 = list2.iterator();
                long m269constructorimpl = OffsetKt.m269constructorimpl(j, layoutOrientation);
                MutableVector mutableVector = new MutableVector(0, new MeasureResult[16]);
                int m1025getMaxWidthimpl = Constraints.m1025getMaxWidthimpl(m269constructorimpl);
                int m1027getMinWidthimpl = Constraints.m1027getMinWidthimpl(m269constructorimpl);
                int m1024getMaxHeightimpl2 = Constraints.m1024getMaxHeightimpl(m269constructorimpl);
                MutableIntObjectMap mutableIntObjectMap = IntObjectMapKt.EmptyIntObjectMap;
                MutableIntObjectMap mutableIntObjectMap2 = new MutableIntObjectMap();
                ArrayList arrayList2 = new ArrayList();
                int ceil = (int) Math.ceil(measureScope.mo236toPx0680j_4(this.mainAxisSpacing));
                int ceil2 = (int) Math.ceil(measureScope.mo236toPx0680j_4(this.crossAxisArrangementSpacing));
                long Constraints3 = ConstraintsKt.Constraints(0, m1025getMaxWidthimpl, 0, m1024getMaxHeightimpl2);
                Constraints2 = ConstraintsKt.Constraints(0, Constraints.m1025getMaxWidthimpl(Constraints3), (r2 & 4) != 0 ? Constraints.m1026getMinHeightimpl(Constraints3) : 0, Constraints.m1024getMaxHeightimpl(Constraints3));
                long m274toBoxConstraintsOenEA2s2 = OffsetKt.m274toBoxConstraintsOenEA2s(Constraints2);
                Ref$ObjectRef ref$ObjectRef3 = new Ref$ObjectRef();
                if (it2.hasNext()) {
                    try {
                        measurable = (Measurable) it2.next();
                    } catch (IndexOutOfBoundsException unused) {
                        measurable = null;
                    }
                    measurable2 = measurable;
                } else {
                    measurable2 = null;
                }
                if (measurable2 != null) {
                    if (SpacerKt.getWeight(SpacerKt.getRowColumnParentData(measurable2)) == f) {
                        SpacerKt.getRowColumnParentData(measurable2);
                        it = it2;
                        Placeable mo833measureBRTryo03 = measurable2.mo833measureBRTryo0(m274toBoxConstraintsOenEA2s2);
                        ref$ObjectRef3.element = mo833measureBRTryo03;
                        i = m1027getMinWidthimpl;
                        m128constructorimpl2 = IntIntPair.m128constructorimpl(mo833measureBRTryo03.getMeasuredWidth(), mo833measureBRTryo03.getMeasuredHeight());
                        ref$ObjectRef = ref$ObjectRef3;
                    } else {
                        it = it2;
                        i = m1027getMinWidthimpl;
                        int minIntrinsicWidth = measurable2.minIntrinsicWidth(Integer.MAX_VALUE);
                        ref$ObjectRef = ref$ObjectRef3;
                        m128constructorimpl2 = IntIntPair.m128constructorimpl(minIntrinsicWidth, measurable2.minIntrinsicHeight(minIntrinsicWidth));
                    }
                    i2 = ceil;
                    i3 = ceil2;
                    intIntPair = new IntIntPair(m128constructorimpl2);
                } else {
                    it = it2;
                    i = m1027getMinWidthimpl;
                    i2 = ceil;
                    i3 = ceil2;
                    ref$ObjectRef = ref$ObjectRef3;
                    intIntPair = null;
                }
                Integer valueOf = intIntPair != null ? Integer.valueOf((int) (intIntPair.packedValue >> 32)) : null;
                Integer valueOf2 = intIntPair != null ? Integer.valueOf((int) (intIntPair.packedValue & BodyPartID.bodyIdMax)) : null;
                IntIntPair intIntPair4 = intIntPair;
                int[] iArr3 = new int[16];
                MutableIntSet mutableIntSet2 = new MutableIntSet();
                int[] iArr4 = new int[16];
                int i10 = this.maxItemsInMainAxis;
                FlowLayoutOverflowState flowLayoutOverflowState2 = this.overflow;
                FlowLayoutBuildingBlocks flowLayoutBuildingBlocks = new FlowLayoutBuildingBlocks(i10, flowLayoutOverflowState2, m269constructorimpl, i2, i3);
                int i11 = i2;
                int i12 = i3;
                SharedModule m261getWrapInfoOpUlnko2 = flowLayoutBuildingBlocks.m261getWrapInfoOpUlnko(it.hasNext(), 0, IntIntPair.m128constructorimpl(m1025getMaxWidthimpl, m1024getMaxHeightimpl2), intIntPair4, 0, 0, 0, false, false);
                if (m261getWrapInfoOpUlnko2.controlStatusBar) {
                    sharedModule = m261getWrapInfoOpUlnko2;
                    flowLayoutBuildingBlocks.getWrapEllipsisInfo(sharedModule, intIntPair4 != null ? z : false, -1, 0, m1025getMaxWidthimpl, 0);
                } else {
                    sharedModule = m261getWrapInfoOpUlnko2;
                }
                int i13 = m1025getMaxWidthimpl;
                Integer num = valueOf2;
                Integer num2 = valueOf;
                Measurable measurable7 = measurable2;
                SharedModule sharedModule3 = sharedModule;
                int i14 = i;
                int i15 = 0;
                int i16 = 0;
                int i17 = 0;
                int i18 = 0;
                int i19 = 0;
                int i20 = 0;
                int i21 = m1024getMaxHeightimpl2;
                int i22 = 0;
                int i23 = 0;
                while (!sharedModule3.controlStatusBar && measurable7 != null) {
                    num2.getClass();
                    int intValue = num2.intValue();
                    num.getClass();
                    int i24 = i17 + intValue;
                    int max = Math.max(i22, num.intValue());
                    int i25 = i13 - intValue;
                    int i26 = i15 + 1;
                    flowLayoutOverflowState2.getClass();
                    arrayList2.add(measurable7);
                    mutableIntObjectMap2.set(i15, ref$ObjectRef.element);
                    measurable7.getParentData();
                    int i27 = i26 - i18;
                    if (it.hasNext()) {
                        try {
                            measurable3 = (Measurable) it.next();
                        } catch (IndexOutOfBoundsException unused2) {
                        }
                        ref$ObjectRef.element = null;
                        if (measurable3 == null) {
                            if (SpacerKt.getWeight(SpacerKt.getRowColumnParentData(measurable3)) == f) {
                                SpacerKt.getRowColumnParentData(measurable3);
                                Placeable mo833measureBRTryo04 = measurable3.mo833measureBRTryo0(m274toBoxConstraintsOenEA2s2);
                                ref$ObjectRef.element = mo833measureBRTryo04;
                                ref$ObjectRef2 = ref$ObjectRef;
                                arrayList = arrayList2;
                                m128constructorimpl = IntIntPair.m128constructorimpl(mo833measureBRTryo04.getMeasuredWidth(), mo833measureBRTryo04.getMeasuredHeight());
                                j2 = m274toBoxConstraintsOenEA2s2;
                                iArr = iArr3;
                                iArr2 = iArr4;
                            } else {
                                ref$ObjectRef2 = ref$ObjectRef;
                                int minIntrinsicWidth2 = measurable3.minIntrinsicWidth(Integer.MAX_VALUE);
                                j2 = m274toBoxConstraintsOenEA2s2;
                                iArr = iArr3;
                                iArr2 = iArr4;
                                arrayList = arrayList2;
                                m128constructorimpl = IntIntPair.m128constructorimpl(minIntrinsicWidth2, measurable3.minIntrinsicHeight(minIntrinsicWidth2));
                            }
                            measurable4 = measurable3;
                            intIntPair2 = new IntIntPair(m128constructorimpl);
                        } else {
                            ref$ObjectRef2 = ref$ObjectRef;
                            measurable4 = measurable3;
                            j2 = m274toBoxConstraintsOenEA2s2;
                            iArr = iArr3;
                            iArr2 = iArr4;
                            arrayList = arrayList2;
                            intIntPair2 = null;
                        }
                        int i28 = i23;
                        Integer valueOf3 = intIntPair2 == null ? Integer.valueOf(((int) (intIntPair2.packedValue >> 32)) + i11) : null;
                        Integer valueOf4 = intIntPair2 == null ? Integer.valueOf((int) (intIntPair2.packedValue & BodyPartID.bodyIdMax)) : null;
                        boolean hasNext = it.hasNext();
                        int i29 = i19;
                        long m128constructorimpl3 = IntIntPair.m128constructorimpl(i25, i21);
                        if (intIntPair2 != null) {
                            i7 = i28;
                            i8 = i25;
                            intIntPair3 = null;
                        } else {
                            valueOf3.getClass();
                            int intValue2 = valueOf3.intValue();
                            valueOf4.getClass();
                            i7 = i28;
                            i8 = i25;
                            intIntPair3 = new IntIntPair(IntIntPair.m128constructorimpl(intValue2, valueOf4.intValue()));
                        }
                        m261getWrapInfoOpUlnko = flowLayoutBuildingBlocks.m261getWrapInfoOpUlnko(hasNext, i27, m128constructorimpl3, intIntPair3, i29, i20, max, false, false);
                        if (m261getWrapInfoOpUlnko.controlNavigationBar) {
                            sharedModule2 = m261getWrapInfoOpUlnko;
                            iArr3 = iArr;
                            i9 = i7;
                            i19 = i29;
                            i22 = max;
                        } else {
                            int min = Math.min(Math.max(i14, i24), m1025getMaxWidthimpl);
                            int i30 = i20 + max;
                            sharedModule2 = m261getWrapInfoOpUlnko;
                            flowLayoutBuildingBlocks.getWrapEllipsisInfo(sharedModule2, intIntPair2 != null ? z : false, i29, i30, i8, i27);
                            int i31 = i7 + 1;
                            if (iArr2.length < i31) {
                                iArr2 = Arrays.copyOf(iArr2, Math.max(i31, (iArr2.length * 3) / 2));
                            }
                            iArr2[i7] = max;
                            i9 = i7 + 1;
                            i21 = (m1024getMaxHeightimpl2 - i30) - i12;
                            int i32 = i16 + 1;
                            iArr3 = iArr.length < i32 ? Arrays.copyOf(iArr, Math.max(i32, (iArr.length * 3) / 2)) : iArr;
                            iArr3[i16] = i26;
                            i16++;
                            i19 = i29 + 1;
                            i20 = i30 + i12;
                            i14 = min;
                            i8 = m1025getMaxWidthimpl;
                            valueOf3 = valueOf3 != null ? Integer.valueOf(valueOf3.intValue() - i11) : null;
                            i18 = i26;
                            i24 = 0;
                            i22 = 0;
                        }
                        i15 = i26;
                        arrayList2 = arrayList;
                        ref$ObjectRef = ref$ObjectRef2;
                        num2 = valueOf3;
                        Measurable measurable8 = measurable4;
                        i17 = i24;
                        sharedModule3 = sharedModule2;
                        iArr4 = iArr2;
                        m274toBoxConstraintsOenEA2s2 = j2;
                        i13 = i8;
                        num = valueOf4;
                        i23 = i9;
                        measurable7 = measurable8;
                    }
                    measurable3 = null;
                    ref$ObjectRef.element = null;
                    if (measurable3 == null) {
                    }
                    int i282 = i23;
                    Integer valueOf32 = intIntPair2 == null ? Integer.valueOf(((int) (intIntPair2.packedValue >> 32)) + i11) : null;
                    if (intIntPair2 == null) {
                    }
                    boolean hasNext2 = it.hasNext();
                    int i292 = i19;
                    long m128constructorimpl32 = IntIntPair.m128constructorimpl(i25, i21);
                    if (intIntPair2 != null) {
                    }
                    m261getWrapInfoOpUlnko = flowLayoutBuildingBlocks.m261getWrapInfoOpUlnko(hasNext2, i27, m128constructorimpl32, intIntPair3, i292, i20, max, false, false);
                    if (m261getWrapInfoOpUlnko.controlNavigationBar) {
                    }
                    i15 = i26;
                    arrayList2 = arrayList;
                    ref$ObjectRef = ref$ObjectRef2;
                    num2 = valueOf32;
                    Measurable measurable82 = measurable4;
                    i17 = i24;
                    sharedModule3 = sharedModule2;
                    iArr4 = iArr2;
                    m274toBoxConstraintsOenEA2s2 = j2;
                    i13 = i8;
                    num = valueOf4;
                    i23 = i9;
                    measurable7 = measurable82;
                }
                ArrayList arrayList3 = arrayList2;
                int i33 = i23;
                int[] iArr5 = iArr3;
                int[] iArr6 = iArr4;
                int size = arrayList3.size();
                Placeable[] placeableArr = new Placeable[size];
                for (int i34 = 0; i34 < size; i34++) {
                    placeableArr[i34] = mutableIntObjectMap2.get(i34);
                }
                int[] iArr7 = new int[i16];
                int[] iArr8 = new int[i16];
                int i35 = 0;
                int i36 = 0;
                int i37 = 0;
                while (i36 < i16) {
                    int i38 = i16;
                    int i39 = iArr5[i36];
                    if (i36 < 0 || i36 >= (i6 = i33)) {
                        RuntimeHelpersKt.throwIndexOutOfBoundsException("Index must be between 0 and size");
                        throw null;
                    }
                    int i40 = iArr6[i36];
                    if (mutableIntSet2.contains(i36)) {
                        mutableIntSet = mutableIntSet2;
                        c = 65535;
                    } else {
                        c = 65535;
                        i40 = Constraints.m1024getMaxHeightimpl(Constraints3) == Integer.MAX_VALUE ? Integer.MAX_VALUE : Constraints.m1024getMaxHeightimpl(Constraints3) - i37;
                        mutableIntSet = mutableIntSet2;
                    }
                    ArrayList arrayList4 = arrayList3;
                    int[] iArr9 = iArr5;
                    i33 = i6;
                    int i41 = i14;
                    int[] iArr10 = iArr8;
                    MeasureResult measure = SpacerKt.measure(this, i41, Constraints.m1026getMinHeightimpl(Constraints3), Constraints.m1025getMaxWidthimpl(Constraints3), i40, i11, measureScope, arrayList4, placeableArr, i35, i39, iArr7, i36);
                    int width = measure.getWidth();
                    int height = measure.getHeight();
                    iArr10[i36] = height;
                    i37 += height;
                    int max2 = Math.max(i41, width);
                    mutableVector.add(measure);
                    i36++;
                    i35 = i39;
                    mutableIntSet2 = mutableIntSet;
                    iArr8 = iArr10;
                    i16 = i38;
                    i14 = max2;
                    arrayList3 = arrayList4;
                    iArr5 = iArr9;
                }
                int i42 = i14;
                int[] iArr11 = iArr8;
                if (mutableVector.size == 0) {
                    i4 = 0;
                    i5 = 0;
                } else {
                    i4 = i42;
                    i5 = i37;
                }
                Arrangement$Vertical arrangement$Vertical = this.verticalArrangement;
                int mo230roundToPx0680j_4 = ((mutableVector.size - 1) * measureScope.mo230roundToPx0680j_4(arrangement$Vertical.mo252getSpacingD9Ej5fM())) + i5;
                int m1026getMinHeightimpl = Constraints.m1026getMinHeightimpl(m269constructorimpl);
                int m1024getMaxHeightimpl3 = Constraints.m1024getMaxHeightimpl(m269constructorimpl);
                if (mo230roundToPx0680j_4 < m1026getMinHeightimpl) {
                    mo230roundToPx0680j_4 = m1026getMinHeightimpl;
                }
                if (mo230roundToPx0680j_4 <= m1024getMaxHeightimpl3) {
                    m1024getMaxHeightimpl3 = mo230roundToPx0680j_4;
                }
                arrangement$Vertical.arrange(measureScope, m1024getMaxHeightimpl3, iArr11, iArr7);
                int m1027getMinWidthimpl2 = Constraints.m1027getMinWidthimpl(m269constructorimpl);
                int m1025getMaxWidthimpl2 = Constraints.m1025getMaxWidthimpl(m269constructorimpl);
                if (i4 < m1027getMinWidthimpl2) {
                    i4 = m1027getMinWidthimpl2;
                }
                if (i4 <= m1025getMaxWidthimpl2) {
                    m1025getMaxWidthimpl2 = i4;
                }
                return MeasureScope.layout$default(measureScope, m1025getMaxWidthimpl2, m1024getMaxHeightimpl3, new ObjectList$$ExternalSyntheticLambda0(mutableVector, 16));
            }
            flowLayoutOverflowState.getClass();
            FlowLayoutOverflow$OverflowType flowLayoutOverflow$OverflowType = FlowLayoutOverflow$OverflowType.Clip;
            FlowLayoutOverflow$OverflowType flowLayoutOverflow$OverflowType2 = FlowLayoutOverflow$OverflowType.Clip;
        }
        return MeasureScope.layout$default(measureScope, 0, 0, new BasicTextKt$$ExternalSyntheticLambda14(1));
    }

    @Override // androidx.compose.ui.layout.MultiContentMeasurePolicy
    public final int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i) {
        List list2 = (List) CollectionsKt.getOrNull(1, list);
        IntrinsicMeasurable intrinsicMeasurable = list2 != null ? (IntrinsicMeasurable) CollectionsKt.firstOrNull(list2) : null;
        List list3 = (List) CollectionsKt.getOrNull(2, list);
        this.overflow.m262setOverflowMeasurableshBUhpc$foundation_layout(intrinsicMeasurable, list3 != null ? (IntrinsicMeasurable) CollectionsKt.firstOrNull(list3) : null, ConstraintsKt.Constraints$default(0, i, 0, 0, 13));
        List list4 = (List) CollectionsKt.firstOrNull(list);
        if (list4 == null) {
            list4 = EmptyList.INSTANCE;
        }
        return intrinsicCrossAxisSize(list4, i, intrinsicMeasureScope.mo230roundToPx0680j_4(this.mainAxisSpacing), intrinsicMeasureScope.mo230roundToPx0680j_4(this.crossAxisArrangementSpacing), this.maxItemsInMainAxis, this.overflow);
    }

    @Override // androidx.compose.ui.layout.MultiContentMeasurePolicy
    public final int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i) {
        int[] iArr;
        int i2;
        long m128constructorimpl;
        int i3;
        int i4;
        int i5;
        IntIntPair intIntPair;
        FlowMeasurePolicy flowMeasurePolicy = this;
        List list2 = (List) CollectionsKt.getOrNull(1, list);
        IntrinsicMeasurable intrinsicMeasurable = list2 != null ? (IntrinsicMeasurable) CollectionsKt.firstOrNull(list2) : null;
        List list3 = (List) CollectionsKt.getOrNull(2, list);
        flowMeasurePolicy.overflow.m262setOverflowMeasurableshBUhpc$foundation_layout(intrinsicMeasurable, list3 != null ? (IntrinsicMeasurable) CollectionsKt.firstOrNull(list3) : null, ConstraintsKt.Constraints$default(0, 0, 0, i, 7));
        List list4 = (List) CollectionsKt.firstOrNull(list);
        if (list4 == null) {
            list4 = EmptyList.INSTANCE;
        }
        int mo230roundToPx0680j_4 = intrinsicMeasureScope.mo230roundToPx0680j_4(flowMeasurePolicy.mainAxisSpacing);
        int mo230roundToPx0680j_42 = intrinsicMeasureScope.mo230roundToPx0680j_4(flowMeasurePolicy.crossAxisArrangementSpacing);
        long m128constructorimpl2 = IntIntPair.m128constructorimpl(0, 0);
        if (list4.isEmpty()) {
            return 0;
        }
        int size = list4.size();
        int[] iArr2 = new int[size];
        int size2 = list4.size();
        int[] iArr3 = new int[size2];
        List list5 = list4;
        int size3 = list5.size();
        for (int i6 = 0; i6 < size3; i6++) {
            IntrinsicMeasurable intrinsicMeasurable2 = (IntrinsicMeasurable) list4.get(i6);
            int minIntrinsicWidth = intrinsicMeasurable2.minIntrinsicWidth(i);
            iArr2[i6] = minIntrinsicWidth;
            iArr3[i6] = intrinsicMeasurable2.minIntrinsicHeight(minIntrinsicWidth);
        }
        int size4 = list4.size();
        FlowLayoutOverflowState flowLayoutOverflowState = flowMeasurePolicy.overflow;
        int i7 = Integer.MAX_VALUE;
        if (Integer.MAX_VALUE < size4) {
            flowLayoutOverflowState.getClass();
            FlowLayoutOverflow$OverflowType flowLayoutOverflow$OverflowType = FlowLayoutOverflow$OverflowType.Clip;
        }
        if (Integer.MAX_VALUE >= list4.size()) {
            flowLayoutOverflowState.getClass();
            FlowLayoutOverflow$OverflowType flowLayoutOverflow$OverflowType2 = FlowLayoutOverflow$OverflowType.Clip;
        }
        int min = Math.min(Integer.MAX_VALUE, list4.size());
        int size5 = ((list4.size() - 1) * mo230roundToPx0680j_4) + ArraysKt___ArraysKt.sum(iArr2);
        if (size2 == 0) {
            a$$ExternalSyntheticBUOutline0.m();
            return 0;
        }
        int i8 = iArr3[0];
        int i9 = size2 - 1;
        int i10 = 0;
        if (1 <= i9) {
            int i11 = 1;
            while (true) {
                int i12 = iArr3[i11];
                if (i8 < i12) {
                    i8 = i12;
                }
                if (i11 == i9) {
                    break;
                }
                i11++;
            }
        }
        if (size == 0) {
            a$$ExternalSyntheticBUOutline0.m();
            return 0;
        }
        int i13 = iArr2[0];
        int i14 = size - 1;
        if (1 <= i14) {
            int i15 = 1;
            while (true) {
                int i16 = iArr2[i15];
                if (i13 < i16) {
                    i13 = i16;
                }
                if (i15 == i14) {
                    break;
                }
                i15++;
            }
        }
        int i17 = size5;
        while (i13 <= i17 && i8 != i) {
            int i18 = (i13 + i17) / 2;
            if (list4.isEmpty()) {
                i2 = i17;
                m128constructorimpl = m128constructorimpl2;
                iArr = iArr3;
            } else {
                int i19 = i7;
                int i20 = i10;
                iArr = iArr3;
                FlowLayoutBuildingBlocks flowLayoutBuildingBlocks = new FlowLayoutBuildingBlocks(flowMeasurePolicy.maxItemsInMainAxis, flowLayoutOverflowState, ConstraintsKt.Constraints(i20, i18, i20, i19), mo230roundToPx0680j_4, mo230roundToPx0680j_42);
                IntrinsicMeasurable intrinsicMeasurable3 = (IntrinsicMeasurable) CollectionsKt.getOrNull(i20, list4);
                int i21 = intrinsicMeasurable3 != null ? iArr[i20] : i20;
                int i22 = intrinsicMeasurable3 != null ? iArr2[i20] : 0;
                boolean z = list4.size() > 1;
                long m128constructorimpl3 = IntIntPair.m128constructorimpl(i18, i19);
                i2 = i17;
                int i23 = 0;
                int i24 = 0;
                int i25 = 0;
                if (flowLayoutBuildingBlocks.m261getWrapInfoOpUlnko(z, 0, m128constructorimpl3, intrinsicMeasurable3 == null ? null : new IntIntPair(IntIntPair.m128constructorimpl(i22, i21)), 0, 0, 0, false, false).controlStatusBar) {
                    flowLayoutOverflowState.getClass();
                    FlowLayoutOverflow$OverflowType flowLayoutOverflow$OverflowType3 = FlowLayoutOverflow$OverflowType.Clip;
                    m128constructorimpl = m128constructorimpl2;
                } else {
                    int size6 = list5.size();
                    int i26 = i18;
                    int i27 = i22;
                    int i28 = 0;
                    int i29 = 0;
                    int i30 = i21;
                    int i31 = 0;
                    while (true) {
                        int i32 = i25;
                        if (i29 >= size6) {
                            break;
                        }
                        int i33 = i26 - i27;
                        int i34 = size6;
                        int i35 = i29 + 1;
                        i25 = Math.max(i32, i30);
                        IntrinsicMeasurable intrinsicMeasurable4 = (IntrinsicMeasurable) CollectionsKt.getOrNull(i35, list4);
                        int i36 = intrinsicMeasurable4 != null ? iArr[i35] : 0;
                        if (intrinsicMeasurable4 != null) {
                            i3 = i35;
                            i4 = iArr2[i35] + mo230roundToPx0680j_4;
                        } else {
                            i3 = i35;
                            i4 = 0;
                        }
                        int i37 = i28;
                        boolean z2 = i29 + 2 < list4.size();
                        int i38 = i3 - i37;
                        long m128constructorimpl4 = IntIntPair.m128constructorimpl(i33, Integer.MAX_VALUE);
                        if (intrinsicMeasurable4 == null) {
                            i5 = i33;
                            intIntPair = null;
                        } else {
                            i5 = i33;
                            intIntPair = new IntIntPair(IntIntPair.m128constructorimpl(i4, i36));
                        }
                        SharedModule m261getWrapInfoOpUlnko = flowLayoutBuildingBlocks.m261getWrapInfoOpUlnko(z2, i38, m128constructorimpl4, intIntPair, i23, i24, i25, false, false);
                        if (m261getWrapInfoOpUlnko.controlNavigationBar) {
                            int i39 = i25 + mo230roundToPx0680j_42 + i24;
                            int i40 = i23;
                            flowLayoutBuildingBlocks.getWrapEllipsisInfo(m261getWrapInfoOpUlnko, intrinsicMeasurable4 != null, i40, i39, i5, i38);
                            i4 -= mo230roundToPx0680j_4;
                            i23 = i40 + 1;
                            if (m261getWrapInfoOpUlnko.controlStatusBar) {
                                i31 = i3;
                                i24 = i39;
                                break;
                            }
                            i26 = i18;
                            i28 = i3;
                            i24 = i39;
                            i25 = 0;
                        } else {
                            i26 = i5;
                            i28 = i37;
                        }
                        i30 = i36;
                        i29 = i3;
                        i31 = i29;
                        i27 = i4;
                        size6 = i34;
                    }
                    m128constructorimpl = IntIntPair.m128constructorimpl(i24 - mo230roundToPx0680j_42, i31);
                }
            }
            i8 = (int) (m128constructorimpl >> 32);
            int i41 = (int) (m128constructorimpl & BodyPartID.bodyIdMax);
            if (i8 > i || i41 < min) {
                i13 = i18 + 1;
                if (i13 > i2) {
                    return i13;
                }
                flowMeasurePolicy = this;
                i17 = i2;
            } else {
                if (i8 >= i) {
                    return i18;
                }
                i17 = i18 - 1;
                flowMeasurePolicy = this;
            }
            size5 = i18;
            iArr3 = iArr;
            i7 = Integer.MAX_VALUE;
            i10 = 0;
        }
        return size5;
    }

    @Override // androidx.compose.foundation.layout.RowColumnMeasurePolicy
    public final MeasureResult placeHelper(final Placeable[] placeableArr, MeasureScope measureScope, final int i, final int[] iArr, int i2, final int i3, final int[] iArr2, final int i4, final int i5, final int i6) {
        final LayoutDirection layoutDirection = LayoutDirection.Ltr;
        return MeasureScope.layout$default(measureScope, i2, i3, new Function1() { // from class: androidx.compose.foundation.layout.FlowLineMeasurePolicy$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                SpacerKt spacerKt;
                Placeable.PlacementScope placementScope = (Placeable.PlacementScope) obj;
                int[] iArr3 = iArr2;
                int i7 = iArr3 != null ? iArr3[i4] : 0;
                int i8 = i5;
                for (int i9 = i8; i9 < i6; i9++) {
                    Placeable placeable = placeableArr[i9];
                    placeable.getClass();
                    Object parentData = placeable.getParentData();
                    RowColumnParentData rowColumnParentData = parentData instanceof RowColumnParentData ? (RowColumnParentData) parentData : null;
                    if (rowColumnParentData == null || (spacerKt = rowColumnParentData.crossAxisAlignment) == null) {
                        spacerKt = this.crossAxisAlignment;
                    }
                    placementScope.place(placeable, iArr[i9 - i8], spacerKt.align$foundation_layout(i3, placeable.getMeasuredHeight(), layoutDirection, placeable, i) + i7, RecyclerView.DECELERATION_RATE);
                }
                return Unit.INSTANCE;
            }
        });
    }

    @Override // androidx.compose.foundation.layout.RowColumnMeasurePolicy
    public final void populateMainAxisPositions(int i, int[] iArr, int[] iArr2, MeasureScope measureScope) {
        this.horizontalArrangement.arrange(measureScope, i, iArr, measureScope.getLayoutDirection(), iArr2);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FlowMeasurePolicy(isHorizontal=true, horizontalArrangement=");
        sb.append(this.horizontalArrangement);
        sb.append(", verticalArrangement=");
        sb.append(this.verticalArrangement);
        sb.append(", mainAxisSpacing=");
        Recorder$$ExternalSyntheticOutline1.m104m(this.mainAxisSpacing, ", crossAxisAlignment=", sb);
        sb.append(this.crossAxisAlignment);
        sb.append(", crossAxisArrangementSpacing=");
        Recorder$$ExternalSyntheticOutline1.m104m(this.crossAxisArrangementSpacing, ", maxItemsInMainAxis=", sb);
        sb.append(this.maxItemsInMainAxis);
        sb.append(", maxLines=2147483647, overflow=");
        sb.append(this.overflow);
        sb.append(')');
        return sb.toString();
    }
}
