package com.squareup.cash.graphics.backend.gl.core;

import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import com.squareup.cash.graphics.backend.gl.core.PBRMaterial;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes6.dex */
public final /* synthetic */ class PBRMaterial$PBRMaterialInstance$$ExternalSyntheticLambda0 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ PBRMaterial.PBRMaterialInstance f$0;

    public /* synthetic */ PBRMaterial$PBRMaterialInstance$$ExternalSyntheticLambda0(PBRMaterial.PBRMaterialInstance pBRMaterialInstance, int i) {
        this.$r8$classId = i;
        this.f$0 = pBRMaterialInstance;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        PBRMaterial.PBRMaterialInstance pBRMaterialInstance = this.f$0;
        switch (i) {
            case 0:
                ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState = pBRMaterialInstance.invalidator;
                parcelableSnapshotMutableIntState.setIntValue(parcelableSnapshotMutableIntState.getIntValue() + 1);
                break;
            case 1:
                ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState2 = pBRMaterialInstance.invalidator;
                parcelableSnapshotMutableIntState2.setIntValue(parcelableSnapshotMutableIntState2.getIntValue() + 1);
                break;
            default:
                ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState3 = pBRMaterialInstance.invalidator;
                parcelableSnapshotMutableIntState3.setIntValue(parcelableSnapshotMutableIntState3.getIntValue() + 1);
                break;
        }
        return Unit.INSTANCE;
    }
}
