package com.google.android.gms.internal.mlkit_genai_prompt;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.squareup.cash.directory_ui.views.MooncakeHeaderViewKt;

/* loaded from: classes4.dex */
public final class zzbp extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbp> CREATOR = new zzn(5);
    public final int zza;
    public final String zzb;
    public final Bitmap zzc;
    public final int zzd;
    public final ParcelFileDescriptor zze;
    public final boolean zzf;
    public final zzbn zzg;

    public zzbp(int i, String str, Bitmap bitmap, int i2, ParcelFileDescriptor parcelFileDescriptor, boolean z, zzbn zzbnVar) {
        this.zza = i;
        this.zzb = str;
        this.zzc = bitmap;
        this.zzd = i2;
        this.zze = parcelFileDescriptor;
        this.zzf = z;
        this.zzg = zzbnVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int zzb = MooncakeHeaderViewKt.zzb(parcel, 20293);
        MooncakeHeaderViewKt.zza(parcel, 1, 4);
        parcel.writeInt(this.zza);
        MooncakeHeaderViewKt.writeString(parcel, 2, this.zzb);
        MooncakeHeaderViewKt.writeParcelable(parcel, 3, this.zzc, i);
        MooncakeHeaderViewKt.zza(parcel, 4, 4);
        parcel.writeInt(this.zzd);
        MooncakeHeaderViewKt.writeParcelable(parcel, 5, this.zze, i);
        MooncakeHeaderViewKt.zza(parcel, 6, 4);
        parcel.writeInt(this.zzf ? 1 : 0);
        MooncakeHeaderViewKt.writeParcelable(parcel, 7, this.zzg, i);
        MooncakeHeaderViewKt.zzc(parcel, zzb);
    }
}
