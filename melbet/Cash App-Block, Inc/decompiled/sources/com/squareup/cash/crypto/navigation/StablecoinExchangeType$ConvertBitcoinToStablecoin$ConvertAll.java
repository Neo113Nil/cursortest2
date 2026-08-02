package com.squareup.cash.crypto.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.squareup.cash.composable.adapter.ViewStateId;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class StablecoinExchangeType$ConvertBitcoinToStablecoin$ConvertAll implements Parcelable {
    public static final Parcelable.Creator<StablecoinExchangeType$ConvertBitcoinToStablecoin$ConvertAll> CREATOR = new ViewStateId.Creator(28);
    public final String sourceToken;
    public final String targetToken;

    public StablecoinExchangeType$ConvertBitcoinToStablecoin$ConvertAll(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.sourceToken = str;
        this.targetToken = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StablecoinExchangeType$ConvertBitcoinToStablecoin$ConvertAll)) {
            return false;
        }
        StablecoinExchangeType$ConvertBitcoinToStablecoin$ConvertAll stablecoinExchangeType$ConvertBitcoinToStablecoin$ConvertAll = (StablecoinExchangeType$ConvertBitcoinToStablecoin$ConvertAll) obj;
        return Intrinsics.areEqual(this.sourceToken, stablecoinExchangeType$ConvertBitcoinToStablecoin$ConvertAll.sourceToken) && Intrinsics.areEqual(this.targetToken, stablecoinExchangeType$ConvertBitcoinToStablecoin$ConvertAll.targetToken);
    }

    public final int hashCode() {
        return this.targetToken.hashCode() + (this.sourceToken.hashCode() * 31);
    }

    public final String toString() {
        return Boxes$$ExternalSyntheticOutline1.m("ConvertAll(sourceToken=", this.sourceToken, ", targetToken=", this.targetToken, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.sourceToken);
        parcel.writeString(this.targetToken);
    }
}
