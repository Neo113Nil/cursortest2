package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.squareup.cash.directory_ui.views.MooncakeHeaderViewKt;

/* loaded from: classes4.dex */
public final class zzbv extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbv> CREATOR = new zzal(13);
    public final float[] zza;

    public zzbv(float[] fArr) {
        this.zza = fArr;
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
        MooncakeHeaderViewKt.zzc(parcel, zzb);
    }
}
