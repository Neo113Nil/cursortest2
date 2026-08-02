package com.google.android.gms.internal.mlkit_vision_face;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.squareup.cash.directory_ui.views.MooncakeHeaderViewKt;

/* loaded from: classes4.dex */
public final class zzh extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzh> CREATOR = new zze(2);
    public final int zza;
    public final int zzb;
    public final int zzc;
    public final boolean zzd;
    public final boolean zze;
    public final float zzf;

    public zzh(int i, int i2, int i3, boolean z, boolean z2, float f) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = i3;
        this.zzd = z;
        this.zze = z2;
        this.zzf = f;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int zzb = MooncakeHeaderViewKt.zzb(parcel, 20293);
        MooncakeHeaderViewKt.zza(parcel, 2, 4);
        parcel.writeInt(this.zza);
        MooncakeHeaderViewKt.zza(parcel, 3, 4);
        parcel.writeInt(this.zzb);
        MooncakeHeaderViewKt.zza(parcel, 4, 4);
        parcel.writeInt(this.zzc);
        MooncakeHeaderViewKt.zza(parcel, 5, 4);
        parcel.writeInt(this.zzd ? 1 : 0);
        MooncakeHeaderViewKt.zza(parcel, 6, 4);
        parcel.writeInt(this.zze ? 1 : 0);
        MooncakeHeaderViewKt.zza(parcel, 7, 4);
        parcel.writeFloat(this.zzf);
        MooncakeHeaderViewKt.zzc(parcel, zzb);
    }
}
