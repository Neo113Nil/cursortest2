package com.squareup.cash.multiplatform.bitcoin.parsers.solana;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.music.screens.MusicScreen;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class SolanaAddress implements Parcelable {
    public static final Parcelable.Creator<SolanaAddress> CREATOR = new MusicScreen.Creator(27);
    public final String address;
    public final String amount;
    public final String data;
    public final boolean isUri;
    public final String label;
    public final String memo;
    public final String message;
    public final String splToken;

    public SolanaAddress(String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z) {
        str.getClass();
        str2.getClass();
        this.address = str;
        this.data = str2;
        this.label = str3;
        this.message = str4;
        this.memo = str5;
        this.splToken = str6;
        this.amount = str7;
        this.isUri = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SolanaAddress)) {
            return false;
        }
        SolanaAddress solanaAddress = (SolanaAddress) obj;
        return Intrinsics.areEqual(this.address, solanaAddress.address) && Intrinsics.areEqual(this.data, solanaAddress.data) && Intrinsics.areEqual(this.label, solanaAddress.label) && Intrinsics.areEqual(this.message, solanaAddress.message) && Intrinsics.areEqual(this.memo, solanaAddress.memo) && Intrinsics.areEqual(this.splToken, solanaAddress.splToken) && Intrinsics.areEqual(this.amount, solanaAddress.amount) && this.isUri == solanaAddress.isUri;
    }

    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.address.hashCode() * 31, 31, this.data);
        String str = this.label;
        int hashCode = (m + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.message;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.memo;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.splToken;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.amount;
        return Boolean.hashCode(this.isUri) + ((hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("SolanaAddress(address=", this.address, ", data=", this.data, ", label=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.label, ", message=", this.message, ", memo=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.memo, ", splToken=", this.splToken, ", amount=");
        return re$$ExternalSyntheticOutline0.m(m, this.amount, ", isUri=", this.isUri, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.address);
        parcel.writeString(this.data);
        parcel.writeString(this.label);
        parcel.writeString(this.message);
        parcel.writeString(this.memo);
        parcel.writeString(this.splToken);
        parcel.writeString(this.amount);
        parcel.writeInt(this.isUri ? 1 : 0);
    }
}
