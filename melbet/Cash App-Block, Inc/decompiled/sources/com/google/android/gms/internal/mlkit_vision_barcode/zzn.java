package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.squareup.cash.directory_ui.views.MooncakeHeaderViewKt;

/* loaded from: classes4.dex */
public final class zzn extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzn> CREATOR = new zzh(1);
    public int zza;
    public String zzb;
    public String zzc;
    public String zzd;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int zzb = MooncakeHeaderViewKt.zzb(parcel, 20293);
        int i2 = this.zza;
        MooncakeHeaderViewKt.zza(parcel, 2, 4);
        parcel.writeInt(i2);
        MooncakeHeaderViewKt.writeString(parcel, 3, this.zzb);
        MooncakeHeaderViewKt.writeString(parcel, 4, this.zzc);
        MooncakeHeaderViewKt.writeString(parcel, 5, this.zzd);
        MooncakeHeaderViewKt.zzc(parcel, zzb);
    }
}
