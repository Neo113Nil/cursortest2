package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.squareup.cash.directory_ui.views.MooncakeHeaderViewKt;

/* loaded from: classes4.dex */
public final class zzxv extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzxv> CREATOR = new zzh(21);
    public final double zza;
    public final double zzb;

    public zzxv(double d, double d2) {
        this.zza = d;
        this.zzb = d2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int zzb = MooncakeHeaderViewKt.zzb(parcel, 20293);
        MooncakeHeaderViewKt.zza(parcel, 1, 8);
        parcel.writeDouble(this.zza);
        MooncakeHeaderViewKt.zza(parcel, 2, 8);
        parcel.writeDouble(this.zzb);
        MooncakeHeaderViewKt.zzc(parcel, zzb);
    }
}
