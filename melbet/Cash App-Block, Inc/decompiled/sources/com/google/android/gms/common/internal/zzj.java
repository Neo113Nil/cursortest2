package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.squareup.cash.directory_ui.views.MooncakeHeaderViewKt;

/* loaded from: classes4.dex */
public final class zzj extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzj> CREATOR = new com.google.android.gms.appset.zzd(23);
    public Bundle zza;
    public Feature[] zzb;
    public int zzc;
    public ConnectionTelemetryConfiguration zzd;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int zzb = MooncakeHeaderViewKt.zzb(parcel, 20293);
        MooncakeHeaderViewKt.writeBundle(parcel, 1, this.zza);
        MooncakeHeaderViewKt.writeTypedArray(parcel, 2, this.zzb, i);
        int i2 = this.zzc;
        MooncakeHeaderViewKt.zza(parcel, 3, 4);
        parcel.writeInt(i2);
        MooncakeHeaderViewKt.writeParcelable(parcel, 4, this.zzd, i);
        MooncakeHeaderViewKt.zzc(parcel, zzb);
    }
}
