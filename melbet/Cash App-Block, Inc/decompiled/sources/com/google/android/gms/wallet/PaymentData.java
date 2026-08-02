package com.google.android.gms.wallet;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.identity.intents.model.UserAddress;
import com.squareup.cash.directory_ui.views.MooncakeHeaderViewKt;

/* loaded from: classes4.dex */
public final class PaymentData extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PaymentData> CREATOR = new zzb(1);
    public String zza;
    public CardInfo zzb;
    public UserAddress zzc;
    public PaymentMethodToken zzd;
    public String zze;
    public Bundle zzf;
    public String zzg;
    public Bundle zzh;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int zzb = MooncakeHeaderViewKt.zzb(parcel, 20293);
        MooncakeHeaderViewKt.writeString(parcel, 1, this.zza);
        MooncakeHeaderViewKt.writeParcelable(parcel, 2, this.zzb, i);
        MooncakeHeaderViewKt.writeParcelable(parcel, 3, this.zzc, i);
        MooncakeHeaderViewKt.writeParcelable(parcel, 4, this.zzd, i);
        MooncakeHeaderViewKt.writeString(parcel, 5, this.zze);
        MooncakeHeaderViewKt.writeBundle(parcel, 6, this.zzf);
        MooncakeHeaderViewKt.writeString(parcel, 7, this.zzg);
        MooncakeHeaderViewKt.writeBundle(parcel, 8, this.zzh);
        MooncakeHeaderViewKt.zzc(parcel, zzb);
    }
}
