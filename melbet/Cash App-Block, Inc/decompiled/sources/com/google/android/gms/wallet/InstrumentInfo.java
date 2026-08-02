package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.squareup.cash.directory_ui.views.MooncakeHeaderViewKt;

/* loaded from: classes4.dex */
public final class InstrumentInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator<InstrumentInfo> CREATOR = new zzb(13);
    public String zza;
    public String zzb;
    public int zzc;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int zzb = MooncakeHeaderViewKt.zzb(parcel, 20293);
        MooncakeHeaderViewKt.writeString(parcel, 2, this.zza);
        MooncakeHeaderViewKt.writeString(parcel, 3, this.zzb);
        int i2 = this.zzc;
        if (i2 != 1 && i2 != 2 && i2 != 3) {
            i2 = 0;
        }
        MooncakeHeaderViewKt.zza(parcel, 4, 4);
        parcel.writeInt(i2);
        MooncakeHeaderViewKt.zzc(parcel, zzb);
    }
}
