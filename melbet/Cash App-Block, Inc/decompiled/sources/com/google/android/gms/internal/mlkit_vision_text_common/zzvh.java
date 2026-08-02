package com.google.android.gms.internal.mlkit_vision_text_common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.squareup.cash.directory_ui.views.MooncakeHeaderViewKt;

/* loaded from: classes4.dex */
public final class zzvh extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzvh> CREATOR = new zzg(9);
    public final String zza;
    public final String zzb;
    public final String zzc;
    public final boolean zzd;
    public final int zze;
    public final String zzf;
    public final boolean zzg;

    public zzvh(String str, String str2, String str3, boolean z, int i, String str4, boolean z2) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzf = str4;
        this.zze = i;
        this.zzd = z;
        this.zzg = z2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int zzb = MooncakeHeaderViewKt.zzb(parcel, 20293);
        MooncakeHeaderViewKt.writeString(parcel, 1, this.zza);
        MooncakeHeaderViewKt.writeString(parcel, 2, this.zzb);
        MooncakeHeaderViewKt.writeString(parcel, 3, this.zzc);
        MooncakeHeaderViewKt.zza(parcel, 4, 4);
        parcel.writeInt(this.zzd ? 1 : 0);
        MooncakeHeaderViewKt.zza(parcel, 5, 4);
        parcel.writeInt(this.zze);
        MooncakeHeaderViewKt.writeString(parcel, 6, this.zzf);
        MooncakeHeaderViewKt.zza(parcel, 7, 4);
        parcel.writeInt(this.zzg ? 1 : 0);
        MooncakeHeaderViewKt.zzc(parcel, zzb);
    }
}
