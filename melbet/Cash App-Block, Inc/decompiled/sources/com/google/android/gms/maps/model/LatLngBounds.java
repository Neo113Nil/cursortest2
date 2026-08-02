package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.work.impl.WorkLauncherImpl;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zzae;
import com.google.android.gms.maps.zzac;
import com.squareup.cash.directory_ui.views.MooncakeHeaderViewKt;
import java.util.Arrays;

/* loaded from: classes4.dex */
public final class LatLngBounds extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<LatLngBounds> CREATOR = new zzac(17);
    public final LatLng northeast;
    public final LatLng southwest;

    public LatLngBounds(LatLng latLng, LatLng latLng2) {
        zzae.checkNotNull(latLng, "southwest must not be null.");
        zzae.checkNotNull(latLng2, "northeast must not be null.");
        double d = latLng2.latitude;
        double d2 = latLng.latitude;
        zzae.checkArgument(d >= d2, "southern latitude exceeds northern latitude (%s > %s)", Double.valueOf(d2), Double.valueOf(d));
        this.southwest = latLng;
        this.northeast = latLng2;
    }

    public final boolean contains(LatLng latLng) {
        zzae.checkNotNull(latLng, "point must not be null.");
        double d = latLng.latitude;
        LatLng latLng2 = this.southwest;
        if (latLng2.latitude > d) {
            return false;
        }
        LatLng latLng3 = this.northeast;
        if (d > latLng3.latitude) {
            return false;
        }
        double d2 = latLng.longitude;
        double d3 = latLng2.longitude;
        double d4 = latLng3.longitude;
        return d3 <= d4 ? d3 <= d2 && d2 <= d4 : d3 <= d2 || d2 <= d4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LatLngBounds)) {
            return false;
        }
        LatLngBounds latLngBounds = (LatLngBounds) obj;
        return this.southwest.equals(latLngBounds.southwest) && this.northeast.equals(latLngBounds.northeast);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.southwest, this.northeast});
    }

    public final String toString() {
        WorkLauncherImpl workLauncherImpl = new WorkLauncherImpl(this);
        workLauncherImpl.add(this.southwest, "southwest");
        workLauncherImpl.add(this.northeast, "northeast");
        return workLauncherImpl.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int zzb = MooncakeHeaderViewKt.zzb(parcel, 20293);
        MooncakeHeaderViewKt.writeParcelable(parcel, 2, this.southwest, i);
        MooncakeHeaderViewKt.writeParcelable(parcel, 3, this.northeast, i);
        MooncakeHeaderViewKt.zzc(parcel, zzb);
    }
}
