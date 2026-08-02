package com.squareup.cash.paychecks.backend.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.squareup.cash.p2pblocking.screens.P2PListScreen;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class BottomSheet implements Parcelable {
    public static final Parcelable.Creator<BottomSheet> CREATOR = new P2PListScreen.Creator(22);
    public final String description;
    public final String title;

    public BottomSheet(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.title = str;
        this.description = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BottomSheet)) {
            return false;
        }
        BottomSheet bottomSheet = (BottomSheet) obj;
        return Intrinsics.areEqual(this.title, bottomSheet.title) && Intrinsics.areEqual(this.description, bottomSheet.description);
    }

    public final int hashCode() {
        return this.description.hashCode() + (this.title.hashCode() * 31);
    }

    public final String toString() {
        return Boxes$$ExternalSyntheticOutline1.m("BottomSheet(title=", this.title, ", description=", this.description, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.title);
        parcel.writeString(this.description);
    }
}
