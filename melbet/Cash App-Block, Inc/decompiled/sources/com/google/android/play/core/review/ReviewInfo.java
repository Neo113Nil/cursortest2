package com.google.android.play.core.review;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes4.dex */
public abstract class ReviewInfo implements Parcelable {
    public static final Parcelable.Creator<ReviewInfo> CREATOR = new zzb(0);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        zza zzaVar = (zza) this;
        parcel.writeParcelable(zzaVar.zza, 0);
        parcel.writeInt(zzaVar.zzb ? 1 : 0);
    }
}
