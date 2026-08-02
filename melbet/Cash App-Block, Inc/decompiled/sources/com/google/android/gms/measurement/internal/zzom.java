package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.maps.zzac;
import com.squareup.cash.directory_ui.views.MooncakeHeaderViewKt;

/* loaded from: classes4.dex */
public final class zzom extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzom> CREATOR = new zzac(28);
    public final long zza;
    public byte[] zzb;
    public final String zzc;
    public final Bundle zzd;
    public final int zze;
    public final long zzf;
    public String zzg;

    public zzom(long j, byte[] bArr, String str, Bundle bundle, int i, long j2, String str2) {
        this.zza = j;
        this.zzb = bArr;
        this.zzc = str;
        this.zzd = bundle;
        this.zze = i;
        this.zzf = j2;
        this.zzg = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int zzb = MooncakeHeaderViewKt.zzb(parcel, 20293);
        MooncakeHeaderViewKt.zza(parcel, 1, 8);
        parcel.writeLong(this.zza);
        MooncakeHeaderViewKt.writeByteArray(parcel, 2, this.zzb);
        MooncakeHeaderViewKt.writeString(parcel, 3, this.zzc);
        MooncakeHeaderViewKt.writeBundle(parcel, 4, this.zzd);
        MooncakeHeaderViewKt.zza(parcel, 5, 4);
        parcel.writeInt(this.zze);
        MooncakeHeaderViewKt.zza(parcel, 6, 8);
        parcel.writeLong(this.zzf);
        MooncakeHeaderViewKt.writeString(parcel, 7, this.zzg);
        MooncakeHeaderViewKt.zzc(parcel, zzb);
    }
}
