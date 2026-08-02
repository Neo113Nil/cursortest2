package app.cash.local.viewmodels.toasts;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import app.cash.passcode.screens.EndAppLock;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class ToastData implements Parcelable {
    public static final Parcelable.Creator<ToastData> CREATOR = new EndAppLock.Creator(19);
    public final String body;
    public final String title;

    public ToastData(String str, String str2) {
        str.getClass();
        this.title = str;
        this.body = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ToastData)) {
            return false;
        }
        ToastData toastData = (ToastData) obj;
        return Intrinsics.areEqual(this.title, toastData.title) && Intrinsics.areEqual(this.body, toastData.body);
    }

    public final int hashCode() {
        int hashCode = this.title.hashCode() * 31;
        String str = this.body;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return Boxes$$ExternalSyntheticOutline1.m("ToastData(title=", this.title, ", body=", this.body, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.title);
        parcel.writeString(this.body);
    }
}
