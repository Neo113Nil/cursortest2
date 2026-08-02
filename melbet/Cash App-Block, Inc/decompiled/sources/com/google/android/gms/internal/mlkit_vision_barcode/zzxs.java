package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.squareup.cash.directory_ui.views.MooncakeHeaderViewKt;

/* loaded from: classes4.dex */
public final class zzxs extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzxs> CREATOR = new zzh(18);
    public final zzxw zza;
    public final String zzb;
    public final String zzc;
    public final zzxx[] zzd;
    public final zzxu[] zze;
    public final String[] zzf;
    public final zzxp[] zzg;

    public zzxs(zzxw zzxwVar, String str, String str2, zzxx[] zzxxVarArr, zzxu[] zzxuVarArr, String[] strArr, zzxp[] zzxpVarArr) {
        this.zza = zzxwVar;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = zzxxVarArr;
        this.zze = zzxuVarArr;
        this.zzf = strArr;
        this.zzg = zzxpVarArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int zzb = MooncakeHeaderViewKt.zzb(parcel, 20293);
        MooncakeHeaderViewKt.writeParcelable(parcel, 1, this.zza, i);
        MooncakeHeaderViewKt.writeString(parcel, 2, this.zzb);
        MooncakeHeaderViewKt.writeString(parcel, 3, this.zzc);
        MooncakeHeaderViewKt.writeTypedArray(parcel, 4, this.zzd, i);
        MooncakeHeaderViewKt.writeTypedArray(parcel, 5, this.zze, i);
        MooncakeHeaderViewKt.writeStringArray(parcel, 6, this.zzf);
        MooncakeHeaderViewKt.writeTypedArray(parcel, 7, this.zzg, i);
        MooncakeHeaderViewKt.zzc(parcel, zzb);
    }
}
