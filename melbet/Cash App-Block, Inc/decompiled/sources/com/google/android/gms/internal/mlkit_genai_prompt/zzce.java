package com.google.android.gms.internal.mlkit_genai_prompt;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.squareup.cash.directory_ui.views.MooncakeHeaderViewKt;

/* loaded from: classes4.dex */
public final class zzce extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzce> CREATOR = new zzn(11);
    public static final zzce zza = new zzce(false);
    public final boolean zzb;

    public zzce(boolean z) {
        this.zzb = z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int zzb = MooncakeHeaderViewKt.zzb(parcel, 20293);
        MooncakeHeaderViewKt.zza(parcel, 1, 4);
        parcel.writeInt(this.zzb ? 1 : 0);
        MooncakeHeaderViewKt.zzc(parcel, zzb);
    }
}
