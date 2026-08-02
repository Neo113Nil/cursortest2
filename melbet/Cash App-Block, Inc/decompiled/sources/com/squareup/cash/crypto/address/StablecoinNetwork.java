package com.squareup.cash.crypto.address;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.composable.adapter.ViewStateId;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class StablecoinNetwork implements Parcelable {
    public static final Parcelable.Creator<StablecoinNetwork> CREATOR = new ViewStateId.Creator(13);
    public final String address;
    public final String asset;
    public final String assetIconDarkUrl;
    public final String assetIconLightUrl;
    public final String assetName;
    public final String chain;
    public final String chainIconDarkUrl;
    public final String chainIconLightUrl;
    public final String chainName;
    public final String truncatedAddress;

    public StablecoinNetwork(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
        BalanceFeedKt$$ExternalSyntheticOutline0.m(str, str2, str3, str4, str5);
        re$$ExternalSyntheticOutline0.m1432m(str6, str7, str8);
        this.address = str;
        this.truncatedAddress = str2;
        this.chain = str3;
        this.chainName = str4;
        this.asset = str5;
        this.assetName = str6;
        this.chainIconLightUrl = str7;
        this.chainIconDarkUrl = str8;
        this.assetIconLightUrl = str9;
        this.assetIconDarkUrl = str10;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StablecoinNetwork)) {
            return false;
        }
        StablecoinNetwork stablecoinNetwork = (StablecoinNetwork) obj;
        return Intrinsics.areEqual(this.address, stablecoinNetwork.address) && Intrinsics.areEqual(this.truncatedAddress, stablecoinNetwork.truncatedAddress) && Intrinsics.areEqual(this.chain, stablecoinNetwork.chain) && Intrinsics.areEqual(this.chainName, stablecoinNetwork.chainName) && Intrinsics.areEqual(this.asset, stablecoinNetwork.asset) && Intrinsics.areEqual(this.assetName, stablecoinNetwork.assetName) && Intrinsics.areEqual(this.chainIconLightUrl, stablecoinNetwork.chainIconLightUrl) && Intrinsics.areEqual(this.chainIconDarkUrl, stablecoinNetwork.chainIconDarkUrl) && Intrinsics.areEqual(this.assetIconLightUrl, stablecoinNetwork.assetIconLightUrl) && Intrinsics.areEqual(this.assetIconDarkUrl, stablecoinNetwork.assetIconDarkUrl);
    }

    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.address.hashCode() * 31, 31, this.truncatedAddress), 31, this.chain), 31, this.chainName), 31, this.asset), 31, this.assetName), 31, this.chainIconLightUrl), 31, this.chainIconDarkUrl);
        String str = this.assetIconLightUrl;
        int hashCode = (m + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.assetIconDarkUrl;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("StablecoinNetwork(address=", this.address, ", truncatedAddress=", this.truncatedAddress, ", chain=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.chain, ", chainName=", this.chainName, ", asset=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.asset, ", assetName=", this.assetName, ", chainIconLightUrl=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.chainIconLightUrl, ", chainIconDarkUrl=", this.chainIconDarkUrl, ", assetIconLightUrl=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, this.assetIconLightUrl, ", assetIconDarkUrl=", this.assetIconDarkUrl, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.address);
        parcel.writeString(this.truncatedAddress);
        parcel.writeString(this.chain);
        parcel.writeString(this.chainName);
        parcel.writeString(this.asset);
        parcel.writeString(this.assetName);
        parcel.writeString(this.chainIconLightUrl);
        parcel.writeString(this.chainIconDarkUrl);
        parcel.writeString(this.assetIconLightUrl);
        parcel.writeString(this.assetIconDarkUrl);
    }
}
