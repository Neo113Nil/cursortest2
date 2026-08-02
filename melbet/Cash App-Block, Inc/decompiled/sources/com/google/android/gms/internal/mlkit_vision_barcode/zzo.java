package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.squareup.cash.directory_ui.views.MooncakeHeaderViewKt;

/* loaded from: classes4.dex */
public final class zzo extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzo> CREATOR = new zzh(2);
    public double zza;
    public double zzb;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int zzb = MooncakeHeaderViewKt.zzb(parcel, 20293);
        double d = this.zza;
        MooncakeHeaderViewKt.zza(parcel, 2, 8);
        parcel.writeDouble(d);
        double d2 = this.zzb;
        MooncakeHeaderViewKt.zza(parcel, 3, 8);
        parcel.writeDouble(d2);
        MooncakeHeaderViewKt.zzc(parcel, zzb);
    }
}
