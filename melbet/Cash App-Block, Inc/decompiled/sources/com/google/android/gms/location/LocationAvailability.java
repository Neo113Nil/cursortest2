package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.maps.zzac;
import com.squareup.cash.directory_ui.views.MooncakeHeaderViewKt;
import java.util.Arrays;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;

/* loaded from: classes4.dex */
public final class LocationAvailability extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<LocationAvailability> CREATOR = new zzac(7);
    public final int zzc;
    public final int zzd;
    public final int zze;
    public final long zzf;
    public final zzal[] zzg;

    public LocationAvailability(int i, int i2, int i3, long j, zzal[] zzalVarArr) {
        this.zzc = i < 1000 ? 0 : IptcConstants.IMAGE_RESOURCE_BLOCK_PHOTOSHOP2_INFO;
        this.zzd = i2;
        this.zze = i3;
        this.zzf = j;
        this.zzg = zzalVarArr;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof LocationAvailability) {
            LocationAvailability locationAvailability = (LocationAvailability) obj;
            if (this.zzd == locationAvailability.zzd && this.zze == locationAvailability.zze && this.zzf == locationAvailability.zzf && this.zzc == locationAvailability.zzc && Arrays.equals(this.zzg, locationAvailability.zzg)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.zzc)});
    }

    public final String toString() {
        boolean z = this.zzc < 1000;
        StringBuilder sb = new StringBuilder(String.valueOf(z).length() + 22);
        sb.append("LocationAvailability[");
        sb.append(z);
        sb.append("]");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int zzb = MooncakeHeaderViewKt.zzb(parcel, 20293);
        MooncakeHeaderViewKt.zza(parcel, 1, 4);
        parcel.writeInt(this.zzd);
        MooncakeHeaderViewKt.zza(parcel, 2, 4);
        parcel.writeInt(this.zze);
        MooncakeHeaderViewKt.zza(parcel, 3, 8);
        parcel.writeLong(this.zzf);
        MooncakeHeaderViewKt.zza(parcel, 4, 4);
        int i2 = this.zzc;
        parcel.writeInt(i2);
        MooncakeHeaderViewKt.writeTypedArray(parcel, 5, this.zzg, i);
        int i3 = i2 >= 1000 ? 0 : 1;
        MooncakeHeaderViewKt.zza(parcel, 6, 4);
        parcel.writeInt(i3);
        MooncakeHeaderViewKt.zzc(parcel, zzb);
    }
}
