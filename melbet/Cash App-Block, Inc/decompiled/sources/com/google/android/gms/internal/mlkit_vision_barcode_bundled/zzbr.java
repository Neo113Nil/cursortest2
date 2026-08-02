package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.squareup.cash.directory_ui.views.MooncakeHeaderViewKt;

/* loaded from: classes4.dex */
public final class zzbr extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbr> CREATOR = new zzal(11);
    public final boolean zza;
    public final byte[] zzb;
    public final boolean zzc;
    public final float zzd;
    public final boolean zze;

    public zzbr(boolean z, byte[] bArr, boolean z2, float f, boolean z3) {
        this.zza = z;
        this.zzb = bArr;
        this.zzc = z2;
        this.zzd = f;
        this.zze = z3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int zzb = MooncakeHeaderViewKt.zzb(parcel, 20293);
        MooncakeHeaderViewKt.zza(parcel, 1, 4);
        parcel.writeInt(this.zza ? 1 : 0);
        MooncakeHeaderViewKt.writeByteArray(parcel, 2, this.zzb);
        MooncakeHeaderViewKt.zza(parcel, 3, 4);
        parcel.writeInt(this.zzc ? 1 : 0);
        MooncakeHeaderViewKt.zza(parcel, 4, 4);
        parcel.writeFloat(this.zzd);
        MooncakeHeaderViewKt.zza(parcel, 5, 4);
        parcel.writeInt(this.zze ? 1 : 0);
        MooncakeHeaderViewKt.zzc(parcel, zzb);
    }
}
