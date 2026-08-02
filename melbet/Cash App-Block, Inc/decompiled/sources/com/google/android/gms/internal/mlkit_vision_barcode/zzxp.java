package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.squareup.cash.directory_ui.views.MooncakeHeaderViewKt;

/* loaded from: classes4.dex */
public final class zzxp extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzxp> CREATOR = new zzh(13);
    public final int zza;
    public final String[] zzb;

    public zzxp(String[] strArr, int i) {
        this.zza = i;
        this.zzb = strArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int zzb = MooncakeHeaderViewKt.zzb(parcel, 20293);
        MooncakeHeaderViewKt.zza(parcel, 1, 4);
        parcel.writeInt(this.zza);
        MooncakeHeaderViewKt.writeStringArray(parcel, 2, this.zzb);
        MooncakeHeaderViewKt.zzc(parcel, zzb);
    }
}
