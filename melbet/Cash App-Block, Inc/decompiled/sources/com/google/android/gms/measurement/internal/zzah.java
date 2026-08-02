package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zzae;
import com.google.android.gms.maps.zzac;
import com.squareup.cash.directory_ui.views.MooncakeHeaderViewKt;

/* loaded from: classes4.dex */
public final class zzah extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzah> CREATOR = new zzac(23);
    public String zza;
    public String zzb;
    public zzpl zzc;
    public long zzd;
    public boolean zze;
    public String zzf;
    public final zzbh zzg;
    public long zzh;
    public zzbh zzi;
    public final long zzj;
    public final zzbh zzk;

    public zzah(zzah zzahVar) {
        zzae.checkNotNull(zzahVar);
        this.zza = zzahVar.zza;
        this.zzb = zzahVar.zzb;
        this.zzc = zzahVar.zzc;
        this.zzd = zzahVar.zzd;
        this.zze = zzahVar.zze;
        this.zzf = zzahVar.zzf;
        this.zzg = zzahVar.zzg;
        this.zzh = zzahVar.zzh;
        this.zzi = zzahVar.zzi;
        this.zzj = zzahVar.zzj;
        this.zzk = zzahVar.zzk;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int zzb = MooncakeHeaderViewKt.zzb(parcel, 20293);
        MooncakeHeaderViewKt.writeString(parcel, 2, this.zza);
        MooncakeHeaderViewKt.writeString(parcel, 3, this.zzb);
        MooncakeHeaderViewKt.writeParcelable(parcel, 4, this.zzc, i);
        long j = this.zzd;
        MooncakeHeaderViewKt.zza(parcel, 5, 8);
        parcel.writeLong(j);
        boolean z = this.zze;
        MooncakeHeaderViewKt.zza(parcel, 6, 4);
        parcel.writeInt(z ? 1 : 0);
        MooncakeHeaderViewKt.writeString(parcel, 7, this.zzf);
        MooncakeHeaderViewKt.writeParcelable(parcel, 8, this.zzg, i);
        long j2 = this.zzh;
        MooncakeHeaderViewKt.zza(parcel, 9, 8);
        parcel.writeLong(j2);
        MooncakeHeaderViewKt.writeParcelable(parcel, 10, this.zzi, i);
        MooncakeHeaderViewKt.zza(parcel, 11, 8);
        parcel.writeLong(this.zzj);
        MooncakeHeaderViewKt.writeParcelable(parcel, 12, this.zzk, i);
        MooncakeHeaderViewKt.zzc(parcel, zzb);
    }

    public zzah(String str, String str2, zzpl zzplVar, long j, boolean z, String str3, zzbh zzbhVar, long j2, zzbh zzbhVar2, long j3, zzbh zzbhVar3) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = zzplVar;
        this.zzd = j;
        this.zze = z;
        this.zzf = str3;
        this.zzg = zzbhVar;
        this.zzh = j2;
        this.zzi = zzbhVar2;
        this.zzj = j3;
        this.zzk = zzbhVar3;
    }
}
