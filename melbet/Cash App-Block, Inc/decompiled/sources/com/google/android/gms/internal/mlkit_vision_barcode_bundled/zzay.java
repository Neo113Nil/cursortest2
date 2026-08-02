package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.squareup.cash.directory_ui.views.MooncakeHeaderViewKt;

/* loaded from: classes4.dex */
public final class zzay extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzay> CREATOR = new zzal(1);
    public final int zza;
    public final String zzb;
    public final String zzc;
    public final byte[] zzd;
    public final Point[] zze;
    public final int zzf;
    public final zzar zzg;
    public final zzau zzh;
    public final zzav zzi;
    public final zzax zzj;
    public final zzaw zzk;
    public final zzas zzl;
    public final zzao zzm;
    public final zzap zzn;
    public final zzaq zzo;

    public zzay(int i, String str, String str2, byte[] bArr, Point[] pointArr, int i2, zzar zzarVar, zzau zzauVar, zzav zzavVar, zzax zzaxVar, zzaw zzawVar, zzas zzasVar, zzao zzaoVar, zzap zzapVar, zzaq zzaqVar) {
        this.zza = i;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = bArr;
        this.zze = pointArr;
        this.zzf = i2;
        this.zzg = zzarVar;
        this.zzh = zzauVar;
        this.zzi = zzavVar;
        this.zzj = zzaxVar;
        this.zzk = zzawVar;
        this.zzl = zzasVar;
        this.zzm = zzaoVar;
        this.zzn = zzapVar;
        this.zzo = zzaqVar;
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
