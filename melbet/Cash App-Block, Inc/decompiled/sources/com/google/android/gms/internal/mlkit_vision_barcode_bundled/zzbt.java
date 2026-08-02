package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.squareup.cash.directory_ui.views.MooncakeHeaderViewKt;

/* loaded from: classes4.dex */
public final class zzbt extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbt> CREATOR = new zzal(12);
    public final float[] zza;
    public final int zzb;
    public final boolean zzc;

    public zzbt(float[] fArr, int i, boolean z) {
        this.zza = fArr;
        this.zzb = i;
        this.zzc = z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int zzb = MooncakeHeaderViewKt.zzb(parcel, 20293);
        float[] fArr = this.zza;
        if (fArr != null) {
            int zzb2 = MooncakeHeaderViewKt.zzb(parcel, 1);
            parcel.writeFloatArray(fArr);
            MooncakeHeaderViewKt.zzc(parcel, zzb2);
        }
        MooncakeHeaderViewKt.zza(parcel, 2, 4);
        parcel.writeInt(this.zzb);
        MooncakeHeaderViewKt.zza(parcel, 3, 4);
        parcel.writeInt(this.zzc ? 1 : 0);
        MooncakeHeaderViewKt.zzc(parcel, zzb);
    }
}
