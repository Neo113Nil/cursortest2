package com.squareup.cash.borrow.presenters;

import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes5.dex */
public final class RepayCustomAmountPickerPresenter$models$1$1$1 implements Function1 {
    public final /* synthetic */ ParcelableSnapshotMutableIntState $loading$delegate;
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ RepayCustomAmountPickerPresenter$models$1$1$1(int i, ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState) {
        this.$r8$classId = i;
        this.$loading$delegate = parcelableSnapshotMutableIntState;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState = this.$loading$delegate;
        switch (i) {
            case 0:
                if (((Boolean) obj).booleanValue()) {
                    NavAction$$ExternalSyntheticOutline0.m(1, parcelableSnapshotMutableIntState);
                } else {
                    NavAction$$ExternalSyntheticOutline0.m(-1, parcelableSnapshotMutableIntState);
                }
                break;
            default:
                LayoutCoordinates layoutCoordinates = (LayoutCoordinates) obj;
                layoutCoordinates.getClass();
                parcelableSnapshotMutableIntState.setIntValue((int) (layoutCoordinates.mo838getSizeYbymL2g() & BodyPartID.bodyIdMax));
                break;
        }
        return Unit.INSTANCE;
    }
}
