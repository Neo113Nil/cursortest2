package com.google.android.gms.internal.mlkit_genai_prompt;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.squareup.cash.directory_ui.views.MooncakeHeaderViewKt;

/* loaded from: classes4.dex */
public final class zzbt extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbt> CREATOR = new zzn(7);
    public final int zza;
    public final Bundle zzb;
    public final String zzc;
    public final float zzd;
    public final float zze;

    public zzbt(String str, float f, int i, float f2, Bundle bundle) {
        this.zzc = str;
        this.zzd = f;
        this.zza = i;
        this.zze = f2;
        this.zzb = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int zzb = MooncakeHeaderViewKt.zzb(parcel, 20293);
        MooncakeHeaderViewKt.writeString(parcel, 1, this.zzc);
        MooncakeHeaderViewKt.zza(parcel, 2, 4);
        parcel.writeFloat(this.zzd);
        MooncakeHeaderViewKt.zza(parcel, 3, 4);
        parcel.writeInt(this.zza);
        MooncakeHeaderViewKt.zza(parcel, 4, 4);
        parcel.writeFloat(this.zze);
        MooncakeHeaderViewKt.writeBundle(parcel, 5, this.zzb);
        MooncakeHeaderViewKt.zzc(parcel, zzb);
    }
}
