package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.squareup.cash.directory_ui.views.MooncakeHeaderViewKt;

/* loaded from: classes4.dex */
public final class zzbc extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbc> CREATOR = new zzal(3);
    public final zzbt zza;
    public final zzbv zzb;
    public final boolean zzd;

    public zzbc(zzbt zzbtVar, zzbv zzbvVar, boolean z) {
        this.zza = zzbtVar;
        this.zzb = zzbvVar;
        this.zzd = z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int zzb = MooncakeHeaderViewKt.zzb(parcel, 20293);
        MooncakeHeaderViewKt.writeParcelable(parcel, 1, this.zza, i);
        MooncakeHeaderViewKt.writeParcelable(parcel, 2, this.zzb, i);
        MooncakeHeaderViewKt.zza(parcel, 3, 4);
        parcel.writeInt(1);
        MooncakeHeaderViewKt.zza(parcel, 4, 4);
        parcel.writeInt(this.zzd ? 1 : 0);
        MooncakeHeaderViewKt.zzc(parcel, zzb);
    }
}
