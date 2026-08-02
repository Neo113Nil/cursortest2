package com.google.android.gms.internal.mlkit_vision_text_common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.squareup.cash.directory_ui.views.MooncakeHeaderViewKt;

/* loaded from: classes4.dex */
public final class zzl extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzl> CREATOR = new zzg(1);
    public final zzr[] zza;
    public final zzf zzb;
    public final zzf zzc;
    public final zzf zzd;
    public final String zze;
    public final float zzf;
    public final String zzg;
    public final int zzh;
    public final boolean zzi;
    public final int zzj;
    public final int zzk;

    public zzl(zzr[] zzrVarArr, zzf zzfVar, zzf zzfVar2, zzf zzfVar3, String str, float f, String str2, int i, boolean z, int i2, int i3) {
        this.zza = zzrVarArr;
        this.zzb = zzfVar;
        this.zzc = zzfVar2;
        this.zzd = zzfVar3;
        this.zze = str;
        this.zzf = f;
        this.zzg = str2;
        this.zzh = i;
        this.zzi = z;
        this.zzj = i2;
        this.zzk = i3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int zzb = MooncakeHeaderViewKt.zzb(parcel, 20293);
        MooncakeHeaderViewKt.writeTypedArray(parcel, 2, this.zza, i);
        MooncakeHeaderViewKt.writeParcelable(parcel, 3, this.zzb, i);
        MooncakeHeaderViewKt.writeParcelable(parcel, 4, this.zzc, i);
        MooncakeHeaderViewKt.writeParcelable(parcel, 5, this.zzd, i);
        MooncakeHeaderViewKt.writeString(parcel, 6, this.zze);
        MooncakeHeaderViewKt.zza(parcel, 7, 4);
        parcel.writeFloat(this.zzf);
        MooncakeHeaderViewKt.writeString(parcel, 8, this.zzg);
        MooncakeHeaderViewKt.zza(parcel, 9, 4);
        parcel.writeInt(this.zzh);
        MooncakeHeaderViewKt.zza(parcel, 10, 4);
        parcel.writeInt(this.zzi ? 1 : 0);
        MooncakeHeaderViewKt.zza(parcel, 11, 4);
        parcel.writeInt(this.zzj);
        MooncakeHeaderViewKt.zza(parcel, 12, 4);
        parcel.writeInt(this.zzk);
        MooncakeHeaderViewKt.zzc(parcel, zzb);
    }
}
