package com.squareup.cash.buynowpaylater.viewmodels;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import com.squareup.cash.borrow.screens.BorrowLimitHub;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class InfoSheetViewModel implements Parcelable {
    public static final Parcelable.Creator<InfoSheetViewModel> CREATOR = new BorrowLimitHub.Creator(18);
    public final List stackableContent;

    public InfoSheetViewModel(List list) {
        list.getClass();
        this.stackableContent = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof InfoSheetViewModel) && Intrinsics.areEqual(this.stackableContent, ((InfoSheetViewModel) obj).stackableContent);
    }

    public final int hashCode() {
        return this.stackableContent.hashCode();
    }

    public final String toString() {
        return CameraState$Type$EnumUnboxingLocalUtility.m("InfoSheetViewModel(stackableContent=", ")", this.stackableContent);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        Iterator m = CameraState$Type$EnumUnboxingLocalUtility.m(this.stackableContent, parcel);
        while (m.hasNext()) {
            parcel.writeParcelable((Parcelable) m.next(), i);
        }
    }
}
