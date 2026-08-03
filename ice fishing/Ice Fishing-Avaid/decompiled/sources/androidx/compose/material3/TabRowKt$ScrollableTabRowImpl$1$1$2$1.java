package androidx.compose.material3;

import androidx.collection.MutableIntList;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.MultiContentMeasurePolicy;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.tooling.preview.AndroidUiModes;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Dp;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref;

/* compiled from: TabRow.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
/* loaded from: classes.dex */
final class TabRowKt$ScrollableTabRowImpl$1$1$2$1 implements MultiContentMeasurePolicy {
    final /* synthetic */ float $edgePadding;
    final /* synthetic */ float $minTabWidth;
    final /* synthetic */ TabRowKt$ScrollableTabRowImpl$1$scope$1$1 $scope;
    final /* synthetic */ ScrollableTabData $scrollableTabData;
    final /* synthetic */ int $selectedTabIndex;

    TabRowKt$ScrollableTabRowImpl$1$1$2$1(float f, float f2, TabRowKt$ScrollableTabRowImpl$1$scope$1$1 tabRowKt$ScrollableTabRowImpl$1$scope$1$1, int i, ScrollableTabData scrollableTabData) {
        this.$edgePadding = f;
        this.$minTabWidth = f2;
        this.$scope = tabRowKt$ScrollableTabRowImpl$1$scope$1$1;
        this.$selectedTabIndex = i;
        this.$scrollableTabData = scrollableTabData;
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

    @Override // androidx.compose.ui.layout.MultiContentMeasurePolicy
    /* renamed from: measure-3p2s80s */
    public final MeasureResult mo1062measure3p2s80s(final MeasureScope measureScope, List<? extends List<? extends Measurable>> list, long j) {
        MeasureScope measureScope2 = measureScope;
        List<? extends Measurable> list2 = list.get(0);
        List<? extends Measurable> list3 = list.get(1);
        final int i = measureScope2.mo522roundToPx0680j_4(this.$edgePadding);
        int size = list2.size();
        int i2 = 0;
        List<? extends Measurable> list4 = list2;
        int size2 = list4.size();
        for (int i3 = 0; i3 < size2; i3++) {
            i2 = Integer.valueOf(Math.max(i2.intValue(), list2.get(i3).maxIntrinsicHeight(Integer.MAX_VALUE)));
        }
        int intValue = i2.intValue();
        int i4 = i * 2;
        int i5 = intValue;
        long m9665copyZbe2FdA$default = Constraints.m9665copyZbe2FdA$default(j, measureScope2.mo522roundToPx0680j_4(this.$minTabWidth), 0, i5, intValue, 2, null);
        Ref.FloatRef floatRef = new Ref.FloatRef();
        floatRef.element = this.$edgePadding;
        ArrayList arrayList = new ArrayList(list2.size());
        int size3 = list4.size();
        for (int i6 = 0; i6 < size3; i6++) {
            arrayList.add(list2.get(i6).mo8285measureBRTryo0(m9665copyZbe2FdA$default));
        }
        ArrayList arrayList2 = arrayList;
        MutableIntList mutableIntList = new MutableIntList(0, 1, null);
        int size4 = list4.size();
        for (int i7 = 0; i7 < size4; i7++) {
            mutableIntList.add(list2.get(i7).maxIntrinsicWidth(Integer.MAX_VALUE));
        }
        float f = this.$minTabWidth;
        ArrayList arrayList3 = new ArrayList(size);
        int i8 = i4;
        int i9 = 0;
        while (i9 < size) {
            float m9746unboximpl = ((Dp) ComparisonsKt.maxOf(Dp.m9730boximpl(f), Dp.m9730boximpl(measureScope2.mo525toDpu2uoSUM(((Placeable) arrayList2.get(i9)).getWidth())))).m9746unboximpl();
            i8 += measureScope2.mo522roundToPx0680j_4(m9746unboximpl);
            TabPosition tabPosition = new TabPosition(floatRef.element, m9746unboximpl, ((Dp) ComparisonsKt.maxOf(Dp.m9730boximpl(Dp.m9732constructorimpl(measureScope2.mo525toDpu2uoSUM(mutableIntList.get(i9)) - Dp.m9732constructorimpl(TabKt.getHorizontalTextPadding() * 2))), Dp.m9730boximpl(Dp.m9732constructorimpl(24)))).m9746unboximpl(), null);
            floatRef.element = Dp.m9732constructorimpl(floatRef.element + m9746unboximpl);
            arrayList3.add(tabPosition);
            i9++;
            arrayList2 = arrayList2;
        }
        final ArrayList arrayList4 = arrayList2;
        final ArrayList arrayList5 = arrayList3;
        this.$scope.setTabPositions(arrayList5);
        int i10 = this.$selectedTabIndex;
        ArrayList arrayList6 = new ArrayList(list3.size());
        int size5 = list3.size();
        int i11 = 0;
        while (i11 < size5) {
            int i12 = i5;
            i5 = i12;
            arrayList6.add(list3.get(i11).mo8285measureBRTryo0(Constraints.m9664copyZbe2FdA(j, 0, measureScope2.mo522roundToPx0680j_4(((TabPosition) arrayList5.get(i10)).getContentWidth()), 0, i12)));
            i11++;
            measureScope2 = measureScope;
            floatRef = floatRef;
            list3 = list3;
        }
        final Ref.FloatRef floatRef2 = floatRef;
        final ArrayList arrayList7 = arrayList6;
        final float f2 = this.$edgePadding;
        final ScrollableTabData scrollableTabData = this.$scrollableTabData;
        final int i13 = this.$selectedTabIndex;
        final int i14 = i5;
        return MeasureScope.CC.layout$default(measureScope, i8, i5, null, new Function1() { // from class: androidx.compose.material3.TabRowKt$ScrollableTabRowImpl$1$1$2$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit measure_3p2s80s$lambda$5;
                measure_3p2s80s$lambda$5 = TabRowKt$ScrollableTabRowImpl$1$1$2$1.measure_3p2s80s$lambda$5(Ref.FloatRef.this, f2, arrayList4, arrayList7, scrollableTabData, measureScope, i, arrayList5, i13, i14, (Placeable.PlacementScope) obj);
                return measure_3p2s80s$lambda$5;
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit measure_3p2s80s$lambda$5(Ref.FloatRef floatRef, float f, List list, List list2, ScrollableTabData scrollableTabData, MeasureScope measureScope, int i, List list3, int i2, int i3, Placeable.PlacementScope placementScope) {
        Placeable.PlacementScope placementScope2 = placementScope;
        floatRef.element = f;
        int size = list.size();
        int i4 = 0;
        while (i4 < size) {
            Placeable.PlacementScope placementScope3 = placementScope2;
            Placeable.PlacementScope.placeRelative$default(placementScope3, (Placeable) list.get(i4), placementScope2.mo522roundToPx0680j_4(floatRef.element), 0, 0.0f, 4, null);
            floatRef.element = Dp.m9732constructorimpl(floatRef.element + ((TabPosition) list3.get(i4)).getWidth());
            i4++;
            placementScope2 = placementScope3;
        }
        Placeable.PlacementScope placementScope4 = placementScope2;
        int size2 = list2.size();
        int i5 = 0;
        while (i5 < size2) {
            Placeable placeable = (Placeable) list2.get(i5);
            Placeable.PlacementScope.placeRelative$default(placementScope4, placeable, Math.max(0, (placementScope4.mo522roundToPx0680j_4(((TabPosition) list3.get(i2)).getWidth()) - placeable.getWidth()) / 2), i3 - placeable.getHeight(), 0.0f, 4, null);
            i5++;
            placementScope4 = placementScope;
        }
        scrollableTabData.onLaidOut(measureScope, i, list3, i2);
        return Unit.INSTANCE;
    }
}
