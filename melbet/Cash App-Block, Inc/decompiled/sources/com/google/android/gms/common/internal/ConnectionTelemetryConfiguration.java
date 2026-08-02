package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.squareup.cash.directory_ui.views.MooncakeHeaderViewKt;

/* loaded from: classes4.dex */
public final class ConnectionTelemetryConfiguration extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ConnectionTelemetryConfiguration> CREATOR = new com.google.android.gms.appset.zzd(24);
    public final RootTelemetryConfiguration zza;
    public final boolean zzb;
    public final boolean zzc;
    public final int[] zzd;
    public final int zze;
    public final int[] zzf;

    public ConnectionTelemetryConfiguration(RootTelemetryConfiguration rootTelemetryConfiguration, boolean z, boolean z2, int[] iArr, int i, int[] iArr2) {
        this.zza = rootTelemetryConfiguration;
        this.zzb = z;
        this.zzc = z2;
        this.zzd = iArr;
        this.zze = i;
        this.zzf = iArr2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int zzb = MooncakeHeaderViewKt.zzb(parcel, 20293);
        MooncakeHeaderViewKt.writeParcelable(parcel, 1, this.zza, i);
        MooncakeHeaderViewKt.zza(parcel, 2, 4);
        parcel.writeInt(this.zzb ? 1 : 0);
        MooncakeHeaderViewKt.zza(parcel, 3, 4);
        parcel.writeInt(this.zzc ? 1 : 0);
        MooncakeHeaderViewKt.writeIntArray(parcel, 4, this.zzd);
        MooncakeHeaderViewKt.zza(parcel, 5, 4);
        parcel.writeInt(this.zze);
        MooncakeHeaderViewKt.writeIntArray(parcel, 6, this.zzf);
        MooncakeHeaderViewKt.zzc(parcel, zzb);
    }
}
