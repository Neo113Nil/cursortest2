package com.squareup.cash.card.onboarding;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.cash.card.onboarding.CardStudioExitDialogResult;
import com.squareup.cash.card.onboarding.CardStudioMoreSheetResult;
import com.squareup.cash.card.onboarding.CardStudioUndoResult;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class StampResult implements Parcelable {
    public static final Parcelable.Creator<StampResult> CREATOR = new Creator(0);
    public final List svgStamps;

    public final class Creator implements Parcelable.Creator {
        public final /* synthetic */ int $r8$classId;

        public /* synthetic */ Creator(int i) {
            this.$r8$classId = i;
        }

        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            int i = 0;
            switch (this.$r8$classId) {
                case 0:
                    parcel.getClass();
                    if (parcel.readInt() == 0) {
                        arrayList = null;
                    } else {
                        int readInt = parcel.readInt();
                        ArrayList arrayList2 = new ArrayList(readInt);
                        while (i != readInt) {
                            i = CameraState$Type$EnumUnboxingLocalUtility.m(StampResult.class, parcel, arrayList2, i, 1);
                        }
                        arrayList = arrayList2;
                    }
                    return new StampResult(arrayList);
                case 1:
                    parcel.getClass();
                    parcel.readInt();
                    return CardStudioExitDialogResult.Exit.INSTANCE;
                case 2:
                    parcel.getClass();
                    parcel.readInt();
                    return CardStudioExitDialogResult.Stay.INSTANCE;
                case 3:
                    parcel.getClass();
                    parcel.readInt();
                    return CardStudioMoreSheetResult.Dismissed.INSTANCE;
                case 4:
                    parcel.getClass();
                    return new CardStudioMoreSheetResult.Done(parcel.readInt() != 0);
                case 5:
                    parcel.getClass();
                    return new CardStudioMoreSheetResult.StartOver(parcel.readInt() != 0);
                case 6:
                    parcel.getClass();
                    parcel.readInt();
                    return CardStudioUndoResult.Cancel.INSTANCE;
                case 7:
                    parcel.getClass();
                    parcel.readInt();
                    return CardStudioUndoResult.Undo.INSTANCE;
                case 8:
                    parcel.getClass();
                    parcel.readInt();
                    return ConfirmExitDisclosureResult$Negative.INSTANCE;
                default:
                    parcel.getClass();
                    parcel.readInt();
                    return ConfirmExitDisclosureResult$Positive.INSTANCE;
            }
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            switch (this.$r8$classId) {
                case 0:
                    return new StampResult[i];
                case 1:
                    return new CardStudioExitDialogResult.Exit[i];
                case 2:
                    return new CardStudioExitDialogResult.Stay[i];
                case 3:
                    return new CardStudioMoreSheetResult.Dismissed[i];
                case 4:
                    return new CardStudioMoreSheetResult.Done[i];
                case 5:
                    return new CardStudioMoreSheetResult.StartOver[i];
                case 6:
                    return new CardStudioUndoResult.Cancel[i];
                case 7:
                    return new CardStudioUndoResult.Undo[i];
                case 8:
                    return new ConfirmExitDisclosureResult$Negative[i];
                default:
                    return new ConfirmExitDisclosureResult$Positive[i];
            }
        }
    }

    public StampResult(List list) {
        this.svgStamps = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof StampResult) && Intrinsics.areEqual(this.svgStamps, ((StampResult) obj).svgStamps);
    }

    public final int hashCode() {
        List list = this.svgStamps;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        return CameraState$Type$EnumUnboxingLocalUtility.m("StampResult(svgStamps=", ")", this.svgStamps);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        List list = this.svgStamps;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator m = SVG$Unit$EnumUnboxingLocalUtility.m(parcel, 1, list);
        while (m.hasNext()) {
            parcel.writeParcelable((Parcelable) m.next(), i);
        }
    }
}
