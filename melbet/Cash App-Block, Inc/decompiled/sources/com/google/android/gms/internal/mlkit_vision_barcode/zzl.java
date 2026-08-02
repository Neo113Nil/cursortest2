package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.squareup.cash.directory_ui.views.MooncakeHeaderViewKt;

/* loaded from: classes4.dex */
public final class zzl extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzl> CREATOR = new zzh(14);
    public zzp zza;
    public String zzb;
    public String zzc;
    public zzq[] zzd;
    public zzn[] zze;
    public String[] zzf;
    public zzi[] zzg;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int zzb = MooncakeHeaderViewKt.zzb(parcel, 20293);
        MooncakeHeaderViewKt.writeParcelable(parcel, 2, this.zza, i);
        MooncakeHeaderViewKt.writeString(parcel, 3, this.zzb);
        MooncakeHeaderViewKt.writeString(parcel, 4, this.zzc);
        MooncakeHeaderViewKt.writeTypedArray(parcel, 5, this.zzd, i);
        MooncakeHeaderViewKt.writeTypedArray(parcel, 6, this.zze, i);
        MooncakeHeaderViewKt.writeStringArray(parcel, 7, this.zzf);
        MooncakeHeaderViewKt.writeTypedArray(parcel, 8, this.zzg, i);
        MooncakeHeaderViewKt.zzc(parcel, zzb);
    }
}
