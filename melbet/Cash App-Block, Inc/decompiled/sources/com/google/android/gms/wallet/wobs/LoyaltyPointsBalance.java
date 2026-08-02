package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.wallet.zzab;
import com.squareup.cash.directory_ui.views.MooncakeHeaderViewKt;

/* loaded from: classes4.dex */
public final class LoyaltyPointsBalance extends AbstractSafeParcelable {
    public static final Parcelable.Creator<LoyaltyPointsBalance> CREATOR = new zzab(24);
    public int zza;
    public String zzb;
    public double zzc;
    public String zzd;
    public long zze;
    public int zzf;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int zzb = MooncakeHeaderViewKt.zzb(parcel, 20293);
        int i2 = this.zza;
        MooncakeHeaderViewKt.zza(parcel, 2, 4);
        parcel.writeInt(i2);
        MooncakeHeaderViewKt.writeString(parcel, 3, this.zzb);
        double d = this.zzc;
        MooncakeHeaderViewKt.zza(parcel, 4, 8);
        parcel.writeDouble(d);
        MooncakeHeaderViewKt.writeString(parcel, 5, this.zzd);
        long j = this.zze;
        MooncakeHeaderViewKt.zza(parcel, 6, 8);
        parcel.writeLong(j);
        int i3 = this.zzf;
        MooncakeHeaderViewKt.zza(parcel, 7, 4);
        parcel.writeInt(i3);
        MooncakeHeaderViewKt.zzc(parcel, zzb);
    }
}
