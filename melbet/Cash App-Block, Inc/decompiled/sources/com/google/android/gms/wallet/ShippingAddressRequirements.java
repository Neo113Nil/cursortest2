package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.squareup.cash.directory_ui.views.MooncakeHeaderViewKt;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class ShippingAddressRequirements extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ShippingAddressRequirements> CREATOR = new zzb(7);
    public ArrayList zza;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int zzb = MooncakeHeaderViewKt.zzb(parcel, 20293);
        MooncakeHeaderViewKt.writeStringList(parcel, 1, this.zza);
        MooncakeHeaderViewKt.zzc(parcel, zzb);
    }
}
