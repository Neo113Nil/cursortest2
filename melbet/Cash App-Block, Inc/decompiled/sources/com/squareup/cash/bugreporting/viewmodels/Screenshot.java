package com.squareup.cash.bugreporting.viewmodels;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.cash.borrow.screens.BorrowLimitHub;
import com.squareup.cash.fileupload.api.UriString;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class Screenshot implements Parcelable {
    public static final Parcelable.Creator<Screenshot> CREATOR = new BorrowLimitHub.Creator(7);
    public final String fileName;
    public final boolean isVideo;
    public final String uri;

    public Screenshot(String str, String str2, boolean z) {
        str.getClass();
        this.uri = str;
        this.fileName = str2;
        this.isVideo = z;
    }

    /* renamed from: copy-5y75sic$default, reason: not valid java name */
    public static Screenshot m3428copy5y75sic$default(Screenshot screenshot, String str, boolean z, int i) {
        String str2 = screenshot.uri;
        if ((i & 4) != 0) {
            z = screenshot.isVideo;
        }
        screenshot.getClass();
        str2.getClass();
        return new Screenshot(str2, str, z);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Screenshot)) {
            return false;
        }
        Screenshot screenshot = (Screenshot) obj;
        return Intrinsics.areEqual(this.uri, screenshot.uri) && Intrinsics.areEqual(this.fileName, screenshot.fileName) && this.isVideo == screenshot.isVideo;
    }

    public final int hashCode() {
        int hashCode = this.uri.hashCode() * 31;
        String str = this.fileName;
        return Boolean.hashCode(this.isVideo) + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Screenshot(uri=", UriString.m3554toStringimpl(this.uri), ", fileName=", this.fileName, ", isVideo="), this.isVideo, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(new UriString(this.uri), i);
        parcel.writeString(this.fileName);
        parcel.writeInt(this.isVideo ? 1 : 0);
    }

    public /* synthetic */ Screenshot(String str) {
        this(str, null, false);
    }
}
