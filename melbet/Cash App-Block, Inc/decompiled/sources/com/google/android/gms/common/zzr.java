package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.squareup.cash.directory_ui.views.MooncakeHeaderViewKt;

/* loaded from: classes4.dex */
public final class zzr extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzr> CREATOR = new zzs(0);
    public final boolean zza;
    public final String zzb;
    public final int zzc;
    public final int zzd;
    public final long zze;

    public zzr(int i, int i2, long j, String str, boolean z) {
        this.zza = z;
        this.zzb = str;
        this.zzc = zzz.zza(i) - 1;
        this.zzd = zzc.zza(i2) - 1;
        this.zze = j;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int zzb = MooncakeHeaderViewKt.zzb(parcel, 20293);
        MooncakeHeaderViewKt.zza(parcel, 1, 4);
        parcel.writeInt(this.zza ? 1 : 0);
        MooncakeHeaderViewKt.writeString(parcel, 2, this.zzb);
        MooncakeHeaderViewKt.zza(parcel, 3, 4);
        parcel.writeInt(this.zzc);
        MooncakeHeaderViewKt.zza(parcel, 4, 4);
        parcel.writeInt(this.zzd);
        MooncakeHeaderViewKt.zza(parcel, 5, 8);
        parcel.writeLong(this.zze);
        MooncakeHeaderViewKt.zzc(parcel, zzb);
    }
}
