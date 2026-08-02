package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.squareup.cash.directory_ui.views.MooncakeHeaderViewKt;

/* loaded from: classes4.dex */
public final class zzee extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzee> CREATOR = new zzef(0);
    public final int zza;
    public final IBinder zzb;
    public final IBinder zzc;
    public final PendingIntent zzd;
    public final String zze;

    public zzee(int i, IBinder iBinder, IBinder iBinder2, PendingIntent pendingIntent, String str) {
        this.zza = i;
        this.zzb = iBinder;
        this.zzc = iBinder2;
        this.zzd = pendingIntent;
        this.zze = str;
    }

    public static zzee zzb(zzdv zzdvVar, zzdv zzdvVar2, String str) {
        if (zzdvVar == null) {
            zzdvVar = null;
        }
        return new zzee(2, zzdvVar, zzdvVar2, null, str);
    }

    public static zzee zzd(zzde zzdeVar) {
        return new zzee(4, null, zzdeVar, null, null);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int zzb = MooncakeHeaderViewKt.zzb(parcel, 20293);
        MooncakeHeaderViewKt.zza(parcel, 1, 4);
        parcel.writeInt(this.zza);
        MooncakeHeaderViewKt.writeIBinder(parcel, 2, this.zzb);
        MooncakeHeaderViewKt.writeIBinder(parcel, 3, this.zzc);
        MooncakeHeaderViewKt.writeParcelable(parcel, 4, this.zzd, i);
        MooncakeHeaderViewKt.writeString(parcel, 6, this.zze);
        MooncakeHeaderViewKt.zzc(parcel, zzb);
    }
}
