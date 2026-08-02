package com.google.android.gms.wallet;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.squareup.cash.directory_ui.views.MooncakeHeaderViewKt;

/* loaded from: classes4.dex */
public final class PaymentMethodTokenizationParameters extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PaymentMethodTokenizationParameters> CREATOR = new zzb(5);
    public int zza;
    public final Bundle zzb;

    public PaymentMethodTokenizationParameters(int i, Bundle bundle) {
        new Bundle();
        this.zza = i;
        this.zzb = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int zzb = MooncakeHeaderViewKt.zzb(parcel, 20293);
        int i2 = this.zza;
        MooncakeHeaderViewKt.zza(parcel, 2, 4);
        parcel.writeInt(i2);
        MooncakeHeaderViewKt.writeBundle(parcel, 3, this.zzb);
        MooncakeHeaderViewKt.zzc(parcel, zzb);
    }

    public PaymentMethodTokenizationParameters() {
        this.zzb = new Bundle();
    }
}
