package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.squareup.cash.directory_ui.views.MooncakeHeaderViewKt;

/* loaded from: classes4.dex */
public final class zzap extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzap> CREATOR = new zzal(7);
    public final zzat zza;
    public final String zzb;
    public final String zzc;
    public final zzau[] zzd;
    public final zzar[] zze;
    public final String[] zzf;
    public final zzam[] zzg;

    public zzap(zzat zzatVar, String str, String str2, zzau[] zzauVarArr, zzar[] zzarVarArr, String[] strArr, zzam[] zzamVarArr) {
        this.zza = zzatVar;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = zzauVarArr;
        this.zze = zzarVarArr;
        this.zzf = strArr;
        this.zzg = zzamVarArr;
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
