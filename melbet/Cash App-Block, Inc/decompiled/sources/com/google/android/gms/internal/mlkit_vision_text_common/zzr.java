package com.google.android.gms.internal.mlkit_vision_text_common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.squareup.cash.directory_ui.views.MooncakeHeaderViewKt;

/* loaded from: classes4.dex */
public final class zzr extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzr> CREATOR = new zzg(4);
    public final zzn[] zza;
    public final zzf zzb;
    public final zzf zzc;
    public final String zzd;
    public final float zze;
    public final String zzf;
    public final boolean zzg;

    public zzr(zzn[] zznVarArr, zzf zzfVar, zzf zzfVar2, String str, float f, String str2, boolean z) {
        this.zza = zznVarArr;
        this.zzb = zzfVar;
        this.zzc = zzfVar2;
        this.zzd = str;
        this.zze = f;
        this.zzf = str2;
        this.zzg = z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int zzb = MooncakeHeaderViewKt.zzb(parcel, 20293);
        MooncakeHeaderViewKt.writeTypedArray(parcel, 2, this.zza, i);
        MooncakeHeaderViewKt.writeParcelable(parcel, 3, this.zzb, i);
        MooncakeHeaderViewKt.writeParcelable(parcel, 4, this.zzc, i);
        MooncakeHeaderViewKt.writeString(parcel, 5, this.zzd);
        MooncakeHeaderViewKt.zza(parcel, 6, 4);
        parcel.writeFloat(this.zze);
        MooncakeHeaderViewKt.writeString(parcel, 7, this.zzf);
        MooncakeHeaderViewKt.zza(parcel, 8, 4);
        parcel.writeInt(this.zzg ? 1 : 0);
        MooncakeHeaderViewKt.zzc(parcel, zzb);
    }
}
