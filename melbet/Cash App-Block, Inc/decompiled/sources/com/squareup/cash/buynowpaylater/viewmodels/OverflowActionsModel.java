package com.squareup.cash.buynowpaylater.viewmodels;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.cash.borrow.screens.BorrowLimitHub;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class OverflowActionsModel implements Parcelable {
    public static final Parcelable.Creator<OverflowActionsModel> CREATOR = new BorrowLimitHub.Creator(20);
    public final String clientRoute;
    public final TextModel title;

    public OverflowActionsModel(TextModel textModel, String str) {
        this.title = textModel;
        this.clientRoute = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OverflowActionsModel)) {
            return false;
        }
        OverflowActionsModel overflowActionsModel = (OverflowActionsModel) obj;
        return Intrinsics.areEqual(this.title, overflowActionsModel.title) && Intrinsics.areEqual(this.clientRoute, overflowActionsModel.clientRoute);
    }

    public final int hashCode() {
        TextModel textModel = this.title;
        int hashCode = (textModel == null ? 0 : textModel.hashCode()) * 31;
        String str = this.clientRoute;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "OverflowActionsModel(title=" + this.title + ", clientRoute=" + this.clientRoute + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        TextModel textModel = this.title;
        if (textModel == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            textModel.writeToParcel(parcel, i);
        }
        parcel.writeString(this.clientRoute);
    }
}
