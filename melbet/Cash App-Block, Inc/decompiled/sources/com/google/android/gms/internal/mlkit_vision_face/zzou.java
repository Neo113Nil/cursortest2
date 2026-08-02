package com.google.android.gms.internal.mlkit_vision_face;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.squareup.cash.directory_ui.views.MooncakeHeaderViewKt;

/* loaded from: classes4.dex */
public final class zzou extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzou> CREATOR = new zze(5);
    public final int zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final boolean zze;
    public final float zzf;

    public zzou(int i, int i2, int i3, int i4, boolean z, float f) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = i3;
        this.zzd = i4;
        this.zze = z;
        this.zzf = f;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int zzb = MooncakeHeaderViewKt.zzb(parcel, 20293);
        MooncakeHeaderViewKt.zza(parcel, 1, 4);
        parcel.writeInt(this.zza);
        MooncakeHeaderViewKt.zza(parcel, 2, 4);
        parcel.writeInt(this.zzb);
        MooncakeHeaderViewKt.zza(parcel, 3, 4);
        parcel.writeInt(this.zzc);
        MooncakeHeaderViewKt.zza(parcel, 4, 4);
        parcel.writeInt(this.zzd);
        MooncakeHeaderViewKt.zza(parcel, 5, 4);
        parcel.writeInt(this.zze ? 1 : 0);
        MooncakeHeaderViewKt.zza(parcel, 6, 4);
        parcel.writeFloat(this.zzf);
        MooncakeHeaderViewKt.zzc(parcel, zzb);
    }
}
