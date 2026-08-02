package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.maps.zzac;
import com.squareup.cash.directory_ui.views.MooncakeHeaderViewKt;

/* loaded from: classes4.dex */
public final class zzoh extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzoh> CREATOR = new zzac(27);
    public final String zza;
    public final long zzb;
    public final int zzc;

    public zzoh(String str, long j, int i) {
        this.zza = str;
        this.zzb = j;
        this.zzc = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int zzb = MooncakeHeaderViewKt.zzb(parcel, 20293);
        MooncakeHeaderViewKt.writeString(parcel, 1, this.zza);
        MooncakeHeaderViewKt.zza(parcel, 2, 8);
        parcel.writeLong(this.zzb);
        MooncakeHeaderViewKt.zza(parcel, 3, 4);
        parcel.writeInt(this.zzc);
        MooncakeHeaderViewKt.zzc(parcel, zzb);
    }
}
