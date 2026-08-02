package com.squareup.cash.payments.screens;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.cash.payments.common.PaymentRecipient;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.Image;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class NearbyAvatarInfo implements Parcelable {
    public static final Parcelable.Creator<NearbyAvatarInfo> CREATOR = new PaymentRecipient.Creator(29);
    public final Color accentColor;
    public final Image image;
    public final Character monogram;

    public NearbyAvatarInfo(Character ch, Color color, Image image) {
        color.getClass();
        this.monogram = ch;
        this.accentColor = color;
        this.image = image;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NearbyAvatarInfo)) {
            return false;
        }
        NearbyAvatarInfo nearbyAvatarInfo = (NearbyAvatarInfo) obj;
        return Intrinsics.areEqual(this.monogram, nearbyAvatarInfo.monogram) && Intrinsics.areEqual(this.accentColor, nearbyAvatarInfo.accentColor) && Intrinsics.areEqual(this.image, nearbyAvatarInfo.image);
    }

    public final int hashCode() {
        Character ch = this.monogram;
        int m = SVG$Unit$EnumUnboxingLocalUtility.m(this.accentColor, (ch == null ? 0 : ch.hashCode()) * 31, 31);
        Image image = this.image;
        return m + (image != null ? image.hashCode() : 0);
    }

    public final String toString() {
        return "NearbyAvatarInfo(monogram=" + this.monogram + ", accentColor=" + this.accentColor + ", image=" + this.image + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        char charValue;
        parcel.getClass();
        Character ch = this.monogram;
        if (ch == null) {
            charValue = 0;
        } else {
            parcel.writeInt(1);
            charValue = ch.charValue();
        }
        parcel.writeInt(charValue);
        parcel.writeParcelable(this.accentColor, i);
        parcel.writeParcelable(this.image, i);
    }
}
