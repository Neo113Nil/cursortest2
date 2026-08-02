package com.squareup.cash.card.onboarding;

import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.ParcelableSnapshotMutableFloatState;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.ValueInsets;
import androidx.compose.ui.unit.Density;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public final /* synthetic */ class CardStudioViewKt$$ExternalSyntheticLambda37 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Density f$0;
    public final /* synthetic */ MutableFloatState f$1;

    public /* synthetic */ CardStudioViewKt$$ExternalSyntheticLambda37(Density density, MutableFloatState mutableFloatState, int i) {
        this.$r8$classId = i;
        this.f$0 = density;
        this.f$1 = mutableFloatState;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        MutableFloatState mutableFloatState = this.f$1;
        Density density = this.f$0;
        LayoutCoordinates layoutCoordinates = (LayoutCoordinates) obj;
        switch (i) {
            case 0:
                layoutCoordinates.getClass();
                ((ParcelableSnapshotMutableFloatState) mutableFloatState).setFloatValue(ValueInsets.boundsInParent(layoutCoordinates).top - density.mo236toPx0680j_4(8.0f));
                break;
            default:
                layoutCoordinates.getClass();
                ((ParcelableSnapshotMutableFloatState) mutableFloatState).setFloatValue(ValueInsets.boundsInParent(layoutCoordinates).top - density.mo236toPx0680j_4(8.0f));
                break;
        }
        return Unit.INSTANCE;
    }
}
