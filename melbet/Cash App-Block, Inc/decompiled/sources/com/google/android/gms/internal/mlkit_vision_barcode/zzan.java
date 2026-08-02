package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.squareup.cash.directory_ui.views.MooncakeHeaderViewKt;

/* loaded from: classes4.dex */
public final class zzan extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzan> CREATOR = new zzh(9);
    public int zza;
    public final int zzb;
    public final int zzc;
    public final long zzd;
    public final int zze;

    public zzan(int i, int i2, int i3, int i4, long j) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = i3;
        this.zzd = j;
        this.zze = i4;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int zzb = MooncakeHeaderViewKt.zzb(parcel, 20293);
        int i2 = this.zza;
        MooncakeHeaderViewKt.zza(parcel, 2, 4);
        parcel.writeInt(i2);
        MooncakeHeaderViewKt.zza(parcel, 3, 4);
        parcel.writeInt(this.zzb);
        MooncakeHeaderViewKt.zza(parcel, 4, 4);
        parcel.writeInt(this.zzc);
        MooncakeHeaderViewKt.zza(parcel, 5, 8);
        parcel.writeLong(this.zzd);
        MooncakeHeaderViewKt.zza(parcel, 6, 4);
        parcel.writeInt(this.zze);
        MooncakeHeaderViewKt.zzc(parcel, zzb);
    }
}
