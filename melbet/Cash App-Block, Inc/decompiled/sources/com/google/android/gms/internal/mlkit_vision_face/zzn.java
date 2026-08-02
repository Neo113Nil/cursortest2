package com.google.android.gms.internal.mlkit_vision_face;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.squareup.cash.directory_ui.views.MooncakeHeaderViewKt;

/* loaded from: classes4.dex */
public final class zzn extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzn> CREATOR = new zze(3);
    public final int zza;
    public final float zzb;
    public final float zzc;
    public final int zzd;

    public zzn(float f, float f2, int i, int i2) {
        this.zza = i;
        this.zzb = f;
        this.zzc = f2;
        this.zzd = i2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int zzb = MooncakeHeaderViewKt.zzb(parcel, 20293);
        MooncakeHeaderViewKt.zza(parcel, 1, 4);
        parcel.writeInt(this.zza);
        MooncakeHeaderViewKt.zza(parcel, 2, 4);
        parcel.writeFloat(this.zzb);
        MooncakeHeaderViewKt.zza(parcel, 3, 4);
        parcel.writeFloat(this.zzc);
        MooncakeHeaderViewKt.zza(parcel, 4, 4);
        parcel.writeInt(this.zzd);
        MooncakeHeaderViewKt.zzc(parcel, zzb);
    }
}
