package com.squareup.cash.money.views;

import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSize;
import com.squareup.cash.support.chat.views.ChatExitPromptSheetView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes6.dex */
public final /* synthetic */ class MoneyTabUIKt$$ExternalSyntheticLambda14 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ ParcelableSnapshotMutableIntState f$0;

    public /* synthetic */ MoneyTabUIKt$$ExternalSyntheticLambda14(int i, ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState) {
        this.$r8$classId = i;
        this.f$0 = parcelableSnapshotMutableIntState;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState = this.f$0;
        switch (i) {
            case 0:
                ((Density) obj).getClass();
                break;
            case 1:
                parcelableSnapshotMutableIntState.setIntValue((int) (((IntSize) obj).packedValue & BodyPartID.bodyIdMax));
                break;
            case 2:
                parcelableSnapshotMutableIntState.setIntValue(((Integer) obj).intValue());
                break;
            case 3:
                LayoutCoordinates layoutCoordinates = (LayoutCoordinates) obj;
                layoutCoordinates.getClass();
                parcelableSnapshotMutableIntState.setIntValue((int) (layoutCoordinates.mo838getSizeYbymL2g() & BodyPartID.bodyIdMax));
                break;
            case 4:
                LayoutCoordinates layoutCoordinates2 = (LayoutCoordinates) obj;
                layoutCoordinates2.getClass();
                parcelableSnapshotMutableIntState.setIntValue((int) (layoutCoordinates2.mo838getSizeYbymL2g() & BodyPartID.bodyIdMax));
                break;
            case 5:
                parcelableSnapshotMutableIntState.setIntValue((int) (((IntSize) obj).packedValue & BodyPartID.bodyIdMax));
                break;
            case 6:
                LayoutCoordinates layoutCoordinates3 = (LayoutCoordinates) obj;
                layoutCoordinates3.getClass();
                parcelableSnapshotMutableIntState.setIntValue((int) (layoutCoordinates3.mo838getSizeYbymL2g() & BodyPartID.bodyIdMax));
                break;
            case 7:
                LayoutCoordinates layoutCoordinates4 = (LayoutCoordinates) obj;
                layoutCoordinates4.getClass();
                parcelableSnapshotMutableIntState.setIntValue((int) (layoutCoordinates4.mo838getSizeYbymL2g() & BodyPartID.bodyIdMax));
                break;
            case 8:
                LayoutCoordinates layoutCoordinates5 = (LayoutCoordinates) obj;
                layoutCoordinates5.getClass();
                parcelableSnapshotMutableIntState.setIntValue((int) (layoutCoordinates5.mo838getSizeYbymL2g() & BodyPartID.bodyIdMax));
                break;
            case 9:
                LayoutCoordinates layoutCoordinates6 = (LayoutCoordinates) obj;
                layoutCoordinates6.getClass();
                parcelableSnapshotMutableIntState.setIntValue((int) (layoutCoordinates6.mo838getSizeYbymL2g() & BodyPartID.bodyIdMax));
                break;
            case 10:
                LayoutCoordinates layoutCoordinates7 = (LayoutCoordinates) obj;
                layoutCoordinates7.getClass();
                parcelableSnapshotMutableIntState.setIntValue((int) (layoutCoordinates7.mo838getSizeYbymL2g() & BodyPartID.bodyIdMax));
                break;
            case 11:
                ((Density) obj).getClass();
                break;
            case 12:
                parcelableSnapshotMutableIntState.setIntValue((int) (((IntSize) obj).packedValue & BodyPartID.bodyIdMax));
                break;
            case 13:
                parcelableSnapshotMutableIntState.setIntValue(((Integer) obj).intValue());
                break;
            case 14:
                parcelableSnapshotMutableIntState.setIntValue((int) (((IntSize) obj).packedValue & BodyPartID.bodyIdMax));
                break;
            case 15:
                parcelableSnapshotMutableIntState.setIntValue((int) (((IntSize) obj).packedValue & BodyPartID.bodyIdMax));
                break;
            case 16:
                parcelableSnapshotMutableIntState.setIntValue(((Integer) obj).intValue());
                break;
            case 17:
                parcelableSnapshotMutableIntState.setIntValue(((Integer) obj).intValue());
                break;
            case 18:
                IntSize intSize = (IntSize) obj;
                if (Math.abs(((int) (intSize.packedValue & BodyPartID.bodyIdMax)) - parcelableSnapshotMutableIntState.getIntValue()) > 4) {
                    parcelableSnapshotMutableIntState.setIntValue((int) (intSize.packedValue & BodyPartID.bodyIdMax));
                }
                break;
            case 19:
                parcelableSnapshotMutableIntState.setIntValue(((Integer) obj).intValue());
                break;
            case 20:
                IntSize intSize2 = (IntSize) obj;
                if (Math.abs(((int) (intSize2.packedValue & BodyPartID.bodyIdMax)) - parcelableSnapshotMutableIntState.getIntValue()) > 4) {
                    parcelableSnapshotMutableIntState.setIntValue((int) (intSize2.packedValue & BodyPartID.bodyIdMax));
                }
                break;
            case 21:
                parcelableSnapshotMutableIntState.setIntValue(((Integer) obj).intValue());
                break;
            case 22:
                TextLayoutResult textLayoutResult = (TextLayoutResult) obj;
                textLayoutResult.getClass();
                if (textLayoutResult.getHasVisualOverflow()) {
                    parcelableSnapshotMutableIntState.setIntValue(parcelableSnapshotMutableIntState.getIntValue() - 10);
                }
                break;
            case 23:
                TextLayoutResult textLayoutResult2 = (TextLayoutResult) obj;
                textLayoutResult2.getClass();
                if (textLayoutResult2.getHasVisualOverflow()) {
                    parcelableSnapshotMutableIntState.setIntValue(parcelableSnapshotMutableIntState.getIntValue() - 10);
                }
                break;
            case 24:
                parcelableSnapshotMutableIntState.setIntValue((int) (((IntSize) obj).packedValue & BodyPartID.bodyIdMax));
                break;
            case 25:
                IntSize intSize3 = (IntSize) obj;
                if (((int) (intSize3.packedValue & BodyPartID.bodyIdMax)) > parcelableSnapshotMutableIntState.getIntValue()) {
                    parcelableSnapshotMutableIntState.setIntValue((int) (intSize3.packedValue & BodyPartID.bodyIdMax));
                }
                break;
            case 26:
                int intValue = ((Integer) obj).intValue();
                int i2 = ChatExitPromptSheetView.$r8$clinit;
                parcelableSnapshotMutableIntState.setIntValue(intValue);
                break;
            case 27:
                parcelableSnapshotMutableIntState.setIntValue((int) (((IntSize) obj).packedValue & BodyPartID.bodyIdMax));
                break;
            default:
                parcelableSnapshotMutableIntState.setIntValue((int) (((IntSize) obj).packedValue >> 32));
                break;
        }
        return Unit.INSTANCE;
    }
}
