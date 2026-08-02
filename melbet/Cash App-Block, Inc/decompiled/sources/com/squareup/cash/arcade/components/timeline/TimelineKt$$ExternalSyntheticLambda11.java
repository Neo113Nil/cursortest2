package com.squareup.cash.arcade.components.timeline;

import androidx.compose.runtime.snapshots.SnapshotStateMap;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.ValueInsets;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes5.dex */
public final /* synthetic */ class TimelineKt$$ExternalSyntheticLambda11 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ SnapshotStateMap f$0;
    public final /* synthetic */ int f$1;

    public /* synthetic */ TimelineKt$$ExternalSyntheticLambda11(SnapshotStateMap snapshotStateMap, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = snapshotStateMap;
        this.f$1 = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        int i2 = this.f$1;
        SnapshotStateMap snapshotStateMap = this.f$0;
        switch (i) {
            case 0:
                Float f = (Float) obj;
                f.floatValue();
                snapshotStateMap.put(Integer.valueOf(i2), f);
                break;
            case 1:
                LayoutCoordinates layoutCoordinates = (LayoutCoordinates) obj;
                layoutCoordinates.getClass();
                snapshotStateMap.put(Integer.valueOf(i2), Float.valueOf(Float.intBitsToFloat((int) (layoutCoordinates.mo841localToRootMKHz9U(0L) & BodyPartID.bodyIdMax)) + (((int) (BodyPartID.bodyIdMax & layoutCoordinates.mo838getSizeYbymL2g())) / 2)));
                break;
            default:
                LayoutCoordinates layoutCoordinates2 = (LayoutCoordinates) obj;
                layoutCoordinates2.getClass();
                snapshotStateMap.put(Integer.valueOf(i2), Float.valueOf((((int) (BodyPartID.bodyIdMax & layoutCoordinates2.mo838getSizeYbymL2g())) / 2.0f) + Float.intBitsToFloat((int) (ValueInsets.positionInParent(layoutCoordinates2) & BodyPartID.bodyIdMax))));
                break;
        }
        return Unit.INSTANCE;
    }
}
