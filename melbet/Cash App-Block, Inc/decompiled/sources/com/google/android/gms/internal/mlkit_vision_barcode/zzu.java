package com.google.android.gms.internal.mlkit_vision_barcode;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.squareup.cash.directory_ui.views.MooncakeHeaderViewKt;

/* loaded from: classes4.dex */
public final class zzu extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzu> CREATOR = new zzh(10);
    public int zza;
    public String zzb;
    public String zzc;
    public int zzd;
    public Point[] zze;
    public zzn zzf;
    public zzq zzg;
    public zzr zzh;
    public zzt zzi;
    public zzs zzj;
    public zzo zzk;
    public zzk zzl;
    public zzl zzm;
    public zzm zzn;
    public byte[] zzo;
    public boolean zzp;
    public double zzq;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int zzb = MooncakeHeaderViewKt.zzb(parcel, 20293);
        int i2 = this.zza;
        MooncakeHeaderViewKt.zza(parcel, 2, 4);
        parcel.writeInt(i2);
        MooncakeHeaderViewKt.writeString(parcel, 3, this.zzb);
        MooncakeHeaderViewKt.writeString(parcel, 4, this.zzc);
        int i3 = this.zzd;
        MooncakeHeaderViewKt.zza(parcel, 5, 4);
        parcel.writeInt(i3);
        MooncakeHeaderViewKt.writeTypedArray(parcel, 6, this.zze, i);
        MooncakeHeaderViewKt.writeParcelable(parcel, 7, this.zzf, i);
        MooncakeHeaderViewKt.writeParcelable(parcel, 8, this.zzg, i);
        MooncakeHeaderViewKt.writeParcelable(parcel, 9, this.zzh, i);
        MooncakeHeaderViewKt.writeParcelable(parcel, 10, this.zzi, i);
        MooncakeHeaderViewKt.writeParcelable(parcel, 11, this.zzj, i);
        MooncakeHeaderViewKt.writeParcelable(parcel, 12, this.zzk, i);
        MooncakeHeaderViewKt.writeParcelable(parcel, 13, this.zzl, i);
        MooncakeHeaderViewKt.writeParcelable(parcel, 14, this.zzm, i);
        MooncakeHeaderViewKt.writeParcelable(parcel, 15, this.zzn, i);
        MooncakeHeaderViewKt.writeByteArray(parcel, 16, this.zzo);
        boolean z = this.zzp;
        MooncakeHeaderViewKt.zza(parcel, 17, 4);
        parcel.writeInt(z ? 1 : 0);
        double d = this.zzq;
        MooncakeHeaderViewKt.zza(parcel, 18, 8);
        parcel.writeDouble(d);
        MooncakeHeaderViewKt.zzc(parcel, zzb);
    }
}
