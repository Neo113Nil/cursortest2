package com.squareup.cash.collapsingtoolbar.views;

import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.IntOffset;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function1;
import kotlin.ranges.RangesKt___RangesKt;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes6.dex */
public final class CollapsingToolbarMeasurePolicy implements MeasurePolicy {
    public final CollapsingToolbarState collapsingToolbarState;

    public CollapsingToolbarMeasurePolicy(CollapsingToolbarState collapsingToolbarState) {
        collapsingToolbarState.getClass();
        this.collapsingToolbarState = collapsingToolbarState;
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    /* renamed from: measure-3p2s80s */
    public final MeasureResult mo138measure3p2s80s(final MeasureScope measureScope, List list, long j) {
        Integer valueOf;
        Integer valueOf2;
        measureScope.getClass();
        list.getClass();
        List list2 = list;
        final ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            long j2 = j;
            arrayList.add(((Measurable) it.next()).mo833measureBRTryo0(Constraints.m1018copyZbe2FdA$default(j2, 0, 0, 0, Integer.MAX_VALUE, 2)));
            j = j2;
        }
        long j3 = j;
        final ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((Measurable) it2.next()).getParentData());
        }
        Iterator it3 = arrayList.iterator();
        Integer num = null;
        if (it3.hasNext()) {
            valueOf = Integer.valueOf(((Placeable) it3.next()).height);
            while (it3.hasNext()) {
                Integer valueOf3 = Integer.valueOf(((Placeable) it3.next()).height);
                if (valueOf.compareTo(valueOf3) > 0) {
                    valueOf = valueOf3;
                }
            }
        } else {
            valueOf = null;
        }
        final int coerceIn = valueOf != null ? RangesKt___RangesKt.coerceIn(valueOf.intValue(), Constraints.m1026getMinHeightimpl(j3), Constraints.m1024getMaxHeightimpl(j3)) : 0;
        Iterator it4 = arrayList.iterator();
        if (it4.hasNext()) {
            valueOf2 = Integer.valueOf(((Placeable) it4.next()).height);
            while (it4.hasNext()) {
                Integer valueOf4 = Integer.valueOf(((Placeable) it4.next()).height);
                if (valueOf2.compareTo(valueOf4) < 0) {
                    valueOf2 = valueOf4;
                }
            }
        } else {
            valueOf2 = null;
        }
        final int coerceIn2 = valueOf2 != null ? RangesKt___RangesKt.coerceIn(valueOf2.intValue(), Constraints.m1026getMinHeightimpl(j3), Constraints.m1024getMaxHeightimpl(j3)) : 0;
        Iterator it5 = arrayList.iterator();
        if (it5.hasNext()) {
            num = Integer.valueOf(((Placeable) it5.next()).width);
            while (it5.hasNext()) {
                Integer valueOf5 = Integer.valueOf(((Placeable) it5.next()).width);
                if (num.compareTo(valueOf5) < 0) {
                    num = valueOf5;
                }
            }
        }
        final int coerceIn3 = num != null ? RangesKt___RangesKt.coerceIn(num.intValue(), Constraints.m1027getMinWidthimpl(j3), Constraints.m1025getMaxWidthimpl(j3)) : 0;
        CollapsingToolbarState collapsingToolbarState = this.collapsingToolbarState;
        ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState = collapsingToolbarState.minHeightState$delegate;
        ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState2 = collapsingToolbarState.height$delegate;
        parcelableSnapshotMutableIntState.setIntValue(coerceIn);
        if (parcelableSnapshotMutableIntState2.getIntValue() < coerceIn) {
            parcelableSnapshotMutableIntState2.setIntValue(coerceIn);
        }
        boolean z = collapsingToolbarState.getProgress() == 1.0f;
        collapsingToolbarState.maxHeightState$delegate.setIntValue(coerceIn2);
        if (coerceIn2 < parcelableSnapshotMutableIntState2.getIntValue() || z) {
            parcelableSnapshotMutableIntState2.setIntValue(coerceIn2);
        }
        final int intValue = parcelableSnapshotMutableIntState2.getIntValue();
        return MeasureScope.layout$default(measureScope, coerceIn3, intValue, new Function1(arrayList, arrayList2, coerceIn3, intValue, measureScope, coerceIn2, coerceIn) { // from class: com.squareup.cash.collapsingtoolbar.views.CollapsingToolbarMeasurePolicy$$ExternalSyntheticLambda0
            public final /* synthetic */ ArrayList f$1;
            public final /* synthetic */ ArrayList f$2;
            public final /* synthetic */ int f$3;
            public final /* synthetic */ int f$4;
            public final /* synthetic */ MeasureScope f$5;

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                float f;
                Iterator it6;
                Placeable.PlacementScope placementScope = (Placeable.PlacementScope) obj;
                placementScope.getClass();
                float progress = CollapsingToolbarMeasurePolicy.this.collapsingToolbarState.getProgress();
                Iterator it7 = this.f$1.iterator();
                int i = 0;
                while (it7.hasNext()) {
                    Object next = it7.next();
                    int i2 = i + 1;
                    if (i < 0) {
                        CollectionsKt__CollectionsKt.throwIndexOverflow();
                        throw null;
                    }
                    Placeable placeable = (Placeable) next;
                    if (this.f$2.get(i) instanceof CollapsingToolbarRoadData) {
                        BiasAlignment biasAlignment = Alignment.Companion.BottomStart;
                        long j4 = (placeable.width << 32) | (placeable.height & BodyPartID.bodyIdMax);
                        long j5 = (this.f$3 << 32) | (this.f$4 & BodyPartID.bodyIdMax);
                        MeasureScope measureScope2 = this.f$5;
                        long mo584alignKFBX0sM = biasAlignment.mo584alignKFBX0sM(j4, j5, measureScope2.getLayoutDirection());
                        f = progress;
                        it6 = it7;
                        long m1048minusqkQi6aY = IntOffset.m1048minusqkQi6aY(biasAlignment.mo584alignKFBX0sM((placeable.height & BodyPartID.bodyIdMax) | (placeable.width << 32), j5, measureScope2.getLayoutDirection()), mo584alignKFBX0sM);
                        long m1049plusqkQi6aY = IntOffset.m1049plusqkQi6aY(mo584alignKFBX0sM, (Math.round(((int) (m1048minusqkQi6aY >> 32)) * f) << 32) | (Math.round(((int) (m1048minusqkQi6aY & BodyPartID.bodyIdMax)) * f) & BodyPartID.bodyIdMax));
                        placementScope.place(placeable, (int) (m1049plusqkQi6aY >> 32), (int) (m1049plusqkQi6aY & BodyPartID.bodyIdMax), RecyclerView.DECELERATION_RATE);
                    } else {
                        f = progress;
                        it6 = it7;
                        placementScope.placeRelative(placeable, 0, 0, RecyclerView.DECELERATION_RATE);
                    }
                    progress = f;
                    i = i2;
                    it7 = it6;
                }
                return Unit.INSTANCE;
            }
        });
    }
}
