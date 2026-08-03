package androidx.compose.material3;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.State;
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
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.util.ListUtilsKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.ranges.RangesKt;

/* compiled from: WideNavigationRail.kt */
@Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J)\u0010\u0002\u001a\u00020\u0003*\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"androidx/compose/material3/WideNavigationRailKt$WideNavigationRailLayout$1$2", "Landroidx/compose/ui/layout/MeasurePolicy;", "measure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "measurables", "", "Landroidx/compose/ui/layout/Measurable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Ljava/util/List;J)Landroidx/compose/ui/layout/MeasureResult;", "material3"}, k = 1, mv = {2, 1, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
/* loaded from: classes.dex */
public final class WideNavigationRailKt$WideNavigationRailLayout$1$2 implements MeasurePolicy {
    final /* synthetic */ MutableIntState $actualMaxExpandedWidth$delegate;
    final /* synthetic */ Arrangement.Vertical $arrangement;
    final /* synthetic */ MutableIntState $currentWidth$delegate;
    final /* synthetic */ boolean $expanded;
    final /* synthetic */ Function2<Composer, Integer, Unit> $header;
    final /* synthetic */ State<Dp> $itemMinHeight$delegate;
    final /* synthetic */ State<Dp> $itemVerticalSpacedBy$delegate;
    final /* synthetic */ State<Dp> $minWidth$delegate;
    final /* synthetic */ float $minimumA11ySize;
    final /* synthetic */ State<Dp> $widthFullRange$delegate;

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
    WideNavigationRailKt$WideNavigationRailLayout$1$2(Function2<? super Composer, ? super Integer, Unit> function2, boolean z, float f, State<Dp> state, State<Dp> state2, State<Dp> state3, MutableIntState mutableIntState, MutableIntState mutableIntState2, Arrangement.Vertical vertical, State<Dp> state4) {
        this.$header = function2;
        this.$expanded = z;
        this.$minimumA11ySize = f;
        this.$minWidth$delegate = state;
        this.$itemMinHeight$delegate = state2;
        this.$widthFullRange$delegate = state3;
        this.$actualMaxExpandedWidth$delegate = mutableIntState;
        this.$currentWidth$delegate = mutableIntState2;
        this.$arrangement = vertical;
        this.$itemVerticalSpacedBy$delegate = state4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v10, types: [T, androidx.compose.ui.layout.Placeable] */
    @Override // androidx.compose.ui.layout.MeasurePolicy
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo81measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j) {
        int m9677getMinWidthimpl;
        int i;
        float WideNavigationRailLayout$lambda$9;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int WideNavigationRailLayout$lambda$4;
        float WideNavigationRailLayout$lambda$7;
        int WideNavigationRailLayout$lambda$1;
        int i7;
        float WideNavigationRailLayout$lambda$72;
        float WideNavigationRailLayout$lambda$92;
        float f;
        float WideNavigationRailLayout$lambda$6;
        List<? extends Measurable> list2 = list;
        int m9674getMaxHeightimpl = Constraints.m9674getMaxHeightimpl(j);
        int size = list2.size();
        int m9677getMinWidthimpl2 = Constraints.m9677getMinWidthimpl(j);
        if (Constraints.m9677getMinWidthimpl(j) == 0) {
            f = WideNavigationRailKt.ExpandedRailMinWidth;
            m9677getMinWidthimpl2 = RangesKt.coerceAtMost(measureScope.mo522roundToPx0680j_4(f), Constraints.m9675getMaxWidthimpl(j));
            WideNavigationRailLayout$lambda$6 = WideNavigationRailKt.WideNavigationRailLayout$lambda$6(this.$minWidth$delegate);
            m9677getMinWidthimpl = RangesKt.coerceAtMost(measureScope.mo522roundToPx0680j_4(WideNavigationRailLayout$lambda$6), Constraints.m9675getMaxWidthimpl(j));
        } else {
            m9677getMinWidthimpl = Constraints.m9677getMinWidthimpl(j);
        }
        if (size < 1) {
            return MeasureScope.CC.layout$default(measureScope, m9677getMinWidthimpl, m9674getMaxHeightimpl, null, new Function1() { // from class: androidx.compose.material3.WideNavigationRailKt$WideNavigationRailLayout$1$2$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit measure_3p2s80s$lambda$0;
                    measure_3p2s80s$lambda$0 = WideNavigationRailKt$WideNavigationRailLayout$1$2.measure_3p2s80s$lambda$0((Placeable.PlacementScope) obj);
                    return measure_3p2s80s$lambda$0;
                }
            }, 4, null);
        }
        long m9665copyZbe2FdA$default = Constraints.m9665copyZbe2FdA$default(j, 0, 0, 0, 0, 10, null);
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        if (this.$header != null) {
            int size2 = list2.size();
            for (int i8 = 0; i8 < size2; i8++) {
                Measurable measurable = list2.get(i8);
                if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable), "header")) {
                    objectRef.element = measurable.mo8285measureBRTryo0(m9665copyZbe2FdA$default);
                    if (size > 1) {
                        list2 = list2.subList(1, size);
                    }
                    size--;
                    i = ((Placeable) objectRef.element).getHeight();
                }
            }
            ListUtilsKt.throwNoSuchElementException("Collection contains no element matching the predicate.");
            throw new KotlinNothingValueException();
        }
        i = 0;
        ArrayList arrayList = size > 0 ? new ArrayList() : null;
        int m9675getMaxWidthimpl = Constraints.m9675getMaxWidthimpl(m9665copyZbe2FdA$default) - measureScope.mo522roundToPx0680j_4(WideNavigationRailKt.getWNRItemHorizontalPadding());
        if (!this.$expanded) {
            m9675getMaxWidthimpl = m9677getMinWidthimpl;
        }
        int coerceAtLeast = RangesKt.coerceAtLeast(m9675getMaxWidthimpl, measureScope.mo522roundToPx0680j_4(this.$minimumA11ySize));
        int m9674getMaxHeightimpl2 = Constraints.m9674getMaxHeightimpl(m9665copyZbe2FdA$default);
        WideNavigationRailLayout$lambda$9 = WideNavigationRailKt.WideNavigationRailLayout$lambda$9(this.$itemMinHeight$delegate);
        int coerceAtLeast2 = RangesKt.coerceAtLeast(m9674getMaxHeightimpl2, measureScope.mo522roundToPx0680j_4(WideNavigationRailLayout$lambda$9));
        if (arrayList != null) {
            float f2 = this.$minimumA11ySize;
            boolean z = this.$expanded;
            State<Dp> state = this.$itemMinHeight$delegate;
            i2 = m9674getMaxHeightimpl;
            int i9 = i;
            ArrayList arrayList2 = new ArrayList(list2.size());
            int size3 = list2.size();
            int i10 = 0;
            i5 = 0;
            int i11 = i9;
            while (i10 < size3) {
                Measurable measurable2 = list2.get(i10);
                List<? extends Measurable> list3 = list2;
                ArrayList arrayList3 = arrayList2;
                int i12 = size3;
                int i13 = -i11;
                boolean z2 = z;
                State<Dp> state2 = state;
                long m9695offsetNN6EwU$default = ConstraintsKt.m9695offsetNN6EwU$default(m9665copyZbe2FdA$default, 0, i13, 1, null);
                Constraints.Companion companion = Constraints.INSTANCE;
                int i14 = i10;
                int i15 = measureScope.mo522roundToPx0680j_4(f2);
                float f3 = f2;
                WideNavigationRailLayout$lambda$92 = WideNavigationRailKt.WideNavigationRailLayout$lambda$9(state2);
                int i16 = m9677getMinWidthimpl2;
                int i17 = m9677getMinWidthimpl;
                Placeable mo8285measureBRTryo0 = measurable2.mo8285measureBRTryo0(ConstraintsKt.m9690constrainN9IONVI(m9695offsetNN6EwU$default, companion.m9684fitPrioritizingWidthZbe2FdA(i15, coerceAtLeast, measureScope.mo522roundToPx0680j_4(WideNavigationRailLayout$lambda$92), coerceAtLeast2)));
                int measuredWidth = mo8285measureBRTryo0.getMeasuredWidth();
                if (z2 && i5 < measuredWidth) {
                    i5 = measuredWidth + measureScope.mo522roundToPx0680j_4(WideNavigationRailKt.getWNRItemHorizontalPadding());
                }
                int height = mo8285measureBRTryo0.getHeight();
                arrayList3.add(Boolean.valueOf(arrayList.add(mo8285measureBRTryo0)));
                i10 = i14 + 1;
                list2 = list3;
                i11 = height;
                z = z2;
                f2 = f3;
                m9677getMinWidthimpl2 = i16;
                size3 = i12;
                state = state2;
                m9677getMinWidthimpl = i17;
            }
            i3 = m9677getMinWidthimpl2;
            i4 = m9677getMinWidthimpl;
        } else {
            i2 = m9674getMaxHeightimpl;
            i3 = m9677getMinWidthimpl2;
            i4 = m9677getMinWidthimpl;
            i5 = 0;
        }
        if (!this.$expanded) {
            i6 = i4;
            WideNavigationRailLayout$lambda$4 = WideNavigationRailKt.WideNavigationRailLayout$lambda$4(this.$actualMaxExpandedWidth$delegate);
            if (WideNavigationRailLayout$lambda$4 > 0) {
                WideNavigationRailLayout$lambda$7 = WideNavigationRailKt.WideNavigationRailLayout$lambda$7(this.$widthFullRange$delegate);
                int i18 = measureScope.mo522roundToPx0680j_4(WideNavigationRailLayout$lambda$7);
                WideNavigationRailLayout$lambda$1 = WideNavigationRailKt.WideNavigationRailLayout$lambda$1(this.$currentWidth$delegate);
                i6 = RangesKt.coerceIn(i18, i6, RangesKt.coerceAtLeast(WideNavigationRailLayout$lambda$1, i6));
            }
        } else {
            Placeable placeable = (Placeable) objectRef.element;
            int max = Math.max(i5, placeable != null ? placeable.getWidth() : 0);
            i6 = i4;
            if (max > i6 && max > (i7 = i3)) {
                int coerceAtMost = RangesKt.coerceAtMost(Math.max(max, i7), Constraints.m9675getMaxWidthimpl(j));
                WideNavigationRailLayout$lambda$72 = WideNavigationRailKt.WideNavigationRailLayout$lambda$7(this.$widthFullRange$delegate);
                i6 = RangesKt.coerceAtMost(measureScope.mo522roundToPx0680j_4(WideNavigationRailLayout$lambda$72), coerceAtMost);
                this.$actualMaxExpandedWidth$delegate.setIntValue(i6);
            }
        }
        int i19 = i6;
        this.$currentWidth$delegate.setIntValue(i19);
        final ArrayList arrayList4 = arrayList;
        final Arrangement.Vertical vertical = this.$arrangement;
        final State<Dp> state3 = this.$itemVerticalSpacedBy$delegate;
        final int i20 = i2;
        return MeasureScope.CC.layout$default(measureScope, i19, i20, null, new Function1() { // from class: androidx.compose.material3.WideNavigationRailKt$WideNavigationRailLayout$1$2$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit measure_3p2s80s$lambda$3;
                measure_3p2s80s$lambda$3 = WideNavigationRailKt$WideNavigationRailLayout$1$2.measure_3p2s80s$lambda$3(Ref.ObjectRef.this, arrayList4, vertical, i20, state3, (Placeable.PlacementScope) obj);
                return measure_3p2s80s$lambda$3;
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit measure_3p2s80s$lambda$0(Placeable.PlacementScope placementScope) {
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit measure_3p2s80s$lambda$3(Ref.ObjectRef objectRef, List list, Arrangement.Vertical vertical, int i, State state, Placeable.PlacementScope placementScope) {
        int i2;
        float WideNavigationRailLayout$lambda$8;
        float f;
        if (objectRef.element == 0 || ((Placeable) objectRef.element).getHeight() <= 0) {
            i2 = 0;
        } else {
            Placeable.PlacementScope.placeRelative$default(placementScope, (Placeable) objectRef.element, 0, 0, 0.0f, 4, null);
            int height = ((Placeable) objectRef.element).getHeight();
            f = WideNavigationRailKt.WNRHeaderPadding;
            i2 = height + placementScope.mo522roundToPx0680j_4(f);
        }
        if (list != null) {
            if (!Intrinsics.areEqual(vertical, Arrangement.INSTANCE.getCenter())) {
                i -= i2;
            }
            int[] iArr = new int[list.size()];
            List list2 = list;
            int size = list2.size();
            for (int i3 = 0; i3 < size; i3++) {
                iArr[i3] = ((Placeable) list.get(i3)).getHeight();
                if (i3 < list.size() - 1) {
                    int i4 = iArr[i3];
                    WideNavigationRailLayout$lambda$8 = WideNavigationRailKt.WideNavigationRailLayout$lambda$8(state);
                    iArr[i3] = i4 + placementScope.mo522roundToPx0680j_4(WideNavigationRailLayout$lambda$8);
                }
            }
            int[] iArr2 = new int[list.size()];
            vertical.arrange(placementScope, i, iArr, iArr2);
            if (Intrinsics.areEqual(vertical, Arrangement.INSTANCE.getCenter())) {
                i2 = 0;
            }
            int size2 = list2.size();
            for (int i5 = 0; i5 < size2; i5++) {
                Placeable.PlacementScope.placeRelative$default(placementScope, (Placeable) list.get(i5), 0, iArr2[i5] + i2, 0.0f, 4, null);
            }
        }
        return Unit.INSTANCE;
    }
}
