package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.work.impl.WorkLauncherImpl;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.maps.zzac;
import com.squareup.cash.directory_ui.views.MooncakeHeaderViewKt;
import java.util.Arrays;

/* loaded from: classes4.dex */
public final class VisibleRegion extends AbstractSafeParcelable {
    public static final Parcelable.Creator<VisibleRegion> CREATOR = new zzac(16);
    public final LatLng farLeft;
    public final LatLng farRight;
    public final LatLngBounds latLngBounds;
    public final LatLng nearLeft;
    public final LatLng nearRight;

    public VisibleRegion(LatLng latLng, LatLng latLng2, LatLng latLng3, LatLng latLng4, LatLngBounds latLngBounds) {
        this.nearLeft = latLng;
        this.nearRight = latLng2;
        this.farLeft = latLng3;
        this.farRight = latLng4;
        this.latLngBounds = latLngBounds;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VisibleRegion)) {
            return false;
        }
        VisibleRegion visibleRegion = (VisibleRegion) obj;
        return this.nearLeft.equals(visibleRegion.nearLeft) && this.nearRight.equals(visibleRegion.nearRight) && this.farLeft.equals(visibleRegion.farLeft) && this.farRight.equals(visibleRegion.farRight) && this.latLngBounds.equals(visibleRegion.latLngBounds);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.nearLeft, this.nearRight, this.farLeft, this.farRight, this.latLngBounds});
    }

    public final String toString() {
        WorkLauncherImpl workLauncherImpl = new WorkLauncherImpl(this);
        workLauncherImpl.add(this.nearLeft, "nearLeft");
        workLauncherImpl.add(this.nearRight, "nearRight");
        workLauncherImpl.add(this.farLeft, "farLeft");
        workLauncherImpl.add(this.farRight, "farRight");
        workLauncherImpl.add(this.latLngBounds, "latLngBounds");
        return workLauncherImpl.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int zzb = MooncakeHeaderViewKt.zzb(parcel, 20293);
        MooncakeHeaderViewKt.writeParcelable(parcel, 2, this.nearLeft, i);
        MooncakeHeaderViewKt.writeParcelable(parcel, 3, this.nearRight, i);
        MooncakeHeaderViewKt.writeParcelable(parcel, 4, this.farLeft, i);
        MooncakeHeaderViewKt.writeParcelable(parcel, 5, this.farRight, i);
        MooncakeHeaderViewKt.writeParcelable(parcel, 6, this.latLngBounds, i);
        MooncakeHeaderViewKt.zzc(parcel, zzb);
    }
}
