package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.identity.intents.model.UserAddress;
import com.squareup.cash.directory_ui.views.MooncakeHeaderViewKt;

/* loaded from: classes4.dex */
public final class CardInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CardInfo> CREATOR = new zzb(10);
    public String zza;
    public String zzb;
    public String zzc;
    public int zzd;
    public UserAddress zze;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int zzb = MooncakeHeaderViewKt.zzb(parcel, 20293);
        MooncakeHeaderViewKt.writeString(parcel, 1, this.zza);
        MooncakeHeaderViewKt.writeString(parcel, 2, this.zzb);
        MooncakeHeaderViewKt.writeString(parcel, 3, this.zzc);
        int i2 = this.zzd;
        MooncakeHeaderViewKt.zza(parcel, 4, 4);
        parcel.writeInt(i2);
        MooncakeHeaderViewKt.writeParcelable(parcel, 5, this.zze, i);
        MooncakeHeaderViewKt.zzc(parcel, zzb);
    }
}
