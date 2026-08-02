package com.google.android.gms.internal.mlkit_vision_face;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.squareup.cash.directory_ui.views.MooncakeHeaderViewKt;

/* loaded from: classes4.dex */
public final class zzf extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzf> CREATOR = new zze(1);
    public final int zza;
    public final int zzb;
    public final float zzc;
    public final float zzd;
    public final float zze;
    public final float zzf;
    public final float zzg;
    public final float zzh;
    public final float zzi;
    public final zzn[] zzj;
    public final float zzk;
    public final float zzl;
    public final float zzm;
    public final zzd[] zzn;
    public final float zzo;

    public zzf(int i, int i2, float f, float f2, float f3, float f4, float f5, float f6, float f7, zzn[] zznVarArr, float f8, float f9, float f10, zzd[] zzdVarArr, float f11) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = f;
        this.zzd = f2;
        this.zze = f3;
        this.zzf = f4;
        this.zzg = f5;
        this.zzh = f6;
        this.zzi = f7;
        this.zzj = zznVarArr;
        this.zzk = f8;
        this.zzl = f9;
        this.zzm = f10;
        this.zzn = zzdVarArr;
        this.zzo = f11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int zzb = MooncakeHeaderViewKt.zzb(parcel, 20293);
        MooncakeHeaderViewKt.zza(parcel, 1, 4);
        parcel.writeInt(this.zza);
        MooncakeHeaderViewKt.zza(parcel, 2, 4);
        parcel.writeInt(this.zzb);
        MooncakeHeaderViewKt.zza(parcel, 3, 4);
        parcel.writeFloat(this.zzc);
        MooncakeHeaderViewKt.zza(parcel, 4, 4);
        parcel.writeFloat(this.zzd);
        MooncakeHeaderViewKt.zza(parcel, 5, 4);
        parcel.writeFloat(this.zze);
        MooncakeHeaderViewKt.zza(parcel, 6, 4);
        parcel.writeFloat(this.zzf);
        MooncakeHeaderViewKt.zza(parcel, 7, 4);
        parcel.writeFloat(this.zzg);
        MooncakeHeaderViewKt.zza(parcel, 8, 4);
        parcel.writeFloat(this.zzh);
        MooncakeHeaderViewKt.writeTypedArray(parcel, 9, this.zzj, i);
        MooncakeHeaderViewKt.zza(parcel, 10, 4);
        parcel.writeFloat(this.zzk);
        MooncakeHeaderViewKt.zza(parcel, 11, 4);
        parcel.writeFloat(this.zzl);
        MooncakeHeaderViewKt.zza(parcel, 12, 4);
        parcel.writeFloat(this.zzm);
        MooncakeHeaderViewKt.writeTypedArray(parcel, 13, this.zzn, i);
        MooncakeHeaderViewKt.zza(parcel, 14, 4);
        parcel.writeFloat(this.zzi);
        MooncakeHeaderViewKt.zza(parcel, 15, 4);
        parcel.writeFloat(this.zzo);
        MooncakeHeaderViewKt.zzc(parcel, zzb);
    }
}
