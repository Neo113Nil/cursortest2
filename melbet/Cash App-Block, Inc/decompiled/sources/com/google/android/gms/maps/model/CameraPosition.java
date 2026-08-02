package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.work.impl.WorkLauncherImpl;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zzae;
import com.google.android.gms.maps.zzac;
import com.squareup.cash.directory_ui.views.MooncakeHeaderViewKt;
import java.util.Arrays;

/* loaded from: classes4.dex */
public final class CameraPosition extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<CameraPosition> CREATOR = new zzac(15);
    public final float bearing;
    public final LatLng target;
    public final float tilt;
    public final float zoom;

    public CameraPosition(LatLng latLng, float f, float f2, float f3) {
        zzae.checkNotNull(latLng, "camera target must not be null.");
        boolean z = false;
        if (f2 >= RecyclerView.DECELERATION_RATE && f2 <= 90.0f) {
            z = true;
        }
        zzae.checkArgument(z, "Tilt needs to be between 0 and 90 inclusive: %s", Float.valueOf(f2));
        this.target = latLng;
        this.zoom = f;
        this.tilt = f2 + RecyclerView.DECELERATION_RATE;
        this.bearing = (((double) f3) <= 0.0d ? (f3 % 360.0f) + 360.0f : f3) % 360.0f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CameraPosition)) {
            return false;
        }
        CameraPosition cameraPosition = (CameraPosition) obj;
        return this.target.equals(cameraPosition.target) && Float.floatToIntBits(this.zoom) == Float.floatToIntBits(cameraPosition.zoom) && Float.floatToIntBits(this.tilt) == Float.floatToIntBits(cameraPosition.tilt) && Float.floatToIntBits(this.bearing) == Float.floatToIntBits(cameraPosition.bearing);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.target, Float.valueOf(this.zoom), Float.valueOf(this.tilt), Float.valueOf(this.bearing)});
    }

    public final String toString() {
        WorkLauncherImpl workLauncherImpl = new WorkLauncherImpl(this);
        workLauncherImpl.add(this.target, "target");
        workLauncherImpl.add(Float.valueOf(this.zoom), "zoom");
        workLauncherImpl.add(Float.valueOf(this.tilt), "tilt");
        workLauncherImpl.add(Float.valueOf(this.bearing), "bearing");
        return workLauncherImpl.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int zzb = MooncakeHeaderViewKt.zzb(parcel, 20293);
        MooncakeHeaderViewKt.writeParcelable(parcel, 2, this.target, i);
        MooncakeHeaderViewKt.zza(parcel, 3, 4);
        parcel.writeFloat(this.zoom);
        MooncakeHeaderViewKt.zza(parcel, 4, 4);
        parcel.writeFloat(this.tilt);
        MooncakeHeaderViewKt.zza(parcel, 5, 4);
        parcel.writeFloat(this.bearing);
        MooncakeHeaderViewKt.zzc(parcel, zzb);
    }
}
