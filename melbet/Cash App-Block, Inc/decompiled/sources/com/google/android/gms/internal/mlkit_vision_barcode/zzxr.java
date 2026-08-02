package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.squareup.cash.directory_ui.views.MooncakeHeaderViewKt;

/* loaded from: classes4.dex */
public final class zzxr extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzxr> CREATOR = new zzh(17);
    public final String zza;
    public final String zzb;
    public final String zzc;
    public final String zzd;
    public final String zze;
    public final zzxq zzf;
    public final zzxq zzg;

    public zzxr(String str, String str2, String str3, String str4, String str5, zzxq zzxqVar, zzxq zzxqVar2) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = str4;
        this.zze = str5;
        this.zzf = zzxqVar;
        this.zzg = zzxqVar2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int zzb = MooncakeHeaderViewKt.zzb(parcel, 20293);
        MooncakeHeaderViewKt.writeString(parcel, 1, this.zza);
        MooncakeHeaderViewKt.writeString(parcel, 2, this.zzb);
        MooncakeHeaderViewKt.writeString(parcel, 3, this.zzc);
        MooncakeHeaderViewKt.writeString(parcel, 4, this.zzd);
        MooncakeHeaderViewKt.writeString(parcel, 5, this.zze);
        MooncakeHeaderViewKt.writeParcelable(parcel, 6, this.zzf, i);
        MooncakeHeaderViewKt.writeParcelable(parcel, 7, this.zzg, i);
        MooncakeHeaderViewKt.zzc(parcel, zzb);
    }
}
