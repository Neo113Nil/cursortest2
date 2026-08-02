package com.google.android.gms.internal.mlkit_genai_prompt;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.squareup.cash.directory_ui.views.MooncakeHeaderViewKt;

/* loaded from: classes4.dex */
public final class zzu extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzu> CREATOR = new zzn(14);
    public final int zza;
    public final String zzb;
    public final float zzc;
    public final float zzd;

    public zzu(float f, float f2, int i, String str) {
        this.zzb = str;
        this.zzc = f;
        this.zza = i;
        this.zzd = f2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int zzb = MooncakeHeaderViewKt.zzb(parcel, 20293);
        MooncakeHeaderViewKt.writeString(parcel, 1, this.zzb);
        MooncakeHeaderViewKt.zza(parcel, 2, 4);
        parcel.writeFloat(this.zzc);
        MooncakeHeaderViewKt.zza(parcel, 3, 4);
        parcel.writeInt(this.zza);
        MooncakeHeaderViewKt.zza(parcel, 4, 4);
        parcel.writeFloat(this.zzd);
        MooncakeHeaderViewKt.zzc(parcel, zzb);
    }
}
