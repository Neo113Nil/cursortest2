package com.squareup.cash.card.onboarding;

import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.ParcelableSnapshotMutableFloatState;
import kotlin.jvm.functions.Function0;

/* loaded from: classes6.dex */
public final /* synthetic */ class CardStudioViewKt$$ExternalSyntheticLambda21 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ MutableFloatState f$0;
    public final /* synthetic */ MutableFloatState f$1;

    public /* synthetic */ CardStudioViewKt$$ExternalSyntheticLambda21(MutableFloatState mutableFloatState, MutableFloatState mutableFloatState2, int i) {
        this.$r8$classId = i;
        this.f$0 = mutableFloatState;
        this.f$1 = mutableFloatState2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        float floatValue;
        float floatValue2;
        int i = this.$r8$classId;
        MutableFloatState mutableFloatState = this.f$1;
        MutableFloatState mutableFloatState2 = this.f$0;
        switch (i) {
            case 0:
                floatValue = ((ParcelableSnapshotMutableFloatState) mutableFloatState2).getFloatValue();
                floatValue2 = ((ParcelableSnapshotMutableFloatState) mutableFloatState).getFloatValue();
                break;
            case 1:
                floatValue = ((ParcelableSnapshotMutableFloatState) mutableFloatState2).getFloatValue();
                floatValue2 = ((ParcelableSnapshotMutableFloatState) mutableFloatState).getFloatValue();
                break;
            case 2:
                floatValue = ((ParcelableSnapshotMutableFloatState) mutableFloatState2).getFloatValue();
                floatValue2 = ((ParcelableSnapshotMutableFloatState) mutableFloatState).getFloatValue();
                break;
            case 3:
                floatValue = ((ParcelableSnapshotMutableFloatState) mutableFloatState2).getFloatValue();
                floatValue2 = ((ParcelableSnapshotMutableFloatState) mutableFloatState).getFloatValue();
                break;
            case 4:
                floatValue = ((ParcelableSnapshotMutableFloatState) mutableFloatState2).getFloatValue();
                floatValue2 = ((ParcelableSnapshotMutableFloatState) mutableFloatState).getFloatValue();
                break;
            default:
                floatValue = ((ParcelableSnapshotMutableFloatState) mutableFloatState2).getFloatValue();
                floatValue2 = ((ParcelableSnapshotMutableFloatState) mutableFloatState).getFloatValue();
                break;
        }
        return Float.valueOf(floatValue - floatValue2);
    }
}
