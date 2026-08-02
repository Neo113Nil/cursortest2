package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zzae;
import com.squareup.cash.directory_ui.views.MooncakeHeaderViewKt;

/* loaded from: classes4.dex */
public final class PaymentMetadata extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PaymentMetadata> CREATOR = new zzb(3);
    public final String zza;

    public PaymentMetadata(String str) {
        zzae.checkNotNull(str, "responseJson cannot be null!");
        this.zza = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int zzb = MooncakeHeaderViewKt.zzb(parcel, 20293);
        MooncakeHeaderViewKt.writeString(parcel, 1, this.zza);
        MooncakeHeaderViewKt.zzc(parcel, zzb);
    }
}
