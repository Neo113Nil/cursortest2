package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.wallet.zzab;
import com.squareup.cash.directory_ui.views.MooncakeHeaderViewKt;

/* loaded from: classes4.dex */
public final class LoyaltyPoints extends AbstractSafeParcelable {
    public static final Parcelable.Creator<LoyaltyPoints> CREATOR = new zzab(25);
    public String zza;
    public LoyaltyPointsBalance zzb;
    public TimeInterval zzc;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int zzb = MooncakeHeaderViewKt.zzb(parcel, 20293);
        MooncakeHeaderViewKt.writeString(parcel, 2, this.zza);
        MooncakeHeaderViewKt.writeParcelable(parcel, 3, this.zzb, i);
        MooncakeHeaderViewKt.writeParcelable(parcel, 5, this.zzc, i);
        MooncakeHeaderViewKt.zzc(parcel, zzb);
    }
}
