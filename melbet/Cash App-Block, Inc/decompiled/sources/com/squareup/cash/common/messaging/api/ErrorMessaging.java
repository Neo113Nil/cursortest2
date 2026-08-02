package com.squareup.cash.common.messaging.api;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.squareup.cash.clientrouting.data.RoutingParams;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class ErrorMessaging implements Parcelable {
    public static final Parcelable.Creator<ErrorMessaging> CREATOR = new RoutingParams.Creator(18);
    public final String message;
    public final String title;

    public ErrorMessaging(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.title = str;
        this.message = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ErrorMessaging)) {
            return false;
        }
        ErrorMessaging errorMessaging = (ErrorMessaging) obj;
        return Intrinsics.areEqual(this.title, errorMessaging.title) && Intrinsics.areEqual(this.message, errorMessaging.message);
    }

    public final String getMessage() {
        return this.message;
    }

    public final int hashCode() {
        return this.message.hashCode() + (this.title.hashCode() * 31);
    }

    public final String toString() {
        return Boxes$$ExternalSyntheticOutline1.m("ErrorMessaging(title=", this.title, ", message=", this.message, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.title);
        parcel.writeString(this.message);
    }
}
