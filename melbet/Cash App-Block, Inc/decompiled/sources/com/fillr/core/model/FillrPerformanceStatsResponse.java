package com.fillr.core.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.appset.zzd;

/* loaded from: classes4.dex */
public final class FillrPerformanceStatsResponse extends ModelBase {
    public static final Parcelable.Creator<FillrPerformanceStatsResponse> CREATOR = new zzd(5);
    public String result;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.fillr.core.model.ModelBase
    public final boolean onValidate() {
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.result);
    }
}
