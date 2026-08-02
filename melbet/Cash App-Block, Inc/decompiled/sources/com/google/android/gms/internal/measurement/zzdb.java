package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.squareup.cash.directory_ui.views.MooncakeHeaderViewKt;

/* loaded from: classes.dex */
public final class zzdb extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzdb> CREATOR = new com.google.android.gms.common.zza(8);
    public final long zza;
    public final long zzb;
    public final boolean zzc;
    public final Bundle zzd;
    public final String zze;

    public zzdb(long j, long j2, boolean z, Bundle bundle, String str) {
        this.zza = j;
        this.zzb = j2;
        this.zzc = z;
        this.zzd = bundle;
        this.zze = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = MooncakeHeaderViewKt.beginObjectHeader(parcel);
        MooncakeHeaderViewKt.writeLong(parcel, 1, this.zza);
        MooncakeHeaderViewKt.writeLong(parcel, 2, this.zzb);
        MooncakeHeaderViewKt.writeBoolean(parcel, 3, this.zzc);
        MooncakeHeaderViewKt.writeBundle(parcel, 7, this.zzd);
        MooncakeHeaderViewKt.writeString(parcel, 8, this.zze);
        MooncakeHeaderViewKt.finishObjectHeader(parcel, beginObjectHeader);
    }
}
