package com.squareup.cash.payments.viewmodels;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.squareup.cash.payments.viewmodels.Size;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.Random;

/* loaded from: classes6.dex */
public final class Sticker implements Element, Parcelable {
    public static final Parcelable.Creator<Sticker> CREATOR = new Size.Creator(24);
    public final String accessibilityDescription;
    public final int id;
    public final String mainUrl;
    public final String previewUrl;
    public final ListProperty properties;
    public final String remoteId;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Sticker(int i, ListProperty listProperty, String str, String str2, String str3, String str4, int i2) {
        this(i, (i2 & 2) != 0 ? new ListProperty((Position) null, (Rotation) null, (Zoom) null, (Size) null, 31) : listProperty, str, str2, str3, (i2 & 32) != 0 ? null : str4);
        if ((i2 & 1) != 0) {
            Random.Default.getClass();
            i = Random.defaultRandom.nextInt();
        }
    }

    @Override // com.squareup.cash.payments.viewmodels.Element
    public final boolean canZoom(float f) {
        return f <= 4.0f;
    }

    @Override // com.squareup.cash.payments.viewmodels.Element
    public final Element copy(ListProperty listProperty) {
        return new Sticker(this.id, listProperty, this.mainUrl, this.previewUrl, this.remoteId, this.accessibilityDescription);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Sticker)) {
            return false;
        }
        Sticker sticker = (Sticker) obj;
        return this.id == sticker.id && Intrinsics.areEqual(this.properties, sticker.properties) && Intrinsics.areEqual(this.mainUrl, sticker.mainUrl) && Intrinsics.areEqual(this.previewUrl, sticker.previewUrl) && Intrinsics.areEqual(this.remoteId, sticker.remoteId) && Intrinsics.areEqual(this.accessibilityDescription, sticker.accessibilityDescription);
    }

    @Override // com.squareup.cash.payments.viewmodels.Element
    public final int getId() {
        return this.id;
    }

    @Override // com.squareup.cash.payments.viewmodels.Element
    public final ListProperty getProperties() {
        return this.properties;
    }

    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.properties.hashCode() + (Integer.hashCode(this.id) * 31)) * 31, 31, this.mainUrl), 31, this.previewUrl), 31, this.remoteId);
        String str = this.accessibilityDescription;
        return m + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Sticker(id=");
        sb.append(this.id);
        sb.append(", properties=");
        sb.append(this.properties);
        sb.append(", mainUrl=");
        Boxes$$ExternalSyntheticOutline1.m(sb, this.mainUrl, ", previewUrl=", this.previewUrl, ", remoteId=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.remoteId, ", accessibilityDescription=", this.accessibilityDescription, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(this.id);
        this.properties.writeToParcel(parcel, i);
        parcel.writeString(this.mainUrl);
        parcel.writeString(this.previewUrl);
        parcel.writeString(this.remoteId);
        parcel.writeString(this.accessibilityDescription);
    }

    public Sticker(int i, ListProperty listProperty, String str, String str2, String str3, String str4) {
        listProperty.getClass();
        str.getClass();
        str2.getClass();
        str3.getClass();
        this.id = i;
        this.properties = listProperty;
        this.mainUrl = str;
        this.previewUrl = str2;
        this.remoteId = str3;
        this.accessibilityDescription = str4;
    }
}
