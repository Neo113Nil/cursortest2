package com.google.android.libraries.places.widget.internal.placedetails.photoviewer;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.google.android.play.core.review.zzb;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes4.dex */
public final class zzp implements Parcelable {
    public static final Parcelable.Creator<zzp> CREATOR = new zzb(9);
    public final ArrayList zza;

    public zzp(ArrayList arrayList) {
        this.zza = arrayList;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zzp) && this.zza.equals(((zzp) obj).zza);
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final String toString() {
        ArrayList arrayList = this.zza;
        StringBuilder sb = new StringBuilder(arrayList.toString().length() + 43);
        sb.append("ParcelablePhotoPageDataList(photoPageData=");
        sb.append(arrayList);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        Iterator m = NavAction$$ExternalSyntheticOutline0.m(this.zza, parcel);
        while (m.hasNext()) {
            ((zzd) m.next()).writeToParcel(parcel, i);
        }
    }
}
