package com.squareup.cash.marketing.components;

import androidx.compose.foundation.layout.WrapContentNode$$ExternalSyntheticLambda0;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public final class CardUpsellKt$SmallUpsellCardContent$2$1 implements MeasurePolicy {
    public final /* synthetic */ Object $illustration;
    public final /* synthetic */ int $mediumSpacePx;
    public final /* synthetic */ int $r8$classId = 1;

    public CardUpsellKt$SmallUpsellCardContent$2$1(int i, ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState) {
        this.$mediumSpacePx = i;
        this.$illustration = parcelableSnapshotMutableIntState;
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    /* renamed from: measure-3p2s80s */
    public final MeasureResult mo138measure3p2s80s(MeasureScope measureScope, List list, final long j) {
        int max;
        int i;
        int i2;
        CardUpsellIllustration cardUpsellIllustration;
        int i3 = this.$r8$classId;
        Object obj = this.$illustration;
        switch (i3) {
            case 0:
                measureScope.getClass();
                list.getClass();
                Measurable measurable = (Measurable) list.get(0);
                Measurable measurable2 = (Measurable) list.get(1);
                Measurable measurable3 = (Measurable) list.get(2);
                final Placeable mo833measureBRTryo0 = measurable.mo833measureBRTryo0(j);
                final Placeable mo833measureBRTryo02 = measurable3.mo833measureBRTryo0(j);
                int i4 = mo833measureBRTryo0.height;
                boolean z = i4 > 0 && (cardUpsellIllustration = (CardUpsellIllustration) obj) != null && cardUpsellIllustration.height < 95;
                boolean z2 = i4 > 0 && measureScope.getFontScale() > 1.0f;
                final Placeable mo833measureBRTryo03 = measurable2.mo833measureBRTryo0((z || z2) ? j : Constraints.m1018copyZbe2FdA$default(j, 0, Constraints.m1025getMaxWidthimpl(j) - mo833measureBRTryo0.width, 0, 0, 13));
                if (z2) {
                    i = mo833measureBRTryo0.height + this.$mediumSpacePx + mo833measureBRTryo03.height;
                    i2 = mo833measureBRTryo02.height;
                } else {
                    if (!z || (i = mo833measureBRTryo0.height) <= 0) {
                        max = Math.max(mo833measureBRTryo0.height, mo833measureBRTryo03.height + mo833measureBRTryo02.height);
                        final int i5 = max;
                        int m1025getMaxWidthimpl = Constraints.m1025getMaxWidthimpl(j);
                        final int i6 = this.$mediumSpacePx;
                        final boolean z3 = z2;
                        return MeasureScope.layout$default(measureScope, m1025getMaxWidthimpl, i5, new Function1() { // from class: com.squareup.cash.marketing.components.CardUpsellKt$SmallUpsellCardContent$2$1$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                Placeable.PlacementScope placementScope = (Placeable.PlacementScope) obj2;
                                placementScope.getClass();
                                boolean z4 = z3;
                                Placeable placeable = mo833measureBRTryo0;
                                Placeable placeable2 = mo833measureBRTryo03;
                                int i7 = i5;
                                if (z4) {
                                    int i8 = i6;
                                    placementScope.placeRelative(placeable, i8, 0, RecyclerView.DECELERATION_RATE);
                                    placementScope.placeRelative(placeable2, 0, placeable.height + i8, RecyclerView.DECELERATION_RATE);
                                } else {
                                    placementScope.placeRelative(placeable2, 0, 0, RecyclerView.DECELERATION_RATE);
                                    placementScope.placeRelative(placeable, Constraints.m1025getMaxWidthimpl(j) - placeable.width, i7 - placeable.height, RecyclerView.DECELERATION_RATE);
                                }
                                Placeable placeable3 = mo833measureBRTryo02;
                                placementScope.placeRelative(placeable3, 0, i7 - placeable3.height, RecyclerView.DECELERATION_RATE);
                                return Unit.INSTANCE;
                            }
                        });
                    }
                    i2 = mo833measureBRTryo03.height;
                }
                max = i + i2;
                final int i52 = max;
                int m1025getMaxWidthimpl2 = Constraints.m1025getMaxWidthimpl(j);
                final int i62 = this.$mediumSpacePx;
                final boolean z32 = z2;
                return MeasureScope.layout$default(measureScope, m1025getMaxWidthimpl2, i52, new Function1() { // from class: com.squareup.cash.marketing.components.CardUpsellKt$SmallUpsellCardContent$2$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        Placeable.PlacementScope placementScope = (Placeable.PlacementScope) obj2;
                        placementScope.getClass();
                        boolean z4 = z32;
                        Placeable placeable = mo833measureBRTryo0;
                        Placeable placeable2 = mo833measureBRTryo03;
                        int i7 = i52;
                        if (z4) {
                            int i8 = i62;
                            placementScope.placeRelative(placeable, i8, 0, RecyclerView.DECELERATION_RATE);
                            placementScope.placeRelative(placeable2, 0, placeable.height + i8, RecyclerView.DECELERATION_RATE);
                        } else {
                            placementScope.placeRelative(placeable2, 0, 0, RecyclerView.DECELERATION_RATE);
                            placementScope.placeRelative(placeable, Constraints.m1025getMaxWidthimpl(j) - placeable.width, i7 - placeable.height, RecyclerView.DECELERATION_RATE);
                        }
                        Placeable placeable3 = mo833measureBRTryo02;
                        placementScope.placeRelative(placeable3, 0, i7 - placeable3.height, RecyclerView.DECELERATION_RATE);
                        return Unit.INSTANCE;
                    }
                });
            default:
                measureScope.getClass();
                list.getClass();
                Placeable mo833measureBRTryo04 = ((Measurable) list.get(0)).mo833measureBRTryo0(Constraints.m1018copyZbe2FdA$default(j, 0, 0, 0, 0, 10));
                Placeable mo833measureBRTryo05 = ((Measurable) list.get(1)).mo833measureBRTryo0(Constraints.m1018copyZbe2FdA$default(j, 0, Constraints.m1025getMaxWidthimpl(j) - mo833measureBRTryo04.width, 0, 0, 8));
                int i7 = mo833measureBRTryo04.height;
                return MeasureScope.layout$default(measureScope, Constraints.m1025getMaxWidthimpl(j), Math.max(i7, mo833measureBRTryo05.height), new WrapContentNode$$ExternalSyntheticLambda0(i7, this.$mediumSpacePx, mo833measureBRTryo04, mo833measureBRTryo05, (ParcelableSnapshotMutableIntState) obj));
        }
    }

    public CardUpsellKt$SmallUpsellCardContent$2$1(CardUpsellIllustration cardUpsellIllustration, int i) {
        this.$illustration = cardUpsellIllustration;
        this.$mediumSpacePx = i;
    }
}
