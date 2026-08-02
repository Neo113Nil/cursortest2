package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.maps.zzac;
import com.squareup.cash.directory_ui.views.MooncakeHeaderViewKt;

/* loaded from: classes4.dex */
public final class LocationSettingsStates extends AbstractSafeParcelable {
    public static final Parcelable.Creator<LocationSettingsStates> CREATOR = new zzac(12);
    public final boolean zza;
    public final boolean zzb;
    public final boolean zzc;
    public final boolean zzd;
    public final boolean zze;
    public final boolean zzf;

    public LocationSettingsStates(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.zza = z;
        this.zzb = z2;
        this.zzc = z3;
        this.zzd = z4;
        this.zze = z5;
        this.zzf = z6;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int zzb = MooncakeHeaderViewKt.zzb(parcel, 20293);
        MooncakeHeaderViewKt.zza(parcel, 1, 4);
        parcel.writeInt(this.zza ? 1 : 0);
        MooncakeHeaderViewKt.zza(parcel, 2, 4);
        parcel.writeInt(this.zzb ? 1 : 0);
        MooncakeHeaderViewKt.zza(parcel, 3, 4);
        parcel.writeInt(this.zzc ? 1 : 0);
        MooncakeHeaderViewKt.zza(parcel, 4, 4);
        parcel.writeInt(this.zzd ? 1 : 0);
        MooncakeHeaderViewKt.zza(parcel, 5, 4);
        parcel.writeInt(this.zze ? 1 : 0);
        MooncakeHeaderViewKt.zza(parcel, 6, 4);
        parcel.writeInt(this.zzf ? 1 : 0);
        MooncakeHeaderViewKt.zzc(parcel, zzb);
    }
}
