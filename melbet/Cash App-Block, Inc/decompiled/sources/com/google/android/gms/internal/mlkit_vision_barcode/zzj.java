package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.squareup.cash.directory_ui.views.MooncakeHeaderViewKt;

/* loaded from: classes4.dex */
public final class zzj extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzj> CREATOR = new zzh(11);
    public int zza;
    public int zzb;
    public int zzc;
    public int zzd;
    public int zze;
    public int zzf;
    public boolean zzg;
    public String zzh;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int zzb = MooncakeHeaderViewKt.zzb(parcel, 20293);
        int i2 = this.zza;
        MooncakeHeaderViewKt.zza(parcel, 2, 4);
        parcel.writeInt(i2);
        int i3 = this.zzb;
        MooncakeHeaderViewKt.zza(parcel, 3, 4);
        parcel.writeInt(i3);
        int i4 = this.zzc;
        MooncakeHeaderViewKt.zza(parcel, 4, 4);
        parcel.writeInt(i4);
        int i5 = this.zzd;
        MooncakeHeaderViewKt.zza(parcel, 5, 4);
        parcel.writeInt(i5);
        int i6 = this.zze;
        MooncakeHeaderViewKt.zza(parcel, 6, 4);
        parcel.writeInt(i6);
        int i7 = this.zzf;
        MooncakeHeaderViewKt.zza(parcel, 7, 4);
        parcel.writeInt(i7);
        boolean z = this.zzg;
        MooncakeHeaderViewKt.zza(parcel, 8, 4);
        parcel.writeInt(z ? 1 : 0);
        MooncakeHeaderViewKt.writeString(parcel, 9, this.zzh);
        MooncakeHeaderViewKt.zzc(parcel, zzb);
    }
}
