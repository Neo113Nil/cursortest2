package com.google.android.gms.wallet;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.squareup.cash.directory_ui.views.MooncakeHeaderViewKt;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class PaymentDataRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PaymentDataRequest> CREATOR = new zzb(2);
    public boolean zza;
    public boolean zzb;
    public CardRequirements zzc;
    public boolean zzd;
    public ShippingAddressRequirements zze;
    public ArrayList zzf;
    public PaymentMethodTokenizationParameters zzg;
    public TransactionInfo zzh;
    public boolean zzi = true;
    public String zzj;
    public byte[] zzk;
    public Bundle zzl;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int zzb = MooncakeHeaderViewKt.zzb(parcel, 20293);
        boolean z = this.zza;
        MooncakeHeaderViewKt.zza(parcel, 1, 4);
        parcel.writeInt(z ? 1 : 0);
        boolean z2 = this.zzb;
        MooncakeHeaderViewKt.zza(parcel, 2, 4);
        parcel.writeInt(z2 ? 1 : 0);
        MooncakeHeaderViewKt.writeParcelable(parcel, 3, this.zzc, i);
        boolean z3 = this.zzd;
        MooncakeHeaderViewKt.zza(parcel, 4, 4);
        parcel.writeInt(z3 ? 1 : 0);
        MooncakeHeaderViewKt.writeParcelable(parcel, 5, this.zze, i);
        MooncakeHeaderViewKt.writeIntegerList(parcel, 6, this.zzf);
        MooncakeHeaderViewKt.writeParcelable(parcel, 7, this.zzg, i);
        MooncakeHeaderViewKt.writeParcelable(parcel, 8, this.zzh, i);
        boolean z4 = this.zzi;
        MooncakeHeaderViewKt.zza(parcel, 9, 4);
        parcel.writeInt(z4 ? 1 : 0);
        MooncakeHeaderViewKt.writeString(parcel, 10, this.zzj);
        MooncakeHeaderViewKt.writeBundle(parcel, 11, this.zzl);
        MooncakeHeaderViewKt.writeByteArray(parcel, 12, this.zzk);
        MooncakeHeaderViewKt.zzc(parcel, zzb);
    }
}
