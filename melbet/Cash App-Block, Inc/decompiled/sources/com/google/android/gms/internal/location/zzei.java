package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.location.zzw;
import com.google.android.gms.location.zzx;
import com.google.android.gms.location.zzy;
import com.google.android.gms.location.zzz;
import com.google.android.gms.maps.zzac;
import com.squareup.cash.directory_ui.views.MooncakeHeaderViewKt;

/* loaded from: classes4.dex */
public final class zzei extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzei> CREATOR = new zzac(2);
    public final int zza;
    public final zzeg zzb;
    public final zzz zzc;
    public final zzw zzd;
    public final PendingIntent zze;
    public final zzr zzf;
    public final String zzg;

    public zzei(int i, zzeg zzegVar, IBinder iBinder, IBinder iBinder2, PendingIntent pendingIntent, IBinder iBinder3, String str) {
        zzz zzzVar;
        zzw zzwVar;
        this.zza = i;
        this.zzb = zzegVar;
        zzr zzrVar = null;
        if (iBinder != null) {
            int i2 = zzy.$r8$clinit;
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.ILocationListener");
            zzzVar = queryLocalInterface instanceof zzz ? (zzz) queryLocalInterface : new zzx(iBinder, "com.google.android.gms.location.ILocationListener", 3);
        } else {
            zzzVar = null;
        }
        this.zzc = zzzVar;
        this.zze = pendingIntent;
        if (iBinder2 != null) {
            int i3 = zzdv.$r8$clinit;
            IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.location.ILocationCallback");
            zzwVar = queryLocalInterface2 instanceof zzw ? (zzw) queryLocalInterface2 : new com.google.android.gms.location.zzu(iBinder2, "com.google.android.gms.location.ILocationCallback", 3);
        } else {
            zzwVar = null;
        }
        this.zzd = zzwVar;
        if (iBinder3 != null) {
            IInterface queryLocalInterface3 = iBinder3.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
            zzrVar = queryLocalInterface3 instanceof zzr ? (zzr) queryLocalInterface3 : new zzp(iBinder3, "com.google.android.gms.location.internal.IFusedLocationProviderCallback", 3);
        }
        this.zzf = zzrVar;
        this.zzg = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int zzb = MooncakeHeaderViewKt.zzb(parcel, 20293);
        MooncakeHeaderViewKt.zza(parcel, 1, 4);
        parcel.writeInt(this.zza);
        MooncakeHeaderViewKt.writeParcelable(parcel, 2, this.zzb, i);
        zzz zzzVar = this.zzc;
        MooncakeHeaderViewKt.writeIBinder(parcel, 3, zzzVar == null ? null : zzzVar.asBinder());
        MooncakeHeaderViewKt.writeParcelable(parcel, 4, this.zze, i);
        zzw zzwVar = this.zzd;
        MooncakeHeaderViewKt.writeIBinder(parcel, 5, zzwVar == null ? null : zzwVar.asBinder());
        zzr zzrVar = this.zzf;
        MooncakeHeaderViewKt.writeIBinder(parcel, 6, zzrVar != null ? zzrVar.asBinder() : null);
        MooncakeHeaderViewKt.writeString(parcel, 8, this.zzg);
        MooncakeHeaderViewKt.zzc(parcel, zzb);
    }
}
