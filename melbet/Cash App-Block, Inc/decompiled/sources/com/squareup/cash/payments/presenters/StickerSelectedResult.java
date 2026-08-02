package com.squareup.cash.payments.presenters;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.cash.payments.presenters.PaymentRouterData;
import com.squareup.cash.payments.viewmodels.Sticker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class StickerSelectedResult implements Parcelable {
    public static final Parcelable.Creator<StickerSelectedResult> CREATOR = new PaymentRouterData.Creator(2);
    public final Sticker sticker;

    public StickerSelectedResult(Sticker sticker) {
        sticker.getClass();
        this.sticker = sticker;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof StickerSelectedResult) && Intrinsics.areEqual(this.sticker, ((StickerSelectedResult) obj).sticker);
    }

    public final int hashCode() {
        return this.sticker.hashCode();
    }

    public final String toString() {
        return "StickerSelectedResult(sticker=" + this.sticker + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.sticker, i);
    }
}
