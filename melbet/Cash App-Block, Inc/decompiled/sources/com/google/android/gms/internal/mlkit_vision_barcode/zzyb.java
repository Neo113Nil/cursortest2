package com.google.android.gms.internal.mlkit_vision_barcode;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.squareup.cash.directory_ui.views.MooncakeHeaderViewKt;

/* loaded from: classes4.dex */
public final class zzyb extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzyb> CREATOR = new zzh(15);
    public final int zza;
    public final String zzb;
    public final String zzc;
    public final byte[] zzd;
    public final Point[] zze;
    public final int zzf;
    public final zzxu zzg;
    public final zzxx zzh;
    public final zzxy zzi;
    public final zzya zzj;
    public final zzxz zzk;
    public final zzxv zzl;
    public final zzxr zzm;
    public final zzxs zzn;
    public final zzxt zzo;

    public zzyb(int i, String str, String str2, byte[] bArr, Point[] pointArr, int i2, zzxu zzxuVar, zzxx zzxxVar, zzxy zzxyVar, zzya zzyaVar, zzxz zzxzVar, zzxv zzxvVar, zzxr zzxrVar, zzxs zzxsVar, zzxt zzxtVar) {
        this.zza = i;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = bArr;
        this.zze = pointArr;
        this.zzf = i2;
        this.zzg = zzxuVar;
        this.zzh = zzxxVar;
        this.zzi = zzxyVar;
        this.zzj = zzyaVar;
        this.zzk = zzxzVar;
        this.zzl = zzxvVar;
        this.zzm = zzxrVar;
        this.zzn = zzxsVar;
        this.zzo = zzxtVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int zzb = MooncakeHeaderViewKt.zzb(parcel, 20293);
        MooncakeHeaderViewKt.zza(parcel, 1, 4);
        parcel.writeInt(this.zza);
        MooncakeHeaderViewKt.writeString(parcel, 2, this.zzb);
        MooncakeHeaderViewKt.writeString(parcel, 3, this.zzc);
        MooncakeHeaderViewKt.writeByteArray(parcel, 4, this.zzd);
        MooncakeHeaderViewKt.writeTypedArray(parcel, 5, this.zze, i);
        MooncakeHeaderViewKt.zza(parcel, 6, 4);
        parcel.writeInt(this.zzf);
        MooncakeHeaderViewKt.writeParcelable(parcel, 7, this.zzg, i);
        MooncakeHeaderViewKt.writeParcelable(parcel, 8, this.zzh, i);
        MooncakeHeaderViewKt.writeParcelable(parcel, 9, this.zzi, i);
        MooncakeHeaderViewKt.writeParcelable(parcel, 10, this.zzj, i);
        MooncakeHeaderViewKt.writeParcelable(parcel, 11, this.zzk, i);
        MooncakeHeaderViewKt.writeParcelable(parcel, 12, this.zzl, i);
        MooncakeHeaderViewKt.writeParcelable(parcel, 13, this.zzm, i);
        MooncakeHeaderViewKt.writeParcelable(parcel, 14, this.zzn, i);
        MooncakeHeaderViewKt.writeParcelable(parcel, 15, this.zzo, i);
        MooncakeHeaderViewKt.zzc(parcel, zzb);
    }
}
