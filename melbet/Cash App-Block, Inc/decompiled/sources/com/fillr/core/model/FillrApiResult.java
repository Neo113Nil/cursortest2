package com.fillr.core.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.appset.zzd;

/* loaded from: classes4.dex */
public final class FillrApiResult extends ModelBase {
    public static final Parcelable.Creator<FillrApiResult> CREATOR = new zzd(4);
    public String response;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.fillr.core.model.ModelBase
    public final boolean onValidate() {
        return this.response != null;
    }

    public final String toString() {
        return this.response;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.response);
    }
}
