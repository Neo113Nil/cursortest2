package com.google.android.gms.wallet.button;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.wallet.zzab;
import com.squareup.cash.directory_ui.views.MooncakeHeaderViewKt;

/* loaded from: classes4.dex */
public final class GetInstrumentAvailabilityResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GetInstrumentAvailabilityResponse> CREATOR = new zzab(15);
    public String zza;
    public int zzb;
    public boolean zzc;
    public String zzd;
    public String zze;
    public String zzf;
    public String zzg;
    public String zzh;
    public String zzi;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int zzb = MooncakeHeaderViewKt.zzb(parcel, 20293);
        MooncakeHeaderViewKt.writeString(parcel, 1, this.zza);
        int i2 = this.zzb;
        MooncakeHeaderViewKt.zza(parcel, 2, 4);
        parcel.writeInt(i2);
        boolean z = this.zzc;
        MooncakeHeaderViewKt.zza(parcel, 3, 4);
        parcel.writeInt(z ? 1 : 0);
        MooncakeHeaderViewKt.writeString(parcel, 4, this.zzd);
        MooncakeHeaderViewKt.writeString(parcel, 5, this.zze);
        MooncakeHeaderViewKt.writeString(parcel, 6, this.zzf);
        MooncakeHeaderViewKt.writeString(parcel, 7, this.zzg);
        MooncakeHeaderViewKt.writeString(parcel, 8, this.zzh);
        MooncakeHeaderViewKt.writeString(parcel, 9, this.zzi);
        MooncakeHeaderViewKt.zzc(parcel, zzb);
    }
}
