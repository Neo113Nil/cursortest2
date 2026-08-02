package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.squareup.cash.directory_ui.views.MooncakeHeaderViewKt;

/* loaded from: classes4.dex */
public final class zzm extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzm> CREATOR = new zzh(27);
    public String zza;
    public String zzb;
    public String zzc;
    public String zzd;
    public String zze;
    public String zzf;
    public String zzg;
    public String zzh;
    public String zzi;
    public String zzj;
    public String zzk;
    public String zzl;
    public String zzm;
    public String zzn;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int zzb = MooncakeHeaderViewKt.zzb(parcel, 20293);
        MooncakeHeaderViewKt.writeString(parcel, 2, this.zza);
        MooncakeHeaderViewKt.writeString(parcel, 3, this.zzb);
        MooncakeHeaderViewKt.writeString(parcel, 4, this.zzc);
        MooncakeHeaderViewKt.writeString(parcel, 5, this.zzd);
        MooncakeHeaderViewKt.writeString(parcel, 6, this.zze);
        MooncakeHeaderViewKt.writeString(parcel, 7, this.zzf);
        MooncakeHeaderViewKt.writeString(parcel, 8, this.zzg);
        MooncakeHeaderViewKt.writeString(parcel, 9, this.zzh);
        MooncakeHeaderViewKt.writeString(parcel, 10, this.zzi);
        MooncakeHeaderViewKt.writeString(parcel, 11, this.zzj);
        MooncakeHeaderViewKt.writeString(parcel, 12, this.zzk);
        MooncakeHeaderViewKt.writeString(parcel, 13, this.zzl);
        MooncakeHeaderViewKt.writeString(parcel, 14, this.zzm);
        MooncakeHeaderViewKt.writeString(parcel, 15, this.zzn);
        MooncakeHeaderViewKt.zzc(parcel, zzb);
    }
}
